package p000;

/* JADX INFO: loaded from: classes4.dex */
public final class xj4<T> implements gid<T>, cx8<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f98186c = new Object();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f98187d = false;

    /* JADX INFO: renamed from: a */
    public volatile gid<T> f98188a;

    /* JADX INFO: renamed from: b */
    public volatile Object f98189b = f98186c;

    private xj4(gid<T> gidVar) {
        this.f98188a = gidVar;
    }

    public static <P extends gid<T>, T> cx8<T> lazy(P p) {
        return p instanceof cx8 ? (cx8) p : new xj4((gid) u7d.checkNotNull(p));
    }

    public static <P extends gid<T>, T> gid<T> provider(P p) {
        u7d.checkNotNull(p);
        return p instanceof xj4 ? p : new xj4(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == f98186c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p000.gid
    public T get() {
        T t = (T) this.f98189b;
        Object obj = f98186c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = (T) this.f98189b;
                    if (t == obj) {
                        t = this.f98188a.get();
                        this.f98189b = reentrantCheck(this.f98189b, t);
                        this.f98188a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
