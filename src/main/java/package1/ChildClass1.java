package package1;

public class ChildClass1 extends  ParentClass {
    public ChildClass1(){
        System.out.println("Child class 1");
    }
    @Override
    public void publicMethod() {
        super.publicMethod();
        System.out.println("public output child 1");
        defaultMethod();

    }
}
