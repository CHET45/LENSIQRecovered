package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/CharArrayPoolBatchSize\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class mv1 extends lv1 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final mv1 f62357c = new mv1();

    private mv1() {
    }

    public final void release(@yfb char[] cArr) {
        md8.checkNotNullParameter(cArr, "array");
        if (cArr.length == 16384) {
            m16394a(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @yfb
    public final char[] take() {
        return super.m16395b(16384);
    }
}
