package com.company;
import com.company.ConverterIf;
import com.company.ConverterSwitch;


public class ConverterApplication {
    public static void main(String[] args) {
       ConverterIf converter1 = new ConverterIf();
       ConverterSwitch converter2 = new ConverterSwitch();
       Converter convert;
       convert = converter1;

       convert.convertMonth(1);
        int monthNumber = 1;
       converter1.convertMonth(1);
       converter1.convertDay(1);
       converter1.convertDay(1);
       System.out.println(converter1.convertMonth(1));
        System.out.println(converter1.convertDay(1));

        convert = converter2;
        System.out.println(converter2.convertMonth(1));
        System.out.println(converter2.convertDay(1));
        }
}
