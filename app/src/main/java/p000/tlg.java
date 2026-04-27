package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class tlg {

    /* JADX INFO: renamed from: a */
    public final r6h f85288a;

    /* JADX INFO: renamed from: tlg$a */
    public static final class C13099a extends xhc {
        public C13099a(String str) {
            super(str, null, false, 1);
        }
    }

    public tlg(r6h r6hVar) {
        this.f85288a = r6hVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3841a(ihc ihcVar) throws xhc;

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3842b(ihc ihcVar, long j) throws xhc;

    public final boolean consume(ihc ihcVar, long j) throws xhc {
        return mo3841a(ihcVar) && mo3842b(ihcVar, j);
    }

    public abstract void seek();
}
