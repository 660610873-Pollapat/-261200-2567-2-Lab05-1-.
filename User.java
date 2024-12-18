import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    User(String name ,int year,int month,int day){
        this.name = name;
        dob = LocalDate.of(year,month,day);
    }

    User(){
        name = null;
        dob = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getdob(){
        return dob;
    }

    public void displayInfo(){
        System.out.println("User name " + name);
        System.out.println("Date of Birth " + dob);
 }


}
