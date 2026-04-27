package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
@e0g(parameters = 0)
public final class a29 extends qz8<z19> implements r29 {

    /* JADX INFO: renamed from: d */
    public static final int f174d = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final n5b<z19> f175b = new n5b<>();

    /* JADX INFO: renamed from: c */
    @yfb
    public final y29 f176c = new y29(getIntervals());

    /* JADX INFO: renamed from: a29$a */
    public static final class C0016a extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0016a(Object obj) {
            super(1);
            this.f177a = obj;
        }

        @yfb
        public final Object invoke(int i) {
            return this.f177a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: a29$b */
    public static final class C0017b extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0017b(Object obj) {
            super(1);
            this.f178a = obj;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @gib
        public final Object invoke(int i) {
            return this.f178a;
        }
    }

    /* JADX INFO: renamed from: a29$c */
    public static final class C0018c extends tt8 implements qy6<Integer, q0g> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ q0g f179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0018c(q0g q0gVar) {
            super(1);
            this.f179a = q0gVar;
        }

        @yfb
        public final q0g invoke(int i) {
            return this.f179a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ q0g invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: a29$d */
    public static final class C0019d extends tt8 implements oz6<f29, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<f29, zl2, Integer, bth> f180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0019d(kz6<? super f29, ? super zl2, ? super Integer, bth> kz6Var) {
            super(4);
            this.f180a = kz6Var;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(f29 f29Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(f29Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@yfb f29 f29Var, int i, @gib zl2 zl2Var, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= zl2Var.changed(f29Var) ? 4 : 2;
            }
            if ((i2 & 131) == 130 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(657818596, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:47)");
            }
            this.f180a.invoke(f29Var, zl2Var, Integer.valueOf(i2 & 14));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    public a29(@yfb qy6<? super r29, bth> qy6Var) {
        qy6Var.invoke(this);
    }

    @yfb
    public final y29 getSpanProvider() {
        return this.f176c;
    }

    @Override // p000.r29
    public void item(@gib Object obj, @gib Object obj2, @gib q0g q0gVar, @yfb kz6<? super f29, ? super zl2, ? super Integer, bth> kz6Var) {
        items(1, obj != null ? new C0016a(obj) : null, new C0017b(obj2), q0gVar != null ? new C0018c(q0gVar) : null, mk2.composableLambdaInstance(657818596, true, new C0019d(kz6Var)));
    }

    @Override // p000.r29
    public void items(int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @gib qy6<? super Integer, q0g> qy6Var3, @yfb oz6<? super f29, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        getIntervals().addInterval(i, new z19(qy6Var, qy6Var2, qy6Var3, oz6Var));
    }

    @Override // p000.qz8
    @yfb
    public n5b<z19> getIntervals() {
        return this.f175b;
    }
}
