package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1155:1\n1#2:1156\n*E\n"})
@e0g(parameters = 0)
public final class cug {

    /* JADX INFO: renamed from: s */
    public static final int f27690s = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final TextPaint f27691a;

    /* JADX INFO: renamed from: b */
    public final boolean f27692b;

    /* JADX INFO: renamed from: c */
    public final boolean f27693c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final yv8 f27694d;

    /* JADX INFO: renamed from: e */
    public final boolean f27695e;

    /* JADX INFO: renamed from: f */
    @gib
    public kpi f27696f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final Layout f27697g;

    /* JADX INFO: renamed from: h */
    public final int f27698h;

    /* JADX INFO: renamed from: i */
    public final int f27699i;

    /* JADX INFO: renamed from: j */
    public final int f27700j;

    /* JADX INFO: renamed from: k */
    public final float f27701k;

    /* JADX INFO: renamed from: l */
    public final float f27702l;

    /* JADX INFO: renamed from: m */
    public final boolean f27703m;

    /* JADX INFO: renamed from: n */
    @gib
    public final Paint.FontMetricsInt f27704n;

    /* JADX INFO: renamed from: o */
    public final int f27705o;

    /* JADX INFO: renamed from: p */
    @gib
    public final i69[] f27706p;

    /* JADX INFO: renamed from: q */
    @yfb
    public final Rect f27707q;

