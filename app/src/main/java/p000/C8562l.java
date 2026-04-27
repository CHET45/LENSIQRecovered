package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: classes7.dex */
public final class C8562l extends CancellationException {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final transient Object f55739a;

    public C8562l(@yfb Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f55739a = obj;
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
