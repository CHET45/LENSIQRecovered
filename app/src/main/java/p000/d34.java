package p000;

/* JADX INFO: loaded from: classes7.dex */
public class d34<T> extends pv0<T> {

    /* JADX INFO: renamed from: c */
    public static final int f28312c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f28313d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f28314e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f28315f = 16;

    /* JADX INFO: renamed from: m */
    public static final int f28316m = 32;
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: a */
    public final pxb<? super T> f28317a;

    /* JADX INFO: renamed from: b */
    public T f28318b;

    public d34(pxb<? super T> downstream) {
        this.f28317a = downstream;
    }

    @Override // p000.zif
    public final void clear() {
        lazySet(32);
        this.f28318b = null;
    }

    public final void complete(T value) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        pxb<? super T> pxbVar = this.f28317a;
        if (i == 8) {
            this.f28318b = value;
            lazySet(16);
            pxbVar.onNext(null);
        } else {
            lazySet(2);
            pxbVar.onNext(value);
        }
        if (get() != 4) {
            pxbVar.onComplete();
        }
    }

    public void dispose() {
        set(4);
        this.f28318b = null;
    }

    public final void error(Throwable t) {
        if ((get() & 54) != 0) {
            ofe.onError(t);
        } else {
            lazySet(2);
            this.f28317a.onError(t);
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // p000.zif
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p000.zif
    @dib
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t = this.f28318b;
        this.f28318b = null;
        lazySet(32);
        return t;
    }

    @Override // p000.vnd
    public final int requestFusion(int mode) {
        if ((mode & 2) == 0) {
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
        this.f28317a.onComplete();
    }
}
