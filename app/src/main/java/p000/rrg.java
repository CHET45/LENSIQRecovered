package p000;

import java.util.List;
import p000.C9041lz;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class rrg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C12228a f79167a = new C12228a(null);

    /* JADX INFO: renamed from: b */
    public static final int f79168b = 0;

    /* JADX INFO: renamed from: rrg$a */
    @dwf({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,436:1\n1#2:437\n702#3:438\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n*L\n148#1:438\n*E\n"})
    public static final class C12228a {

        /* JADX INFO: renamed from: rrg$a$a */
        public static final class a extends tt8 implements qy6<List<? extends lw4>, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ow4 f79169a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qy6<zsg, bth> f79170b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jvd.C8121h<ytg> f79171c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ow4 ow4Var, qy6<? super zsg, bth> qy6Var, jvd.C8121h<ytg> c8121h) {
                super(1);
                this.f79169a = ow4Var;
                this.f79170b = qy6Var;
                this.f79171c = c8121h;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(List<? extends lw4> list) {
                invoke2(list);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb List<? extends lw4> list) {
                rrg.f79167a.onEditCommand$foundation_release(list, this.f79169a, this.f79170b, this.f79171c.f52110a);
            }
        }

        /* JADX INFO: renamed from: rrg$a$b */
        public static final class b extends tt8 implements qy6<x3a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ mv8 f79172a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(mv8 mv8Var) {
                super(1);
                this.f79172a = mv8Var;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(x3a x3aVar) {
                m32175invoke58bKbWc(x3aVar.m33204unboximpl());
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
            public final void m32175invoke58bKbWc(@yfb float[] fArr) {
                if (this.f79172a.isAttached()) {
                    nv8.findRootCoordinates(this.f79172a).mo30044transformFromEL8BTi8(this.f79172a, fArr);
                }
            }
        }

        public /* synthetic */ C12228a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m32169drawHighlightLepunE(vq1 vq1Var, long j, nzb nzbVar, hug hugVar, icc iccVar) {
            int iOriginalToTransformed = nzbVar.originalToTransformed(jvg.m30591getMinimpl(j));
            int iOriginalToTransformed2 = nzbVar.originalToTransformed(jvg.m30590getMaximpl(j));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                vq1Var.drawPath(hugVar.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), iccVar);
            }
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ djh m32170layout_EkL_Y$foundation_release$default(C12228a c12228a, sqg sqgVar, long j, ov8 ov8Var, hug hugVar, int i, Object obj) {
            if ((i & 8) != 0) {
                hugVar = null;
            }
            return c12228a.m32173layout_EkL_Y$foundation_release(sqgVar, j, ov8Var, hugVar);
        }

        @yfb
        /* JADX INFO: renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final ieh m32171applyCompositionDecoration72CqOWE(long j, @yfb ieh iehVar) {
            int iOriginalToTransformed = iehVar.getOffsetMapping().originalToTransformed(jvg.m30593getStartimpl(j));
            int iOriginalToTransformed2 = iehVar.getOffsetMapping().originalToTransformed(jvg.m30588getEndimpl(j));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            C9041lz.a aVar = new C9041lz.a(iehVar.getText());
            aVar.addStyle(new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, qqg.f75141b.getUnderline(), (e8f) null, (qxc) null, (rp4) null, 61439, (jt3) null), iMin, iMax);
            return new ieh(aVar.toAnnotatedString(), iehVar.getOffsetMapping());
        }

        @do8
        /* JADX INFO: renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
        public final void m32172drawQ1vqE60$foundation_release(@yfb vq1 vq1Var, @yfb zsg zsgVar, long j, long j2, @yfb nzb nzbVar, @yfb hug hugVar, @yfb icc iccVar, long j3) {
            if (!jvg.m30587getCollapsedimpl(j)) {
                iccVar.mo30199setColor8_81llA(j3);
                m32169drawHighlightLepunE(vq1Var, j, nzbVar, hugVar, iccVar);
            } else if (!jvg.m30587getCollapsedimpl(j2)) {
                w82 w82VarM32941boximpl = w82.m32941boximpl(hugVar.getLayoutInput().getStyle().m33437getColor0d7_KjU());
                if (w82VarM32941boximpl.m32961unboximpl() == 16) {
                    w82VarM32941boximpl = null;
                }
                long jM32961unboximpl = w82VarM32941boximpl != null ? w82VarM32941boximpl.m32961unboximpl() : w82.f93556b.m32977getBlack0d7_KjU();
                iccVar.mo30199setColor8_81llA(w82.m32950copywmQWz5c$default(jM32961unboximpl, w82.m32953getAlphaimpl(jM32961unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m32169drawHighlightLepunE(vq1Var, j2, nzbVar, hugVar, iccVar);
            } else if (!jvg.m30587getCollapsedimpl(zsgVar.m33527getSelectiond9O1mEE())) {
                iccVar.mo30199setColor8_81llA(j3);
                m32169drawHighlightLepunE(vq1Var, zsgVar.m33527getSelectiond9O1mEE(), nzbVar, hugVar, iccVar);
            }
            dvg.f31086a.paint(vq1Var, hugVar);
        }

        @do8
        @yfb
        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final djh<Integer, Integer, hug> m32173layout_EkL_Y$foundation_release(@yfb sqg sqgVar, long j, @yfb ov8 ov8Var, @gib hug hugVar) {
            hug hugVarM32318layoutNN6EwU = sqgVar.m32318layoutNN6EwU(j, ov8Var, hugVar);
            return new djh<>(Integer.valueOf(r78.m32087getWidthimpl(hugVarM32318layoutNN6EwU.m30130getSizeYbymL2g())), Integer.valueOf(r78.m32086getHeightimpl(hugVarM32318layoutNN6EwU.m30130getSizeYbymL2g())), hugVarM32318layoutNN6EwU);
        }

        @do8
        public final void notifyFocusedRect$foundation_release(@yfb zsg zsgVar, @yfb sqg sqgVar, @yfb hug hugVar, @yfb mv8 mv8Var, @yfb ytg ytgVar, boolean z, @yfb nzb nzbVar) {
            if (z) {
                int iOriginalToTransformed = nzbVar.originalToTransformed(jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()));
                rud boundingBox = iOriginalToTransformed < hugVar.getLayoutInput().getText().length() ? hugVar.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? hugVar.getBoundingBox(iOriginalToTransformed - 1) : new rud(0.0f, 0.0f, 1.0f, r78.m32086getHeightimpl(srg.computeSizeForDefaultText$default(sqgVar.getStyle(), sqgVar.getDensity(), sqgVar.getFontFamilyResolver(), null, 0, 24, null)));
                long jMo30036localToRootMKHz9U = mv8Var.mo30036localToRootMKHz9U(mzb.Offset(boundingBox.getLeft(), boundingBox.getTop()));
                ytgVar.notifyFocusedRect(xud.m33303Recttz77jQw(mzb.Offset(izb.m30429getXimpl(jMo30036localToRootMKHz9U), izb.m30430getYimpl(jMo30036localToRootMKHz9U)), eqf.Size(boundingBox.getWidth(), boundingBox.getHeight())));
            }
        }

        @do8
        public final void onBlur$foundation_release(@yfb ytg ytgVar, @yfb ow4 ow4Var, @yfb qy6<? super zsg, bth> qy6Var) {
            qy6Var.invoke(zsg.m33523copy3r_uNRQ$default(ow4Var.toTextFieldValue(), (C9041lz) null, 0L, (jvg) null, 3, (Object) null));
            ytgVar.dispose();
        }

        @do8
        public final void onEditCommand$foundation_release(@yfb List<? extends lw4> list, @yfb ow4 ow4Var, @yfb qy6<? super zsg, bth> qy6Var, @gib ytg ytgVar) {
            zsg zsgVarApply = ow4Var.apply(list);
            if (ytgVar != null) {
                ytgVar.updateState(null, zsgVarApply);
            }
            qy6Var.invoke(zsgVarApply);
        }

        @do8
        @yfb
        public final ytg onFocus$foundation_release(@yfb stg stgVar, @yfb zsg zsgVar, @yfb ow4 ow4Var, @yfb nw7 nw7Var, @yfb qy6<? super zsg, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2) {
            return restartInput$foundation_release(stgVar, zsgVar, ow4Var, nw7Var, qy6Var, qy6Var2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, ytg] */
        @do8
        @yfb
        public final ytg restartInput$foundation_release(@yfb stg stgVar, @yfb zsg zsgVar, @yfb ow4 ow4Var, @yfb nw7 nw7Var, @yfb qy6<? super zsg, bth> qy6Var, @yfb qy6<? super mw7, bth> qy6Var2) {
            jvd.C8121h c8121h = new jvd.C8121h();
            ?? StartInput = stgVar.startInput(zsgVar, nw7Var, new a(ow4Var, qy6Var, c8121h), qy6Var2);
            c8121h.f52110a = StartInput;
            return StartInput;
        }

        @do8
        /* JADX INFO: renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m32174setCursorOffsetULxng0E$foundation_release(long j, @yfb iug iugVar, @yfb ow4 ow4Var, @yfb nzb nzbVar, @yfb qy6<? super zsg, bth> qy6Var) {
            qy6Var.invoke(zsg.m33523copy3r_uNRQ$default(ow4Var.toTextFieldValue(), (C9041lz) null, kvg.TextRange(nzbVar.transformedToOriginal(iug.m30405getOffsetForPosition3MmeM6k$default(iugVar, j, false, 2, null))), (jvg) null, 5, (Object) null));
        }

        @do8
        public final void updateTextLayoutResult$foundation_release(@yfb ytg ytgVar, @yfb zsg zsgVar, @yfb nzb nzbVar, @yfb iug iugVar) {
            mv8 decorationBoxCoordinates;
            mv8 innerTextFieldCoordinates = iugVar.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = iugVar.getDecorationBoxCoordinates()) == null) {
                return;
            }
            ytgVar.updateTextLayoutResult(zsgVar, nzbVar, iugVar.getValue(), new b(innerTextFieldCoordinates), axe.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        private C12228a() {
        }
    }
}
