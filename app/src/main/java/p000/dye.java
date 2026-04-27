package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dye<T> {

    /* JADX INFO: renamed from: d */
    public static final int f31322d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f31323a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final gz6<T, T, T> f31324b;

    /* JADX INFO: renamed from: c */
    public boolean f31325c;

    /* JADX INFO: renamed from: dye$a */
    public static final class C5016a extends tt8 implements gz6<T, T, T> {

        /* JADX INFO: renamed from: a */
        public static final C5016a f31326a = new C5016a();

        public C5016a() {
            super(2);
        }

        @Override // p000.gz6
        @gib
        public final T invoke(@gib T t, T t2) {
            return t == null ? t2 : t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dye(@yfb String str, @yfb gz6<? super T, ? super T, ? extends T> gz6Var) {
        this.f31323a = str;
        this.f31324b = gz6Var;
    }

    @yfb
    public final gz6<T, T, T> getMergePolicy$ui_release() {
        return this.f31324b;
    }

    @yfb
    public final String getName() {
        return this.f31323a;
    }

    public final T getValue(@yfb eye eyeVar, @yfb hp8<?> hp8Var) {
        return (T) bye.throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.f31325c;
    }

    @gib
    public final T merge(@gib T t, T t2) {
        return this.f31324b.invoke(t, t2);
    }

    public final void setValue(@yfb eye eyeVar, @yfb hp8<?> hp8Var, T t) {
        eyeVar.set(this, t);
    }

    @yfb
    public String toString() {
        return "AccessibilityKey: " + this.f31323a;
    }

    public /* synthetic */ dye(String str, gz6 gz6Var, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? C5016a.f31326a : gz6Var);
    }

    public dye(@yfb String str, boolean z) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.f31325c = z;
    }

    public dye(@yfb String str, boolean z, @yfb gz6<? super T, ? super T, ? extends T> gz6Var) {
        this(str, gz6Var);
        this.f31325c = z;
    }
}
