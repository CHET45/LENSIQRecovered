package p000;

/* JADX INFO: loaded from: classes7.dex */
public class j34<T> extends rv0<T> {

    /* JADX INFO: renamed from: C */
    public static final int f49475C = 8;

    /* JADX INFO: renamed from: F */
    public static final int f49476F = 16;

    /* JADX INFO: renamed from: H */
    public static final int f49477H = 32;

    /* JADX INFO: renamed from: c */
    public static final int f49478c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f49479d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f49480e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f49481f = 3;

    /* JADX INFO: renamed from: m */
    public static final int f49482m = 4;
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f49483a;

    /* JADX INFO: renamed from: b */
    public T f49484b;

    public j34(ycg<? super T> downstream) {
        this.f49483a = downstream;
    }

    public void cancel() {
        set(4);
        this.f49484b = null;
    }

    @Override // p000.zif
    public final void clear() {
        lazySet(32);
        this.f49484b = null;
    }

    public final void complete(T v) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                ycg<? super T> ycgVar = this.f49483a;
                ycgVar.onNext(v);
                if (get() != 4) {
                    ycgVar.onComplete();
                    return;
                }
                return;
            }
            this.f49484b = v;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.f49484b = null;
                return;
            }
        }
        this.f49484b = v;
        lazySet(16);
        ycg<? super T> ycgVar2 = this.f49483a;
        ycgVar2.onNext(null);
        if (get() != 4) {
            ycgVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
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
        lazySet(32);
        T t = this.f49484b;
        this.f49484b = null;
        return t;
    }

    @Override // p000.fdg
    public final void request(long n) {
        T t;
        if (ldg.validate(n)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.f49484b) == null) {
                        return;
                    }
                    this.f49484b = null;
                    ycg<? super T> ycgVar = this.f49483a;
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

    @Override // p000.vnd
    public final int requestFusion(int mode) {
        if ((mode & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
