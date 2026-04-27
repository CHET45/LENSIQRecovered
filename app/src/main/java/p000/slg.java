package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class slg {

    /* JADX INFO: renamed from: a */
    public final q6h f82196a;

    /* JADX INFO: renamed from: slg$a */
    public static final class C12653a extends yhc {
        public C12653a(String str) {
            super(str, null, false, 1);
        }
    }

    public slg(q6h q6hVar) {
        this.f82196a = q6hVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo8983a(jhc jhcVar) throws yhc;

    /* JADX INFO: renamed from: b */
    public abstract boolean mo8984b(jhc jhcVar, long j) throws yhc;

    public final boolean consume(jhc jhcVar, long j) throws yhc {
        return mo8983a(jhcVar) && mo8984b(jhcVar, j);
    }

    public abstract void seek();
}
