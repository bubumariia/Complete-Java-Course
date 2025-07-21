

public class Strings {

    public static void main(String[] args){
        char charVariable ='a';
        char[] charArray = {'a', 'b', 'c', 'd'};
        String charString ="abcd";
        String secondCharString ="abcd";
        System.out.println(charArray);
        System.out.println(charString);
        System.out.println("=====================EQUALS====================");
        System.out.println("Comparison between charString and secondCharString  " +charString.equals(secondCharString));
        System.out.println("Comparison between charString and secondCharString  " +(charString==secondCharString));
        charString = charString +"e";
        System.out.println("My modified charString "+ charString);
        System.out.println("The secondChar string is "+ secondCharString);
        System.out.println("Comparison between charString and secondCharString  " +charString.equals(secondCharString));
        System.out.println("Comparison between charString and secondCharString  " +(charString==secondCharString));
        System.out.println("Comparison between charString and secondCharString by using another method (compareTo)  " + charString.compareTo(secondCharString));
        System.out.println("=====================CONCATENATION====================");
        charString = charString + "f";
        System.out.println("charString "+charString);
        charString = 40+10 +charString + (40+10) + 40+10;
        System.out.println("charString concatenation with numbers "+ charString);
        charString = charString.concat("lll");
        System.out.println("charString concatenation by using the concat function "+ charString);
        charString = String.join(" i love programming ", "a","b", "c");
        System.out.println("charString by using String.join "+ charString);
        System.out.println("=====================SUBSTRING====================");
        String substringExample = "Hello world!";
        String helloString = substringExample.substring(0, 5);
        System.out.println("Hello string "+ helloString);
        String worldGotFromTheFunctionWithOneParam = substringExample.substring(6);
        System.out.println("the second string we got with substring function "+ worldGotFromTheFunctionWithOneParam);
        String helloStringWithoutExclamationSign = substringExample.substring(6,11);
        System.out.println("hello without exclamation sign: "+ helloStringWithoutExclamationSign);

        System.out.println("=====================SPLIT====================");
        String listOfAnimals = "snake,lion,tiger,monkey";
        String[] arrayStrings = listOfAnimals.split(",");
        for (int i =0 ;i<arrayStrings.length;i++){
            System.out.println(arrayStrings[i]);
        }
        System.out.println("=====================toLowerCase/toUpperCase====================");
        String element = "City of Life";
        System.out.println("element transformed to uppercase letters: "+ element.toUpperCase());
        System.out.println("element transformed to lowercase letters "+ element.toLowerCase());
        System.out.println("How many characters are in the element string "+ element.length());
        System.out.println("=====================charAt====================");
        System.out.println("letter on the position eleven: "+ element.charAt(11));
        System.out.println("letter on the position 0: "+ element.charAt(0));

        System.out.println("=====================replace====================");
        String replacedString = element.replace("of", "that gives you");
        System.out.println("replaced string: "+ replacedString);
        System.out.println("element string: "+ element);
        System.out.println("=====================String buffer aka mutable string====================");
        StringBuffer stringBuffer = new StringBuffer("Mutable string ");
        StringBuffer stringBuffer2 = stringBuffer.append(" StringBuffer");
        System.out.println("stringBuffer variable: \""+ stringBuffer +"\" stringBuffer2 variable: \""+ stringBuffer2+"\"");
        String stringExample = "Immutable string ";
        String stringExample2 = stringExample.concat(" String");
        System.out.println("stringExample variable \""+ stringExample+ "\" stringExample2 variable \""+ stringExample2+ "\"");
        stringBuffer.delete(0, 3);
        System.out.println("After delete: "+stringBuffer);
        stringBuffer.insert(3,"=========");
        System.out.println(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder("sdfsdf");
        System.out.println("String builder "+ stringBuilder);
    }
}
