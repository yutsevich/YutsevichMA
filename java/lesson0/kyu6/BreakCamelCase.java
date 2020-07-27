package lesson0.kyu6;

public class BreakCamelCase {

    public static String camelCase(String input) {
        StringBuilder output = new StringBuilder();
        String temp = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == temp.charAt(i)){
                output.append(input.charAt(i));
            } else{
                output.append(" ").append(input.charAt(i));
            }
        }
        return String.valueOf(output);
    }
}
