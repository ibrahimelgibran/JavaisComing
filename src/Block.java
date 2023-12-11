public class Block {
    public static void main(String[] args) {
        // ini adalah expression
        int value ;
        value = 100;

        // ini adalah statment
        System.out.println(value = 10);

        // berikut ini block
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        {
            System.out.println("Hello World 3");
            System.out.println("Hello World 4");
        }

    }
}
