public class Book {
     int id;
     String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String checkedOutTo;
    public Book(int id, String isbn, String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }

    //getter methods
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public Boolean getIsCheckedOut(){
        return isCheckedOut;
    }
    public String getCheckedOutTo(){
        return checkedOutTo;
    }


    //setter methods
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setIsCheckedOut(Boolean isCheckedOut){
        this.isCheckedOut = isCheckedOut;
    }
    public void setCheckedOutTo(String checkedOutTo){
        this.checkedOutTo = checkedOutTo;
    }
    //unique book methods
    public void checkOut(String name){
        checkedOutTo = name;
        this.isCheckedOut = true;

    }
    public void checkIn(String name){
        checkedOutTo = ""; // clear
        this.isCheckedOut = false;
    }

}
