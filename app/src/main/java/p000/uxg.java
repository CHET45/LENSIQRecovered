package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 2)
public final class uxg<T> extends ThreadLocal<T> {

    /* JADX INFO: renamed from: b */
    public static final int f89425b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<T> f89426a;

    /* JADX WARN: Multi-variable type inference failed */
    public uxg(@yfb ny6<? extends T> ny6Var) {
        this.f89426a = ny6Var;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    @gib
    public T initialValue() {
        return this.f89426a.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T t) {
        super.set(t);
    }
}
