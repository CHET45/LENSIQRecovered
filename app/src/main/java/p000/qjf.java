package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qjf<T> implements hid<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f74690c = new Object();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ boolean f74691d = false;

    /* JADX INFO: renamed from: a */
    public volatile hid<T> f74692a;

    /* JADX INFO: renamed from: b */
    public volatile Object f74693b = f74690c;

    private qjf(hid<T> hidVar) {
        this.f74692a = hidVar;
    }

    public static <P extends hid<T>, T> hid<T> provider(P p) {
        return ((p instanceof qjf) || (p instanceof zj4)) ? p : new qjf((hid) s7d.checkNotNull(p));
    }

    @Override // p000.hid
    public T get() {
        T t = (T) this.f74693b;
        if (t != f74690c) {
            return t;
        }
        hid<T> hidVar = this.f74692a;
        if (hidVar == null) {
            return (T) this.f74693b;
        }
        T t2 = hidVar.get();
        this.f74693b = t2;
        this.f74692a = null;
        return t2;
    }
}
