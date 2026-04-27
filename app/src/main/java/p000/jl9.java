package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class jl9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final il9 f51118a = new s5b(0);

    @yfb
    public static final il9 emptyLongList() {
        return f51118a;
    }

    @yfb
    public static final il9 longListOf() {
        return f51118a;
    }

    @yfb
    public static final s5b mutableLongListOf() {
        return new s5b(0, 1, null);
    }

    @yfb
    public static final il9 longListOf(long j) {
        return mutableLongListOf(j);
    }

    @yfb
    public static final s5b mutableLongListOf(long j) {
        s5b s5bVar = new s5b(1);
        s5bVar.add(j);
        return s5bVar;
    }

    @yfb
    public static final il9 longListOf(long j, long j2) {
        return mutableLongListOf(j, j2);
    }

    @yfb
    public static final il9 longListOf(long j, long j2, long j3) {
        return mutableLongListOf(j, j2, j3);
    }

    @yfb
    public static final s5b mutableLongListOf(long j, long j2) {
        s5b s5bVar = new s5b(2);
        s5bVar.add(j);
        s5bVar.add(j2);
        return s5bVar;
    }

    @yfb
    public static final il9 longListOf(@yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        s5b s5bVar = new s5b(jArr.length);
        s5bVar.plusAssign(jArr);
        return s5bVar;
    }

    @yfb
    public static final s5b mutableLongListOf(long j, long j2, long j3) {
        s5b s5bVar = new s5b(3);
        s5bVar.add(j);
        s5bVar.add(j2);
        s5bVar.add(j3);
        return s5bVar;
    }

    @yfb
    public static final s5b mutableLongListOf(@yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "elements");
        s5b s5bVar = new s5b(jArr.length);
        s5bVar.plusAssign(jArr);
        return s5bVar;
    }
}
