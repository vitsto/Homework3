public class Main {
    public static void main(String[] args) {
        //Exercise 1
        //Integer variables
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 500;
        long longVar = 10_000_000_000L;
        //Float-point variables
        float floatVar = 0.25f;
        double doubleVar = 1.0;
        //Symbol variable
        char charVar = 'A';
        //Logical variable
        boolean booleanVar = true;
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);
        System.out.println("Значение переменной charVar с типом char равно " + charVar);
        System.out.println("Значение переменной booleanVar с типом boolean равно " + booleanVar);


        //Exercise 2
        double a = 27.12;
        long b = 987_678_965_549L;
        byte c = 2;
        int d = 786;
        boolean e = false;
        short f = 569;
        int g = -159;
        int h = 27897;
        char i = 67;

        //Exercise 3
        int group1 = 23, group2 = 27, group3 = 30;
        int papers = 480;
        int papersForStudent = papers / (group1 + group2 + group3);
        System.out.println("На каждого ученика рассчитано " + papersForStudent + " листов");

        //Exercise 4
        int bottlesPerMinute = 16 / 2;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела бутылок " + bottlesPerTwentyMinutes + " штук");
        System.out.println("За день машина произвела бутылок " + bottlesPerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + bottlesPerThreeDays + " штук");
        System.out.println("За месяц машина произвела бутылок " + bottlesPerMonth + " штук");

        //Exercise 5
        int totalJars = 120;
        int whiteJarsPerClassroom = 2;
        int brownJarsPerClassroom = 4;
        int totalClassrooms = totalJars / (whiteJarsPerClassroom + brownJarsPerClassroom);
        int totalWhiteJars = whiteJarsPerClassroom * totalClassrooms;
        int totalBrownJars = brownJarsPerClassroom * totalClassrooms;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно "
                + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски");

        //Exercise 6
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;

        double sumGr = banana + milk + iceCream + egg;
        double sumKg = sumGr / 1000.0;
        System.out.println("Breakfast's weight (in kgs): " + sumKg);

        //Exercise 7
        int startWeight = 7 * 1000;
        int loss1 = 250;
        int loss2 = 500;

        int countDays1 = startWeight / loss1;
        int countDays2 = startWeight / loss2;
        int average = (countDays1 + countDays2) / 2;

        System.out.println("If the sportsman loses 250 grams every day, " +
                "he'll achieve his goal in " + countDays1 + " days");
        System.out.println("If the sportsman loses 500 grams every day, " +
                "he'll achieve his goal in " + countDays2 + " days");
        System.out.println("Average: " + average + " days");

        //Exercise 8
        double mashaCurrent = 67760;
        double denisCurrent = 83690;
        double kristinaCurrent = 76230;

        double mashaNext = 1.1 * mashaCurrent;
        double denisNext = 1.1 * denisCurrent;
        double kristinaNext = 1.1 * kristinaCurrent;

        System.out.println("Masha's salary is " + mashaNext + ". Her salary increased by " + (mashaNext - mashaCurrent));
        System.out.println("Denis's salary is " + denisNext + ". His salary increased by " + (denisNext - denisCurrent));
        System.out.println("Kristina's salary is " + kristinaNext + ". Her salary increased by " + (kristinaNext - kristinaCurrent));
    }
}