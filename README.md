# FunctionProcessing

This is a master-slave application that computes the numerical integration of a function f(x) in a closed interval [a,b], using the Composite Trapezoidal rule from a Newton-Cotes postulation.

# Instructions

- Executing the master: *java -classpath "THE_CLASSPATH" FunctionProcessing "SHARED_DIRECTORY_FOR_MESSAGES" "DIRECTORY_FOR_LOGS" "INPUT_FILE" "MASTER_IP" "AMOUNT_OF_INITIAL_SLAVES" "LOG_NAME"*
- Executing the slaves: *java -classpath "THE_CLASSPATH" FunctionProcessing "SHARED_DIRECTORY_FOR_MESSAGES"*

# Application Input

The master process reads a file with the function and its parameters. The current version suports six different application patterns and two different types of input files ("variavel" and "fixo"). The directory `\jobs\` contains six files with parameters for the supported patterns. The type of this input files are "variavel" since it's easier to manipulate these files and customize the parameters. Here is a descrition of an "variavel" input file:

```
variavel
[function,interval_begin,interval_end]
[funtion_type,amount_of_equations,v,w,y,z]
```
- [function] is the real equation to be computed. This parameter must to follow the pattern [+ or -];[number];[x]^[number];[+ or -];[number];[x]^[number];[+ or -];[number];[x]^[number] (how many times desired). For instance, the input +;5;x^5;+;x^2;+;x^1 represents the equation $$5x^5+x^2+x^1$$.
