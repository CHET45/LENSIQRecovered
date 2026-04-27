package p000;

import p000.h09;
import p000.ssf;
import p000.vvc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n75#2:175\n108#2,2:176\n75#2:178\n108#2,2:179\n81#3:181\n107#3,2:182\n81#3:184\n107#3,2:185\n602#4,8:187\n1#5:195\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n117#1:175\n117#1:176,2\n123#1:178\n123#1:179,2\n128#1:181\n128#1:182,2\n134#1:184\n134#1:185,2\n137#1:187,8\n*E\n"})
public final class f09 implements vvc, vvc.InterfaceC14277a, h09.InterfaceC6669a {

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f34639a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final h09 f34640b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final k5b f34641c = etf.mutableIntStateOf(-1);

    /* JADX INFO: renamed from: d */
    @yfb
    public final k5b f34642d = etf.mutableIntStateOf(0);

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f34643e = xtf.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f34644f = xtf.mutableStateOf$default(null, null, 2, null);

    public f09(@gib Object obj, @yfb h09 h09Var) {
        this.f34639a = obj;
        this.f34640b = h09Var;
    }

    private final vvc.InterfaceC14277a getParentHandle() {
        return (vvc.InterfaceC14277a) this.f34643e.getValue();
    }

    private final int getPinsCount() {
        return this.f34642d.getIntValue();
    }

    private final vvc get_parentPinnableContainer() {
        return (vvc) this.f34644f.getValue();
    }

    private final void setParentHandle(vvc.InterfaceC14277a interfaceC14277a) {
        this.f34643e.setValue(interfaceC14277a);
    }

    private final void setPinsCount(int i) {
        this.f34642d.setIntValue(i);
    }

    private final void set_parentPinnableContainer(vvc vvcVar) {
        this.f34644f.setValue(vvcVar);
    }

    @Override // p000.h09.InterfaceC6669a
    public int getIndex() {
        return this.f34641c.getIntValue();
    }

    @Override // p000.h09.InterfaceC6669a
    @gib
    public Object getKey() {
        return this.f34639a;
    }

    @gib
    public final vvc getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i = 0; i < pinsCount; i++) {
            release();
        }
    }

    @Override // p000.vvc
    @yfb
    public vvc.InterfaceC14277a pin() {
        if (getPinsCount() == 0) {
            this.f34640b.pin$foundation_release(this);
            vvc parentPinnableContainer = getParentPinnableContainer();
            setParentHandle(parentPinnableContainer != null ? parentPinnableContainer.pin() : null);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    @Override // p000.vvc.InterfaceC14277a
    public void release() {
        if (getPinsCount() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        setPinsCount(getPinsCount() - 1);
        if (getPinsCount() == 0) {
            this.f34640b.release$foundation_release(this);
            vvc.InterfaceC14277a parentHandle = getParentHandle();
            if (parentHandle != null) {
                parentHandle.release();
            }
            setParentHandle(null);
        }
    }

    public void setIndex(int i) {
        this.f34641c.setIntValue(i);
    }

    public final void setParentPinnableContainer(@gib vvc vvcVar) {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (vvcVar != get_parentPinnableContainer()) {
                set_parentPinnableContainer(vvcVar);
                if (getPinsCount() > 0) {
                    vvc.InterfaceC14277a parentHandle = getParentHandle();
                    if (parentHandle != null) {
                        parentHandle.release();
                    }
                    setParentHandle(vvcVar != null ? vvcVar.pin() : null);
                }
            }
            bth bthVar = bth.f14751a;
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
