public class School {
    private String schoolName;
    private String shoolderektor;
    private int shoolYear;

    public School (){

    }
    public School(String schoolName , String shoolderektor, int shoolYear){
        this.schoolName = schoolName;
        this.shoolderektor =shoolderektor;
        this.shoolYear = shoolYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getShoolderektor() {
        return shoolderektor;
    }

    public void setShoolderektor(String shoolderektor) {
        this.shoolderektor = shoolderektor;
    }

    public int getShoolYear() {
        return shoolYear;
    }

    public void setShoolYear(int shoolYear) {
        this.shoolYear = shoolYear;
    }
}
