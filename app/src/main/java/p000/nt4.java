package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class nt4 {

    /* JADX INFO: renamed from: nt4$a */
    public /* synthetic */ class C10052a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65578a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f65578a = iArr;
        }
    }

    @jjf(version = "1.3")
    public static final double convertDurationUnit(double d, @yfb lt4 lt4Var, @yfb lt4 lt4Var2) {
        md8.checkNotNullParameter(lt4Var, "sourceUnit");
        md8.checkNotNullParameter(lt4Var2, "targetUnit");
        long jConvert = lt4Var2.getTimeUnit$kotlin_stdlib().convert(1L, lt4Var.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d * jConvert : d / lt4Var.getTimeUnit$kotlin_stdlib().convert(1L, lt4Var2.getTimeUnit$kotlin_stdlib());
    }

    @jjf(version = "1.5")
    public static final long convertDurationUnitOverflow(long j, @yfb lt4 lt4Var, @yfb lt4 lt4Var2) {
        md8.checkNotNullParameter(lt4Var, "sourceUnit");
        md8.checkNotNullParameter(lt4Var2, "targetUnit");
        return lt4Var2.getTimeUnit$kotlin_stdlib().convert(j, lt4Var.getTimeUnit$kotlin_stdlib());
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.8")
    @yfb
    public static final lt4 toDurationUnit(@yfb TimeUnit timeUnit) {
        md8.checkNotNullParameter(timeUnit, "<this>");
        switch (C10052a.f65578a[timeUnit.ordinal()]) {
            case 1:
                return lt4.f58681b;
            case 2:
                return lt4.f58682c;
            case 3:
                return lt4.f58683d;
            case 4:
                return lt4.f58684e;
            case 5:
                return lt4.f58685f;
            case 6:
                return lt4.f58686m;
            case 7:
                return lt4.f58678C;
            default:
                throw new ceb();
        }
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.8")
    @yfb
    public static final TimeUnit toTimeUnit(@yfb lt4 lt4Var) {
        md8.checkNotNullParameter(lt4Var, "<this>");
        return lt4Var.getTimeUnit$kotlin_stdlib();
    }

    @jjf(version = "1.5")
    public static final long convertDurationUnit(long j, @yfb lt4 lt4Var, @yfb lt4 lt4Var2) {
        md8.checkNotNullParameter(lt4Var, "sourceUnit");
        md8.checkNotNullParameter(lt4Var2, "targetUnit");
        return lt4Var2.getTimeUnit$kotlin_stdlib().convert(j, lt4Var.getTimeUnit$kotlin_stdlib());
    }
}
