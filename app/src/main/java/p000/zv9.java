package p000;

/* JADX INFO: loaded from: classes8.dex */
public class zv9 {
    public static <T> void assertThat(T t, yv9<? super T> yv9Var) {
        assertThat("", t, yv9Var);
    }

    public static <T> void assertThat(String str, T t, yv9<? super T> yv9Var) {
        if (yv9Var.matches(t)) {
            return;
        }
        p7g p7gVar = new p7g();
        p7gVar.appendText(str).appendText("\nExpected: ").appendDescriptionOf(yv9Var).appendText("\n     but: ");
        yv9Var.describeMismatch(t, p7gVar);
        throw new AssertionError(p7gVar.toString());
    }

    public static void assertThat(String str, boolean z) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
