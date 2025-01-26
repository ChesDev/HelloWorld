public class Main {
    public static void main(String[] args) {
        System.out.println("Task №1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println();

        System.out.println("Task №2");
        var dogSum = dog + 4;
        System.out.println(dogSum);
        var catSum = cat + 4;
        System.out.println(catSum);
        var paperSum = paper + 4;
        System.out.println(paperSum);
        System.out.println();

        System.out.println("Task №3");
        var dogSub = dog - 3.5;
        System.out.println(dogSub);
        var catSub = cat - 1.6;
        System.out.println(catSub);
        var paperSub = paper - 7639;
        System.out.println(paperSub);
        System.out.println();

        System.out.println("Task №4");
        var friend = 19;
        System.out.println(friend);
        var friendMult = friend * 2;
        System.out.println(friendMult);
        var friendDiv = friend / 7;
        System.out.println(friendDiv);
        System.out.println();

        System.out.println("Task №5");
        var frog = 3.5;
        System.out.println(frog);
        var frogMult = frog * 10;
        System.out.println(frogMult);
        var frogDiv = frog / 3.5;
        System.out.println(frogDiv);
        var frogSum = frogDiv + 4;
        System.out.println(frogSum);
        System.out.println();

        System.out.println("Task №6");
        var firstBoxerMass = 78.2;
        var secondBoxerMass = 82.7;
        var commonMass = firstBoxerMass + secondBoxerMass;
        System.out.println(commonMass);
        var subMass = firstBoxerMass - secondBoxerMass;
        System.out.println(subMass);
        System.out.println();

        System.out.println("Task №7");
        var diffMass = secondBoxerMass % firstBoxerMass;
        System.out.println(diffMass);
        System.out.println();

        System.out.println("Task №8");
        var sumHours = 640;
        var hoursPerEmployee = 8;
        var employees = sumHours / hoursPerEmployee;
        System.out.println("Всего работников в компании - " + employees + " человек.");
        var newEmployees = employees + 94;
        var newSumHours = newEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + newEmployees + " человек, то всего " + newSumHours + " часов работы может быть поделено между сотрудниками.");
    }
}