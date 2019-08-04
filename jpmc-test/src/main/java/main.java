public class main {
    public static void main(String[] args) {
        String[] strings = {":((","i am sick today (:()"," (:)","(message) (another message)",")("};
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

        int p = 0;
        int t = 0;

        for(int i = 0; i < lineArray.length;i++) {

            if(lineArray[i] =='(') { paren++;
            t++;
            }

            if(lineArray[i] == ')') { theses++;
            p++;
            }

            if((lineArray[i] == ':') && (i != lineArray.length - 1)) {
                if(lineArray[i+1] == '(' ) { paren--; p--;}
                if(lineArray[i+1] == ')' ) { theses--; t--;}
            }
        }
        if(paren == theses) {result = "YES";}
//        if(paren == p && t == theses) {result = "YES";}
        else {result = "NO";}

        return result;
    }
}
