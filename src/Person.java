public class Person {
    private String name;
    private String sourName;
    private int age ;

    public Person (){

    }
    public Person(String name , String sourName , int age){
        this.name = name;
        this.sourName = sourName;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourName() {
        return sourName;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}