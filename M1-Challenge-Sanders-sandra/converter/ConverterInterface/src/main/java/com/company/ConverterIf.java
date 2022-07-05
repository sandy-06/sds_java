package com.company;

public class ConverterIf implements Converter {
    /**
     * This method converts the given number into its corresponding month.
     *
     * @param monthNumber&mdash;the number you wish to convert to a month
     * @return&mdash;the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     * for example, convertMonth(1) will return "January" convertMonth(6) will return "June"
     * convertMonth(13) will return some error message
     */
    @Override
    public String convertMonth(int monthNumber) {
        // if the number is not between 1 and 12 (inclusive), return an error message
        if (monthNumber < 1 || monthNumber > 12) {
            return "invalid month number";
        } else if (monthNumber == 1) {
            return "January";
        } else if (monthNumber == 2) {
            return "February";
        } else if (monthNumber == 3) {
            return "March";
        } else if (monthNumber == 4) {
            return "April";
        } else if (monthNumber == 5) {
            return "May";
        } else if (monthNumber == 6) {
            return "June";
        } else if (monthNumber == 7) {
            return "July";
        }else if (monthNumber == 8) {
            return "August";
        }else if (monthNumber == 9) {
            return "September";
        } else if (monthNumber == 10) {
            return "October";
        } else if (monthNumber == 11) {
            return "November";
        } else if (monthNumber == 12) {
            return "December";
        }
        return "no month";
    }

    /**
     * This method converts the given number into its corresponding day of the week.
     *
     * @param dayNumber&mdash;number you wish to convert to a day of the week
     * @return&mdash;the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */

    public String convertDay(int dayNumber) {
        if (dayNumber < 1 || dayNumber > 7) {
            return "invalid day number";
        } else if (dayNumber == 1) {
            return "Sunday";
        } else if (dayNumber == 2) {
            return "Monday";
        } else if (dayNumber == 3) {
            return "Tuesday";
        } else if (dayNumber == 4) {
            return "Wednesday";
        }else if (dayNumber == 5) {
            return "Thursday";
        } else if (dayNumber == 6) {
            return "Friday";
        } else if (dayNumber == 7) {
            return "Saturday";
        }
        return "no day";

    }

}
