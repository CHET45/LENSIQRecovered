package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: m1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C9074m1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m16545a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
