public class Main {
    public static void main(String[] args) {
// ------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №7");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №8");
        for (int n = 0, i = 0; n < 12; n++, i += 29000) {
            System.out.println("Месяц " + (n + 1) + ", сумма накоплений равна " + i + " рублей.");
        }
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №9");
        for (int n = 0, i = 0; n < 12; n++, i = i + 29000 + i / 100) {
            System.out.println("Месяц " + (n + 1) + ", сумма накоплений равна " + i + " рублей.");
        }
        System.out.println();
// ------------------------------------------------------------------------------------------------------
        System.out.println("Задача №10");
        int c = 2;
        for (int i = 1; i <= 10; i++, c = i * 2) {
            System.out.println("2*" + i + "=" + c);
        }
        System.out.println();
    }
}