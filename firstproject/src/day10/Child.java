package day10;

class Child implements Parent {

    @Override
    public void parentAbstractMethod() {
        System.out.println("Parent abstract method implemented in Child");
    }

    // child’s own method
    void childMethod() {
        System.out.println("Child's own method");
    }
}
