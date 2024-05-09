public class Main {

    public static void main(String[] args) {

        Author Puskin = new Author("Александр", "Пушкин");
        System.out.println(Puskin.getFirstName() + " " + Puskin.getLastName());
        Author Lermantov = new Author("Михаил", "Лермантов");
        System.out.println(Lermantov.getFirstName() + " " + Lermantov.getLastName());

        Book bookPuskin = new Book("Евгений Онегин", 1830, Puskin);
        bookPuskin.setAuthor(Puskin);
        System.out.println(bookPuskin.getName());

        Book bookLermantov = new Book("Смерть поэта", 1830, Lermantov);
        bookLermantov.setAuthor(Lermantov);
        System.out.println(bookLermantov.getDate());

        bookPuskin.setDate(1831);
        System.out.println("bookPuskin.getDate() = " + bookPuskin.getDate());
        System.out.println( bookLermantov);
        System.out.println("bookPushkin.equals(bookPushkin): " + bookPuskin.equals(bookPuskin));
        System.out.println("bookPushkin.equals(bookLermantov): " + bookPuskin.equals(bookLermantov));
        System.out.println(bookLermantov.hashCode());
        System.out.println(bookPuskin.hashCode());
    }
}