package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class sqd<T> extends g2g<T> {

    /* JADX INFO: renamed from: b */
    @yfb
    public final Throwable f82631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqd(@yfb Throwable th, int i) {
        super(i, null);
        md8.checkNotNullParameter(th, "readException");
        this.f82631b = th;
    }

    @yfb
    public final Throwable getReadException() {
        return this.f82631b;
    }
}
