public class Array {
    public static void main(String[] args) {

//        Array Default
        String[] array;
        array = new String[3];
        array[0] = "rayhan";
        array[1] = "rizki";
        array[2] = "putra";

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        // Output
        // rayhan rizki putra



        array[0] = "Ayrchen"; // change value

        System.out.println(array[0]);
        // output
        // rayhan rizki putra ayrchen

//      Array Initializer
        String[] arrayString = {
                "Rayhan", "Rizki", "Putra"
        };

        int[] arrayInt = new int[] {
                10,15,20,25
        };
        long[] arrayLong = {
                20,15,20,25
        };

        String[][] namaKelas = {
                {"Rayhan", "Putra"},
                {"Richal", "Zacky"},
                {"Budy"}
        };

        System.out.println("Array length : " + namaKelas.length);

        System.out.println(namaKelas[2][0]);
        // output
        // budy

        System.out.println("Get Array Type String : " + arrayString[0]);
        System.out.println("Get Array Type Int : " + arrayInt[0]);
        System.out.println("Get Array Type Long : " + arrayLong[0]);

    }
}
