package model_mvc;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Năm hiện tại là : " + year);
    }
}
