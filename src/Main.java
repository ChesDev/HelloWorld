public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача №1");
        System.out.println();

        byte clientOS_01 = (byte) 0;

        if (clientOS_01 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №2");
        System.out.println();

        byte clientOS = (byte) 1;
        short clientDeviceYear = (short) 2014;

        boolean deviceOS =  (clientOS == 0);
        boolean deviceYear = (clientDeviceYear >= 2015);

        if (deviceOS && deviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (!deviceOS && deviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (deviceOS && !deviceYear) {
            System.out.println("Установите облегчнную версию прложения для iOS по ссылке.");
        }
        if (!deviceOS && !deviceYear) {
            System.out.println("Установите облегчнную версию прложения для Android по ссылке.");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №3");
        System.out.println();

        short year = 1600;

        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №4");
        System.out.println();

        int deliveryDistance = 101;
        byte deliveryTime = 0;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        }

        switch (deliveryTime) {
            case 1:
                System.out.println("Потребуется дней: " +deliveryTime);
                break;
            case 2:
                System.out.println("Потребуется дней: " +deliveryTime);
                break;
            case 3:
                System.out.println("Потребуется дней: " +deliveryTime);
                break;
            default:
                System.out.println("Свыше 100км доставка не осуществляется");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №5");
        System.out.println();

        byte monthNumber = (byte) 9;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}