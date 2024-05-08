public class Main {

    public static void main(String[] args) {

        Author Puskin=new Author("Александр","Пушкин");
        System.out.println(Puskin.getAuthor()+" "+Puskin.getAuthor2());
        Author Lermantov=new Author("Михаил","Лермантов");
        System.out.println(Lermantov.getAuthor()+" "+Lermantov.getAuthor2());

        Book bookPuskin=new Book("евгений онегин",1830);
        System.out.println(bookPuskin.getName());
        Book bookLermantov=new Book("смерть поэта ",1837);
        System.out.println(bookLermantov.getDate());
        bookPuskin.setDate(1831);
        System.out.println("bookPuskin.getDate() = " + bookPuskin.getDate());


    }
}