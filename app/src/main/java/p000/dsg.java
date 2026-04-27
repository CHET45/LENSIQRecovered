package p000;

import p000.C9041lz;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,458:1\n232#1,4:466\n237#1:476\n81#2:459\n107#2,2:460\n81#2:462\n107#2,2:463\n2420#3:465\n2302#3:470\n1843#3:471\n2303#3,2:473\n2302#3:477\n1843#3:478\n2303#3,2:480\n89#4:472\n89#4:479\n1#5:475\n1#5:482\n1#5:483\n1240#6:484\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n*L\n213#1:466,4\n213#1:476\n65#1:459\n65#1:460,2\n69#1:462\n69#1:463,2\n157#1:465\n213#1:470\n213#1:471\n213#1:473,2\n235#1:477\n235#1:478\n235#1:480,2\n213#1:472\n235#1:479\n213#1:475\n235#1:482\n270#1:484\n*E\n"})
@e0g(parameters = 1)
public final class dsg implements i2g<hug>, x2g {

    /* JADX INFO: renamed from: e */
    public static final int f30603e = 0;

    /* JADX INFO: renamed from: c */
    @gib
    public uug f30606c;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b f30604a = stf.mutableStateOf(null, C4934c.f30627e.getMutationPolicy());

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f30605b = stf.mutableStateOf(null, C4933b.f30619g.getMutationPolicy());

    /* JADX INFO: renamed from: d */
    @yfb
    public C4932a f30607d = new C4932a();

    /* JADX INFO: renamed from: dsg$a */
    public static final class C4932a extends z2g {

        /* JADX INFO: renamed from: d */
        @gib
        public CharSequence f30608d;

        /* JADX INFO: renamed from: e */
        @gib
        public jvg f30609e;

        /* JADX INFO: renamed from: f */
        @gib
        public yvg f30610f;

        /* JADX INFO: renamed from: g */
        public boolean f30611g;

        /* JADX INFO: renamed from: h */
        public boolean f30612h;

        /* JADX INFO: renamed from: k */
        @gib
        public ov8 f30615k;

        /* JADX INFO: renamed from: l */
        @gib
        public do6.InterfaceC4891b f30616l;

        /* JADX INFO: renamed from: n */
        @gib
        public hug f30618n;

        /* JADX INFO: renamed from: i */
        public float f30613i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f30614j = Float.NaN;

        /* JADX INFO: renamed from: m */
        public long f30617m = nu2.Constraints$default(0, 0, 0, 0, 15, null);

        @Override // p000.z2g
        public void assign(@yfb z2g z2gVar) {
            md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            C4932a c4932a = (C4932a) z2gVar;
            this.f30608d = c4932a.f30608d;
            this.f30609e = c4932a.f30609e;
            this.f30610f = c4932a.f30610f;
            this.f30611g = c4932a.f30611g;
            this.f30612h = c4932a.f30612h;
            this.f30613i = c4932a.f30613i;
            this.f30614j = c4932a.f30614j;
            this.f30615k = c4932a.f30615k;
            this.f30616l = c4932a.f30616l;
            this.f30617m = c4932a.f30617m;
            this.f30618n = c4932a.f30618n;
        }

        @Override // p000.z2g
        @yfb
        public z2g create() {
            return new C4932a();
        }

        @gib
        /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
        public final jvg m28688getCompositionMzsxiRA() {
            return this.f30609e;
        }

        /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m28689getConstraintsmsEJaDk() {
            return this.f30617m;
        }

        public final float getDensityValue() {
            return this.f30613i;
        }

        @gib
        public final do6.InterfaceC4891b getFontFamilyResolver() {
            return this.f30616l;
        }

        public final float getFontScale() {
            return this.f30614j;
        }

        @gib
        public final ov8 getLayoutDirection() {
            return this.f30615k;
        }

        @gib
        public final hug getLayoutResult() {
            return this.f30618n;
        }

        public final boolean getSingleLine() {
            return this.f30611g;
        }

        public final boolean getSoftWrap() {
            return this.f30612h;
        }

        @gib
        public final yvg getTextStyle() {
            return this.f30610f;
        }

        @gib
        public final CharSequence getVisualText() {
            return this.f30608d;
        }

        /* JADX INFO: renamed from: setComposition-OEnZFl4, reason: not valid java name */
        public final void m28690setCompositionOEnZFl4(@gib jvg jvgVar) {
            this.f30609e = jvgVar;
        }

