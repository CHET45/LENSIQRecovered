package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lde extends ovd<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public lde(Runnable value) {
        super(value);
    }

    @Override // p000.ovd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo14065a(@cfb Runnable value) {
        value.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + c0b.f15434d;
    }
}
