/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 27/10/2020
 *   Time: 10:15 PM
 *   File: CalendarDemo.java
 */
public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private final int numberOFDaysInMonth;

    public int getNumberOFDaysInMonth() {
        return numberOFDaysInMonth;
    }

    Months(int numberOFDaysInMonth) {
        this.numberOFDaysInMonth = numberOFDaysInMonth;
    }
}