        /* JADX INFO: renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m28691setConstraintsBRTryo0(long j) {
            this.f30617m = j;
        }

        public final void setDensityValue(float f) {
            this.f30613i = f;
        }

        public final void setFontFamilyResolver(@gib do6.InterfaceC4891b interfaceC4891b) {
            this.f30616l = interfaceC4891b;
        }

        public final void setFontScale(float f) {
            this.f30614j = f;
        }

        public final void setLayoutDirection(@gib ov8 ov8Var) {
            this.f30615k = ov8Var;
        }

        public final void setLayoutResult(@gib hug hugVar) {
            this.f30618n = hugVar;
        }

        public final void setSingleLine(boolean z) {
            this.f30611g = z;
        }

        public final void setSoftWrap(boolean z) {
            this.f30612h = z;
        }

        public final void setTextStyle(@gib yvg yvgVar) {
            this.f30610f = yvgVar;
        }

        public final void setVisualText(@gib CharSequence charSequence) {
            this.f30608d = charSequence;
        }

        @yfb
        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f30608d) + ", composition=" + this.f30609e + ", textStyle=" + this.f30610f + ", singleLine=" + this.f30611g + ", softWrap=" + this.f30612h + ", densityValue=" + this.f30613i + ", fontScale=" + this.f30614j + ", layoutDirection=" + this.f30615k + ", fontFamilyResolver=" + this.f30616l + ", constraints=" + ((Object) ku2.m30768toStringimpl(this.f30617m)) + ", layoutResult=" + this.f30618n + ')';
        }
    }

    /* JADX INFO: renamed from: dsg$b */
    public static final class C4933b {

        /* JADX INFO: renamed from: g */
        @yfb
        public static final b f30619g = new b(null);

        /* JADX INFO: renamed from: h */
        @yfb
        public static final qtf<C4933b> f30620h = new a();

        /* JADX INFO: renamed from: a */
        @yfb
        public final c64 f30621a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final ov8 f30622b;

        /* JADX INFO: renamed from: c */
        @yfb
        public final do6.InterfaceC4891b f30623c;

        /* JADX INFO: renamed from: d */
        public final long f30624d;

        /* JADX INFO: renamed from: e */
        public final float f30625e;

        /* JADX INFO: renamed from: f */
        public final float f30626f;

