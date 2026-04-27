package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class d1h {
    public static String formatLongToDate(long timestamp) {
        return new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(new Date(timestamp));
    }

    public static String formatLongToDay(long timestamp) {
        return new SimpleDateFormat("MM-dd", Locale.getDefault()).format(new Date(timestamp));
    }

    public static String formatLongToTime(long timestamp) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d", Long.valueOf(timeUnit.toHours(timestamp)), Long.valueOf(timeUnit.toMinutes(timestamp) % 60), Long.valueOf(timeUnit.toSeconds(timestamp) % 60));
    }

    public static String formatLongToYMDHMSS(long timestamp) {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).format(new Date(timestamp));
    }
}
