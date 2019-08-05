public class SmileyFaces {
    public  String checkString (String input) {
        String result;

        char[]lineArray = input.toCharArray();
        int paren = 0;
        int theses = 0;
        int smiley = 0;
        int frowney = 0;


        for(int i = 0; i < lineArray.length;i++) {

            if(lineArray[i] == ')') {
                theses++;
                if ((i != 0) && (lineArray[i-1] == ':')) { // --> try evaluate if it smiley face of just : ( )
                    smiley++;
//                    theses--;
                }
                if(theses - smiley > paren) { return "NO";} //check for )(
            }

            if(lineArray[i] =='(') {
                paren++;
                if ((i != 0) && (lineArray[i-1] == ':')) {
                    frowney++;
//                    paren--;
                }

            }
        }

        if(paren - frowney <= theses ) {result = "YES";}
        else {result = "NO";}

        return result;
    }
}
