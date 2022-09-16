import package1.ChildClass1;
import package1.ChildClass2;
import package2.ChildClass3;
public class Main {
    public static void main(String[] args) {
        ChildClass1 child1=new ChildClass1();
        ChildClass2 child2=new ChildClass2();
        child1.publicMethod();
        ChildClass3 child3=new ChildClass3();
    }

}
