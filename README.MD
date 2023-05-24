# Java Training Notes

**Statement**: A complete command to be executed. It can include one or more expressions.
```
int number = 5;  // This is a statement
```

**Expression**: A part of a statement that evaluates to a single value (e.g., 1+2).
```
number = number + 2;  // "number + 2" is an expression
```

**Type**: A kind of value that is stored in a variable (int, float, string, etc). This changes how memory is allocated 
to the variable.
```
int integerType = 10; 
float floatType = 10.5f; 
String stringType = "Java";
```

**Class**: A blueprint for creating objects and defining their behavior.
```
public class MyClass { 
  // class body
}
```

**Object**: An instance of a particular class with a given set of attributes. Also referred to as an instance. 
You create an object by "instantiating" a class.
```
MyClass myObject = new MyClass();  // myObject is an instance (object) of MyClass
```

**Wrapper class**: Provides a way for primitive data types (int, float, etc) to be used as objects.
```
Integer myInt = Integer.valueOf(10); 
Float myFloat = Float.valueOf(10.5f); 
```

**Overflow**: When too large or too small of a value is entered into a variable (also called wraparound).
```
int maxInt = Integer.MAX_VALUE;
System.out.println(maxInt + 1);  // This will overflow
```

**Casting**: Converting (or treating) one type of variable like another.
```
int i = 9;
double d = (double)i;  // Here we cast the int to a double
```

**Operator**: Symbols that perform specific operations (+, *, ^, etc) (= is the assignment operator).
```
int sum = 5 + 10;  // '+' is an operator
```

**Operand**: Items being acted upon by an operator (e.g. 12 + 15, 12 and 15 are the operands).
```
int sum = 12 + 15;  // Here, 12 and 15 are operands
```

**Method**: A collection of statements that perform a function.
```
public void myMethod() {
  // method body
}
```

**Main Method**: Serves as an entry/starting point for the app.
```
public static void main(String[] args) {
  // main method body
}
```

**Code block**: Grouping of statements and/or methods.
```
public void myMethod() {
  // This is a code block
}
```

**Parameter**: a definition as shown in the method declaration
```
void myMethod(int myParameter) {   // myParameter is a parameter
  System.out.println(myParameter);
}
```

**Argument**: the actual value that's passed to the method when we call it (often interchangeably used with parameter)
```
int myArgument = 5;   // myArgument is an argument
myMethod(myArgument);
```

**Procedure**: often used to refer to a method that has a void return type
```
void myProcedure() {
  System.out.println("This is a procedure. It does not return any value.");
}
```

**Method Overloading**: two or more methods with the same name but different arguments
```
void printNumber(int number) {
  System.out.println("Printing an int: " + number);
}

void printNumber(double number) {
  System.out.println("Printing a double: " + number);
}
```

**For Loop**: Often used when the number of iterations is known in advance. It has three parts: initialization,
condition, and iteration.
```
for (int number = 0; number <= 10; number++) {
  System.out.println(number);
}
```

**For-Each Loop**: Also known as the enhanced for loop, it is used to traverse array or collection elements.
It is more readable and eliminates the possibility of bugs related to the condition for loop termination.
```
int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
  System.out.println(number);
}
```

**While Loop**:
A while loop repeatedly executes a block of code as long as a specified condition is true. If the condition is false
at the start, the loop body won't be executed at all.
```
int number = 0;

while (number <= 10) {
  System.out.println(number);
  number++;
}
```

**Do-While Loop**:
A do-while loop is similar to a while loop, but the condition is checked after the loop body is executed. This means
the loop body will always run at least once, even if the condition is false at the start.
```
int number = 0;

do {
  System.out.println(number);
  number++;
} while (number <= 10);
```

**Switch Statement**: A control flow statement in Java that allows a variable to be tested for equality against a list
of values (called cases). It executes the block of code corresponding to the first matching case.
```
int number = 2;
String result;

switch (number) {
  case 1:
    result = "One";
    break;
  case 2:
    result = "Two";
    break;
  default:
    result = "Other";
}

System.out.println(result);
```

**Enhanced Switch** (Java 14 onwards): This switch allows for more concise syntax and can be used as an expression,
allowing for direct assignment of the result to a variable.
```
int number = 2;

String result = switch (number) {
  case 1 -> "One";
  case 2 -> "Two";
  default -> "Other";
};

System.out.println(result);
```

**Scope**: The scope of a variable, function, class, etc., is the part of the code where it can be accessed or used.
The scope of a variable is determined by the context in which it is declared. It is generally bound by its enclosing brackets {}.

* **In Scope**: When we say a variable (or function, class, etc.) is "in scope", it means that it is accessible and can be
  used in the current part of the code. For instance, a variable declared inside a function is in scope within that
  function, but not outside of it.
* **Out of Scope**: Conversely, when a variable (or function, class, etc.) is "out of scope", it means it is not accessible
  or usable in the current part of the code. An attempt to use such a variable would result in a compile-time error.
```
public class Main {
int x = 10;  // This variable is in scope for the whole class

    public void myMethod() {
        int y = 5;  // This variable is in scope only within myMethod
        System.out.println(x);  // This is fine, x is in scope
        System.out.println(y);  // This is also fine, y is in scope
    }

    public void anotherMethod() {
        System.out.println(x);  // This is fine, x is in scope
        // System.out.println(y);  // Compile error! y is out of scope in this method
    }
}
```

**Static Field**:
* Requires 'static' keyword when declared on the class
* Value of this field stays with the class in memory and doesn't change
```
public class MyClass {
    static int myFieldName = 42; // static field

    public static void main(String[] args) {
        System.out.println(MyClass.myFieldName); // Accessing static field
    }
```

**Instance Field**:
* Does not have 'static' keyword
* Value of the field is not allocated into memory until the object is created
```
public class MyClass {
int myFieldName = 42; // instance field

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println(myObject.myFieldName); // Accessing instance field
    }
}
```

**Static Method**:
* Requires 'static' keyword when declared on the class
```
public class MyClass {
public static void myMethod() { // static method
System.out.println("This is a static method.");
}

    public static void main(String[] args) {
        MyClass.myMethod(); // Calling static method
    }
}
```

**Instance Method**:
* Does not have 'static' keyword
```
public class MyClass {
  
  public void myMethod() { // instance method
    System.out.println("This is an instance method.");
  }
  
  public static void main(String[] args) {
      MyClass myObject = new MyClass();
      myObject.myMethod(); // Calling instance method
  }
}
```