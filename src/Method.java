public class Method {
    public static void main(String[] args) {
        getNama(" Rayhan ", "Putra");

        int value1 = 50;
        int value2 = 100;
        var result = sum(value1,value2);
        System.out.println(result);

        sayName("Rayhan");
        sayName("Rayhan", "Putra");
    }

    static void getNama(String firstName , String lastName) {
        System.out.println("Hello" + firstName + lastName);
    }

    static int sum(int score1, int score2 ) {
        var total = score1 + score2;
        return total;
    }

//    Method Overloading
    static void sayName(String name) {
        System.out.printf("Hello" + name);
    }

    //    Method Overloading
    static void sayName(String name , String lastName) {
        System.out.printf("Hello" + name + lastName);
    }
}
