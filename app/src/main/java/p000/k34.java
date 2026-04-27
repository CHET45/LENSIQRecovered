package p000;

/* JADX INFO: loaded from: classes7.dex */
public class k34<T> extends sv0<T> {

    /* JADX INFO: renamed from: C */
    public static final int f52494C = 8;

    /* JADX INFO: renamed from: F */
    public static final int f52495F = 16;

    /* JADX INFO: renamed from: H */
    public static final int f52496H = 32;

    /* JADX INFO: renamed from: c */
    public static final int f52497c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f52498d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f52499e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f52500f = 3;

    /* JADX INFO: renamed from: m */
    public static final int f52501m = 4;
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f52502a;

    /* JADX INFO: renamed from: b */
    public T f52503b;

    public k34(ycg<? super T> ycgVar) {
        this.f52502a = ycgVar;
    }

    public void cancel() {
        set(4);
        this.f52503b = null;
    }

    @Override // p000.ajf
    public final void clear() {
        lazySet(32);
        this.f52503b = null;
    }

    public final void complete(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                ycg<? super T> ycgVar = this.f52502a;
                ycgVar.onNext(t);
                if (get() != 4) {
                    ycgVar.onComplete();
                    return;
                }
                return;
            }
            this.f52503b = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.f52503b = null;
                return;
            }
        }
        this.f52503b = t;
        lazySet(16);
        ycg<? super T> ycgVar2 = this.f52502a;
        ycgVar2.onNext(t);
        if (get() != 4) {
            ycgVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // p000.ajf
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p000.ajf
    @cib
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f52503b;
        this.f52503b = null;
        return t;
    }

    @Override // p000.fdg
    public final void request(long j) {
        T t;
        if (mdg.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.f52503b) == null) {
                        return;
                    }
                    this.f52503b = null;
                    ycg<? super T> ycgVar = this.f52502a;
                    ycgVar.onNext(t);
                    if (get() != 4) {
                        ycgVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // p000.wnd
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
