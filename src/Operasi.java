public class Operasi {
    public static void main(String[] args) {
//        Operasi Matematika
        int a = 100;
        int b = 200;
        int d = +100;
        a += 10;
        b += 10;
        d++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);

//        Operasi Perbandingan
        int value1 = 100;
        int value2 = 200;
        System.out.println(value1 > value2); // false
        System.out.println(value1 < value2); // true
        System.out.println(value1 == value2);// false
        System.out.println(value1 <= value2);// true
        System.out.println(value1 >= value2);// false
        System.out.println(value1 != value2);// true

//      Operasi Boolean ! , && , ||
        int maxCPU = 50;
        int CPUrn = 10;

        var overcpu = CPUrn >= maxCPU;
        var stabil = CPUrn < maxCPU;

        var hasil = overcpu && stabil;

        System.out.println(hasil); // false

    }
}
