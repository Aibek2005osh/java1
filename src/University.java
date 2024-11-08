public class University {
    private String univerName;
    private String univerDerektor;
    private int univerYear;

    public University(){
    }
    public University(String univerName, String univerDerektor,int univerYear){
        this.univerName = univerName;
        this.univerDerektor = univerDerektor;
        this.univerYear = univerYear;


    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public String getUniverDerektor() {
        return univerDerektor;
    }

    public void setUniverDerektor(String univerDerektor) {
        this.univerDerektor = univerDerektor;
    }

    public int getUniverYear() {
        return univerYear;
    }

    public void setUniverYear(int univerYear) {
        this.univerYear = univerYear;
    }
}
