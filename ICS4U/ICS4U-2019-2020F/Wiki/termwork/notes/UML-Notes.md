# UML

UML (Unified Modeling Language) is a general-purpose language to model and visualize designs for a system. UML will be used in this class extensively before you start the coding process for the larger projects.

In this class, we will be learning the basics of UML class diagrams to plan out our programming projects. For a more in-depth look into UML and the various other diagrams involved, you can check for other resources online.

## Purpose
In previous years, we focused on flowcharting which helped with the direction and flow of the project. This year we will be looking at the UML class diagrams to help us plan our projects. Class diagrams help to ensure encapsulation as well as give us a good overview of the work to complete before starting on our code.

This type of planning is useful in a collaborative environment. Team members have their responsibilities and understanding of how each other class will be set up.

## UML Class Diagrams

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

You will notice most UML diagrams include a ```+``` or ```-``` symbols before a variable or method. This is to signify ```public``` and ```private``` respectively. If for some reason a diagram does not include these symbols, then it is assumed they are all public.

### Relationships
In a larger environment, there will be many class diagrams all inter-related in some fashion. This is where a relationship diagram involving the various class diagrams comes in handy.

In the example below, there are two types of arrows showing the relationship between the classes. The solid-lined arrow shows a "HAS-A" relationship (a chair **has a** color).

![Alt text](./images/uml_class_diagram.PNG)


## Inheritance
In an inheritance-based environment, your diagrams and relationships will have some slightly different features.

For example, in the detailed diagram below, you will notice a new symbol (the ```#``` symbol) in front of either variables or methods within the classes.  This symbol means that the variable or method is ```protected```.  A ```protected``` variable or method is like having a **private-to-the-class-chain** variable/method.  For example, any of the children (or sub) classes can see the variable/method, but nothing outside of the familial relationship can see them.

### Relationships
In a larger environment, there will be many class diagrams all inter-related in some fashion.  In the below example, you will notice a new arrow (the dashed line) which show an **"IS A"** relationship (a car **is a** vehicle).

![Alt text](./images/uml_class_diagram_inheritance.png)


### Diagram types
There are multiple types of UML diagrams; however, we will be focusing on only 2 different types.  A **high-level diagram** where you are just looking at the relationships between classes (see below), or a **detailed diagram** like the ones that are previously shown.

![Alt text](./images/uml_class_diagram_inheritance_high_level.png)


## UML Use Case Diagram
There are multiple types of UML use case diagrams.  The one that we will be focusing on in this course is the **system use case diagrams**.

### Symbols 
Whenever you are creating a UML use case diagram you will need, at minimum, two different types of symbols: actors and use cases.  These symbols are shown below.

![Actor](./images/uml_use_case_actor.png)
![Use Case](./images/uml_use_case_use_case.png)

### Basic Diagrams

Your use cases will always have at least one actor acting upon them, **or**, they are automated/extended/inclusive use cases that are based on inheritance or another use case in another system.  Below is a basic example of a student and teacher acting on a basic school-based management system.

![Basic Diagram](./images/uml_use_case_diagram_basic.png)

### Complex Diagrams

Eventually your systems can get complicated and complex.  As you can see below, here is a sample use case diagram regarding a university/college system.

![Complex Diagram](./images/uml_use_case_diagram_complex.jpg)

As you can see, these systems can expand and become complicated quickly.  Depending on the phase of your project, many of the use case diagrams that occur early are the simpler type, but as the project continues and more use cases come into action you will have a more complex type of use case diagram.

### Release Boxes

Sometimes, whenever you are planning out the next phase of your development, you will want to separate your work into different releases (sometimes you see this as "patches" on software, or upgrades).  Use case diagrams look a little different in this case.  As you can see below, you group up the items into the different releases that you are planning.

![Releases](./images/uml_use_case_including_release_boxes.gif)


## Sources
The use case, actor, and basic teacher/student images were retrieved from [this](https://www.guru99.com/use-case-diagrams-example.html) site on 17-Sep-19.
The complex university application image and the image including release bounding boxes were retrieved from [this](http://www.agilemodeling.com/artifacts/useCaseDiagram.htm) site on 17-Sep-19.