# UML

UML (Unified Modeling Language) is a general-purpose language to model and visualize designs for a system. UML will be used in this class extensively before you start the coding process for the larger projects.

In this class, we will be learning the basics of UML class diagrams to plan out our programming projects. For a more in-depth look into UML and the various other diagrams involved, you can check for other resources online.

## Purpose
In previous years, we focused on flowcharting which helped with the direction and flow of the project. This year we will be looking at the UML class diagrams to help us plan our projects. Class diagrams help to ensure encapsulation as well as give us a good overview of the work to complete before starting on our code.

This type of planning is useful in a collaborative environment. Team members have their responsibilities and understanding of how each other class will be set up.

## Structure

### Single class
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

You will notice most UML diagrams include a ```+```, ```-```, or ```#``` symbol before a variable or method. This is to signify ```public```, ```private```, and ```protected``` respectively. If for some reason a diagram does not include these symbols, then it is assumed they are all public.

### Relationships
In a larger environment, there will be many class diagrams all inter-related in some fashion. This is where a relationship diagram involving the various class diagrams comes in handy.

In the example below, there are two types of arrows showing the relationship between the classes. The solid-lined arrow shows a "HAS-A" relationship (a chair **has a** color).

![Alt text](./images/uml_class_diagram.PNG)