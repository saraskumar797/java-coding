import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstUniqueCharacter {

    public static String findLongestString(String[] strings) {

       return Arrays.stream(strings).sorted((s1,s2)->{
            return s2.length() - s1.length();
        }).findFirst().orElse(null);

//        return Arrays.stream(strings)
//                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
//                .orElse(null);
    }

    public static void main(String[] args) {
//        String[] input = {"Milind", "Mehta", "follow", "java8", "Microservice", "Springboot"};
//        String longestString = findLongestString(input);
//        System.out.println(longestString);
        List list = Arrays.asList(1,2);
        List numlist = list;
        numlist.add(3.14);

    }
}
