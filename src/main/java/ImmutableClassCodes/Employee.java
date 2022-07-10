package ImmutableClassCodes;

public final class Employee {

   final String panCardNumber;

    public String getPanCardNumber() {
        return panCardNumber;
    }

    public Employee(String panCardNumber){
        this.panCardNumber = panCardNumber;
    }
}

class immutabledemo{

    public static void main(String[] args) {
        Employee e = new Employee("Hello JAVA");
        String s1 = e.getPanCardNumber();
        System.out.println("val is: " + s1);
    }
}
