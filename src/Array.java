public class Array {
    public static void main(String[] args) {


        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Ibrahim";
        stringArray[1] = "El";
        stringArray[2] = "Gibran";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // oprasi array
        String[] nameName = {
          "Ibrahim", "El", "Gibran"
        };

        nameName[0] = null;

        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30l
        };

        System.out.println(arrayLong.length);

        // array di dalam array
        String[][] members = {
                {"Ibrahim", "Gibran"},
                {"El", "Gibran"},
                {"Gibran"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
