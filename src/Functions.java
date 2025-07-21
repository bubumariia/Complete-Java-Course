public class Functions {
    public static void main(String[] args) {
        Functions functions = new Functions();
        int sumOfThreeNumbers = functions.addThreeNumbers(23,45,56);
        System.out.println("Sum of three numbers is "+ sumOfThreeNumbers);

        int staticSum = functions.staticAddingThreeNumbers(23,123,434);
        System.out.println("Sum of three numbers is "+ staticSum);
    }


    public int addThreeNumbers(int a, int b, int c){
        return a+b+c;
    }

    public static int staticAddingThreeNumbers(int x, int y, int z){
        return x+y+z;
    }

}
