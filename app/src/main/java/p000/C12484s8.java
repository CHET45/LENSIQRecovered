package p000;

/* JADX INFO: renamed from: s8 */
/* JADX INFO: loaded from: classes7.dex */
public final class C12484s8 extends ovd<InterfaceC7776j8> {
    private static final long serialVersionUID = -8219729196779211169L;

    public C12484s8(InterfaceC7776j8 value) {
        super(value);
    }

    @Override // p000.ovd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo14065a(@cfb InterfaceC7776j8 value) {
        try {
            value.run();
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + c0b.f15434d;
    }
}
