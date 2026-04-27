package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class qz7 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final pz7 f76363a = new pz7();

    /* JADX INFO: renamed from: b */
    public final List<CharSequence> f76364b = new ArrayList();

    /* JADX INFO: renamed from: qz7$a */
    public static class C11770a extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            return (zhcVar.getIndent() < bic.f13817k || zhcVar.isBlank() || (zhcVar.getActiveBlockParser().getBlock() instanceof cdc)) ? t61.none() : t61.m22390of(new qz7()).atColumn(zhcVar.getColumn() + bic.f13817k);
        }
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void addLine(CharSequence charSequence) {
        this.f76364b.add(charSequence);
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void closeBlock() {
        int size = this.f76364b.size() - 1;
        while (size >= 0 && bic.isBlank(this.f76364b.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size + 1; i++) {
            sb.append(this.f76364b.get(i));
            sb.append('\n');
        }
        this.f76363a.setLiteral(sb.toString());
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f76363a;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return zhcVar.getIndent() >= bic.f13817k ? d61.atColumn(zhcVar.getColumn() + bic.f13817k) : zhcVar.isBlank() ? d61.atIndex(zhcVar.getNextNonSpaceIndex()) : d61.none();
    }
}
