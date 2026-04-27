package p000;

/* JADX INFO: renamed from: om */
/* JADX INFO: loaded from: classes.dex */
public final class C10463om {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kl7 f68104a = new kl7(a.f68106a);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final kl7 f68105b = new kl7(b.f68107a);

    /* JADX INFO: renamed from: om$a */
    public /* synthetic */ class a extends n07 implements gz6<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a */
        public static final a f68106a = new a();

        public a() {
            super(2, n3a.class, "min", "min(II)I", 1);
        }

        @yfb
        public final Integer invoke(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return invoke(num.intValue(), num2.intValue());
        }
    }

    /* JADX INFO: renamed from: om$b */
    public /* synthetic */ class b extends n07 implements gz6<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a */
        public static final b f68107a = new b();

        public b() {
            super(2, n3a.class, "max", "max(II)I", 1);
        }

        @yfb
        public final Integer invoke(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return invoke(num.intValue(), num2.intValue());
        }
    }

    @yfb
    public static final kl7 getFirstBaseline() {
        return f68104a;
    }

    @yfb
    public static final kl7 getLastBaseline() {
        return f68105b;
    }

    public static final int merge(@yfb AbstractC9938nm abstractC9938nm, int i, int i2) {
        return abstractC9938nm.getMerger$ui_release().invoke(Integer.valueOf(i), Integer.valueOf(i2)).intValue();
    }
}
