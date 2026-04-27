package p000;

import android.content.Context;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class a1h {

    /* JADX INFO: renamed from: a */
    public static String f145a = "GMT+08:00";

    public static String ShowDateMMToStr(long j) {
        if (j == 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(f145a));
        if ((j + "").length() == 10) {
            j *= 1000;
        }
        calendar.setTimeInMillis(j);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(f145a));
        return simpleDateFormat.format(time);
    }

    public static String ShowDateMonthToStr(long j) {
        if (j == 0) {
            return "";
        }
        zi9.m26854i("群创建时间:", Long.valueOf(j));
        Calendar calendar = Calendar.getInstance();
        String str = j + "";
        if (str.length() == 10) {
            j *= 1000;
        }
        if (str.length() > 13) {
            j /= 1000;
        }
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }

    public static String ShowDateStr(long j) {
        if (j == 0) {
            return "";
        }
        zi9.m26854i("群创建时间:", Long.valueOf(j));
        Calendar calendar = Calendar.getInstance();
        String str = j + "";
        if (str.length() == 10) {
            j *= 1000;
        }
        if (str.length() > 13) {
            j /= 1000;
        }
        calendar.setTimeInMillis(j);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
    }

    public static String ShowDateToStr(long j) {
        if (j == 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(f145a));
        if ((j + "").length() == 10) {
            j *= 1000;
        }
        calendar.setTimeInMillis(j);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(f145a));
        return simpleDateFormat.format(time);
    }

    public static String formatDateInUnit(Context context, long j, String str) {
        String str2 = new SimpleDateFormat(str).format(Long.valueOf(j));
        StringBuilder sb = new StringBuilder();
        sb.append("formatDateInUnit time:");
        sb.append(str2);
        return str2;
    }

    public static String getChatTime(long j) {
        return getTimeStringAutoShort2(new Date(j), true);
    }

    public static String getCollectTime(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j));
    }

    @igg({"SimpleDateFormat"})
    public static String getCurrentDateTime(String str) {
        return simpleDateFormat(str, new Date());
    }

    public static String getCurrentTime() {
        return simpleDateFormat(null, new Date(System.currentTimeMillis()));
    }

    public static String getSessionTime(long j) {
        return getTimeStringAutoShort2(new Date(j), false);
    }

    private static String getTimeString(Date date, String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.format(date);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getTimeStringAutoShort2(Date date, boolean z) {
        String str;
        String timeString;
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new Date());
            int i = gregorianCalendar.get(1);
            int i2 = gregorianCalendar.get(2) + 1;
            int i3 = gregorianCalendar.get(5);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setTime(date);
            int i4 = gregorianCalendar2.get(1);
            int i5 = gregorianCalendar2.get(2) + 1;
            int i6 = gregorianCalendar2.get(5);
            if (z) {
                str = C2473f.f17566z + getTimeString(date, "HH:mm");
            } else {
                str = "";
            }
            if (i == i4) {
                long timeInMillis = gregorianCalendar.getTimeInMillis() - gregorianCalendar2.getTimeInMillis();
                if (i2 == i5 && i3 == i6) {
                    timeString = timeInMillis < 50000 ? "刚刚" : getTimeString(date, "HH:mm");
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
                        timeString = getTimeString(date, "yyyy/M/d") + str;
                    }
                }
            } else {
                timeString = getTimeString(date, "yyyy/M/d") + str;
            }
            return timeString;
        } catch (Exception e) {
            System.err.println("【DEBUG-getTimeStringAutoShort】计算出错：" + e.getMessage() + " 【NO】");
            return "";
        }
    }

    public static boolean isTodayByStr(String str) {
        return !TextUtils.isEmpty(str) && str.equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    public static String secondsToHMS(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long seconds = j - TimeUnit.HOURS.toSeconds(hours);
        long minutes = timeUnit.toMinutes(seconds);
        return String.format("%02d:%02d:%02d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds - TimeUnit.MINUTES.toSeconds(minutes)));
    }

    public static String simpleDateFormat(String str, Date date) {
        if (TextUtils.isEmpty(str)) {
            str = "yyyy-MM-dd HH:mm:ss SSS";
        }
        return new SimpleDateFormat(str).format(date);
    }

    private static String timeFormatStr(Calendar calendar, String str) {
        if (calendar.get(11) > 11) {
            return "下午 " + str;
        }
        return "上午 " + str;
    }

    public static String formatDateInUnit(long j, String str) {
        String str2 = new SimpleDateFormat(str).format(Long.valueOf(j));
        StringBuilder sb = new StringBuilder();
        sb.append("formatDateInUnit time:");
        sb.append(str2);
        return str2;
    }

    public static long getTimeString(String str) {
        try {
            return new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA).parse(str).getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
