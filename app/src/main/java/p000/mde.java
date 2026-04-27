package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mde extends pvd<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public mde(Runnable runnable) {
        super(runnable);
    }

    @Override // p000.pvd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo14662a(@bfb Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + c0b.f15434d;
    }
}
