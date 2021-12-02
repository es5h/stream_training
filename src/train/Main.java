package train;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static int count(String number){
        return number.length() - number.replaceAll("3","").replaceAll("6","").replaceAll("9","").length();
    }

    private static String isClapped(Integer num){
        String number = num.toString();

        if(number.contains("3") || number.contains("6") || number.contains("9") )
            return new String(new char[count(number)]).replace("\0", "짝");

        return number;
    }

    public static void main(String[] args) {
        List<String> list = IntStream.range(1, 334).mapToObj(Main::isClapped).collect(Collectors.toList());
        System.out.println(list);
    }
}

