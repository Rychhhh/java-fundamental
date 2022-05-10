public class TipeData {
    public static void main(String[] args) {

//        Tipe Data Number

        byte angkabyte = 100;    // 2 bytes
        short angkashort = 1231; // 4 bytes
        int  angka = 15;         // 4 bytes
        long longangka = 159023; // 8 bytes

//        Tipe Data Float

        float firstfloat = 10.15F;  // 4 bytes
        double iniDouble = 12.121212; // 8 bytes

//        Tipe Data Boolean


        boolean benar = false; // boolean
        char satuangka = 'a'; // char


        String inistring = "Ini String ";  // string
        String adikadik = "ya adik adik";
        String fullkata = inistring + adikadik;
        System.out.println(fullkata);

        System.out.println("Tipe data :  " + iniDouble);
    }
}