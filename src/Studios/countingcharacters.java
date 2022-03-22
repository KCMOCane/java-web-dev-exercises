package Studios;

import java.sql.SQLInput;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class countingcharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> CharCounterMap = new HashMap<>();
        String string = "If the product of two terms is zero then common sense" + " says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Please enter a string to search: ");
        Scanner input = new Scanner(System.in);
        string = input.nextLine().toUpperCase(Locale.ROOT);

        char[] stringToSearch = string.toCharArray();

        for (char c : stringToSearch) {
            if(Character.isLetter(c)) {
                if (!CharCounterMap.containsKey(c)) {
                    CharCounterMap.put(c, 1);
                } else {
                    Integer count = CharCounterMap.get(c) + 1;
                    CharCounterMap.put(c, count);

                }
            }
        }
        //System.out.println(CharCounterMap);
        for (Map.Entry<Character, Integer> character : CharCounterMap.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
