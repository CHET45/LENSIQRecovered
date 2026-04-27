package p000;

/* JADX INFO: loaded from: classes4.dex */
@ay1
public final class spd implements ksa {

    /* JADX INFO: renamed from: e */
    public static final int f82534e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f82535f = 4;

    /* JADX INFO: renamed from: a */
    public final qsa f82536a;

    /* JADX INFO: renamed from: b */
    public final String f82537b;

    /* JADX INFO: renamed from: c */
    public final Object[] f82538c;

    /* JADX INFO: renamed from: d */
    public final int f82539d;

    public spd(qsa defaultInstance, String info, Object[] objects) {
        this.f82536a = defaultInstance;
        this.f82537b = info;
        this.f82538c = objects;
        char cCharAt = info.charAt(0);
        if (cCharAt < 55296) {
            this.f82539d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = info.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f82539d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Object[] m22171a() {
        return this.f82538c;
    }

    /* JADX INFO: renamed from: b */
    public String m22172b() {
        return this.f82537b;
    }

    @Override // p000.ksa
    public qsa getDefaultInstance() {
        return this.f82536a;
    }

    @Override // p000.ksa
    public hhd getSyntax() {
        int i = this.f82539d;
        return (i & 1) != 0 ? hhd.PROTO2 : (i & 4) == 4 ? hhd.EDITIONS : hhd.PROTO3;
    }

    @Override // p000.ksa
    public boolean isMessageSetWireFormat() {
        return (this.f82539d & 2) == 2;
    }
}
