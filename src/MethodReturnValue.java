public class MethodReturnValue {

    public static void main(String[] args) {
        var retult1 = sum(100, 100);
        System.out.println(retult1);

        System.out.println(hitung(100, "+",200));
        System.out.println(hitung(100, "-",200));
        System.out.println(hitung(100, "salah",200));
    }
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return  total;
    }

    static int hitung(int value1, String oprasi, int value2){
        switch (oprasi){
            case "+" :
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
