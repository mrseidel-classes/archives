To update:
* visuals
* use case diagram notes and visuals

# UML

UML (Unified Modeling Language) is a general-purpose language to model and visualize designs for a system. UML will be used in this class extensively before you start the coding process for the larger projects.

In this class, we will be learning the basics of two different types of UML diagrams:
* Class Diagrams, and
* Use Case Diagrams

For a more in-depth look into UML and the various other diagrams involved, you can check for other resources online.

## Purpose

In previous years, we focused on flowcharting which helped with the direction and flow of the project. This year we will be looking at the UML to help us plan our projects. Class diagrams help to ensure encapsulation as well as give us a good overview of the work to complete before starting on our code.  Use case diagrams help to figure out the the interactions between the system as well as both front-end and back-end users.

This type of planning is useful in a collaborative environment. Team members have their responsibilities and understanding of how each other class will be set up.

## Structure

### Class Diagrams (Single class)
A class diagram is set up into 3 different sections. The class name, the instance variables, and the methods that exist within that object.

| Course |
|------|
|-teacher : String = "Miss Tissism" <br/> -courseCode : String |
|+handInWork (work : String) : void <br/> +receiveGrade (grade : int) : void |

The above is a basic example of a class diagram that could be used for a course offered at high school.
Let's break down each section:

##### Section 1
The first section contains the class name ```Course```. 

##### Section 2

The next section contains the **instance variables** (_teacher_ and _courseCode_) as well as the datatypes and default starting values (if necessary). 

##### Section 3

The last section contains the various **methods** a `Course` can have (_handInWork()_ and _receiveGrade()_). It also contains each of the method's parameter lists. There is one parameter for _handInWork_ which is ```work``` of type ```String```, and one parameter for _receiveGrade_ which is ```grade``` of type ```int```.  Both functions' return type is ```void```.

You will notice most UML diagrams include a ```+``` or ```-``` symbols before a variable or method. This is to signify ```public``` and ```private``` respectively. If for some reason a diagram does not include these symbols, then it is assumed they are all public.

### Class Diagrams (Relationships)
In a larger environment, there will be many class diagrams all inter-related in some fashion. This is where a relationship diagram involving the various class diagrams comes in handy.

In the example below, there is information along each of the lines that tells you the relationship between the two classes that are connected.  The word ```<<uses>>``` describes how something "HAS-A" something else.  In this case, a chair **has a** color.

![Alt text](./images/uml_class_diagram.PNG)


### Class Diagrams (Inheritance, Abstract Classes, Interfaces, etc.)
In an inheritance-based environment, your diagrams and relationships could have some slightly different features.

For example, in the detailed diagram below, you will notice a new symbol (the ```#``` symbol) in front of either variables or methods within the classes.  This symbol means that the variable or method is ```protected```.  A ```protected``` variable or method is like having a **private-to-the-class-chain** variable/method.  For example, any of the children (or sub) classes can see the variable/method of the parent, but nothing outside of the familial relationship can see them.

In the example below, whenever we have this type of relationship, we can denote it through a different word along the lines.  Instead of ```<<uses>>``` we can use ```<<extends>>``` to describe both **inheritance**, and **abstract class inheritance**.  To denote an **interface** connection, we would use the word ```<<implements>>```.

![Alt text](./images/uml_class_diagram_inheritance.png)


### Class Diagrams (High-Level)
There are multiple types of UML class diagrams; however, we will be focusing on only 2 different types.  A **high-level class diagram** where you are just looking at the relationships between classes (see below), or a **detailed class diagram** like the ones that are previously shown.

![Alt text](./images/uml_class_diagram_inheritance_high_level.png)

## Use Case Diagrams

Notes about use-case-diagrams will show up here.