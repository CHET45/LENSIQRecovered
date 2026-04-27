package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class prd extends ssf {

    /* JADX INFO: renamed from: j */
    public static final int f71744j = 8;

    /* JADX INFO: renamed from: h */
    @gib
    public final qy6<Object, bth> f71745h;

    /* JADX INFO: renamed from: i */
    public int f71746i;

    public prd(int i, @yfb ctf ctfVar, @gib qy6<Object, bth> qy6Var) {
        super(i, ctfVar, null);
        this.f71745h = qy6Var;
        this.f71746i = 1;
    }

    @Override // p000.ssf
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        mo29705nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // p000.ssf
    @gib
    public u6b<x2g> getModified$runtime_release() {
        return null;
    }

    @Override // p000.ssf
    @gib
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public qy6<Object, bth> getReadObserver() {
        return this.f71745h;
    }

    @Override // p000.ssf
    public boolean getReadOnly() {
        return true;
    }

    @Override // p000.ssf
    @yfb
    public ssf getRoot() {
        return this;
    }

    @Override // p000.ssf
    @gib
    public qy6<Object, bth> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // p000.ssf
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // p000.ssf
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo29704nestedActivated$runtime_release(@yfb ssf ssfVar) {
        this.f71746i++;
    }

    @Override // p000.ssf
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo29705nestedDeactivated$runtime_release(@yfb ssf ssfVar) {
        int i = this.f71746i - 1;
        this.f71746i = i;
        if (i == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // p000.ssf
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // p000.ssf
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo29706recordModified$runtime_release(@yfb x2g x2gVar) {
        gtf.reportReadonlySnapshotWrite();
        throw new us8();
    }

    public void setModified(@gib u6b<x2g> u6bVar) {
        buf.unsupported();
        throw new us8();
    }

    @Override // p000.ssf
    @yfb
    public ssf takeNestedSnapshot(@gib qy6<Object, bth> qy6Var) {
        gtf.validateOpen(this);
        return new gab(getId(), getInvalid$runtime_release(), gtf.m11989b(qy6Var, getReadObserver(), false, 4, null), this);
    }
}
