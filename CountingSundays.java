package Euler_Solutions;

/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class CountingSundays {
    public static void main(String[] args) {
        int count = 0;
        for (int y = 1901; y <= 2000; y++) {
            for (int m = 1; m <= 12; m++) {
                if (dayOfWeek(y, m) == 0)  // Sunday
                    count++;
            }
        }
        System.out.println(count);
    }
    public static int dayOfWeek(int year,int month){
        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m %= 12;
        return (y + y/4 - y/100 + (13 * m + 2) / 5 + 1 + 2) % 7;
    }
}
