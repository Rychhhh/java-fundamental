public class Switch {
    public static void main(String[] args) {
//        Switch
    // switch adalah if statement yang lebih sederhana


        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.printf("Anda Lulus");
                break;
            case "B":
                System.out.printf("Anda Hampir Lulus");
                break;
            case "C":
                System.out.printf("Anda Belum Lulus");
                break;
        }

//        Switch Lambda
        var nama = "admin";

        switch (nama) {
            case "admin" -> System.out.printf("Anda Admin");
            case "developer" -> System.out.printf("Anda Developer");
            case "user" -> System.out.printf("Anda User");
            default -> System.out.printf("Anda Belum Memilih Role");
        }

    }
}
