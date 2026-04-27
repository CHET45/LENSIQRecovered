package p000;

/* JADX INFO: loaded from: classes3.dex */
public class bjf<T> implements t5e<T> {

    /* JADX INFO: renamed from: a */
    public final T f13886a;

    public bjf(@efb T t) {
        this.f13886a = (T) t7d.checkNotNull(t);
    }

    @Override // p000.t5e
    @efb
    public final T get() {
        return this.f13886a;
    }

    @Override // p000.t5e
    @efb
    public Class<T> getResourceClass() {
        return (Class<T>) this.f13886a.getClass();
    }

    @Override // p000.t5e
    public final int getSize() {
        return 1;
    }

    @Override // p000.t5e
    public void recycle() {
    }
}
