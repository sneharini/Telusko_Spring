// class can have variables, methods, and class as well
// static can be used only in inner class

class A{
    int age;

    public void show(){
        System.out.println("in show");
    }
    class B {
        public void config(){
            System.out.println("in config");
        }
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); //print "in show"

        // we cannot access class b, coz it's inside A
        // to access class B , we need to use obj of a

        // to access non-static class, we need obj
        A.B obj1 = obj.new B();
        // to access static class, we can directly use class name
        // A.B obj2 = new A.B();
        obj1.config();
    }

}
