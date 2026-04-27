package p000;

/* JADX INFO: loaded from: classes7.dex */
@vn8
public final class xu1<T> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C15301b f99332b = new C15301b(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C15302c f99333c = new C15302c();

    /* JADX INFO: renamed from: a */
    @gib
    public final Object f99334a;

    /* JADX INFO: renamed from: xu1$a */
    public static final class C15300a extends C15302c {

        /* JADX INFO: renamed from: a */
        @gib
        @un8
        public final Throwable f99335a;

        public C15300a(@gib Throwable th) {
            this.f99335a = th;
        }

        public boolean equals(@gib Object obj) {
            return (obj instanceof C15300a) && md8.areEqual(this.f99335a, ((C15300a) obj).f99335a);
        }

        public int hashCode() {
            Throwable th = this.f99335a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p000.xu1.C15302c
        @yfb
        public String toString() {
            return "Closed(" + this.f99335a + ')';
        }
    }

    /* JADX INFO: renamed from: xu1$b */
    @la8
    public static final class C15301b {
        public /* synthetic */ C15301b(jt3 jt3Var) {
            this();
        }

        @la8
        @yfb
        /* JADX INFO: renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m33285closedJP2dKIU(@gib Throwable th) {
            return xu1.m33273constructorimpl(new C15300a(th));
        }

        @la8
        @yfb
        /* JADX INFO: renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m33286failurePtdJZtk() {
            return xu1.m33273constructorimpl(xu1.f99333c);
        }

        @la8
        @yfb
        /* JADX INFO: renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m33287successJP2dKIU(E e) {
            return xu1.m33273constructorimpl(e);
        }

        private C15301b() {
        }
    }

    /* JADX INFO: renamed from: xu1$c */
    public static class C15302c {
        @yfb
        public String toString() {
            return "Failed";
        }
    }

    @yjd
    private /* synthetic */ xu1(Object obj) {
        this.f99334a = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ xu1 m33272boximpl(Object obj) {
        return new xu1(obj);
    }

    @yfb
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m33273constructorimpl(@gib Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33274equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof xu1) && md8.areEqual(obj, ((xu1) obj2).m33284unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33275equalsimpl0(Object obj, Object obj2) {
        return md8.areEqual(obj, obj2);
    }

    @gib
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m33276exceptionOrNullimpl(Object obj) {
        C15300a c15300a = obj instanceof C15300a ? (C15300a) obj : null;
        if (c15300a != null) {
            return c15300a.f99335a;
        }
        return null;
    }

    @yjd
    public static /* synthetic */ void getHolder$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gib
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    public static final T m33277getOrNullimpl(Object obj) {
        if (obj instanceof C15302c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrThrow-impl, reason: not valid java name */
    public static final T m33278getOrThrowimpl(Object obj) throws Throwable {
        Throwable th;
        if (!(obj instanceof C15302c)) {
            return obj;
        }
        if ((obj instanceof C15300a) && (th = ((C15300a) obj).f99335a) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33279hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m33280isClosedimpl(Object obj) {
        return obj instanceof C15300a;
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m33281isFailureimpl(Object obj) {
        return obj instanceof C15302c;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m33282isSuccessimpl(Object obj) {
        return !(obj instanceof C15302c);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33283toStringimpl(Object obj) {
        if (obj instanceof C15300a) {
            return ((C15300a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m33274equalsimpl(this.f99334a, obj);
    }

    public int hashCode() {
        return m33279hashCodeimpl(this.f99334a);
    }

    @yfb
    public String toString() {
        return m33283toStringimpl(this.f99334a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m33284unboximpl() {
        return this.f99334a;
    }
}
