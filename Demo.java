class Demo

{
	public static void main (String args[])
	{
	System.out.println("Hello World");
	}
}


/**
talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work
$ git help
usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           [--super-prefix=<path>] [--config-env=<name>=<envvar>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone     Clone a repository into a new directory
   init      Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add       Add file contents to the index
   mv        Move or rename a file, a directory, or a symlink
   restore   Restore working tree files
   rm        Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect    Use binary search to find the commit that introduced a bug
   diff      Show changes between commits, commit and working tree, etc
   grep      Print lines matching a pattern
   log       Show commit logs
   show      Show various types of objects
   status    Show the working tree status

grow, mark and tweak your common history
   branch    List, create, or delete branches
   commit    Record changes to the repository
   merge     Join two or more development histories together
   rebase    Reapply commits on top of another base tip
   reset     Reset current HEAD to the specified state
   switch    Switch branches
   tag       Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch     Download objects and refs from another repository
   pull      Fetch from and integrate with another repository or a local branch
   push      Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
See 'git help git' for an overview of the system.

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work
$ git help pull

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work
$ git init
Initialized empty Git repository in D:/Tomove/01-Devops/git-work/.git/

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work (master)
$ git clone https://github.com/ShridharMLT/01-devops-app.git
Cloning into '01-devops-app'...
warning: You appear to have cloned an empty repository.

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work (master)
$ cd 01-devops-app

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main

No commits yet

nothing to commit (create/copy files and use "git add" to track)

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ touch Demo.java

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Demo.java

nothing added to commit but untracked files present (use "git add" to track)

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git add Demo.java

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   Demo.java


talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git commit -m 'first commit'
[main (root-commit) b123944] first commit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 Demo.java

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git push
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 188 bytes | 62.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/ShridharMLT/01-devops-app.git
 * [new branch]      main -> main

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Demo.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Demo.class

no changes added to commit (use "git add" and/or "git commit -a")

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git add .

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Demo.class
        modified:   Demo.java


talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Demo.class
        modified:   Demo.java


talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git restore --staged Demo.java

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Demo.class

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   Demo.java


talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git add .

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Demo.class
        modified:   Demo.java


talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git commit -m 'file modified'
[main a4d8a39] file modified
 2 files changed, 8 insertions(+)
 create mode 100644 Demo.class

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$ git push
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 639 bytes | 639.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/ShridharMLT/01-devops-app.git
   b123944..a4d8a39  main -> main

talagadadeevi_sridha@TalagadeeviSridhar MINGW64 /d/Tomove/01-Devops/git-work/01-devops-app (main)
$




**/