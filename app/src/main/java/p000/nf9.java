package p000;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
public final class nf9 {

    /* JADX INFO: renamed from: a */
    public static final String f64260a = "nf9";

    /* JADX INFO: renamed from: b */
    public static final String[] f64261b = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* JADX INFO: renamed from: nf9$a */
    public static /* synthetic */ class C9842a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64262a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f64262a = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64262a[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64262a[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64262a[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: nf9$b */
    @c5e(24)
    public static class C9843b {
        private C9843b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m17889a(@efb Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Locale m17890b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    /* JADX INFO: renamed from: nf9$c */
    @c5e(33)
    public static class C9844c {
        private C9844c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m17891a(@efb Locale locale) {
            return getHourCycleType(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static String m17892b(@efb Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(C9848g.f64293c) ? C9848g.f64293c : identifier;
        }

        private static String getHourCycleType(DateFormat.HourCycle hourCycle) {
            int i = C9842a.f64262a[hourCycle.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : C9847f.f64289e : C9847f.f64288d : C9847f.f64287c : C9847f.f64286b;
        }
    }

    /* JADX INFO: renamed from: nf9$d */
    public static class C9845d {

        /* JADX INFO: renamed from: a */
        public static final String f64263a = "ca";

        /* JADX INFO: renamed from: b */
        public static final String f64264b = "chinese";

        /* JADX INFO: renamed from: c */
        public static final String f64265c = "dangi";

        /* JADX INFO: renamed from: d */
        public static final String f64266d = "gregorian";

        /* JADX INFO: renamed from: e */
        public static final String f64267e = "hebrew";

        /* JADX INFO: renamed from: f */
        public static final String f64268f = "indian";

        /* JADX INFO: renamed from: g */
        public static final String f64269g = "islamic";

        /* JADX INFO: renamed from: h */
        public static final String f64270h = "islamic-civil";

        /* JADX INFO: renamed from: i */
        public static final String f64271i = "islamic-rgsa";

        /* JADX INFO: renamed from: j */
        public static final String f64272j = "islamic-tbla";

        /* JADX INFO: renamed from: k */
        public static final String f64273k = "islamic-umalqura";

        /* JADX INFO: renamed from: l */
        public static final String f64274l = "persian";

        /* JADX INFO: renamed from: m */
        public static final String f64275m = "";

        /* JADX INFO: renamed from: nf9$d$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69934a})
        public @interface a {
        }

        private C9845d() {
        }
    }

    /* JADX INFO: renamed from: nf9$e */
    public static class C9846e {

        /* JADX INFO: renamed from: a */
        public static final String f64276a = "fw";

        /* JADX INFO: renamed from: b */
        public static final String f64277b = "sun";

        /* JADX INFO: renamed from: c */
        public static final String f64278c = "mon";

        /* JADX INFO: renamed from: d */
        public static final String f64279d = "tue";

        /* JADX INFO: renamed from: e */
        public static final String f64280e = "wed";

        /* JADX INFO: renamed from: f */
        public static final String f64281f = "thu";

        /* JADX INFO: renamed from: g */
        public static final String f64282g = "fri";

        /* JADX INFO: renamed from: h */
        public static final String f64283h = "sat";

        /* JADX INFO: renamed from: i */
        public static final String f64284i = "";

        /* JADX INFO: renamed from: nf9$e$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69934a})
        public @interface a {
        }

        private C9846e() {
        }
    }

    /* JADX INFO: renamed from: nf9$f */
    public static class C9847f {

        /* JADX INFO: renamed from: a */
        public static final String f64285a = "hc";

        /* JADX INFO: renamed from: b */
        public static final String f64286b = "h11";

        /* JADX INFO: renamed from: c */
        public static final String f64287c = "h12";

        /* JADX INFO: renamed from: d */
        public static final String f64288d = "h23";

        /* JADX INFO: renamed from: e */
        public static final String f64289e = "h24";

        /* JADX INFO: renamed from: f */
        public static final String f64290f = "";

        /* JADX INFO: renamed from: nf9$f$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69934a})
        public @interface a {
        }

        private C9847f() {
        }
    }

    /* JADX INFO: renamed from: nf9$g */
    public static class C9848g {

        /* JADX INFO: renamed from: a */
        public static final String f64291a = "mu";

        /* JADX INFO: renamed from: b */
        public static final String f64292b = "celsius";

        /* JADX INFO: renamed from: c */
        public static final String f64293c = "fahrenhe";

        /* JADX INFO: renamed from: d */
        public static final String f64294d = "kelvin";

        /* JADX INFO: renamed from: e */
        public static final String f64295e = "";

        /* JADX INFO: renamed from: nf9$g$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69934a})
        public @interface a {
        }

        private C9848g() {
        }
    }

    private nf9() {
    }

    private static String getBaseFirstDayOfWeek(@efb Locale locale) {
        return getStringOfFirstDayOfWeek(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static String getBaseHourCycle(@efb Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? C9847f.f64288d : C9847f.f64287c;
    }

    @efb
    public static String getCalendarType() {
        return getCalendarType(true);
    }

    private static Locale getDefaultLocale() {
        return Locale.getDefault();
    }

    @efb
    public static String getFirstDayOfWeek() {
        return getFirstDayOfWeek(true);
    }

    @efb
    public static String getHourCycle() {
        return getHourCycle(true);
    }

    private static String getStringOfFirstDayOfWeek(int i) {
        return (i < 1 || i > 7) ? "" : new String[]{C9846e.f64277b, C9846e.f64278c, C9846e.f64279d, C9846e.f64280e, C9846e.f64281f, C9846e.f64282g, C9846e.f64283h}[i - 1];
    }

    private static String getTemperatureHardCoded(Locale locale) {
        return Arrays.binarySearch(f64261b, locale.getCountry()) >= 0 ? C9848g.f64293c : C9848g.f64292b;
    }

    @efb
    public static String getTemperatureUnit() {
        return getTemperatureUnit(true);
    }

    private static String getUnicodeLocaleType(String str, String str2, Locale locale, boolean z) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z) {
            return null;
        }
        return str2;
    }

    @efb
    public static String getCalendarType(@efb Locale locale) {
        return getCalendarType(locale, true);
    }

    @efb
    public static String getFirstDayOfWeek(@efb Locale locale) {
        return getFirstDayOfWeek(locale, true);
    }

    @efb
    public static String getHourCycle(@efb Locale locale) {
        return getHourCycle(locale, true);
    }

    @efb
    public static String getTemperatureUnit(@efb Locale locale) {
        return getTemperatureUnit(locale, true);
    }

    @efb
    public static String getCalendarType(boolean z) {
        return getCalendarType(C9843b.m17890b(), z);
    }

    @efb
    public static String getFirstDayOfWeek(boolean z) {
        return getFirstDayOfWeek(C9843b.m17890b(), z);
    }

    @efb
    public static String getHourCycle(boolean z) {
        return getHourCycle(C9843b.m17890b(), z);
    }

    @efb
    public static String getTemperatureUnit(boolean z) {
        return getTemperatureUnit(C9843b.m17890b(), z);
    }

    @efb
    public static String getCalendarType(@efb Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(C9845d.f64263a, "", locale, z);
        return unicodeLocaleType != null ? unicodeLocaleType : C9843b.m17889a(locale);
    }

    @efb
    public static String getFirstDayOfWeek(@efb Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(C9846e.f64276a, "", locale, z);
        return unicodeLocaleType != null ? unicodeLocaleType : getBaseFirstDayOfWeek(locale);
    }

    @efb
    public static String getHourCycle(@efb Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(C9847f.f64285a, "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return C9844c.m17891a(locale);
        }
        return getBaseHourCycle(locale);
    }

    @efb
    public static String getTemperatureUnit(@efb Locale locale, boolean z) {
        String unicodeLocaleType = getUnicodeLocaleType(C9848g.f64291a, "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return C9844c.m17892b(locale);
        }
        return getTemperatureHardCoded(locale);
    }
}