    /* JADX INFO: renamed from: r */
    @gib
    public qv8 f27708r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public cug(@yfb CharSequence charSequence, float f, @yfb TextPaint textPaint, int i, @gib TextUtils.TruncateAt truncateAt, int i2, float f2, @fkd float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, @gib int[] iArr, @gib int[] iArr2, @yfb yv8 yv8Var) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutCreate;
        this.f27691a = textPaint;
        this.f27692b = z;
        this.f27693c = z2;
        this.f27694d = yv8Var;
        this.f27707q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = nug.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = cqg.f27109a.get(i);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, iv0.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = yv8Var.getBoringMetrics();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (boringMetrics == null || yv8Var.getMaxIntrinsicWidth() > f || z5) {
                z3 = true;
                this.f27703m = false;
                z4 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                layoutCreate = t3g.f83665a.create(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristic2, alignment, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            } else {
                this.f27703m = true;
                z3 = true;
                layoutCreate = tb1.f84137a.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z, z2, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z4 = false;
            }
            this.f27697g = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i3);
            this.f27698h = iMin;
            int i9 = iMin - 1;
            this.f27695e = (iMin >= i3 && (layoutCreate.getEllipsisCount(i9) > 0 || layoutCreate.getLineEnd(i9) != charSequence.length())) ? z3 : z4;
            long verticalPaddings = nug.getVerticalPaddings(this);
            i69[] lineHeightSpans = nug.getLineHeightSpans(this);
            this.f27706p = lineHeightSpans;
            long lineHeightPaddings = lineHeightSpans != null ? nug.getLineHeightPaddings(lineHeightSpans) : nug.f65756b;
            this.f27699i = Math.max(h5i.m29921getTopPaddingimpl(verticalPaddings), h5i.m29921getTopPaddingimpl(lineHeightPaddings));
            this.f27700j = Math.max(h5i.m29920getBottomPaddingimpl(verticalPaddings), h5i.m29920getBottomPaddingimpl(lineHeightPaddings));
            Paint.FontMetricsInt lastLineMetrics = nug.getLastLineMetrics(this, textPaint, textDirectionHeuristic, lineHeightSpans);
            this.f27705o = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i9)) : z4;
            this.f27704n = lastLineMetrics;
            this.f27701k = oz7.getEllipsizedLeftPadding$default(layoutCreate, i9, null, 2, null);
            this.f27702l = oz7.getEllipsizedRightPadding$default(layoutCreate, i9, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @fdi
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    private final float getHorizontalPadding(int i) {
        if (i == this.f27698h - 1) {
            return this.f27701k + this.f27702l;
        }
        return 0.0f;
    }

    @fdi
    public static /* synthetic */ void getLayout$annotations() {
    }

    private final qv8 getLayoutHelper() {
        qv8 qv8Var = this.f27708r;
        if (qv8Var != null) {
            md8.checkNotNull(qv8Var);
            return qv8Var;
        }
        qv8 qv8Var2 = new qv8(this.f27697g);
        this.f27708r = qv8Var2;
        return qv8Var2;
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(cug cugVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return cugVar.getPrimaryHorizontal(i, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(cug cugVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return cugVar.getSecondaryHorizontal(i, z);
    }

    @fdi
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final void fillBoundingBoxes(int i, int i2, @yfb float[] fArr, int i3) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (i < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if (i >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if (i2 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i3 < (i2 - i) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = getLineForOffset(i);
        int lineForOffset2 = getLineForOffset(i2 - 1);
        ml7 ml7Var = new ml7(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        while (true) {
            int lineStart = getLineStart(lineForOffset);
            int lineEnd = getLineEnd(lineForOffset);
            int iMin = Math.min(i2, lineEnd);
            float lineTop = getLineTop(lineForOffset);
            float lineBottom = getLineBottom(lineForOffset);
            boolean z = getParagraphDirection(lineForOffset) == 1;
            for (int iMax = Math.max(i, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (z && !zIsRtlCharAt) {
                    secondaryDownstream = ml7Var.getPrimaryDownstream(iMax);
                    secondaryUpstream = ml7Var.getPrimaryUpstream(iMax + 1);
                } else if (z && zIsRtlCharAt) {
                    secondaryUpstream = ml7Var.getSecondaryDownstream(iMax);
                    secondaryDownstream = ml7Var.getSecondaryUpstream(iMax + 1);
                } else if (z || !zIsRtlCharAt) {
                    secondaryDownstream = ml7Var.getSecondaryDownstream(iMax);
                    secondaryUpstream = ml7Var.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = ml7Var.getPrimaryDownstream(iMax);
                    secondaryDownstream = ml7Var.getPrimaryUpstream(iMax + 1);
                }
                fArr[i3] = secondaryDownstream;
                fArr[i3 + 1] = lineTop;
                fArr[i3 + 2] = secondaryUpstream;
                fArr[i3 + 3] = lineBottom;
                i3 += 4;
            }
            if (lineForOffset == lineForOffset2) {
                return;
            } else {
                lineForOffset++;
            }
        }
    }

    public final void fillLineHorizontalBounds$ui_text_release(int i, @yfb float[] fArr) {
        float secondaryDownstream;
        float secondaryUpstream;
        int lineStart = getLineStart(i);
        int lineEnd = getLineEnd(i);
        if (fArr.length < (lineEnd - lineStart) * 2) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ml7 ml7Var = new ml7(this);
        int i2 = 0;
        boolean z = getParagraphDirection(i) == 1;
        while (lineStart < lineEnd) {
            boolean zIsRtlCharAt = isRtlCharAt(lineStart);
            if (z && !zIsRtlCharAt) {
                secondaryDownstream = ml7Var.getPrimaryDownstream(lineStart);
                secondaryUpstream = ml7Var.getPrimaryUpstream(lineStart + 1);
            } else if (z && zIsRtlCharAt) {
                secondaryUpstream = ml7Var.getSecondaryDownstream(lineStart);
                secondaryDownstream = ml7Var.getSecondaryUpstream(lineStart + 1);
            } else if (zIsRtlCharAt) {
                secondaryUpstream = ml7Var.getPrimaryDownstream(lineStart);
                secondaryDownstream = ml7Var.getPrimaryUpstream(lineStart + 1);
            } else {
                secondaryDownstream = ml7Var.getSecondaryDownstream(lineStart);
                secondaryUpstream = ml7Var.getSecondaryUpstream(lineStart + 1);
            }
            fArr[i2] = secondaryDownstream;
            fArr[i2 + 1] = secondaryUpstream;
            i2 += 2;
            lineStart++;
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.f27700j;
    }

    @yfb
    public final RectF getBoundingBox(int i) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.f27697g.isRtlCharAt(i);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i, false);
                primaryHorizontal2 = getSecondaryHorizontal(i + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i, false);
                primaryHorizontal2 = getPrimaryHorizontal(i + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(i, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.f27695e;
    }

    public final boolean getFallbackLineSpacing() {
        return this.f27693c;
    }

    public final int getHeight() {
        return (this.f27695e ? this.f27697g.getLineBottom(this.f27698h - 1) : this.f27697g.getHeight()) + this.f27699i + this.f27700j + this.f27705o;
    }

    public final boolean getIncludePadding() {
        return this.f27692b;
    }

    @yfb
    public final Layout getLayout() {
        return this.f27697g;
    }

    @yfb
    public final yv8 getLayoutIntrinsics() {
        return this.f27694d;
    }

    public final float getLineAscent(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i != this.f27698h + (-1) || (fontMetricsInt = this.f27704n) == null) ? this.f27697g.getLineAscent(i) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int i) {
        return this.f27699i + ((i != this.f27698h + (-1) || this.f27704n == null) ? this.f27697g.getLineBaseline(i) : getLineTop(i) - this.f27704n.ascent);
    }

    public final float getLineBottom(int i) {
        if (i != this.f27698h - 1 || this.f27704n == null) {
            return this.f27699i + this.f27697g.getLineBottom(i) + (i == this.f27698h + (-1) ? this.f27700j : 0);
        }
        return this.f27697g.getLineBottom(i - 1) + this.f27704n.bottom;
    }

    public final int getLineCount() {
        return this.f27698h;
    }

    public final float getLineDescent(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return (i != this.f27698h + (-1) || (fontMetricsInt = this.f27704n) == null) ? this.f27697g.getLineDescent(i) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int i) {
        return this.f27697g.getEllipsisCount(i);
    }

    public final int getLineEllipsisOffset(int i) {
        return this.f27697g.getEllipsisStart(i);
    }

    public final int getLineEnd(int i) {
        return this.f27697g.getEllipsisStart(i) == 0 ? this.f27697g.getLineEnd(i) : this.f27697g.getText().length();
    }

    public final int getLineForOffset(int i) {
        return this.f27697g.getLineForOffset(i);
    }

    public final int getLineForVertical(int i) {
        return this.f27697g.getLineForVertical(i - this.f27699i);
    }

    public final float getLineHeight(int i) {
        return getLineBottom(i) - getLineTop(i);
    }

    public final float getLineLeft(int i) {
        return this.f27697g.getLineLeft(i) + (i == this.f27698h + (-1) ? this.f27701k : 0.0f);
    }

    public final float getLineRight(int i) {
        return this.f27697g.getLineRight(i) + (i == this.f27698h + (-1) ? this.f27702l : 0.0f);
    }

    public final int getLineStart(int i) {
        return this.f27697g.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.f27697g.getLineTop(i) + (i == 0 ? 0 : this.f27699i);
    }

    public final int getLineVisibleEnd(int i) {
        if (this.f27697g.getEllipsisStart(i) == 0) {
            return getLayoutHelper().getLineVisibleEnd(i);
        }
        return this.f27697g.getEllipsisStart(i) + this.f27697g.getLineStart(i);
    }

    public final float getLineWidth(int i) {
        return this.f27697g.getLineWidth(i);
    }

    public final float getMaxIntrinsicWidth() {
        return this.f27694d.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.f27694d.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i, float f) {
        return this.f27697g.getOffsetForHorizontal(i, f + ((-1) * getHorizontalPadding(i)));
    }

    public final int getParagraphDirection(int i) {
        return this.f27697g.getParagraphDirection(i);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, true, z) + getHorizontalPadding(getLineForOffset(i));
    }

    @gib
    public final int[] getRangeForRect(@yfb RectF rectF, int i, @yfb gz6<? super RectF, ? super RectF, Boolean> gz6Var) {
        return Build.VERSION.SDK_INT >= 34 ? C8958lt.f58654a.getRangeForRect$ui_text_release(this, rectF, i, gz6Var) : eug.getRangeForRect(this, this.f27697g, getLayoutHelper(), rectF, i, gz6Var);
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return getLayoutHelper().getHorizontalPosition(i, false, z) + getHorizontalPadding(getLineForOffset(i));
    }

    public final void getSelectionPath(int i, int i2, @yfb Path path) {
        this.f27697g.getSelectionPath(i, i2, path);
        if (this.f27699i == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f27699i);
    }

    @yfb
    public final CharSequence getText() {
        return this.f27697g.getText();
    }

    @yfb
    public final TextPaint getTextPaint() {
        return this.f27691a;
    }

    public final int getTopPadding$ui_text_release() {
        return this.f27699i;
    }

    @yfb
    public final kpi getWordIterator() {
        kpi kpiVar = this.f27696f;
        if (kpiVar != null) {
            return kpiVar;
        }
        kpi kpiVar2 = new kpi(this.f27697g.getText(), 0, this.f27697g.getText().length(), this.f27691a.getTextLocale());
        this.f27696f = kpiVar2;
        return kpiVar2;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.f27703m) {
            tb1 tb1Var = tb1.f84137a;
            Layout layout = this.f27697g;
            md8.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return tb1Var.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        t3g t3gVar = t3g.f83665a;
        Layout layout2 = this.f27697g;
        md8.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return t3gVar.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.f27693c);
    }

    public final boolean isLineEllipsized(int i) {
        return nug.isLineEllipsized(this.f27697g, i);
    }

    public final boolean isRtlCharAt(int i) {
        return this.f27697g.isRtlCharAt(i);
    }

    public final void paint(@yfb Canvas canvas) {
        if (canvas.getClipBounds(this.f27707q)) {
            int i = this.f27699i;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            dqg dqgVar = nug.f65755a;
            dqgVar.setCanvas(canvas);
            this.f27697g.draw(dqgVar);
            int i2 = this.f27699i;
            if (i2 != 0) {
                canvas.translate(0.0f, (-1) * i2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cug(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, yv8 yv8Var, int i9, jt3 jt3Var) {
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
        this(charSequence, f, textPaint, i10, truncateAt2, i11, (i9 & 64) != 0 ? 1.0f : f2, (i9 & 128) != 0 ? 0.0f : f3, (i9 & 256) != 0 ? false : z, (i9 & 512) != 0 ? true : z2, (i9 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? 0 : i8, (65536 & i9) != 0 ? null : iArr, (131072 & i9) != 0 ? null : iArr2, (i9 & 262144) != 0 ? new yv8(charSequence, textPaint, i11) : yv8Var);
    }
}
