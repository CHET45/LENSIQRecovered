package p000;

/* JADX INFO: loaded from: classes7.dex */
public class d2e extends vog {

    /* JADX INFO: renamed from: b */
    public int f28292b;

    public d2e(pog pogVar, int i) {
        super(pogVar);
        if (i < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.f28292b = i;
    }

    @Override // p000.vog, p000.pog
    public int countTestCases() {
        return super.countTestCases() * this.f28292b;
    }

    @Override // p000.vog, p000.pog
    public void run(epg epgVar) {
        for (int i = 0; i < this.f28292b && !epgVar.shouldStop(); i++) {
            super.run(epgVar);
        }
    }

    @Override // p000.vog
    public String toString() {
        return super.toString() + "(repeated)";
    }
}
