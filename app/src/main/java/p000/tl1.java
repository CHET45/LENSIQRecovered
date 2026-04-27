package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,425:1\n1#2:426\n*E\n"})
@e0g(parameters = 1)
public final class tl1 implements c64 {

    /* JADX INFO: renamed from: e */
    public static final int f85166e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public of1 f85167a = tz4.f86354a;

    /* JADX INFO: renamed from: b */
    @gib
    public hp4 f85168b;

    /* JADX INFO: renamed from: c */
    @gib
    public ov2 f85169c;

    /* JADX INFO: renamed from: d */
    @gib
    public ny6<? extends s97> f85170d;

    /* JADX INFO: renamed from: tl1$a */
    public static final class C13088a extends tt8 implements qy6<ov2, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<ip4, bth> f85171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13088a(qy6<? super ip4, bth> qy6Var) {
            super(1);
            this.f85171a = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ov2 ov2Var) {
            invoke2(ov2Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ov2 ov2Var) {
            this.f85171a.invoke(ov2Var);
            ov2Var.drawContent();
        }
    }

    /* JADX INFO: renamed from: tl1$b */
    @dwf({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope$record$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,425:1\n256#2:426\n317#2,38:427\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope$record$1\n*L\n348#1:426\n349#1:427,38\n*E\n"})
    public static final class C13089b extends tt8 implements qy6<ip4, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c64 f85173b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ov8 f85174c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f85175d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qy6<ov2, bth> f85176e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13089b(c64 c64Var, ov8 ov8Var, long j, qy6<? super ov2, bth> qy6Var) {
            super(1);
            this.f85173b = c64Var;
            this.f85174c = ov8Var;
            this.f85175d = j;
            this.f85176e = qy6Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
            ov2 contentDrawScope$ui_release = tl1.this.getContentDrawScope$ui_release();
            md8.checkNotNull(contentDrawScope$ui_release);
            c64 c64Var = this.f85173b;
            ov8 ov8Var = this.f85174c;
            long j = this.f85175d;
            qy6<ov2, bth> qy6Var = this.f85176e;
            vq1 canvas = ip4Var.getDrawContext().getCanvas();
            long jSize = eqf.Size(r78.m32087getWidthimpl(j), r78.m32086getHeightimpl(j));
            c64 density = contentDrawScope$ui_release.getDrawContext().getDensity();
            ov8 layoutDirection = contentDrawScope$ui_release.getDrawContext().getLayoutDirection();
            vq1 canvas2 = contentDrawScope$ui_release.getDrawContext().getCanvas();
            long jMo28019getSizeNHjbRc = contentDrawScope$ui_release.getDrawContext().mo28019getSizeNHjbRc();
            u97 graphicsLayer = contentDrawScope$ui_release.getDrawContext().getGraphicsLayer();
            bp4 drawContext = contentDrawScope$ui_release.getDrawContext();
            drawContext.setDensity(c64Var);
            drawContext.setLayoutDirection(ov8Var);
            drawContext.setCanvas(canvas);
            drawContext.mo28020setSizeuvyYCjk(jSize);
            drawContext.setGraphicsLayer(null);
            canvas.save();
            try {
                qy6Var.invoke(contentDrawScope$ui_release);
            } finally {
                canvas.restore();
                bp4 drawContext2 = contentDrawScope$ui_release.getDrawContext();
                drawContext2.setDensity(density);
                drawContext2.setLayoutDirection(layoutDirection);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
            }
        }
    }

    /* JADX INFO: renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m32413recordTdoYBX4$default(tl1 tl1Var, u97 u97Var, c64 c64Var, ov8 ov8Var, long j, qy6 qy6Var, int i, Object obj) {
        c64 c64Var2 = (i & 1) != 0 ? tl1Var : c64Var;
        if ((i & 2) != 0) {
            ov8Var = tl1Var.getLayoutDirection();
        }
        ov8 ov8Var2 = ov8Var;
        if ((i & 4) != 0) {
            j = s78.m32287toIntSizeuvyYCjk(tl1Var.m32414getSizeNHjbRc());
        }
        tl1Var.m32415recordTdoYBX4(u97Var, c64Var2, ov8Var2, j, qy6Var);
    }

    @yfb
    public final of1 getCacheParams$ui_release() {
        return this.f85167a;
    }

    @gib
    public final ov2 getContentDrawScope$ui_release() {
        return this.f85169c;
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f85167a.getDensity().getDensity();
    }

    @gib
    public final hp4 getDrawResult$ui_release() {
        return this.f85168b;
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f85167a.getDensity().getFontScale();
    }

    @gib
    public final ny6<s97> getGraphicsContextProvider$ui_release() {
        return this.f85170d;
    }

    @yfb
    public final ov8 getLayoutDirection() {
        return this.f85167a.getLayoutDirection();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m32414getSizeNHjbRc() {
        return this.f85167a.mo28660getSizeNHjbRc();
    }

    @yfb
    public final u97 obtainGraphicsLayer() {
        ny6<? extends s97> ny6Var = this.f85170d;
        md8.checkNotNull(ny6Var);
        return ny6Var.invoke().createGraphicsLayer();
    }

    @yfb
    public final hp4 onDrawBehind(@yfb qy6<? super ip4, bth> qy6Var) {
        return onDrawWithContent(new C13088a(qy6Var));
    }

    @yfb
    public final hp4 onDrawWithContent(@yfb qy6<? super ov2, bth> qy6Var) {
        hp4 hp4Var = new hp4(qy6Var);
        this.f85168b = hp4Var;
        return hp4Var;
    }

    /* JADX INFO: renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m32415recordTdoYBX4(@yfb u97 u97Var, @yfb c64 c64Var, @yfb ov8 ov8Var, long j, @yfb qy6<? super ov2, bth> qy6Var) {
        u97Var.m32573recordmLhObY(c64Var, ov8Var, j, new C13089b(c64Var, ov8Var, j, qy6Var));
    }

    public final void setCacheParams$ui_release(@yfb of1 of1Var) {
        this.f85167a = of1Var;
    }

    public final void setContentDrawScope$ui_release(@gib ov2 ov2Var) {
        this.f85169c = ov2Var;
    }

    public final void setDrawResult$ui_release(@gib hp4 hp4Var) {
        this.f85168b = hp4Var;
    }

    public final void setGraphicsContextProvider$ui_release(@gib ny6<? extends s97> ny6Var) {
        this.f85170d = ny6Var;
    }
}
