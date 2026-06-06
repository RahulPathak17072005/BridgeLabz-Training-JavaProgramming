package Stream_Basics;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //Stream Api- collection process also Group of object like Array, List etc.
       
       //1- Blank Stream
        Stream<Object> emptyStream=Stream.empty();
        // emptyStream.forEach(e->{
        //     System.out.println(e);
        // }
        // );

        //2-Array, object, collection
        String name[]={"Rahul","Kunal","Shivam"};
        Stream<String> stream1=Stream.of(name);
        System.out.println(stream1);
        stream1.forEach(e-> {
            System.out.println(e);
        });


        //3- Using the builder
        Stream<Object> streamBuilder=Stream.builder().build();
        Arrays.stream(new int[]{2,4,65,3,3});

           //4 IntStream
        IntStream stream=Arrays.stream(new int[]{2,3,65,3,564});
        stream.forEach(e->System.out.println(e));

        //5 - Collection
        
    }
}
