public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Ibrahim El Gibran";

        System.out.println(name);

        int age = 19;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Bisa Seperti ini";
        System.out.println(name);

        // bisa menggunakan var tanpa menyebutkan tipe datanya karna java sudah tau
        var firstName = "Ibrahim El Gibran";
        var middleName = "El";
        var lastName = "Gibran";

        /* contoh yang salah
            var firstName;
            firstName = "Hello World";
         */

        // kata kunci final
        final var application = "Belajar JS";

        /* final / constan tidak bisa dirubah nilainya
        application = "Belajar PHP"; // error
        */
    }
}
