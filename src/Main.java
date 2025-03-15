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

        shining.setYear(1996);

        System.out.println(greenMile.getTitle() + ", " + greenMile.getYear() + " - " + greenMile.getAuthor().getFirstName() + " " + greenMile.getAuthor().getLastName());
        System.out.println(shining.getTitle() + ", " + shining.getYear() + " - " + shining.getAuthor().getFirstName() + " " + shining.getAuthor().getLastName());
        System.out.println(hourglass.getTitle() + ", " + hourglass.getYear() + " - " + hourglass.getAuthor().getFirstName() + " " + hourglass.getAuthor().getLastName());
        System.out.println(playToLive.getTitle() + ", " + playToLive.getYear() + " - " + playToLive.getAuthor().getFirstName() + " " + playToLive.getAuthor().getLastName());
        System.out.println(wayOfShaman.getTitle() + ", " + wayOfShaman.getYear() + " - " + wayOfShaman.getAuthor().getFirstName() + " " + wayOfShaman.getAuthor().getLastName());

    }
}