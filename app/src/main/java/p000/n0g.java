package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Throwable;

/* JADX INFO: loaded from: classes8.dex */
public class n0g<T extends Throwable> extends lmh<T> {

    /* JADX INFO: renamed from: c */
    public final yv9<T> f62903c;

    public n0g(yv9<T> yv9Var) {
        this.f62903c = yv9Var;
    }

    @io5
    public static <T extends Exception> yv9<T> isException(yv9<T> yv9Var) {
        return new n0g(yv9Var);
    }

    @io5
    public static <T extends Throwable> yv9<T> isThrowable(yv9<T> yv9Var) {
        return new n0g(yv9Var);
    }

    private String readStacktrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // p000.lmh
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void describeMismatchSafely(T t, i74 i74Var) {
        this.f62903c.describeMismatch(t, i74Var);
        i74Var.appendText("\nStacktrace was: ");
        i74Var.appendText(readStacktrace(t));
    }

    @Override // p000.lmh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean matchesSafely(T t) {
        return this.f62903c.matches(t);
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        this.f62903c.describeTo(i74Var);
    }
}
