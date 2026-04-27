package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.qkg;

/* JADX INFO: loaded from: classes8.dex */
public class okg extends AbstractC5537f0 {

    /* JADX INFO: renamed from: a */
    public final nkg f67925a;

    /* JADX INFO: renamed from: b */
    public final List<CharSequence> f67926b;

    /* JADX INFO: renamed from: c */
    public final List<qkg.EnumC11525a> f67927c;

    /* JADX INFO: renamed from: d */
    public final List<String> f67928d;

    /* JADX INFO: renamed from: e */
    public boolean f67929e;

    /* JADX INFO: renamed from: okg$b */
    public static class C10404b extends AbstractC6046g0 {
        @Override // p000.n61
        public t61 tryStart(zhc zhcVar, xv9 xv9Var) {
            List separator;
            CharSequence line = zhcVar.getLine();
            CharSequence paragraphContent = xv9Var.getParagraphContent();
            if (paragraphContent != null && paragraphContent.toString().contains(es7.f33958g) && !paragraphContent.toString().contains("\n") && (separator = okg.parseSeparator(line.subSequence(zhcVar.getIndex(), line.length()))) != null && !separator.isEmpty()) {
                List listSplit = okg.split(paragraphContent);
                if (separator.size() >= listSplit.size()) {
                    return t61.m22390of(new okg(separator, listSplit)).atIndex(zhcVar.getIndex()).replaceActiveBlockParser();
                }
            }
            return t61.none();
        }
    }

    private static qkg.EnumC11525a getAlignment(boolean z, boolean z2) {
        if (z && z2) {
            return qkg.EnumC11525a.CENTER;
        }
        if (z) {
            return qkg.EnumC11525a.LEFT;
        }
        if (z2) {
            return qkg.EnumC11525a.RIGHT;
        }
        return null;
    }

    private qkg parseCell(String str, int i, u28 u28Var) {
        qkg qkgVar = new qkg();
        if (i < this.f67927c.size()) {
            qkgVar.setAlignment(this.f67927c.get(i));
        }
        u28Var.parse(str.trim(), qkgVar);
        return qkgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<qkg.EnumC11525a> parseSeparator(CharSequence charSequence) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\t' || cCharAt == ' ') {
                i++;
            } else {
                boolean z3 = true;
                if (cCharAt == '-' || cCharAt == ':') {
                    if (i2 == 0 && !arrayList.isEmpty()) {
                        return null;
                    }
                    if (cCharAt == ':') {
                        i++;
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z4 = false;
                    while (i < charSequence.length() && charSequence.charAt(i) == '-') {
                        i++;
                        z4 = true;
                    }
                    if (!z4) {
                        return null;
                    }
                    if (i >= charSequence.length() || charSequence.charAt(i) != ':') {
                        z3 = false;
                    } else {
                        i++;
                    }
                    arrayList.add(getAlignment(z, z3));
                    i2 = 0;
                } else {
                    if (cCharAt != '|') {
                        return null;
                    }
                    i++;
                    i2++;
                    if (i2 > 1) {
                        return null;
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> split(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith(es7.f33958g)) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strTrim.length()) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (i2 >= strTrim.length() || strTrim.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void addLine(CharSequence charSequence) {
        if (this.f67929e) {
            this.f67929e = false;
        } else {
            this.f67926b.add(charSequence);
        }
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public boolean canHaveLazyContinuationLines() {
        return true;
    }

    @Override // p000.m61
    public b61 getBlock() {
        return this.f67925a;
    }

    @Override // p000.AbstractC5537f0, p000.m61
    public void parseInlines(u28 u28Var) {
        int size = this.f67928d.size();
        dlg dlgVar = new dlg();
        this.f67925a.appendChild(dlgVar);
        jlg jlgVar = new jlg();
        dlgVar.appendChild(jlgVar);
        for (int i = 0; i < size; i++) {
            qkg cell = parseCell(this.f67928d.get(i), i, u28Var);
            cell.setHeader(true);
            jlgVar.appendChild(cell);
        }
        Iterator<CharSequence> it = this.f67926b.iterator();
        pkg pkgVar = null;
        while (it.hasNext()) {
            List<String> listSplit = split(it.next());
            jlg jlgVar2 = new jlg();
            int i2 = 0;
            while (i2 < size) {
                jlgVar2.appendChild(parseCell(i2 < listSplit.size() ? listSplit.get(i2) : "", i2, u28Var));
                i2++;
            }
            if (pkgVar == null) {
                pkgVar = new pkg();
                this.f67925a.appendChild(pkgVar);
            }
            pkgVar.appendChild(jlgVar2);
        }
    }

    @Override // p000.m61
    public d61 tryContinue(zhc zhcVar) {
        return zhcVar.getLine().toString().contains(es7.f33958g) ? d61.atIndex(zhcVar.getIndex()) : d61.none();
    }

    private okg(List<qkg.EnumC11525a> list, List<String> list2) {
        this.f67925a = new nkg();
        this.f67926b = new ArrayList();
        this.f67929e = true;
        this.f67927c = list;
        this.f67928d = list2;
    }
}
