package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import org.netbeans.modules.languages.pl_sql.editor.explorer.nodes.DBNode;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;

public final class DBNode extends AbstractNode {

    private String DBname;

    /*public MyNode(MyNode obj) {
    super(Children.create(new DBNodeFactory(), true), Lookups.singleton(obj));
    DBname = "name";
    }*/
    public DBNode(String DBname) {
        super(Children.create(new DBNodeFactory(), true));
        this.DBname = DBname;
        setDisplayName(DBname);
    }

    public String toString() {
        return DBname;
    }

    @Override
    public Action[] getActions(boolean popup) {
        //return super.getActions(popup);
        //DBNode obj = getLookup().lookup(DBNode.class);
        ArrayList<Action> act = new ArrayList<Action>();
        Object cls = getLookup().lookup(Object.class);
        //JOptionPane.showMessageDialog(null, "Object is " + cls.getClass().getName());
        if (cls instanceof DBNode) {
            //return new Action[]{new AddConnectionAction()};
            act.add(new DeleteConnectionAction());
            for (Action a : super.getActions(popup)) {
                act.add(a);
            }
        } else {
            return super.getActions(popup);
        }
        return (Action[]) act.toArray(new Action[act.size()]);
    }

    private class DeleteConnectionAction extends AbstractAction {

        public DeleteConnectionAction() {
            putValue(NAME, "Delete Connection");
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        }

        public void actionPerformed(ActionEvent e) {
            DBNode obj = getLookup().lookup(DBNode.class);
            //JOptionPane.showConfirmDialog(parentComponent, e, NAME, optionType)showConfirmDialog(null, "Enter DB Name:", "");
            int ret = JOptionPane.showConfirmDialog(null,
                    "Are you sure to delete connection '" + obj.toString() + "'?", "Delete Confirmation",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if ((ret == JOptionPane.YES_OPTION) && (obj != null)) {
                Preferences pref = NbPreferences.forModule(DBNode.class).node("DBNode");
                Preferences pref2 = pref.node(obj.toString());
                try {
                    pref2.removeNode();
                } catch (BackingStoreException ex) {
                    Exceptions.printStackTrace(ex);
                }
            //Refresh
            ((DBRootNode)getParentNode()).GetChilds().stateChanged(new ChangeEvent(this));
            }
        }
    }

    public static void GetNodes(List<DBNode> result) {
        Preferences pref = NbPreferences.forModule(DBNode.class).node("DBNode");
        if (pref != null) {
            try {
                for (String c : pref.childrenNames()) {
                    DBNode db = new DBNode(c);
                    //db.DBname = c;
                    result.add(db);
                }
            } catch (BackingStoreException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    static final class DBNodeFactory extends ChildFactory<String> {

        @Override
        public Node[] createNodesForKey(String key) {
            AbstractNode nd = new AbstractNode(Children.LEAF);
            nd.setDisplayName(key);
            return new Node[]{nd};
        }

        @Override
        protected boolean createKeys(List<String> result) {
            result.add("A");
            result.add("D");
            result.add("B");
            result.add("C");
            return true;
        }
    }
}