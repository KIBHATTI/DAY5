package Trading;
//import Electronics.AirConditioner;
import Electronics.*;
import Company.Acquarium;

interface Trade1
{
    public void doTrading(AirConditioner ac,Toys t,Acquarium acq);
}
public class Trade implements Trade1
{
    @Override
    public void doTrading(AirConditioner ac,Toys t,Acquarium acq)
    {
        System.out.println("in do trading");
    }
}

