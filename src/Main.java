public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");
        System.out.println();

        short legalAge = (short) 17;

        if (legalAge >= 18) {
            System.out.println("Если возраст человека равен " + legalAge + ", он совершеннолетний.");
        }else{
            System.out.println("Если возраст человека равен " + legalAge + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №2");
        System.out.println();

        byte hatTemp = (byte) 5;

        if (hatTemp >= 5) {
            System.out.println("На улице " + hatTemp + " градусов, можно идти без шапки.");
        }else{
            System.out.println("На улице " + hatTemp + " градусов, нужно надеть шапку.");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №3");
        System.out.println();

        short limitSpeed = (short) 61;

        if (limitSpeed <= 60) {
            System.out.println("Если скорость " + limitSpeed + ", то можно ездить спокойно.");
        }else{
            System.out.println("Если скорость " + limitSpeed + ", то придется заплатить штраф.");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №4");
        System.out.println();

        short yearsOld = (short) 3;

        if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу.");
        } else {
            if (yearsOld <= 24 && yearsOld >= 18) {
                System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет.");
            } else {
                if (yearsOld <= 17 && yearsOld >= 7) {
                    System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
                } else {
                    if (yearsOld <= 6 && yearsOld >= 2) {
                        System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад.");
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №5");
        System.out.println();

        short attractionAge = (short) 16;

        if (attractionAge >= 14) {
            System.out.println("Если возраст ребенка равен " + attractionAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            if (attractionAge < 14 && attractionAge >= 5) {
                System.out.println("Если возраст ребенка равен " + attractionAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                if (attractionAge < 5) {
                    System.out.println("Если возраст ребенка равен " + attractionAge + ", то ему нельзя кататься на аттракционе.");
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №6");
        System.out.println();

        short seatPos = (short) 60;
        short standPos = (short) 42;

        short totalPos = (short) (seatPos + standPos);
        short availableSeatPos = (short) (60 - seatPos);
        short availableStandPos = (short) (42 - standPos);
        boolean avPos = (totalPos < 102);
        boolean avSeatPos = (availableSeatPos > 0);
        boolean avStandPos = (availableStandPos > 0);

        if (avPos) {
            if (avSeatPos && avStandPos) {
                System.out.println("В вагоне есть " + availableSeatPos + " сидячих и " + availableStandPos + " стоячих мест(а).");
            } else {
                if (avSeatPos && !avStandPos) {
                    System.out.println("В вагоне есть " + availableSeatPos + " сидячих мест(а).");
                } else {
                    if (avStandPos && !avSeatPos) {
                        System.out.println("В вагоне есть " + availableStandPos +" стоячих мест(а).");
                    }
                }
            }
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------

        System.out.println("Задача №7");
        System.out.println();

        int one = 2;
        int two = 3;
        int three = 4;

        boolean numbDiff = (one != two && two != three && three != one);
        if (numbDiff) {
            if (one > two && one > three) {
                System.out.println("Первое число (" + one + ") самое большое.");
            } else {
                if (two > three && two > one) {
                    System.out.println("Второе число (" + two + ") самое большое.");
                } else {
                    if (three > one && three > two) {
                        System.out.println("Третье число (" + three + ") самое большое.");
                    }
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------
    }
}