package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.C9041lz;
import p000.do6;

/* JADX INFO: renamed from: xt */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,656:1\n1#2:657\n11335#3:658\n11670#3,3:659\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n254#1:658\n254#1:659,3\n*E\n"})
@e0g(parameters = 0)
public final class C15270xt implements bdc {

    /* JADX INFO: renamed from: h */
    public static final int f99156h = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C16248zt f99157a;

    /* JADX INFO: renamed from: b */
    public final int f99158b;

    /* JADX INFO: renamed from: c */
    public final boolean f99159c;

    /* JADX INFO: renamed from: d */
    public final long f99160d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final cug f99161e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final CharSequence f99162f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final List<rud> f99163g;

    /* JADX INFO: renamed from: xt$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99164a;

        static {
            int[] iArr = new int[q5e.values().length];
            try {
                iArr[q5e.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q5e.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f99164a = iArr;
        }
    }

    /* JADX INFO: renamed from: xt$b */
    public static final class b extends tt8 implements gz6<RectF, RectF, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mtg f99165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mtg mtgVar) {
            super(2);
            this.f99165a = mtgVar;
        }

        @Override // p000.gz6
        @yfb
        public final Boolean invoke(@yfb RectF rectF, @yfb RectF rectF2) {
            return Boolean.valueOf(this.f99165a.isIncluded(vud.toComposeRect(rectF), vud.toComposeRect(rectF2)));
        }
    }

    public /* synthetic */ C15270xt(C16248zt c16248zt, int i, boolean z, long j, jt3 jt3Var) {
        this(c16248zt, i, z, j);
    }

    private final cug constructTextLayout(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return new cug(this.f99162f, getWidth(), getTextPaint$ui_text_release(), i, truncateAt, this.f99157a.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, C15801yt.isIncludeFontPaddingEnabled(this.f99157a.getStyle()), true, i3, i5, i6, i7, i4, i2, null, null, this.f99157a.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }

    @fdi
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    private final b8f[] getShaderBrushSpans(cug cugVar) {
        if (!(cugVar.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = cugVar.getText();
        md8.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!hasSpan((Spanned) text, b8f.class)) {
            return null;
        }
        CharSequence text2 = cugVar.getText();
        md8.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (b8f[]) ((Spanned) text2).getSpans(0, cugVar.getText().length(), b8f.class);
    }

    @fdi
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @fdi
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void paint(vq1 vq1Var) {
        Canvas nativeCanvas = C5437eq.getNativeCanvas(vq1Var);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f99161e.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q */
    public void mo27982fillBoundingBoxes8ffj60Q(long j, @yfb float[] fArr, @h78(from = 0) int i) {
        this.f99161e.fillBoundingBoxes(jvg.m30591getMinimpl(j), jvg.m30590getMaximpl(j), fArr, i);
    }

    @Override // p000.bdc
    @yfb
    public q5e getBidiRunDirection(int i) {
        return this.f99161e.isRtlCharAt(i) ? q5e.Rtl : q5e.Ltr;
    }

    @Override // p000.bdc
    @yfb
    public rud getBoundingBox(int i) {
        if (i >= 0 && i < this.f99162f.length()) {
            RectF boundingBox = this.f99161e.getBoundingBox(i);
            return new rud(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0," + this.f99162f.length() + ')').toString());
    }

    @yfb
    public final CharSequence getCharSequence$ui_text_release() {
        return this.f99162f;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m33270getConstraintsmsEJaDk() {
        return this.f99160d;
    }

    @Override // p000.bdc
    @yfb
    public rud getCursorRect(int i) {
        if (i >= 0 && i <= this.f99162f.length()) {
            float primaryHorizontal$default = cug.getPrimaryHorizontal$default(this.f99161e, i, false, 2, null);
            int lineForOffset = this.f99161e.getLineForOffset(i);
            return new rud(primaryHorizontal$default, this.f99161e.getLineTop(lineForOffset), primaryHorizontal$default, this.f99161e.getLineBottom(lineForOffset));
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0," + this.f99162f.length() + C4584d2.f28243l).toString());
    }

    @Override // p000.bdc
    public boolean getDidExceedMaxLines() {
        return this.f99161e.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.f99159c;
    }

    @Override // p000.bdc
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // p000.bdc
    public float getHeight() {
        return this.f99161e.getHeight();
    }

    @Override // p000.bdc
    public float getHorizontalPosition(int i, boolean z) {
        return z ? cug.getPrimaryHorizontal$default(this.f99161e, i, false, 2, null) : cug.getSecondaryHorizontal$default(this.f99161e, i, false, 2, null);
    }

    @Override // p000.bdc
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i) {
        return this.f99161e.getLineAscent(i);
    }

    @Override // p000.bdc
    public float getLineBaseline(int i) {
        return this.f99161e.getLineBaseline(i);
    }

    @Override // p000.bdc
    public float getLineBottom(int i) {
        return this.f99161e.getLineBottom(i);
    }

    @Override // p000.bdc
    public int getLineCount() {
        return this.f99161e.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i) {
        return this.f99161e.getLineDescent(i);
    }

    @Override // p000.bdc
    public int getLineEnd(int i, boolean z) {
        return z ? this.f99161e.getLineVisibleEnd(i) : this.f99161e.getLineEnd(i);
    }

    @Override // p000.bdc
    public int getLineForOffset(int i) {
        return this.f99161e.getLineForOffset(i);
    }

    @Override // p000.bdc
    public int getLineForVerticalPosition(float f) {
        return this.f99161e.getLineForVertical((int) f);
    }

    @Override // p000.bdc
    public float getLineHeight(int i) {
        return this.f99161e.getLineHeight(i);
    }

    @Override // p000.bdc
    public float getLineLeft(int i) {
        return this.f99161e.getLineLeft(i);
    }

    @Override // p000.bdc
    public float getLineRight(int i) {
        return this.f99161e.getLineRight(i);
    }

    @Override // p000.bdc
    public int getLineStart(int i) {
        return this.f99161e.getLineStart(i);
    }

    @Override // p000.bdc
    public float getLineTop(int i) {
        return this.f99161e.getLineTop(i);
    }

    @Override // p000.bdc
    public float getLineWidth(int i) {
        return this.f99161e.getLineWidth(i);
    }

    @Override // p000.bdc
    public float getMaxIntrinsicWidth() {
        return this.f99157a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.f99158b;
    }

    @Override // p000.bdc
    public float getMinIntrinsicWidth() {
        return this.f99157a.getMinIntrinsicWidth();
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    public int mo27983getOffsetForPositionk4lQ0M(long j) {
        return this.f99161e.getOffsetForHorizontal(this.f99161e.getLineForVertical((int) izb.m30430getYimpl(j)), izb.m30429getXimpl(j));
    }

    @Override // p000.bdc
    @yfb
    public q5e getParagraphDirection(int i) {
        return this.f99161e.getParagraphDirection(this.f99161e.getLineForOffset(i)) == 1 ? q5e.Ltr : q5e.Rtl;
    }

    @yfb
    public final C16248zt getParagraphIntrinsics() {
        return this.f99157a;
    }

    @Override // p000.bdc
    @yfb
    public vic getPathForRange(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.f99162f.length()) {
            Path path = new Path();
            this.f99161e.getSelectionPath(i, i2, path);
            return C8522ku.asComposePath(path);
        }
        throw new IllegalArgumentException(("start(" + i + ") or end(" + i2 + ") is out of range [0.." + this.f99162f.length() + "], or start > end!").toString());
    }

    @Override // p000.bdc
    @yfb
    public List<rud> getPlaceholderRects() {
        return this.f99163g;
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI */
    public long mo27984getRangeForRect86BmAI(@yfb rud rudVar, int i, @yfb mtg mtgVar) {
        int[] rangeForRect = this.f99161e.getRangeForRect(vud.toAndroidRectF(rudVar), C4501cu.m28554toLayoutTextGranularityduNsdkg(i), new b(mtgVar));
        return rangeForRect == null ? jvg.f52112b.m30598getZerod9O1mEE() : kvg.TextRange(rangeForRect[0], rangeForRect[1]);
    }

    @yfb
    public final Locale getTextLocale$ui_text_release() {
        return this.f99157a.getTextPaint$ui_text_release().getTextLocale();
    }

    @yfb
    public final C10071nv getTextPaint$ui_text_release() {
        return this.f99157a.getTextPaint$ui_text_release();
    }

    @Override // p000.bdc
    public float getWidth() {
        return ku2.m30763getMaxWidthimpl(this.f99160d);
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    public long mo27985getWordBoundaryjx7JFs(int i) {
        kpi wordIterator = this.f99161e.getWordIterator();
        return kvg.TextRange(jpi.getWordStart(wordIterator, i), jpi.getWordEnd(wordIterator, i));
    }

    @Override // p000.bdc
    public boolean isLineEllipsized(int i) {
        return this.f99161e.isLineEllipsized(i);
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: paint-LG529CI */
    public void mo27986paintLG529CI(@yfb vq1 vq1Var, long j, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        int iM31233getBlendMode0nO6VwU = getTextPaint$ui_text_release().m31233getBlendMode0nO6VwU();
        C10071nv textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m31238setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(e8fVar);
        textPaint$ui_text_release.setTextDecoration(qqgVar);
        textPaint$ui_text_release.setDrawStyle(rp4Var);
        textPaint$ui_text_release.m31235setBlendModes9anfk8(i);
        paint(vq1Var);
        getTextPaint$ui_text_release().m31235setBlendModes9anfk8(iM31233getBlendMode0nO6VwU);
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: paint-RPmYEkk */
    public void mo27987paintRPmYEkk(@yfb vq1 vq1Var, long j, @gib e8f e8fVar, @gib qqg qqgVar) {
        C10071nv textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m31238setColor8_81llA(j);
        textPaint$ui_text_release.setShadow(e8fVar);
        textPaint$ui_text_release.setTextDecoration(qqgVar);
        paint(vq1Var);
    }

    @Override // p000.bdc
    /* JADX INFO: renamed from: paint-hn5TExg */
    public void mo27988painthn5TExg(@yfb vq1 vq1Var, @yfb he1 he1Var, float f, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        int iM31233getBlendMode0nO6VwU = getTextPaint$ui_text_release().m31233getBlendMode0nO6VwU();
        C10071nv textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m31236setBrush12SF9DM(he1Var, eqf.Size(getWidth(), getHeight()), f);
        textPaint$ui_text_release.setShadow(e8fVar);
        textPaint$ui_text_release.setTextDecoration(qqgVar);
        textPaint$ui_text_release.setDrawStyle(rp4Var);
        textPaint$ui_text_release.m31235setBlendModes9anfk8(i);
        paint(vq1Var);
        getTextPaint$ui_text_release().m31235setBlendModes9anfk8(iM31233getBlendMode0nO6VwU);
    }

    public /* synthetic */ C15270xt(String str, yvg yvgVar, List list, List list2, int i, boolean z, long j, do6.InterfaceC4891b interfaceC4891b, c64 c64Var, jt3 jt3Var) {
        this(str, yvgVar, list, list2, i, z, j, interfaceC4891b, c64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C15270xt(C16248zt c16248zt, int i, boolean z, long j) {
        CharSequence charSequence$ui_text_release;
        List<rud> listEmptyList;
        rud rudVar;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float heightPx2;
        float lineBaseline2;
        this.f99157a = c16248zt;
        this.f99158b = i;
        this.f99159c = z;
        this.f99160d = j;
        if (ku2.m30764getMinHeightimpl(j) != 0 || ku2.m30765getMinWidthimpl(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i >= 1) {
            yvg style = c16248zt.getStyle();
            if (C4501cu.shouldAttachIndentationFixSpan(style, z)) {
                charSequence$ui_text_release = C4501cu.attachIndentationFixSpan(c16248zt.getCharSequence$ui_text_release());
            } else {
                charSequence$ui_text_release = c16248zt.getCharSequence$ui_text_release();
            }
            this.f99162f = charSequence$ui_text_release;
            int iM28549toLayoutAlignaXe7zB0 = C4501cu.m28549toLayoutAlignaXe7zB0(style.m33448getTextAligne0LSkKk());
            boolean zM28037equalsimpl0 = bqg.m28037equalsimpl0(style.m33448getTextAligne0LSkKk(), bqg.f14513b.m28043getJustifye0LSkKk());
            int iM28551toLayoutHyphenationFrequency3fSNIE = C4501cu.m28551toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text_release().m30675getHyphensvmbZdU8());
            int iM28550toLayoutBreakStrategyxImikfE = C4501cu.m28550toLayoutBreakStrategyxImikfE(d69.m28577getStrategyfcGXIks(style.m33445getLineBreakrAG3T2k()));
            int iM28552toLayoutLineBreakStylehpcqdu8 = C4501cu.m28552toLayoutLineBreakStylehpcqdu8(d69.m28578getStrictnessusljTpc(style.m33445getLineBreakrAG3T2k()));
            int iM28553toLayoutLineBreakWordStylewPN0Rpw = C4501cu.m28553toLayoutLineBreakWordStylewPN0Rpw(d69.m28579getWordBreakjp8hJ3c(style.m33445getLineBreakrAG3T2k()));
            TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
            cug cugVarConstructTextLayout = constructTextLayout(iM28549toLayoutAlignaXe7zB0, zM28037equalsimpl0 ? 1 : 0, truncateAt, i, iM28551toLayoutHyphenationFrequency3fSNIE, iM28550toLayoutBreakStrategyxImikfE, iM28552toLayoutLineBreakStylehpcqdu8, iM28553toLayoutLineBreakWordStylewPN0Rpw);
            if (z && cugVarConstructTextLayout.getHeight() > ku2.m30762getMaxHeightimpl(j) && i > 1) {
                int iNumberOfLinesThatFitMaxHeight = C4501cu.numberOfLinesThatFitMaxHeight(cugVarConstructTextLayout, ku2.m30762getMaxHeightimpl(j));
                if (iNumberOfLinesThatFitMaxHeight >= 0 && iNumberOfLinesThatFitMaxHeight != i) {
                    cugVarConstructTextLayout = constructTextLayout(iM28549toLayoutAlignaXe7zB0, zM28037equalsimpl0 ? 1 : 0, truncateAt, kpd.coerceAtLeast(iNumberOfLinesThatFitMaxHeight, 1), iM28551toLayoutHyphenationFrequency3fSNIE, iM28550toLayoutBreakStrategyxImikfE, iM28552toLayoutLineBreakStylehpcqdu8, iM28553toLayoutLineBreakWordStylewPN0Rpw);
                }
                this.f99161e = cugVarConstructTextLayout;
            } else {
                this.f99161e = cugVarConstructTextLayout;
            }
            getTextPaint$ui_text_release().m31236setBrush12SF9DM(style.getBrush(), eqf.Size(getWidth(), getHeight()), style.getAlpha());
            b8f[] shaderBrushSpans = getShaderBrushSpans(this.f99161e);
            if (shaderBrushSpans != null) {
                Iterator it = l60.iterator(shaderBrushSpans);
                while (it.hasNext()) {
                    ((b8f) it.next()).m27963setSizeuvyYCjk(eqf.Size(getWidth(), getHeight()));
                }
            }
            CharSequence charSequence = this.f99162f;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), lwc.class);
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    lwc lwcVar = (lwc) obj;
                    int spanStart = spanned.getSpanStart(lwcVar);
                    int spanEnd = spanned.getSpanEnd(lwcVar);
                    int lineForOffset = this.f99161e.getLineForOffset(spanStart);
                    byte b2 = lineForOffset >= this.f99158b;
                    byte b3 = this.f99161e.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.f99161e.getLineEllipsisOffset(lineForOffset);
                    byte b4 = spanEnd > this.f99161e.getLineEnd(lineForOffset);
                    if (b3 == true || b4 == true || b2 == true) {
                        rudVar = null;
                    } else {
                        int i2 = a.f99164a[getBidiRunDirection(spanStart).ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new ceb();
                            }
                            horizontalPosition = getHorizontalPosition(spanStart, true) - lwcVar.getWidthPx();
                        } else {
                            horizontalPosition = getHorizontalPosition(spanStart, true);
                        }
                        float widthPx = lwcVar.getWidthPx() + horizontalPosition;
                        cug cugVar = this.f99161e;
                        switch (lwcVar.getVerticalAlign()) {
                            case 0:
                                lineBaseline = cugVar.getLineBaseline(lineForOffset);
                                heightPx = lwcVar.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            case 1:
                                lineTop = cugVar.getLineTop(lineForOffset);
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            case 2:
                                lineBaseline = cugVar.getLineBottom(lineForOffset);
                                heightPx = lwcVar.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            case 3:
                                lineTop = ((cugVar.getLineTop(lineForOffset) + cugVar.getLineBottom(lineForOffset)) - lwcVar.getHeightPx()) / 2;
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            case 4:
                                heightPx2 = lwcVar.getFontMetrics().ascent;
                                lineBaseline2 = cugVar.getLineBaseline(lineForOffset);
                                lineTop = heightPx2 + lineBaseline2;
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            case 5:
                                lineTop = (lwcVar.getFontMetrics().descent + cugVar.getLineBaseline(lineForOffset)) - lwcVar.getHeightPx();
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = lwcVar.getFontMetrics();
                                heightPx2 = ((fontMetrics.ascent + fontMetrics.descent) - lwcVar.getHeightPx()) / 2;
                                lineBaseline2 = cugVar.getLineBaseline(lineForOffset);
                                lineTop = heightPx2 + lineBaseline2;
                                rudVar = new rud(horizontalPosition, lineTop, widthPx, lwcVar.getHeightPx() + lineTop);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    arrayList.add(rudVar);
                }
                listEmptyList = arrayList;
            } else {
                listEmptyList = l82.emptyList();
            }
            this.f99163g = listEmptyList;
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0");
    }

    private C15270xt(String str, yvg yvgVar, List<C9041lz.c<swf>> list, List<C9041lz.c<ewc>> list2, int i, boolean z, long j, do6.InterfaceC4891b interfaceC4891b, c64 c64Var) {
        this(new C16248zt(str, yvgVar, list, list2, interfaceC4891b, c64Var), i, z, j, null);
    }
}
