package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class pqf<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final zl2 f71657a;

    private /* synthetic */ pqf(zl2 zl2Var) {
        this.f71657a = zl2Var;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ pqf m31854boximpl(zl2 zl2Var) {
        return new pqf(zl2Var);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> zl2 m31855constructorimpl(@yfb zl2 zl2Var) {
        return zl2Var;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31856equalsimpl(zl2 zl2Var, Object obj) {
        return (obj instanceof pqf) && md8.areEqual(zl2Var, ((pqf) obj).m31861unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31857equalsimpl0(zl2 zl2Var, zl2 zl2Var2) {
        return md8.areEqual(zl2Var, zl2Var2);
    }

    @yjd
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31858hashCodeimpl(zl2 zl2Var) {
        return zl2Var.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31859toStringimpl(zl2 zl2Var) {
        return "SkippableUpdater(composer=" + zl2Var + ')';
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m31860updateimpl(zl2 zl2Var, @yfb qy6<? super twh<T>, bth> qy6Var) {
        zl2Var.startReplaceableGroup(509942095);
        qy6Var.invoke(twh.m32448boximpl(twh.m32449constructorimpl(zl2Var)));
        zl2Var.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m31856equalsimpl(this.f71657a, obj);
    }

    public int hashCode() {
        return m31858hashCodeimpl(this.f71657a);
    }

    public String toString() {
        return m31859toStringimpl(this.f71657a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ zl2 m31861unboximpl() {
        return this.f71657a;
    }
}
