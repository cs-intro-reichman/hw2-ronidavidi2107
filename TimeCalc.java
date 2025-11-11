

public class TimeCalc {
    public static void main(String[] args) {       
    String time = args[0];
    String add = args[1];
    String hourS = time.substring(0,2);
    String minS = time.substring(3, 5);
    int hour =Integer.parseInt(hourS);
    int min =Integer.parseInt(minS);
    int addto = Integer.parseInt(add);
    int totMin = (hour*60 + min + addto);
    int newHour = (totMin/ 60);
     int newMin = (totMin- newHour*60);
    newHour = newHour%24;
    String houPrint;
    String minPrint;
    if (newHour < 10) {
        houPrint = "0" + newHour;
    } else { houPrint = "" + newHour;

    }
    if (newMin < 10) {
        minPrint = "0" + newMin;   
    } else { minPrint = "" + newMin;

    }
    System.out.println( houPrint + ":" + minPrint);
}
}