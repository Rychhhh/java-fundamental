public class ForLoop {
    public static void main(String[] args) {
//        String newLine = System.getProperty("line.separator");
        String newLine = System.getProperty("line.separator");

        for(var i = 1; i <= 10; i++) {
            System.out.printf("Perulangan ke -" + i + newLine);
        }
    }
}
