package p000;

/* JADX INFO: loaded from: classes5.dex */
public class o7e {

    /* JADX INFO: renamed from: a */
    public static final int f66623a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f66624b = 1;

    public static int parse(int i) {
        if (i < 200 || i > 299) {
            return ((i < 300 || i > 399) && i >= 400 && i <= 499) ? 0 : 1;
        }
        return 0;
    }
}
