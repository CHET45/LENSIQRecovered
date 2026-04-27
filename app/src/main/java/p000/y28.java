package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class y28 implements u28 {

    /* JADX INFO: renamed from: i */
    public static final String f100138i = "<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->";

    /* JADX INFO: renamed from: j */
    public static final String f100139j = "[<][?].*?[?][>]";

    /* JADX INFO: renamed from: k */
    public static final String f100140k = "<![A-Z]+\\s+[^>]*>";

    /* JADX INFO: renamed from: l */
    public static final String f100141l = "<!\\[CDATA\\[[\\s\\S]*?\\]\\]>";

    /* JADX INFO: renamed from: m */
    public static final String f100142m = "(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)";

    /* JADX INFO: renamed from: n */
    public static final String f100143n = "!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~";

    /* JADX INFO: renamed from: o */
    public static final Pattern f100144o = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: p */
    public static final Pattern f100145p = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: q */
    public static final Pattern f100146q = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: r */
    public static final Pattern f100147r = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: s */
    public static final Pattern f100148s = Pattern.compile("`+");

    /* JADX INFO: renamed from: t */
    public static final Pattern f100149t = Pattern.compile("^`+");

    /* JADX INFO: renamed from: u */
    public static final Pattern f100150u = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: v */
    public static final Pattern f100151v = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: w */
    public static final Pattern f100152w = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: x */
    public static final Pattern f100153x = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: y */
    public static final Pattern f100154y = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: z */
    public static final Pattern f100155z = Pattern.compile(" *$");

    /* JADX INFO: renamed from: a */
    public final BitSet f100156a;

    /* JADX INFO: renamed from: b */
    public final BitSet f100157b;

    /* JADX INFO: renamed from: c */
    public final Map<Character, x54> f100158c;

    /* JADX INFO: renamed from: d */
    public final v28 f100159d;

    /* JADX INFO: renamed from: e */
    public String f100160e;

    /* JADX INFO: renamed from: f */
    public int f100161f;

    /* JADX INFO: renamed from: g */
    public w54 f100162g;

    /* JADX INFO: renamed from: h */
    public xc1 f100163h;

    /* JADX INFO: renamed from: y28$a */
    public static class C15407a {

        /* JADX INFO: renamed from: a */
        public final int f100164a;

        /* JADX INFO: renamed from: b */
        public final boolean f100165b;

        /* JADX INFO: renamed from: c */
        public final boolean f100166c;

        public C15407a(int i, boolean z, boolean z2) {
            this.f100164a = i;
            this.f100166c = z;
            this.f100165b = z2;
        }
    }

    public y28(v28 v28Var) {
        Map<Character, x54> mapCalculateDelimiterProcessors = calculateDelimiterProcessors(v28Var.getCustomDelimiterProcessors());
        this.f100158c = mapCalculateDelimiterProcessors;
        BitSet bitSetCalculateDelimiterCharacters = calculateDelimiterCharacters(mapCalculateDelimiterProcessors.keySet());
        this.f100157b = bitSetCalculateDelimiterCharacters;
        this.f100156a = calculateSpecialCharacters(bitSetCalculateDelimiterCharacters);
        this.f100159d = v28Var;
    }

    private void addBracket(xc1 xc1Var) {
        xc1 xc1Var2 = this.f100163h;
        if (xc1Var2 != null) {
            xc1Var2.f97500g = true;
        }
        this.f100163h = xc1Var;
    }

    private static void addDelimiterProcessorForChar(char c, x54 x54Var, Map<Character, x54> map) {
        if (map.put(Character.valueOf(c), x54Var) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    private static void addDelimiterProcessors(Iterable<x54> iterable, Map<Character, x54> map) {
        o0g o0gVar;
        for (x54 x54Var : iterable) {
            char openingCharacter = x54Var.getOpeningCharacter();
            char closingCharacter = x54Var.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                x54 x54Var2 = map.get(Character.valueOf(openingCharacter));
                if (x54Var2 == null || x54Var2.getOpeningCharacter() != x54Var2.getClosingCharacter()) {
                    addDelimiterProcessorForChar(openingCharacter, x54Var, map);
                } else {
                    if (x54Var2 instanceof o0g) {
                        o0gVar = (o0g) x54Var2;
                    } else {
                        o0g o0gVar2 = new o0g(openingCharacter);
                        o0gVar2.m18246a(x54Var2);
                        o0gVar = o0gVar2;
                    }
                    o0gVar.m18246a(x54Var);
                    map.put(Character.valueOf(openingCharacter), o0gVar);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, x54Var, map);
                addDelimiterProcessorForChar(closingCharacter, x54Var, map);
            }
        }
    }

    public static BitSet calculateDelimiterCharacters(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, x54> calculateDelimiterProcessors(List<x54> list) {
        HashMap map = new HashMap();
        addDelimiterProcessors(Arrays.asList(new i90(), new yrh()), map);
        addDelimiterProcessors(list, map);
        return map;
    }

    public static BitSet calculateSpecialCharacters(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    private String match(Pattern pattern) {
        if (this.f100161f >= this.f100160e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f100160e);
        matcher.region(this.f100161f, this.f100160e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f100161f = matcher.end();
        return matcher.group();
    }

    private void mergeChildTextNodes(deb debVar) {
        if (debVar.getFirstChild() == debVar.getLastChild()) {
            return;
        }
        mergeTextNodesInclusive(debVar.getFirstChild(), debVar.getLastChild());
    }

    private void mergeIfNeeded(zpg zpgVar, zpg zpgVar2, int i) {
        if (zpgVar == null || zpgVar2 == null || zpgVar == zpgVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(zpgVar.getLiteral());
        deb next = zpgVar.getNext();
        deb next2 = zpgVar2.getNext();
        while (next != next2) {
            sb.append(((zpg) next).getLiteral());
            deb next3 = next.getNext();
            next.unlink();
            next = next3;
        }
        zpgVar.setLiteral(sb.toString());
    }

    private void mergeTextNodesBetweenExclusive(deb debVar, deb debVar2) {
        if (debVar == debVar2 || debVar.getNext() == debVar2) {
            return;
        }
        mergeTextNodesInclusive(debVar.getNext(), debVar2.getPrevious());
    }

    private void mergeTextNodesInclusive(deb debVar, deb debVar2) {
        zpg zpgVar = null;
        zpg zpgVar2 = null;
        int length = 0;
        while (debVar != null) {
            if (debVar instanceof zpg) {
                zpgVar2 = (zpg) debVar;
                if (zpgVar == null) {
                    zpgVar = zpgVar2;
                }
                length += zpgVar2.getLiteral().length();
            } else {
                mergeIfNeeded(zpgVar, zpgVar2, length);
                zpgVar = null;
                zpgVar2 = null;
                length = 0;
            }
            if (debVar == debVar2) {
                break;
            } else {
                debVar = debVar.getNext();
            }
        }
        mergeIfNeeded(zpgVar, zpgVar2, length);
    }

    private deb parseAutolink() {
        String strMatch = match(f100150u);
        if (strMatch != null) {
            String strSubstring = strMatch.substring(1, strMatch.length() - 1);
            z69 z69Var = new z69(wq9.f95147b + strSubstring, null);
            z69Var.appendChild(new zpg(strSubstring));
            return z69Var;
        }
        String strMatch2 = match(f100151v);
        if (strMatch2 == null) {
            return null;
        }
        String strSubstring2 = strMatch2.substring(1, strMatch2.length() - 1);
        z69 z69Var2 = new z69(strSubstring2, null);
        z69Var2.appendChild(new zpg(strSubstring2));
        return z69Var2;
    }

    private deb parseBackslash() {
        this.f100161f++;
        if (peek() == '\n') {
            og7 og7Var = new og7();
            this.f100161f++;
            return og7Var;
        }
        if (this.f100161f < this.f100160e.length()) {
            Pattern pattern = f100146q;
            String str = this.f100160e;
            int i = this.f100161f;
            if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.f100160e;
                int i2 = this.f100161f;
                zpg zpgVarText = text(str2, i2, i2 + 1);
                this.f100161f++;
                return zpgVarText;
            }
        }
        return text(nk1.f64796h);
    }

    private deb parseBackticks() {
        String strMatch;
        String strMatch2 = match(f100149t);
        if (strMatch2 == null) {
            return null;
        }
        int i = this.f100161f;
        do {
            strMatch = match(f100148s);
            if (strMatch == null) {
                this.f100161f = i;
                return text(strMatch2);
            }
        } while (!strMatch.equals(strMatch2));
        q62 q62Var = new q62();
        String strReplace = this.f100160e.substring(i, this.f100161f - strMatch2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && bic.hasNonSpace(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        q62Var.setLiteral(strReplace);
        return q62Var;
    }

    private deb parseBang() {
        int i = this.f100161f;
        this.f100161f = i + 1;
        if (peek() != '[') {
            return text("!");
        }
        this.f100161f++;
        zpg zpgVarText = text("![");
        addBracket(xc1.image(zpgVarText, i + 1, this.f100163h, this.f100162g));
        return zpgVarText;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p000.deb parseCloseBracket() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y28.parseCloseBracket():deb");
    }

    private deb parseDelimiters(x54 x54Var, char c) {
        C15407a c15407aScanDelimiters = scanDelimiters(x54Var, c);
        if (c15407aScanDelimiters == null) {
            return null;
        }
        int i = c15407aScanDelimiters.f100164a;
        int i2 = this.f100161f;
        int i3 = i2 + i;
        this.f100161f = i3;
        zpg zpgVarText = text(this.f100160e, i2, i3);
        w54 w54Var = new w54(zpgVarText, c, c15407aScanDelimiters.f100166c, c15407aScanDelimiters.f100165b, this.f100162g);
        this.f100162g = w54Var;
        w54Var.f93280g = i;
        w54Var.f93281h = i;
        w54 w54Var2 = w54Var.f93278e;
        if (w54Var2 != null) {
            w54Var2.f93279f = w54Var;
        }
        return zpgVarText;
    }

    private deb parseEntity() {
        String strMatch = match(f100147r);
        if (strMatch != null) {
            return text(bm7.entityToString(strMatch));
        }
        return null;
    }

    private deb parseHtmlInline() {
        String strMatch = match(f100145p);
        if (strMatch == null) {
            return null;
        }
        hm7 hm7Var = new hm7();
        hm7Var.setLiteral(strMatch);
        return hm7Var;
    }

    private deb parseInline(deb debVar) {
        deb newline;
        char cPeek = peek();
        if (cPeek == 0) {
            return null;
        }
        if (cPeek == '\n') {
            newline = parseNewline(debVar);
        } else if (cPeek == '!') {
            newline = parseBang();
        } else if (cPeek == '&') {
            newline = parseEntity();
        } else if (cPeek == '<') {
            newline = parseAutolink();
            if (newline == null) {
                newline = parseHtmlInline();
            }
        } else if (cPeek != '`') {
            switch (cPeek) {
                case '[':
                    newline = parseOpenBracket();
                    break;
                case '\\':
                    newline = parseBackslash();
                    break;
                case ']':
                    newline = parseCloseBracket();
                    break;
                default:
                    newline = !this.f100157b.get(cPeek) ? parseString() : parseDelimiters(this.f100158c.get(Character.valueOf(cPeek)), cPeek);
                    break;
            }
        } else {
            newline = parseBackticks();
        }
        if (newline != null) {
            return newline;
        }
        this.f100161f++;
        return text(String.valueOf(cPeek));
    }

    private String parseLinkDestination() {
        int iScanLinkDestination = k79.scanLinkDestination(this.f100160e, this.f100161f);
        if (iScanLinkDestination == -1) {
            return null;
        }
        String strSubstring = peek() == '<' ? this.f100160e.substring(this.f100161f + 1, iScanLinkDestination - 1) : this.f100160e.substring(this.f100161f, iScanLinkDestination);
        this.f100161f = iScanLinkDestination;
        return n55.unescapeString(strSubstring);
    }

    private String parseLinkTitle() {
        int iScanLinkTitle = k79.scanLinkTitle(this.f100160e, this.f100161f);
        if (iScanLinkTitle == -1) {
            return null;
        }
        String strSubstring = this.f100160e.substring(this.f100161f + 1, iScanLinkTitle - 1);
        this.f100161f = iScanLinkTitle;
        return n55.unescapeString(strSubstring);
    }

    private deb parseNewline(deb debVar) {
        this.f100161f++;
        if (debVar instanceof zpg) {
            zpg zpgVar = (zpg) debVar;
            if (zpgVar.getLiteral().endsWith(C2473f.f17566z)) {
                String literal = zpgVar.getLiteral();
                Matcher matcher = f100155z.matcher(literal);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    zpgVar.setLiteral(literal.substring(0, literal.length() - iEnd));
                }
                return iEnd >= 2 ? new og7() : new ruf();
            }
        }
        return new ruf();
    }

    private deb parseOpenBracket() {
        int i = this.f100161f;
        this.f100161f = i + 1;
        zpg zpgVarText = text("[");
        addBracket(xc1.link(zpgVarText, i, this.f100163h, this.f100162g));
        return zpgVarText;
    }

    private deb parseString() {
        int i = this.f100161f;
        int length = this.f100160e.length();
        while (true) {
            int i2 = this.f100161f;
            if (i2 == length || this.f100156a.get(this.f100160e.charAt(i2))) {
                break;
            }
            this.f100161f++;
        }
        int i3 = this.f100161f;
        if (i != i3) {
            return text(this.f100160e, i, i3);
        }
        return null;
    }

    private char peek() {
        if (this.f100161f < this.f100160e.length()) {
            return this.f100160e.charAt(this.f100161f);
        }
        return (char) 0;
    }

    private void processDelimiters(w54 w54Var) {
        boolean z;
        HashMap map = new HashMap();
        w54 w54Var2 = this.f100162g;
        while (w54Var2 != null) {
            w54 w54Var3 = w54Var2.f93278e;
            if (w54Var3 == w54Var) {
                break;
            } else {
                w54Var2 = w54Var3;
            }
        }
        while (w54Var2 != null) {
            char c = w54Var2.f93275b;
            x54 x54Var = this.f100158c.get(Character.valueOf(c));
            if (!w54Var2.f93277d || x54Var == null) {
                w54Var2 = w54Var2.f93279f;
            } else {
                char openingCharacter = x54Var.getOpeningCharacter();
                w54 w54Var4 = w54Var2.f93278e;
                int delimiterUse = 0;
                boolean z2 = false;
                while (w54Var4 != null && w54Var4 != w54Var && w54Var4 != map.get(Character.valueOf(c))) {
                    if (w54Var4.f93276c && w54Var4.f93275b == openingCharacter) {
                        delimiterUse = x54Var.getDelimiterUse(w54Var4, w54Var2);
                        z2 = true;
                        if (delimiterUse > 0) {
                            z = true;
                            break;
                        }
                    }
                    w54Var4 = w54Var4.f93278e;
                }
                z = z2;
                z2 = false;
                if (z2) {
                    zpg zpgVar = w54Var4.f93274a;
                    zpg zpgVar2 = w54Var2.f93274a;
                    w54Var4.f93280g -= delimiterUse;
                    w54Var2.f93280g -= delimiterUse;
                    zpgVar.setLiteral(zpgVar.getLiteral().substring(0, zpgVar.getLiteral().length() - delimiterUse));
                    zpgVar2.setLiteral(zpgVar2.getLiteral().substring(0, zpgVar2.getLiteral().length() - delimiterUse));
                    removeDelimitersBetween(w54Var4, w54Var2);
                    mergeTextNodesBetweenExclusive(zpgVar, zpgVar2);
                    x54Var.process(zpgVar, zpgVar2, delimiterUse);
                    if (w54Var4.f93280g == 0) {
                        removeDelimiterAndNode(w54Var4);
                    }
                    if (w54Var2.f93280g == 0) {
                        w54 w54Var5 = w54Var2.f93279f;
                        removeDelimiterAndNode(w54Var2);
                        w54Var2 = w54Var5;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), w54Var2.f93278e);
                        if (!w54Var2.f93276c) {
                            removeDelimiterKeepNode(w54Var2);
                        }
                    }
                    w54Var2 = w54Var2.f93279f;
                }
            }
        }
        while (true) {
            w54 w54Var6 = this.f100162g;
            if (w54Var6 == null || w54Var6 == w54Var) {
                return;
            } else {
                removeDelimiterKeepNode(w54Var6);
            }
        }
    }

    private void removeDelimiter(w54 w54Var) {
        w54 w54Var2 = w54Var.f93278e;
        if (w54Var2 != null) {
            w54Var2.f93279f = w54Var.f93279f;
        }
        w54 w54Var3 = w54Var.f93279f;
        if (w54Var3 == null) {
            this.f100162g = w54Var2;
        } else {
            w54Var3.f93278e = w54Var2;
        }
    }

    private void removeDelimiterAndNode(w54 w54Var) {
        w54Var.f93274a.unlink();
        removeDelimiter(w54Var);
    }

    private void removeDelimiterKeepNode(w54 w54Var) {
        removeDelimiter(w54Var);
    }

    private void removeDelimitersBetween(w54 w54Var, w54 w54Var2) {
        w54 w54Var3 = w54Var2.f93278e;
        while (w54Var3 != null && w54Var3 != w54Var) {
            w54 w54Var4 = w54Var3.f93278e;
            removeDelimiterKeepNode(w54Var3);
            w54Var3 = w54Var4;
        }
    }

    private void removeLastBracket() {
        this.f100163h = this.f100163h.f97497d;
    }

    private C15407a scanDelimiters(x54 x54Var, char c) {
        boolean z;
        int i = this.f100161f;
        boolean z2 = false;
        int i2 = 0;
        while (peek() == c) {
            i2++;
            this.f100161f++;
        }
        if (i2 < x54Var.getMinLength()) {
            this.f100161f = i;
            return null;
        }
        String strSubstring = i == 0 ? "\n" : this.f100160e.substring(i - 1, i);
        char cPeek = peek();
        String strValueOf = cPeek != 0 ? String.valueOf(cPeek) : "\n";
        Pattern pattern = f100144o;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = f100153x;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z3 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z4 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c == '_') {
            z = z3 && (!z4 || zMatches);
            if (z4 && (!z3 || zMatches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c == x54Var.getOpeningCharacter();
            if (z4 && c == x54Var.getClosingCharacter()) {
                z2 = true;
            }
            z = z5;
        }
        this.f100161f = i;
        return new C15407a(i2, z, z2);
    }

    private void spnl() {
        match(f100152w);
    }

    private zpg text(String str, int i, int i2) {
        return new zpg(str.substring(i, i2));
    }

    /* JADX INFO: renamed from: a */
    public int m25631a() {
        if (this.f100161f < this.f100160e.length() && this.f100160e.charAt(this.f100161f) == '[') {
            int i = this.f100161f + 1;
            int iScanLinkLabelContent = k79.scanLinkLabelContent(this.f100160e, i);
            int i2 = iScanLinkLabelContent - i;
            if (iScanLinkLabelContent != -1 && i2 <= 999 && iScanLinkLabelContent < this.f100160e.length() && this.f100160e.charAt(iScanLinkLabelContent) == ']') {
                this.f100161f = iScanLinkLabelContent + 1;
                return i2 + 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m25632b(String str) {
        this.f100160e = str;
        this.f100161f = 0;
        this.f100162g = null;
        this.f100163h = null;
    }

    @Override // p000.u28
    public void parse(String str, deb debVar) {
        m25632b(str.trim());
        deb inline = null;
        while (true) {
            inline = parseInline(inline);
            if (inline == null) {
                processDelimiters(null);
                mergeChildTextNodes(debVar);
                return;
            }
            debVar.appendChild(inline);
        }
    }

    private zpg text(String str) {
        return new zpg(str);
    }
}
