package lesson0.kyu7;

public class DnaStrand {

    public static String makeComplement(String dna) {
        if(dna == null){
            return null;
        }

        StringBuilder output = new StringBuilder();

        for (String letter : dna.split("")) {
            switch (letter.charAt(0)) {
                case 'A':
                    output.append("T");
                    break;
                case 'T':
                    output.append("A");
                    break;
                case 'C':
                    output.append("G");
                    break;
                case 'G':
                    output.append("C");
                    break;
                default:
                    output.append(letter.charAt(0));
            }
        }

        return output.toString();
    }
}
