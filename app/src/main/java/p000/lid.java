package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class lid<T> implements hid<gx8<T>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ boolean f57710b = false;

    /* JADX INFO: renamed from: a */
    public final hid<T> f57711a;

    private lid(hid<T> hidVar) {
        this.f57711a = hidVar;
    }

    public static <T> hid<gx8<T>> create(hid<T> hidVar) {
        return new lid((hid) s7d.checkNotNull(hidVar));
    }

    @Override // p000.hid
    public gx8<T> get() {
        return zj4.lazy(this.f57711a);
    }
}
