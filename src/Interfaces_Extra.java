
interface Loganthan1
{
    // by default these methods are public and abstract
    void show();
    void config();
}

interface Mageshwari1{
    void cooking();
}


// with the help of interface, we can create realtime classes
// A class which implements interface, should define the methods mentioned in interface
class Sneha1 implements Loganthan1, Mageshwari1{
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }


    @Override
    public void cooking() {
        System.out.println("in cooking");
    }
}

public class Interfaces_Extra {
    public static void main(String[] args) {
        // we cannot create object for interface
        // but we can create an object for class B which implements A
        Loganthan1 obj = new Sneha1();
        obj.show();
        obj.config();

        Mageshwari1 obj2 = new Sneha1();
        obj2.cooking();
    }
}
