import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // ----------------------Task1----------------------------
        System.out.println();
        System.out.println("Задача №1");

        int year = 2001;
        boolean yearIsLeap = definitionLeapYear(year);
        printLeapYear(yearIsLeap, year);
        // -------------------------------------------------------

        // ----------------------Task2----------------------------
        System.out.println();
        System.out.println("Задача №2");

        int clientOS = 0;
        int clientDeviceYear = 2014;
        boolean deviceOS = definittionDeviceOS(clientOS);
        boolean deviceYear = definitionDeviceYear(clientDeviceYear);
        printDownloadVersionApp(deviceOS, deviceYear);
        // -------------------------------------------------------

        // ----------------------Task3----------------------------
        System.out.println();
        System.out.println("Задача №3");

        int deliveryDistance = 1;
        int deliveryTime = definitionDeliveryTime(deliveryDistance);
        printDeliveryTime(deliveryTime);
    }




    // ----------------------Task1----------------------------
    public static boolean definitionLeapYear(int year) {
        boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        return isLeap;
    }

    public static void printLeapYear(boolean yearIsLeap, int year) {
        if (yearIsLeap) {
            System.out.println(year + " год - високосный.");
        } else {
            System.out.println(year + " год - не високосный.");
        }
    }

    // -------------------------------------------------------
    // ----------------------Task2----------------------------

    public static boolean definittionDeviceOS(int clientOS) {
        boolean deviceOS = (clientOS == 0);
        return deviceOS;
    }

    public static boolean definitionDeviceYear(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean deviceYear = (clientDeviceYear >= currentYear);
        return deviceYear;
    }


    public static void printDownloadVersionApp(boolean deviceOS, boolean deviceYear) {
        if (deviceOS && deviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (!deviceOS && deviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (deviceOS && !deviceYear) {
            System.out.println("Установите облегчнную версию прложения для iOS по ссылке.");
        } else if (!deviceOS && !deviceYear) {
            System.out.println("Установите облегчнную версию прложения для Android по ссылке.");
        }
    }

    // -------------------------------------------------------
    // ----------------------Task3----------------------------

    public static int definitionDeliveryTime(int deliveryDistance) {
        int deliveryCase = 0;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryCase = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryCase = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryCase = 3;
        } else if (deliveryDistance > 100) {
            deliveryCase = 4;
        }
        return deliveryCase;
    }

    public static void printDeliveryTime(int deliveryTime) {
        switch (deliveryTime) {
            case 1, 2, 3:
                System.out.println("Потребуется дней: " + deliveryTime);
                break;
            case 4:
                System.out.println("Свыше 100км доставка не осуществляется");
                break;
            default:
                System.out.println("Введите корректное расстояние");
        }
    }
}