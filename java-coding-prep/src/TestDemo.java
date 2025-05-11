import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo {

   public static void main(String[] args){
      String  input="Harness Managed Pipline should be improved";
      String output="harness managed pipline Should Be Improved";

      inerversionOfFirstChar(input);

      febonacciSearies();



   }

    private static void febonacciSearies() {

        Stream.iterate(new int[]{0,1},arr->new int[]{arr[1],arr[0] + arr[1]})
                .limit(10)
                .map(arr->arr[0])
                .forEach(System.out::println);
    }

    private static void inerversionOfFirstChar(String input) {

      String result = Arrays.stream(input.split(" "))
              .map(word -> {
                 if (word.isEmpty()) return word;

                 char firstChar = word.charAt(0);
                 char toggled = Character.isUpperCase(firstChar)
                         ? Character.toLowerCase(firstChar)
                         : Character.toUpperCase(firstChar);

                 return toggled + word.substring(1);
              })
              .collect(Collectors.joining(" "));

      System.out.println("Converted: " + result);
}
}