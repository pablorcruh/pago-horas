[![CircleCI](https://circleci.com/gh/pablorcruh/pago-horas.svg?style=svg)](https://circleci.com/gh/pablorcruh/pago-horas)

# PAGO-HORAS

This project present a solution to a determine how much to pay to a person for his billable hours according to a
the day of the week and the hour in the day

The solution is staged in different packages, each package contains the foundantion for the solution.

The package --constants-- contains global values used on the solution.

The package --model-- contains classes to represent the workload in a day and the workinfo on the worker.

The package --start-- constains the main class which uses all the logic to solve the problem.

The package --service-- contains the interfaces which represent the business logic.

The package --impl-- contains the implementation of the logic as the interface contract states.

The solution uses Circle CI as integration server to run the test suite.

Inside the project we have two text files that represent the input of the solution.

The project can be executed from the terminal window using maven commands.

We need to clean the project and download all the dependencies.

```
    mvn clean
    
    mvn install
    
    mvn exec:java -Dexec.mainClass="ec.com.ioet.start.Main" -Dexec.args="input1.txt"
```


