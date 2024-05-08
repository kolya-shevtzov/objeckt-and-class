public class Author {
   private String Author;
   private String AuthorLastName;
    public Author(String Author,String AuthorLastName)
    {
        this.Author=Author;
        this.AuthorLastName=AuthorLastName;
    }
    public String getAuthor(){
        return this.Author;
    }
    public String getAuthor2() {
        return this.AuthorLastName;
    }
}
