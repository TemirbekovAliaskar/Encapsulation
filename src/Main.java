import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {


        University university1 = new University();
        University university2 = new University();
        University university3 = new University();

        School school1 =new School();
        School school2 = new School();
        School school3 = new School();

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();


        university1.setNameUniver("KGTU");
        university1.setCountry("Kyrgyzstan");
        university1.setYearofBirth(LocalDate.of(1950,2,3));
        university1.setAdress("Ahunbaeva №3");

        university2.setNameUniver("ITMO");
        university2.setCountry("Russia");
        university2.setYearofBirth(LocalDate.of(1860,11,3));
        university2.setAdress("Lenina №23");

        university3.setNameUniver ( "Garward");
        university3.setCountry ( "UK");
        university3.setYearofBirth(LocalDate.of(1780,6,3));
        university3.setAdress ("London №111");


        //////////////////Schoolstar////////////////
        school1.setNameSchool("Seitek");
        school1.setAdressSchool ( "Magistra");
        school1.setDirector ("Jigit Turumbekov");

        school2.setNameSchool( "Creative");
        school2.setAdressSchool ("7 Aprel");
        school2.setDirector  ("Aliaskar Temirbekov");

        school3.setNameSchool("AUSA");
        school3.setAdressSchool ("Dordoi 222");
        school3.setDirector ("Urmat Toichikov");

        ////////////////Cars///////////////////
        car1.setNameMark( "Toyota");
        car1.setNameModel ("CROWN");
        car1.setCountry("Japan");
        car1.setYearOfCar(LocalDate.of(2020,3,2));

        car2.setNameMark( "Mersedes");
        car2.setNameModel ("W-210");
        car2.setCountry("Europa");
        car2.setYearOfCar(LocalDate.of(2007,8,2));

        car3.setNameMark ( "Lexux");
        car3.setNameModel( "LX - 600");
        car3.setCountry( "USA");
        car3.setYearOfCar(LocalDate.of(2023,7,2));

        /////////////////Person////////////////
        person1.setName("Aliaskar");
        person1.setLastName( "Temirbekov");
        person1.setYearOfBirth(LocalDate.of(2003,6,14));

        person2.setName( "Janybek");
        person2.setLastName( "Shapetov");
        person2.setYearOfBirth( LocalDate.of(1967,6,14));

        person3.setName( "Azim");
        person3.setLastName( "Bekov");
        person3.setYearOfBirth( LocalDate.of(2006,3,24));


        University [] universities ={university1,university2,university3};
        School [] schools = {school1,school2,school3};
        Car [] cars = {car1,car2,car3};
        Person [] people = {person1,person2,person3};


        // University

        System.out.println("\n<---++++++ UNIVERSITY +++++++--->");
        for (University unik :universities){
            System.out.println(STR."""

                         <<University Info>>
                    Name Univer  : \{unik.getNameUniver() }
                    Coutry   : \{unik.getCountry()}
                    Data    : \{unik.getYearofBirth()}
                    Address    : \{unik.getAdress()}
                    """);
        }

        //  School

        System.out.println("<---++++++ SCHOOL +++++++--->");
        for (School sch : schools){
            System.out.println(STR."""

                            <<School INFO>>
                    Name School :  \{sch.getNameSchool()}
                    Name adressSchool :  \{sch.getAdressSchool()}
                    Name director :  \{sch.getDirector()}

                    """);

        }


        System.out.println("<---+++++++ CARS ++++++--->");
        for (Car ca : cars){
            System.out.println(STR."""

                          <<<<CARS INFO>>>>
                    Name marka :  \{ca.getNameMark()}
                    Name model :  \{ca.getNameModel()}
                    Coutry  :  \{ca.getCountry()}
                    Data year  :  \{ca.getYearOfCar()}
                    """);
        }

        System.out.println("<---++++++ PERSON ++++++--->");
        for (Person pers : people){
            System.out.println(STR."""

                         <<<<PERSON>>>>
                    Name  : \{pers.getName()}
                    Last Name  : \{pers.getLastName()}
                    Year of birth : \{pers.getYearOfBirth()}

                    """);
        }






    }
}