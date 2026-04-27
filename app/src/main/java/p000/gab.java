package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class gab extends ssf {

    /* JADX INFO: renamed from: j */
    public static final int f39134j = 8;

    /* JADX INFO: renamed from: h */
    @gib
    public final qy6<Object, bth> f39135h;

    /* JADX INFO: renamed from: i */
    @yfb
    public final ssf f39136i;

    public gab(int i, @yfb ctf ctfVar, @gib qy6<Object, bth> qy6Var, @yfb ssf ssfVar) {
        super(i, ctfVar, null);
        this.f39135h = qy6Var;
        this.f39136i = ssfVar;
        ssfVar.mo29704nestedActivated$runtime_release(this);
    }

    @Override // p000.ssf
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        if (getId() != this.f39136i.getId()) {
            closeAndReleasePinning$runtime_release();
        }
        this.f39136i.mo29705nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // p000.ssf
    @gib
    public u6b<x2g> getModified$runtime_release() {
        return null;
    }

    @yfb
    public final ssf getParent() {
        return this.f39136i;
    }

    @Override // p000.ssf
    @gib
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public qy6<Object, bth> getReadObserver() {
        return this.f39135h;
    }

    @Override // p000.ssf
    public boolean getReadOnly() {
        return true;
    }

    @Override // p000.ssf
    @yfb
    public ssf getRoot() {
        return this.f39136i.getRoot();
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
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // p000.ssf
    public /* bridge */ /* synthetic */ ssf takeNestedSnapshot(qy6 qy6Var) {
        return takeNestedSnapshot((qy6<Object, bth>) qy6Var);
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

    @Override // p000.ssf
    @yfb
    /* JADX INFO: renamed from: recordModified$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo29706recordModified$runtime_release(@yfb x2g x2gVar) {
        gtf.reportReadonlySnapshotWrite();
        throw new us8();
    }

    @Override // p000.ssf
    @yfb
    public gab takeNestedSnapshot(@gib qy6<Object, bth> qy6Var) {
        return new gab(getId(), getInvalid$runtime_release(), gtf.m11989b(qy6Var, getReadObserver(), false, 4, null), this.f39136i);
    }
}
