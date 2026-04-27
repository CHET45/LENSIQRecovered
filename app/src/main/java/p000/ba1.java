package p000;

/* JADX INFO: loaded from: classes.dex */
@vn8
@vw7
public final class ba1 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C1802a f13107b = new C1802a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final m8f f13108c = m27969constructorimpl(cvd.getRectangleShape());

    /* JADX INFO: renamed from: d */
    @yfb
    public static final m8f f13109d = m27969constructorimpl(null);

    /* JADX INFO: renamed from: a */
    @gib
    public final m8f f13110a;

    /* JADX INFO: renamed from: ba1$a */
    public static final class C1802a {
        public /* synthetic */ C1802a(jt3 jt3Var) {
            this();
        }

        @yfb
        /* JADX INFO: renamed from: getRectangle---Goahg, reason: not valid java name */
        public final m8f m27975getRectangleGoahg() {
            return ba1.f13108c;
        }

        @yfb
        /* JADX INFO: renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final m8f m27976getUnboundedGoahg() {
            return ba1.f13109d;
        }

        private C1802a() {
        }
    }

    private /* synthetic */ ba1(m8f m8fVar) {
        this.f13110a = m8fVar;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ba1 m27968boximpl(m8f m8fVar) {
        return new ba1(m8fVar);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static m8f m27969constructorimpl(@gib m8f m8fVar) {
        return m8fVar;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m27970equalsimpl(m8f m8fVar, Object obj) {
        return (obj instanceof ba1) && md8.areEqual(m8fVar, ((ba1) obj).m27974unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27971equalsimpl0(m8f m8fVar, m8f m8fVar2) {
        return md8.areEqual(m8fVar, m8fVar2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m27972hashCodeimpl(m8f m8fVar) {
        if (m8fVar == null) {
            return 0;
        }
        return m8fVar.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m27973toStringimpl(m8f m8fVar) {
        return "BlurredEdgeTreatment(shape=" + m8fVar + ')';
    }

    public boolean equals(Object obj) {
        return m27970equalsimpl(this.f13110a, obj);
    }

    @gib
    public final m8f getShape() {
        return this.f13110a;
    }

    public int hashCode() {
        return m27972hashCodeimpl(this.f13110a);
    }

    public String toString() {
        return m27973toStringimpl(this.f13110a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ m8f m27974unboximpl() {
        return this.f13110a;
    }
}
