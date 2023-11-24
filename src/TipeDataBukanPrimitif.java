public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte = null;
        byte iniByte1 = 0;

        System.out.println(iniByte);
        System.out.println(iniByte1);

        iniByte = 100;

        System.out.println(iniByte);

        // contoh tipedata bukan primitif ke primitif

        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 10000L;
    }
}
