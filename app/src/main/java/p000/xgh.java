package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class xgh extends w6b {

    /* JADX INFO: renamed from: z */
    public static final int f97768z = 8;

    /* JADX INFO: renamed from: t */
    @gib
    public final w6b f97769t;

    /* JADX INFO: renamed from: u */
    public final boolean f97770u;

    /* JADX INFO: renamed from: v */
    public final boolean f97771v;

    /* JADX INFO: renamed from: w */
    @gib
    public qy6<Object, bth> f97772w;

    /* JADX INFO: renamed from: x */
    @gib
    public qy6<Object, bth> f97773x;

    /* JADX INFO: renamed from: y */
    public final long f97774y;

    public xgh(@gib w6b w6bVar, @gib qy6<Object, bth> qy6Var, @gib qy6<Object, bth> qy6Var2, boolean z, boolean z2) {
        qy6<Object, bth> writeObserver$runtime_release;
        qy6<Object, bth> readObserver;
        super(0, ctf.f27527e.getEMPTY(), gtf.mergedReadObserver(qy6Var, (w6bVar == null || (readObserver = w6bVar.getReadObserver()) == null) ? ((r77) gtf.f41105k.get()).getReadObserver() : readObserver, z), gtf.mergedWriteObserver(qy6Var2, (w6bVar == null || (writeObserver$runtime_release = w6bVar.getWriteObserver$runtime_release()) == null) ? ((r77) gtf.f41105k.get()).getWriteObserver$runtime_release() : writeObserver$runtime_release));
        this.f97769t = w6bVar;
        this.f97770u = z;
        this.f97771v = z2;
        this.f97772w = super.getReadObserver();
        this.f97773x = super.getWriteObserver$runtime_release();
        this.f97774y = C5737fe.currentThreadId();
    }

    private final w6b getCurrentSnapshot() {
        w6b w6bVar = this.f97769t;
        return w6bVar == null ? (w6b) gtf.f41105k.get() : w6bVar;
    }

    @Override // p000.w6b
    @yfb
    public usf apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // p000.w6b, p000.ssf
    public void dispose() {
        w6b w6bVar;
        setDisposed$runtime_release(true);
        if (!this.f97771v || (w6bVar = this.f97769t) == null) {
            return;
        }
        w6bVar.dispose();
    }

    @Override // p000.ssf
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // p000.ssf
    @yfb
    public ctf getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // p000.w6b, p000.ssf
    @gib
    public u6b<x2g> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // p000.w6b, p000.ssf
    @gib
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public qy6<Object, bth> getReadObserver() {
        return this.f97772w;
    }

    @Override // p000.w6b, p000.ssf
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    public final long getThreadId$runtime_release() {
        return this.f97774y;
    }

    @Override // p000.w6b, p000.ssf
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // p000.w6b, p000.ssf
    @gib
    public qy6<Object, bth> getWriteObserver$runtime_release() {
        return this.f97773x;
    }

    @Override // p000.w6b, p000.ssf
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // p000.w6b, p000.ssf
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // p000.w6b, p000.ssf
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo29706recordModified$runtime_release(@yfb x2g x2gVar) {
        getCurrentSnapshot().mo29706recordModified$runtime_release(x2gVar);
    }

    @Override // p000.ssf
    public void setId$runtime_release(int i) {
        buf.unsupported();
        throw new us8();
    }

    @Override // p000.ssf
    public void setInvalid$runtime_release(@yfb ctf ctfVar) {
        buf.unsupported();
        throw new us8();
    }

    @Override // p000.w6b
    public void setModified(@gib u6b<x2g> u6bVar) {
        buf.unsupported();
        throw new us8();
    }

    public void setReadObserver(@gib qy6<Object, bth> qy6Var) {
        this.f97772w = qy6Var;
    }

    @Override // p000.w6b, p000.ssf
    public void setWriteCount$runtime_release(int i) {
        getCurrentSnapshot().setWriteCount$runtime_release(i);
    }

    public void setWriteObserver(@gib qy6<Object, bth> qy6Var) {
        this.f97773x = qy6Var;
    }

    @Override // p000.w6b
    @yfb
    public w6b takeNestedMutableSnapshot(@gib qy6<Object, bth> qy6Var, @gib qy6<Object, bth> qy6Var2) {
        qy6<Object, bth> qy6VarM11989b = gtf.m11989b(qy6Var, getReadObserver(), false, 4, null);
        qy6<Object, bth> qy6VarMergedWriteObserver = gtf.mergedWriteObserver(qy6Var2, getWriteObserver$runtime_release());
        return !this.f97770u ? new xgh(getCurrentSnapshot().takeNestedMutableSnapshot(null, qy6VarMergedWriteObserver), qy6VarM11989b, qy6VarMergedWriteObserver, false, true) : getCurrentSnapshot().takeNestedMutableSnapshot(qy6VarM11989b, qy6VarMergedWriteObserver);
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    public ssf takeNestedSnapshot(@gib qy6<Object, bth> qy6Var) {
        qy6<Object, bth> qy6VarM11989b = gtf.m11989b(qy6Var, getReadObserver(), false, 4, null);
        return !this.f97770u ? gtf.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), qy6VarM11989b, true) : getCurrentSnapshot().takeNestedSnapshot(qy6VarM11989b);
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29704nestedActivated$runtime_release(@yfb ssf ssfVar) {
        buf.unsupported();
        throw new us8();
    }

    @Override // p000.w6b, p000.ssf
    @yfb
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29705nestedDeactivated$runtime_release(@yfb ssf ssfVar) {
        buf.unsupported();
        throw new us8();
    }
}
