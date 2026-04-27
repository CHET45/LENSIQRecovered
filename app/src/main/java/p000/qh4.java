package p000;

/* JADX INFO: loaded from: classes8.dex */
public class qh4 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final oh4 f74450a = new oh4();

    @Override // p000.AbstractC5537f0, p000.m61
    public void addLine(CharSequence charSequence) {
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean canContain(b61 b61Var) {
        return true;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean isContainer() {
        return true;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return d61.atIndex(zhcVar.getIndex());
    }

    @Override // p000.m61
    public oh4 getBlock() {
        return this.f74450a;
    }
}
