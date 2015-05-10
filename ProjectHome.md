### PL/SQL Editor module for NetBeans IDE [(Version History)](Version_History.md) ###
This project will add support for editing [Oracle](http://www.oracle.com) [PL/SQL](http://en.wikipedia.org/wiki/PL/SQL) objects right inside the [NetBeans IDE](http://www.netbeans.org), including syntax highlighting, code folding and indentation.


---

### About PL/SQL Editor ###
The aim of PL/SQL Editor is to provide a convenient way to work with the following Oracle objects inside NetBeans IDE:
  * `Functions`
  * `Procedures`
  * `Packages Specification`
  * `Packages Body`
  * `Types Specification`
  * `Types Body`
  * `Triggers`
With each object you could perform the following operations:
  * **Add** - create a new object
  * **Edit** - edit the object source code
  * **Compile** - compile the server-side object
  * **Compile Local File** - compile the object from the local file
  * **Delete** - drop the object
It’s also possible **Refresh** (reload) nodes and discovers **Properties**. The unique feature of PL/SQL Editor is the **PL/SQL language syntax recognition**. This means that PL/SQL code will be parsed during code typing or loading and syntactically checked. This gives possibility to correct code before compiling. The PL/SQL Editor also supports code folding, code navigation and other features.

To start working with PL/SQL Editor you should click on Window -> Oracle menu item.

![http://pl-sql-editor.googlecode.com/files/screenshot2_0.png](http://pl-sql-editor.googlecode.com/files/screenshot2_0.png)

### Requirements ###
| **PL/SQL Editor bundle version** | **NetBeans version** | **Oracle DB** | **JDK** |
|:---------------------------------|:---------------------|:--------------|:--------|
| [2.2](http://code.google.com/p/pl-sql-editor/downloads/detail?name=pl_sql-editor-bundle_2.2.zip) | 7.0 | 9i Release 2 or newer | Compiled with JDK 6 (jdk1.6.0\_20) |
| [2.1](http://code.google.com/p/pl-sql-editor/downloads/detail?name=pl_sql-editor-bundle_2.1.zip) | 6.9 | 9i Release 2 or newer | Compiled with JDK 6 (jdk1.6.0\_20) |
| [2.0](http://code.google.com/p/pl-sql-editor/downloads/detail?name=pl_sql-editor-bundle_2.0.zip) | 6.8 | 9i Release 2 or newer | Compiled with JDK 5 (jdk1.5.0\_18) |
| [1.2](http://code.google.com/p/pl-sql-editor/downloads/detail?name=pl_sql-editor-bundle_1.2.zip) | 6.1 or newer | 9i Release 2 or newer | Compiled with JDK 5 (jdk1.5.0\_18) |

  * PL/SQL language recognition is based on Oracle 11g PL/SQL syntax.
### Installation ###
Download the appropriate PL/SQL Editor bundle version and unpack it.
  * Choose Tools -> Plugins from the main menu. The Plugins window opens.
  * Switch to Downloaded tab and click on Add Plugins... button.
  * Select all `nbm` files you have extracted from the downloaded bundle.
  * Press Install button. Follow the installation wizard to install modules.
### Documentation ###
The documentation is integrated into the PL/SQL Editor module. To read it click on Help -> Help Contents menu item and then select PL/SQL Editor from Contents.
### Feedback ###
I would appreciate any comments and suggestions. Please leave your feedback on [this page](Feedbacks.md).