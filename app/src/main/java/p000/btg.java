package p000;

/* JADX INFO: loaded from: classes.dex */
public interface btg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C2051a f14745a = C2051a.f14746a;

    /* JADX INFO: renamed from: btg$a */
    @dwf({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,149:1\n696#2:150\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:150\n*E\n"})
    public static final class C2051a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C2051a f14746a = new C2051a();

        private C2051a() {
        }

        @yfb
        public final btg from(@gib he1 he1Var, float f) {
            if (he1Var == null) {
                return C2052b.f14747b;
            }
            if (he1Var instanceof bvf) {
                return m28156from8_81llA(arg.m27876modulateDxMtmZc(((bvf) he1Var).m28160getValue0d7_KjU(), f));
            }
            if (he1Var instanceof a8f) {
                return new ke1((a8f) he1Var, f);
            }
            throw new ceb();
        }

        @yfb
        /* JADX INFO: renamed from: from-8_81llA, reason: not valid java name */
        public final btg m28156from8_81llA(long j) {
            return j != 16 ? new ta2(j, null) : C2052b.f14747b;
        }
    }

    /* JADX INFO: renamed from: btg$b */
    @e0g(parameters = 1)
    public static final class C2052b implements btg {

        /* JADX INFO: renamed from: b */
        @yfb
        public static final C2052b f14747b = new C2052b();

        /* JADX INFO: renamed from: c */
        public static final int f14748c = 0;

        private C2052b() {
        }

        @Override // p000.btg
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // p000.btg
        @gib
        public he1 getBrush() {
            return null;
        }

        @Override // p000.btg
        /* JADX INFO: renamed from: getColor-0d7_KjU */
        public long mo28155getColor0d7_KjU() {
            return w82.f93556b.m32987getUnspecified0d7_KjU();
        }
    }

    /* JADX INFO: renamed from: btg$c */
    public static final class C2053c extends tt8 implements ny6<Float> {
        public C2053c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Float invoke() {
            return Float.valueOf(btg.this.getAlpha());
        }
    }

    /* JADX INFO: renamed from: btg$d */
    public static final class C2054d extends tt8 implements ny6<btg> {
        public C2054d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final btg invoke() {
            return btg.this;
        }
    }

    float getAlpha();

    @gib
    he1 getBrush();

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    long mo28155getColor0d7_KjU();

    @yfb
    default btg merge(@yfb btg btgVar) {
        boolean z = btgVar instanceof ke1;
        return (z && (this instanceof ke1)) ? new ke1(((ke1) btgVar).getValue(), arg.takeOrElse(btgVar.getAlpha(), new C2053c())) : (!z || (this instanceof ke1)) ? (z || !(this instanceof ke1)) ? btgVar.takeOrElse(new C2054d()) : this : btgVar;
    }

    @yfb
    default btg takeOrElse(@yfb ny6<? extends btg> ny6Var) {
        return !md8.areEqual(this, C2052b.f14747b) ? this : ny6Var.invoke();
    }
}
