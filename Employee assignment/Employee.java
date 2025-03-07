class Employee{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println("-----------------------------------------------------");
    }
}