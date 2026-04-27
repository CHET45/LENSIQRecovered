package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class co0 extends InterfaceC0701e.d implements fp4, sxb {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public m8f f17214M1;

    /* JADX INFO: renamed from: V1 */
    public long f17215V1;

    /* JADX INFO: renamed from: X */
    public long f17216X;

    /* JADX INFO: renamed from: Y */
    @gib
    public he1 f17217Y;

    /* JADX INFO: renamed from: Z */
    public float f17218Z;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public ov8 f17219Z1;

    /* JADX INFO: renamed from: a2 */
    @gib
    public n8c f17220a2;

    /* JADX INFO: renamed from: b2 */
    @gib
    public m8f f17221b2;

    /* JADX INFO: renamed from: co0$a */
    public static final class C2410a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8121h<n8c> f17222a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ co0 f17223b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ov2 f17224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2410a(jvd.C8121h<n8c> c8121h, co0 co0Var, ov2 ov2Var) {
            super(0);
            this.f17222a = c8121h;
            this.f17223b = co0Var;
            this.f17224c = ov2Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, n8c] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f17222a.f52110a = this.f17223b.getShape().mo27947createOutlinePq9zytI(this.f17224c.mo30273getSizeNHjbRc(), this.f17224c.getLayoutDirection(), this.f17224c);
        }
    }

    public /* synthetic */ co0(long j, he1 he1Var, float f, m8f m8fVar, jt3 jt3Var) {
        this(j, he1Var, f, m8fVar);
    }

    private final void drawOutline(ov2 ov2Var) {
        n8c outline = getOutline(ov2Var);
        if (!w82.m32952equalsimpl0(this.f17216X, w82.f93556b.m32987getUnspecified0d7_KjU())) {
            o8c.m31291drawOutlinewDX37Ww(ov2Var, outline, this.f17216X, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? nu5.f65694a : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : 0);
        }
        he1 he1Var = this.f17217Y;
        if (he1Var != null) {
            o8c.m31290drawOutlinehn5TExg$default(ov2Var, outline, he1Var, this.f17218Z, null, null, 0, 56, null);
        }
    }

    private final void drawRect(ov2 ov2Var) {
        if (!w82.m32952equalsimpl0(this.f17216X, w82.f93556b.m32987getUnspecified0d7_KjU())) {
            ip4.m30248drawRectnJ9OG0$default(ov2Var, this.f17216X, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        he1 he1Var = this.f17217Y;
        if (he1Var != null) {
            ip4.m30247drawRectAsUm42w$default(ov2Var, he1Var, 0L, 0L, this.f17218Z, null, null, 0, 118, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Object, n8c] */
    private final n8c getOutline(ov2 ov2Var) {
        jvd.C8121h c8121h = new jvd.C8121h();
        if (wpf.m33065equalsimpl0(ov2Var.mo30273getSizeNHjbRc(), this.f17215V1) && ov2Var.getLayoutDirection() == this.f17219Z1 && md8.areEqual(this.f17221b2, this.f17214M1)) {
            ?? r1 = this.f17220a2;
            md8.checkNotNull(r1);
            c8121h.f52110a = r1;
        } else {
            txb.observeReads(this, new C2410a(c8121h, this, ov2Var));
        }
        this.f17220a2 = (n8c) c8121h.f52110a;
        this.f17215V1 = ov2Var.mo30273getSizeNHjbRc();
        this.f17219Z1 = ov2Var.getLayoutDirection();
        this.f17221b2 = this.f17214M1;
        T t = c8121h.f52110a;
        md8.checkNotNull(t);
        return (n8c) t;
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        if (this.f17214M1 == cvd.getRectangleShape()) {
            drawRect(ov2Var);
        } else {
            drawOutline(ov2Var);
        }
        ov2Var.drawContent();
    }

    public final float getAlpha() {
        return this.f17218Z;
    }

    @gib
    public final he1 getBrush() {
        return this.f17217Y;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m28229getColor0d7_KjU() {
        return this.f17216X;
    }

    @yfb
    public final m8f getShape() {
        return this.f17214M1;
    }

    @Override // p000.sxb
    public void onObservedReadsChanged() {
        this.f17215V1 = wpf.f95046b.m33077getUnspecifiedNHjbRc();
        this.f17219Z1 = null;
        this.f17220a2 = null;
        this.f17221b2 = null;
        gp4.invalidateDraw(this);
    }

    public final void setAlpha(float f) {
        this.f17218Z = f;
    }

    public final void setBrush(@gib he1 he1Var) {
        this.f17217Y = he1Var;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m28230setColor8_81llA(long j) {
        this.f17216X = j;
    }

    public final void setShape(@yfb m8f m8fVar) {
        this.f17214M1 = m8fVar;
    }

    private co0(long j, he1 he1Var, float f, m8f m8fVar) {
        this.f17216X = j;
        this.f17217Y = he1Var;
        this.f17218Z = f;
        this.f17214M1 = m8fVar;
        this.f17215V1 = wpf.f95046b.m33077getUnspecifiedNHjbRc();
    }
}
