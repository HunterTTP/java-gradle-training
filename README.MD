# Java Training

### Notes
* Statement - a complete command to be executed. It can include one or more expressions.
* Expression - a part of a statement that evaluates to a single value (eg 1+2)
* Types - a kind of value that is stored in a variable (int, float, string, etc). This changes how memory is allocated to the variable.
* Class - a blueprint for creating objects and defining their behavior
* Wrapper class - commonly used by data types (int, float, string, etc) which allows them to be an object and use optional functions
* Overflow - when too large or too small of a value is entered into a variable (also called wraparound)
* Casting - converting (or treating) one type of variable like another
* Operators - symbols that perform specific operations (+, *, ^, etc) (= is the assignment operator)
* Operands - items being acted upon by an operator (e.g. 12 + 15, 12 and 15 are the operands)
* Naming conventions:
    * Project Name - FirstJavaProject
    * Class - NewClass
    * Method - getData
    * Variable - firstVariable
* Method - a collection of statements that perform a function
* Main Methods - serves as an entry/starting point for the app
* Code blocks - grouping of statements and/or methods
* Parameter - a definition as shown in the method declaration
* Argument - the actual value that's passed to the method when we call it (often interchangeably used with parameter)
* Procedure - often used to refer to a method that has a void return type
* Method Overloading - two or more methods with the same name but different arguments

For Loop
* Often used when the number of iterations is known in advance. It has three parts: initialization, condition, and iteration.
```
for (int number = 0; number <= 10; number++) {
System.out.println(number);
}
```

For-Each Loop
* Also known as the enhanced for loop, it is used to traverse array or collection elements. It is more readable and eliminates the possibility of bugs related to the condition for loop termination.
```
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
System.out.println(number);
}
```

While Loop
* A while loop repeatedly executes a block of code as long as a specified condition is true. If the condition is false at the start, the loop body won't be executed at all.
```
int number = 0;
while (number <= 10) {
System.out.println(number);
number++;
}
```

Do-While Loop
* A do-while loop is similar to a while loop, but the condition is checked after the loop body is executed. This means the loop body will always run at least once, even if the condition is false at the start.
```
int number = 0;
do {
System.out.println(number);
number++;
} while (number <= 10);
``` 