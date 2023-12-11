public class SwitchStatment {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // switch lambda bisa di pakai java versi 14 keatas
        switch (nilai){
            case "A" -> System.out.println("Wow, selamat anda lulus");
            case "B", "C" -> System.out.println("nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Anda mungkin salah jurusan");
            }
        }

        // swicth dengan kata kunci yield
        String ucapan = switch (nilai){
            case "A" :
                yield  "Berhasil, selamat anda lulus";
            case "B", "C" :
                yield "nilai anda cukup baik";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield  "Anda mungkin salah jurusan";
        };
        System.out.println(ucapan);

    }
}
