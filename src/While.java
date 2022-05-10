public class While {
    public static void main(String[] args) {

        String newLine = System.getProperty("line.separator");
        var count = 1;

        while(true) {
            System.out.printf("Perulangan ke -" + count + newLine);
            count++;

            if(count == 10) {
                break;
            }

        }
    }
}
