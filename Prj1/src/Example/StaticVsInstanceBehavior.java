package Example;
class D {
    static int staticVar; // Static variable
    int instanceVar;      // Instance variable

    // Static initialization block
    static {
        System.out.println("Static block executed");
        staticVar = 100; // Initialize static variable
    }

    // Constructor
    D() {
        System.out.println("Constructor executed");
        instanceVar = 10; // Initialize instance variable
    }
}



public class StaticVsInstanceBehavior {

	public static void main(String[] args) {
        System.out.println("Main method starts");

        // Creating the first object
        D obj1 = new D();

        // Creating the second object
        D obj2 = new D();
    }
}
