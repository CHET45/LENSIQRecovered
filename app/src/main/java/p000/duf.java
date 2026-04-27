package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,146:1\n89#2:147\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n74#1:147\n*E\n"})
@e0g(parameters = 0)
public final class duf<T> {

    /* JADX INFO: renamed from: d */
    public static final int f30917d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicReference<ayg> f30918a = new AtomicReference<>(byg.getEmptyThreadMap());

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object f30919b = new Object();

    /* JADX INFO: renamed from: c */
    @gib
    public T f30920c;

    @gib
    public final T get() {
        long id = Thread.currentThread().getId();
        return id == C1851be.getMainThreadId() ? this.f30920c : (T) this.f30918a.get().get(id);
    }

    public final void set(@gib T t) {
        long id = Thread.currentThread().getId();
        if (id == C1851be.getMainThreadId()) {
            this.f30920c = t;
            return;
        }
        synchronized (this.f30919b) {
            ayg aygVar = this.f30918a.get();
            if (aygVar.trySet(id, t)) {
                return;
            }
            this.f30918a.set(aygVar.newWith(id, t));
            bth bthVar = bth.f14751a;
        }
    }
}
