public class Main {

    public static void main(String[] args) {
        Author stivenKing = new Author("Стивен", "Кинг");
        Author sergeyNedorub = new Author("Сергей", "Недоруб");
        Author vasiliyMahonenko = new Author("Василий", "Махоненко");
        Author dmitriyRus = new Author("Дмитрий", "Рус");

        Book greenMile = new Book("Зелённая миля", stivenKing, 1996);
        Book shining = new Book("Сияние", stivenKing, 1000);
        Book hourglass = new Book("Песочные часы", sergeyNedorub, 2008);
        Book playToLive = new Book("Играть чтобы жить", dmitriyRus, 2013);
        Book wayOfShaman = new Book("Путь шамана", vasiliyMahonenko, 2013);

        shining.setYear(1977);

        System.out.println(greenMile);
        System.out.println(shining);
        System.out.println(hourglass);
        System.out.println(playToLive);
        System.out.println(wayOfShaman);

    }
}