package p000;

/* JADX INFO: loaded from: classes7.dex */
public class jpd {
    public static final void checkStepIsPositive(boolean z, @yfb Number number) {
        md8.checkNotNullParameter(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + a18.f100c);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::La62<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @jjf(version = "1.3")
    @t28
    private static final boolean contains(a62 a62Var, Object obj) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return obj != null && a62Var.contains((Comparable) obj);
    }

    @yfb
    public static final <T extends Comparable<? super T>> a62<T> rangeTo(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(t2, "that");
        return new vc2(t, t2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @yfb
    public static final <T extends Comparable<? super T>> r5c<T> rangeUntil(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(t2, "that");
        return new uc2(t, t2);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lr5c<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @t28
    private static final boolean contains(r5c r5cVar, Object obj) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return obj != null && r5cVar.contains((Comparable) obj);
    }

    @jjf(version = "1.1")
    @yfb
    public static final z52<Double> rangeTo(double d, double d2) {
        return new x52(d, d2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @yfb
    public static final r5c<Double> rangeUntil(double d, double d2) {
        return new p5c(d, d2);
    }

    @jjf(version = "1.1")
    @yfb
    public static z52<Float> rangeTo(float f, float f2) {
        return new y52(f, f2);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @yfb
    public static final r5c<Float> rangeUntil(float f, float f2) {
        return new q5c(f, f2);
    }
}
