public class Date1 {

    private int day;
    private int month;
    private int year;

    public void setDate(int dd, int mm, int yy) {

        year = yy;

        if (mm < 1 || mm > 12) {
            month = 1;
        } else {
            month = mm;
        }

        int maxDays = getDaysInMonth(month, year);

        if (dd < 1 || dd > maxDays) {
            day = 1;
        } else {
            day = dd;
        }
    }

    public boolean isLeapYear(int yy) {

        if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) {
            return true;
        }

        return false;
    }

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

    public void addYears(int years) {

        year = year + years;

        int maxDays = getDaysInMonth(month, year);

        if (day > maxDays) {
            day = maxDays;
        }
    }

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
