/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.languages.pl_sql.editor.explorer.nodes;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.Node;
import org.openide.util.NbPreferences;

/**
 *
 * @author SUMsoft
 */
public class DBRootNode extends AbstractNode {

    private MyChildFactory childs;

    public MyChildFactory GetChilds() {
        return childs;
    }


    /*
    public DBRootNode(DBNode obj) {
    super(Children.create(new MyChildFactory(new DBNode()), true), Lookups.singleton(obj));
    setDisplayName(obj.toString());
    }
    
    
    public DBRootNode() {
    super(Children.create(new MyChildFactory(new DBNode()), true));
    setDisplayName("DB");
    }*/
    public DBRootNode(ChildFactory<DBNode> cf) {
        super(Children.create(cf, true));
        setDisplayName("DB");
    }

    public static DBRootNode GetDBRootNode() {
        MyChildFactory mcf = new MyChildFactory();
        DBRootNode root = new DBRootNode(mcf);
        root.childs = mcf;
        return root;
    }

    @Override
    public Action[] getActions(boolean popup) {
        //return super.getActions(popup);
        //DBNode obj = getLookup().lookup(DBNode.class);
        ArrayList<Action> act = new ArrayList<Action>();
        Object cls = getLookup().lookup(Object.class);
        //JOptionPane.showMessageDialog(null, "Object is " + cls.getClass().getName());
        if (cls instanceof DBRootNode) {
            //return new Action[]{new AddConnectionAction()};
            act.add(new AddConnectionAction());
            act.add(new RefreshAction());
            for (Action a : super.getActions(popup)) {
                act.add(a);
            }
        } else {
            return super.getActions(popup);
        }
        return (Action[]) act.toArray(new Action[act.size()]);
    }

    private class AddConnectionAction extends AbstractAction {

        public AddConnectionAction() {
            putValue(NAME, "Add Connection");
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_INSERT, 0));
        }

        public void actionPerformed(ActionEvent e) {
            //DBRootNode obj = getLookup().lookup(DBRootNode.class);
            String showInputDialog = JOptionPane.showInputDialog(null, "Enter DB Name:", "");
            if (showInputDialog != null) {
                Preferences pref = NbPreferences.forModule(DBNode.class).node("DBNode");
                Preferences pref2 = pref.node(showInputDialog);
                pref2.put("NAME", showInputDialog);
                //Refresh
                childs.stateChanged(new ChangeEvent(this));
            }
        }
    }

    private class RefreshAction extends AbstractAction {

        public RefreshAction() {
            putValue(NAME, "Refresh");
        }

        public void actionPerformed(ActionEvent e) {
            childs.stateChanged(new ChangeEvent(this));
        }
    }

    static final class MyChildFactory extends ChildFactory<DBNode>
            implements ChangeListener {

        //private final DBNode parentInfo;
    /*
        public MyChildFactory(DBNode parentInfo) {
        this.parentInfo = parentInfo;
        parentInfo.addChangeListener(
        WeakListeners.create(ChangeListener.class, this, parentInfo));
        
        stateChanged(new ChangeEvent(parentInfo));
        }*/
        @Override
        public Node[] createNodesForKey(DBNode key) {
            //AbstractNode nd = new AbstractNode(Children.LEAF);
            DBNode nd = new DBNode(key.toString());
            //nd.setDisplayName(key.toString());
            return new Node[]{nd};
        }

        @Override
        protected boolean createKeys(List<DBNode> result) {
            DBNode.GetNodes(result);
            //result.add(new DBNode());
            return true;
        }

        public void stateChanged(ChangeEvent e) {
            refresh(false);
        }
    }
}
