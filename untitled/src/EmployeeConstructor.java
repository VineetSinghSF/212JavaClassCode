class EmployeeConstructor {
    String name;
    int id;


    //Non-parameterized constructor
    EmployeeConstructor() {
        name = "Vineet Singh";
        id = 102;
    }

    // Parameterized constructor
    EmployeeConstructor(String empName, int empId) {
        name = empName;
        id = empId;

    }

    EmployeeConstructor(EmployeeConstructor obj){
        this.id=obj.id;
        this.name=obj.name;
        System.out.println("Copy Constructor with shallow copy is invoking now!!");
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);

    }

    public static void main(String[] args) {
        // Using non-parameterized constructor
        EmployeeConstructor e1 = new EmployeeConstructor();
        // e1.id=101;
        // e1.name="Vineet Singh";

        // Displaying details
        // System.out.println("Employee 1 (Non-parameterized):");

        e1.displayDetails();

        EmployeeConstructor e2=new EmployeeConstructor();
        // e2.id=102;
        // e2.name="Vishal";

        // Using parameterized constructor
//        EmployeeConstructor e2 = new EmployeeConstructor("Vineet Singh", 103);



        e2.displayDetails();

        System.out.println("----------------------");

        System.out.println("Employee 2 (Parameterized):");
        e2.displayDetails();
    }
}