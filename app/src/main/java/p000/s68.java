package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class s68 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final q68 f80774a = new g5b(0);

    @yfb
    public static final q68 emptyIntList() {
        return f80774a;
    }

    @yfb
    public static final q68 intListOf() {
        return f80774a;
    }

    @yfb
    public static final g5b mutableIntListOf() {
        return new g5b(0, 1, null);
    }

    @yfb
    public static final q68 intListOf(int i) {
        return mutableIntListOf(i);
    }

    @yfb
    public static final g5b mutableIntListOf(int i) {
        g5b g5bVar = new g5b(1);
        g5bVar.add(i);
        return g5bVar;
    }

    @yfb
    public static final q68 intListOf(int i, int i2) {
        return mutableIntListOf(i, i2);
    }

    @yfb
    public static final q68 intListOf(int i, int i2, int i3) {
        return mutableIntListOf(i, i2, i3);
    }

    @yfb
    public static final g5b mutableIntListOf(int i, int i2) {
        g5b g5bVar = new g5b(2);
        g5bVar.add(i);
        g5bVar.add(i2);
        return g5bVar;
    }

    @yfb
    public static final q68 intListOf(@yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        g5b g5bVar = new g5b(iArr.length);
        g5bVar.plusAssign(iArr);
        return g5bVar;
    }

    @yfb
    public static final g5b mutableIntListOf(int i, int i2, int i3) {
        g5b g5bVar = new g5b(3);
        g5bVar.add(i);
        g5bVar.add(i2);
        g5bVar.add(i3);
        return g5bVar;
    }

    @yfb
    public static final g5b mutableIntListOf(@yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        g5b g5bVar = new g5b(iArr.length);
        g5bVar.plusAssign(iArr);
        return g5bVar;
    }
}
