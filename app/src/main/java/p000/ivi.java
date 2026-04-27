package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class ivi implements hvi {

    /* JADX INFO: renamed from: b */
    public static final ivi f48638b = new ivi(null);

    /* JADX INFO: renamed from: a */
    public final Object f48639a;

    private ivi(Object obj) {
        this.f48639a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static hvi m13459b(Object obj) {
        if (obj != null) {
            return new ivi(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p000.kvi
    /* JADX INFO: renamed from: a */
    public final Object mo6632a() {
        return this.f48639a;
    }
}
