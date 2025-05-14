public class Opp {
    /*  Java - What is OOP?

    OOP stands for Object-Oriented Programming.

    Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

    Object-oriented programming has several advantages over procedural programming:

    OOP is faster and easier to execute
    OOP provides a clear structure for the programs
    OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
    OOP makes it possible to create full reusable applications with less code and shorter development time

    So, a class is a template for objects, and an object is an instance of a class.

    When the individual objects are created, they inherit all the variables and methods from the class.
    */

    int x = 5;
    int y = 10;

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Opp myObj2 = new Opp();
        Opp myObj1 = new Opp();
        System.out.println(myObj1.x);
        System.out.println(myObj1.y);
        System.out.println("\n" + myObj2.x);
        System.out.println(myObj2.y);

        myObj1.y = 20;

        System.out.println("\n" + myObj1.y); 
        System.out.println(myObj2.y);

        System.out.println("\nName: " + myObj1.fname + " " + myObj1.lname);
        System.out.println("Age: " + myObj1.age);

    }
}

