package com.eyevue.glassapp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoUtils {
    public static String convertDateFormat(String input) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            return new SimpleDateFormat("yyMMdd-HHmmssSSS").format(simpleDateFormat.parse(input));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String convertTimeCompat(String timeStr) {
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", locale);
        try {
            return new SimpleDateFormat("yyMMdd-HHmmssSSS", locale).format(simpleDateFormat.parse(timeStr));
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String convertTimeFormat(String inputTime) {
        return LocalDateTime.parse(inputTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")).format(DateTimeFormatter.ofPattern("yyMMdd-HHmmss"));
    }

    public static boolean isSameDay(Date date1, Date date2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date1);
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static Date parseDateFromFileName(String fileName) {
        try {
            Matcher matcher = Pattern.compile(".*-(\\d{6})-(\\d{9})-.*\\..+").matcher(fileName);
            if (!matcher.find()) {
                return null;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup.length() == 6 && strGroup2.length() == 9) {
                int i = Integer.parseInt(strGroup.substring(0, 2)) + 2000;
                int i2 = Integer.parseInt(strGroup.substring(2, 4)) - 1;
                int i3 = Integer.parseInt(strGroup.substring(4, 6));
                String strSubstring = strGroup2.substring(0, 6);
                int i4 = Integer.parseInt(strSubstring.substring(0, 2));
                int i5 = Integer.parseInt(strSubstring.substring(2, 4));
                int i6 = Integer.parseInt(strSubstring.substring(4, 6));
                int i7 = Integer.parseInt(strGroup2.substring(6, 9));
                if (i7 >= 0 && i7 <= 999) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i, i2, i3, i4, i5, i6);
                    calendar.set(14, i7);
                    return calendar.getTime();
                }
            }
            return null;
        } catch (Exception e) {
            System.err.println("从文件名解析日期失败: " + fileName + ", " + e.getMessage());
            return null;
        }
    }

    public static String timestampToYmdHms(long timestamp) {
        return new SimpleDateFormat("yyMMdd-HHmmssSSS", Locale.getDefault()).format(new Date(timestamp));
    }
}
