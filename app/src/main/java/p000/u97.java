package p000;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p002ui.graphics.layer.InterfaceC0742a;
import p000.izb;
import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,1023:1\n603#1,5:1077\n608#1,5:1083\n603#1,5:1134\n608#1,5:1140\n205#2:1024\n205#2:1082\n205#2:1092\n205#2:1139\n44#3,20:1025\n64#3,4:1072\n107#3,6:1098\n113#3,3:1131\n267#4,4:1045\n237#4,7:1049\n248#4,3:1057\n251#4,2:1061\n272#4,2:1063\n254#4,6:1065\n274#4:1071\n267#4,4:1104\n237#4,7:1108\n248#4,3:1116\n251#4,2:1120\n272#4,2:1122\n254#4,6:1124\n274#4:1130\n1810#5:1056\n1672#5:1060\n1810#5:1115\n1672#5:1119\n1#6:1076\n26#7:1088\n26#7:1089\n26#7:1090\n26#7:1091\n38#8,5:1093\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n583#1:1077,5\n583#1:1083,5\n709#1:1134,5\n709#1:1140,5\n138#1:1024\n583#1:1082\n607#1:1092\n709#1:1139\n427#1:1025,20\n427#1:1072,4\n670#1:1098,6\n670#1:1131,3\n427#1:1045,4\n427#1:1049,7\n427#1:1057,3\n427#1:1061,2\n427#1:1063,2\n427#1:1065,6\n427#1:1071\n670#1:1104,4\n670#1:1108,7\n670#1:1116,3\n670#1:1120,2\n670#1:1122,2\n670#1:1124,6\n670#1:1130\n427#1:1056\n427#1:1060\n670#1:1115\n670#1:1119\n585#1:1088\n586#1:1089\n587#1:1090\n588#1:1091\n624#1:1093,5\n*E\n"})
public final class u97 {

    /* JADX INFO: renamed from: v */
    @yfb
    public static final C13414a f87172v = new C13414a(null);

    /* JADX INFO: renamed from: w */
    @yfb
    public static final bv8 f87173w;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC0742a f87174a;

    /* JADX INFO: renamed from: b */
    @gib
    public final wu8 f87175b;

    /* JADX INFO: renamed from: f */
    @gib
    public Outline f87179f;

    /* JADX INFO: renamed from: h */
    public long f87181h;

    /* JADX INFO: renamed from: i */
    public long f87182i;

    /* JADX INFO: renamed from: j */
    public float f87183j;

    /* JADX INFO: renamed from: k */
    @gib
    public n8c f87184k;

    /* JADX INFO: renamed from: l */
    @gib
    public vic f87185l;

    /* JADX INFO: renamed from: m */
    @gib
    public vic f87186m;

    /* JADX INFO: renamed from: n */
    public boolean f87187n;

    /* JADX INFO: renamed from: o */
    @gib
    public icc f87188o;

    /* JADX INFO: renamed from: p */
    public int f87189p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final zy1 f87190q;

    /* JADX INFO: renamed from: r */
    public boolean f87191r;

    /* JADX INFO: renamed from: s */
    public long f87192s;

    /* JADX INFO: renamed from: t */
    public long f87193t;

    /* JADX INFO: renamed from: u */
    public long f87194u;

    /* JADX INFO: renamed from: c */
    @yfb
    public c64 f87176c = cp4.getDefaultDensity();

    /* JADX INFO: renamed from: d */
    @yfb
    public ov8 f87177d = ov8.Ltr;

    /* JADX INFO: renamed from: e */
    @yfb
    public qy6<? super ip4, bth> f87178e = C13415b.f87195a;

    /* JADX INFO: renamed from: g */
    public boolean f87180g = true;

    /* JADX INFO: renamed from: u97$a */
    public static final class C13414a {
        public /* synthetic */ C13414a(jt3 jt3Var) {
            this();
        }

        private C13414a() {
        }
    }

    /* JADX INFO: renamed from: u97$b */
    public static final class C13415b extends tt8 implements qy6<ip4, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13415b f87195a = new C13415b();

