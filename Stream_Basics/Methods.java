package Stream_Basics;

import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {
        //filter(predicate)
        //boolean value function
        //e->{e>10}
        


        //map
        //each element operation ex: every element square

List<String> names=List.of("Rahul","Raj","Kunal","Karan","Shivam");
List<String>  newNames  = names.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
System.out.println(newNames);




List<Integer> numbers=List.of(23,4,66,5,7,78,67);
List<Integer> newList=numbers.stream().map(i->i*i).collect(Collectors.toList());
System.out.println(newList);


//for each example
names.forEach(e->{
    System.out.println(e);
});
newNames.stream().forEach(System.out::println);

//sorted

numbers.stream().sorted().forEach(System.out::println);

//min

Integer integer=numbers.stream().min((x,y)->x.compareTo(y)).get();
System.out.println("MInimum: "+integer);

//max
Integer integer2=numbers.stream().max((x,y)->x.compareTo(y)).get();
System.out.println("Maximum : " +integer2);
    }
}
