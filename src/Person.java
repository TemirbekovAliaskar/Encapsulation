import java.time.LocalDate;

public class Person {
    String name;
    String lastName;
    LocalDate yearOfBirth;


    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setYearOfBirth(LocalDate yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public LocalDate getYearOfBirth(){
        return yearOfBirth;
    }
}
