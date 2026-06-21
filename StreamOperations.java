import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
class Person{
    public String name;
    public int age;
    public String email;
    public String city;
    Person(String name, int age, String email, String city) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n\t Values -> name : "+name+ "  Age: "+age+" Email:"+email+" City:"+city;
    }
}

class StreamOperations {
    public static void main(String args[]) {
        List<String> emails = Arrays.asList(
                    "kalai@gmail.com",
                    "neo@gmail.com",
                    "guru@yahoo.com",
                    "mano@outlook.com",
                    "jansy@yahoo.com"
                );


        // COntains and ignore case - there is no built in 
        // You need to convert to lowercase and check contains
        List<String> gmails = emails.stream().filter(
            (email)->email.toLowerCase().contains("gmail.com")
        ).collect(Collectors.toList());
        System.out.println("Gmails : "+gmails.toString());


        // FInd whos age is above 18
        // Creating Person object first
        List<Person> persons = Arrays.asList(
            new Person("kalai", 30, "kalai@gmail.com", "Chennai"),
            new Person("guru", 33, "guru@gmail.com", "Chennai"),
            new Person("Vignesh", 15, "vignesh@gmail.com", "Virudhunagar"),
            new Person("Radha", 10, "Radha@gmail.com", "Virudhunagar"),
            new Person("Jeevi", 8, "Jeevi@gmail.com", "Virudhunagar")
        );
        
        List<Person> above18 = persons.stream().filter(
            (person)->person.age > 18
        ).collect(Collectors.toList());
        System.out.println(" Persons Above 18" + above18.toString());

        // Getting name and age alone in HashMap
        Map<String, Integer> nameAndAge = persons.stream().filter(
            (person)->person.age >18
        ).collect(Collectors.toMap(p->p.name, p->p.age));
        System.out.println(nameAndAge.toString());

        // Just looping through map
        for(var entry : nameAndAge.entrySet()) {
            System.out.println("\n "+entry.getKey()+" : "+entry.getValue());
        }
    }
}
