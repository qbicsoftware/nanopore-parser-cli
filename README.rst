nanopore-parser-cli

.. image:: https://img.shields.io/travis/qbicsoftware/nanopore-parser-cli.svg
        :target: https://travis-ci.org/qbicsoftware/nanopore-parser-cli

.. image:: https://readthedocs.org/projects/nanopore-parser-cli/badge/?version=latest
        :target: https://nanopore-parser-cli.readthedocs.io/en/latest/?badge=latest
        :alt: Documentation Status

.. image:: https://flat.badgen.net/dependabot/thepracticaldev/dev.to?icon=dependabot
    :alt: Dependabot Enabled


A Client for running nanopore-parser. nanopore-parser-cli is designed to interoperate with current QBiC Server Infrastructure

* Free software: MIT license
* Documentation: https://nanopore-parser-cli.readthedocs.io.

Features
--------

This tool is responsible for validating a given filetree against the Nanopore filestructure at QBiC.
Nanopore-parser-cli runs NanoporeParser from core-utils-lib(https://github.com/qbicsoftware/core-utils-lib),
which converts the given filetree into Json Format and compares it with an established internal Json Schema.

Usage
--------

To use nanopore-parser-cli in a project::

nanopore-parser-cli is intended as a standalone program, which functions through the usage of the commandline.
The commandline provides the compiled jar file with the path to the filetree which is inspected for validation.

To run nanopore-parser-cli use the following command:

java -jar target/nanopore-parser-cli-1.0.0-SNAPSHOT-jar-with-dependencies.jar -p "<FileTreePath>"

-p is the argument into which the path of the investigated filetree should be put.


Credits
-------

This project was created with QUBE_.

.. _QUBE: https://github.com/qbicsoftware/qube
