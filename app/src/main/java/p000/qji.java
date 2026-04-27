package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class qji {

    /* JADX INFO: renamed from: c */
    public static final String f74700c = "WebvttCssParser";

    /* JADX INFO: renamed from: d */
    public static final String f74701d = "{";

    /* JADX INFO: renamed from: e */
    public static final String f74702e = "}";

    /* JADX INFO: renamed from: f */
    public static final String f74703f = "color";

    /* JADX INFO: renamed from: g */
    public static final String f74704g = "background-color";

    /* JADX INFO: renamed from: h */
    public static final String f74705h = "font-family";

    /* JADX INFO: renamed from: i */
    public static final String f74706i = "font-weight";

    /* JADX INFO: renamed from: j */
    public static final String f74707j = "font-size";

    /* JADX INFO: renamed from: k */
    public static final String f74708k = "ruby-position";

    /* JADX INFO: renamed from: l */
    public static final String f74709l = "over";

    /* JADX INFO: renamed from: m */
    public static final String f74710m = "under";

    /* JADX INFO: renamed from: n */
    public static final String f74711n = "text-combine-upright";

    /* JADX INFO: renamed from: o */
    public static final String f74712o = "all";

    /* JADX INFO: renamed from: p */
    public static final String f74713p = "digits";

    /* JADX INFO: renamed from: q */
    public static final String f74714q = "text-decoration";

    /* JADX INFO: renamed from: r */
    public static final String f74715r = "bold";

    /* JADX INFO: renamed from: s */
    public static final String f74716s = "underline";

    /* JADX INFO: renamed from: t */
    public static final String f74717t = "font-style";

    /* JADX INFO: renamed from: u */
    public static final String f74718u = "italic";

    /* JADX INFO: renamed from: v */
    public static final Pattern f74719v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: w */
    public static final Pattern f74720w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final jhc f74721a = new jhc();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f74722b = new StringBuilder();

    @hib
    /* JADX INFO: renamed from: a */
    public static String m20407a(jhc jhcVar, StringBuilder sb) {
        m20409c(jhcVar);
        if (jhcVar.bytesLeft() == 0) {
            return null;
        }
        String identifier = parseIdentifier(jhcVar, sb);
        if (!identifier.isEmpty()) {
            return identifier;
        }
        return "" + ((char) jhcVar.readUnsignedByte());
    }

    private void applySelectorToStyle(rji rjiVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f74719v.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                rjiVar.setTargetVoice((String) v80.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = t0i.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            rjiVar.setTargetTagName(str2.substring(0, iIndexOf2));
            rjiVar.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            rjiVar.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            rjiVar.setTargetClasses((String[]) t0i.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20408b(jhc jhcVar) {
        while (!TextUtils.isEmpty(jhcVar.readLine())) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m20409c(jhc jhcVar) {
        while (true) {
            for (boolean z = true; jhcVar.bytesLeft() > 0 && z; z = false) {
                if (maybeSkipWhitespace(jhcVar) || maybeSkipComment(jhcVar)) {
                    break;
                }
            }
            return;
        }
    }

    private static boolean maybeSkipComment(jhc jhcVar) {
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        byte[] data = jhcVar.getData();
        if (position + 2 > iLimit) {
            return false;
        }
        int i = position + 1;
        if (data[position] != 47) {
            return false;
        }
        int i2 = position + 2;
        if (data[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iLimit) {
                jhcVar.skipBytes(iLimit - jhcVar.getPosition());
                return true;
            }
            if (((char) data[i2]) == '*' && ((char) data[i3]) == '/') {
                i2 += 2;
                iLimit = i2;
            } else {
                i2 = i3;
            }
        }
    }

    private static boolean maybeSkipWhitespace(jhc jhcVar) {
        char cPeekCharAtPosition = peekCharAtPosition(jhcVar, jhcVar.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        jhcVar.skipBytes(1);
        return true;
    }

    private static void parseFontSize(String str, rji rjiVar) {
        Matcher matcher = f74720w.matcher(i80.toLowerCase(str));
        if (!matcher.matches()) {
            xh9.m25148w("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) v80.checkNotNull(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                rjiVar.setFontSizeUnit(3);
                break;
            case "em":
                rjiVar.setFontSizeUnit(2);
                break;
            case "px":
                rjiVar.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        rjiVar.setFontSize(Float.parseFloat((String) v80.checkNotNull(matcher.group(1))));
    }

    private static String parseIdentifier(jhc jhcVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        while (position < iLimit && !z) {
            char c = (char) jhcVar.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c);
            }
        }
        jhcVar.skipBytes(position - jhcVar.getPosition());
        return sb.toString();
    }

    @hib
    private static String parsePropertyValue(jhc jhcVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int position = jhcVar.getPosition();
            String strM20407a = m20407a(jhcVar, sb);
            if (strM20407a == null) {
                return null;
            }
            if ("}".equals(strM20407a) || ";".equals(strM20407a)) {
                jhcVar.setPosition(position);
                z = true;
            } else {
                sb2.append(strM20407a);
            }
        }
        return sb2.toString();
    }

    @hib
    private static String parseSelector(jhc jhcVar, StringBuilder sb) {
        m20409c(jhcVar);
        if (jhcVar.bytesLeft() < 5 || !"::cue".equals(jhcVar.readString(5))) {
            return null;
        }
        int position = jhcVar.getPosition();
        String strM20407a = m20407a(jhcVar, sb);
        if (strM20407a == null) {
            return null;
        }
        if ("{".equals(strM20407a)) {
            jhcVar.setPosition(position);
            return "";
        }
        String cueTarget = c0b.f15433c.equals(strM20407a) ? readCueTarget(jhcVar) : null;
        if (c0b.f15434d.equals(m20407a(jhcVar, sb))) {
            return cueTarget;
        }
        return null;
    }

    private static void parseStyleDeclaration(jhc jhcVar, rji rjiVar, StringBuilder sb) {
        m20409c(jhcVar);
        String identifier = parseIdentifier(jhcVar, sb);
        if (!identifier.isEmpty() && g1i.f38277c.equals(m20407a(jhcVar, sb))) {
            m20409c(jhcVar);
            String propertyValue = parsePropertyValue(jhcVar, sb);
            if (propertyValue == null || propertyValue.isEmpty()) {
                return;
            }
            int position = jhcVar.getPosition();
            String strM20407a = m20407a(jhcVar, sb);
            if (!";".equals(strM20407a)) {
                if (!"}".equals(strM20407a)) {
                    return;
                } else {
                    jhcVar.setPosition(position);
                }
            }
            if ("color".equals(identifier)) {
                rjiVar.setFontColor(t92.parseCssColor(propertyValue));
                return;
            }
            if ("background-color".equals(identifier)) {
                rjiVar.setBackgroundColor(t92.parseCssColor(propertyValue));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(identifier)) {
                if ("over".equals(propertyValue)) {
                    rjiVar.setRubyPosition(1);
                    return;
                } else {
                    if ("under".equals(propertyValue)) {
                        rjiVar.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(identifier)) {
                if (!"all".equals(propertyValue) && !propertyValue.startsWith("digits")) {
                    z = false;
                }
                rjiVar.setCombineUpright(z);
                return;
            }
            if ("text-decoration".equals(identifier)) {
                if ("underline".equals(propertyValue)) {
                    rjiVar.setUnderline(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(identifier)) {
                rjiVar.setFontFamily(propertyValue);
                return;
            }
            if ("font-weight".equals(identifier)) {
                if ("bold".equals(propertyValue)) {
                    rjiVar.setBold(true);
                }
            } else if ("font-style".equals(identifier)) {
                if ("italic".equals(propertyValue)) {
                    rjiVar.setItalic(true);
                }
            } else if ("font-size".equals(identifier)) {
                parseFontSize(propertyValue, rjiVar);
            }
        }
    }

    private static char peekCharAtPosition(jhc jhcVar, int i) {
        return (char) jhcVar.getData()[i];
    }

    private static String readCueTarget(jhc jhcVar) {
        int position = jhcVar.getPosition();
        int iLimit = jhcVar.limit();
        boolean z = false;
        while (position < iLimit && !z) {
            int i = position + 1;
            z = ((char) jhcVar.getData()[position]) == ')';
            position = i;
        }
        return jhcVar.readString((position - 1) - jhcVar.getPosition()).trim();
    }

    public List<rji> parseBlock(jhc jhcVar) {
        this.f74722b.setLength(0);
        int position = jhcVar.getPosition();
        m20408b(jhcVar);
        this.f74721a.reset(jhcVar.getData(), jhcVar.getPosition());
        this.f74721a.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector = parseSelector(this.f74721a, this.f74722b);
            if (selector == null || !"{".equals(m20407a(this.f74721a, this.f74722b))) {
                return arrayList;
            }
            rji rjiVar = new rji();
            applySelectorToStyle(rjiVar, selector);
            String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.f74721a.getPosition();
                String strM20407a = m20407a(this.f74721a, this.f74722b);
                boolean z2 = strM20407a == null || "}".equals(strM20407a);
                if (!z2) {
                    this.f74721a.setPosition(position2);
                    parseStyleDeclaration(this.f74721a, rjiVar, this.f74722b);
                }
                str = strM20407a;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(rjiVar);
            }
        }
    }
}
