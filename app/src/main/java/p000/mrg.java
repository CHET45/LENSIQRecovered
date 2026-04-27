package p000;

import androidx.compose.foundation.C0617l;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.concurrent.CancellationException;
import org.opencv.videoio.Videoio;
import p000.jj8;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,627:1\n1#2:628\n708#3:629\n696#3:630\n256#4:631\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode\n*L\n491#1:629\n491#1:630\n508#1:631\n*E\n"})
@e0g(parameters = 0)
public final class mrg extends d44 implements ew8, fp4, mn2, o77, rxe {

    /* JADX INFO: renamed from: m2 */
    public static final int f61857m2 = 8;

    /* JADX INFO: renamed from: M1 */
    public boolean f61858M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f61859V1;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public lug f61860Z1;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public jeh f61861a2;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public rsg f61862b2;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public he1 f61863c2;

    /* JADX INFO: renamed from: d2 */
    public boolean f61864d2;

    /* JADX INFO: renamed from: e2 */
    @yfb
    public C0617l f61865e2;

    /* JADX INFO: renamed from: f2 */
    @yfb
    public t7c f61866f2;

    /* JADX INFO: renamed from: h2 */
    @gib
    public jj8 f61868h2;

    /* JADX INFO: renamed from: i2 */
    @gib
    public jvg f61869i2;

    /* JADX INFO: renamed from: k2 */
    public int f61871k2;

    /* JADX INFO: renamed from: l2 */
    @yfb
    public final gsg f61872l2;

    /* JADX INFO: renamed from: g2 */
    @yfb
    public final wa3 f61867g2 = new wa3();

    /* JADX INFO: renamed from: j2 */
    @yfb
    public rud f61870j2 = new rud(-1.0f, -1.0f, -1.0f, -1.0f);

    /* JADX INFO: renamed from: mrg$a */
    public static final class C9489a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0761n f61874b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f61875c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0767t f61876d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9489a(InterfaceC0761n interfaceC0761n, int i, AbstractC0767t abstractC0767t) {
            super(1);
            this.f61874b = interfaceC0761n;
            this.f61875c = i;
            this.f61876d = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            mrg.this.m31044updateScrollStatetIlFzwE(this.f61874b, this.f61875c, this.f61876d.getWidth(), mrg.this.f61861a2.getVisualText().m30568getSelectiond9O1mEE(), this.f61874b.getLayoutDirection());
            AbstractC0767t.a.placeRelative$default(aVar, this.f61876d, -mrg.this.f61865e2.getValue(), 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: mrg$b */
    public static final class C9490b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0761n f61878b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f61879c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0767t f61880d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9490b(InterfaceC0761n interfaceC0761n, int i, AbstractC0767t abstractC0767t) {
            super(1);
            this.f61878b = interfaceC0761n;
            this.f61879c = i;
            this.f61880d = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            mrg.this.m31044updateScrollStatetIlFzwE(this.f61878b, this.f61879c, this.f61880d.getHeight(), mrg.this.f61861a2.getVisualText().m30568getSelectiond9O1mEE(), this.f61878b.getLayoutDirection());
            AbstractC0767t.a.placeRelative$default(aVar, this.f61880d, 0, -mrg.this.f61865e2.getValue(), 0.0f, 4, null);
        }
    }

    /* JADX INFO: renamed from: mrg$c */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1", m4010f = "TextFieldCoreModifier.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_KNEEPOINT1}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9491c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f61881a;

        /* JADX INFO: renamed from: mrg$c$a */
        @dwf({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text/input/internal/TextFieldCoreModifierNode$startCursorJob$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n1#2:628\n*E\n"})
        public static final class a extends tt8 implements ny6<Integer> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ mrg f61883a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jvd.C8119f f61884b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mrg mrgVar, jvd.C8119f c8119f) {
                super(0);
                this.f61883a = mrgVar;
                this.f61884b = c8119f;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Integer invoke() {
                this.f61883a.f61861a2.getVisualText();
                Integer numValueOf = Integer.valueOf(((this.f61883a.isAttached() && ((sli) nn2.currentValueOf(this.f61883a, sn2.getLocalWindowInfo())).isWindowFocused()) ? 1 : 2) * this.f61884b.f52108a);
                this.f61884b.f52108a *= -1;
                return numValueOf;
            }
        }

        /* JADX INFO: renamed from: mrg$c$b */
        @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$startCursorJob$1$2", m4010f = "TextFieldCoreModifier.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_IMAGE_BLACK_LEVEL}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<Integer, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f61885a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ int f61886b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ mrg f61887c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(mrg mrgVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f61887c = mrgVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                b bVar = new b(this.f61887c, zy2Var);
                bVar.f61886b = ((Number) obj).intValue();
                return bVar;
            }

