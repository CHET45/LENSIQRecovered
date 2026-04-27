package p000;

/* JADX INFO: loaded from: classes.dex */
public interface qnh extends i2g<Object> {

    /* JADX INFO: renamed from: qnh$a */
    @e0g(parameters = 1)
    public static final class C11570a implements qnh, i2g<Object> {

        /* JADX INFO: renamed from: b */
        public static final int f75022b = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final u90 f75023a;

        public C11570a(@yfb u90 u90Var) {
            this.f75023a = u90Var;
        }

        @Override // p000.qnh
        public boolean getCacheable() {
            return this.f75023a.getCacheable$ui_text_release();
        }

        @yfb
        public final u90 getCurrent$ui_text_release() {
            return this.f75023a;
        }

        @Override // p000.i2g
        @yfb
        public Object getValue() {
            return this.f75023a.getValue();
        }
    }

    boolean getCacheable();

    /* JADX INFO: renamed from: qnh$b */
    @e0g(parameters = 1)
    public static final class C11571b implements qnh {

        /* JADX INFO: renamed from: c */
        public static final int f75024c = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final Object f75025a;

        /* JADX INFO: renamed from: b */
        public final boolean f75026b;

        public C11571b(@yfb Object obj, boolean z) {
            this.f75025a = obj;
            this.f75026b = z;
        }

        @Override // p000.qnh
        public boolean getCacheable() {
            return this.f75026b;
        }

        @Override // p000.i2g
        @yfb
        public Object getValue() {
            return this.f75025a;
        }

        public /* synthetic */ C11571b(Object obj, boolean z, int i, jt3 jt3Var) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
