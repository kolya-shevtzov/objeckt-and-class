public class Main {

    public static void main(String[] args) {

        Author Puskin=new Author("Пушкин");
        System.out.println(Puskin.getAuthor());
        Author Lermantov=new Author("Лермантов");
        System.out.println(Lermantov.getAuthor());

        Book bookPuskin=new Book("евгений онегин",1830);
        System.out.println(bookPuskin.getName());
        Book bookLermantov=new Book("смерть поэта ",1837);
        System.out.println(bookLermantov.getDate());
        bookPuskin.setDate(1831);
        System.out.println("bookPuskin.getDate() = " + bookPuskin.getDate());


    }
}