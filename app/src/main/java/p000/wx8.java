package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
@e0g(parameters = 0)
public final class wx8 extends qz8<vx8> implements qy8 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C14824b f95667e = new C14824b(null);

    /* JADX INFO: renamed from: f */
    public static final int f95668f = 8;

    /* JADX INFO: renamed from: g */
    @yfb
    public static final gz6<dy8, Integer, ib7> f95669g = C14823a.f95673a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final yy8 f95670b = new yy8(this);

    /* JADX INFO: renamed from: c */
    @yfb
    public final n5b<vx8> f95671c = new n5b<>();

    /* JADX INFO: renamed from: d */
    public boolean f95672d;

    /* JADX INFO: renamed from: wx8$a */
    public static final class C14823a extends tt8 implements gz6<dy8, Integer, ib7> {

        /* JADX INFO: renamed from: a */
        public static final C14823a f95673a = new C14823a();

        public C14823a() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ ib7 invoke(dy8 dy8Var, Integer num) {
            return ib7.m30182boximpl(m33135invoke_orMbw(dy8Var, num.intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m33135invoke_orMbw(@yfb dy8 dy8Var, int i) {
            return xy8.GridItemSpan(1);
        }
    }

    /* JADX INFO: renamed from: wx8$b */
    public static final class C14824b {
        public /* synthetic */ C14824b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final gz6<dy8, Integer, ib7> getDefaultSpan() {
            return wx8.f95669g;
        }

        private C14824b() {
        }
    }

    /* JADX INFO: renamed from: wx8$c */
    public static final class C14825c extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f95674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14825c(Object obj) {
            super(1);
            this.f95674a = obj;
        }

        @yfb
        public final Object invoke(int i) {
            return this.f95674a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: wx8$d */
    public static final class C14826d extends tt8 implements gz6<dy8, Integer, ib7> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<dy8, ib7> f95675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14826d(qy6<? super dy8, ib7> qy6Var) {
            super(2);
            this.f95675a = qy6Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ ib7 invoke(dy8 dy8Var, Integer num) {
            return ib7.m30182boximpl(m33136invoke_orMbw(dy8Var, num.intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m33136invoke_orMbw(@yfb dy8 dy8Var, int i) {
            return this.f95675a.invoke(dy8Var).m30189unboximpl();
        }
    }

    /* JADX INFO: renamed from: wx8$e */
    public static final class C14827e extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f95676a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14827e(Object obj) {
            super(1);
            this.f95676a = obj;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @gib
        public final Object invoke(int i) {
            return this.f95676a;
        }
    }

    /* JADX INFO: renamed from: wx8$f */
    public static final class C14828f extends tt8 implements oz6<by8, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<by8, zl2, Integer, bth> f95677a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14828f(kz6<? super by8, ? super zl2, ? super Integer, bth> kz6Var) {
            super(4);
            this.f95677a = kz6Var;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(by8 by8Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(by8Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@yfb by8 by8Var, int i, @gib zl2 zl2Var, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= zl2Var.changed(by8Var) ? 4 : 2;
            }
            if ((i2 & 131) == 130 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-34608120, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
            }
            this.f95677a.invoke(by8Var, zl2Var, Integer.valueOf(i2 & 14));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    public wx8(@yfb qy6<? super qy8, bth> qy6Var) {
        qy6Var.invoke(this);
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.f95672d;
    }

    @yfb
    public final yy8 getSpanLayoutProvider$foundation_release() {
        return this.f95670b;
    }

    @Override // p000.qy8
    public void item(@gib Object obj, @gib qy6<? super dy8, ib7> qy6Var, @gib Object obj2, @yfb kz6<? super by8, ? super zl2, ? super Integer, bth> kz6Var) {
        getIntervals().addInterval(1, new vx8(obj != null ? new C14825c(obj) : null, qy6Var != null ? new C14826d(qy6Var) : f95669g, new C14827e(obj2), mk2.composableLambdaInstance(-34608120, true, new C14828f(kz6Var))));
        if (qy6Var != null) {
            this.f95672d = true;
        }
    }

    @Override // p000.qy8
    public void items(int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @gib gz6<? super dy8, ? super Integer, ib7> gz6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super by8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        getIntervals().addInterval(i, new vx8(qy6Var, gz6Var == null ? f95669g : gz6Var, qy6Var2, oz6Var));
        if (gz6Var != null) {
            this.f95672d = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z) {
        this.f95672d = z;
    }

    @Override // p000.qz8
    @yfb
    public n5b<vx8> getIntervals() {
        return this.f95671c;
    }
}
