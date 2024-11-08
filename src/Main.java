import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Aibek"); person1.setSourName("duisho uulu"); person1.setAge(19);

        Person person2 = new Person();
        person2.setName("Amir");  person2.setSourName("Altumushev"); person2.setAge(18);

        Person person3 = new Person();
        person3.setName("baiel"); person3.setSourName("Karabaev"); person3.setAge(19);


        Car car1 = new Car("BMW", "m5", 390);
        Car car2 = new Car("MERCEDES", "G63", 290);
        Car car3 = new Car("AUDI", "audi80", 220);

        School school1 = new School("Арык-бою","I Tolgonai",1998);
         School school2 = new School("T Kulatov","Manzura",1960);
         School school3 = new School("Number 4","A Altumushev",2025);

       University university1 = new University();
       university1.setUniverName("KGZ"); university1.setUniverDerektor("D.Aibek"); university1.setUniverYear(2000);

       University university2 = new University();
       university2.setUniverName("KAZ"); university2.setUniverDerektor("A.Amir"); university2.setUniverYear(1990);

       University university3 = new University();
       university3.setUniverName("UZB"); university3.setUniverDerektor("K.Baiel"); university3.setUniverYear(2010);

        System.out.println("🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓🤓");
            Person[] persons = {person1, person2, person3};
            for (Person p : persons) {
                System.out.println("Nane : " + p.getName() + "\nsourName : "
                        + p.getSourName() + "\nage : " + p.getAge());}

        System.out.println("🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘🚘");

                Car[] cars = {car1, car2, car3};
                for (Car c : cars) {
                System.out.println("Model : "+c.getModel() + "\nBrant : " +c.getBrant() +
                        "\nMaxTez : "+c.getMaxTez()  );}

        System.out.println("🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢🏢");
            School [] schools = {school1,school2,school3};
            for (School s:schools){
                System.out.println("ShoolName : "+s.getSchoolName() + "\nShoolDerektor : "+s.getShoolderektor()+
                        "\nShoolYesr : " +s.getShoolYear());
            }
        System.out.println("🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬🏬");
            University [] universities = {university1,university2,university3};
            for (University u:universities){
                System.out.println("UnverName : "+u.getUniverName() +
                        "\nUnverDerektor : " +u.getUniverDerektor()+ "\nunverYear : "+ u.getUniverYear());
            }

    }
}