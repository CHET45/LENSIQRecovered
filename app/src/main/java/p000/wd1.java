package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wd1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qhg f93969a = new qhg("NO_ELEMENT");

    @yfb
    @xxb
    @q64(level = u64.f86866b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    public static final <E> ud1<E> BroadcastChannel(int i) {
        if (i == -2) {
            return new vd1(au1.f11861h.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        }
        if (i == -1) {
            return new uq2();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i != Integer.MAX_VALUE) {
            return new vd1(i);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
