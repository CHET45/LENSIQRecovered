package p000;

import androidx.compose.p002ui.draw.C0699a;
import p000.jvd;
import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n386#2,26:517\n412#2,4:544\n421#2,6:557\n427#2:589\n428#2,2:598\n1#3:543\n546#4,9:548\n555#4,8:590\n128#5,3:563\n184#5,6:566\n272#5,14:572\n132#5,3:586\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n263#1:517,26\n263#1:544,4\n263#1:557,6\n263#1:589\n263#1:598,2\n263#1:543\n263#1:548,9\n263#1:590,8\n269#1:563,3\n281#1:566,6\n281#1:572,14\n269#1:586,3\n*E\n"})
@e0g(parameters = 0)
public final class mb1 extends d44 {

    /* JADX INFO: renamed from: c2 */
    public static final int f60398c2 = 8;

    /* JADX INFO: renamed from: M1 */
    @gib
    public ib1 f60399M1;

    /* JADX INFO: renamed from: V1 */
    public float f60400V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public he1 f60401Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public m8f f60402a2;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public final rl1 f60403b2;

    /* JADX INFO: renamed from: mb1$a */
    public static final class C9244a extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ n8c.C9741a f60404a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ he1 f60405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9244a(n8c.C9741a c9741a, he1 he1Var) {
            super(1);
            this.f60404a = c9741a;
            this.f60405b = he1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            ov2Var.drawContent();
            ip4.m30243drawPathGBMwjPU$default(ov2Var, this.f60404a.getPath(), this.f60405b, 0.0f, null, null, 0, 60, null);
        }
    }

    /* JADX INFO: renamed from: mb1$b */
    @dwf({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n128#2,7:517\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n*L\n294#1:517,7\n*E\n"})
    public static final class C9245b extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rud f60406a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<rs7> f60407b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f60408c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ b92 f60409d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9245b(rud rudVar, jvd.C8121h<rs7> c8121h, long j, b92 b92Var) {
            super(1);
            this.f60406a = rudVar;
            this.f60407b = c8121h;
            this.f60408c = j;
            this.f60409d = b92Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            ov2Var.drawContent();
            float left = this.f60406a.getLeft();
            float top = this.f60406a.getTop();
            jvd.C8121h<rs7> c8121h = this.f60407b;
            long j = this.f60408c;
            b92 b92Var = this.f60409d;
            ov2Var.getDrawContext().getTransform().translate(left, top);
            try {
                ip4.m30237drawImageAZ2fEMs$default(ov2Var, c8121h.f52110a, 0L, j, 0L, 0L, 0.0f, null, b92Var, 0, 0, 890, null);
            } finally {
                ov2Var.getDrawContext().getTransform().translate(-left, -top);
            }
        }
    }

    /* JADX INFO: renamed from: mb1$c */
    @dwf({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n232#2:517\n272#2,14:518\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n*L\n329#1:517\n329#1:518,14\n*E\n"})
    public static final class C9246c extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ eag f60410C;

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f60411a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ he1 f60412b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f60413c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f60414d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f60415e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f60416f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ long f60417m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9246c(boolean z, he1 he1Var, long j, float f, float f2, long j2, long j3, eag eagVar) {
            super(1);
            this.f60411a = z;
            this.f60412b = he1Var;
            this.f60413c = j;
            this.f60414d = f;
            this.f60415e = f2;
            this.f60416f = j2;
            this.f60417m = j3;
            this.f60410C = eagVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) throws Throwable {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) throws Throwable {
            long j;
            ov2Var.drawContent();
            if (this.f60411a) {
                ip4.m30249drawRoundRectZuiqVtQ$default(ov2Var, this.f60412b, 0L, 0L, this.f60413c, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fM32492getXimpl = u03.m32492getXimpl(this.f60413c);
            float f = this.f60414d;
            if (fM32492getXimpl >= f) {
                ip4.m30249drawRoundRectZuiqVtQ$default(ov2Var, this.f60412b, this.f60416f, this.f60417m, lb1.m30859shrinkKibmq7A(this.f60413c, f), 0.0f, this.f60410C, null, 0, 208, null);
                return;
            }
            float f2 = this.f60415e;
            float fM33069getWidthimpl = wpf.m33069getWidthimpl(ov2Var.mo30273getSizeNHjbRc()) - this.f60415e;
            float fM33066getHeightimpl = wpf.m33066getHeightimpl(ov2Var.mo30273getSizeNHjbRc()) - this.f60415e;
            int iM33212getDifferencertfAjoo = x42.f96262b.m33212getDifferencertfAjoo();
            he1 he1Var = this.f60412b;
            long j2 = this.f60413c;
            bp4 drawContext = ov2Var.getDrawContext();
            long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo31598clipRectN_I0leg(f2, f2, fM33069getWidthimpl, fM33066getHeightimpl, iM33212getDifferencertfAjoo);
                j = jMo28019getSizeNHjbRc;
            } catch (Throwable th) {
                th = th;
                j = jMo28019getSizeNHjbRc;
            }
            try {
                ip4.m30249drawRoundRectZuiqVtQ$default(ov2Var, he1Var, 0L, 0L, j2, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo28020setSizeuvyYCjk(j);
            } catch (Throwable th2) {
                th = th2;
                drawContext.getCanvas().restore();
                drawContext.mo28020setSizeuvyYCjk(j);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: mb1$d */
    public static final class C9247d extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vic f60418a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ he1 f60419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9247d(vic vicVar, he1 he1Var) {
            super(1);
            this.f60418a = vicVar;
            this.f60419b = he1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            ov2Var.drawContent();
            ip4.m30243drawPathGBMwjPU$default(ov2Var, this.f60418a, this.f60419b, 0.0f, null, null, 0, 60, null);
        }
    }

    /* JADX INFO: renamed from: mb1$e */
    public static final class C9248e extends tt8 implements qy6<tl1, hp4> {
        public C9248e() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final hp4 invoke(@yfb tl1 tl1Var) {
            if (tl1Var.mo27173toPx0680j_4(mb1.this.m30979getWidthD9Ej5fM()) < 0.0f || wpf.m33068getMinDimensionimpl(tl1Var.m32414getSizeNHjbRc()) <= 0.0f) {
                return lb1.drawContentWithoutBorder(tl1Var);
            }
            float f = 2;
            float fMin = Math.min(kn4.m30710equalsimpl0(mb1.this.m30979getWidthD9Ej5fM(), kn4.f54774b.m30723getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(tl1Var.mo27173toPx0680j_4(mb1.this.m30979getWidthD9Ej5fM())), (float) Math.ceil(wpf.m33068getMinDimensionimpl(tl1Var.m32414getSizeNHjbRc()) / f));
            float f2 = fMin / f;
            long jOffset = mzb.Offset(f2, f2);
            long jSize = eqf.Size(wpf.m33069getWidthimpl(tl1Var.m32414getSizeNHjbRc()) - fMin, wpf.m33066getHeightimpl(tl1Var.m32414getSizeNHjbRc()) - fMin);
            boolean z = f * fMin > wpf.m33068getMinDimensionimpl(tl1Var.m32414getSizeNHjbRc());
            n8c n8cVarMo27947createOutlinePq9zytI = mb1.this.getShape().mo27947createOutlinePq9zytI(tl1Var.m32414getSizeNHjbRc(), tl1Var.getLayoutDirection(), tl1Var);
            if (n8cVarMo27947createOutlinePq9zytI instanceof n8c.C9741a) {
                mb1 mb1Var = mb1.this;
                return mb1Var.drawGenericBorder(tl1Var, mb1Var.getBrush(), (n8c.C9741a) n8cVarMo27947createOutlinePq9zytI, z, fMin);
            }
            if (n8cVarMo27947createOutlinePq9zytI instanceof n8c.C9743c) {
                mb1 mb1Var2 = mb1.this;
                return mb1Var2.m30978drawRoundRectBorderJqoCqck(tl1Var, mb1Var2.getBrush(), (n8c.C9743c) n8cVarMo27947createOutlinePq9zytI, jOffset, jSize, z, fMin);
            }
            if (n8cVarMo27947createOutlinePq9zytI instanceof n8c.C9742b) {
                return lb1.m30858drawRectBorderNsqcLGU(tl1Var, mb1.this.getBrush(), jOffset, jSize, z, fMin);
            }
            throw new ceb();
        }
    }

    public /* synthetic */ mb1(float f, he1 he1Var, m8f m8fVar, jt3 jt3Var) {
        this(f, he1Var, m8fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, rs7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.hp4 drawGenericBorder(p000.tl1 r48, p000.he1 r49, p000.n8c.C9741a r50, boolean r51, float r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mb1.drawGenericBorder(tl1, he1, n8c$a, boolean, float):hp4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final hp4 m30978drawRoundRectBorderJqoCqck(tl1 tl1Var, he1 he1Var, n8c.C9743c c9743c, long j, long j2, boolean z, float f) {
        if (pbe.isSimple(c9743c.getRoundRect())) {
            return tl1Var.onDrawWithContent(new C9246c(z, he1Var, c9743c.getRoundRect().m30993getTopLeftCornerRadiuskKHJgLs(), f / 2, f, j, j2, new eag(f, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.f60399M1 == null) {
            this.f60399M1 = new ib1(null, null, null, null, 15, null);
        }
        ib1 ib1Var = this.f60399M1;
        md8.checkNotNull(ib1Var);
        return tl1Var.onDrawWithContent(new C9247d(lb1.createRoundRectPath(ib1Var.obtainPath(), c9743c.getRoundRect(), f, z), he1Var));
    }

    @yfb
    public final he1 getBrush() {
        return this.f60401Z1;
    }

    @yfb
    public final m8f getShape() {
        return this.f60402a2;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m30979getWidthD9Ej5fM() {
        return this.f60400V1;
    }

    public final void setBrush(@yfb he1 he1Var) {
        if (md8.areEqual(this.f60401Z1, he1Var)) {
            return;
        }
        this.f60401Z1 = he1Var;
        this.f60403b2.invalidateDrawCache();
    }

    public final void setShape(@yfb m8f m8fVar) {
        if (md8.areEqual(this.f60402a2, m8fVar)) {
            return;
        }
        this.f60402a2 = m8fVar;
        this.f60403b2.invalidateDrawCache();
    }

    /* JADX INFO: renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m30980setWidth0680j_4(float f) {
        if (kn4.m30710equalsimpl0(this.f60400V1, f)) {
            return;
        }
        this.f60400V1 = f;
        this.f60403b2.invalidateDrawCache();
    }

    private mb1(float f, he1 he1Var, m8f m8fVar) {
        this.f60400V1 = f;
        this.f60401Z1 = he1Var;
        this.f60402a2 = m8fVar;
        this.f60403b2 = (rl1) m8877a(C0699a.CacheDrawModifierNode(new C9248e()));
    }
}
