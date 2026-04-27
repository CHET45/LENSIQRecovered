package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class wmf implements n72 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final wmf f94771b = new wmf();

    /* JADX INFO: renamed from: c */
    public static final int f94772c = 10;

    /* JADX INFO: renamed from: d */
    public static final int f94773d = 13;

    /* JADX INFO: renamed from: e */
    public static final int f94774e = 32;

    /* JADX INFO: renamed from: f */
    public static final int f94775f = 65279;

    /* JADX INFO: renamed from: g */
    public static final int f94776g = 0;

    private wmf() {
    }

    @yfb
    public String toString() {
        return "SingleLineCodepointTransformation";
    }

    @Override // p000.n72
    public int transform(int i, int i2) {
        if (i2 == 10) {
            return 32;
        }
        return i2 == 13 ? f94775f : i2;
    }
}
