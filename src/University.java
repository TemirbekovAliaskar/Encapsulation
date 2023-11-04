import java.time.LocalDate;
import java.util.Locale;

public class University
{

    String nameUniver;
    String country;
    LocalDate yearofBirth;
    String adress;

    public void setNameUniver(String nameUniver){
        this.nameUniver = nameUniver;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setYearofBirth(LocalDate yearofBirth){
        this.yearofBirth = yearofBirth;
    }
    public void setAdress(String adress){
        this.adress = adress;

    }
    public String getNameUniver(){
        return nameUniver;
    }
    public String getCountry(){
        return country;
    }
    public LocalDate getYearofBirth(){
        return yearofBirth;
    }
    public String getAdress(){
        return adress;
    }
}
