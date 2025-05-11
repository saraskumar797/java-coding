import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {
    public static void main(String[] args){

       // reverseString();
       // reverseStringByString();
        reverseEachWordOfString();
        sortListOfStringInIncreasingOrder();
    }

    private static void sortListOfStringInIncreasingOrder() {
        List<String> list = Arrays.asList("String","Java","Pro","Sort");

       List<String> result = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(result);

    }

    private static void reverseEachWordOfString() {
        String input = "String Java Program";
       String result = Arrays.stream(input.split(" "))
                .map(str->new StringBuffer(str).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }

    private static void reverseStringByString() {
        String input = "Java String Reverse";
       String result = IntStream.range(0,input.length())
                .mapToObj(i->input.charAt(input.length()-i-1))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(result);
    }

    private static void reverseString() {
        String str = "Vijay Rajput";
        int n= str.length();
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
       for(int i=n-1;i>=0;i--){
           sb.append(arr[i]);
       }

        System.out.println(sb.toString());

    }
}
