public class IfStatement {
    public static void main(String[] args) {
        int nilai = 75;

        if (nilai > 75) {
            System.out.println("anda lulus");
        } else if (nilai == 75) {
            System.out.printf("nilai anda pas kkm");
        } else {
            System.out.printf("anda tidk lulus");
        }

//        Ternary Operator
        var score = 80;
        String hallo = score >= 75 ? " Good Score" : " Bad Score";

        System.out.println(hallo);

    }
}
