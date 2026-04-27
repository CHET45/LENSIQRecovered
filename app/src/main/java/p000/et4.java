package p000;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class et4 {

    /* JADX INFO: renamed from: a */
    public static final boolean f34001a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final ThreadLocal<DecimalFormat>[] f34002b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f34002b = threadLocalArr;
    }

    private static final DecimalFormat createFormatForDecimals(int i) {
        DecimalFormat decimalFormat = new DecimalFormat(a43.f347l);
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @yfb
    public static final String formatToExactDecimals(double d, int i) {
        DecimalFormat decimalFormatCreateFormatForDecimals;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f34002b;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormatCreateFormatForDecimals2 = threadLocal.get();
            if (decimalFormatCreateFormatForDecimals2 == null) {
                decimalFormatCreateFormatForDecimals2 = createFormatForDecimals(i);
                threadLocal.set(decimalFormatCreateFormatForDecimals2);
            }
            decimalFormatCreateFormatForDecimals = decimalFormatCreateFormatForDecimals2;
        } else {
            decimalFormatCreateFormatForDecimals = createFormatForDecimals(i);
        }
        String str = decimalFormatCreateFormatForDecimals.format(d);
        md8.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return f34001a;
    }
}
