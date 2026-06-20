class Person{

    String name;
    Integer age;
    String email;
    String address;
    public Person(String name, int age, String email, String address){
        this.name = name;
        this.age=age;
        this.email=email;
        this.address= address;
    }

    @Override
    public String toString(){
        return " \n \t  -- Name: "+this.name+ " Age: "+this.age+" Email: "+ this.email + "Address: "+ this.address;
    }
}