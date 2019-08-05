import java.util.*;

public class PhoneNumbersIterate {

    public String numbersToLetter(String input) {
        String[] digits = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Queue<String> list = new LinkedList<>();
        list.add("");

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - 48;
            int size = list.size();
            for(int j = 0; j < size; j++) {
                String temp = list.();
                for(int z = 0; z < digits[num].length(); z++) {
                    list.add(temp + digits[num].charAt(z));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : list
             ) {
            sb.append(s + ",");
        }

        return sb.toString();
    }
}
