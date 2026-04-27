package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vh7<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: a */
    @un8
    public final int f91199a;

    public vh7(T t, @gib ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.f91199a = t != null ? t.hashCode() : 0;
    }
}
