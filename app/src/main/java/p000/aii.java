package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,77:1\n1208#2:78\n1187#2,2:79\n728#3,2:81\n48#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:78\n29#1:79,2\n38#1:81,2\n49#1:83\n*E\n"})
@e0g(parameters = 0)
public final class aii<T> {

    /* JADX INFO: renamed from: c */
    public static final int f1680c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<Reference<T>> f1681a = new f7b<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b */
    @yfb
    public final ReferenceQueue<T> f1682b = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.f1682b.poll();
            if (referencePoll != null) {
                this.f1681a.remove(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.f1681a.getSize();
    }

    @gib
    public final T pop() {
        clearWeakReferences();
        while (this.f1681a.isNotEmpty()) {
            T t = this.f1681a.removeAt(r0.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void push(T t) {
        clearWeakReferences();
        this.f1681a.add(new WeakReference(t, this.f1682b));
    }
}
