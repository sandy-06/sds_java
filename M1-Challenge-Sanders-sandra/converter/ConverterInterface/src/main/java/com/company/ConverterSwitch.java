package com.company;

public class ConverterSwitch implements Converter {



    public String convertMonth(int monthNumber) {
         switch (monthNumber) {
             case 1:
                 return "January";
             case 2:
                 return "February";
             case 3:
                 return "March";
             case 4:
                 return "April";
             case 5:
                 return "May";
             case 6:
                 return "June";
             case 7:
                 return "July";
             case 8:
                 return "August";
             case 9:
                 return "September";
             case 10:
                 return "October";
             case 11:
                 return "November";
             case 12:
                 return "December";
             default:
                 return "invalid month number";
         }
    }

    /**
     * This method converts the given number into its corresponding day of the week.
     *
     * @param dayNumber&mdash;number you wish to convert to a day of the week
     * @return&mdash;the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    public String convertDay(int dayNumber) {

        switch(dayNumber) {
            case 1:
                return  "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";

            default:
                return  "invalid day number";
        }


    }
}

