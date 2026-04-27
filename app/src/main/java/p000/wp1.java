package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class wp1 extends CancellationException {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final wp1 f95003a = new wp1();

    private wp1() {
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(vgg.f91120c);
        return this;
    }
}
