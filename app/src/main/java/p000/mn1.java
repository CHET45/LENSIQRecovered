package p000;

import android.content.Context;
import com.haibin.calendarview.C3803b;
import com.haibin.calendarview.C3804c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class mn1 {

    /* JADX INFO: renamed from: a */
    public static final long f61547a = 86400000;

    /* JADX INFO: renamed from: A */
    public static boolean m17444A(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m17445B(int i, int i2, int i3, int i4, int i5, int i6) {
        return i >= i3 && i <= i5 && (i != i3 || i2 >= i4) && (i != i5 || i2 <= i6);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m17446C(gn1 gn1Var) {
        int iM17465s = m17465s(gn1Var);
        return iM17465s == 0 || iM17465s == 6;
    }

    /* JADX INFO: renamed from: a */
    public static int m17447a(int i, int i2, int i3, int i4, int i5, int i6) {
        gn1 gn1Var = new gn1();
        gn1Var.setYear(i);
        gn1Var.setMonth(i2);
        gn1Var.setDay(i3);
        gn1 gn1Var2 = new gn1();
        gn1Var2.setYear(i4);
        gn1Var2.setMonth(i5);
        gn1Var2.setDay(i6);
        return gn1Var.compareTo(gn1Var2);
    }

    /* JADX INFO: renamed from: b */
    public static int m17448b(gn1 gn1Var, gn1 gn1Var2) {
        if (gn1Var == null) {
            return Integer.MIN_VALUE;
        }
        if (gn1Var2 == null) {
            return Integer.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay(), 12, 0, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(gn1Var2.getYear(), gn1Var2.getMonth() - 1, gn1Var2.getDay(), 12, 0, 0);
        return (int) ((timeInMillis - calendar.getTimeInMillis()) / 86400000);
    }

    /* JADX INFO: renamed from: c */
    public static int m17449c(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @igg({"SimpleDateFormat"})
    /* JADX INFO: renamed from: d */
    public static int m17450d(String str, Date date) {
        return Integer.parseInt(new SimpleDateFormat(str).format(date));
    }

    /* JADX INFO: renamed from: e */
    public static gn1 m17451e(int i, C3803b c3803b) {
        gn1 gn1Var = new gn1();
        gn1Var.setYear((((c3803b.m7062z() + i) - 1) / 12) + c3803b.m7058x());
        gn1Var.setMonth((((i + c3803b.m7062z()) - 1) % 12) + 1);
        if (c3803b.m7038n() != 0) {
            int iM17453g = m17453g(gn1Var.getYear(), gn1Var.getMonth());
            gn1 gn1Var2 = c3803b.f23951z0;
            if (gn1Var2 == null || gn1Var2.getDay() == 0) {
                iM17453g = 1;
            } else if (iM17453g >= gn1Var2.getDay()) {
                iM17453g = gn1Var2.getDay();
            }
            gn1Var.setDay(iM17453g);
        } else {
            gn1Var.setDay(1);
        }
        if (!m17472z(gn1Var, c3803b)) {
            gn1Var = isMinRangeEdge(gn1Var, c3803b) ? c3803b.m7054v() : c3803b.m7044q();
        }
        gn1Var.setCurrentMonth(gn1Var.getYear() == c3803b.m7030j().getYear() && gn1Var.getMonth() == c3803b.m7030j().getMonth());
        gn1Var.setCurrentDay(gn1Var.equals(c3803b.m7030j()));
        C3804c.setupLunarCalendar(gn1Var);
        return gn1Var;
    }

    /* JADX INFO: renamed from: f */
    public static gn1 m17452f(int i, int i2, int i3, int i4, int i5) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3, 12, 0);
        long timeInMillis = (((long) ((i4 - 1) * 7)) * 86400000) + calendar.getTimeInMillis();
        calendar.setTimeInMillis(timeInMillis);
        calendar.setTimeInMillis(timeInMillis - (((long) getWeekViewStartDiff(calendar.get(1), calendar.get(2) + 1, calendar.get(5), i5)) * 86400000));
        gn1 gn1Var = new gn1();
        gn1Var.setYear(calendar.get(1));
        gn1Var.setMonth(calendar.get(2) + 1);
        gn1Var.setDay(calendar.get(5));
        return gn1Var;
    }

    /* JADX INFO: renamed from: g */
    public static int m17453g(int i, int i2) {
        int i3 = (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12) ? 31 : 0;
        if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = 30;
        }
        return i2 == 2 ? m17444A(i) ? 29 : 28 : i3;
    }

    private static int getMonthEndDiff(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return 8 - i5;
        }
        if (i5 == 7) {
            return 6;
        }
        return 6 - i5;
    }

    public static int getWeekViewEndDiff(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3, 12, 0);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return 7 - i5;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 0;
            }
            return 8 - i5;
        }
        if (i5 == 7) {
            return 6;
        }
        return 6 - i5;
    }

    private static int getWeekViewStartDiff(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3, 12, 0);
        int i5 = calendar.get(7);
        if (i4 == 1) {
            return i5 - 1;
        }
        if (i4 == 2) {
            if (i5 == 1) {
                return 6;
            }
            return i5 - i4;
        }
        if (i5 == 7) {
            return 0;
        }
        return i5;
    }

    /* JADX INFO: renamed from: h */
    public static int m17454h(int i, int i2, int i3) {
        return getMonthEndDiff(i, i2, m17453g(i, i2), i3);
    }

    /* JADX INFO: renamed from: i */
    public static int m17455i(int i, int i2, int i3, int i4) {
        Calendar.getInstance().set(i, i2 - 1, 1, 12, 0, 0);
        int iM17458l = m17458l(i, i2, i4);
        int iM17453g = m17453g(i, i2);
        return (((iM17458l + iM17453g) + getMonthEndDiff(i, i2, iM17453g, i4)) / 7) * i3;
    }

    private static boolean isMinRangeEdge(gn1 gn1Var, C3803b c3803b) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(c3803b.m7058x(), c3803b.m7062z() - 1, c3803b.m7060y(), 12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay(), 12, 0);
        return calendar.getTimeInMillis() < timeInMillis;
    }

    /* JADX INFO: renamed from: j */
    public static int m17456j(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? i3 * 6 : m17455i(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: k */
    public static int m17457k(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            return 6;
        }
        return ((m17458l(i, i2, i3) + m17453g(i, i2)) + m17454h(i, i2, i3)) / 7;
    }

    /* JADX INFO: renamed from: l */
    public static int m17458l(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, 1, 12, 0, 0);
        int i4 = calendar.get(7);
        if (i3 == 1) {
            return i4 - 1;
        }
        if (i3 == 2) {
            if (i4 == 1) {
                return 6;
            }
            return i4 - i3;
        }
        if (i4 == 7) {
            return 0;
        }
        return i4;
    }

    /* JADX INFO: renamed from: m */
    public static int m17459m(gn1 gn1Var, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, 1, 12, 0, 0);
        int i2 = calendar.get(7);
        if (i == 1) {
            return i2 - 1;
        }
        if (i == 2) {
            if (i2 == 1) {
                return 6;
            }
            return i2 - i;
        }
        if (i2 == 7) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: n */
    public static gn1 m17460n(gn1 gn1Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay(), 12, 0, 0);
        calendar.setTimeInMillis(calendar.getTimeInMillis() + 86400000);
        gn1 gn1Var2 = new gn1();
        gn1Var2.setYear(calendar.get(1));
        gn1Var2.setMonth(calendar.get(2) + 1);
        gn1Var2.setDay(calendar.get(5));
        return gn1Var2;
    }

    /* JADX INFO: renamed from: o */
    public static gn1 m17461o(gn1 gn1Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay(), 12, 0, 0);
        calendar.setTimeInMillis(calendar.getTimeInMillis() - 86400000);
        gn1 gn1Var2 = new gn1();
        gn1Var2.setYear(calendar.get(1));
        gn1Var2.setMonth(calendar.get(2) + 1);
        gn1Var2.setDay(calendar.get(5));
        return gn1Var2;
    }

    /* JADX INFO: renamed from: p */
    public static gn1 m17462p(gn1 gn1Var, C3803b c3803b) {
        return (!m17472z(c3803b.m7030j(), c3803b) || c3803b.m7038n() == 2) ? m17472z(gn1Var, c3803b) ? gn1Var : c3803b.m7054v().isSameMonth(gn1Var) ? c3803b.m7054v() : c3803b.m7044q() : c3803b.m7020e();
    }

    /* JADX INFO: renamed from: q */
    public static List<gn1> m17463q(gn1 gn1Var, C3803b c3803b) {
        long timeInMillis = gn1Var.getTimeInMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay(), 12, 0);
        int iM7004S = calendar.get(7);
        if (c3803b.m7004S() == 1) {
            iM7004S--;
        } else if (c3803b.m7004S() == 2) {
            iM7004S = iM7004S == 1 ? 6 : iM7004S - c3803b.m7004S();
        } else if (iM7004S == 7) {
            iM7004S = 0;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeInMillis - (((long) iM7004S) * 86400000));
        gn1 gn1Var2 = new gn1();
        gn1Var2.setYear(calendar2.get(1));
        gn1Var2.setMonth(calendar2.get(2) + 1);
        gn1Var2.setDay(calendar2.get(5));
        return m17470x(gn1Var2, c3803b, c3803b.m7004S());
    }

    /* JADX INFO: renamed from: r */
    public static int m17464r(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        long timeInMillis = calendar.getTimeInMillis();
        int weekViewStartDiff = getWeekViewStartDiff(i, i2, i3, i7);
        calendar.set(i4, i5 - 1, i6);
        return ((weekViewStartDiff + getWeekViewEndDiff(i4, i5, i6, i7)) + (((int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000)) + 1)) / 7;
    }

    /* JADX INFO: renamed from: s */
    public static int m17465s(gn1 gn1Var) {
        Calendar.getInstance().set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay());
        return r0.get(7) - 1;
    }

    /* JADX INFO: renamed from: t */
    public static int m17466t(gn1 gn1Var, int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        long timeInMillis = calendar.getTimeInMillis();
        int weekViewStartDiff = getWeekViewStartDiff(i, i2, i3, i4);
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, getWeekViewStartDiff(gn1Var.getYear(), gn1Var.getMonth(), gn1Var.getDay(), i4) == 0 ? gn1Var.getDay() + 1 : gn1Var.getDay());
        return ((weekViewStartDiff + ((int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000))) / 7) + 1;
    }

    /* JADX INFO: renamed from: u */
    public static int m17467u(gn1 gn1Var, int i) {
        Calendar.getInstance().set(gn1Var.getYear(), gn1Var.getMonth() - 1, 1, 12, 0, 0);
        return (((gn1Var.getDay() + m17459m(gn1Var, i)) - 1) / 7) + 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m17468v(gn1 gn1Var, int i) {
        return getWeekViewStartDiff(gn1Var.getYear(), gn1Var.getMonth(), gn1Var.getDay(), i);
    }

    /* JADX INFO: renamed from: w */
    public static List<gn1> m17469w(int i, int i2, gn1 gn1Var, int i3) {
        int iM17453g;
        int i4;
        int i5;
        int i6;
        int i7 = i2 - 1;
        Calendar.getInstance().set(i, i7, 1);
        int iM17458l = m17458l(i, i2, i3);
        int iM17453g2 = m17453g(i, i2);
        ArrayList arrayList = new ArrayList();
        int i8 = 12;
        if (i2 == 1) {
            i4 = i - 1;
            int i9 = i2 + 1;
            iM17453g = iM17458l == 0 ? 0 : m17453g(i4, 12);
            i5 = i9;
            i6 = i;
        } else if (i2 == 12) {
            i6 = i + 1;
            iM17453g = iM17458l == 0 ? 0 : m17453g(i, i7);
            i8 = i7;
            i5 = 1;
            i4 = i;
        } else {
            int i10 = i2 + 1;
            i8 = i7;
            iM17453g = iM17458l == 0 ? 0 : m17453g(i, i7);
            i4 = i;
            i5 = i10;
            i6 = i4;
        }
        int i11 = 1;
        for (int i12 = 0; i12 < 42; i12++) {
            gn1 gn1Var2 = new gn1();
            if (i12 < iM17458l) {
                gn1Var2.setYear(i4);
                gn1Var2.setMonth(i8);
                gn1Var2.setDay((iM17453g - iM17458l) + i12 + 1);
            } else if (i12 >= iM17453g2 + iM17458l) {
                gn1Var2.setYear(i6);
                gn1Var2.setMonth(i5);
                gn1Var2.setDay(i11);
                i11++;
            } else {
                gn1Var2.setYear(i);
                gn1Var2.setMonth(i2);
                gn1Var2.setCurrentMonth(true);
                gn1Var2.setDay((i12 - iM17458l) + 1);
            }
            if (gn1Var2.equals(gn1Var)) {
                gn1Var2.setCurrentDay(true);
            }
            C3804c.setupLunarCalendar(gn1Var2);
            arrayList.add(gn1Var2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public static List<gn1> m17470x(gn1 gn1Var, C3803b c3803b, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay(), 12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        ArrayList arrayList = new ArrayList();
        calendar.setTimeInMillis(timeInMillis);
        gn1 gn1Var2 = new gn1();
        gn1Var2.setYear(gn1Var.getYear());
        gn1Var2.setMonth(gn1Var.getMonth());
        gn1Var2.setDay(gn1Var.getDay());
        if (gn1Var2.equals(c3803b.m7030j())) {
            gn1Var2.setCurrentDay(true);
        }
        C3804c.setupLunarCalendar(gn1Var2);
        gn1Var2.setCurrentMonth(true);
        arrayList.add(gn1Var2);
        for (int i2 = 1; i2 <= 6; i2++) {
            calendar.setTimeInMillis((((long) i2) * 86400000) + timeInMillis);
            gn1 gn1Var3 = new gn1();
            gn1Var3.setYear(calendar.get(1));
            gn1Var3.setMonth(calendar.get(2) + 1);
            gn1Var3.setDay(calendar.get(5));
            if (gn1Var3.equals(c3803b.m7030j())) {
                gn1Var3.setCurrentDay(true);
            }
            C3804c.setupLunarCalendar(gn1Var3);
            gn1Var3.setCurrentMonth(true);
            arrayList.add(gn1Var3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m17471y(gn1 gn1Var, int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, i3);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(i4, i5 - 1, i6);
        long timeInMillis2 = calendar.getTimeInMillis();
        calendar.set(gn1Var.getYear(), gn1Var.getMonth() - 1, gn1Var.getDay());
        long timeInMillis3 = calendar.getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m17472z(gn1 gn1Var, C3803b c3803b) {
        return m17471y(gn1Var, c3803b.m7058x(), c3803b.m7062z(), c3803b.m7060y(), c3803b.m7048s(), c3803b.m7052u(), c3803b.m7050t());
    }
}
