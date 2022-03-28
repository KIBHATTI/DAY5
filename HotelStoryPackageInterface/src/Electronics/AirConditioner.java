package Electronics;

public class AirConditioner {
    private String acBrand;
    private float acPrice;
    private int setTemp;

    public AirConditioner(String acBrand,float acPrice,int setTemp) {
        this.acBrand = acBrand;
        this. acPrice = acPrice;
        this. setTemp = setTemp;

    }
//    void setACdetails(String a,float b,int c)
//    {
//        String acBrand=a;
//        float acPrice=b;
//        int setTemp=c;
//    }
    public void printACDetails()
    {
        System.out.println("nameof aC is "+acBrand);
        System.out.println("price of Ac is "+acPrice);
        System.out.println("set Temp to "+setTemp);
    }

    public String getAcBrand() {
        return acBrand;
    }

    public void setAcBrand(String acBrand) {
        this.acBrand = acBrand;
    }

    public float getAcPrice() {
        return acPrice;
    }

    public void setAcPrice(float acPrice) {
        this.acPrice = acPrice;
    }

    public int getSetTemp() {
        return setTemp;
    }

    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }


}
