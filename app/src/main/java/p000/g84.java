package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class g84 extends WeakReference<d84> {

    /* JADX INFO: renamed from: g84$a */
    public interface InterfaceC6163a {
        g84 provide(d84 d84Var);
    }

    public g84(d84 d84Var) {
        super(d84Var);
    }

    /* JADX INFO: renamed from: a */
    public boolean m11432a(Object obj) {
        d84 d84Var = get();
        return (obj instanceof d84) && d84Var != null && d84Var.provideDevice() == ((d84) obj).provideDevice();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakReference)) {
            return false;
        }
        d84 d84Var = get();
        Object obj2 = ((WeakReference) obj).get();
        return d84Var != null && (obj2 instanceof d84) && d84Var.provideDevice().equals(((d84) obj2).provideDevice());
    }

    public int hashCode() {
        if (get() != null) {
            return get().hashCode();
        }
        return 0;
    }

    public boolean isEmpty() {
        return get() == null;
    }

    public g84(d84 d84Var, ReferenceQueue<? super d84> referenceQueue) {
        super(d84Var, referenceQueue);
    }
}
