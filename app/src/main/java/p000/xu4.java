package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class xu4<T> extends zhd<T> {

    /* JADX INFO: renamed from: e */
    public static final int f99346e = 0;

    /* JADX INFO: renamed from: d */
    @yfb
    public final qtf<T> f99347d;

    public xu4(@yfb qtf<T> qtfVar, @yfb ny6<? extends T> ny6Var) {
        super(ny6Var);
        this.f99347d = qtfVar;
    }

    @Override // p000.zhd
    @yfb
    public did<T> defaultProvidedValue$runtime_release(T t) {
        return new did<>(this, t, t == null, this.f99347d, null, null, true);
    }
}
