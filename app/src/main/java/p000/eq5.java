package p000;

/* JADX INFO: loaded from: classes8.dex */
public class eq5 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final dq5 f33834a;

    /* JADX INFO: renamed from: b */
    public String f33835b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f33836c;

    /* JADX INFO: renamed from: eq5$a */
    public static class C5438a extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            int indent = zhcVar.getIndent();
            if (indent >= bic.f13817k) {
                return t61.none();
            }
            int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
            eq5 eq5VarCheckOpener = eq5.checkOpener(zhcVar.getLine(), nextNonSpaceIndex, indent);
            return eq5VarCheckOpener != null ? t61.m22390of(eq5VarCheckOpener).atIndex(nextNonSpaceIndex + eq5VarCheckOpener.f33834a.getFenceLength()) : t61.none();
        }
    }

    public eq5(char c, int i, int i2) {
        dq5 dq5Var = new dq5();
        this.f33834a = dq5Var;
        this.f33836c = new StringBuilder();
        dq5Var.setFenceChar(c);
        dq5Var.setFenceLength(i);
        dq5Var.setFenceIndent(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static eq5 checkOpener(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '`') {
                i3++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (bic.find('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new eq5('`', i3, i2);
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new eq5('~', i4, i2);
    }

    private boolean isClosing(CharSequence charSequence, int i) {
        char fenceChar = this.f33834a.getFenceChar();
        int fenceLength = this.f33834a.getFenceLength();
        int iSkip = bic.skip(fenceChar, charSequence, i, charSequence.length()) - i;
        return iSkip >= fenceLength && bic.skipSpaceTab(charSequence, i + iSkip, charSequence.length()) == charSequence.length();
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void addLine(CharSequence charSequence) {
        if (this.f33835b == null) {
            this.f33835b = charSequence.toString();
        } else {
            this.f33836c.append(charSequence);
            this.f33836c.append('\n');
        }
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void closeBlock() {
        this.f33834a.setInfo(n55.unescapeString(this.f33835b.trim()));
        this.f33834a.setLiteral(this.f33836c.toString());
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f33834a;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
        int index = zhcVar.getIndex();
        CharSequence line = zhcVar.getLine();
        if (zhcVar.getIndent() < bic.f13817k && isClosing(line, nextNonSpaceIndex)) {
            return d61.finished();
        }
        int length = line.length();
        for (int fenceIndent = this.f33834a.getFenceIndent(); fenceIndent > 0 && index < length && line.charAt(index) == ' '; fenceIndent--) {
            index++;
        }
        return d61.atIndex(index);
    }
}
