package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class tsa {

    /* JADX INFO: renamed from: a */
    public static final String f85708a = "List";

    /* JADX INFO: renamed from: b */
    public static final String f85709b = "OrBuilderList";

    /* JADX INFO: renamed from: c */
    public static final String f85710c = "Map";

    /* JADX INFO: renamed from: d */
    public static final String f85711d = "Bytes";

    /* JADX INFO: renamed from: e */
    public static final char[] f85712e;

    static {
        char[] cArr = new char[80];
        f85712e = cArr;
        Arrays.fill(cArr, ' ');
    }

    private tsa() {
    }

    /* JADX INFO: renamed from: a */
    public static void m22764a(StringBuilder buffer, int indent, String name, Object object) {
        if (object instanceof List) {
            Iterator it = ((List) object).iterator();
            while (it.hasNext()) {
                m22764a(buffer, indent, name, it.next());
            }
            return;
        }
        if (object instanceof Map) {
            Iterator it2 = ((Map) object).entrySet().iterator();
            while (it2.hasNext()) {
                m22764a(buffer, indent, name, (Map.Entry) it2.next());
            }
            return;
        }
        buffer.append('\n');
        indent(indent, buffer);
        buffer.append(pascalCaseToSnakeCase(name));
        if (object instanceof String) {
            buffer.append(": \"");
            buffer.append(ctg.m8691e((String) object));
            buffer.append('\"');
            return;
        }
        if (object instanceof vj1) {
            buffer.append(": \"");
            buffer.append(ctg.m8687a((vj1) object));
            buffer.append('\"');
            return;
        }
        if (object instanceof v27) {
            buffer.append(" {");
            reflectivePrintWithIndent((v27) object, buffer, indent + 2);
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append("}");
            return;
        }
        if (!(object instanceof Map.Entry)) {
            buffer.append(": ");
            buffer.append(object);
            return;
        }
        buffer.append(" {");
        Map.Entry entry = (Map.Entry) object;
        int i = indent + 2;
        m22764a(buffer, i, "key", entry.getKey());
        m22764a(buffer, i, "value", entry.getValue());
        buffer.append("\n");
        indent(indent, buffer);
        buffer.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static String m22765b(qsa messageLite, String commentString) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(commentString);
        reflectivePrintWithIndent(messageLite, sb, 0);
        return sb.toString();
    }

    private static void indent(int indent, StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = f85712e;
            int length = indent > cArr.length ? cArr.length : indent;
            buffer.append(cArr, 0, length);
            indent -= length;
        }
    }

    private static boolean isDefaultValue(Object o) {
        return o instanceof Boolean ? !((Boolean) o).booleanValue() : o instanceof Integer ? ((Integer) o).intValue() == 0 : o instanceof Float ? Float.floatToRawIntBits(((Float) o).floatValue()) == 0 : o instanceof Double ? Double.doubleToRawLongBits(((Double) o).doubleValue()) == 0 : o instanceof String ? o.equals("") : o instanceof vj1 ? o.equals(vj1.f91344e) : o instanceof qsa ? o == ((qsa) o).getDefaultInstanceForType() : (o instanceof Enum) && ((Enum) o).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String pascalCase) {
        if (pascalCase.isEmpty()) {
            return pascalCase;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(pascalCase.charAt(0)));
        for (int i = 1; i < pascalCase.length(); i++) {
            char cCharAt = pascalCase.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append(p43.f69617m);
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void reflectivePrintWithIndent(p000.qsa r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tsa.reflectivePrintWithIndent(qsa, java.lang.StringBuilder, int):void");
    }
}
