public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача №1");
        System.out.println();

        byte b = (byte) -50;
        short s = (short) 25000;
        int i = 1235500123;
        long l = 5369690781675244933L;
        float f = 3.1415926f;
        double d = 3.1415926535897932;

        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 's' с типом short равно " + s);
        System.out.println("Значение переменной 'i' с типом int равно " + i);
        System.out.println("Значение переменной 'l' с типом long равно " + l);
        System.out.println("Значение переменной 'f' с типом float равно " + f);
        System.out.println("Значение переменной 'd' с типом double равно " + d);
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №2");
        System.out.println();

        float n10 = 27.12f;
        long n11 = 987678965549L;
        float n12 = 2.786f;
        short n13 = (short) 569;
        short n14 = (short) -159;
        short n15 = (short) 27897;
        byte n16 = (byte) 67;

        System.out.println(n10);
        System.out.println(n11);
        System.out.println(n12);
        System.out.println(n13);
        System.out.println(n14);
        System.out.println(n15);
        System.out.println(n16);
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №3");
        System.out.println();

        byte teacherOne = (byte) 23;
        byte teacherTwo = (byte) 27;
        byte teacherThree = (byte) 30;
        short paperLists = (short) 480;
        short totalStudents = (short) (teacherOne + teacherTwo + teacherThree);
        byte paperPerStudent = (byte) (paperLists / totalStudents);

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №4");
        System.out.println();
        byte perMin = (byte) 16/2;
        byte t1 = (byte) 20;
        short t2 = (short) 24*60;
        short t3 = (short) (t2*3);
        int t4 = t2*31;
        short per20Min = (short) (t1 * perMin);
        short perDay = (short) (t2 * perMin);
        int per3Days = t3 * perMin;
        int perMonth = t4 * perMin;

        System.out.println("За " + t1 + " машина произвела " + per20Min + " штук бутылок.");
        System.out.println("За " + t2 + " машина произвела " + perDay + " штук бутылок.");
        System.out.println("За " + t3 + " машина произвела " + per3Days + " штук бутылок.");
        System.out.println("За " + t4 + " машина произвела " + perMonth + " штук бутылок.");
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №5");
        System.out.println();

        byte whitePerClass = (byte) 2;
        byte brownPerClass = (byte) 4;
        byte totalCansPerClas = (byte) (whitePerClass + brownPerClass);
        byte classAmount = (byte) (120 / totalCansPerClas);
        byte totalWhiteCans = (byte) (whitePerClass * classAmount);
        byte totalBrownCans = (byte) (brownPerClass * classAmount);

        System.out.println("В школе, где " + classAmount + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №6");
        System.out.println();

        short banana = (short) 80;
        short milk = (short) 105;
        short iceCream = (short) 100;
        short egg = (short) 70;
        short breakfastNetWeight = (short) (banana*5 + milk*2 + iceCream*2 + egg*4);
        float breakfastNetWeightKg = breakfastNetWeight/1000f;

        System.out.println("Вес спортзавтрака в граммах - " + breakfastNetWeight);
        System.out.println("Вес спортзавтрака в килограммах - " + breakfastNetWeightKg);
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №7");
        System.out.println();

        short needDrop = (short) 7000;
        byte needDropBy250 = (byte) (needDrop/250);
        byte needDropBy500 = (byte) (needDrop/500);
        byte needDropAverage = (byte) ((needDropBy250+needDropBy500)/2);

        System.out.println(needDropBy250 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(needDropBy500 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(needDropAverage + " дней уйдет на похудение, если спортсмен будет в среднем терять каждый день от 250 до 500 грамм.");
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №8");
        System.out.println();
        int mashaMS = 67760;
        int denisMS = 83690;
        int krisMS = 76230;
        short masha10p = (short) (mashaMS * 0.1f);
        short denis10p = (short) (denisMS * 0.1f);
        short kris10p = (short) (krisMS * 0.1f);
        int mashaNewMS = mashaMS + masha10p;
        int denisNewMS = denisMS + denis10p;
        int krisNewMS = krisMS + kris10p;
        int mashaYSDiff = mashaNewMS*12 - mashaMS*12;
        int denisYSDiff = denisNewMS*12 - denisMS*12;
        int krisYSDiff = krisNewMS*12 - krisMS*12;

        System.out.println("Маша теперь получает " + mashaNewMS + " рублей. Годовой доход вырос на " + mashaYSDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisNewMS + " рублей. Годовой доход вырос на " + denisYSDiff + " рублей.");
        System.out.println("Кристина теперь получает " + krisNewMS + " рублей. Годовой доход вырос на " + krisYSDiff + " рублей.");
    }
}