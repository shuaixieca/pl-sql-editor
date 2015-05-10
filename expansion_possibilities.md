# Project expansion possibilities #

---

The PL/SQL Editor is only the first part of my idea. I would like to create complete
IDE and Plug-In for Oracle development integration based on NetBeans Platform. The
working title of my project is PL/SQL Suite.
After finishing PL/SQL Editor the next step will be developing “SQL and PL/SQL
execute facility” – making possible to execute SQL scripts (query scripts and
batch scripts), call any PL/SQL code from the database. This step also includes
developing special JTable Class suitable to get and show results from Oracle JDBC
ResultSet. After this will be more challengeable step – developing PL/SQL Debugger
module. Because Oracle support Java Platform Debugger Architecture (JPDA) this will
be a great opportunity to create a single-stack debugging module for multi-language
applications based on the JDI. This feature is very essential for project success.
Currently only Oracle’s JDeveloper has it, but it’s only single-stack debugging
of Java and PL/SQL code and NetBeans has advantage to populate such debugger to other
languages. The great help on this step will be Dbdb Project
(http://db-db.sourceforge.net/). All these modules will be a main part of PL/SQL
Suite kernel. The rest will be easier to implement. Such thing are expanding Services
Window (Oracle Node) to non PL/SQL object types, adding Profile feature for PL/SQL
code, developing additional commonly used features, for example data migration, DBA
module, ER diagram, etc. For orientation I will use PL/SQL Developer from
Allround Automations, TOAD and SQL Navigator from Quest Software, Oracle’s SQL
Developer and few others. I think the problem with most of these tools is the age.
They were designed about 8-10 years ago and the GUI is simply become out of date.
Also they are mostly oriented on the old requirements in software development. Now
it’s the time of Multilanguage IDE and NetBeans is a great Platform for my project.