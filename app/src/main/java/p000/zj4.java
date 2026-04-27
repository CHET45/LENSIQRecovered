package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zj4<T> implements hid<T>, gx8<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f105226c = new Object();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f105227d = false;

    /* JADX INFO: renamed from: a */
    public volatile hid<T> f105228a;

    /* JADX INFO: renamed from: b */
    public volatile Object f105229b = f105226c;

    private zj4(hid<T> hidVar) {
        this.f105228a = hidVar;
    }

    public static <P extends hid<T>, T> gx8<T> lazy(P p) {
        return p instanceof gx8 ? (gx8) p : new zj4((hid) s7d.checkNotNull(p));
    }

    public static <P extends hid<T>, T> hid<T> provider(P p) {
        s7d.checkNotNull(p);
        return p instanceof zj4 ? p : new zj4(p);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == f105226c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p000.hid
    public T get() {
        T t = (T) this.f105229b;
        Object obj = f105226c;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = (T) this.f105229b;
                    if (t == obj) {
                        t = this.f105228a.get();
                        this.f105229b = reentrantCheck(this.f105229b, t);
                        this.f105228a = null;
                    }
                } finally {
                }
            }
        }
        return t;
    }
}
