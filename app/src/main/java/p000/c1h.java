package p000;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c1h {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Map<String, SimpleDateFormat>> f15552a = new C2161a();

    /* JADX INFO: renamed from: b */
    public static final String[] f15553b = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};

    /* JADX INFO: renamed from: c */
    public static final int[] f15554c = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};

    /* JADX INFO: renamed from: d */
    public static final String[] f15555d = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    /* JADX INFO: renamed from: c1h$a */
    public static class C2161a extends ThreadLocal<Map<String, SimpleDateFormat>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, SimpleDateFormat> initialValue() {
            return new HashMap();
        }
    }

    private c1h() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX INFO: renamed from: a */
    public static String m3630a(long j, int i) {
        if (i <= 0) {
            return null;
        }
        int iMin = Math.min(i, 5);
        String[] strArr = {"天", "小时", "分钟", "秒", "毫秒"};
        if (j == 0) {
            return 0 + strArr[iMin - 1];
        }
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append("-");
            j = -j;
        }
        int[] iArr = {yzg.f103571e, 3600000, 60000, 1000, 1};
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = iArr[i2];
            if (j >= i3) {
                long j2 = j / ((long) i3);
                j -= ((long) i3) * j2;
                sb.append(j2);
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }

    public static long date2Millis(Date date) {
        return date.getTime();
    }

    public static String date2String(Date date) {
        return date2String(date, getDefaultFormat());
    }

    public static String getChineseWeek(String str) {
        return getChineseWeek(string2Date(str, getDefaultFormat()));
    }

    public static String getChineseZodiac(String str) {
        return getChineseZodiac(string2Date(str, getDefaultFormat()));
    }

    public static Date getDate(long j, long j2, int i) {
        return millis2Date(j + timeSpan2Millis(j2, i));
    }

    public static Date getDateByNow(long j, int i) {
        return getDate(getNowMills(), j, i);
    }

    private static SimpleDateFormat getDefaultFormat() {
        return getSafeDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public static String getFitTimeSpan(String str, String str2, int i) {
        return m3630a(string2Millis(str, getDefaultFormat()) - string2Millis(str2, getDefaultFormat()), i);
    }

    public static String getFitTimeSpanByNow(String str, int i) {
        return getFitTimeSpan(str, getNowString(), getDefaultFormat(), i);
    }

    public static String getFriendlyTimeSpanByNow(String str) {
        return getFriendlyTimeSpanByNow(str, getDefaultFormat());
    }

    public static long getMillis(long j, long j2, int i) {
        return j + timeSpan2Millis(j2, i);
    }

    public static long getMillisByNow(long j, int i) {
        return getMillis(getNowMills(), j, i);
    }

    public static Date getNowDate() {
        return new Date();
    }

    public static long getNowMills() {
        return System.currentTimeMillis();
    }

    public static String getNowString() {
        return millis2String(System.currentTimeMillis(), getDefaultFormat());
    }

    @igg({"SimpleDateFormat"})
    public static SimpleDateFormat getSafeDateFormat(String str) {
        Map<String, SimpleDateFormat> map = f15552a.get();
        SimpleDateFormat simpleDateFormat = map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    public static String getString(long j, long j2, int i) {
        return getString(j, getDefaultFormat(), j2, i);
    }

    public static String getStringByNow(long j, int i) {
        return getStringByNow(j, getDefaultFormat(), i);
    }

    public static long getTimeSpan(String str, String str2, int i) {
        return getTimeSpan(str, str2, getDefaultFormat(), i);
    }

    public static long getTimeSpanByNow(String str, int i) {
        return getTimeSpan(str, getNowString(), getDefaultFormat(), i);
    }

    public static String getUSWeek(String str) {
        return getUSWeek(string2Date(str, getDefaultFormat()));
    }

    public static int getValueByCalendarField(int i) {
        return Calendar.getInstance().get(i);
    }

    private static long getWeeOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String getZodiac(String str) {
        return getZodiac(string2Date(str, getDefaultFormat()));
    }

    public static boolean isAm() {
        return Calendar.getInstance().get(9) == 0;
    }

    public static boolean isLeapYear(String str) {
        return isLeapYear(string2Date(str, getDefaultFormat()));
    }

    public static boolean isPm() {
        return !isAm();
    }

    public static boolean isToday(String str) {
        return isToday(string2Millis(str, getDefaultFormat()));
    }

    public static Date millis2Date(long j) {
        return new Date(j);
    }

    public static String millis2String(long j) {
        return millis2String(j, getDefaultFormat());
    }

    private static long millis2TimeSpan(long j, int i) {
        return j / ((long) i);
    }

    public static Date string2Date(String str) {
        return string2Date(str, getDefaultFormat());
    }

    public static long string2Millis(String str) {
        return string2Millis(str, getDefaultFormat());
    }

    private static long timeSpan2Millis(long j, int i) {
        return j * ((long) i);
    }

    public static String date2String(Date date, @efb String str) {
        if (str != null) {
            return getSafeDateFormat(str).format(date);
        }
        throw new NullPointerException("Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getChineseWeek(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return getChineseWeek(string2Date(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getChineseZodiac(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return getChineseZodiac(string2Date(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Date getDate(String str, long j, int i) {
        return getDate(str, getDefaultFormat(), j, i);
    }

    public static String getFitTimeSpanByNow(String str, @efb DateFormat dateFormat, int i) {
        if (dateFormat != null) {
            return getFitTimeSpan(str, getNowString(dateFormat), dateFormat, i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getFriendlyTimeSpanByNow(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return getFriendlyTimeSpanByNow(string2Millis(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getMillis(String str, long j, int i) {
        return getMillis(str, getDefaultFormat(), j, i);
    }

    public static String getNowString(@efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return millis2String(System.currentTimeMillis(), dateFormat);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getString(long j, @efb DateFormat dateFormat, long j2, int i) {
        if (dateFormat != null) {
            return millis2String(j + timeSpan2Millis(j2, i), dateFormat);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getStringByNow(long j, @efb DateFormat dateFormat, int i) {
        if (dateFormat != null) {
            return getString(getNowMills(), dateFormat, j, i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getTimeSpan(String str, String str2, @efb DateFormat dateFormat, int i) {
        if (dateFormat != null) {
            return millis2TimeSpan(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#2 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getTimeSpanByNow(String str, @efb DateFormat dateFormat, int i) {
        if (dateFormat != null) {
            return getTimeSpan(str, getNowString(dateFormat), dateFormat, i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getUSWeek(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return getUSWeek(string2Date(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getZodiac(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return getZodiac(string2Date(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isLeapYear(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return isLeapYear(string2Date(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isPm(String str) {
        return !isAm(str);
    }

    public static boolean isToday(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return isToday(string2Millis(str, dateFormat));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String millis2String(long j, @efb String str) {
        if (str != null) {
            return millis2String(j, getSafeDateFormat(str));
        }
        throw new NullPointerException("Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Date string2Date(String str, @efb String str2) {
        if (str2 != null) {
            return string2Date(str, getSafeDateFormat(str2));
        }
        throw new NullPointerException("Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long string2Millis(String str, @efb String str2) {
        if (str2 != null) {
            return string2Millis(str, getSafeDateFormat(str2));
        }
        throw new NullPointerException("Argument 'pattern' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Date getDate(String str, @efb DateFormat dateFormat, long j, int i) {
        if (dateFormat != null) {
            return millis2Date(string2Millis(str, dateFormat) + timeSpan2Millis(j, i));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getFitTimeSpan(String str, String str2, @efb DateFormat dateFormat, int i) {
        if (dateFormat != null) {
            return m3630a(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat), i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#2 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getMillis(String str, @efb DateFormat dateFormat, long j, int i) {
        if (dateFormat != null) {
            return string2Millis(str, dateFormat) + timeSpan2Millis(j, i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static int getValueByCalendarField(String str, int i) {
        return getValueByCalendarField(string2Date(str, getDefaultFormat()), i);
    }

    public static boolean isAm(String str) {
        return getValueByCalendarField(str, getDefaultFormat(), 9) == 0;
    }

    public static boolean isPm(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return !isAm(str, dateFormat);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String date2String(Date date, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return dateFormat.format(date);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getChineseWeek(Date date) {
        return new SimpleDateFormat(k95.f53029S4, Locale.CHINA).format(date);
    }

    public static String getChineseZodiac(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return f15553b[calendar.get(1) % 12];
    }

    public static String getFitTimeSpanByNow(Date date, int i) {
        return getFitTimeSpan(date, getNowDate(), i);
    }

    public static String getFriendlyTimeSpanByNow(Date date) {
        return getFriendlyTimeSpanByNow(date.getTime());
    }

    public static String getString(String str, long j, int i) {
        return getString(str, getDefaultFormat(), j, i);
    }

    public static long getTimeSpan(Date date, Date date2, int i) {
        return millis2TimeSpan(date2Millis(date) - date2Millis(date2), i);
    }

    public static long getTimeSpanByNow(Date date, int i) {
        return getTimeSpan(date, new Date(), i);
    }

    public static String getUSWeek(Date date) {
        return new SimpleDateFormat("EEEE", Locale.US).format(date);
    }

    public static int getValueByCalendarField(String str, @efb DateFormat dateFormat, int i) {
        if (dateFormat != null) {
            return getValueByCalendarField(string2Date(str, dateFormat), i);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getZodiac(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getZodiac(calendar.get(2) + 1, calendar.get(5));
    }

    public static boolean isAm(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return getValueByCalendarField(str, dateFormat, 9) == 0;
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isLeapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isLeapYear(calendar.get(1));
    }

    public static boolean isToday(Date date) {
        return isToday(date.getTime());
    }

    public static String millis2String(long j, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            return dateFormat.format(new Date(j));
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static Date string2Date(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long string2Millis(String str, @efb DateFormat dateFormat) {
        if (dateFormat != null) {
            try {
                return dateFormat.parse(str).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
                return -1L;
            }
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static String getChineseWeek(long j) {
        return getChineseWeek(new Date(j));
    }

    public static Date getDate(Date date, long j, int i) {
        return millis2Date(date2Millis(date) + timeSpan2Millis(j, i));
    }

    public static String getFitTimeSpanByNow(long j, int i) {
        return getFitTimeSpan(j, System.currentTimeMillis(), i);
    }

    public static String getFriendlyTimeSpanByNow(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < 0) {
            return String.format("%tc", Long.valueOf(j));
        }
        if (jCurrentTimeMillis < 1000) {
            return "刚刚";
        }
        if (jCurrentTimeMillis < 60000) {
            return String.format(Locale.getDefault(), "%d秒前", Long.valueOf(jCurrentTimeMillis / 1000));
        }
        if (jCurrentTimeMillis < 3600000) {
            return String.format(Locale.getDefault(), "%d分钟前", Long.valueOf(jCurrentTimeMillis / 60000));
        }
        long weeOfToday = getWeeOfToday();
        if (j >= weeOfToday) {
            return String.format("今天%tR", Long.valueOf(j));
        }
        if (j >= weeOfToday - 86400000) {
            return String.format("昨天%tR", Long.valueOf(j));
        }
        return String.format("%tF", Long.valueOf(j));
    }

    public static long getMillis(Date date, long j, int i) {
        return date2Millis(date) + timeSpan2Millis(j, i);
    }

    public static String getString(String str, @efb DateFormat dateFormat, long j, int i) {
        if (dateFormat != null) {
            return millis2String(string2Millis(str, dateFormat) + timeSpan2Millis(j, i), dateFormat);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static long getTimeSpan(long j, long j2, int i) {
        return millis2TimeSpan(j - j2, i);
    }

    public static long getTimeSpanByNow(long j, int i) {
        return getTimeSpan(j, System.currentTimeMillis(), i);
    }

    public static String getUSWeek(long j) {
        return getUSWeek(new Date(j));
    }

    public static boolean isPm(Date date) {
        return !isAm(date);
    }

    public static boolean isToday(long j) {
        long weeOfToday = getWeeOfToday();
        return j >= weeOfToday && j < weeOfToday + 86400000;
    }

    public static String getFitTimeSpan(Date date, Date date2, int i) {
        return m3630a(date2Millis(date) - date2Millis(date2), i);
    }

    public static int getValueByCalendarField(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i);
    }

    public static boolean isAm(Date date) {
        return getValueByCalendarField(date, 9) == 0;
    }

    public static boolean isPm(long j) {
        return !isAm(j);
    }

    public static String getChineseZodiac(long j) {
        return getChineseZodiac(millis2Date(j));
    }

    public static String getFitTimeSpan(long j, long j2, int i) {
        return m3630a(j - j2, i);
    }

    public static String getString(Date date, long j, int i) {
        return getString(date, getDefaultFormat(), j, i);
    }

    public static boolean isAm(long j) {
        return getValueByCalendarField(j, 9) == 0;
    }

    public static String getChineseZodiac(int i) {
        return f15553b[i % 12];
    }

    public static String getString(Date date, @efb DateFormat dateFormat, long j, int i) {
        if (dateFormat != null) {
            return millis2String(date2Millis(date) + timeSpan2Millis(j, i), dateFormat);
        }
        throw new NullPointerException("Argument 'format' of type DateFormat (#1 out of 4, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static boolean isLeapYear(long j) {
        return isLeapYear(millis2Date(j));
    }

    public static int getValueByCalendarField(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(i);
    }

    public static String getZodiac(long j) {
        return getZodiac(millis2Date(j));
    }

    public static boolean isLeapYear(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    public static String getZodiac(int i, int i2) {
        String[] strArr = f15555d;
        int i3 = i - 1;
        if (i2 < f15554c[i3]) {
            i3 = (i + 10) % 12;
        }
        return strArr[i3];
    }
}
