package ru.geekbrains.lesson1;

public class Switch {
    public static void main(String[] args) {
        int month = 3, year = 2016, days = 31;
        switch (month)
        {
            case 4: case 6: case 9: case 11: days = 30; break;
            case 2: days = ( year % 4 == 0) ? 29 : 28; break;

        }

        System.out.println(month+"/"+year+": "+days+"дней");

         month = 1;
         year = 2015;
         days = 31;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else if (month == 2) {
            days = (year % 4 == 0) ? 29: 28;
        }
        System.out.println(month+"/"+year+": "+days+"дней");
    }
}
