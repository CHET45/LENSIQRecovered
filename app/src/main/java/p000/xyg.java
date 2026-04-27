package p000;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes8.dex */
public class xyg<T extends Throwable> extends lmh<T> {

    /* JADX INFO: renamed from: c */
    public final yv9<? extends Throwable> f99765c;

    public xyg(yv9<? extends Throwable> yv9Var) {
        this.f99765c = yv9Var;
    }

    @io5
    public static <T extends Throwable> yv9<T> hasCause(yv9<? extends Throwable> yv9Var) {
        return new xyg(yv9Var);
    }

    @Override // p000.lmh
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void describeMismatchSafely(T t, i74 i74Var) {
        i74Var.appendText("cause ");
        this.f99765c.describeMismatch(t.getCause(), i74Var);
    }

    @Override // p000.lmh
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean matchesSafely(T t) {
        return this.f99765c.matches(t.getCause());
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        i74Var.appendText("exception with cause ");
        i74Var.appendDescriptionOf(this.f99765c);
    }
}
