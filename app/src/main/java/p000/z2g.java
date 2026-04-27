package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public abstract class z2g {

    /* JADX INFO: renamed from: c */
    public static final int f103902c = 8;

    /* JADX INFO: renamed from: a */
    public int f103903a = gtf.currentSnapshot().getId();

    /* JADX INFO: renamed from: b */
    @gib
    public z2g f103904b;

    public abstract void assign(@yfb z2g z2gVar);

    @yfb
    public abstract z2g create();

    @gib
    public final z2g getNext$runtime_release() {
        return this.f103904b;
    }

    public final int getSnapshotId$runtime_release() {
        return this.f103903a;
    }

    public final void setNext$runtime_release(@gib z2g z2gVar) {
        this.f103904b = z2gVar;
    }

    public final void setSnapshotId$runtime_release(int i) {
        this.f103903a = i;
    }
}
