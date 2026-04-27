package p000;

/* JADX INFO: loaded from: classes7.dex */
public class e34<T> extends qv0<T> {

    /* JADX INFO: renamed from: c */
    public static final int f31626c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f31627d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f31628e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f31629f = 16;

    /* JADX INFO: renamed from: m */
    public static final int f31630m = 32;
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: a */
    public final oxb<? super T> f31631a;

    /* JADX INFO: renamed from: b */
    public T f31632b;

    public e34(oxb<? super T> oxbVar) {
        this.f31631a = oxbVar;
    }

    @Override // p000.ajf
    public final void clear() {
        lazySet(32);
        this.f31632b = null;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        oxb<? super T> oxbVar = this.f31631a;
        if (i == 8) {
            this.f31632b = t;
            lazySet(16);
            oxbVar.onNext(null);
        } else {
            lazySet(2);
            oxbVar.onNext(t);
        }
        if (get() != 4) {
            oxbVar.onComplete();
        }
    }

    public void dispose() {
        set(4);
        this.f31632b = null;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            pfe.onError(th);
        } else {
            lazySet(2);
            this.f31631a.onError(th);
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // p000.ajf
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p000.ajf
    @cib
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f31632b;
        this.f31632b = null;
        lazySet(32);
        return t;
    }

    @Override // p000.wnd
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f31631a.onComplete();
    }
}
