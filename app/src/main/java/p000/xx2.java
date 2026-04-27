package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n*L\n34#1:78\n34#1:79,2\n*E\n"})
@e0g(parameters = 1)
public final class xx2 {

    /* JADX INFO: renamed from: b */
    public static final int f99606b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b f99607a;

    /* JADX INFO: renamed from: xx2$a */
    @e0g(parameters = 1)
    public static abstract class AbstractC15340a {

        /* JADX INFO: renamed from: a */
        public static final int f99608a = 0;

        /* JADX INFO: renamed from: xx2$a$a */
        @e0g(parameters = 1)
        public static final class a extends AbstractC15340a {

            /* JADX INFO: renamed from: b */
            @yfb
            public static final a f99609b = new a();

            /* JADX INFO: renamed from: c */
            public static final int f99610c = 0;

            private a() {
                super(null);
            }

            @yfb
            public String toString() {
                return "Closed";
            }
        }

        /* JADX INFO: renamed from: xx2$a$b */
        @dwf({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
        @e0g(parameters = 1)
        public static final class b extends AbstractC15340a {

            /* JADX INFO: renamed from: c */
            public static final int f99611c = 0;

            /* JADX INFO: renamed from: b */
            public final long f99612b;

            public /* synthetic */ b(long j, jt3 jt3Var) {
                this(j);
            }

            public boolean equals(@gib Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return izb.m30426equalsimpl0(this.f99612b, ((b) obj).f99612b);
                }
                return false;
            }

            /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name */
            public final long m33327getOffsetF1C5BW0() {
                return this.f99612b;
            }

            public int hashCode() {
                return izb.m30431hashCodeimpl(this.f99612b);
            }

            @yfb
            public String toString() {
                return "Open(offset=" + ((Object) izb.m30437toStringimpl(this.f99612b)) + ')';
            }

            private b(long j) {
                super(null);
                this.f99612b = j;
                if (!mzb.m31100isSpecifiedk4lQ0M(j)) {
                    throw new IllegalStateException(yx2.f103236a);
                }
            }
        }

        public /* synthetic */ AbstractC15340a(jt3 jt3Var) {
            this();
        }

        private AbstractC15340a() {
        }
    }

    public xx2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@gib Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xx2) {
            return md8.areEqual(((xx2) obj).getStatus(), getStatus());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final AbstractC15340a getStatus() {
        return (AbstractC15340a) this.f99607a.getValue();
    }

    public int hashCode() {
        return getStatus().hashCode();
    }

    public final void setStatus(@yfb AbstractC15340a abstractC15340a) {
        this.f99607a.setValue(abstractC15340a);
    }

    @yfb
    public String toString() {
        return "ContextMenuState(status=" + getStatus() + ')';
    }

    public xx2(@yfb AbstractC15340a abstractC15340a) {
        this.f99607a = xtf.mutableStateOf$default(abstractC15340a, null, 2, null);
    }

    public /* synthetic */ xx2(AbstractC15340a abstractC15340a, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? AbstractC15340a.a.f99609b : abstractC15340a);
    }
}
