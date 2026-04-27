package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rxa extends CancellationException {
    public rxa() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(exa.f34358a);
        return this;
    }
}
