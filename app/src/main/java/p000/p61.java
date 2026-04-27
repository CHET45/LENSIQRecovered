package p000;

/* JADX INFO: loaded from: classes8.dex */
public class p61 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final o61 f69777a = new o61();

    /* JADX INFO: renamed from: p61$a */
    public static class C10804a extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
            if (!p61.isMarker(zhcVar, nextNonSpaceIndex)) {
                return t61.none();
            }
            int column = zhcVar.getColumn() + zhcVar.getIndent();
            int i = column + 1;
            if (bic.isSpaceOrTab(zhcVar.getLine(), nextNonSpaceIndex + 1)) {
                i = column + 2;
            }
            return t61.m22390of(new p61()).atColumn(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMarker(zhc zhcVar, int i) {
        CharSequence line = zhcVar.getLine();
        return zhcVar.getIndent() < bic.f13817k && i < line.length() && line.charAt(i) == '>';
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
        int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
        if (!isMarker(zhcVar, nextNonSpaceIndex)) {
            return d61.none();
        }
        int column = zhcVar.getColumn() + zhcVar.getIndent();
        int i = column + 1;
        if (bic.isSpaceOrTab(zhcVar.getLine(), nextNonSpaceIndex + 1)) {
            i = column + 2;
        }
        return d61.atColumn(i);
    }

    @Override // p000.m61
    public o61 getBlock() {
        return this.f69777a;
    }
}
