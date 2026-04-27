package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceKt\n*L\n1#1,109:1\n105#2,4:110\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n78#1:110,4\n*E\n"})
@e0g(parameters = 1)
public final class bcc implements zbc {

    /* JADX INFO: renamed from: c */
    public static final int f13330c = 0;

    /* JADX INFO: renamed from: b */
    public final int f13331b;

    public bcc(int i) {
        this.f13331b = i;
    }

    @Override // p000.zbc
    public int calculateTargetPage(int i, int i2, float f, int i3, int i4) {
        long j = i;
        return kpd.coerceIn(i2, (int) kpd.coerceAtLeast(j - ((long) this.f13331b), 0L), (int) kpd.coerceAtMost(j + ((long) this.f13331b), 2147483647L));
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof bcc) && this.f13331b == ((bcc) obj).f13331b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13331b);
    }
}
