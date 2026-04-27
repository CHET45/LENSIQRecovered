package p000;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class dm7 extends AbstractC5537f0 {

    /* JADX INFO: renamed from: e */
    public static final Pattern[][] f30041e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a */
    public final cm7 f30042a;

    /* JADX INFO: renamed from: b */
    public final Pattern f30043b;

    /* JADX INFO: renamed from: c */
    public boolean f30044c;

    /* JADX INFO: renamed from: d */
    public c61 f30045d;

    /* JADX INFO: renamed from: dm7$b */
    public static class C4861b extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            int nextNonSpaceIndex = zhcVar.getNextNonSpaceIndex();
            CharSequence line = zhcVar.getLine();
            if (zhcVar.getIndent() < 4 && line.charAt(nextNonSpaceIndex) == '<') {
                for (int i = 1; i <= 7; i++) {
                    if (i != 7 || !(xv9Var.getMatchedBlockParser().getBlock() instanceof cdc)) {
                        Pattern pattern = dm7.f30041e[i][0];
                        Pattern pattern2 = dm7.f30041e[i][1];
                        if (pattern.matcher(line.subSequence(nextNonSpaceIndex, line.length())).find()) {
                            return t61.m22390of(new dm7(pattern2)).atIndex(zhcVar.getIndex());
                        }
                    }
                }
            }
            return t61.none();
        }
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void addLine(CharSequence charSequence) {
        this.f30045d.add(charSequence);
        Pattern pattern = this.f30043b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f30044c = true;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void closeBlock() {
        this.f30042a.setLiteral(this.f30045d.getString());
        this.f30045d = null;
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f30042a;
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return this.f30044c ? d61.none() : (zhcVar.isBlank() && this.f30043b == null) ? d61.none() : d61.atIndex(zhcVar.getIndex());
    }

    private dm7(Pattern pattern) {
        this.f30042a = new cm7();
        this.f30044c = false;
        this.f30045d = new c61();
        this.f30043b = pattern;
    }
}
