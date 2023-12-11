public class OprasiBoolean {
    public static void main(String[] args) {

        var absen = 75;
        var nilaiAkhir = 85;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
