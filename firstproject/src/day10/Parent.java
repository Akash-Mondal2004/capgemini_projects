package day10;

interface Parent {

    // implicitly: public static final
    int X = 10;

    // static method (Java 8+)
    static void parentStaticMethod() {
        System.out.println("Parent static method");
    }

    // abstract method
    void parentAbstractMethod();
}

