package p000;

import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class b1h {

    /* JADX INFO: renamed from: a */
    public static String f12419a = "GMT+08:00";

    public static String ShowDateMMToStr(long timeStamp) {
        if (timeStamp == 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(f12419a));
        if ((timeStamp + "").length() == 10) {
            timeStamp *= 1000;
        }
        calendar.setTimeInMillis(timeStamp);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(f12419a));
        return simpleDateFormat.format(time);
    }

    public static String ShowDateMonthToStr(long timeStamp) {
        if (timeStamp == 0) {
            return "";
        }
        zi9.m26854i("群创建时间:", Long.valueOf(timeStamp));
        Calendar calendar = Calendar.getInstance();
        String str = timeStamp + "";
        if (str.length() == 10) {
            timeStamp *= 1000;
        }
        if (str.length() > 13) {
            timeStamp /= 1000;
        }
        calendar.setTimeInMillis(timeStamp);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static String ShowDateStr(long timeStamp) {
        if (timeStamp == 0) {
            return "";
        }
        zi9.m26854i("群创建时间:", Long.valueOf(timeStamp));
        Calendar calendar = Calendar.getInstance();
        String str = timeStamp + "";
        if (str.length() == 10) {
            timeStamp *= 1000;
        }
        if (str.length() > 13) {
            timeStamp /= 1000;
        }
        calendar.setTimeInMillis(timeStamp);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
    }

    public static String getChatTime(long time) {
        return getTimeStringAutoShort2(new Date(time), true);
    }

    public static String getCollectTime(long date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(date));
    }

    @igg({"SimpleDateFormat"})
    public static String getCurrentDateTime(String format) {
        return simpleDateFormat(format, new Date());
    }

    public static String getCurrentTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
        String str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append("getCurrentTime time:");
        sb.append(str);
        return str;
    }

    public static String getSessionTime(long time) {
        return getTimeStringAutoShort2(new Date(time), false);
    }

    private static String getTimeString(Date dt, String pattern) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.format(dt);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getTimeStringAutoShort2(Date srcDate, boolean mustIncludeTime) {
        String str;
        String timeString;
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new Date());
            int i = gregorianCalendar.get(1);
            int i2 = gregorianCalendar.get(2) + 1;
            int i3 = gregorianCalendar.get(5);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setTime(srcDate);
            int i4 = gregorianCalendar2.get(1);
            int i5 = gregorianCalendar2.get(2) + 1;
            int i6 = gregorianCalendar2.get(5);
            if (mustIncludeTime) {
                str = C2473f.f17566z + getTimeString(srcDate, "HH:mm");
            } else {
                str = "";
            }
            if (i == i4) {
                long timeInMillis = gregorianCalendar.getTimeInMillis() - gregorianCalendar2.getTimeInMillis();
                if (i2 == i5 && i3 == i6) {
                    timeString = timeInMillis < 50000 ? "刚刚" : getTimeString(srcDate, "HH:mm");
                } else {
                    GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                    gregorianCalendar3.add(5, -1);
                    GregorianCalendar gregorianCalendar4 = new GregorianCalendar();
                    gregorianCalendar4.add(5, -2);
                    if (i5 == gregorianCalendar3.get(2) + 1 && i6 == gregorianCalendar3.get(5)) {
                        timeString = "昨天" + str;
                    } else if (i5 == gregorianCalendar4.get(2) + 1 && i6 == gregorianCalendar4.get(5)) {
                        timeString = "前天" + str;
                    } else if (timeInMillis / 3600000 < 168) {
                        timeString = new String[]{"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"}[gregorianCalendar2.get(7) - 1] + str;
                    } else {
                        timeString = getTimeString(srcDate, "yyyy/M/d") + str;
                    }
                }
            } else {
                timeString = getTimeString(srcDate, "yyyy/M/d") + str;
            }
            return timeString;
        } catch (Exception e) {
            System.err.println("【DEBUG-getTimeStringAutoShort】计算出错：" + e.getMessage() + " 【NO】");
            return "";
        }
    }

    public static String getToDayStr() {
        String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("getCurrentTime time:");
        sb.append(str);
        return str;
    }

    public static boolean isTodayByStr(String lastSignDay) {
        return !TextUtils.isEmpty(lastSignDay) && lastSignDay.equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    public static String secondsToHMS(long seconds) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(seconds);
        long seconds2 = seconds - TimeUnit.HOURS.toSeconds(hours);
        long minutes = timeUnit.toMinutes(seconds2);
        return String.format("%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds2 - TimeUnit.MINUTES.toSeconds(minutes)));
    }

    public static String simpleDateFormat(String format, Date date) {
        if (TextUtils.isEmpty(format)) {
            format = "yyyy-MM-dd HH:mm:ss SSS";
        }
        return new SimpleDateFormat(format).format(date);
    }

    private static String timeFormatStr(Calendar calendar, String strDay) {
        if (calendar.get(11) > 11) {
            return "下午 " + strDay;
        }
        return "上午 " + strDay;
    }

    public static long getTimeString(String time) {
        try {
            return new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA).parse(time).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
