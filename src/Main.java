import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Book[] books = new Book[20];
    public static Scanner scanner = new Scanner(System.in);
    static void available(){
        System.out.println("AVAILABLE");
        Scanner in = new Scanner(System.in);
        for(Book b : books){
            if(b == null || b.getIsCheckedOut()) {
                continue;
            }
            System.out.printf("%d - %s, %s\n",b.getId(),b.getTitle(), b.isbn);
        }
        String command = "start";
        while(command != "X"){
            System.out.println("""
                               enter ID of book to checkout or, 
                               blank line to exit this screen
                               """);
            System.out.println("command length: " + command.length());
            //command = scanner.nextLine().trim();
            command = in.next();
            System.out.println("command: length:" + command.length());
            if(command.equals("X")){
                break;
            }
            else if(command != "X"){
                //TODO catch error
                int id = Integer.parseInt(command);
                for(Book b: books){
                    if(b.id == id){
                        //TODO remeber the name from the welcome
                        b.checkOut("USER");
                        System.out.println("checked out");
                        break;
                    }
                }
            }
        }

    }
    static void isCheckedOut(){
        System.out.println("CHECKED OUT");
        for(Book b : books){
            if(b == null || !b.getIsCheckedOut()){
                continue;
            }
            System.out.printf("%d - %s, %s\n",b.getId(),b.getTitle(), b.isbn);
        }
    }

    public static void main(String[] args) {
        books[0] = new Book(1,"978-0345317988","The Foundation");
        books[1] = new Book(2,"978-0735211292","Atomic Habits");
        books[2] = new Book(3,"978-0571202287","Animators Survivers Kit");
        books[3] = new Book(4,"978-0679728757","Blood Meridian");
        // available();
        // isCheckedOut();
        int command =  -1;
        while(command != 0) {
            System.out.println("\nMAIN MENU");
            System.out.print("""
                    1 - Show Available Books
                    2 - Show Checked Out Books
                    0 - Exit - closes out of the application
                    """);
             command = scanner.nextInt();
             if(command == 0){
                 break;
             }
            else if (command == 1) {
                //show available plue menu
                 available();
            } else if (command == 2) {
                //show checked out plus menu
                 isCheckedOut();
            } else {
                //no such command
                System.out.println("No such command");
            }
        } //end outer while loop
        System.out.println("Thanks for using the library");
    }
}