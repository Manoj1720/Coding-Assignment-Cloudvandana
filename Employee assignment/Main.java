class Main{
    public static void main(String args[]){

        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(001,"Manoj",500000));
        list.add(new Employee(002,"Yesvanth",600000));
        list.add(new Employee(003,"Abishek",400000));
        list.add(new Employee(004,"Rishi",700000));
        list.add(new Employee(005,"Yuvanesh",800000));

        for(Employee e:list){
            e.displayDetails();
        }

    }
}