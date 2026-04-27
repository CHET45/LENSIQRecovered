package p000;

/* JADX INFO: loaded from: classes7.dex */
public class di8 implements pog, g74 {

    /* JADX INFO: renamed from: a */
    public final j74 f29705a;

    public di8(j74 j74Var) {
        this.f29705a = j74Var;
    }

    @Override // p000.pog
    public int countTestCases() {
        return 1;
    }

    @Override // p000.g74
    public j74 getDescription() {
        return this.f29705a;
    }

    @Override // p000.pog
    public void run(epg epgVar) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    public String toString() {
        return getDescription().toString();
    }
}
