package p000;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import com.blankj.utilcode.util.C2473f;
import com.google.android.material.C3146R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class jzh {

    /* JADX INFO: renamed from: a */
    public static final String f52305a = "UTC";

    /* JADX INFO: renamed from: b */
    public static AtomicReference<v0h> f52306b = new AtomicReference<>();

    private jzh() {
    }

    /* JADX INFO: renamed from: a */
    public static long m14392a(long j) {
        Calendar calendarM14407p = m14407p();
        calendarM14407p.setTimeInMillis(j);
        return m14395d(calendarM14407p).getTimeInMillis();
    }

    @omg(24)
    /* JADX INFO: renamed from: b */
    public static DateFormat m14393b(Locale locale) {
        return getAndroidFormat("MMMd", locale);
    }

    @omg(24)
    /* JADX INFO: renamed from: c */
    public static DateFormat m14394c(Locale locale) {
        return getAndroidFormat("MMMEd", locale);
    }

    /* JADX INFO: renamed from: d */
    public static Calendar m14395d(Calendar calendar) {
        Calendar calendarM14408q = m14408q(calendar);
        Calendar calendarM14407p = m14407p();
        calendarM14407p.set(calendarM14408q.get(1), calendarM14408q.get(2), calendarM14408q.get(5));
        return calendarM14407p;
    }

    /* JADX INFO: renamed from: e */
    public static SimpleDateFormat m14396e() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(getTimeZone());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: f */
    public static String m14397f(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C3146R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C3146R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C3146R.string.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    private static int findCharactersInDateFormatPattern(@efb String str, @efb String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static java.text.DateFormat m14398g() {
        return m14399h(Locale.getDefault());
    }

    @omg(24)
    private static DateFormat getAndroidFormat(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(getUtcAndroidTimeZone());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    private static java.text.DateFormat getFormat(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(getTimeZone());
        return dateInstance;
    }

    private static SimpleDateFormat getSimpleFormat(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat;
    }

    private static TimeZone getTimeZone() {
        return TimeZone.getTimeZone(f52305a);
    }

    @omg(24)
    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone(f52305a);
    }

    /* JADX INFO: renamed from: h */
    public static java.text.DateFormat m14399h(Locale locale) {
        return getFormat(0, locale);
    }

    /* JADX INFO: renamed from: i */
    public static java.text.DateFormat m14400i() {
        return m14401j(Locale.getDefault());
    }

    /* JADX INFO: renamed from: j */
    public static java.text.DateFormat m14401j(Locale locale) {
        return getFormat(2, locale);
    }

    /* JADX INFO: renamed from: k */
    public static java.text.DateFormat m14402k() {
        return m14403l(Locale.getDefault());
    }

    /* JADX INFO: renamed from: l */
    public static java.text.DateFormat m14403l(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m14401j(locale);
        simpleDateFormat.applyPattern(removeYearFromDateFormatPattern(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: m */
    public static SimpleDateFormat m14404m(String str) {
        return getSimpleFormat(str, Locale.getDefault());
    }

    /* JADX INFO: renamed from: n */
    public static v0h m14405n() {
        v0h v0hVar = f52306b.get();
        return v0hVar == null ? v0h.m23666e() : v0hVar;
    }

    /* JADX INFO: renamed from: o */
    public static Calendar m14406o() {
        Calendar calendarM23667c = m14405n().m23667c();
        calendarM23667c.set(11, 0);
        calendarM23667c.set(12, 0);
        calendarM23667c.set(13, 0);
        calendarM23667c.set(14, 0);
        calendarM23667c.setTimeZone(getTimeZone());
        return calendarM23667c;
    }

    /* JADX INFO: renamed from: p */
    public static Calendar m14407p() {
        return m14408q(null);
    }

    /* JADX INFO: renamed from: q */
    public static Calendar m14408q(@hib Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(getTimeZone());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @omg(24)
    /* JADX INFO: renamed from: r */
    public static DateFormat m14409r(Locale locale) {
        return getAndroidFormat("yMMMd", locale);
    }

    @efb
    private static String removeYearFromDateFormatPattern(@efb String str) {
        int iFindCharactersInDateFormatPattern = findCharactersInDateFormatPattern(str, "yY", 1, 0);
        if (iFindCharactersInDateFormatPattern >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int iFindCharactersInDateFormatPattern2 = findCharactersInDateFormatPattern(str, "EMd", 1, iFindCharactersInDateFormatPattern);
        if (iFindCharactersInDateFormatPattern2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(findCharactersInDateFormatPattern(str, str2, -1, iFindCharactersInDateFormatPattern) + 1, iFindCharactersInDateFormatPattern2), C2473f.f17566z).trim();
    }

    @omg(24)
    /* JADX INFO: renamed from: s */
    public static DateFormat m14410s(Locale locale) {
        return getAndroidFormat("yMMMEd", locale);
    }

    @omg(24)
    /* JADX INFO: renamed from: t */
    public static DateFormat m14411t(Locale locale) {
        return getAndroidFormat("yMMMM", locale);
    }

    /* JADX INFO: renamed from: u */
    public static void m14412u(@hib v0h v0hVar) {
        f52306b.set(v0hVar);
    }
}
