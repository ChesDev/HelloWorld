public class Main {
    public static void main(String[] args) {
// ------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Задача №1");
        int capital = 0;
        int contribution = 15000;
        int month = 0;
        while (capital < 2_459_000) {
            month++;
            capital = capital + contribution;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + capital + " рублей.");
        }

// ------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Задача №2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (;number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

// ------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Задача №3");
        double populationY = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int period = 0;
        while (period < 10) {
            populationY = populationY * (1 + birthRate / 1000f - deathRate / 1000f);
            period++;
            System.out.printf("Год " + period + ", численность населения составляет " + "%.0f", populationY);
            System.out.println();
        }

// ------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println("Задача №4");
        int deposit = 15000;
        int percent = 7;
        month = 0;
        while (deposit < 12000000) {
            deposit = deposit + (deposit / 100 * percent);
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
        }

// ------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Задача №5");
        System.out.println();
        System.out.println("Задача №4");
        deposit = 15000;
        percent = 7;
        month = 0;
        while (deposit < 12000000) {
            deposit = deposit + (deposit / 100 * percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
            }
        }
// ------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Задача №6");
        deposit = 15000;
        percent = 7;
        int yearQuanity = 9;
        month = 0;
        while (month < yearQuanity * 12) {
            deposit = deposit + (deposit / 100 * percent);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
            }
        }

// ------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Задача №7");
        int firstFriday = 5;
        int day = 0;
        int friday = 1;
        boolean fourFriday = (firstFriday >3 && firstFriday<6);
        boolean fiveFriday = (firstFriday<=3);

        if (fourFriday) {
            while (friday <= 4) {
                day++;
                if ((day - firstFriday) % 7 == 0 || day == firstFriday) {
                    friday++;
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
            }
        } else if (fiveFriday) {
            while (friday <= 5) {
                day++;
                if ((day - firstFriday) % 7 == 0 || day == firstFriday) {
                    friday++;
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
            }
        } else {
            System.out.println("Введите корректное число первой пятницы в месяце!");
        }
// ------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Задача №8");

        int year = 2000;

        int calcYear = year - 200;
        int finalYear = year + 100;

        while (calcYear < finalYear) {
            calcYear++;
            if (calcYear % 79 == 0) {
                System.out.println(calcYear);
            }
        }

    }
}
