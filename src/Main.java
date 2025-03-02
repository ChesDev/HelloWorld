public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------
        System.out.println();
        System.out.println("Задача №1");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        double[] second = {1.57, 7.654, 9.986};

        char[] third = {'a', 'r', 'r', 'a', 'y', 's'};

        //-----------------------------------------------------
        System.out.println();
        System.out.println("Задача №2");

        for (int index = 0; index < first.length; index++) {
            if (index == first.length - 1) {
                System.out.print(first[index]);
                break;
            }
            System.out.print(first[index] + ",");
        }
        System.out.println();

        for (int index = 0; index < second.length; index++) {
            if (index == second.length - 1) {
                System.out.print(second[index]);
                break;
            }
            System.out.print(second[index] + ",");
        }
        System.out.println();

        for (int index = 0; index < third.length; index++) {
            if (index == third.length - 1) {
                System.out.print(third[index]);
                break;
            }
            System.out.print(third[index] + ",");
        }
        System.out.println();

        //-----------------------------------------------------
        System.out.println();
        System.out.println("Задача №3");

        for (int index = first.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(first[index]);
                break;
            }
            System.out.print(first[index] + ",");
        }
        System.out.println();
        for (int index = second.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(second[index]);
                break;
            }
            System.out.print(second[index] + ",");
        }
        System.out.println();
        for (int index = third.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(third[index]);
                break;
            }
            System.out.print(third[index] + ",");
        }
        System.out.println();
        //-----------------------------------------------------
        System.out.println();
        System.out.println("Задача №4");

        for (int index = 0; index < first.length; index++) {
            if (first[index] % 2 != 0) {
                first[index] += 1;
            }
            if (index == first.length - 1) {
                System.out.print(first[index]);
                break;
            }
            System.out.print(first[index] + ",");
        }
    }
}