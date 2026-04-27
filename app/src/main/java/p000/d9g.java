package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
public class d9g extends c9g {
    @jjf(version = "1.9")
    @t28
    private static final StringBuilder append(StringBuilder sb, byte b) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((int) b);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, StringBuffer stringBuffer) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendRange(StringBuilder sb, char[] cArr, int i, int i2) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, "value");
        sb.append(cArr, i, i2 - i);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @t64(errorSince = "2.1", warningSince = "1.4")
    @yfb
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine()", imports = {}))
    public static final Appendable appendln(@yfb Appendable appendable) throws IOException {
        md8.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(yjg.f101809b);
        md8.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @jjf(version = "1.3")
    @yfb
    public static final StringBuilder clear(@yfb StringBuilder sb) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8994d(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, FirebaseAnalytics.C3552d.f23234z);
        sb.getChars(i2, i3, cArr, i);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder deleteAt(StringBuilder sb, int i) {
        md8.checkNotNullParameter(sb, "<this>");
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(i);
        md8.checkNotNullExpressionValue(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder deleteRange(StringBuilder sb, int i, int i2) {
        md8.checkNotNullParameter(sb, "<this>");
        StringBuilder sbDelete = sb.delete(i, i2);
        md8.checkNotNullExpressionValue(sbDelete, "delete(...)");
        return sbDelete;
    }

    @jjf(version = "1.9")
    @t28
    private static final StringBuilder insert(StringBuilder sb, int i, byte b) {
        md8.checkNotNullParameter(sb, "<this>");
        StringBuilder sbInsert = sb.insert(i, (int) b);
        md8.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder insertRange(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, "value");
        StringBuilder sbInsert = sb.insert(i, cArr, i2, i3 - i2);
        md8.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @t28
    private static final void set(StringBuilder sb, int i, char c) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i, c);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder setRange(StringBuilder sb, int i, int i2, String str) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(str, "value");
        StringBuilder sbReplace = sb.replace(i, i2, str);
        md8.checkNotNullExpressionValue(sbReplace, "replace(...)");
        return sbReplace;
    }

    @jjf(version = "1.4")
    @t28
    private static final void toCharArray(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, FirebaseAnalytics.C3552d.f23234z);
        sb.getChars(i2, i3, cArr, i);
    }

    @jjf(version = "1.9")
    @t28
    private static final StringBuilder append(StringBuilder sb, short s) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((int) s);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, StringBuilder sb2) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((CharSequence) sb2);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendRange(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(charSequence, "value");
        sb.append(charSequence, i, i2);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) throws IOException {
        md8.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        md8.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendln(appendableAppend);
    }

    @jjf(version = "1.9")
    @t28
    private static final StringBuilder insert(StringBuilder sb, int i, short s) {
        md8.checkNotNullParameter(sb, "<this>");
        StringBuilder sbInsert = sb.insert(i, (int) s);
        md8.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder insertRange(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(charSequence, "value");
        StringBuilder sbInsert = sb.insert(i, charSequence, i2, i3);
        md8.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, int i) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(i);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final Appendable appendln(Appendable appendable, char c) throws IOException {
        md8.checkNotNullParameter(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c);
        md8.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendln(appendableAppend);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, short s) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((int) s);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @t64(errorSince = "2.1", warningSince = "1.4")
    @yfb
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine()", imports = {}))
    public static final StringBuilder appendln(@yfb StringBuilder sb) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(yjg.f101809b);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, byte b) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((int) b);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, StringBuffer stringBuffer) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, long j) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(j);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, CharSequence charSequence) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, float f) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(f);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, String str) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @jjf(version = "1.4")
    @t28
    private static final StringBuilder appendLine(StringBuilder sb, double d) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(d);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        return sb;
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, Object obj) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, StringBuilder sb2) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((CharSequence) sb2);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, char[] cArr) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(cArr, "value");
        sb.append(cArr);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, char c) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(c);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, boolean z) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(z);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, int i) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(i);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, short s) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((int) s);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, byte b) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append((int) b);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, long j) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(j);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, float f) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(f);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }

    @t28
    @t64(errorSince = "2.1", warningSince = "1.4")
    @q64(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @i2e(expression = "appendLine(value)", imports = {}))
    private static final StringBuilder appendln(StringBuilder sb, double d) {
        md8.checkNotNullParameter(sb, "<this>");
        sb.append(d);
        md8.checkNotNullExpressionValue(sb, "append(...)");
        return appendln(sb);
    }
}
