public class Car {
   private String model;
    private String brant;
     private int maxTez;

    public Car (){

    }
    public Car (String model,String brant , int maxTez){
        this.model = model;
        this.brant = brant;
        this.maxTez = maxTez;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrant() {
        return brant;
    }

    public void setBrant(String brant) {
        this.brant = brant;
    }
    public int getMaxTez (){
        return maxTez;

    }
    public void setMaxTez(int maxTez){
        this.maxTez = maxTez;
    }
}
