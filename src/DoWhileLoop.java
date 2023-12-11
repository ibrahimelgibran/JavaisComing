public class DoWhileLoop {

    public static void main(String[] args) {
        // kalo while loop diawal sebelum perulangan dilakukan
        // kalo do while loop dilakukan setelah perulangan dilakukan

        var counter = 1;

        do{
            System.out.println("Perulangan ke - " + counter);
            counter ++;
        } while (counter <= 20);
    }

}
