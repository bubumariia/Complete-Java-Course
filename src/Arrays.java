
public class Arrays {

    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[4];
        System.out.println("=======What do we have inside the array when we didn't assign anything to it?");
        System.out.println("Elements "+ arrayOfIntegers[0] + " "+ arrayOfIntegers[1]+" "+ arrayOfIntegers[2]+ " "+ arrayOfIntegers[3]);
        arrayOfIntegers[0] = 100;
        arrayOfIntegers[1] = 90;
        arrayOfIntegers[2] = 80;
        arrayOfIntegers[3] = 70;
        System.out.println("======Printing integers array after assigning values to the elements");
        System.out.println("Elements "+ arrayOfIntegers[0] + " "+ arrayOfIntegers[1]+" "+ arrayOfIntegers[2]+ " "+ arrayOfIntegers[3]);
        //arrayOfIntegers[4] = 60;
        String[] arrayOfStrings = new String[4];
        System.out.println("=======Printing string array before assigning anything to it ");
        System.out.println("Elements of string array: "+ arrayOfStrings[0]+" "+ arrayOfStrings[1]+" "+ arrayOfStrings[2]+" "+ arrayOfStrings[3]);
        arrayOfStrings[0] = "AAA";
        arrayOfStrings[1] = "BBB";
        arrayOfStrings[2] = "CCC";
        arrayOfStrings[3] = "DDD";
        System.out.println("=======Elements of string array after assigning values to them ");
        System.out.println("Elements of string array: "+ arrayOfStrings[0]+" "+ arrayOfStrings[1]+" "+ arrayOfStrings[2]+" "+ arrayOfStrings[3]);
        int[] intStaticArray = {
                100,
                90,
                80,
                70
        };
        System.out.println("---Printing static declared array of integers: "+ intStaticArray[0]+ " "+ intStaticArray[1]+ " "+ intStaticArray[2]+" "+ intStaticArray[3]);
        int[] intStaticArray2 = new int[]{100, 90, 80, 70};
        System.out.println("Elements from the second static array declaration: "+ intStaticArray2[0]+" "+ intStaticArray2[1]+" "+ intStaticArray2[2]+" "+ intStaticArray2[3]);

        String[] staticDeclarationArrayString = {"AAA","BBB", "CCC", "DDD"};
        System.out.println("Static declaration array (first method): "+ staticDeclarationArrayString[0]+" "+ staticDeclarationArrayString[1]+" "+staticDeclarationArrayString[2]+" "+ staticDeclarationArrayString[3]);
        String[] staticDeclarationArrayString2 = new String[]{"AAA", "BBB","CCC","DDD"};
        System.out.println("Static declaration array of strings: "+ staticDeclarationArrayString2[0]+" "+staticDeclarationArrayString2[1]+" "+ staticDeclarationArrayString2[2]+" "+ staticDeclarationArrayString2[3]);
        System.out.println("Number of elements from staticDeclarationArrayString2 "+ staticDeclarationArrayString2.length);
        String[] stringArrayAnimals = {"Lion","Dog", "Tiger", "Cow", "Cat"};
        System.out.println("Number of elements from the stringArrayAnimals "+ stringArrayAnimals.length);
        //String[] nullArray = null;
        //System.out.println("Trying to call the length property on nullArray "+ nullArray.length);
    }
}
