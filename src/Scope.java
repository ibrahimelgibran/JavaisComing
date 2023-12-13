public class Scope {
    public static void main(String[] args) {
    sayHello("Ibrahim");

    }
    static void sayHello(String name) {
        String hello = "Hello " + name;
        System.out.println(hello);

        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
