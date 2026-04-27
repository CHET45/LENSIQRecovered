package p000;

import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
public final class jm3 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object f51145a;

    static {
        v7e.C13927a c13927a = v7e.f90266b;
        f51145a = v7e.m32723constructorimpl(pd8.getCOROUTINE_SUSPENDED());
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.7")
    public static final <T, R> R invoke(@yfb im3<T, R> im3Var, T t) {
        md8.checkNotNullParameter(im3Var, "<this>");
        return (R) new lm3(im3Var.getBlock$kotlin_stdlib(), t).runCallLoop();
    }
}
