package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class w1d extends CancellationException {

    /* JADX INFO: renamed from: a */
    public static final int f93107a = 0;

    public w1d(long j) {
        super("Timed out waiting for " + j + " ms");
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(vgg.f91120c);
        return this;
    }
}
