package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ho1 extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public ho1(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