        /* JADX INFO: renamed from: dsg$b$a */
        public static final class a implements qtf<C4933b> {
            @Override // p000.qtf
            public boolean equivalent(@gib C4933b c4933b, @gib C4933b c4933b2) {
                if (c4933b == null || c4933b2 == null) {
                    if ((c4933b == null) ^ (c4933b2 == null)) {
                        return false;
                    }
                } else if (c4933b.getDensityValue() != c4933b2.getDensityValue() || c4933b.getFontScale() != c4933b2.getFontScale() || c4933b.getLayoutDirection() != c4933b2.getLayoutDirection() || !md8.areEqual(c4933b.getFontFamilyResolver(), c4933b2.getFontFamilyResolver()) || !ku2.m30756equalsimpl0(c4933b.m28692getConstraintsmsEJaDk(), c4933b2.m28692getConstraintsmsEJaDk())) {
                    return false;
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: dsg$b$b */
        public static final class b {
            public /* synthetic */ b(jt3 jt3Var) {
                this();
            }

            @yfb
            public final qtf<C4933b> getMutationPolicy() {
                return C4933b.f30620h;
            }

            private b() {
            }
        }

        public /* synthetic */ C4933b(c64 c64Var, ov8 ov8Var, do6.InterfaceC4891b interfaceC4891b, long j, jt3 jt3Var) {
            this(c64Var, ov8Var, interfaceC4891b, j);
        }

        /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m28692getConstraintsmsEJaDk() {
            return this.f30624d;
        }

        @yfb
        public final c64 getDensity() {
            return this.f30621a;
        }

        public final float getDensityValue() {
            return this.f30625e;
        }

        @yfb
        public final do6.InterfaceC4891b getFontFamilyResolver() {
            return this.f30623c;
        }

        public final float getFontScale() {
            return this.f30626f;
        }

        @yfb
        public final ov8 getLayoutDirection() {
            return this.f30622b;
        }

        @yfb
        public String toString() {
            return "MeasureInputs(density=" + this.f30621a + ", densityValue=" + this.f30625e + ", fontScale=" + this.f30626f + ", layoutDirection=" + this.f30622b + ", fontFamilyResolver=" + this.f30623c + ", constraints=" + ((Object) ku2.m30768toStringimpl(this.f30624d)) + ')';
        }

        private C4933b(c64 c64Var, ov8 ov8Var, do6.InterfaceC4891b interfaceC4891b, long j) {
            this.f30621a = c64Var;
            this.f30622b = ov8Var;
            this.f30623c = interfaceC4891b;
            this.f30624d = j;
            this.f30625e = c64Var.getDensity();
            this.f30626f = c64Var.getFontScale();
        }
    }

    /* JADX INFO: renamed from: dsg$c */
    public static final class C4934c {

        /* JADX INFO: renamed from: e */
        @yfb
        public static final b f30627e = new b(null);

        /* JADX INFO: renamed from: f */
        @yfb
        public static final qtf<C4934c> f30628f = new a();

        /* JADX INFO: renamed from: a */
        @yfb
        public final jeh f30629a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final yvg f30630b;

        /* JADX INFO: renamed from: c */
        public final boolean f30631c;

        /* JADX INFO: renamed from: d */
        public final boolean f30632d;

        /* JADX INFO: renamed from: dsg$c$a */
        public static final class a implements qtf<C4934c> {
            @Override // p000.qtf
            public boolean equivalent(@gib C4934c c4934c, @gib C4934c c4934c2) {
                if (c4934c == null || c4934c2 == null) {
                    if ((c4934c == null) ^ (c4934c2 == null)) {
                        return false;
                    }
                } else if (c4934c.getTextFieldState() != c4934c2.getTextFieldState() || !md8.areEqual(c4934c.getTextStyle(), c4934c2.getTextStyle()) || c4934c.getSingleLine() != c4934c2.getSingleLine() || c4934c.getSoftWrap() != c4934c2.getSoftWrap()) {
                    return false;
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: dsg$c$b */
        public static final class b {
            public /* synthetic */ b(jt3 jt3Var) {
                this();
            }

            @yfb
            public final qtf<C4934c> getMutationPolicy() {
                return C4934c.f30628f;
            }

            private b() {
            }
        }

        public C4934c(@yfb jeh jehVar, @yfb yvg yvgVar, boolean z, boolean z2) {
            this.f30629a = jehVar;
            this.f30630b = yvgVar;
            this.f30631c = z;
            this.f30632d = z2;
        }

        public final boolean getSingleLine() {
            return this.f30631c;
        }

        public final boolean getSoftWrap() {
            return this.f30632d;
        }

        @yfb
        public final jeh getTextFieldState() {
            return this.f30629a;
        }

        @yfb
        public final yvg getTextStyle() {
            return this.f30630b;
        }

        @yfb
        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.f30629a + ", textStyle=" + this.f30630b + ", singleLine=" + this.f30631c + ", softWrap=" + this.f30632d + ')';
        }
    }

    private final hug computeLayout(jrg jrgVar, C4934c c4934c, C4933b c4933b) {
        uug uugVarObtainTextMeasurer = obtainTextMeasurer(c4933b);
        C9041lz.a aVar = new C9041lz.a(0, 1, null);
        aVar.append(jrgVar.toString());
        if (jrgVar.m30567getCompositionMzsxiRA() != null) {
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, qqg.f75141b.getUnderline(), (e8f) null, (qxc) null, (rp4) null, 61439, (jt3) null), jvg.m30591getMinimpl(jrgVar.m30567getCompositionMzsxiRA().m30597unboximpl()), jvg.m30590getMaximpl(jrgVar.m30567getCompositionMzsxiRA().m30597unboximpl()));
        }
        return uug.m32662measurexDpz5zY$default(uugVarObtainTextMeasurer, aVar.toAnnotatedString(), c4934c.getTextStyle(), 0, c4934c.getSoftWrap(), c4934c.getSingleLine() ? 1 : Integer.MAX_VALUE, null, c4933b.m28692getConstraintsmsEJaDk(), c4933b.getLayoutDirection(), c4933b.getDensity(), c4933b.getFontFamilyResolver(), false, 1060, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C4933b getMeasureInputs() {
        return (C4933b) this.f30605b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C4934c getNonMeasureInputs() {
        return (C4934c) this.f30604a.getValue();
    }

    private final hug getOrComputeLayout(C4934c c4934c, C4933b c4933b) {
        CharSequence visualText;
        jrg visualText2 = c4934c.getTextFieldState().getVisualText();
        C4932a c4932a = (C4932a) gtf.current(this.f30607d);
        hug layoutResult = c4932a.getLayoutResult();
        if (layoutResult != null && (visualText = c4932a.getVisualText()) != null && h9g.contentEquals(visualText, visualText2) && md8.areEqual(c4932a.m28688getCompositionMzsxiRA(), visualText2.m30567getCompositionMzsxiRA()) && c4932a.getSingleLine() == c4934c.getSingleLine() && c4932a.getSoftWrap() == c4934c.getSoftWrap() && c4932a.getLayoutDirection() == c4933b.getLayoutDirection() && c4932a.getDensityValue() == c4933b.getDensity().getDensity() && c4932a.getFontScale() == c4933b.getDensity().getFontScale() && ku2.m30756equalsimpl0(c4932a.m28689getConstraintsmsEJaDk(), c4933b.m28692getConstraintsmsEJaDk()) && md8.areEqual(c4932a.getFontFamilyResolver(), c4933b.getFontFamilyResolver()) && !layoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            yvg textStyle = c4932a.getTextStyle();
            boolean zHasSameLayoutAffectingAttributes = textStyle != null ? textStyle.hasSameLayoutAffectingAttributes(c4934c.getTextStyle()) : false;
            yvg textStyle2 = c4932a.getTextStyle();
            boolean zHasSameDrawAffectingAttributes = textStyle2 != null ? textStyle2.hasSameDrawAffectingAttributes(c4934c.getTextStyle()) : false;
            if (zHasSameLayoutAffectingAttributes && zHasSameDrawAffectingAttributes) {
                return layoutResult;
            }
            if (zHasSameLayoutAffectingAttributes) {
                return hug.m30127copyO0kMr_c$default(layoutResult, new gug(layoutResult.getLayoutInput().getText(), c4934c.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().m29858getOverflowgIe3tQ8(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().m29857getConstraintsmsEJaDk(), (jt3) null), 0L, 2, null);
            }
        }
        hug hugVarComputeLayout = computeLayout(visualText2, c4934c, c4933b);
        if (!md8.areEqual(hugVarComputeLayout, layoutResult)) {
            ssf current = ssf.f82790e.getCurrent();
            if (!current.getReadOnly()) {
                C4932a c4932a2 = this.f30607d;
                synchronized (gtf.getLock()) {
                    C4932a c4932a3 = (C4932a) gtf.writableRecord(c4932a2, this, current);
                    c4932a3.setVisualText(visualText2);
                    c4932a3.m28690setCompositionOEnZFl4(visualText2.m30567getCompositionMzsxiRA());
                    c4932a3.setSingleLine(c4934c.getSingleLine());
                    c4932a3.setSoftWrap(c4934c.getSoftWrap());
                    c4932a3.setTextStyle(c4934c.getTextStyle());
                    c4932a3.setLayoutDirection(c4933b.getLayoutDirection());
                    c4932a3.setDensityValue(c4933b.getDensityValue());
                    c4932a3.setFontScale(c4933b.getFontScale());
                    c4932a3.m28691setConstraintsBRTryo0(c4933b.m28692getConstraintsmsEJaDk());
                    c4932a3.setFontFamilyResolver(c4933b.getFontFamilyResolver());
                    c4932a3.setLayoutResult(hugVarComputeLayout);
                    bth bthVar = bth.f14751a;
                }
                gtf.notifyWrite(current, this);
            }
        }
        return hugVarComputeLayout;
    }

    private final uug obtainTextMeasurer(C4933b c4933b) {
        uug uugVar = this.f30606c;
        if (uugVar != null) {
            return uugVar;
        }
        uug uugVar2 = new uug(c4933b.getFontFamilyResolver(), c4933b.getDensity(), c4933b.getLayoutDirection(), 1);
        this.f30606c = uugVar2;
        return uugVar2;
    }

    private final void setMeasureInputs(C4933b c4933b) {
        this.f30605b.setValue(c4933b);
    }

    private final void setNonMeasureInputs(C4934c c4934c) {
        this.f30604a.setValue(c4934c);
    }

    private final void updateCacheIfWritable(qy6<? super C4932a, bth> qy6Var) {
        ssf current = ssf.f82790e.getCurrent();
        if (current.getReadOnly()) {
            return;
        }
        C4932a c4932a = this.f30607d;
        synchronized (gtf.getLock()) {
            try {
                qy6Var.invoke(gtf.writableRecord(c4932a, this, current));
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        gtf.notifyWrite(current, this);
    }

    @Override // p000.x2g
    @yfb
    public z2g getFirstStateRecord() {
        return this.f30607d;
    }

    @yfb
    /* JADX INFO: renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final hug m28687layoutWithNewMeasureInputshBUhpc(@yfb c64 c64Var, @yfb ov8 ov8Var, @yfb do6.InterfaceC4891b interfaceC4891b, long j) {
        C4933b c4933b = new C4933b(c64Var, ov8Var, interfaceC4891b, j, null);
        setMeasureInputs(c4933b);
        C4934c nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) {
            return getOrComputeLayout(nonMeasureInputs, c4933b);
        }
        throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
    }

    @Override // p000.x2g
    @yfb
    public z2g mergeRecords(@yfb z2g z2gVar, @yfb z2g z2gVar2, @yfb z2g z2gVar3) {
        return z2gVar3;
    }

    @Override // p000.x2g
    public void prependStateRecord(@yfb z2g z2gVar) {
        md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.f30607d = (C4932a) z2gVar;
    }

    public final void updateNonMeasureInputs(@yfb jeh jehVar, @yfb yvg yvgVar, boolean z, boolean z2) {
        setNonMeasureInputs(new C4934c(jehVar, yvgVar, z, z2));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.i2g
    @gib
    public hug getValue() {
        C4933b measureInputs;
        C4934c nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }
}
