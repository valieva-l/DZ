public class Variables {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int forest = 2150546;
        System.out.println("Значение переменной forest с типом int равно " + forest);
        byte game = 55;
        System.out.println("Значение переменной game с типом byte равно " + game);
        short mur = 31000;
        System.out.println("Значение переменной mur с типом short равно " + mur);
        long max = 365326583;
        System.out.println("Значение переменной max с типом long равно " + max);
        float time = 3.586F;
        System.out.println("Значение переменной time с типом float равно " + time);
        double bond = 86.55654236542;
        System.out.println("Значение переменной bond с типом double равно " + bond);

        System.out.println("Задача 2");
        float inn = 27.12F;
        System.out.println(inn);
        long jdk = 987_678_965_549l;
        System.out.println(jdk);
        float nik = 2.786F;
        System.out.println(nik);
        short mir = 569;
        System.out.println(mir);
        short kir = -159;
        System.out.println(kir);
        short lea = 27897;
        System.out.println(lea);
        byte low = 67;
        System.out.println(low);

        System.out.println("Задача 3");

        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short quantityPaper = 480;
        int numberStudents = firstTeacher + secondTeacher + thirdTeacher;
        int numberSheets = quantityPaper/numberStudents;
        System.out.println("На каждого ученика рассчитано " + numberSheets + " листов бумаги");

        System.out.println("Задача 4");
        byte performance = 16;
        byte minutes = 2;
        byte minutesOne = 20;
        int timeOne = performance/minutes;
        int timeTwo = timeOne*minutesOne;
        System.out.println("За " +  minutesOne + " минут машина произвела " + timeTwo + " штук бутылок");
        short minutesDay = 24*60;
        int timeThree = timeOne*minutesDay;
        System.out.println("За сутки машина произвела " + timeThree + " штук бутылок");
        short minutesThreeDay = 24*3*60;
        int timeFour = timeOne*minutesThreeDay;
        System.out.println("За 3 дня машина произвела " + timeFour + " штук бутылок");
        int minutesFourDay = 24*30*60;
        int timeFive = timeOne*minutesFourDay;
        System.out.println("За месяц машина произвела " + timeFive + " штук бутылок");

        System.out.println("Задача 5");







    }
}