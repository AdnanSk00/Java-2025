package tka_A_basics;

public class LeapYear {
	public static void main(String[] args) {
        
        // Check if the year is a leap year or not
        
        int year = 2020;    // 2017 - Not Leap Year
        // int year = 202;    //  1700 - Not Leap Year
        
        if(year % 100 == 0 && year % 400 == 0){
        System.out.println(year + " && is a Leap Year");
        }
        else if(year % 100 != 0 && year % 4 == 0){
            System.out.println(year + " ** is a Leap Year");
        }
        else{
            System.out.println(year + " ## is not a Leap Year");
        }
    }
}
