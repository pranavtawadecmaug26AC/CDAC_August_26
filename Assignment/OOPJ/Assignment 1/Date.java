
public class Date {

    private int day;

    private int month;

    private int year;

    //settor also known as mutator
    
    // public void setDay(int dd) {
    //     if (dd < 1 || dd > 31) {
    //         day = 0;
    //     }
    //     else {
    //         day = dd;
    //     }
    // }
    // public void setMonth(int mm) {
    //     if (mm < 1 || mm > 12) {
    //         month = 1;
    //     }
    //     else {
    //         month = mm;
    //     }
    // }
    // public void setyear(int yy) {
    //     //validation logic
    //     year = yy;
    // }

    public void setDate(int dd, int mm, int yy) {
        // year
        year = yy;

        // month
        if (mm < 1 || mm > 12) {
            month = 1;
        } else {
            month = mm;
        }

        //day
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (dd < 1 || dd > 31) {
                day = 1;
            } else {
                day = dd;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (dd < 1 || dd > 30) {
                day = 1;
            } else {
                day = dd;
            }

        } else {
            //leap year validation

            if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) {
                // Leap year → February has 29 days

                if (dd < 1 || dd > 29) {
                    day = 1;
                } else {
                    day = dd;
                }

            } else {
                // Normal year → February has 28 days

                if (dd < 1 || dd > 28) {
                    day = 1;
                } else {
                    day = dd;
                }
            }
        }

    }

    // Checking whether the year is a leap year
    public boolean isLeapYear(int yy) {

        if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) {
            return true;
        }

        return false;
    }

    // Finding number of days in a month
    public int getDaysInMonth(int mm, int yy) {

        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {

            return 31;
        }

        else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {

            return 30;
        }

        else {

            if (isLeapYear(yy)) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    // Add days
    public void addDays(int days) {

        while (days > 0) {

            day++;

            if (day > getDaysInMonth(month, year)) {

                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            }

            days--;
        }
    }

    // Add months
    public void addMonths(int months) {

        while (months > 0) {

            month++;

            if (month > 12) {
                month = 1;
                year++;
            }

            int maxDays = getDaysInMonth(month, year);

            if (day > maxDays) {
                day = maxDays;
            }

            months--;
        }
    }

    // Add years
    public void addYears(int years) {

        year = year + years;

        int maxDays = getDaysInMonth(month, year);

        if (day > maxDays) {
            day = maxDays;
        }
    }





    // gettor also known as accessor
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getyear() {
        return year;
    }

}
