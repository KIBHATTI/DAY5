package Restaurant;

public class GasBill {
    float amountOfbill;

    public GasBill(Gas g) {
        System.out.println("Gas bill produced");
    }

    float usage()
    {
        System.out.println("aFTER USAGE "+amountOfbill);
        return amountOfbill;
    }
}
