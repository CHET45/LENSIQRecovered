package p000;

import p000.u0h;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,139:1\n63#1,3:140\n135#1,3:143\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n24#1:140,3\n95#1:143,3\n*E\n"})
public final class zba {
    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    public static final long measureTime(@yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        long jM32503markNowz9LOYto = u0h.C13314b.f86529b.m32503markNowz9LOYto();
        ny6Var.invoke();
        return u0h.C13314b.a.m32508elapsedNowUwyO8pc(jM32503markNowz9LOYto);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    @yfb
    public static final <T> k1h<T> measureTimedValue(@yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        return new k1h<>(ny6Var.invoke(), u0h.C13314b.a.m32508elapsedNowUwyO8pc(u0h.C13314b.f86529b.m32503markNowz9LOYto()), null);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    public static final long measureTime(@yfb u0h u0hVar, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(u0hVar, "<this>");
        md8.checkNotNullParameter(ny6Var, "block");
        e0h e0hVarMarkNow = u0hVar.markNow();
        ny6Var.invoke();
        return e0hVarMarkNow.mo27923elapsedNowUwyO8pc();
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    @yfb
    public static final <T> k1h<T> measureTimedValue(@yfb u0h u0hVar, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(u0hVar, "<this>");
        md8.checkNotNullParameter(ny6Var, "block");
        return new k1h<>(ny6Var.invoke(), u0hVar.markNow().mo27923elapsedNowUwyO8pc(), null);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    public static final long measureTime(@yfb u0h.C13314b c13314b, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(c13314b, "<this>");
        md8.checkNotNullParameter(ny6Var, "block");
        long jM32503markNowz9LOYto = c13314b.m32503markNowz9LOYto();
        ny6Var.invoke();
        return u0h.C13314b.a.m32508elapsedNowUwyO8pc(jM32503markNowz9LOYto);
    }

    @ihi(markerClass = {uh5.class})
    @jjf(version = "1.9")
    @yfb
    public static final <T> k1h<T> measureTimedValue(@yfb u0h.C13314b c13314b, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(c13314b, "<this>");
        md8.checkNotNullParameter(ny6Var, "block");
        return new k1h<>(ny6Var.invoke(), u0h.C13314b.a.m32508elapsedNowUwyO8pc(c13314b.m32503markNowz9LOYto()), null);
    }
}
