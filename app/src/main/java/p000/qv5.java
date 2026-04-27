package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class qv5<T> extends g2g<T> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final Throwable f75898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv5(@yfb Throwable th) {
        super(Integer.MAX_VALUE, null);
        md8.checkNotNullParameter(th, "finalException");
        this.f75898b = th;
    }

    @yfb
    public final Throwable getFinalException() {
        return this.f75898b;
    }
}
