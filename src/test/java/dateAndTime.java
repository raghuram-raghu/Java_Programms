import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class dateAndTime {

public static void main(String [] argus){

    Date date = new Date();

    System.out.println(date);

    SimpleDateFormat sip = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");

    String Rdate = sip.format(date);


    System.out.println(Rdate);

    LocalDate localdate = LocalDate.now();

    LocalDate  lastYearDate = localdate.minusYears(1);

    System.out.println("this year date :  "+localdate);

    System.out.println("last year date :  "+lastYearDate);




}

}
