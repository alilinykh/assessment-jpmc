public class main {
    public static void main(String[] args) {
        SmileyFaces smileyFaces = new SmileyFaces();

        String[] strings = {":((","i am sick today (:()","(:)","(message) (another message)",")(", ":()()"};
        for (String s: strings
             ) {
            System.out.println(smileyFaces.checkString(s));
        }
    }


}
