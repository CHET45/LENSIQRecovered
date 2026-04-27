package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class oi0 extends ovd<AutoCloseable> {
    private static final long serialVersionUID = -6646144244598696847L;

    public oi0(AutoCloseable value) {
        super(value);
    }

    @Override // p000.ovd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo14065a(@cfb AutoCloseable value) {
        try {
            value.close();
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "AutoCloseableDisposable(disposed=" + isDisposed() + ", " + get() + c0b.f15434d;
    }
}
