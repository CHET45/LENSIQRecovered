package p000;

/* JADX INFO: loaded from: classes6.dex */
public class hzb {

    /* JADX INFO: renamed from: a */
    public static long f45302a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f45303b = 500;

    public static boolean isFastClick() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f45302a <= 500) {
            return true;
        }
        f45302a = jCurrentTimeMillis;
        return false;
    }
}
