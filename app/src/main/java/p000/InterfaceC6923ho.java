package p000;

/* JADX INFO: renamed from: ho */
/* JADX INFO: loaded from: classes.dex */
@ah5
public interface InterfaceC6923ho {
    static /* synthetic */ void dragTo$default(InterfaceC6923ho interfaceC6923ho, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        interfaceC6923ho.dragTo(f, f2);
    }

    void dragTo(float f, float f2);
}
