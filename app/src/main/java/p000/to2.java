package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class to2<T> extends zhd<T> {

    /* JADX INFO: renamed from: e */
    public static final int f85434e = 0;

    /* JADX INFO: renamed from: d */
    @yfb
    public final uo2<T> f85435d;

    /* JADX INFO: renamed from: to2$a */
    public static final class C13119a extends tt8 implements ny6<T> {

        /* JADX INFO: renamed from: a */
        public static final C13119a f85436a = new C13119a();

        public C13119a() {
            super(0);
        }

        @Override // p000.ny6
        public final T invoke() {
            gm2.composeRuntimeError("Unexpected call to default provider");
            throw new us8();
        }
    }

    public to2(@yfb qy6<? super ln2, ? extends T> qy6Var) {
        super(C13119a.f85436a);
        this.f85435d = new uo2<>(qy6Var);
    }

    @Override // p000.zhd
    @yfb
    public did<T> defaultProvidedValue$runtime_release(T t) {
        return new did<>(this, t, t == null, null, null, null, true);
    }

    @Override // p000.kn2
    @yfb
    public uo2<T> getDefaultValueHolder$runtime_release() {
        return this.f85435d;
    }
}
