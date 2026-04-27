package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class r2d extends CancellationException {
    public r2d() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(vgg.f91120c);
        return this;
    }
}
