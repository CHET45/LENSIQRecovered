package p000;

import android.content.Context;
import com.google.android.material.C3146R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class jj3 {
    private jj3() {
    }

    /* JADX INFO: renamed from: a */
    public static tcc<String, String> m14117a(@hib Long l, @hib Long l2) {
        return m14118b(l, l2, null);
    }

    /* JADX INFO: renamed from: b */
    public static tcc<String, String> m14118b(@hib Long l, @hib Long l2, @hib SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return tcc.create(null, null);
        }
        if (l == null) {
            return tcc.create(null, m14120d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return tcc.create(m14120d(l.longValue(), simpleDateFormat), null);
        }
        Calendar calendarM14406o = jzh.m14406o();
        Calendar calendarM14407p = jzh.m14407p();
        calendarM14407p.setTimeInMillis(l.longValue());
        Calendar calendarM14407p2 = jzh.m14407p();
        calendarM14407p2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return tcc.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        }
        return calendarM14407p.get(1) == calendarM14407p2.get(1) ? calendarM14407p.get(1) == calendarM14406o.get(1) ? tcc.create(m14123g(l.longValue(), Locale.getDefault()), m14123g(l2.longValue(), Locale.getDefault())) : tcc.create(m14123g(l.longValue(), Locale.getDefault()), m14130n(l2.longValue(), Locale.getDefault())) : tcc.create(m14130n(l.longValue(), Locale.getDefault()), m14130n(l2.longValue(), Locale.getDefault()));
    }

    /* JADX INFO: renamed from: c */
    public static String m14119c(long j) {
        return m14120d(j, null);
    }

    /* JADX INFO: renamed from: d */
    public static String m14120d(long j, @hib SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j)) : isDateWithinCurrentYear(j) ? m14122f(j) : m14129m(j);
    }

    /* JADX INFO: renamed from: e */
    public static String m14121e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String strM14126j = m14126j(j);
        if (z) {
            strM14126j = String.format(context.getString(C3146R.string.mtrl_picker_today_description), strM14126j);
        }
        return z2 ? String.format(context.getString(C3146R.string.mtrl_picker_start_date_description), strM14126j) : z3 ? String.format(context.getString(C3146R.string.mtrl_picker_end_date_description), strM14126j) : strM14126j;
    }

    /* JADX INFO: renamed from: f */
    public static String m14122f(long j) {
        return m14123g(j, Locale.getDefault());
    }

    /* JADX INFO: renamed from: g */
    public static String m14123g(long j, Locale locale) {
        return jzh.m14393b(locale).format(new Date(j));
    }

    /* JADX INFO: renamed from: h */
    public static String m14124h(long j) {
        return m14125i(j, Locale.getDefault());
    }

    /* JADX INFO: renamed from: i */
    public static String m14125i(long j, Locale locale) {
        return jzh.m14394c(locale).format(new Date(j));
    }

    private static boolean isDateWithinCurrentYear(long j) {
        Calendar calendarM14406o = jzh.m14406o();
        Calendar calendarM14407p = jzh.m14407p();
        calendarM14407p.setTimeInMillis(j);
        return calendarM14406o.get(1) == calendarM14407p.get(1);
    }

    /* JADX INFO: renamed from: j */
    public static String m14126j(long j) {
        return isDateWithinCurrentYear(j) ? m14124h(j) : m14131o(j);
    }

    /* JADX INFO: renamed from: k */
    public static String m14127k(Context context, int i) {
        return jzh.m14406o().get(1) == i ? String.format(context.getString(C3146R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i)) : String.format(context.getString(C3146R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: l */
    public static String m14128l(long j) {
        return jzh.m14411t(Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: m */
    public static String m14129m(long j) {
        return m14130n(j, Locale.getDefault());
    }

    /* JADX INFO: renamed from: n */
    public static String m14130n(long j, Locale locale) {
        return jzh.m14409r(locale).format(new Date(j));
    }

    /* JADX INFO: renamed from: o */
    public static String m14131o(long j) {
        return m14132p(j, Locale.getDefault());
    }

    /* JADX INFO: renamed from: p */
    public static String m14132p(long j, Locale locale) {
        return jzh.m14410s(locale).format(new Date(j));
    }
}
