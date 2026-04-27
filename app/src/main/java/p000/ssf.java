package p000;

import java.util.Collection;
import java.util.Set;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2441\n89#3:2433\n89#3:2442\n50#4,7:2434\n33#4,7:2443\n1#5:2450\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n100#1:2432\n251#1:2441\n100#1:2433\n251#1:2442\n186#1:2434,7\n280#1:2443,7\n*E\n"})
@e0g(parameters = 0)
public abstract class ssf {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C12771a f82790e = new C12771a(null);

    /* JADX INFO: renamed from: f */
    public static final int f82791f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f82792g = 1;

    /* JADX INFO: renamed from: a */
    @yfb
    public ctf f82793a;

    /* JADX INFO: renamed from: b */
    public int f82794b;

    /* JADX INFO: renamed from: c */
    public boolean f82795c;

    /* JADX INFO: renamed from: d */
    public int f82796d;

    /* JADX INFO: renamed from: ssf$a */
    @dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n547#1:2438\n547#1:2444\n550#1:2445\n1#2:2432\n138#3,5:2433\n138#3,5:2439\n1843#4:2446\n1843#4:2448\n1843#4:2450\n1843#4:2452\n1843#4:2454\n89#5:2447\n89#5:2449\n89#5:2451\n89#5:2453\n89#5:2455\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n493#1:2438\n555#1:2444\n559#1:2445\n462#1:2433,5\n529#1:2439,5\n623#1:2446\n650#1:2448\n688#1:2450\n627#1:2452\n655#1:2454\n623#1:2447\n650#1:2449\n688#1:2451\n627#1:2453\n655#1:2455\n*E\n"})
    public static final class C12771a {
        public /* synthetic */ C12771a(jt3 jt3Var) {
            this();
        }

        private final boolean getCanBeReused(xgh xghVar) {
            return xghVar.getThreadId$runtime_release() == C5737fe.currentThreadId();
        }

