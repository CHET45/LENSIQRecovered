package p000;

/* JADX INFO: loaded from: classes8.dex */
public class wwg extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final vwg f95637a = new vwg();

    /* JADX INFO: renamed from: wwg$a */
    public static class C14818a extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            if (zhcVar.getIndent() >= 4) {
                return t61.none();
            }
            int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
            CharSequence line = zhcVar.getLine();
            return wwg.isThematicBreak(line, nextNonSpaceIndex) ? t61.m22390of(new wwg()).atIndex(line.length()) : t61.none();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isThematicBreak(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i4++;
                } else if (cCharAt == '-') {
                    i2++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i3++;
                }
            }
            i++;
        }
        return (i2 >= 3 && i3 == 0 && i4 == 0) || (i3 >= 3 && i2 == 0 && i4 == 0) || (i4 >= 3 && i2 == 0 && i3 == 0);
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f95637a;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return d61.none();
    }
}
