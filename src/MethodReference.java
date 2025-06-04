// Functional interface with one abstract method
interface Sayable {
    void say();
}
public class MethodReference {
    // Static method
    public static void sayStatic() {
        System.out.println("Hello, this is a static method.");
    }
    // Instance method
    public void sayInstance() {
        System.out.println("Hello, this is an instance method.");
    }
    public static void main(String[] args) {
        Sayable staticSayable = MethodReference::sayStatic;
        staticSayable.say();  // Output: Hello, this is a static method.

        // ---------- Instance Method Reference ----------
        MethodReference obj = new MethodReference();  // Create object
        Sayable instanceSayable = obj::sayInstance;
        instanceSayable.say();  // Output: Hello, this is an instance method.
    }
}
