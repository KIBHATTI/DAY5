package Human;
import Transport.Vehicle;

import Electronics.Laptop;
import Examination.Exam;
import Library.*;
import Classroom.*;

public class Student extends Man implements Book,Study
{
    //TwoWheeler twoWheelerObj = new TwoWheeler();
    String studentName;
    public String typeOfVehicle;
    String whichLaptop1;
    String nameOfbook;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public String readBook(String bookName) {
        this.nameOfbook = bookName;
        System.out.println("Reading  Book "+bookName);
        return nameOfbook;
    }
    @Override
    public void doStudying()
    {
        System.out.println("Student are studying");
    }
}
