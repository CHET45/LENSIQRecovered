package p000;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.blankj.utilcode.util.C2473f;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@c5e(34)
@dwf({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1133:1\n314#2,6:1134\n323#2:1155\n314#2,6:1156\n323#2:1177\n314#2,6:1178\n323#2:1199\n261#3,15:1140\n261#3,15:1162\n261#3,15:1184\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n366#1:1134,6\n366#1:1155\n385#1:1156,6\n385#1:1177\n98#1:1178,6\n98#1:1199\n366#1:1140,15\n385#1:1162,15\n98#1:1184,15\n*E\n"})
@e0g(parameters = 1)
public final class fg7 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final fg7 f36512a = new fg7();

    /* JADX INFO: renamed from: b */
    public static final int f36513b = 0;

    /* JADX INFO: renamed from: fg7$a */
    public static final class C5798a extends tt8 implements qy6<wv9, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f36514a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8119f f36515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5798a(jvd.C8119f c8119f, jvd.C8119f c8119f2) {
            super(1);
            this.f36514a = c8119f;
            this.f36515b = c8119f2;
        }

        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(@yfb wv9 wv9Var) {
            jvd.C8119f c8119f = this.f36514a;
            if (c8119f.f52108a == -1) {
                c8119f.f52108a = wv9Var.getRange().getFirst();
            }
            this.f36515b.f52108a = wv9Var.getRange().getLast() + 1;
            return "";
        }
    }

    /* JADX INFO: renamed from: fg7$b */
    public static final class C5799b extends tt8 implements qy6<wv9, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jvd.C8119f f36516a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8119f f36517b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5799b(jvd.C8119f c8119f, jvd.C8119f c8119f2) {
            super(1);
            this.f36516a = c8119f;
            this.f36517b = c8119f2;
        }

        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(@yfb wv9 wv9Var) {
            jvd.C8119f c8119f = this.f36516a;
            if (c8119f.f52108a == -1) {
                c8119f.f52108a = wv9Var.getRange().getFirst();
            }
            this.f36517b.f52108a = wv9Var.getRange().getLast() + 1;
            return "";
        }
    }

    private fg7() {
    }

    @ih4
    private final int fallback(jeh jehVar, HandwritingGesture handwritingGesture) {
        wsg wsgVar = jehVar.f50410a;
        g48 g48Var = jehVar.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        wsgVar.getMainBuffer$foundation_release().clearHighlight();
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        jeh.replaceSelectedText$default(jehVar, fallbackText, true, null, 4, null);
        return 5;
    }

    @ih4
    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, qy6<? super lw4, bth> qy6Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        qy6Var.invoke(new ac2(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m28915highlightRangeXJREzCE(jeh jehVar, long j, int i) {
        if (!jvg.m30587getCollapsedimpl(j)) {
            jehVar.m30513highlightCharsIn7RAjNK8(i, j);
            return;
        }
        wsg wsgVar = jehVar.f50410a;
        g48 g48Var = jehVar.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        wsgVar.getMainBuffer$foundation_release().clearHighlight();
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    @ih4
    private final int performDeleteGesture(jeh jehVar, DeleteGesture deleteGesture, lug lugVar) {
        int iM28919toTextGranularityNUwxegE = m28919toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM29736getRangeForScreenRectOH9lIzo = gg7.m29736getRangeForScreenRectOH9lIzo(lugVar, vud.toComposeRect(deleteGesture.getDeletionArea()), iM28919toTextGranularityNUwxegE, mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29736getRangeForScreenRectOH9lIzo)) {
            return f36512a.fallback(jehVar, ag7.m499a(deleteGesture));
        }
        m28916performDeletionSbBc2M(jehVar, jM29736getRangeForScreenRectOH9lIzo, htg.m30121equalsimpl0(iM28919toTextGranularityNUwxegE, htg.f44857b.m30126getWordDRrd7Zo()));
        return 1;
    }

    @ih4
    private final int performDeleteRangeGesture(jeh jehVar, DeleteRangeGesture deleteRangeGesture, lug lugVar) {
        int iM28919toTextGranularityNUwxegE = m28919toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM29738getRangeForScreenRectsO048IG0 = gg7.m29738getRangeForScreenRectsO048IG0(lugVar, vud.toComposeRect(deleteRangeGesture.getDeletionStartArea()), vud.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM28919toTextGranularityNUwxegE, mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29738getRangeForScreenRectsO048IG0)) {
            return f36512a.fallback(jehVar, ag7.m499a(deleteRangeGesture));
        }
        m28916performDeletionSbBc2M(jehVar, jM29738getRangeForScreenRectsO048IG0, htg.m30121equalsimpl0(iM28919toTextGranularityNUwxegE, htg.f44857b.m30126getWordDRrd7Zo()));
        return 1;
    }

    @ih4
    /* JADX INFO: renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m28916performDeletionSbBc2M(jeh jehVar, long j, boolean z) {
        if (z) {
            j = gg7.m29728adjustHandwritingDeleteGestureRange72CqOWE(j, jehVar.getVisualText());
        }
        jeh.m30512replaceTextM8tDOmk$default(jehVar, "", j, null, false, 12, null);
    }

    @ih4
    /* JADX INFO: renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m28917performDeletionOnLegacyTextFieldvJH6DeI(long j, C9041lz c9041lz, boolean z, qy6<? super lw4, bth> qy6Var) {
        if (z) {
            j = gg7.m29728adjustHandwritingDeleteGestureRange72CqOWE(j, c9041lz);
        }
        qy6Var.invoke(gg7.compoundEditCommand(new s6f(jvg.m30588getEndimpl(j), jvg.m30588getEndimpl(j)), new f54(jvg.m30589getLengthimpl(j), 0)));
    }

    @ih4
    private final int performInsertGesture(jeh jehVar, InsertGesture insertGesture, lug lugVar, u8i u8iVar) {
        int iM29731getOffsetForHandwritingGestured4ec7I = gg7.m29731getOffsetForHandwritingGestured4ec7I(lugVar, gg7.toOffset(insertGesture.getInsertionPoint()), u8iVar);
        if (iM29731getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(jehVar, ag7.m499a(insertGesture));
        }
        jeh.m30512replaceTextM8tDOmk$default(jehVar, insertGesture.getTextToInsert(), kvg.TextRange(iM29731getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    @ih4
    private final void performInsertionOnLegacyTextField(int i, String str, qy6<? super lw4, bth> qy6Var) {
        qy6Var.invoke(gg7.compoundEditCommand(new s6f(i, i), new ac2(str, 1)));
    }

    @ih4
    private final int performJoinOrSplitGesture(jeh jehVar, JoinOrSplitGesture joinOrSplitGesture, lug lugVar, u8i u8iVar) {
        hug layoutResult;
        if (jehVar.getOutputText() != jehVar.getUntransformedText()) {
            return 3;
        }
        int iM29731getOffsetForHandwritingGestured4ec7I = gg7.m29731getOffsetForHandwritingGestured4ec7I(lugVar, gg7.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), u8iVar);
        if (iM29731getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = lugVar.getLayoutResult()) != null && gg7.isBiDiBoundary(layoutResult, iM29731getOffsetForHandwritingGestured4ec7I))) {
            return fallback(jehVar, ag7.m499a(joinOrSplitGesture));
        }
        long jRangeOfWhitespaces = gg7.rangeOfWhitespaces(jehVar.getVisualText(), iM29731getOffsetForHandwritingGestured4ec7I);
        if (jvg.m30587getCollapsedimpl(jRangeOfWhitespaces)) {
            jeh.m30512replaceTextM8tDOmk$default(jehVar, C2473f.f17566z, jRangeOfWhitespaces, null, false, 12, null);
        } else {
            m28916performDeletionSbBc2M(jehVar, jRangeOfWhitespaces, false);
        }
        return 1;
    }

    @ih4
    private final int performRemoveSpaceGesture(jeh jehVar, RemoveSpaceGesture removeSpaceGesture, lug lugVar, u8i u8iVar) {
        long jM29734getRangeForRemoveSpaceGesture5iVPX68 = gg7.m29734getRangeForRemoveSpaceGesture5iVPX68(lugVar.getLayoutResult(), gg7.toOffset(removeSpaceGesture.getStartPoint()), gg7.toOffset(removeSpaceGesture.getEndPoint()), lugVar.getTextLayoutNodeCoordinates(), u8iVar);
        if (jvg.m30587getCollapsedimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68)) {
            return f36512a.fallback(jehVar, ag7.m499a(removeSpaceGesture));
        }
        jvd.C8119f c8119f = new jvd.C8119f();
        c8119f.f52108a = -1;
        jvd.C8119f c8119f2 = new jvd.C8119f();
        c8119f2.f52108a = -1;
        String strReplace = new owd("\\s+").replace(kvg.m30779substringFDrldGo(jehVar.getVisualText(), jM29734getRangeForRemoveSpaceGesture5iVPX68), new C5798a(c8119f, c8119f2));
        if (c8119f.f52108a == -1 || c8119f2.f52108a == -1) {
            return fallback(jehVar, ag7.m499a(removeSpaceGesture));
        }
        long jTextRange = kvg.TextRange(jvg.m30593getStartimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68) + c8119f.f52108a, jvg.m30593getStartimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68) + c8119f2.f52108a);
        String strSubstring = strReplace.substring(c8119f.f52108a, strReplace.length() - (jvg.m30589getLengthimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68) - c8119f2.f52108a));
        md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        jeh.m30512replaceTextM8tDOmk$default(jehVar, strSubstring, jTextRange, null, false, 12, null);
        return 1;
    }

    @ih4
    private final int performSelectGesture(jeh jehVar, SelectGesture selectGesture, lug lugVar) {
        long jM29736getRangeForScreenRectOH9lIzo = gg7.m29736getRangeForScreenRectOH9lIzo(lugVar, vud.toComposeRect(selectGesture.getSelectionArea()), m28919toTextGranularityNUwxegE(selectGesture.getGranularity()), mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29736getRangeForScreenRectOH9lIzo)) {
            return f36512a.fallback(jehVar, ag7.m499a(selectGesture));
        }
        jehVar.m30519selectCharsIn5zctL8(jM29736getRangeForScreenRectOH9lIzo);
        return 1;
    }

    @ih4
    private final int performSelectRangeGesture(jeh jehVar, SelectRangeGesture selectRangeGesture, lug lugVar) {
        long jM29738getRangeForScreenRectsO048IG0 = gg7.m29738getRangeForScreenRectsO048IG0(lugVar, vud.toComposeRect(selectRangeGesture.getSelectionStartArea()), vud.toComposeRect(selectRangeGesture.getSelectionEndArea()), m28919toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29738getRangeForScreenRectsO048IG0)) {
            return f36512a.fallback(jehVar, ag7.m499a(selectRangeGesture));
        }
        jehVar.m30519selectCharsIn5zctL8(jM29738getRangeForScreenRectsO048IG0);
        return 1;
    }

    @ih4
    /* JADX INFO: renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m28918performSelectionOnLegacyTextField8ffj60Q(long j, osg osgVar, qy6<? super lw4, bth> qy6Var) {
        qy6Var.invoke(new s6f(jvg.m30593getStartimpl(j), jvg.m30588getEndimpl(j)));
        if (osgVar != null) {
            osgVar.enterSelectionMode$foundation_release(true);
        }
    }

    @ih4
    private final void previewDeleteGesture(jeh jehVar, DeleteGesture deleteGesture, lug lugVar) {
        m28915highlightRangeXJREzCE(jehVar, gg7.m29736getRangeForScreenRectOH9lIzo(lugVar, vud.toComposeRect(deleteGesture.getDeletionArea()), m28919toTextGranularityNUwxegE(deleteGesture.getGranularity()), mtg.f62116a.getContainsCenter()), itg.f48257b.m30400getHandwritingDeletePreviewsxJuwY());
    }

    @ih4
    private final void previewDeleteRangeGesture(jeh jehVar, DeleteRangeGesture deleteRangeGesture, lug lugVar) {
        m28915highlightRangeXJREzCE(jehVar, gg7.m29738getRangeForScreenRectsO048IG0(lugVar, vud.toComposeRect(deleteRangeGesture.getDeletionStartArea()), vud.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m28919toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), mtg.f62116a.getContainsCenter()), itg.f48257b.m30400getHandwritingDeletePreviewsxJuwY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(jeh jehVar) {
        wsg wsgVar = jehVar.f50410a;
        g48 g48Var = jehVar.f50411b;
        urg urgVar = urg.MergeIfPossible;
        wsgVar.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        wsgVar.getMainBuffer$foundation_release().clearHighlight();
        wsgVar.commitEditAsUser(g48Var, true, urgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(osg osgVar) {
        if (osgVar != null) {
            osgVar.clearPreviewHighlight$foundation_release();
        }
    }

    @ih4
    private final void previewSelectGesture(jeh jehVar, SelectGesture selectGesture, lug lugVar) {
        m28915highlightRangeXJREzCE(jehVar, gg7.m29736getRangeForScreenRectOH9lIzo(lugVar, vud.toComposeRect(selectGesture.getSelectionArea()), m28919toTextGranularityNUwxegE(selectGesture.getGranularity()), mtg.f62116a.getContainsCenter()), itg.f48257b.m30401getHandwritingSelectPreviewsxJuwY());
    }

    @ih4
    private final void previewSelectRangeGesture(jeh jehVar, SelectRangeGesture selectRangeGesture, lug lugVar) {
        m28915highlightRangeXJREzCE(jehVar, gg7.m29738getRangeForScreenRectsO048IG0(lugVar, vud.toComposeRect(selectRangeGesture.getSelectionStartArea()), vud.toComposeRect(selectRangeGesture.getSelectionEndArea()), m28919toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), mtg.f62116a.getContainsCenter()), itg.f48257b.m30401getHandwritingSelectPreviewsxJuwY());
    }

    @ih4
    /* JADX INFO: renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m28919toTextGranularityNUwxegE(int i) {
        return i != 1 ? i != 2 ? htg.f44857b.m30125getCharacterDRrd7Zo() : htg.f44857b.m30125getCharacterDRrd7Zo() : htg.f44857b.m30126getWordDRrd7Zo();
    }

    @ih4
    public final int performHandwritingGesture$foundation_release(@yfb jeh jehVar, @yfb HandwritingGesture handwritingGesture, @yfb lug lugVar, @gib u8i u8iVar) {
        if (bg7.m3166a(handwritingGesture)) {
            return performSelectGesture(jehVar, cg7.m3938a(handwritingGesture), lugVar);
        }
        if (ze7.m26677a(handwritingGesture)) {
            return performDeleteGesture(jehVar, af7.m480a(handwritingGesture), lugVar);
        }
        if (bf7.m3154a(handwritingGesture)) {
            return performSelectRangeGesture(jehVar, cf7.m3933a(handwritingGesture), lugVar);
        }
        if (df7.m9121a(handwritingGesture)) {
            return performDeleteRangeGesture(jehVar, ef7.m9911a(handwritingGesture), lugVar);
        }
        if (mf7.m17288a(handwritingGesture)) {
            return performJoinOrSplitGesture(jehVar, nf7.m17888a(handwritingGesture), lugVar, u8iVar);
        }
        if (hf7.m12348a(handwritingGesture)) {
            return performInsertGesture(jehVar, if7.m13009a(handwritingGesture), lugVar, u8iVar);
        }
        if (kf7.m14720a(handwritingGesture)) {
            return performRemoveSpaceGesture(jehVar, lf7.m16117a(handwritingGesture), lugVar, u8iVar);
        }
        return 2;
    }

    @ih4
    public final boolean previewHandwritingGesture$foundation_release(@yfb final jeh jehVar, @yfb PreviewableHandwritingGesture previewableHandwritingGesture, @yfb lug lugVar, @gib CancellationSignal cancellationSignal) {
        if (bg7.m3166a(previewableHandwritingGesture)) {
            previewSelectGesture(jehVar, cg7.m3938a(previewableHandwritingGesture), lugVar);
        } else if (ze7.m26677a(previewableHandwritingGesture)) {
            previewDeleteGesture(jehVar, af7.m480a(previewableHandwritingGesture), lugVar);
        } else if (bf7.m3154a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(jehVar, cf7.m3933a(previewableHandwritingGesture), lugVar);
        } else {
            if (!df7.m9121a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(jehVar, ef7.m9911a(previewableHandwritingGesture), lugVar);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: eg7
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                fg7.previewHandwritingGesture$lambda$1(jehVar);
            }
        });
        return true;
    }

    @ih4
    private final int performInsertGesture(z39 z39Var, InsertGesture insertGesture, u8i u8iVar, qy6<? super lw4, bth> qy6Var) {
        iug layoutResult;
        hug value;
        if (u8iVar != null) {
            int iM29732getOffsetForHandwritingGestured4ec7I = gg7.m29732getOffsetForHandwritingGestured4ec7I(z39Var, gg7.toOffset(insertGesture.getInsertionPoint()), u8iVar);
            if (iM29732getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = z39Var.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !gg7.isBiDiBoundary(value, iM29732getOffsetForHandwritingGestured4ec7I))) {
                performInsertionOnLegacyTextField(iM29732getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), qy6Var);
                return 1;
            }
            return fallbackOnLegacyTextField(ag7.m499a(insertGesture), qy6Var);
        }
        return fallbackOnLegacyTextField(ag7.m499a(insertGesture), qy6Var);
    }

    @ih4
    public final boolean previewHandwritingGesture$foundation_release(@yfb z39 z39Var, @yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib final osg osgVar, @gib CancellationSignal cancellationSignal) {
        hug value;
        gug layoutInput;
        C9041lz untransformedText = z39Var.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        iug layoutResult = z39Var.getLayoutResult();
        if (!md8.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (bg7.m3166a(previewableHandwritingGesture)) {
            previewSelectGesture(z39Var, cg7.m3938a(previewableHandwritingGesture), osgVar);
        } else if (ze7.m26677a(previewableHandwritingGesture)) {
            previewDeleteGesture(z39Var, af7.m480a(previewableHandwritingGesture), osgVar);
        } else if (bf7.m3154a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(z39Var, cf7.m3933a(previewableHandwritingGesture), osgVar);
        } else {
            if (!df7.m9121a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(z39Var, ef7.m9911a(previewableHandwritingGesture), osgVar);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: dg7
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                fg7.previewHandwritingGesture$lambda$9(osgVar);
            }
        });
        return true;
    }

    @ih4
    private final int performSelectGesture(z39 z39Var, SelectGesture selectGesture, osg osgVar, qy6<? super lw4, bth> qy6Var) {
        long jM29737getRangeForScreenRectOH9lIzo = gg7.m29737getRangeForScreenRectOH9lIzo(z39Var, vud.toComposeRect(selectGesture.getSelectionArea()), m28919toTextGranularityNUwxegE(selectGesture.getGranularity()), mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29737getRangeForScreenRectOH9lIzo)) {
            return f36512a.fallbackOnLegacyTextField(ag7.m499a(selectGesture), qy6Var);
        }
        m28918performSelectionOnLegacyTextField8ffj60Q(jM29737getRangeForScreenRectOH9lIzo, osgVar, qy6Var);
        return 1;
    }

    @ih4
    private final void previewDeleteGesture(z39 z39Var, DeleteGesture deleteGesture, osg osgVar) {
        if (osgVar != null) {
            osgVar.m31649setDeletionPreviewHighlight5zctL8$foundation_release(gg7.m29737getRangeForScreenRectOH9lIzo(z39Var, vud.toComposeRect(deleteGesture.getDeletionArea()), m28919toTextGranularityNUwxegE(deleteGesture.getGranularity()), mtg.f62116a.getContainsCenter()));
        }
    }

    @ih4
    private final void previewSelectGesture(z39 z39Var, SelectGesture selectGesture, osg osgVar) {
        if (osgVar != null) {
            osgVar.m31650setSelectionPreviewHighlight5zctL8$foundation_release(gg7.m29737getRangeForScreenRectOH9lIzo(z39Var, vud.toComposeRect(selectGesture.getSelectionArea()), m28919toTextGranularityNUwxegE(selectGesture.getGranularity()), mtg.f62116a.getContainsCenter()));
        }
    }

    @ih4
    private final int performDeleteGesture(z39 z39Var, DeleteGesture deleteGesture, C9041lz c9041lz, qy6<? super lw4, bth> qy6Var) {
        int iM28919toTextGranularityNUwxegE = m28919toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM29737getRangeForScreenRectOH9lIzo = gg7.m29737getRangeForScreenRectOH9lIzo(z39Var, vud.toComposeRect(deleteGesture.getDeletionArea()), iM28919toTextGranularityNUwxegE, mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29737getRangeForScreenRectOH9lIzo)) {
            return f36512a.fallbackOnLegacyTextField(ag7.m499a(deleteGesture), qy6Var);
        }
        m28917performDeletionOnLegacyTextFieldvJH6DeI(jM29737getRangeForScreenRectOH9lIzo, c9041lz, htg.m30121equalsimpl0(iM28919toTextGranularityNUwxegE, htg.f44857b.m30126getWordDRrd7Zo()), qy6Var);
        return 1;
    }

    @ih4
    private final int performSelectRangeGesture(z39 z39Var, SelectRangeGesture selectRangeGesture, osg osgVar, qy6<? super lw4, bth> qy6Var) {
        long jM29739getRangeForScreenRectsO048IG0 = gg7.m29739getRangeForScreenRectsO048IG0(z39Var, vud.toComposeRect(selectRangeGesture.getSelectionStartArea()), vud.toComposeRect(selectRangeGesture.getSelectionEndArea()), m28919toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29739getRangeForScreenRectsO048IG0)) {
            return f36512a.fallbackOnLegacyTextField(ag7.m499a(selectRangeGesture), qy6Var);
        }
        m28918performSelectionOnLegacyTextField8ffj60Q(jM29739getRangeForScreenRectsO048IG0, osgVar, qy6Var);
        return 1;
    }

    @ih4
    private final void previewDeleteRangeGesture(z39 z39Var, DeleteRangeGesture deleteRangeGesture, osg osgVar) {
        if (osgVar != null) {
            osgVar.m31649setDeletionPreviewHighlight5zctL8$foundation_release(gg7.m29739getRangeForScreenRectsO048IG0(z39Var, vud.toComposeRect(deleteRangeGesture.getDeletionStartArea()), vud.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m28919toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), mtg.f62116a.getContainsCenter()));
        }
    }

    @ih4
    private final void previewSelectRangeGesture(z39 z39Var, SelectRangeGesture selectRangeGesture, osg osgVar) {
        if (osgVar != null) {
            osgVar.m31650setSelectionPreviewHighlight5zctL8$foundation_release(gg7.m29739getRangeForScreenRectsO048IG0(z39Var, vud.toComposeRect(selectRangeGesture.getSelectionStartArea()), vud.toComposeRect(selectRangeGesture.getSelectionEndArea()), m28919toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), mtg.f62116a.getContainsCenter()));
        }
    }

    @ih4
    private final int performDeleteRangeGesture(z39 z39Var, DeleteRangeGesture deleteRangeGesture, C9041lz c9041lz, qy6<? super lw4, bth> qy6Var) {
        int iM28919toTextGranularityNUwxegE = m28919toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM29739getRangeForScreenRectsO048IG0 = gg7.m29739getRangeForScreenRectsO048IG0(z39Var, vud.toComposeRect(deleteRangeGesture.getDeletionStartArea()), vud.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM28919toTextGranularityNUwxegE, mtg.f62116a.getContainsCenter());
        if (jvg.m30587getCollapsedimpl(jM29739getRangeForScreenRectsO048IG0)) {
            return f36512a.fallbackOnLegacyTextField(ag7.m499a(deleteRangeGesture), qy6Var);
        }
        m28917performDeletionOnLegacyTextFieldvJH6DeI(jM29739getRangeForScreenRectsO048IG0, c9041lz, htg.m30121equalsimpl0(iM28919toTextGranularityNUwxegE, htg.f44857b.m30126getWordDRrd7Zo()), qy6Var);
        return 1;
    }

    @ih4
    private final int performJoinOrSplitGesture(z39 z39Var, JoinOrSplitGesture joinOrSplitGesture, C9041lz c9041lz, u8i u8iVar, qy6<? super lw4, bth> qy6Var) {
        iug layoutResult;
        hug value;
        if (u8iVar != null) {
            int iM29732getOffsetForHandwritingGestured4ec7I = gg7.m29732getOffsetForHandwritingGestured4ec7I(z39Var, gg7.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), u8iVar);
            if (iM29732getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = z39Var.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !gg7.isBiDiBoundary(value, iM29732getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = gg7.rangeOfWhitespaces(c9041lz, iM29732getOffsetForHandwritingGestured4ec7I);
                if (jvg.m30587getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(jvg.m30593getStartimpl(jRangeOfWhitespaces), C2473f.f17566z, qy6Var);
                } else {
                    m28917performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, c9041lz, false, qy6Var);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(ag7.m499a(joinOrSplitGesture), qy6Var);
        }
        return fallbackOnLegacyTextField(ag7.m499a(joinOrSplitGesture), qy6Var);
    }

    @ih4
    public final int performHandwritingGesture$foundation_release(@yfb z39 z39Var, @yfb HandwritingGesture handwritingGesture, @gib osg osgVar, @gib u8i u8iVar, @yfb qy6<? super lw4, bth> qy6Var) {
        hug value;
        gug layoutInput;
        C9041lz untransformedText = z39Var.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        iug layoutResult = z39Var.getLayoutResult();
        if (!md8.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (bg7.m3166a(handwritingGesture)) {
            return performSelectGesture(z39Var, cg7.m3938a(handwritingGesture), osgVar, qy6Var);
        }
        if (ze7.m26677a(handwritingGesture)) {
            return performDeleteGesture(z39Var, af7.m480a(handwritingGesture), untransformedText, qy6Var);
        }
        if (bf7.m3154a(handwritingGesture)) {
            return performSelectRangeGesture(z39Var, cf7.m3933a(handwritingGesture), osgVar, qy6Var);
        }
        if (df7.m9121a(handwritingGesture)) {
            return performDeleteRangeGesture(z39Var, ef7.m9911a(handwritingGesture), untransformedText, qy6Var);
        }
        if (mf7.m17288a(handwritingGesture)) {
            return performJoinOrSplitGesture(z39Var, nf7.m17888a(handwritingGesture), untransformedText, u8iVar, qy6Var);
        }
        if (hf7.m12348a(handwritingGesture)) {
            return performInsertGesture(z39Var, if7.m13009a(handwritingGesture), u8iVar, qy6Var);
        }
        if (kf7.m14720a(handwritingGesture)) {
            return performRemoveSpaceGesture(z39Var, lf7.m16117a(handwritingGesture), untransformedText, u8iVar, qy6Var);
        }
        return 2;
    }

    @ih4
    private final int performRemoveSpaceGesture(z39 z39Var, RemoveSpaceGesture removeSpaceGesture, C9041lz c9041lz, u8i u8iVar, qy6<? super lw4, bth> qy6Var) {
        iug layoutResult = z39Var.getLayoutResult();
        long jM29734getRangeForRemoveSpaceGesture5iVPX68 = gg7.m29734getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, gg7.toOffset(removeSpaceGesture.getStartPoint()), gg7.toOffset(removeSpaceGesture.getEndPoint()), z39Var.getLayoutCoordinates(), u8iVar);
        if (jvg.m30587getCollapsedimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68)) {
            return f36512a.fallbackOnLegacyTextField(ag7.m499a(removeSpaceGesture), qy6Var);
        }
        jvd.C8119f c8119f = new jvd.C8119f();
        c8119f.f52108a = -1;
        jvd.C8119f c8119f2 = new jvd.C8119f();
        c8119f2.f52108a = -1;
        String strReplace = new owd("\\s+").replace(kvg.m30779substringFDrldGo(c9041lz, jM29734getRangeForRemoveSpaceGesture5iVPX68), new C5799b(c8119f, c8119f2));
        if (c8119f.f52108a != -1 && c8119f2.f52108a != -1) {
            int iM30593getStartimpl = jvg.m30593getStartimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68) + c8119f.f52108a;
            int iM30593getStartimpl2 = jvg.m30593getStartimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68) + c8119f2.f52108a;
            String strSubstring = strReplace.substring(c8119f.f52108a, strReplace.length() - (jvg.m30589getLengthimpl(jM29734getRangeForRemoveSpaceGesture5iVPX68) - c8119f2.f52108a));
            md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            qy6Var.invoke(gg7.compoundEditCommand(new s6f(iM30593getStartimpl, iM30593getStartimpl2), new ac2(strSubstring, 1)));
            return 1;
        }
        return fallbackOnLegacyTextField(ag7.m499a(removeSpaceGesture), qy6Var);
    }
}
