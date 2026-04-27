package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface dbc {

    /* JADX INFO: renamed from: dbc$a */
    @e0g(parameters = 1)
    public static final class C4725a implements dbc {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C4725a f29204a = new C4725a();

        /* JADX INFO: renamed from: b */
        public static final int f29205b = 0;

        private C4725a() {
        }

        @Override // p000.dbc
        public int calculateMainAxisPageSize(@yfb c64 c64Var, int i, int i2) {
            return i;
        }
    }

    /* JADX INFO: renamed from: dbc$b */
    @e0g(parameters = 1)
    public static final class C4726b implements dbc {

        /* JADX INFO: renamed from: b */
        public static final int f29206b = 0;

        /* JADX INFO: renamed from: a */
        public final float f29207a;

        public /* synthetic */ C4726b(float f, jt3 jt3Var) {
            this(f);
        }

        @Override // p000.dbc
        public int calculateMainAxisPageSize(@yfb c64 c64Var, int i, int i2) {
            return c64Var.mo27167roundToPx0680j_4(this.f29207a);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4726b) {
                return kn4.m30710equalsimpl0(this.f29207a, ((C4726b) obj).f29207a);
            }
            return false;
        }

        /* JADX INFO: renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m28634getPageSizeD9Ej5fM() {
            return this.f29207a;
        }

        public int hashCode() {
            return kn4.m30711hashCodeimpl(this.f29207a);
        }

        private C4726b(float f) {
            this.f29207a = f;
        }
    }

    int calculateMainAxisPageSize(@yfb c64 c64Var, int i, int i2);
}
