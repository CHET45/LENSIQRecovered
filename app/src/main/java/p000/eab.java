package p000;

import java.util.Map;
import p000.usf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n1#4:2434\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1534#1:2432\n1534#1:2433\n*E\n"})
@e0g(parameters = 0)
public final class eab extends w6b {

    /* JADX INFO: renamed from: v */
    public static final int f32352v = 8;

    /* JADX INFO: renamed from: t */
    @yfb
    public final w6b f32353t;

    /* JADX INFO: renamed from: u */
    public boolean f32354u;

    public eab(int i, @yfb ctf ctfVar, @gib qy6<Object, bth> qy6Var, @gib qy6<Object, bth> qy6Var2, @yfb w6b w6bVar) {
        super(i, ctfVar, qy6Var, qy6Var2);
        this.f32353t = w6bVar;
        w6bVar.mo29704nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (this.f32354u) {
            return;
        }
        this.f32354u = true;
        this.f32353t.mo29705nestedDeactivated$runtime_release(this);
    }

    @Override // p000.w6b
    @yfb
    public usf apply() {
        Map<z2g, ? extends z2g> mapOptimisticMerges;
        if (this.f32353t.getApplied$runtime_release() || this.f32353t.getDisposed$runtime_release()) {
            return new usf.C13694a(this);
        }
        u6b<x2g> modified$runtime_release = getModified$runtime_release();
        int id = getId();
        if (modified$runtime_release != null) {
            w6b w6bVar = this.f32353t;
            mapOptimisticMerges = gtf.optimisticMerges(w6bVar, this, w6bVar.getInvalid$runtime_release());
        } else {
            mapOptimisticMerges = null;
        }
        synchronized (gtf.getLock()) {
            try {
                gtf.validateOpen(this);
                if (modified$runtime_release == null || modified$runtime_release.getSize() == 0) {
                    closeAndReleasePinning$runtime_release();
                } else {
                    usf usfVarInnerApplyLocked$runtime_release = innerApplyLocked$runtime_release(this.f32353t.getId(), mapOptimisticMerges, this.f32353t.getInvalid$runtime_release());
                    if (!md8.areEqual(usfVarInnerApplyLocked$runtime_release, usf.C13695b.f89049b)) {
                        return usfVarInnerApplyLocked$runtime_release;
                    }
                    u6b<x2g> modified$runtime_release2 = this.f32353t.getModified$runtime_release();
                    if (modified$runtime_release2 != null) {
                        modified$runtime_release2.addAll(modified$runtime_release);
                    } else {
                        this.f32353t.setModified(modified$runtime_release);
                        setModified(null);
                    }
                }
                if (this.f32353t.getId() < id) {
                    this.f32353t.advance$runtime_release();
                }
                w6b w6bVar2 = this.f32353t;
                w6bVar2.setInvalid$runtime_release(w6bVar2.getInvalid$runtime_release().clear(id).andNot(getPreviousIds$runtime_release()));
                this.f32353t.recordPrevious$runtime_release(id);
                this.f32353t.recordPreviousPinnedSnapshot$runtime_release(takeoverPinnedSnapshot$runtime_release());
                this.f32353t.recordPreviousList$runtime_release(getPreviousIds$runtime_release());
                this.f32353t.recordPreviousPinnedSnapshots$runtime_release(getPreviousPinnedSnapshots$runtime_release());
                bth bthVar = bth.f14751a;
                setApplied$runtime_release(true);
                deactivate();
                return usf.C13695b.f89049b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.w6b, p000.ssf
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    @yfb
    public final w6b getParent() {
        return this.f32353t;
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    public ssf getRoot() {
        return this.f32353t.getRoot();
    }
}
