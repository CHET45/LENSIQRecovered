package p000;

/* JADX INFO: loaded from: classes8.dex */
public class g99 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final f99 f39054a = new f99();

    /* JADX INFO: renamed from: b */
    public int f39055b;

    /* JADX INFO: renamed from: c */
    public boolean f39056c;

    public g99(int i) {
        this.f39055b = i;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean canContain(b61 b61Var) {
        if (!this.f39056c) {
            return true;
        }
        b61 parent = this.f39054a.getParent();
        if (!(parent instanceof f89)) {
            return true;
        }
        ((f89) parent).setTight(false);
        return true;
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f39054a;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean isContainer() {
        return true;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        if (!zhcVar.isBlank()) {
            return zhcVar.getIndent() >= this.f39055b ? d61.atColumn(zhcVar.getColumn() + this.f39055b) : d61.none();
        }
        if (this.f39054a.getFirstChild() == null) {
            return d61.none();
        }
        b61 block = zhcVar.getActiveBlockParser().getBlock();
        this.f39056c = (block instanceof cdc) || (block instanceof f99);
        return d61.atIndex(zhcVar.getNextNonSpaceIndex());
    }
}
