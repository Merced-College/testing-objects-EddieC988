//Eduardo
//6/8/26
//Object testing class for my Dog and Book objects

public class ObjectTester {


    public static void main (String[] args){

        /* 

        // A1: Create a Dog with no constructors defined.
        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        //test of data variables as public
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.name);   // expected: null
        System.out.println("age = " + d1.age);     // expected: 0
        System.out.println("breed = " + d1.breed); // expected: null

        //test the constructors for the default and non-default
        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.name + ", age = " + d2.age + ", breed = " + d2.breed);

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.name + ", age = " + d3.age + ", breed = " + d3.breed);

        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        //Step 10
        System.out.println("\nMutating public fields directly:");
        d3.age = 5;      // direct write
        d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()

        */

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

    }//end main

}//end class