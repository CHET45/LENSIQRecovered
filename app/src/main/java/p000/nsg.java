package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,371:1\n76#2:372\n109#2,2:373\n76#2:375\n109#2,2:376\n81#3:378\n107#3,2:379\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n254#1:372\n254#1:373,2\n260#1:375\n260#1:376,2\n275#1:378\n275#1:379,2\n*E\n"})
public final class nsg {

    /* JADX INFO: renamed from: g */
    public static final int f65527g = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final b5b f65529a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final b5b f65530b;

    /* JADX INFO: renamed from: c */
    @yfb
    public rud f65531c;

    /* JADX INFO: renamed from: d */
    public long f65532d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f65533e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C10047c f65526f = new C10047c(null);

    /* JADX INFO: renamed from: h */
    @yfb
    public static final dme<nsg, Object> f65528h = q99.listSaver(C10045a.f65534a, C10046b.f65535a);

    /* JADX INFO: renamed from: nsg$a */
    public static final class C10045a extends tt8 implements gz6<fme, nsg, List<? extends Object>> {

        /* JADX INFO: renamed from: a */
        public static final C10045a f65534a = new C10045a();

        public C10045a() {
            super(2);
        }

        @Override // p000.gz6
        @yfb
        public final List<Object> invoke(@yfb fme fmeVar, @yfb nsg nsgVar) {
            return l82.listOf(Float.valueOf(nsgVar.getOffset()), Boolean.valueOf(nsgVar.getOrientation() == t7c.Vertical));
        }
    }

    /* JADX INFO: renamed from: nsg$b */
    public static final class C10046b extends tt8 implements qy6<List<? extends Object>, nsg> {

        /* JADX INFO: renamed from: a */
        public static final C10046b f65535a = new C10046b();

        public C10046b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final nsg invoke(@yfb List<? extends Object> list) {
            Object obj = list.get(1);
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            t7c t7cVar = ((Boolean) obj).booleanValue() ? t7c.Vertical : t7c.Horizontal;
            Object obj2 = list.get(0);
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new nsg(t7cVar, ((Float) obj2).floatValue());
        }
    }

    /* JADX INFO: renamed from: nsg$c */
    public static final class C10047c {
        public /* synthetic */ C10047c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<nsg, Object> getSaver() {
            return nsg.f65528h;
        }

        private C10047c() {
        }
    }

    public nsg(@yfb t7c t7cVar, float f) {
        this.f65529a = pbd.mutableFloatStateOf(f);
        this.f65530b = pbd.mutableFloatStateOf(0.0f);
        this.f65531c = rud.f79687e.getZero();
        this.f65532d = jvg.f52112b.m30598getZerod9O1mEE();
        this.f65533e = stf.mutableStateOf(t7cVar, stf.structuralEqualityPolicy());
    }

    private final void setMaximum(float f) {
        this.f65530b.setFloatValue(f);
    }

    public final void coerceOffset$foundation_release(float f, float f2, int i) {
        float offset = getOffset();
        float f3 = i;
        float f4 = offset + f3;
        setOffset(getOffset() + ((f2 <= f4 && (f >= offset || f2 - f <= f3)) ? (f >= offset || f2 - f > f3) ? 0.0f : f - offset : f2 - f4));
    }

    public final float getMaximum() {
        return this.f65530b.getFloatValue();
    }

    public final float getOffset() {
        return this.f65529a.getFloatValue();
    }

    /* JADX INFO: renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m31213getOffsetToFollow5zctL8(long j) {
        return jvg.m30593getStartimpl(j) != jvg.m30593getStartimpl(this.f65532d) ? jvg.m30593getStartimpl(j) : jvg.m30588getEndimpl(j) != jvg.m30588getEndimpl(this.f65532d) ? jvg.m30588getEndimpl(j) : jvg.m30591getMinimpl(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public final t7c getOrientation() {
        return (t7c) this.f65533e.getValue();
    }

    /* JADX INFO: renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m31214getPreviousSelectiond9O1mEE() {
        return this.f65532d;
    }

    public final void setOffset(float f) {
        this.f65529a.setFloatValue(f);
    }

    public final void setOrientation(@yfb t7c t7cVar) {
        this.f65533e.setValue(t7cVar);
    }

    /* JADX INFO: renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m31215setPreviousSelection5zctL8(long j) {
        this.f65532d = j;
    }

    public final void update(@yfb t7c t7cVar, @yfb rud rudVar, int i, int i2) {
        float f = i2 - i;
        setMaximum(f);
        if (rudVar.getLeft() != this.f65531c.getLeft() || rudVar.getTop() != this.f65531c.getTop()) {
            boolean z = t7cVar == t7c.Vertical;
            coerceOffset$foundation_release(z ? rudVar.getTop() : rudVar.getLeft(), z ? rudVar.getBottom() : rudVar.getRight(), i);
            this.f65531c = rudVar;
        }
        setOffset(kpd.coerceIn(getOffset(), 0.0f, f));
    }

    public /* synthetic */ nsg(t7c t7cVar, float f, int i, jt3 jt3Var) {
        this(t7cVar, (i & 2) != 0 ? 0.0f : f);
    }

    public nsg() {
        this(t7c.Vertical, 0.0f, 2, null);
    }
}
