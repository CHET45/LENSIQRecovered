package p000;

/* JADX INFO: loaded from: classes.dex */
public interface um6 {

    /* JADX INFO: renamed from: um6$a */
    public static final class C13598a {
    }

    static /* synthetic */ void clearFocus$default(um6 um6Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        um6Var.clearFocus(z);
    }

    void clearFocus(boolean z);

    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    boolean mo27519moveFocus3ESFkO8(int i);
}
