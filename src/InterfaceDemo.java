interface NewInterface {
    // static method
    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }
    // Public and abstract method of Interface
    void overrideMethod(String str);
}
// Implementation Class
public class InterfaceDemo implements NewInterface {
    public static void main(String[] args)
    {
        NewInterface.hello();

    }
    // Implementing interface method
    @Override
    public void overrideMethod(String str)
    {
        System.out.println(str);
    }
}