            @gib
            public final Object invoke(int i, @gib zy2<? super bth> zy2Var) {
                return ((b) create(Integer.valueOf(i), zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f61885a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (Math.abs(this.f61886b) == 1) {
                        wa3 wa3Var = this.f61887c.f61867g2;
                        this.f61885a = 1;
                        if (wa3Var.snapToVisibleAndAnimate(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ Object invoke(Integer num, zy2<? super bth> zy2Var) {
                return invoke(num.intValue(), zy2Var);
            }
        }

        public C9491c(zy2<? super C9491c> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return mrg.this.new C9491c(zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C9491c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f61881a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                jvd.C8119f c8119f = new jvd.C8119f();
                c8119f.f52108a = 1;
                y56 y56VarSnapshotFlow = stf.snapshotFlow(new a(mrg.this, c8119f));
                b bVar = new b(mrg.this, null);
                this.f61881a = 1;
                if (c76.collectLatest(y56VarSnapshotFlow, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: mrg$d */
    @ck3(m4009c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", m4010f = "TextFieldCoreModifier.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_WB_KR, Videoio.CAP_PROP_XI_WIDTH}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C9492d extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f61888a;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f61890c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ rud f61891d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9492d(float f, rud rudVar, zy2<? super C9492d> zy2Var) {
            super(2, zy2Var);
            this.f61890c = f;
            this.f61891d = rudVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return mrg.this.new C9492d(this.f61890c, this.f61891d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C9492d) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f61888a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                C0617l c0617l = mrg.this.f61865e2;
                float fRoundToNext = lrg.roundToNext(this.f61890c);
                this.f61888a = 1;
                if (rre.scrollBy(c0617l, fRoundToNext, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                    return bth.f14751a;
                }
                y7e.throwOnFailure(obj);
            }
            md1 bringIntoViewRequester = mrg.this.f61860Z1.getBringIntoViewRequester();
            rud rudVar = this.f61891d;
            this.f61888a = 2;
            if (bringIntoViewRequester.bringIntoView(rudVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return bth.f14751a;
        }
    }

    public mrg(boolean z, boolean z2, @yfb lug lugVar, @yfb jeh jehVar, @yfb rsg rsgVar, @yfb he1 he1Var, boolean z3, @yfb C0617l c0617l, @yfb t7c t7cVar) {
        this.f61858M1 = z;
        this.f61859V1 = z2;
        this.f61860Z1 = lugVar;
        this.f61861a2 = jehVar;
        this.f61862b2 = rsgVar;
        this.f61863c2 = he1Var;
        this.f61864d2 = z3;
        this.f61865e2 = c0617l;
        this.f61866f2 = t7cVar;
        this.f61872l2 = (gsg) m8877a(C8100jv.textFieldMagnifierNode(this.f61861a2, this.f61862b2, this.f61860Z1, this.f61858M1 || this.f61859V1));
    }

    /* JADX INFO: renamed from: calculateOffsetToFollow-72CqOWE, reason: not valid java name */
    private final int m31040calculateOffsetToFollow72CqOWE(long j, int i) {
        jvg jvgVar = this.f61869i2;
        if (jvgVar == null || jvg.m30588getEndimpl(j) != jvg.m30588getEndimpl(jvgVar.m30597unboximpl())) {
            return jvg.m30588getEndimpl(j);
        }
        jvg jvgVar2 = this.f61869i2;
        if (jvgVar2 == null || jvg.m30593getStartimpl(j) != jvg.m30593getStartimpl(jvgVar2.m30597unboximpl())) {
            return jvg.m30593getStartimpl(j);
        }
        if (i != this.f61871k2) {
            return jvg.m30593getStartimpl(j);
        }
        return -1;
    }

    private final void drawCursor(ip4 ip4Var) {
        float cursorAlpha = this.f61867g2.getCursorAlpha();
        if (cursorAlpha != 0.0f && getShowCursor()) {
            rud cursorRect = this.f61862b2.getCursorRect();
            ip4.m30239drawLine1RTmtNc$default(ip4Var, this.f61863c2, cursorRect.m32207getTopCenterF1C5BW0(), cursorRect.m32200getBottomCenterF1C5BW0(), cursorRect.getWidth(), 0, null, cursorAlpha, null, 0, Videoio.CAP_PROP_XI_DECIMATION_VERTICAL, null);
        }
    }

    private final void drawHighlight(ip4 ip4Var, scc<itg, jvg> sccVar, hug hugVar) {
        int iM30399unboximpl = sccVar.component1().m30399unboximpl();
        long jM30597unboximpl = sccVar.component2().m30597unboximpl();
        if (jvg.m30587getCollapsedimpl(jM30597unboximpl)) {
            return;
        }
        vic pathForRange = hugVar.getPathForRange(jvg.m30591getMinimpl(jM30597unboximpl), jvg.m30590getMaximpl(jM30597unboximpl));
        if (!itg.m30396equalsimpl0(iM30399unboximpl, itg.f48257b.m30400getHandwritingDeletePreviewsxJuwY())) {
            ip4.m30244drawPathLG529CI$default(ip4Var, pathForRange, ((svg) nn2.currentValueOf(this, tvg.getLocalTextSelectionColors())).m32337getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            return;
        }
        he1 brush = hugVar.getLayoutInput().getStyle().getBrush();
        if (brush != null) {
            ip4.m30243drawPathGBMwjPU$default(ip4Var, pathForRange, brush, 0.2f, null, null, 0, 56, null);
            return;
        }
        long jM33437getColor0d7_KjU = hugVar.getLayoutInput().getStyle().m33437getColor0d7_KjU();
        if (jM33437getColor0d7_KjU == 16) {
            jM33437getColor0d7_KjU = w82.f93556b.m32977getBlack0d7_KjU();
        }
        long j = jM33437getColor0d7_KjU;
        ip4.m30244drawPathLG529CI$default(ip4Var, pathForRange, w82.m32950copywmQWz5c$default(j, w82.m32953getAlphaimpl(j) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
    }

    /* JADX INFO: renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m31041drawSelectionSbBc2M(ip4 ip4Var, long j, hug hugVar) {
        int iM30591getMinimpl = jvg.m30591getMinimpl(j);
        int iM30590getMaximpl = jvg.m30590getMaximpl(j);
        if (iM30591getMinimpl != iM30590getMaximpl) {
            ip4.m30244drawPathLG529CI$default(ip4Var, hugVar.getPathForRange(iM30591getMinimpl, iM30590getMaximpl), ((svg) nn2.currentValueOf(this, tvg.getLocalTextSelectionColors())).m32337getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawText(ip4 ip4Var, hug hugVar) {
        dvg.f31086a.paint(ip4Var.getDrawContext().getCanvas(), hugVar);
    }

    private final boolean getShowCursor() {
        return this.f61864d2 && (this.f61858M1 || this.f61859V1) && lrg.isSpecified(this.f61863c2);
    }

    /* JADX INFO: renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final vba m31042measureHorizontalScroll3p2s80s(InterfaceC0761n interfaceC0761n, rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int iMin = Math.min(abstractC0767tMo27949measureBRTryo0.getWidth(), ku2.m30763getMaxWidthimpl(j));
        return InterfaceC0761n.layout$default(interfaceC0761n, iMin, abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C9489a(interfaceC0761n, iMin, abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    /* JADX INFO: renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final vba m31043measureVerticalScroll3p2s80s(InterfaceC0761n interfaceC0761n, rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(abstractC0767tMo27949measureBRTryo0.getHeight(), ku2.m30762getMaxHeightimpl(j));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), iMin, null, new C9490b(interfaceC0761n, iMin, abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    private final void startCursorJob() {
        this.f61868h2 = fg1.launch$default(getCoroutineScope(), null, null, new C9491c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX INFO: renamed from: updateScrollState-tIlFzwE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31044updateScrollStatetIlFzwE(p000.c64 r9, int r10, int r11, long r12, p000.ov8 r14) {
        /*
            r8 = this;
            int r0 = r11 - r10
            androidx.compose.foundation.l r1 = r8.f61865e2
            r1.setMaxValue$foundation_release(r0)
            int r0 = r8.m31040calculateOffsetToFollow72CqOWE(r12, r11)
            if (r0 < 0) goto Lc5
            boolean r1 = r8.getShowCursor()
            if (r1 != 0) goto L15
            goto Lc5
        L15:
            lug r1 = r8.f61860Z1
            hug r1 = r1.getLayoutResult()
            if (r1 != 0) goto L1e
            return
        L1e:
            f78 r2 = new f78
            gug r3 = r1.getLayoutInput()
            lz r3 = r3.getText()
            int r3 = r3.length()
            r4 = 0
            r2.<init>(r4, r3)
            int r0 = p000.kpd.coerceIn(r0, r2)
            rud r0 = r1.getCursorRect(r0)
            ov8 r1 = p000.ov8.Rtl
            r2 = 1
            if (r14 != r1) goto L3f
            r14 = r2
            goto L40
        L3f:
            r14 = r4
        L40:
            rud r9 = p000.lrg.access$getCursorRectInScroller(r9, r0, r14, r11)
            float r14 = r9.getLeft()
            rud r1 = r8.f61870j2
            float r1 = r1.getLeft()
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L64
            float r14 = r9.getTop()
            rud r1 = r8.f61870j2
            float r1 = r1.getTop()
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L64
            int r14 = r8.f61871k2
            if (r11 == r14) goto Lc5
        L64:
            t7c r14 = r8.f61866f2
            t7c r1 = p000.t7c.Vertical
            if (r14 != r1) goto L6b
            r4 = r2
        L6b:
            if (r4 == 0) goto L72
            float r14 = r9.getTop()
            goto L76
        L72:
            float r14 = r9.getLeft()
        L76:
            if (r4 == 0) goto L7d
            float r1 = r9.getBottom()
            goto L81
        L7d:
            float r1 = r9.getRight()
        L81:
            androidx.compose.foundation.l r2 = r8.f61865e2
            int r2 = r2.getValue()
            int r3 = r2 + r10
            float r3 = (float) r3
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L90
        L8e:
            float r1 = r1 - r3
            goto La9
        L90:
            float r2 = (float) r2
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 >= 0) goto L9d
            float r5 = r1 - r14
            float r6 = (float) r10
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L9d
            goto L8e
        L9d:
            if (r4 >= 0) goto La8
            float r1 = r1 - r14
            float r10 = (float) r10
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 > 0) goto La8
            float r1 = r14 - r2
            goto La9
        La8:
            r1 = 0
        La9:
            jvg r10 = p000.jvg.m30581boximpl(r12)
            r8.f61869i2 = r10
            r8.f61870j2 = r9
            r8.f61871k2 = r11
            x13 r2 = r8.getCoroutineScope()
            b23 r4 = p000.b23.f12444d
            mrg$d r5 = new mrg$d
            r9 = 0
            r5.<init>(r1, r0, r9)
            r6 = 1
            r7 = 0
            r3 = 0
            p000.dg1.launch$default(r2, r3, r4, r5, r6, r7)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mrg.m31044updateScrollStatetIlFzwE(c64, int, int, long, ov8):void");
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        this.f61872l2.applySemantics(eyeVar);
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        ov2Var.drawContent();
        jrg visualText = this.f61861a2.getVisualText();
        hug layoutResult = this.f61860Z1.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        scc<itg, jvg> highlight = visualText.getHighlight();
        if (highlight != null) {
            drawHighlight(ov2Var, highlight, layoutResult);
        }
        if (jvg.m30587getCollapsedimpl(visualText.m30568getSelectiond9O1mEE())) {
            drawText(ov2Var, layoutResult);
            if (visualText.shouldShowSelection()) {
                drawCursor(ov2Var);
            }
        } else {
            if (visualText.shouldShowSelection()) {
                m31041drawSelectionSbBc2M(ov2Var, visualText.m30568getSelectiond9O1mEE(), layoutResult);
            }
            drawText(ov2Var, layoutResult);
        }
        this.f61872l2.draw(ov2Var);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        return this.f61866f2 == t7c.Vertical ? m31043measureVerticalScroll3p2s80s(interfaceC0761n, rbaVar, j) : m31042measureHorizontalScroll3p2s80s(interfaceC0761n, rbaVar, j);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        if (this.f61858M1 && getShowCursor()) {
            startCursorJob();
        }
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        this.f61860Z1.setCoreNodeCoordinates(mv8Var);
        this.f61872l2.onGloballyPositioned(mv8Var);
    }

    public final void updateNode(boolean z, boolean z2, @yfb lug lugVar, @yfb jeh jehVar, @yfb rsg rsgVar, @yfb he1 he1Var, boolean z3, @yfb C0617l c0617l, @yfb t7c t7cVar) {
        boolean showCursor = getShowCursor();
        boolean z4 = this.f61858M1;
        jeh jehVar2 = this.f61861a2;
        lug lugVar2 = this.f61860Z1;
        rsg rsgVar2 = this.f61862b2;
        C0617l c0617l2 = this.f61865e2;
        this.f61858M1 = z;
        this.f61859V1 = z2;
        this.f61860Z1 = lugVar;
        this.f61861a2 = jehVar;
        this.f61862b2 = rsgVar;
        this.f61863c2 = he1Var;
        this.f61864d2 = z3;
        this.f61865e2 = c0617l;
        this.f61866f2 = t7cVar;
        this.f61872l2.update(jehVar, rsgVar, lugVar, z || z2);
        if (!getShowCursor()) {
            jj8 jj8Var = this.f61868h2;
            if (jj8Var != null) {
                jj8.C7916a.cancel$default(jj8Var, (CancellationException) null, 1, (Object) null);
            }
            this.f61868h2 = null;
            this.f61867g2.cancelAndHide();
        } else if (!z4 || !md8.areEqual(jehVar2, jehVar) || !showCursor) {
            startCursorJob();
        }
        if (md8.areEqual(jehVar2, jehVar) && md8.areEqual(lugVar2, lugVar) && md8.areEqual(rsgVar2, rsgVar) && md8.areEqual(c0617l2, c0617l)) {
            return;
        }
        hw8.invalidateMeasurement(this);
    }
}
