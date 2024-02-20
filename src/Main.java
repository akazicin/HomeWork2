public class Main {
    public static void main(String[] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(" dog = " + dog);
        System.out.println(" cat = " + cat);
        System.out.println(" paper = " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(" dog = " + dog);
        System.out.println(" cat = " + cat);
        System.out.println(" paper = " +paper);

        dog = (int) (dog - 3.5);
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(" dog = " + dog);
        System.out.println(" cat = " + cat);
        System.out.println(" paper " + paper);

        var friend = 19;
        System.out.println(" Friend = " + friend);

        friend = friend + 2;
        System.out.println(" Friend = " + friend);

        friend = friend / 3;
        System.out.println(" Friend = " + friend);

        var frog = 3.5;
        System.out.println(" Frog = " + frog);

        frog = frog * 10;
        System.out.println(" Frog = " + frog);

        frog = frog / 3.5;
        System.out.println(" Frog = " + frog);

        frog = frog + 4;
        System.out.println(" Frog = " + frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalMassa = firstBoxer + secondBoxer;
        System.out.println(" Общий вес боксеров = " + totalMassa + " кг ");

        var differenceMassa = secondBoxer - firstBoxer;
        System.out.println(" Разница в весе двух боксеров = " + differenceMassa + " кг ");

        var remainderDivision = secondBoxer % firstBoxer;
        System.out.println(" Остаток от деления двух весов = " + remainderDivision + " кг ");

        var hoursWorkTotal = 640;
        var workingOneEmployee = 8;
        var totalEmployee = hoursWorkTotal / workingOneEmployee;
        System.out.println(" Всего сотрудников в компании - " +totalEmployee + " человек ");

        totalEmployee = totalEmployee + 14;
        var newWorkingOneEmployee = hoursWorkTotal / totalEmployee;
        System.out.println(" Если в компании работает " + totalEmployee + " человек, то всего " + newWorkingOneEmployee + " часов работы может быть поделено между сотрудниками.");








    }
}