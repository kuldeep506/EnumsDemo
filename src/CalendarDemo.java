/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 27/10/2020
 *   Time: 10:15 PM
 *   File: CalendarDemo.java
 */

//The program to calculate the number of remaining days left in the month.

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        int currentMonth = new GregorianCalendar().get(Calendar.MONTH);
        int currentDate = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
        int currentHour = new GregorianCalendar().get(Calendar.HOUR);
        int currentMinutes = new GregorianCalendar().get(Calendar.MINUTE);
        switch (currentMonth) {
            case 0:
                System.out.println("current month is " + Months.JANUARY.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.JANUARY.getNumberOFDaysInMonth() - currentDate));
                break;
            case 1:
                System.out.println("current month is " + Months.FEBRUARY.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.FEBRUARY.getNumberOFDaysInMonth() - currentDate));
                break;
            case 2:
                System.out.println("current month is " + Months.MARCH.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.MARCH.getNumberOFDaysInMonth() - currentDate));
                break;
            case 3:
                System.out.println("current month is " + Months.APRIL.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.APRIL.getNumberOFDaysInMonth() - currentDate));
                break;
            case 4:
                System.out.println("current month is " + Months.MAY.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.MAY.getNumberOFDaysInMonth() - currentDate));
                break;
            case 5:
                System.out.println("current month is " + Months.JUNE.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.JUNE.getNumberOFDaysInMonth() - currentDate));
                break;
            case 6:
                System.out.println("current month is " + Months.JULY.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.JULY.getNumberOFDaysInMonth() - currentDate));
                break;
            case 7:
                System.out.println("current month is " + Months.AUGUST.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.AUGUST.getNumberOFDaysInMonth() - currentDate));
                break;
            case 8:
                System.out.println("current month is " + Months.SEPTEMBER.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.SEPTEMBER.getNumberOFDaysInMonth() - currentDate));
                break;
            case 9:
                System.out.println("current month is " + Months.OCTOBER.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.OCTOBER.getNumberOFDaysInMonth() - currentDate));
                break;
            case 10:
                System.out.println("current month is " + Months.NOVEMBER.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.NOVEMBER.getNumberOFDaysInMonth() - currentDate));
                break;
            case 11:
                System.out.println("current month is " + Months.DECEMBER.name() + "!");
                System.out.println("current time is " + currentHour + ":" + currentMinutes);
                System.out.println("number of days left in month is " + (Months.DECEMBER.getNumberOFDaysInMonth() - currentDate));
                break;
            default:
                System.out.println("check the month you entered");
        }
    }
}
