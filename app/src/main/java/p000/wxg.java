package p000;

import p000.e13;
import p000.nxg;

/* JADX INFO: loaded from: classes7.dex */
public final class wxg<T> implements nxg<T> {

    /* JADX INFO: renamed from: a */
    public final T f95690a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ThreadLocal<T> f95691b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final e13.InterfaceC5041c<?> f95692c;

    public wxg(T t, @yfb ThreadLocal<T> threadLocal) {
        this.f95690a = t;
        this.f95691b = threadLocal;
        this.f95692c = new yxg(threadLocal);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) nxg.C10112a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        if (!md8.areEqual(getKey(), interfaceC5041c)) {
            return null;
        }
        md8.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // p000.e13.InterfaceC5040b
    @yfb
    public e13.InterfaceC5041c<?> getKey() {
        return this.f95692c;
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return md8.areEqual(getKey(), interfaceC5041c) ? a05.f2a : this;
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return nxg.C10112a.plus(this, e13Var);
    }

    @Override // p000.nxg
    public void restoreThreadContext(@yfb e13 e13Var, T t) {
        this.f95691b.set(t);
    }

    @yfb
    public String toString() {
        return "ThreadLocal(value=" + this.f95690a + ", threadLocal = " + this.f95691b + ')';
    }

    @Override // p000.nxg
    public T updateThreadContext(@yfb e13 e13Var) {
        T t = this.f95691b.get();
        this.f95691b.set(this.f95690a);
        return t;
    }
}
