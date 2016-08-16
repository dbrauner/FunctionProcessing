# FunctionProcessing

This is a master-slave application that computes the numerical integration of a function f(x) in a closed interval [a,b], using the Composite Trapezoidal rule from a Newton-Cotes postulation.

# Instructions

- Executing the master: *java java -classpath "THE_CLASSPATH" FunctionProcessing "SHARED_DIRECTORY_FOR_MESSAGES" "DIRECTORY_FOR_LOGS" "INPUT_FILE" "MASTER_IP" "AMOUNT_OF_INITIAL_SLAVES" "LOG_NAME"*
- Executing the slaves: java -classpath "THE_CLASSPATH" FunctionProcessing "SHARED_DIRECTORY_FOR_MESSAGES"
- Input files: these files contain the parameters to run the application. Four models are located at \jobs\
