package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class q46 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final p46 f73185a = new x4b(0);

    @yfb
    public static final p46 emptyFloatList() {
        return f73185a;
    }

    @yfb
    public static final p46 floatListOf() {
        return f73185a;
    }

    @yfb
    public static final x4b mutableFloatListOf() {
        return new x4b(0, 1, null);
    }

    @yfb
    public static final p46 floatListOf(float f) {
        return mutableFloatListOf(f);
    }

    @yfb
    public static final x4b mutableFloatListOf(float f) {
        x4b x4bVar = new x4b(1);
        x4bVar.add(f);
        return x4bVar;
    }

    @yfb
    public static final p46 floatListOf(float f, float f2) {
        return mutableFloatListOf(f, f2);
    }

    @yfb
    public static final p46 floatListOf(float f, float f2, float f3) {
        return mutableFloatListOf(f, f2, f3);
    }

    @yfb
    public static final x4b mutableFloatListOf(float f, float f2) {
        x4b x4bVar = new x4b(2);
        x4bVar.add(f);
        x4bVar.add(f2);
        return x4bVar;
    }

    @yfb
    public static final p46 floatListOf(@yfb float... fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        x4b x4bVar = new x4b(fArr.length);
        x4bVar.plusAssign(fArr);
        return x4bVar;
    }

    @yfb
    public static final x4b mutableFloatListOf(float f, float f2, float f3) {
        x4b x4bVar = new x4b(3);
        x4bVar.add(f);
        x4bVar.add(f2);
        x4bVar.add(f3);
        return x4bVar;
    }

    @yfb
    public static final x4b mutableFloatListOf(@yfb float... fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        x4b x4bVar = new x4b(fArr.length);
        x4bVar.plusAssign(fArr);
        return x4bVar;
    }
}
