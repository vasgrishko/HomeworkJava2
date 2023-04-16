package Homework.HomeworkJava2;



public class TaskFirst {
    public static void main(String[] args) {
        String str = "585";
        boolean result = DefinePalindrome(str);
        if (result) {
            System.out.println(str + " палиндром");
        } else {
            System.out.println(str + " не палиндром");
        }   
    }
    public static boolean DefinePalindrome(String str){
        int strLength = str.length();
        int countOfWays = strLength / 2;
        for (int i = 0; i < countOfWays; i++) {
            if (str.charAt(i) != str.charAt(strLength - 1 - i)) {
                return false;
            }
        }
        return true;       
    }
}

