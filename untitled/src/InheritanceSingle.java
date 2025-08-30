
class Emplloyee{
    int Emp_id;
    String Emp_name;
    static String Organisation="KIET";

    void details(){
        System.out.println("  Emp ID: " +Emp_id +"\n"+"  Name: "+Emp_name+"\n"+"  Organisation: "+Organisation);
    }
}

class Facultyy extends Emplloyee{
    String Department;
    String subject;
    String Designation;
    void facultyDetails(){
        System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
    }

}

public class InheritanceSingle{
    public static void main(String[] args) {



        Faculty1 f=new Faculty1();
        f.Emp_id=101;
        f.Emp_name="Deepak Kumar";
        f.Department="AIML";
        f.subject="Maths";
        f.Designation="Assitant Professor";

        System.out.println("Details of the Employee are");
        f.details();
        f.facultyDetails();

    }

}
