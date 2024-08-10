/** In abstract class, we can able to create abstract methods, concrete methods
 , if we have only abstract methods inside abstract class, we can use interface
 **/

// interfaces are just a design

interface Loganthan
{
    //by default these variables are final and static, so we need to initialize
    int age = 24;
    String city = "Chennai";

    // by default these methods are public and abstract
   void show();
   void config();
}



// with the help of interface, we can create realtime classes
// A class which implements interface, should define the methods mentioned in interface
class Sneha implements Loganthan{
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // we cannot create object for interface
        // but we can create an object for class B which implements A
        Loganthan obj = new Sneha();
        obj.show();
        obj.config();

        System.out.println(Loganthan.city);
    }
}
