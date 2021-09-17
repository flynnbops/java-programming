package chapter6;

/*
    Method overloading:
    Parameter lists must be different.
 */
public class Month {

    public static String getMonth(int month){
        return "Feb";
    }

    public static int getMonth(String month){
        return 1;
    }
}
