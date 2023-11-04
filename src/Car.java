import java.time.LocalDate;

public class Car {

    String nameMark;
    String nameModel;
    String country;
    LocalDate yearOfCar;

    public void setNameMark(String nameMark){
        this.nameMark = nameMark;
    }
    public void setNameModel(String nameModel){
        this.nameModel = nameModel;
    }
    public void setCountry (String country){
        this.country = country;
    }
    public void setYearOfCar(LocalDate yearOfCar){
        this.yearOfCar = yearOfCar;
    }

    public String getNameMark(){
        return nameMark;
    }
    public String getNameModel(){
        return nameModel;
    }
    public String getCountry(){
        return country;
    }
    public LocalDate getYearOfCar(){
        return yearOfCar;
    }


}
