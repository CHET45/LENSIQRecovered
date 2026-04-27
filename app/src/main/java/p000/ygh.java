package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ygh extends ssf {

    /* JADX INFO: renamed from: o */
    public static final int f101451o = 8;

    /* JADX INFO: renamed from: h */
    @gib
    public final ssf f101452h;

    /* JADX INFO: renamed from: i */
    public final boolean f101453i;

    /* JADX INFO: renamed from: j */
    public final boolean f101454j;

    /* JADX INFO: renamed from: k */
    @gib
    public qy6<Object, bth> f101455k;

    /* JADX INFO: renamed from: l */
    @gib
    public final qy6<Object, bth> f101456l;

    /* JADX INFO: renamed from: m */
    public final long f101457m;

    /* JADX INFO: renamed from: n */
    @yfb
    public final ssf f101458n;

    public ygh(@gib ssf ssfVar, @gib qy6<Object, bth> qy6Var, boolean z, boolean z2) {
        qy6<Object, bth> readObserver;
        super(0, ctf.f27527e.getEMPTY(), null);
        this.f101452h = ssfVar;
        this.f101453i = z;
        this.f101454j = z2;
        this.f101455k = gtf.mergedReadObserver(qy6Var, (ssfVar == null || (readObserver = ssfVar.getReadObserver()) == null) ? ((r77) gtf.f41105k.get()).getReadObserver() : readObserver, z);
        this.f101457m = C5737fe.currentThreadId();
        this.f101458n = this;
    }

    private final ssf getCurrentSnapshot() {
        ssf ssfVar = this.f101452h;
        return ssfVar == null ? (ssf) gtf.f41105k.get() : ssfVar;
    }

    @Override // p000.ssf
    public void dispose() {
        ssf ssfVar;
        setDisposed$runtime_release(true);
        if (!this.f101454j || (ssfVar = this.f101452h) == null) {
            return;
        }
        ssfVar.dispose();
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

    @Override // p000.ssf
    @gib
    public u6b<x2g> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // p000.ssf
    @gib
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public qy6<Object, bth> getReadObserver() {
        return this.f101455k;
    }

    @Override // p000.ssf
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // p000.ssf
    @yfb
    public ssf getRoot() {
        return this.f101458n;
    }

    public final long getThreadId$runtime_release() {
        return this.f101457m;
    }

    @Override // p000.ssf
    @gib
    public qy6<Object, bth> getWriteObserver$runtime_release() {
        return this.f101456l;
    }

    @Override // p000.ssf
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // p000.ssf
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // p000.ssf
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

    public void setModified(@gib u6b<x2g> u6bVar) {
        buf.unsupported();
        throw new us8();
    }

    public void setReadObserver(@gib qy6<Object, bth> qy6Var) {
        this.f101455k = qy6Var;
    }

    @Override // p000.ssf
    @yfb
    public ssf takeNestedSnapshot(@gib qy6<Object, bth> qy6Var) {
        qy6<Object, bth> qy6VarM11989b = gtf.m11989b(qy6Var, getReadObserver(), false, 4, null);
        return !this.f101453i ? gtf.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), qy6VarM11989b, true) : getCurrentSnapshot().takeNestedSnapshot(qy6VarM11989b);
    }

    @Override // p000.ssf
    @yfb
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29704nestedActivated$runtime_release(@yfb ssf ssfVar) {
        buf.unsupported();
        throw new us8();
    }

    @Override // p000.ssf
    @yfb
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29705nestedDeactivated$runtime_release(@yfb ssf ssfVar) {
        buf.unsupported();
        throw new us8();
    }
}
