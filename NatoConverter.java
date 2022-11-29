
public  abstract class NatoConverter{
    private final static  String[] alphabetLower = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    //private static String[] alphabetUpper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private final static String[] natoAlphabet = {"alpha","bravo","charlie","delta","echo","foxtrot","golf","hotel","india","juliett","kilo","lima","mike","november","oscar","papa","quebec","romeo","sierra","tango","uniform","victor","whiskey","xRay","yankee","zulu"};

    

    public static String toNato(String phrase){
        phrase = phrase.toLowerCase();
        String result ="";

        for(int i =0; i<phrase.length();i++){
            String check = String.valueOf(phrase.charAt(i));
            if(check.equals(" ")){
                result +=" ";
                continue;
            }
            for(int j =0; j<alphabetLower.length;j++){
                if(check.equals(alphabetLower[j])){
                    result +=natoAlphabet[j];
                }
            }
        }
        return result;
    }

    public static boolean checkTranslation(String alphabetPhrase, String natoPhrase){

            if(!toNato(alphabetPhrase).replaceAll(alphabetPhrase, natoPhrase).equals(natoPhrase)){
                return false;
            }      
        return true;
    }
        
    }