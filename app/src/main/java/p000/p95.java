package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class p95 {

    /* JADX INFO: renamed from: a */
    public final int f70070a;

    /* JADX INFO: renamed from: b */
    public r81 f70071b;

    public p95(int i) {
        this.f70070a = i;
    }

    public int getCount() {
        return this.f70070a;
    }

    @hib
    public r81 getUnchangedNames() {
        return this.f70071b;
    }

    public String toString() {
        return "ExistenceFilter{count=" + this.f70070a + ", unchangedNames=" + this.f70071b + '}';
    }

    public p95(int i, @hib r81 r81Var) {
        this.f70070a = i;
        this.f70071b = r81Var;
    }
}
