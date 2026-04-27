package p000;

/* JADX INFO: loaded from: classes3.dex */
@ey1
public final class tpd implements lsa {

    /* JADX INFO: renamed from: e */
    public static final int f85552e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f85553f = 4;

    /* JADX INFO: renamed from: a */
    public final psa f85554a;

    /* JADX INFO: renamed from: b */
    public final String f85555b;

    /* JADX INFO: renamed from: c */
    public final Object[] f85556c;

    /* JADX INFO: renamed from: d */
    public final int f85557d;

    public tpd(psa defaultInstance, String info, Object[] objects) {
        this.f85554a = defaultInstance;
        this.f85555b = info;
        this.f85556c = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.f85557d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = info.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f85557d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Object[] m22741a() {
        return this.f85556c;
    }

    /* JADX INFO: renamed from: b */
    public String m22742b() {
        return this.f85555b;
    }

    @Override // p000.lsa
    public psa getDefaultInstance() {
        return this.f85554a;
    }

    @Override // p000.lsa
    public ihd getSyntax() {
        int i = this.f85557d;
        return (i & 1) != 0 ? ihd.PROTO2 : (i & 4) == 4 ? ihd.EDITIONS : ihd.PROTO3;
    }

    @Override // p000.lsa
    public boolean isMessageSetWireFormat() {
        return (this.f85557d & 2) == 2;
    }
}
