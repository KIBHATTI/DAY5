import Electronics.AirConditioner;
import Entertainment.Amphitheatre;
import Entertainment.Movie;
import Entertainment.Music;
import Restaurant.*;
import Electronics.*;
import Examination.Exam;
import Examination.ReportCard;
import Human.*;
import Trading.*;
import Company.Acquarium;

public class HotelMain
{
    public static void main(String[] args)
    {

        Man manObj = new Man();
        manObj.colorOf("Blue");


        Student studentObj = new Student();
        studentObj.readBook("Lord of the Rings");
        studentObj.doStudying();
//EXAM,laptop,result,reportCard

        //works
//        Exam examObj = new Exam("ku","DEll");
//        System.out.println(examObj);

        Laptop lpObj = new Laptop("Lenovo");
        ReportCard rcObj = new ReportCard();

        Exam examObj = new Exam("ku",lpObj);
        System.out.println(examObj);
        examObj.giveReportCard(rcObj);

//Company,Restaurant,KFC        //Company

        RestaurantFeatures restaurant = new RestaurantFeatures("Eat Palaza");
        Company comObj = new Company(3);
        comObj.manageBranches();
        restaurant.bookTable(2);
        Gas gasObj = new Gas();

        GasBill gbObj = new GasBill(gasObj);


        RestaurantFeatures resObj = new RestaurantFeatures();
        Order orderMainObj = resObj.orderFood(123);
        Food foodObj = resObj.prepareFood(orderMainObj);
        System.out.println("foodname is "+ foodObj.getFoodName());
        resObj.giveFeedback1(3);

        KFC kfcObj = new KFC();
        kfcObj.bookTable(1);
        //System.out.println("Bookoed tabled in KFC "+kfcObj);
        Order orderKFCMainObj =  resObj.orderFood(4332);
        Food foodKFCObj = new Food(orderKFCMainObj);
        System.out.println("KFC food name if "+foodKFCObj.getFoodName());

        AirConditioner acObj = new AirConditioner("samsung",40000,23);
        acObj.printACDetails();

        Toys toyObj = new Toys("TeddyBear");
        Acquarium acquarium = new Acquarium();
        Trade tradeObj = new Trade();
        tradeObj.doTrading(acObj,toyObj,acquarium);

        Music music= new Music("Rock");
        Movie mObj = new Movie("Hero");

        Amphitheatre ampObj = new Amphitheatre();
        ampObj.functions(music,mObj);

    }
}
