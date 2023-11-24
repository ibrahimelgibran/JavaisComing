public class TipeData {

    public static void main(String[] args) {

        // Integer Number
        byte iniByte = 100; // min -128, max 127, size 1 byte, defauld 0
        short iniShort = 1000; // min -32,767, max 32,767, size 2 byte, defauld 0
        int iniInt = 1000000; // min -2,147,483,648, max 2,147,483,647, size 4 byte, defauld 0
        long iniLong = 1000000000; // min -9,223,372,036,854+, max 9,223,372,036,853+ size 8 byte, defauld 0
        long iniLong2 = 10000000L;

        // Floating point number "bilangan pecahan"
        float iniFloat = 10.20F;
        double iniDouble  = 10.10;

        // Literals
        int decimalInt = 25;
        int hexaDecimal = 0xFFFFF;
        int binaryDecimal = 0b10101010;

        // underscore
        long balance = 1_000_000;
        int sum = 60_000;
    }

}
