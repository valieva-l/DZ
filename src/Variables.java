public class Variables {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat =cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 4;
        System.out.println(dog);
        cat = cat - 4;
        System.out.println(cat);
        paper = paper - 4;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalMass = weightOneBoxer + weightSecondBoxer;
        System.out.println("Общая масса двух бойцов "+ totalMass + " кг");
        var differenceMass = weightSecondBoxer - weightOneBoxer;
        System.out.println("Разница между массами бойцов состовляет " + differenceMass + " кг");

        System.out.println("Задача 7");
        var remainderDivision = weightSecondBoxer%weightOneBoxer;
        System.out.println("Остаток от деления между двумя весами " + remainderDivision + " кг");

        System.out.println("Задача 8");
        var totalHours = 640;
        var workingHours = 8;
        var numberEmployees = totalHours/workingHours;
        System.out.println("Всего работников в компании — " + numberEmployees +  " человек");

        var moreNumberEmployees = 94;
        var numberEmployeesNew = numberEmployees + moreNumberEmployees;
        var workingHoursNew = totalHours/numberEmployeesNew;
        System.out.println("Если в компании работает " + numberEmployeesNew + " человек, то всего "  + workingHoursNew +  " часов работы может быть поделено между сотрудниками");



    }
}