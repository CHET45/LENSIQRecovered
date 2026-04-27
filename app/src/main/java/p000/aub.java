package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class aub {

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b<bth> f11890a;

    private /* synthetic */ aub(z6b z6bVar) {
        this.f11890a = z6bVar;
    }

    /* JADX INFO: renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m27883attachToScopeimpl(z6b<bth> z6bVar) {
        z6bVar.getValue();
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ aub m27884boximpl(z6b z6bVar) {
        return new aub(z6bVar);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static z6b<bth> m27885constructorimpl(@yfb z6b<bth> z6bVar) {
        return z6bVar;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ z6b m27886constructorimpl$default(z6b z6bVar, int i, jt3 jt3Var) {
        if ((i & 1) != 0) {
            z6bVar = stf.mutableStateOf(bth.f14751a, stf.neverEqualPolicy());
        }
        return m27885constructorimpl(z6bVar);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27887equalsimpl(z6b<bth> z6bVar, Object obj) {
        return (obj instanceof aub) && md8.areEqual(z6bVar, ((aub) obj).m27892unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27888equalsimpl0(z6b<bth> z6bVar, z6b<bth> z6bVar2) {
        return md8.areEqual(z6bVar, z6bVar2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m27889hashCodeimpl(z6b<bth> z6bVar) {
        return z6bVar.hashCode();
    }

    /* JADX INFO: renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m27890invalidateScopeimpl(z6b<bth> z6bVar) {
        z6bVar.setValue(bth.f14751a);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m27891toStringimpl(z6b<bth> z6bVar) {
        return "ObservableScopeInvalidator(state=" + z6bVar + ')';
    }

    public boolean equals(Object obj) {
        return m27887equalsimpl(this.f11890a, obj);
    }

    public int hashCode() {
        return m27889hashCodeimpl(this.f11890a);
    }

    public String toString() {
        return m27891toStringimpl(this.f11890a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ z6b m27892unboximpl() {
        return this.f11890a;
    }
}
