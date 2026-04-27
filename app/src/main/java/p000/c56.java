package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class c56 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a5b f15798a = new a5b(0);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final float[] f15799b = new float[0];

    @yfb
    public static final b56 emptyFloatSet() {
        return f15798a;
    }

    @yfb
    public static final b56 floatSetOf() {
        return f15798a;
    }

    @yfb
    public static final float[] getEmptyFloatArray() {
        return f15799b;
    }

    public static final int hash(float f) {
        int iHashCode = Float.hashCode(f) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    @yfb
    public static final a5b mutableFloatSetOf() {
        return new a5b(0, 1, null);
    }

    @yfb
    public static final b56 floatSetOf(float f) {
        return mutableFloatSetOf(f);
    }

    @yfb
    public static final a5b mutableFloatSetOf(float f) {
        a5b a5bVar = new a5b(1);
        a5bVar.plusAssign(f);
        return a5bVar;
    }

    @yfb
    public static final b56 floatSetOf(float f, float f2) {
        return mutableFloatSetOf(f, f2);
    }

    @yfb
    public static final b56 floatSetOf(float f, float f2, float f3) {
        return mutableFloatSetOf(f, f2, f3);
    }

    @yfb
    public static final a5b mutableFloatSetOf(float f, float f2) {
        a5b a5bVar = new a5b(2);
        a5bVar.plusAssign(f);
        a5bVar.plusAssign(f2);
        return a5bVar;
    }

    @yfb
    public static final b56 floatSetOf(@yfb float... fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        a5b a5bVar = new a5b(fArr.length);
        a5bVar.plusAssign(fArr);
        return a5bVar;
    }

    @yfb
    public static final a5b mutableFloatSetOf(float f, float f2, float f3) {
        a5b a5bVar = new a5b(3);
        a5bVar.plusAssign(f);
        a5bVar.plusAssign(f2);
        a5bVar.plusAssign(f3);
        return a5bVar;
    }

    @yfb
    public static final a5b mutableFloatSetOf(@yfb float... fArr) {
        md8.checkNotNullParameter(fArr, "elements");
        a5b a5bVar = new a5b(fArr.length);
        a5bVar.plusAssign(fArr);
        return a5bVar;
    }
}
