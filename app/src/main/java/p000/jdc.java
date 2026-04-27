package p000;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class jdc extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final cdc f50357a = new cdc();

    /* JADX INFO: renamed from: b */
    public h79 f50358b = new h79();

    @Override // p000.AbstractC5537f0, p000.m61
    public void addLine(CharSequence charSequence) {
        this.f50358b.parse(charSequence);
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean canHaveLazyContinuationLines() {
        return true;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void closeBlock() {
        if (this.f50358b.m12176b().length() == 0) {
            this.f50357a.unlink();
        }
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f50357a;
    }

    public CharSequence getContentString() {
        return this.f50358b.m12176b();
    }

    public List<g79> getDefinitions() {
        return this.f50358b.m12175a();
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void parseInlines(u28 u28Var) {
        CharSequence charSequenceM12176b = this.f50358b.m12176b();
        if (charSequenceM12176b.length() > 0) {
            u28Var.parse(charSequenceM12176b.toString(), this.f50357a);
        }
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return !zhcVar.isBlank() ? d61.atIndex(zhcVar.getIndex()) : d61.none();
    }
}
