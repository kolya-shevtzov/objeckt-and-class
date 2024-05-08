public class Book {
   private String name;
    private int date;
    public Book(String name,int date)
    {
        this.name=name;
        this.date=date;

    }
public String getName(){
        return this.name;
}
    public int getDate(){
        return this.date;}
public void setDate(int date){
        this.date= date;
}

}
