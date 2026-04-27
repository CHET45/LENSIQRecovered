package p000;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* JADX INFO: renamed from: lt */
/* JADX INFO: loaded from: classes.dex */
@c5e(34)
@e0g(parameters = 1)
public final class C8958lt {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C8958lt f58654a = new C8958lt();

    /* JADX INFO: renamed from: b */
    public static final int f58655b = 0;

    private C8958lt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect$lambda$0(gz6 gz6Var, RectF rectF, RectF rectF2) {
        return ((Boolean) gz6Var.invoke(rectF, rectF2)).booleanValue();
    }

    @gib
    @ih4
    public final int[] getRangeForRect$ui_text_release(@yfb cug cugVar, @yfb RectF rectF, int i, @yfb final gz6<? super RectF, ? super RectF, Boolean> gz6Var) {
        SegmentFinder segmentFinderM11143a;
        if (i == 1) {
            segmentFinderM11143a = b10.f12357a.toAndroidSegmentFinder$ui_text_release(new lpi(cugVar.getText(), cugVar.getWordIterator()));
        } else {
            C8064jt.m14280a();
            segmentFinderM11143a = C5958ft.m11143a(C7004ht.m12597a(cugVar.getText(), cugVar.getTextPaint()));
        }
        return cugVar.getLayout().getRangeForRect(rectF, segmentFinderM11143a, new Layout.TextInclusionStrategy() { // from class: kt
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return C8958lt.getRangeForRect$lambda$0(gz6Var, rectF2, rectF3);
            }
        });
    }
}
