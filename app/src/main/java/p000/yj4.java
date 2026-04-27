package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class yj4<T> implements fid<T>, ex8<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f101785c = new Object();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f101786d = false;

    /* JADX INFO: renamed from: a */
    public volatile fid<T> f101787a;

    /* JADX INFO: renamed from: b */
    public volatile Object f101788b = f101785c;

    private yj4(fid<T> fidVar) {
        this.f101787a = fidVar;
    }

    public static <P extends fid<T>, T> ex8<T> lazy(P p) {
        return p instanceof ex8 ? (ex8) p : new yj4((fid) y7d.checkNotNull(p));
    }

    public static <P extends fid<T>, T> fid<T> provider(P p) {
        y7d.checkNotNull(p);
        return p instanceof yj4 ? p : new yj4(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == f101785c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p000.gid
    public T get() {
        T t = (T) this.f101788b;
        Object obj = f101785c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = (T) this.f101788b;
                    if (t == obj) {
                        t = this.f101787a.get();
                        this.f101788b = reentrantCheck(this.f101788b, t);
                        this.f101787a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }

    public static <P extends gid<T>, T> ex8<T> lazy(P p) {
        return lazy(mid.asDaggerProvider(p));
    }

    @Deprecated
    public static <P extends gid<T>, T> gid<T> provider(P p) {
        return provider(mid.asDaggerProvider(p));
    }
}
