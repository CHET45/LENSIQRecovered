package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class uy1 extends CancellationException {
    public uy1() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