        public C13415b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ip4 ip4Var) {
            invoke2(ip4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ip4 ip4Var) {
        }
    }

    /* JADX INFO: renamed from: u97$c */
    @ck3(m4009c = "androidx.compose.ui.graphics.layer.GraphicsLayer", m4010f = "AndroidGraphicsLayer.android.kt", m4011i = {}, m4012l = {847}, m4013m = "toImageBitmap", m4014n = {}, m4015s = {})
    public static final class C13416c extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f87196a;

        /* JADX INFO: renamed from: c */
        public int f87198c;

        public C13416c(zy2<? super C13416c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f87196a = obj;
            this.f87198c |= Integer.MIN_VALUE;
            return u97.this.toImageBitmap(this);
        }
    }

    static {
        f87173w = Build.VERSION.SDK_INT >= 28 ? fv8.f37810a : pgg.f70716a.isLockHardwareCanvasAvailable() ? dv8.f30977a : cv8.f27827a;
    }

    public u97(@yfb InterfaceC0742a interfaceC0742a, @gib wu8 wu8Var) {
        this.f87174a = interfaceC0742a;
        this.f87175b = wu8Var;
        izb.C7673a c7673a = izb.f49009b;
        this.f87181h = c7673a.m30445getZeroF1C5BW0();
        this.f87182i = wpf.f95046b.m33077getUnspecifiedNHjbRc();
        this.f87190q = new zy1();
        interfaceC0742a.setClip(false);
        this.f87192s = a78.f545b.m27211getZeronOccac();
        this.f87193t = r78.f77324b.m32092getZeroYbymL2g();
        this.f87194u = c7673a.m30444getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(u97 u97Var) {
        if (this.f87190q.onDependencyAdded(u97Var)) {
            u97Var.onAddedToParentLayer();
        }
    }

    private final void configureOutline() {
        if (this.f87180g) {
            if (getClip() || getShadowElevation() > 0.0f) {
                vic vicVar = this.f87185l;
                if (vicVar != null) {
                    Outline outlineUpdatePathOutline = updatePathOutline(vicVar);
                    outlineUpdatePathOutline.setAlpha(getAlpha());
                    this.f87174a.setOutline(outlineUpdatePathOutline);
                } else {
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(this.f87193t);
                    long j = this.f87181h;
                    long j2 = this.f87182i;
                    if (j2 != j28.f49422d) {
                        jM32288toSizeozmzZPI = j2;
                    }
                    outlineObtainAndroidOutline.setRoundRect(Math.round(izb.m30429getXimpl(j)), Math.round(izb.m30430getYimpl(j)), Math.round(izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(jM32288toSizeozmzZPI)), Math.round(izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(jM32288toSizeozmzZPI)), this.f87183j);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.f87174a.setOutline(outlineObtainAndroidOutline);
                }
            } else {
                this.f87174a.setOutline(null);
            }
        }
        this.f87180g = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.f87191r && this.f87189p == 0) {
            wu8 wu8Var = this.f87175b;
            if (wu8Var != null) {
                wu8Var.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.f87179f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f87179f = outline2;
        return outline2;
    }

    private final void onAddedToParentLayer() {
        this.f87189p++;
    }

    private final void onRemovedFromParentLayer() {
        this.f87189p--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void recordInternal() {
        /*
            r15 = this;
            zy1 r0 = r15.f87190q
            u97 r1 = p000.zy1.access$getDependency$p(r0)
            p000.zy1.access$setOldDependency$p(r0, r1)
            u6b r1 = p000.zy1.access$getDependenciesSet$p(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto L28
            u6b r2 = p000.zy1.access$getOldDependenciesSet$p(r0)
            if (r2 != 0) goto L22
            u6b r2 = p000.eoe.mutableScatterSetOf()
            p000.zy1.access$setOldDependenciesSet$p(r0, r2)
        L22:
            r2.addAll(r1)
            r1.clear()
        L28:
            r1 = 1
            p000.zy1.access$setTrackingInProgress$p(r0, r1)
            androidx.compose.ui.graphics.layer.a r1 = r15.f87174a
            c64 r2 = r15.f87176c
            ov8 r3 = r15.f87177d
            qy6<? super ip4, bth> r4 = r15.f87178e
            r1.record(r2, r3, r15, r4)
            r1 = 0
            p000.zy1.access$setTrackingInProgress$p(r0, r1)
            u97 r2 = p000.zy1.access$getOldDependency$p(r0)
            if (r2 == 0) goto L44
            r2.onRemovedFromParentLayer()
        L44:
            u6b r0 = p000.zy1.access$getOldDependenciesSet$p(r0)
            if (r0 == 0) goto L97
            boolean r2 = r0.isNotEmpty()
            if (r2 == 0) goto L97
            java.lang.Object[] r2 = r0.f30278b
            long[] r3 = r0.f30277a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L94
            r5 = r1
        L5a:
            r6 = r3[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8f
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L74:
            if (r10 >= r8) goto L8d
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L89
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            u97 r11 = (p000.u97) r11
            r11.onRemovedFromParentLayer()
        L89:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L74
        L8d:
            if (r8 != r9) goto L94
        L8f:
            if (r5 == r4) goto L94
            int r5 = r5 + 1
            goto L5a
        L94:
            r0.clear()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u97.recordInternal():void");
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.f87174a.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.f87184k = null;
        this.f87185l = null;
        this.f87182i = wpf.f95046b.m33077getUnspecifiedNHjbRc();
        this.f87181h = izb.f49009b.m30445getZeroF1C5BW0();
        this.f87183j = 0.0f;
        this.f87180g = true;
        this.f87187n = false;
    }

    private final <T> T resolveOutlinePosition(gz6<? super izb, ? super wpf, ? extends T> gz6Var) {
        long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(this.f87193t);
        long j = this.f87181h;
        long j2 = this.f87182i;
        if (j2 != j28.f49422d) {
            jM32288toSizeozmzZPI = j2;
        }
        return gz6Var.invoke(izb.m30418boximpl(j), wpf.m33057boximpl(jM32288toSizeozmzZPI));
    }

    /* JADX INFO: renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m32562setPositionVbeCjmY(long j, long j2) {
        this.f87174a.mo27676setPositionH0pRuoY(a78.m27201getXimpl(j), a78.m27202getYimpl(j), j2);
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m32563setRectOutlinetz77jQw$default(u97 u97Var, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = izb.f49009b.m30445getZeroF1C5BW0();
        }
        if ((i & 2) != 0) {
            j2 = wpf.f95046b.m33077getUnspecifiedNHjbRc();
        }
        u97Var.m32578setRectOutlinetz77jQw(j, j2);
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m32564setRoundRectOutlineTNW_H78$default(u97 u97Var, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = izb.f49009b.m30445getZeroF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = wpf.f95046b.m33077getUnspecifiedNHjbRc();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        u97Var.m32579setRoundRectOutlineTNW_H78(j3, j4, f);
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m32565setSizeozmzZPI(long j) {
        if (r78.m32085equalsimpl0(this.f87193t, j)) {
            return;
        }
        this.f87193t = j;
        m32562setPositionVbeCjmY(this.f87192s, j);
        if (this.f87182i == j28.f49422d) {
            this.f87180g = true;
            configureOutline();
        }
    }

    private final void transformCanvas(Canvas canvas) {
        float fM27201getXimpl = a78.m27201getXimpl(this.f87192s);
        float fM27202getYimpl = a78.m27202getYimpl(this.f87192s);
        float fM27201getXimpl2 = a78.m27201getXimpl(this.f87192s) + r78.m32087getWidthimpl(this.f87193t);
        float fM27202getYimpl2 = a78.m27202getYimpl(this.f87192s) + r78.m32086getHeightimpl(this.f87193t);
        float alpha = getAlpha();
        b92 colorFilter = getColorFilter();
        int iM32567getBlendMode0nO6VwU = m32567getBlendMode0nO6VwU();
        if (alpha < 1.0f || !q51.m31897equalsimpl0(iM32567getBlendMode0nO6VwU, q51.f73234b.m31928getSrcOver0nO6VwU()) || colorFilter != null || bn2.m28012equalsimpl0(m32568getCompositingStrategyke2Ky5w(), bn2.f14169b.m28018getOffscreenke2Ky5w())) {
            icc iccVarPaint = this.f87188o;
            if (iccVarPaint == null) {
                iccVarPaint = C14793wt.Paint();
                this.f87188o = iccVarPaint;
            }
            iccVarPaint.setAlpha(alpha);
            iccVarPaint.mo30198setBlendModes9anfk8(iM32567getBlendMode0nO6VwU);
            iccVarPaint.setColorFilter(colorFilter);
            canvas.saveLayer(fM27201getXimpl, fM27202getYimpl, fM27201getXimpl2, fM27202getYimpl2, iccVarPaint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(fM27201getXimpl, fM27202getYimpl);
        canvas.concat(this.f87174a.calculateMatrix());
    }

    private final Outline updatePathOutline(vic vicVar) {
        Outline outlineObtainAndroidOutline = obtainAndroidOutline();
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || vicVar.isConvex()) {
            if (i > 30) {
                s8c.f80950a.setPath(outlineObtainAndroidOutline, vicVar);
            } else {
                if (!(vicVar instanceof C4947du)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineObtainAndroidOutline.setConvexPath(((C4947du) vicVar).getInternalPath());
            }
            this.f87187n = !outlineObtainAndroidOutline.canClip();
        } else {
            Outline outline = this.f87179f;
            if (outline != null) {
                outline.setEmpty();
            }
            this.f87187n = true;
            this.f87174a.setInvalidated(true);
        }
        this.f87185l = vicVar;
        return outlineObtainAndroidOutline;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void discardDisplayList$ui_graphics_release() {
        /*
            r15 = this;
            zy1 r0 = r15.f87190q
            u97 r1 = p000.zy1.access$getDependency$p(r0)
            if (r1 == 0) goto Lf
            r1.onRemovedFromParentLayer()
            r1 = 0
            p000.zy1.access$setDependency$p(r0, r1)
        Lf:
            u6b r0 = p000.zy1.access$getDependenciesSet$p(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.f30278b
            long[] r2 = r0.f30277a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            u97 r11 = (p000.u97) r11
            r11.onRemovedFromParentLayer()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.clear()
        L5d:
            androidx.compose.ui.graphics.layer.a r0 = r15.f87174a
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u97.discardDisplayList$ui_graphics_release():void");
    }

    public final void draw$ui_graphics_release(@yfb vq1 vq1Var, @gib u97 u97Var) {
        if (this.f87191r) {
            return;
        }
        recreateDisplayListIfNeeded();
        configureOutline();
        boolean z = true;
        boolean z2 = getShadowElevation() > 0.0f;
        if (z2) {
            vq1Var.enableZ();
        }
        Canvas nativeCanvas = C5437eq.getNativeCanvas(vq1Var);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            nativeCanvas.save();
            transformCanvas(nativeCanvas);
        }
        if (!this.f87187n && (zIsHardwareAccelerated || !getClip())) {
            z = false;
        }
        if (z) {
            vq1Var.save();
            n8c outline = getOutline();
            if (outline instanceof n8c.C9742b) {
                vq1.m32781clipRectmtrdDE$default(vq1Var, outline.getBounds(), 0, 2, null);
            } else if (outline instanceof n8c.C9743c) {
                vic vicVarPath = this.f87186m;
                if (vicVarPath != null) {
                    vicVarPath.rewind();
                } else {
                    vicVarPath = C8522ku.Path();
                    this.f87186m = vicVarPath;
                }
                vic.addRoundRect$default(vicVarPath, ((n8c.C9743c) outline).getRoundRect(), null, 2, null);
                vq1.m32779clipPathmtrdDE$default(vq1Var, vicVarPath, 0, 2, null);
            } else if (outline instanceof n8c.C9741a) {
                vq1.m32779clipPathmtrdDE$default(vq1Var, ((n8c.C9741a) outline).getPath(), 0, 2, null);
            }
        }
        if (u97Var != null) {
            u97Var.addSubLayer(this);
        }
        this.f87174a.draw(vq1Var);
        if (z) {
            vq1Var.restore();
        }
        if (z2) {
            vq1Var.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics_release(@yfb vq1 vq1Var) {
        if (C5437eq.getNativeCanvas(vq1Var).isHardwareAccelerated()) {
            recreateDisplayListIfNeeded();
            this.f87174a.draw(vq1Var);
        }
    }

    @dpg
    public final void emulateTrimMemory$ui_graphics_release() {
        this.f87174a.discardDisplayList();
    }

    public final float getAlpha() {
        return this.f87174a.getAlpha();
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m32566getAmbientShadowColor0d7_KjU() {
        return this.f87174a.mo27667getAmbientShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m32567getBlendMode0nO6VwU() {
        return this.f87174a.mo27668getBlendMode0nO6VwU();
    }

    public final float getCameraDistance() {
        return this.f87174a.getCameraDistance();
    }

    public final boolean getClip() {
        return this.f87174a.getClip();
    }

    @gib
    public final b92 getColorFilter() {
        return this.f87174a.getColorFilter();
    }

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m32568getCompositingStrategyke2Ky5w() {
        return this.f87174a.mo27669getCompositingStrategyke2Ky5w();
    }

    @yfb
    public final InterfaceC0742a getImpl$ui_graphics_release() {
        return this.f87174a;
    }

    public final long getLayerId() {
        return this.f87174a.getLayerId();
    }

    @yfb
    public final n8c getOutline() {
        n8c n8cVar = this.f87184k;
        vic vicVar = this.f87185l;
        if (n8cVar != null) {
            return n8cVar;
        }
        if (vicVar != null) {
            n8c.C9741a c9741a = new n8c.C9741a(vicVar);
            this.f87184k = c9741a;
            return c9741a;
        }
        long jM32288toSizeozmzZPI = s78.m32288toSizeozmzZPI(this.f87193t);
        long j = this.f87181h;
        long j2 = this.f87182i;
        if (j2 != j28.f49422d) {
            jM32288toSizeozmzZPI = j2;
        }
        float fM30429getXimpl = izb.m30429getXimpl(j);
        float fM30430getYimpl = izb.m30430getYimpl(j);
        float fM33069getWidthimpl = fM30429getXimpl + wpf.m33069getWidthimpl(jM32288toSizeozmzZPI);
        float fM33066getHeightimpl = fM30430getYimpl + wpf.m33066getHeightimpl(jM32288toSizeozmzZPI);
        float f = this.f87183j;
        n8c c9743c = f > 0.0f ? new n8c.C9743c(pbe.m31775RoundRectgG7oq9Y(fM30429getXimpl, fM30430getYimpl, fM33069getWidthimpl, fM33066getHeightimpl, v03.CornerRadius$default(f, 0.0f, 2, null))) : new n8c.C9742b(new rud(fM30429getXimpl, fM30430getYimpl, fM33069getWidthimpl, fM33066getHeightimpl));
        this.f87184k = c9743c;
        return c9743c;
    }

    public final long getOwnerViewId() {
        return this.f87174a.getOwnerId();
    }

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m32569getPivotOffsetF1C5BW0() {
        return this.f87194u;
    }

    @gib
    public final ozd getRenderEffect() {
        return this.f87174a.getRenderEffect();
    }

    public final float getRotationX() {
        return this.f87174a.getRotationX();
    }

    public final float getRotationY() {
        return this.f87174a.getRotationY();
    }

    public final float getRotationZ() {
        return this.f87174a.getRotationZ();
    }

    public final float getScaleX() {
        return this.f87174a.getScaleX();
    }

    public final float getScaleY() {
        return this.f87174a.getScaleY();
    }

    public final float getShadowElevation() {
        return this.f87174a.getShadowElevation();
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m32570getSizeYbymL2g() {
        return this.f87193t;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m32571getSpotShadowColor0d7_KjU() {
        return this.f87174a.mo27671getSpotShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m32572getTopLeftnOccac() {
        return this.f87192s;
    }

    public final float getTranslationX() {
        return this.f87174a.getTranslationX();
    }

    public final float getTranslationY() {
        return this.f87174a.getTranslationY();
    }

    public final boolean isReleased() {
        return this.f87191r;
    }

    /* JADX INFO: renamed from: record-mL-hObY, reason: not valid java name */
    public final void m32573recordmLhObY(@yfb c64 c64Var, @yfb ov8 ov8Var, long j, @yfb qy6<? super ip4, bth> qy6Var) {
        m32565setSizeozmzZPI(j);
        this.f87176c = c64Var;
        this.f87177d = ov8Var;
        this.f87178e = qy6Var;
        this.f87174a.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics_release() {
        if (this.f87191r) {
            return;
        }
        this.f87191r = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f) {
        if (this.f87174a.getAlpha() == f) {
            return;
        }
        this.f87174a.setAlpha(f);
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m32574setAmbientShadowColor8_81llA(long j) {
        if (w82.m32952equalsimpl0(j, this.f87174a.mo27667getAmbientShadowColor0d7_KjU())) {
            return;
        }
        this.f87174a.mo27672setAmbientShadowColor8_81llA(j);
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m32575setBlendModes9anfk8(int i) {
        if (q51.m31897equalsimpl0(this.f87174a.mo27668getBlendMode0nO6VwU(), i)) {
            return;
        }
        this.f87174a.mo27673setBlendModes9anfk8(i);
    }

    public final void setCameraDistance(float f) {
        if (this.f87174a.getCameraDistance() == f) {
            return;
        }
        this.f87174a.setCameraDistance(f);
    }

    public final void setClip(boolean z) {
        if (this.f87174a.getClip() != z) {
            this.f87174a.setClip(z);
            this.f87180g = true;
            configureOutline();
        }
    }

    public final void setColorFilter(@gib b92 b92Var) {
        if (md8.areEqual(this.f87174a.getColorFilter(), b92Var)) {
            return;
        }
        this.f87174a.setColorFilter(b92Var);
    }

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m32576setCompositingStrategyWpw9cng(int i) {
        if (bn2.m28012equalsimpl0(this.f87174a.mo27669getCompositingStrategyke2Ky5w(), i)) {
            return;
        }
        this.f87174a.mo27674setCompositingStrategyWpw9cng(i);
    }

    public final void setPathOutline(@yfb vic vicVar) {
        resetOutlineParams();
        this.f87185l = vicVar;
        configureOutline();
    }

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m32577setPivotOffsetk4lQ0M(long j) {
        if (izb.m30426equalsimpl0(this.f87194u, j)) {
            return;
        }
        this.f87194u = j;
        this.f87174a.mo27675setPivotOffsetk4lQ0M(j);
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m32578setRectOutlinetz77jQw(long j, long j2) {
        m32579setRoundRectOutlineTNW_H78(j, j2, 0.0f);
    }

    public final void setRenderEffect(@gib ozd ozdVar) {
        if (md8.areEqual(this.f87174a.getRenderEffect(), ozdVar)) {
            return;
        }
        this.f87174a.setRenderEffect(ozdVar);
    }

    public final void setRotationX(float f) {
        if (this.f87174a.getRotationX() == f) {
            return;
        }
        this.f87174a.setRotationX(f);
    }

    public final void setRotationY(float f) {
        if (this.f87174a.getRotationY() == f) {
            return;
        }
        this.f87174a.setRotationY(f);
    }

    public final void setRotationZ(float f) {
        if (this.f87174a.getRotationZ() == f) {
            return;
        }
        this.f87174a.setRotationZ(f);
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m32579setRoundRectOutlineTNW_H78(long j, long j2, float f) {
        if (izb.m30426equalsimpl0(this.f87181h, j) && wpf.m33065equalsimpl0(this.f87182i, j2) && this.f87183j == f && this.f87185l == null) {
            return;
        }
        resetOutlineParams();
        this.f87181h = j;
        this.f87182i = j2;
        this.f87183j = f;
        configureOutline();
    }

    public final void setScaleX(float f) {
        if (this.f87174a.getScaleX() == f) {
            return;
        }
        this.f87174a.setScaleX(f);
    }

    public final void setScaleY(float f) {
        if (this.f87174a.getScaleY() == f) {
            return;
        }
        this.f87174a.setScaleY(f);
    }

    public final void setShadowElevation(float f) {
        if (this.f87174a.getShadowElevation() == f) {
            return;
        }
        this.f87174a.setShadowElevation(f);
        this.f87174a.setClip(getClip() || f > 0.0f);
        this.f87180g = true;
        configureOutline();
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m32580setSpotShadowColor8_81llA(long j) {
        if (w82.m32952equalsimpl0(j, this.f87174a.mo27671getSpotShadowColor0d7_KjU())) {
            return;
        }
        this.f87174a.mo27677setSpotShadowColor8_81llA(j);
    }

    /* JADX INFO: renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m32581setTopLeftgyyYBs(long j) {
        if (a78.m27200equalsimpl0(this.f87192s, j)) {
            return;
        }
        this.f87192s = j;
        m32562setPositionVbeCjmY(j, this.f87193t);
    }

    public final void setTranslationX(float f) {
        if (this.f87174a.getTranslationX() == f) {
            return;
        }
        this.f87174a.setTranslationX(f);
    }

    public final void setTranslationY(float f) {
        if (this.f87174a.getTranslationY() == f) {
            return;
        }
        this.f87174a.setTranslationY(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object toImageBitmap(@p000.yfb p000.zy2<? super p000.rs7> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p000.u97.C13416c
            if (r0 == 0) goto L13
            r0 = r5
            u97$c r0 = (p000.u97.C13416c) r0
            int r1 = r0.f87198c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87198c = r1
            goto L18
        L13:
            u97$c r0 = new u97$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f87196a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f87198c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p000.y7e.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p000.y7e.throwOnFailure(r5)
            bv8 r5 = p000.u97.f87173w
            r0.f87198c = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            rs7 r5 = p000.C5460et.asImageBitmap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u97.toImageBitmap(zy2):java.lang.Object");
    }
}
