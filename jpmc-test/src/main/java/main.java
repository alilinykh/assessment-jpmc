public class main {
    public static void main(String[] args) {
        String[] strings = {":((","i am sick today (:()","(:)","(message) (another message)",")("};
        for (String s: strings
             ) {
            System.out.println(checkString(s));
        }
    }

    public static String checkString (String input) {
        String result;

        char[]lineArray = input.toCharArray();
        int paren = 0;
        int theses = 0;

        for(int i = 0; i < lineArray.length;i++) {

            if(lineArray[i] == ')') {
                theses++;
                if ((i != 0) && (lineArray[i-1] == ':')) {
                    theses--;
                }
                if(theses > paren) { break;} //check for )(
            }

            if(lineArray[i] =='(') {
                paren++;
                if ((i != 0) && (lineArray[i-1] == ':')) {
                    paren--;
                }

            }
        }

        if(paren == theses) {result = "YES";}
        else {result = "NO";}

        return result;
    }
}
