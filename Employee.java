class Employee {
    String name, id, address, mailId, mobileNo;

    Employee(String name, String id, String address, String mailId, String mobileNo) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    void display() {
        System.out.println("Name      : " + name);
        System.out.println("ID        : " + id);
        System.out.println("Address   : " + address);
        System.out.println("Mail ID   : " + mailId);
        System.out.println("Mobile No : " + mobileNo);
    }
}

class Programmer extends Employee {
    Programmer(String name, String id, String address, String mailId, String mobileNo) {
        super(name, id, address, mailId, mobileNo);
    }

    void work() {
        System.out.println("Designation: Programmer");
    }
}

class AssistantProfessor extends Programmer {
    AssistantProfessor(String name, String id, String address, String mailId, String mobileNo) {
        super(name, id, address, mailId, mobileNo);
    }

    void work() {
        System.out.println("Designation: Assistant Professor");
    }
}

class AssociateProfessor extends AssistantProfessor {
    AssociateProfessor(String name, String id, String address, String mailId, String mobileNo) {
        super(name, id, address, mailId, mobileNo);
    }

    void work() {
        System.out.println("Designation: Associate Professor");
    }
}

class Professor extends AssociateProfessor {
    Professor(String name, String id, String address, String mailId, String mobileNo) {
        super(name, id, address, mailId, mobileNo);
    }

    void work() {
        System.out.println("Designation: Professor");
    }
}

public class Main {
    public static void main(String[] args) {

        Programmer p = new Programmer(
            "Arun", "P101", "Chennai",
            "arun@gmail.com", "9876543210"
        );

        AssistantProfessor ap = new AssistantProfessor(
            "Bala", "AP102", "Madurai",
            "bala@gmail.com", "9876543211"
        );

        AssociateProfessor aop = new AssociateProfessor(
            "Chitra", "ASP103", "Coimbatore",
            "chitra@gmail.com", "9876543212"
        );

        Professor prof = new Professor(
            "David", "P104", "Salem",
            "david@gmail.com", "9876543213"
        );

        System.out.println("----- Programmer -----");
        p.display();
        p.work();

        System.out.println("\n----- Assistant Professor -----");
        ap.display();
        ap.work();

        System.out.println("\n----- Associate Professor -----");
        aop.display();
        aop.work();

        System.out.println("\n----- Professor -----");
        prof.display();
        prof.work();
    }
}
