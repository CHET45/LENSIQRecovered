package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class whi {

    /* JADX INFO: renamed from: a */
    public static final int f94272a = 1380533830;

    /* JADX INFO: renamed from: b */
    public static final int f94273b = 1463899717;

    /* JADX INFO: renamed from: c */
    public static final int f94274c = 1718449184;

    /* JADX INFO: renamed from: d */
    public static final int f94275d = 1684108385;

    /* JADX INFO: renamed from: e */
    public static final int f94276e = 1380333108;

    /* JADX INFO: renamed from: f */
    public static final int f94277f = 1685272116;

    /* JADX INFO: renamed from: g */
    public static final int f94278g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f94279h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f94280i = 6;

    /* JADX INFO: renamed from: j */
    public static final int f94281j = 7;

    /* JADX INFO: renamed from: k */
    public static final int f94282k = 17;

    /* JADX INFO: renamed from: l */
    public static final int f94283l = 65534;

    private whi() {
    }

    public static int getPcmEncodingForType(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return i2 == 32 ? 4 : 0;
            }
            if (i != 65534) {
                return 0;
            }
        }
        return x0i.getPcmEncoding(i2);
    }

    public static int getTypeForPcmEncoding(int i) {
        if (i == 2 || i == 3) {
            return 1;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 536870912 || i == 805306368) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
