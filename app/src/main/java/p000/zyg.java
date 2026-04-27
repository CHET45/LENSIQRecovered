package p000;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes8.dex */
public class zyg<T extends Throwable> extends lmh<T> {

    /* JADX INFO: renamed from: c */
    public final yv9<String> f106537c;

    public zyg(yv9<String> yv9Var) {
        this.f106537c = yv9Var;
    }

    @io5
    public static <T extends Throwable> yv9<T> hasMessage(yv9<String> yv9Var) {
        return new zyg(yv9Var);
    }

    @Override // p000.lmh
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void describeMismatchSafely(T t, i74 i74Var) {
        i74Var.appendText("message ");
        this.f106537c.describeMismatch(t.getMessage(), i74Var);
    }

    @Override // p000.lmh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean matchesSafely(T t) {
        return this.f106537c.matches(t.getMessage());
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("exception with message ");
        i74Var.appendDescriptionOf(this.f106537c);
    }
}
