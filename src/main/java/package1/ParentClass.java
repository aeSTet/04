package package1;

public class ParentClass {
    public ParentClass() {
        System.out.println("Parent class");
    }
    private void privateMethod() {
        System.out.println("private output");
    }
    protected void protectedMethod() {
        System.out.println("protected output");
    }
    public void publicMethod() {
        System.out.println("public output");
    }
    void defaultMethod() {
        System.out.println("default output");
    }
}
