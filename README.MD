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

**Wrapper class**: Provides a way for primitive data types (int, float, etc.) to be used as objects.
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

**Access Modifiers**:
Access modifiers in Java determine who can access certain components of your code such as classes, methods, and variables. They set the visibility scope of these components.
* **Public**: Can be accessed from any other class in the application, regardless of the package the other class belongs to. This is the broadest level of access.
* **Protected**: Can be accessed from any class in the same package, and also from subclasses in any other package.
* **Private**: Can only be accessed from within the same class.
* **Default** Can only be accessed from classes within the same package. Also known as "package-private".
```
public class MyClass {
  
  public int publicVariable;        // Accessible everywhere
  protected int protectedVariable;  // Accessible within same package and subclasses
  int defaultVariable;              // Accessible within same package only
  private int privateVariable;      // Accessible within this class only

  public void publicMethod() {}     // Accessible everywhere
  protected void protectedMethod() {} // Accessible within same package and subclasses
  void defaultMethod() {}           // Accessible within same package only
  private void privateMethod() {}   // Accessible within this class only
  
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

**Scanner**: A class in Java used to get user input from the console. It can parse various primitive types and strings. An easier replacement for System.in.
```
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name);
  }
}
```

**Exception**: Any error that occurs during the execution of a program. Exceptions are typically handled with try/catch blocks so the program knows what to do instead of crashing.
```
public class Main {
  public static void main(String[] args) {
    try {
      int[] numbers = new int[5];
      System.out.println(numbers[10]); // This will throw an exception
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("An exception occurred: " + e);
    }
  }
}
```

**Import statements**: Import statements in Java let us use classes and other code components that were created by others and are not in the current package.
```
import java.util.ArrayList;  // Importing ArrayList class from java.util package

public class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    System.out.println(list.get(0));
  }
}
```

**Return multiple items from a function**: This can be accomplished by using collections (list, set, map, etc.), arrays, or creating a class to hold the values.
```
public class Main {
  
  public static void main(String[] args) {
    int[] array = getNumbers();
    System.out.println(array[0] + ", " + array[1]);
  }
  
  public static int[] getNumbers() {
      return new int[]{5, 10};
  }
}
```

**Object-Oriented Programming (OOP)**: A programming paradigm that models real-world objects as software objects. These objects contain both data (fields) and behavior (methods). It is sometimes referred to as class-based programming.

**Software Object**: A software object, modeled after a real-world object, is an instance of a class. It stores its state in fields (also known as variables or attributes), and exposes its behavior through methods.

**Class**: A class in Java is a blueprint for creating objects. It describes the data (fields) and the behavior (methods) that are relevant to the real-world object it's designed to represent.
```
public class MyClass {
  // class body
}
```

**Object**: An object, also referred to as an instance, is an instantiation of a class with a specific set of attributes.
```
MyClass myObject = new MyClass();  // myObject is an instance (object) of MyClass
```

**Class Member**: A class member in Java can be a field, method, or some type of dependent element of a class. Class members can be either static (defined at the class level) or instance (defined at the object level).
```
public class MyClass {

  static int staticField;  // This is a static class member
  int instanceField;  // This is an instance class member

  static void staticMethod() {}  // This is a static class member
  void instanceMethod() {}  // This is an instance class member
  
}
```

**Package**: Logical groupings of classes. If no package is specified for a class, it belongs to the default package.
```
package com.example; public class MyClass { } // MyClass is in the com.example package
```

**Top-Level Class**: A class not enclosed in another class, type, or method's code-block. The access modifier can be Public or none (default).
```
public class MyClass { } // MyClass is a public top-level class
class MyOtherClass { } // MyOtherClass is a default (package-private) top-level class
```

**Local Variable**: Variables declared and only accessible within a method.
```
public void myMethod() {
int localVariable = 10; // localVariable is a local variable
}
```

**Class Member Access Modifiers**: Access modifier at the member level allows granular control over class members.
```
public class MyClass {
int defaultAccessMember; // defaultAccessMember is accessible within the same package
public int publicAccessMember; // publicAccessMember is accessible from any class in any package
protected int protectedAccessMember; // protectedAccessMember is accessible within the same package or subclasses
private int privateAccessMember; // privateAccessMember is only accessible within MyClass
}
```

**Encapsulation**: Practice of hiding some fields and methods from public access.
```
public class MyClass {
private int myField; // myField is private, so it's encapsulated

    public int getMyField() { return myField; } // public getter exposes myField safely
    public void setMyField(int myField) { this.myField = myField; } // public setter modifies myField safely
}
```

**Null**: A keyword meaning the variable or attribute has a type but no reference to an object.
```
Object myObject = null; // myObject is declared but has no assigned object, so it's null
```

**Field Default Values**: Fields on classes are assigned default values by Java.
```
public class MyClass {
boolean defaultBoolean; // default is false
int defaultInt; // default is 0
double defaultDouble; // default is 0.0
}
```

**Formatted String**: Dynamically inserts values into a string.
```
System.out.printf("Hello %s, your score is %d%n", "Alice", 85); // %s is replaced with "Alice", %d is replaced with 85
```

**Getter/Setter**: Method on a class that returns (or sets) the value of a private field on an instance of an object.
```
public class MyClass {
private int myField; // myField is private

    public int getMyField() { return myField; } // getter for myField
    public void setMyField(int myField) { this.myField = myField; } // setter for myField
}
```


**Lombok**: A Java library that automatically generates getters & setters to reduce boilerplate code.
```
import lombok.Getter; import lombok.Setter; // Import Lombok's Getter and Setter annotations

public class MyClass {
@Getter @Setter private int myField; // Lombok will generate a getter and setter for myField
}
```

**Boiler Plate Code**: Sections of code that have to be included in many places with little or no alteration. It's often seen as repetitive and mundane, serving as necessary "plumbing" to make things work, but not contributing to the actual functionality or logic of the program.
```
public class MyClassWithoutLombok {
private int myField; // myField is private

    public int getMyField() { return myField; } // Boilerplate getter for myField
    public void setMyField(int myField) { this.myField = myField; } // Boilerplate setter for myField
}
```