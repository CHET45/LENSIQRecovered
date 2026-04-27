package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xhi {

    /* JADX INFO: renamed from: a */
    public static final int f97893a = 1380533830;

    /* JADX INFO: renamed from: b */
    public static final int f97894b = 1463899717;

    /* JADX INFO: renamed from: c */
    public static final int f97895c = 1718449184;

    /* JADX INFO: renamed from: d */
    public static final int f97896d = 1684108385;

    /* JADX INFO: renamed from: e */
    public static final int f97897e = 1380333108;

    /* JADX INFO: renamed from: f */
    public static final int f97898f = 1685272116;

    /* JADX INFO: renamed from: g */
    public static final int f97899g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f97900h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f97901i = 6;

    /* JADX INFO: renamed from: j */
    public static final int f97902j = 7;

    /* JADX INFO: renamed from: k */
    public static final int f97903k = 17;

    /* JADX INFO: renamed from: l */
    public static final int f97904l = 65534;

    private xhi() {
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
        return t0i.getPcmEncoding(i2);
    }

    public static int getTypeForPcmEncoding(int i) {
        if (i == 2 || i == 3) {
            return 1;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 21 || i == 22) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