        @yjd
        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(C12771a c12771a, qy6 qy6Var, qy6 qy6Var2, ny6 ny6Var, int i, Object obj) {
            if ((i & 1) != 0) {
                qy6Var = null;
            }
            if ((i & 2) != 0) {
                qy6Var2 = null;
            }
            return c12771a.observe(qy6Var, qy6Var2, ny6Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$6(gz6 gz6Var) {
            synchronized (gtf.getLock()) {
                gtf.f41103i = v82.minus(gtf.f41103i, gz6Var);
                bth bthVar = bth.f14751a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$9(qy6 qy6Var) {
            synchronized (gtf.getLock()) {
                gtf.f41104j = v82.minus(gtf.f41104j, qy6Var);
                bth bthVar = bth.f14751a;
            }
            gtf.advanceGlobalSnapshot();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ w6b takeMutableSnapshot$default(C12771a c12771a, qy6 qy6Var, qy6 qy6Var2, int i, Object obj) {
            if ((i & 1) != 0) {
                qy6Var = null;
            }
            if ((i & 2) != 0) {
                qy6Var2 = null;
            }
            return c12771a.takeMutableSnapshot(qy6Var, qy6Var2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ssf takeSnapshot$default(C12771a c12771a, qy6 qy6Var, int i, Object obj) {
            if ((i & 1) != 0) {
                qy6Var = null;
            }
            return c12771a.takeSnapshot(qy6Var);
        }

        @yfb
        @yjd
        public final ssf createNonObservableSnapshot() {
            return gtf.m11988a((ssf) gtf.f41097c.get(), null, false, 6, null);
        }

        @yfb
        public final ssf getCurrent() {
            return gtf.currentSnapshot();
        }

        @gib
        public final ssf getCurrentThreadSnapshot() {
            return (ssf) gtf.f41097c.get();
        }

        public final <T> T global(@yfb ny6<? extends T> ny6Var) {
            ssf ssfVarRemoveCurrent = removeCurrent();
            T tInvoke = ny6Var.invoke();
            ssf.f82790e.restoreCurrent(ssfVarRemoveCurrent);
            return tInvoke;
        }

        public final boolean isApplyObserverNotificationPending() {
            return gtf.f41107m.get() > 0;
        }

        public final boolean isInSnapshot() {
            return gtf.f41097c.get() != null;
        }

        @yfb
        @yjd
        public final ssf makeCurrentNonObservable(@gib ssf ssfVar) {
            if (ssfVar instanceof xgh) {
                xgh xghVar = (xgh) ssfVar;
                if (xghVar.getThreadId$runtime_release() == C5737fe.currentThreadId()) {
                    xghVar.setReadObserver(null);
                    return ssfVar;
                }
            }
            if (ssfVar instanceof ygh) {
                ygh yghVar = (ygh) ssfVar;
                if (yghVar.getThreadId$runtime_release() == C5737fe.currentThreadId()) {
                    yghVar.setReadObserver(null);
                    return ssfVar;
                }
            }
            ssf ssfVarM11988a = gtf.m11988a(ssfVar, null, false, 6, null);
            ssfVarM11988a.makeCurrent();
            return ssfVarM11988a;
        }

        public final void notifyObjectsInitialized() {
            gtf.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@gib qy6<Object, bth> qy6Var, @gib qy6<Object, bth> qy6Var2, @yfb ny6<? extends T> ny6Var) {
            ssf xghVar;
            if (qy6Var == null && qy6Var2 == null) {
                return ny6Var.invoke();
            }
            ssf ssfVar = (ssf) gtf.f41097c.get();
            if (ssfVar instanceof xgh) {
                xgh xghVar2 = (xgh) ssfVar;
                if (xghVar2.getThreadId$runtime_release() == C5737fe.currentThreadId()) {
                    qy6<Object, bth> readObserver$runtime_release = xghVar2.getReadObserver();
                    qy6<Object, bth> writeObserver$runtime_release = xghVar2.getWriteObserver$runtime_release();
                    try {
                        ((xgh) ssfVar).setReadObserver(gtf.m11989b(qy6Var, readObserver$runtime_release, false, 4, null));
                        ((xgh) ssfVar).setWriteObserver(gtf.mergedWriteObserver(qy6Var2, writeObserver$runtime_release));
                        return ny6Var.invoke();
                    } finally {
                        xghVar2.setReadObserver(readObserver$runtime_release);
                        xghVar2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (ssfVar == null || (ssfVar instanceof w6b)) {
                xghVar = new xgh(ssfVar instanceof w6b ? (w6b) ssfVar : null, qy6Var, qy6Var2, true, false);
            } else {
                if (qy6Var == null) {
                    return ny6Var.invoke();
                }
                xghVar = ssfVar.takeNestedSnapshot(qy6Var);
            }
            try {
                ssf ssfVarMakeCurrent = xghVar.makeCurrent();
                try {
                    return ny6Var.invoke();
                } finally {
                    xghVar.restoreCurrent(ssfVarMakeCurrent);
                }
            } finally {
                xghVar.dispose();
            }
        }

        @ga8
        public final int openSnapshotCount() {
            return v82.toList(gtf.f41099e).size();
        }

        @yfb
        public final rxb registerApplyObserver(@yfb final gz6<? super Set<? extends Object>, ? super ssf, bth> gz6Var) {
            gtf.advanceGlobalSnapshot(gtf.f41095a);
            synchronized (gtf.getLock()) {
                gtf.f41103i = v82.plus((Collection<? extends gz6<? super Set<? extends Object>, ? super ssf, bth>>) gtf.f41103i, gz6Var);
                bth bthVar = bth.f14751a;
            }
            return new rxb() { // from class: qsf
                @Override // p000.rxb
                public final void dispose() {
                    ssf.C12771a.registerApplyObserver$lambda$6(gz6Var);
                }
            };
        }

        @yfb
        public final rxb registerGlobalWriteObserver(@yfb final qy6<Object, bth> qy6Var) {
            synchronized (gtf.getLock()) {
                gtf.f41104j = v82.plus((Collection<? extends qy6<Object, bth>>) gtf.f41104j, qy6Var);
                bth bthVar = bth.f14751a;
            }
            gtf.advanceGlobalSnapshot();
            return new rxb() { // from class: rsf
                @Override // p000.rxb
                public final void dispose() {
                    ssf.C12771a.registerGlobalWriteObserver$lambda$9(qy6Var);
                }
            };
        }

        @gib
        @yjd
        public final ssf removeCurrent() {
            ssf ssfVar = (ssf) gtf.f41097c.get();
            if (ssfVar != null) {
                gtf.f41097c.set(null);
            }
            return ssfVar;
        }

        @yjd
        public final void restoreCurrent(@gib ssf ssfVar) {
            if (ssfVar != null) {
                gtf.f41097c.set(ssfVar);
            }
        }

        @yjd
        public final void restoreNonObservable(@gib ssf ssfVar, @yfb ssf ssfVar2, @gib qy6<Object, bth> qy6Var) {
            if (ssfVar != ssfVar2) {
                ssfVar2.restoreCurrent(ssfVar);
                ssfVar2.dispose();
            } else if (ssfVar instanceof xgh) {
                ((xgh) ssfVar).setReadObserver(qy6Var);
            } else {
                if (ssfVar instanceof ygh) {
                    ((ygh) ssfVar).setReadObserver(qy6Var);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + ssfVar).toString());
            }
        }

        public final void sendApplyNotifications() {
            boolean z;
            synchronized (gtf.getLock()) {
                u6b<x2g> modified$runtime_release = ((r77) gtf.f41105k.get()).getModified$runtime_release();
                z = false;
                if (modified$runtime_release != null) {
                    if (modified$runtime_release.isNotEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                gtf.advanceGlobalSnapshot();
            }
        }

        @yfb
        public final w6b takeMutableSnapshot(@gib qy6<Object, bth> qy6Var, @gib qy6<Object, bth> qy6Var2) {
            w6b w6bVarTakeNestedMutableSnapshot;
            ssf ssfVarCurrentSnapshot = gtf.currentSnapshot();
            w6b w6bVar = ssfVarCurrentSnapshot instanceof w6b ? (w6b) ssfVarCurrentSnapshot : null;
            if (w6bVar == null || (w6bVarTakeNestedMutableSnapshot = w6bVar.takeNestedMutableSnapshot(qy6Var, qy6Var2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return w6bVarTakeNestedMutableSnapshot;
        }

        @yfb
        public final ssf takeSnapshot(@gib qy6<Object, bth> qy6Var) {
            return gtf.currentSnapshot().takeNestedSnapshot(qy6Var);
        }

        public final <R> R withMutableSnapshot(@yfb ny6<? extends R> ny6Var) {
            w6b w6bVarTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                ssf ssfVarMakeCurrent = w6bVarTakeMutableSnapshot$default.makeCurrent();
                try {
                    R rInvoke = ny6Var.invoke();
                    o28.finallyStart(1);
                    w6bVarTakeMutableSnapshot$default.restoreCurrent(ssfVarMakeCurrent);
                    o28.finallyEnd(1);
                    w6bVarTakeMutableSnapshot$default.apply().check();
                    return rInvoke;
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    w6bVarTakeMutableSnapshot$default.restoreCurrent(ssfVarMakeCurrent);
                    o28.finallyEnd(1);
                    throw th;
                }
            } finally {
                o28.finallyStart(1);
                w6bVarTakeMutableSnapshot$default.dispose();
                o28.finallyEnd(1);
            }
        }

        public final <T> T withoutReadObservation(@yfb ny6<? extends T> ny6Var) {
            ssf currentThreadSnapshot = getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return ny6Var.invoke();
            } finally {
                o28.finallyStart(1);
                restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                o28.finallyEnd(1);
            }
        }

        private C12771a() {
        }

        private final boolean getCanBeReused(ygh yghVar) {
            return yghVar.getThreadId$runtime_release() == C5737fe.currentThreadId();
        }
    }

    public /* synthetic */ ssf(int i, ctf ctfVar, jt3 jt3Var) {
        this(i, ctfVar);
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    @yjd
    public static /* synthetic */ void getReadObserver$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ssf takeNestedSnapshot$default(ssf ssfVar, qy6 qy6Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i & 1) != 0) {
            qy6Var = null;
        }
        return ssfVar.takeNestedSnapshot(qy6Var);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (gtf.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            bth bthVar = bth.f14751a;
        }
    }

    public void closeLocked$runtime_release() {
        gtf.f41099e = gtf.f41099e.clear(getId());
    }

    public void dispose() {
        this.f82795c = true;
        synchronized (gtf.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            bth bthVar = bth.f14751a;
        }
    }

    public final <T> T enter(@yfb ny6<? extends T> ny6Var) {
        ssf ssfVarMakeCurrent = makeCurrent();
        try {
            return ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            restoreCurrent(ssfVarMakeCurrent);
            o28.finallyEnd(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.f82795c;
    }

    public int getId() {
        return this.f82794b;
    }

    @yfb
    public ctf getInvalid$runtime_release() {
        return this.f82793a;
    }

    @gib
    public abstract u6b<x2g> getModified$runtime_release();

    @gib
    public abstract qy6<Object, bth> getReadObserver();

    public abstract boolean getReadOnly();

    @yfb
    public abstract ssf getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    @gib
    public abstract qy6<Object, bth> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.f82796d >= 0;
    }

    @gib
    @yjd
    public ssf makeCurrent() {
        ssf ssfVar = (ssf) gtf.f41097c.get();
        gtf.f41097c.set(this);
        return ssfVar;
    }

    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public abstract void mo29704nestedActivated$runtime_release(@yfb ssf ssfVar);

    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public abstract void mo29705nestedDeactivated$runtime_release(@yfb ssf ssfVar);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* JADX INFO: renamed from: recordModified$runtime_release */
    public abstract void mo29706recordModified$runtime_release(@yfb x2g x2gVar);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i = this.f82796d;
        if (i >= 0) {
            gtf.releasePinningLocked(i);
            this.f82796d = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    @yjd
    public void restoreCurrent(@gib ssf ssfVar) {
        gtf.f41097c.set(ssfVar);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.f82795c = z;
    }

    public void setId$runtime_release(int i) {
        this.f82794b = i;
    }

    public void setInvalid$runtime_release(@yfb ctf ctfVar) {
        this.f82793a = ctfVar;
    }

    public void setWriteCount$runtime_release(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    @yfb
    public abstract ssf takeNestedSnapshot(@gib qy6<Object, bth> qy6Var);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i = this.f82796d;
        this.f82796d = -1;
        return i;
    }

    @gib
    @sg5
    public final ssf unsafeEnter() {
        return makeCurrent();
    }

    @sg5
    public final void unsafeLeave(@gib ssf ssfVar) {
        if (!(gtf.f41097c.get() == this)) {
            a8d.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(ssfVar);
    }

    public final void validateNotDisposed$runtime_release() {
        if (this.f82795c) {
            a8d.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    private ssf(int i, ctf ctfVar) {
        this.f82793a = ctfVar;
        this.f82794b = i;
        this.f82796d = i != 0 ? gtf.trackPinning(i, getInvalid$runtime_release()) : -1;
    }
}
