public class MethodVariableArgument {
    public static void main(String[] args) {

        // menggunakan array tanpa menggunakan variable arguments
        int[] values  = {80,80,80,80};
        sayCongrats("Gibran", values);

        // mengunakan variable argument≠
        sayCongrats("Odsan", 80,50,80,80,80);

    }
    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }

        var finalValue = total / values.length;
        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus" );
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }

    }
}
