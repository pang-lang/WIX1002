import java.util.Scanner;
public class L4Q4 {
    public static void main(String[] args) {
        //Write a program that ask user to enter the year and the first day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday). 
        //Display the calendar for May and August.

        int day, year;
        final int MAY = 5;
        final int AUGUST = 8;

        Scanner k = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = k.nextInt();

        System.out.print("Enter the first day of the year: [0- Sunday, 1-Monday, ...] ");
        day = k.nextInt();

        for (int i = 1; i <= AUGUST; i++) {
            if (i == MAY) {
                System.out.println("May " + year);
                System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
                printCalendarMonth(31, day);
            } else if (i == AUGUST) {
                System.out.println("\n"); // Adjusted spacing
                System.out.println("August " + year);
                System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
                printCalendarMonth(31, day);
                System.out.println(""); // Extra new line after August
            } else if (i == 2) {
                //if its a leap year, it returns 29; otherwise, it returns 28. 
                day = (day + (isLeap(year) ? 29 : 28)) % 7;
            } else if (i == 4 || i == 6) {
                day = (day + 30) % 7;
            } else {
                day = (day + 31) % 7;
            }
        }
    }

    private static void printCalendarMonth(int daysInMonth, int startingDay) {
        for (int d = 0; d < startingDay; d++) {
            System.out.printf("     "); //print 5 spaces to start the day of the month
        }

        for (int j = 1; j <= daysInMonth; j++) {
            System.out.printf("%-5d", j);
            startingDay++;
            //if starting day reaches 7, it will reset to a new week(new line)
            startingDay %= 7;
            if (startingDay == 0) {
                System.out.println("");
            }
        }
    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

        
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the first day of the year (0 for Sunday, 1 for Monday etc ...): ");
        int firstDay = scanner.nextInt();

        for (int month = 1; month <= 12; month++) {
            String[] monthNames = {
                    "January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"
            };
            System.out.println(monthNames[month - 1] + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < firstDay; i++) {
                System.out.print("    "); // Adjusting for empty spaces
            }

            int noOfDays;
            if ((month == 2) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                noOfDays = 29;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                noOfDays = 30;
            } else if (month == 2) {
                noOfDays = 28;
            } else {
                noOfDays = 31;
            }

            for (int day = 1; day <= noOfDays; day++) {
                System.out.printf("%3d ", day);
                if ((day + firstDay) % 7 == 0 || day == noOfDays) {
                    System.out.println(); // newline
                }
            }
            System.out.println();
            firstDay = (firstDay + noOfDays) % 7; // Update firstDay for the next month
        }
    }
}
*/


   