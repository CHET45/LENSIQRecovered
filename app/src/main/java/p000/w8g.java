package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class w8g {
    @yfb
    public static final <T extends Appendable> T append(@yfb T t, @yfb CharSequence... charSequenceArr) throws IOException {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(@yfb Appendable appendable, T t, @gib qy6<? super T, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(appendable, "<this>");
        if (qy6Var != null) {
            appendable.append(qy6Var.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    @jjf(version = "1.4")
    @t28
    private static final Appendable appendLine(Appendable appendable) {
        md8.checkNotNullParameter(appendable, "<this>");
        return appendable.append('\n');
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T extends Appendable> T appendRange(@yfb T t, @yfb CharSequence charSequence, int i, int i2) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(charSequence, "value");
        T t2 = (T) t.append(charSequence, i, i2);
        md8.checkNotNull(t2, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t2;
    }

    @jjf(version = "1.4")
    @t28
    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) {
        md8.checkNotNullParameter(appendable, "<this>");
        return appendable.append(charSequence).append('\n');
    }

    @jjf(version = "1.4")
    @t28
    private static final Appendable appendLine(Appendable appendable, char c) {
        md8.checkNotNullParameter(appendable, "<this>");
        return appendable.append(c).append('\n');
    }
}
