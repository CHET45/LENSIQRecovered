package p000;

/* JADX INFO: renamed from: jh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7898jh {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final d f50507b = new d(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final AbstractC7898jh f50508c = new a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d */
    @yfb
    public static final AbstractC7898jh f50509d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e */
    @yfb
    public static final AbstractC7898jh f50510e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f50511a;

    /* JADX INFO: renamed from: jh$a */
    public static final class a extends AbstractC7898jh {
        public a(float[] fArr) {
            super(fArr, null);
        }

        @yfb
        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: jh$b */
    public static final class b extends AbstractC7898jh {
        public b(float[] fArr) {
            super(fArr, null);
        }

        @yfb
        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: jh$c */
    public static final class c extends AbstractC7898jh {
        public c(float[] fArr) {
            super(fArr, null);
        }

        @yfb
        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: jh$d */
    public static final class d {
        public /* synthetic */ d(jt3 jt3Var) {
            this();
        }

        @yfb
        public final AbstractC7898jh getBradford() {
            return AbstractC7898jh.f50508c;
        }

        @yfb
        public final AbstractC7898jh getCiecat02() {
            return AbstractC7898jh.f50510e;
        }

        @yfb
        public final AbstractC7898jh getVonKries() {
            return AbstractC7898jh.f50509d;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC7898jh(float[] fArr, jt3 jt3Var) {
        this(fArr);
    }

    @yfb
    public final float[] getTransform$ui_graphics_release() {
        return this.f50511a;
    }

    private AbstractC7898jh(float[] fArr) {
        this.f50511a = fArr;
    }
}
