import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test{
    public static void main(String argsp[]){
        
        // Creating obj for class

        List<Person> person = Arrays.asList(
            new Person("kalai", 39, "kalai@gmail.com", "usa"),
            new Person("guru", 40, "guru@gmail.com", "chennai"),
            new Person("thomas", 39, "thomas@gmail.com", "virudhunagar"),
            new Person("senthil", 44, "senthil@gmail.com", "chennai"),
            new Person("divya", 30, "divya@gmail.com", "chennai"),
            new Person("guna", 17, "guna@gmail.com", "delhi"),
            new Person("jhon", 16, "jhon@gmail.com", "mumbai")
        );

        List<Person>filteredByCity = person.stream()
        .filter(elm->elm.address.equals("chennai")).collect(Collectors.toList());
        

        List<Person> filterByAdult = person.stream()
        .filter(elm->elm.age >18).collect(Collectors.toList());

        System.out.println(filteredByCity.toString());
        System.out.println(filterByAdult.toString());
    }
}