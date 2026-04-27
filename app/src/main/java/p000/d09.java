package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,65:1\n81#2:66\n107#2,2:67\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n31#1:66\n31#1:67,2\n*E\n"})
@e0g(parameters = 1)
public final class d09 implements i2g<f78> {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C4571a f28134e = new C4571a(null);

    /* JADX INFO: renamed from: f */
    public static final int f28135f = 0;

    /* JADX INFO: renamed from: a */
    public final int f28136a;

    /* JADX INFO: renamed from: b */
    public final int f28137b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f28138c;

    /* JADX INFO: renamed from: d */
    public int f28139d;

    /* JADX INFO: renamed from: d09$a */
    public static final class C4571a {
        public /* synthetic */ C4571a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f78 calculateNearestItemsRange(int i, int i2, int i3) {
            int i4 = (i / i2) * i2;
            return kpd.until(Math.max(i4 - i3, 0), i4 + i2 + i3);
        }

        private C4571a() {
        }
    }

    public d09(int i, int i2, int i3) {
        this.f28136a = i2;
        this.f28137b = i3;
        this.f28138c = stf.mutableStateOf(f28134e.calculateNearestItemsRange(i, i2, i3), stf.structuralEqualityPolicy());
        this.f28139d = i;
    }

    private void setValue(f78 f78Var) {
        this.f28138c.setValue(f78Var);
    }

    public final void update(int i) {
        if (i != this.f28139d) {
            this.f28139d = i;
            setValue(f28134e.calculateNearestItemsRange(i, this.f28136a, this.f28137b));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.i2g
    @yfb
    public f78 getValue() {
        return (f78) this.f28138c.getValue();
    }
}
