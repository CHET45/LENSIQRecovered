package p000;

/* JADX INFO: loaded from: classes7.dex */
public class e9g extends d9g {
    @t28
    @q64(level = u64.f86865a, message = "Use append(value: Any?) instead", replaceWith = @i2e(expression = "append(value = obj)", imports = {}))
    private static final StringBuilder append(StringBuilder sb, Object obj) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append('\n');
        return sb;
    }

    @t28
    private static final String buildString(qy6<? super StringBuilder, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        StringBuilder sb = new StringBuilder();
        qy6Var.invoke(sb);
        return sb.toString();
    }

    @yfb
    public static final StringBuilder append(@yfb StringBuilder sb, @yfb String... strArr) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(strArr, "value");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, CharSequence charSequence) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        sb.append('\n');
        return sb;
    }

    @jjf(version = "1.1")
    @t28
    private static final String buildString(int i, qy6<? super StringBuilder, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        StringBuilder sb = new StringBuilder(i);
        qy6Var.invoke(sb);
        return sb.toString();
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, String str) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    @yfb
    public static final StringBuilder append(@yfb StringBuilder sb, @yfb Object... objArr) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(objArr, "value");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, Object obj) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        sb.append('\n');
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, char[] cArr) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, "value");
        sb.append(cArr);
        sb.append('\n');
        return sb;
    }

    @t28
    @q64(level = u64.f86866b, message = "Use appendRange instead.", replaceWith = @i2e(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    private static final StringBuilder append(StringBuilder sb, char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, "str");
        throw new wfb(null, 1, null);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, char c) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(c);
        sb.append('\n');
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, boolean z) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(z);
        sb.append('\n');
        return sb;
    }
}
