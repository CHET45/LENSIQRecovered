package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class pji {

    /* JADX INFO: renamed from: c */
    public static final String f71126c = "WebvttCssParser";

    /* JADX INFO: renamed from: d */
    public static final String f71127d = "{";

    /* JADX INFO: renamed from: e */
    public static final String f71128e = "}";

    /* JADX INFO: renamed from: f */
    public static final String f71129f = "color";

    /* JADX INFO: renamed from: g */
    public static final String f71130g = "background-color";

    /* JADX INFO: renamed from: h */
    public static final String f71131h = "font-family";

    /* JADX INFO: renamed from: i */
    public static final String f71132i = "font-weight";

    /* JADX INFO: renamed from: j */
    public static final String f71133j = "font-size";

    /* JADX INFO: renamed from: k */
    public static final String f71134k = "ruby-position";

    /* JADX INFO: renamed from: l */
    public static final String f71135l = "over";

    /* JADX INFO: renamed from: m */
    public static final String f71136m = "under";

    /* JADX INFO: renamed from: n */
    public static final String f71137n = "text-combine-upright";

    /* JADX INFO: renamed from: o */
    public static final String f71138o = "all";

    /* JADX INFO: renamed from: p */
    public static final String f71139p = "digits";

    /* JADX INFO: renamed from: q */
    public static final String f71140q = "text-decoration";

    /* JADX INFO: renamed from: r */
    public static final String f71141r = "bold";

    /* JADX INFO: renamed from: s */
    public static final String f71142s = "underline";

    /* JADX INFO: renamed from: t */
    public static final String f71143t = "font-style";

    /* JADX INFO: renamed from: u */
    public static final String f71144u = "italic";

    /* JADX INFO: renamed from: v */
    public static final Pattern f71145v = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: w */
    public static final Pattern f71146w = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final ihc f71147a = new ihc();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f71148b = new StringBuilder();

    @hib
    /* JADX INFO: renamed from: a */
    public static String m19542a(ihc ihcVar, StringBuilder sb) {
        m19544c(ihcVar);
        if (ihcVar.bytesLeft() == 0) {
            return null;
        }
        String identifier = parseIdentifier(ihcVar, sb);
        if (!"".equals(identifier)) {
            return identifier;
        }
        return "" + ((char) ihcVar.readUnsignedByte());
    }

    private void applySelectorToStyle(sji sjiVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f71145v.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                sjiVar.setTargetVoice((String) u80.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = x0i.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            sjiVar.setTargetTagName(str2.substring(0, iIndexOf2));
            sjiVar.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            sjiVar.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            sjiVar.setTargetClasses((String[]) x0i.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19543b(ihc ihcVar) {
        while (!TextUtils.isEmpty(ihcVar.readLine())) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m19544c(ihc ihcVar) {
        while (true) {
            for (boolean z = true; ihcVar.bytesLeft() > 0 && z; z = false) {
                if (maybeSkipWhitespace(ihcVar) || maybeSkipComment(ihcVar)) {
                    break;
                }
            }
            return;
        }
    }

    private static boolean maybeSkipComment(ihc ihcVar) {
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        byte[] data = ihcVar.getData();
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
                ihcVar.skipBytes(iLimit - ihcVar.getPosition());
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

    private static boolean maybeSkipWhitespace(ihc ihcVar) {
        char cPeekCharAtPosition = peekCharAtPosition(ihcVar, ihcVar.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        ihcVar.skipBytes(1);
        return true;
    }

    private static void parseFontSize(String str, sji sjiVar) {
        Matcher matcher = f71146w.matcher(i80.toLowerCase(str));
        if (!matcher.matches()) {
            yh9.m25919w("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) u80.checkNotNull(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                sjiVar.setFontSizeUnit(3);
                break;
            case "em":
                sjiVar.setFontSizeUnit(2);
                break;
            case "px":
                sjiVar.setFontSizeUnit(1);
                break;
            default:
                throw new IllegalStateException();
        }
        sjiVar.setFontSize(Float.parseFloat((String) u80.checkNotNull(matcher.group(1))));
    }

    private static String parseIdentifier(ihc ihcVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        while (position < iLimit && !z) {
            char c = (char) ihcVar.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c);
            }
        }
        ihcVar.skipBytes(position - ihcVar.getPosition());
        return sb.toString();
    }

    @hib
    private static String parsePropertyValue(ihc ihcVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int position = ihcVar.getPosition();
            String strM19542a = m19542a(ihcVar, sb);
            if (strM19542a == null) {
                return null;
            }
            if ("}".equals(strM19542a) || ";".equals(strM19542a)) {
                ihcVar.setPosition(position);
                z = true;
            } else {
                sb2.append(strM19542a);
            }
        }
        return sb2.toString();
    }

    @hib
    private static String parseSelector(ihc ihcVar, StringBuilder sb) {
        m19544c(ihcVar);
        if (ihcVar.bytesLeft() < 5 || !"::cue".equals(ihcVar.readString(5))) {
            return null;
        }
        int position = ihcVar.getPosition();
        String strM19542a = m19542a(ihcVar, sb);
        if (strM19542a == null) {
            return null;
        }
        if ("{".equals(strM19542a)) {
            ihcVar.setPosition(position);
            return "";
        }
        String cueTarget = c0b.f15433c.equals(strM19542a) ? readCueTarget(ihcVar) : null;
        if (c0b.f15434d.equals(m19542a(ihcVar, sb))) {
            return cueTarget;
        }
        return null;
    }

    private static void parseStyleDeclaration(ihc ihcVar, sji sjiVar, StringBuilder sb) {
        m19544c(ihcVar);
        String identifier = parseIdentifier(ihcVar, sb);
        if (!"".equals(identifier) && g1i.f38277c.equals(m19542a(ihcVar, sb))) {
            m19544c(ihcVar);
            String propertyValue = parsePropertyValue(ihcVar, sb);
            if (propertyValue == null || "".equals(propertyValue)) {
                return;
            }
            int position = ihcVar.getPosition();
            String strM19542a = m19542a(ihcVar, sb);
            if (!";".equals(strM19542a)) {
                if (!"}".equals(strM19542a)) {
                    return;
                } else {
                    ihcVar.setPosition(position);
                }
            }
            if ("color".equals(identifier)) {
                sjiVar.setFontColor(s92.parseCssColor(propertyValue));
                return;
            }
            if ("background-color".equals(identifier)) {
                sjiVar.setBackgroundColor(s92.parseCssColor(propertyValue));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(identifier)) {
                if ("over".equals(propertyValue)) {
                    sjiVar.setRubyPosition(1);
                    return;
                } else {
                    if ("under".equals(propertyValue)) {
                        sjiVar.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(identifier)) {
                if (!"all".equals(propertyValue) && !propertyValue.startsWith("digits")) {
                    z = false;
                }
                sjiVar.setCombineUpright(z);
                return;
            }
            if ("text-decoration".equals(identifier)) {
                if ("underline".equals(propertyValue)) {
                    sjiVar.setUnderline(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(identifier)) {
                sjiVar.setFontFamily(propertyValue);
                return;
            }
            if ("font-weight".equals(identifier)) {
                if ("bold".equals(propertyValue)) {
                    sjiVar.setBold(true);
                }
            } else if ("font-style".equals(identifier)) {
                if ("italic".equals(propertyValue)) {
                    sjiVar.setItalic(true);
                }
            } else if ("font-size".equals(identifier)) {
                parseFontSize(propertyValue, sjiVar);
            }
        }
    }

    private static char peekCharAtPosition(ihc ihcVar, int i) {
        return (char) ihcVar.getData()[i];
    }

    private static String readCueTarget(ihc ihcVar) {
        int position = ihcVar.getPosition();
        int iLimit = ihcVar.limit();
        boolean z = false;
        while (position < iLimit && !z) {
            int i = position + 1;
            z = ((char) ihcVar.getData()[position]) == ')';
            position = i;
        }
        return ihcVar.readString((position - 1) - ihcVar.getPosition()).trim();
    }

    public List<sji> parseBlock(ihc ihcVar) {
        this.f71148b.setLength(0);
        int position = ihcVar.getPosition();
        m19543b(ihcVar);
        this.f71147a.reset(ihcVar.getData(), ihcVar.getPosition());
        this.f71147a.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector = parseSelector(this.f71147a, this.f71148b);
            if (selector == null || !"{".equals(m19542a(this.f71147a, this.f71148b))) {
                return arrayList;
            }
            sji sjiVar = new sji();
            applySelectorToStyle(sjiVar, selector);
            String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.f71147a.getPosition();
                String strM19542a = m19542a(this.f71147a, this.f71148b);
                boolean z2 = strM19542a == null || "}".equals(strM19542a);
                if (!z2) {
                    this.f71147a.setPosition(position2);
                    parseStyleDeclaration(this.f71147a, sjiVar, this.f71148b);
                }
                str = strM19542a;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(sjiVar);
            }
        }
    }
}
