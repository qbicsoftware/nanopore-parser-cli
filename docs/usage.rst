=====
Usage
=====

To use nanopore-parser-cli in a project::

nanopore-parser-cli is intended as a standalone program, which functions through the usage of the commandline.
The commandline provides the compiled jar file with the path to the filetree which is inspected for validation.

To run nanopore-parser-cli use the following command:

java -jar target/nanopore-parser-cli-1.0.0-SNAPSHOT-jar-with-dependencies.jar -p "<FileTreePath>"

-p is the argument into which the path of the investigated filetree should be put.