package train;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static int count(String number){
        return number.length() - number.replaceAll("3","").replaceAll("6","").replaceAll("9","").length();
    }

    private static String isClapped(String number){
        return count(number)>0? new String(new char[count(number)]).replace("\0", "짝"): number;
    } 

    public static void main(String[] args) {
        List<String> list = IntStream.range(1, 334).mapToObj(x->isClapped(String.valueOf(x))).collect(Collectors.toList());
        System.out.println(list);
    }
}

