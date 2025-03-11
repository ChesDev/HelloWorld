public class Main {
    public static void main(String[] args) {
        // ------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Задача №1");
        int[] monthExpenses = {15483, 11965, 12765, 17876, 16777};
        int sumExpenses = 0;

        for (int weekExpenses : monthExpenses) {
            sumExpenses += weekExpenses;
        }
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей.");
        System.out.println();
        // ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №2");
        int maxWeekExpenses = -1;
        int minWeekExpenses = 1000000;

        for (final int weekExpenses : monthExpenses) {
            if (weekExpenses > maxWeekExpenses) {
                maxWeekExpenses = weekExpenses;
            } else if (weekExpenses < minWeekExpenses) {
                minWeekExpenses = weekExpenses;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeekExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxWeekExpenses + " рублей.");
        System.out.println();
        // ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №3");
        sumExpenses = 0;
        double avgExpenses = 0;
        for (int weekExpenses : monthExpenses) {
            sumExpenses += weekExpenses;
        }
        avgExpenses = (double) sumExpenses / monthExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgExpenses + " рублей.");
        System.out.println();

        // ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int s = reverseFullName.length - 1;
        char temp;
//        System.out.println(Arrays.toString(reverseFullName));
        for (int i = 0; i <= s; i++) {
            temp = reverseFullName[s];
            reverseFullName[s] = reverseFullName[i];
            reverseFullName[i] = temp;
            s--;
        }
        for (int i:reverseFullName) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();


    }
}