package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hn4 {

    /* JADX INFO: renamed from: a */
    public static final hn4 f44192a = new C6914a();

    /* JADX INFO: renamed from: b */
    public static final hn4 f44193b = new C6915b();

    /* JADX INFO: renamed from: c */
    public static final hn4 f44194c = new C6918e();

    /* JADX INFO: renamed from: d */
    public static final hn4 f44195d = new C6916c();

    /* JADX INFO: renamed from: e */
    public static final hn4 f44196e;

    /* JADX INFO: renamed from: f */
    public static final hn4 f44197f;

    /* JADX INFO: renamed from: g */
    public static final hn4 f44198g;

    /* JADX INFO: renamed from: h */
    public static final v6c<hn4> f44199h;

    /* JADX INFO: renamed from: i */
    public static final boolean f44200i;

    /* JADX INFO: renamed from: hn4$a */
    public static class C6914a extends hn4 {
        @Override // p000.hn4
        public EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return EnumC6920g.QUALITY;
        }

        @Override // p000.hn4
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* JADX INFO: renamed from: hn4$b */
    public static class C6915b extends hn4 {
        @Override // p000.hn4
        public EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return EnumC6920g.MEMORY;
        }

        @Override // p000.hn4
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: hn4$c */
    public static class C6916c extends hn4 {
        @Override // p000.hn4
        public EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return getScaleFactor(i, i2, i3, i4) == 1.0f ? EnumC6920g.QUALITY : hn4.f44194c.getSampleSizeRounding(i, i2, i3, i4);
        }

        @Override // p000.hn4
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, hn4.f44194c.getScaleFactor(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: hn4$d */
    public static class C6917d extends hn4 {
        @Override // p000.hn4
        public EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return EnumC6920g.QUALITY;
        }

        @Override // p000.hn4
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: renamed from: hn4$e */
    public static class C6918e extends hn4 {
        @Override // p000.hn4
        public EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return hn4.f44200i ? EnumC6920g.QUALITY : EnumC6920g.MEMORY;
        }

        @Override // p000.hn4
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            if (hn4.f44200i) {
                return Math.min(i3 / i, i4 / i2);
            }
            if (Math.max(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* JADX INFO: renamed from: hn4$f */
    public static class C6919f extends hn4 {
        @Override // p000.hn4
        public EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4) {
            return EnumC6920g.QUALITY;
        }

        @Override // p000.hn4
        public float getScaleFactor(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: hn4$g */
    public enum EnumC6920g {
        MEMORY,
        QUALITY
    }

    static {
        C6917d c6917d = new C6917d();
        f44196e = c6917d;
        f44197f = new C6919f();
        f44198g = c6917d;
        f44199h = v6c.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c6917d);
        f44200i = true;
    }

    public abstract EnumC6920g getSampleSizeRounding(int i, int i2, int i3, int i4);

    public abstract float getScaleFactor(int i, int i2, int i3, int i4);
}
