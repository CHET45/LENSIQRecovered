package p000;

import java.io.PrintWriter;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class e1h {

    /* JADX INFO: renamed from: a */
    @p7e({p7e.EnumC10826a.f69936c})
    public static final int f31564a = 19;

    /* JADX INFO: renamed from: b */
    public static final int f31565b = 60;

    /* JADX INFO: renamed from: c */
    public static final int f31566c = 3600;

    /* JADX INFO: renamed from: d */
    public static final int f31567d = 86400;

    /* JADX INFO: renamed from: e */
    public static final Object f31568e = new Object();

    /* JADX INFO: renamed from: f */
    public static char[] f31569f = new char[24];

    private e1h() {
    }

    private static int accumField(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static void formatDuration(long j, StringBuilder sb) {
        synchronized (f31568e) {
            sb.append(f31569f, 0, formatDurationLocked(j, 0));
        }
    }

    private static int formatDurationLocked(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f31569f.length < i) {
            f31569f = new char[i];
        }
        char[] cArr = f31569f;
        if (j2 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i8 = (int) (j2 % 1000);
        int iFloor = (int) Math.floor(j2 / 1000);
        if (iFloor > 86400) {
            i2 = iFloor / 86400;
            iFloor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (iFloor > 3600) {
            i3 = iFloor / 3600;
            iFloor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (iFloor > 60) {
            int i9 = iFloor / 60;
            i4 = iFloor - (i9 * 60);
            i5 = i9;
        } else {
            i4 = iFloor;
            i5 = 0;
        }
        if (i != 0) {
            int iAccumField = accumField(i2, 1, false, 0);
            int iAccumField2 = iAccumField + accumField(i3, 1, iAccumField > 0, 2);
            int iAccumField3 = iAccumField2 + accumField(i5, 1, iAccumField2 > 0, 2);
            int iAccumField4 = iAccumField3 + accumField(i4, 1, iAccumField3 > 0, 2);
            i6 = 0;
            for (int iAccumField5 = iAccumField4 + accumField(i8, 2, true, iAccumField4 > 0 ? 3 : 0) + 1; iAccumField5 < i; iAccumField5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i10 = i6 + 1;
        boolean z = i != 0;
        int iPrintField = printField(cArr, i2, 'd', i10, false, 0);
        int iPrintField2 = printField(cArr, i3, sjc.f82017g, iPrintField, iPrintField != i10, z ? 2 : 0);
        int iPrintField3 = printField(cArr, i5, sjc.f82013c, iPrintField2, iPrintField2 != i10, z ? 2 : 0);
        int iPrintField4 = printField(cArr, i4, sjc.f82023m, iPrintField3, iPrintField3 != i10, z ? 2 : 0);
        int iPrintField5 = printField(cArr, i8, sjc.f82013c, iPrintField4, true, (!z || iPrintField4 == i10) ? 0 : 3);
        cArr[iPrintField5] = sjc.f82023m;
        return iPrintField5 + 1;
    }

    private static int printField(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c;
        return i4 + 2;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        synchronized (f31568e) {
            printWriter.print(new String(f31569f, 0, formatDurationLocked(j, i)));
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static void formatDuration(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }
}
