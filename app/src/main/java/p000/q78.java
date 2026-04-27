package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
public final class q78 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final j5b f73411a = new j5b(0);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final int[] f73412b = new int[0];

    @yfb
    public static final p78 emptyIntSet() {
        return f73411a;
    }

    @yfb
    public static final int[] getEmptyIntArray() {
        return f73412b;
    }

    public static final int hash(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    @yfb
    public static final p78 intSetOf() {
        return f73411a;
    }

    @yfb
    public static final j5b mutableIntSetOf() {
        return new j5b(0, 1, null);
    }

    @yfb
    public static final p78 intSetOf(int i) {
        return mutableIntSetOf(i);
    }

    @yfb
    public static final j5b mutableIntSetOf(int i) {
        j5b j5bVar = new j5b(1);
        j5bVar.plusAssign(i);
        return j5bVar;
    }

    @yfb
    public static final p78 intSetOf(int i, int i2) {
        return mutableIntSetOf(i, i2);
    }

    @yfb
    public static final p78 intSetOf(int i, int i2, int i3) {
        return mutableIntSetOf(i, i2, i3);
    }

    @yfb
    public static final j5b mutableIntSetOf(int i, int i2) {
        j5b j5bVar = new j5b(2);
        j5bVar.plusAssign(i);
        j5bVar.plusAssign(i2);
        return j5bVar;
    }

    @yfb
    public static final p78 intSetOf(@yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        j5b j5bVar = new j5b(iArr.length);
        j5bVar.plusAssign(iArr);
        return j5bVar;
    }

    @yfb
    public static final j5b mutableIntSetOf(int i, int i2, int i3) {
        j5b j5bVar = new j5b(3);
        j5bVar.plusAssign(i);
        j5bVar.plusAssign(i2);
        j5bVar.plusAssign(i3);
        return j5bVar;
    }

    @yfb
    public static final j5b mutableIntSetOf(@yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "elements");
        j5b j5bVar = new j5b(iArr.length);
        j5bVar.plusAssign(iArr);
        return j5bVar;
    }
}
