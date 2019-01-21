clas HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("This line is in develop branch");
        System.out.println("Change 2 in develop branch")
    }

    public static boolean isOdd(int num){
        //A function in VT-feature
        return num%2 == 1 ? true : false; 
    }

    public static boolean isPalindrome(int num){
        //2nd funtion in VT-feature   
        int numCpy = num;
        int numRev = 0;
        while(numCpy != 0){
            int lastDigit = numCpy%10;
            numRev = numRev*10 + lastDigit;
            numCpy = numCpy/10;
        }
        return numRev == num;
    }
}