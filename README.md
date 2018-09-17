# cs100-F2018-inclass-starter

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the starter for the in-class programming that you will do
in Computer Science 100. Since the Travis builds for this repository will
initially fail (as evidenced by a red &#x2717; appearing in the commit logs
instead of a green &#x2714;), the programmer is responsible for completing all
of the steps needed to satisfy the requirements for the in-class programming
project, thus causing a &#x2714; to instead appear in the commit logs. All of
the work that you do for your in-class assignments will count towards your
class participation grade. You must complete each of these assignments no later
than 9:00 a.m. on the day following the class in which the instructor
introduced the project.

## Commands

To get started in using the GatorGrader tool, you can change into the directory
for this assignment and type the command `gradle grade` in your terminal.
Running this command will produce a lot of output that you should carefully
inspect. If the output indicates that GatorGrader judges that there are no
mistakes in the assignment, then this means that your source code and writing
are passing all of the automated baseline checks. However, if the output
indicates that there are mistakes, then you will need to understand what they
are and then try to fix them.

You can also complete several important Java programming tasks by using the
`gradle` tool. For instance, you can compile (i.e., create bytecode from the
program's source code if it is a correct program) the program using the command
`gradle build`. There are other additional commands that you can type:

- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle tasks --all`: display details about the Gradle system

To run one of these commands, you must be in the main (or "home base") directory
for this assignment where the `build.gradle` file is located. Then, you can type
the command in the terminal and study the output.

Here are the commands that are related to each of the in-class programming projects:

- `gradle runExploreDataTypes` to run the `inclass.ExploreDataTypes` program
- `gradle -q --console plain runComputeGasMileage` to run the `inclass.ComputeGasMileage` program
- `gradle -q -console plain runLogisticMap --args='0'`

## Output

Typing the command `gradle run` in the terminal window will produce output for
your various in-class programming assignments. Please ask the course instructor
for assistance about how to run the different programs.

## Checks

In addition to meeting all of the requirements outlined in class, your
submission must pass the following checks:

- inclass/ExploreDataTypes.java:
  - Features at least two single-line comments
  - Features at least two multiple-line comments
  - Contains exactly four uses of a `println(` statement
  - Contains exactly one use of a `new Date(` statement
  - Contains at least 33 non-blank lines of source code

- inclass/ComputeGasMileage.java:
  - Features at least four single-line comments
  - Features at least two multiple-line comments
  - Contains exactly two uses of a `print(` statement
  - Contains exactly one use of a `println(` statement
  - Contains at least 35 non-blank lines of source code

- inclass/DisplayLogisticMap.java:
  - Contains at least 95 non-blank lines of source code

## Updates

If the course instructor updates the provided material for this assignment and
you would like to receive these updates, then you can type this command in the
main directory for this assignment:

```
git remote add download git@github.com:Allegheny-Computer-Science-100-F2018/cs100-F2018-inclass-starter.git
```

You should only need to type this command once; typing the command additional
times may yield an error message but will not negatively influence the state of
your repository. Now, you are ready to download the updates provided by the
course instructor by typing:

```
git pull download master
```

This second command can be run whenever the course instructor needs to provide
you with new source code for this assignment. However, please note that, if you
have edited the files that the course instructor updated, running the previous
command may lead to Git merge conflicts. If this happens, you may need to
manually resolve them with the help of the instructor or a teaching assistant.

## Travis

This assignment uses [Travis CI](https://travis-ci.com/) to automatically run
the checking programs every time you commit to your GitHub repository. The
checking will start as soon as you have accepted the assignment, thus creating
your own private repository, and the course instructor and/or GitHub enables
Travis for it. If you are using Travis for the first time, you will need to
authorize Travis CI to access the private repositories that you created on
GitHub. If you do not see either a yellow circle or a green checkmark or a red x
in your listing of commits, then please ask the instructor to see whether or not
Travis CI was correctly enabled.

## Requirements

The GatorGrader software that supports the checking of this assignment was
developed for the following software and versions:

- Gradle 4.6
- Java 1.8.0
- MDL 0.4.0
- Proselint 0.8.0
- Python 3.6

## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 100 In-Class
Starter](https://github.com/Allegheny-Computer-Science-100-F2018/cs100-F2018-inclass-starter)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
you assignment, then you can follow the aforementioned steps to create an issue
in its repository. To ensure that your issue is properly resolved, please
provide as many details as is possible about the problem that you experienced.
Students who find &mdash; and use the appropriate GitHub issue tracker to
correctly document &mdash; a mistake in any aspect of these in-class
assignments will receive free GitHub stickers and extra credit towards their
grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack workspace for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
