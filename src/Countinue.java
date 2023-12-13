// countinue untuk menghentikan perulangan saat ini dan melanjutkan ke perulangan berikutnya
public class Countinue {

    public static void main(String[] args) {

        for(var counter = 1; counter <= 100; counter++){
            if(counter % 2 == 0){ // jika ingin genap 0 bisa di ganti 1
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);
        }
    }
}
