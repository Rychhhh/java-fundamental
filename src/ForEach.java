public class ForEach {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        String[] kelas = {
                "X", "XI", "XII"
        };

        // For Loop
        for( var i = 0; i < kelas.length; i++ ) {
            System.out.printf("kelas : " + kelas[i] + newLine);
            // output
            //            kelas : X
            //            kelas : XI
            //            kelas : XII
        }

        for (var i : kelas) {
            System.out.println(i);
            // output
            //            kelas : X
            //            kelas : XI
            //            kelas : XII
        }
    }
}
