package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.C9041lz;
import p000.do6;
import p000.jvd;
import p000.jvg;
import p000.xn6;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1145:1\n508#2,3:1146\n33#2,4:1149\n511#2:1153\n151#2,3:1154\n33#2,4:1157\n154#2,2:1161\n38#2:1163\n156#2:1164\n512#2,2:1165\n38#2:1167\n514#2:1168\n33#2,6:1170\n33#2,6:1176\n1#3:1169\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n372#1:1146,3\n372#1:1149,4\n372#1:1153\n374#1:1154,3\n374#1:1157,4\n374#1:1161,2\n374#1:1163\n374#1:1164\n372#1:1165,2\n372#1:1167\n372#1:1168\n400#1:1170,6\n417#1:1176,6\n*E\n"})
@e0g(parameters = 0)
public final class u2b {

    /* JADX INFO: renamed from: i */
    public static final int f86641i = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final v2b f86642a;

    /* JADX INFO: renamed from: b */
    public final int f86643b;

    /* JADX INFO: renamed from: c */
    public final boolean f86644c;

    /* JADX INFO: renamed from: d */
    public final float f86645d;

    /* JADX INFO: renamed from: e */
    public final float f86646e;

    /* JADX INFO: renamed from: f */
    public final int f86647f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final List<rud> f86648g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final List<ddc> f86649h;

    /* JADX INFO: renamed from: u2b$a */
    public static final class C13333a extends tt8 implements qy6<ddc, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f86650a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float[] f86651b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ jvd.C8119f f86652c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jvd.C8118e f86653d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13333a(long j, float[] fArr, jvd.C8119f c8119f, jvd.C8118e c8118e) {
            super(1);
            this.f86650a = j;
            this.f86651b = fArr;
            this.f86652c = c8119f;
            this.f86653d = c8118e;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ddc ddcVar) {
            invoke2(ddcVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ddc ddcVar) {
            long j = this.f86650a;
            float[] fArr = this.f86651b;
            jvd.C8119f c8119f = this.f86652c;
            jvd.C8118e c8118e = this.f86653d;
            long jTextRange = kvg.TextRange(ddcVar.toLocalIndex(ddcVar.getStartIndex() > jvg.m30591getMinimpl(j) ? ddcVar.getStartIndex() : jvg.m30591getMinimpl(j)), ddcVar.toLocalIndex(ddcVar.getEndIndex() < jvg.m30590getMaximpl(j) ? ddcVar.getEndIndex() : jvg.m30590getMaximpl(j)));
            ddcVar.getParagraph().mo27982fillBoundingBoxes8ffj60Q(jTextRange, fArr, c8119f.f52108a);
            int iM30589getLengthimpl = c8119f.f52108a + (jvg.m30589getLengthimpl(jTextRange) * 4);
            for (int i = c8119f.f52108a; i < iM30589getLengthimpl; i += 4) {
                int i2 = i + 1;
                float f = fArr[i2];
                float f2 = c8118e.f52107a;
                fArr[i2] = f + f2;
                int i3 = i + 3;
                fArr[i3] = fArr[i3] + f2;
            }
            c8119f.f52108a = iM30589getLengthimpl;
            c8118e.f52107a += ddcVar.getParagraph().getHeight();
        }
    }

    /* JADX INFO: renamed from: u2b$b */
    public static final class C13334b extends tt8 implements qy6<ddc, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vic f86654a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f86655b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f86656c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13334b(vic vicVar, int i, int i2) {
            super(1);
            this.f86654a = vicVar;
            this.f86655b = i;
            this.f86656c = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(ddc ddcVar) {
            invoke2(ddcVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb ddc ddcVar) {
            vic.m32765addPathUv8p0NA$default(this.f86654a, ddcVar.toGlobal(ddcVar.getParagraph().getPathForRange(ddcVar.toLocalIndex(this.f86655b), ddcVar.toLocalIndex(this.f86656c))), 0L, 2, null);
        }
    }

    public /* synthetic */ u2b(C9041lz c9041lz, yvg yvgVar, long j, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List list, int i, boolean z, jt3 jt3Var) {
        this(c9041lz, yvgVar, j, c64Var, interfaceC4891b, (List<C9041lz.c<ewc>>) list, i, z);
    }

    private final C9041lz getAnnotatedString() {
        return this.f86642a.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(u2b u2bVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return u2bVar.getLineEnd(i, z);
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m32529paintRPmYEkk$default(u2b u2bVar, vq1 vq1Var, long j, e8f e8fVar, qqg qqgVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = w82.f93556b.m32987getUnspecified0d7_KjU();
        }
        u2bVar.m32536paintRPmYEkk(vq1Var, j, (i & 4) != 0 ? null : e8fVar, (i & 8) != 0 ? null : qqgVar);
    }

    private final void requireIndexInRange(int i) {
        if (i < 0 || i >= getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
        }
    }

    private final void requireIndexInRangeInclusiveEnd(int i) {
        if (i < 0 || i > getAnnotatedString().getText().length()) {
            throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + getAnnotatedString().length() + C4584d2.f28243l).toString());
        }
    }

    private final void requireLineIndexInRange(int i) {
        if (i < 0 || i >= this.f86647f) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.f86647f + ')').toString());
        }
    }

    @yfb
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m32531fillBoundingBoxes8ffj60Q(long j, @yfb float[] fArr, @h78(from = 0) int i) {
        requireIndexInRange(jvg.m30591getMinimpl(j));
        requireIndexInRangeInclusiveEnd(jvg.m30590getMaximpl(j));
        jvd.C8119f c8119f = new jvd.C8119f();
        c8119f.f52108a = i;
        x2b.m33173findParagraphsByRangeSbBc2M(this.f86649h, j, new C13333a(j, fArr, c8119f, new jvd.C8118e()));
        return fArr;
    }

    @yfb
    public final q5e getBidiRunDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        ddc ddcVar = this.f86649h.get(i == getAnnotatedString().length() ? l82.getLastIndex(this.f86649h) : x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.getParagraph().getBidiRunDirection(ddcVar.toLocalIndex(i));
    }

    @yfb
    public final rud getBoundingBox(int i) {
        requireIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.toGlobal(ddcVar.getParagraph().getBoundingBox(ddcVar.toLocalIndex(i)));
    }

    @yfb
    public final rud getCursorRect(int i) {
        requireIndexInRangeInclusiveEnd(i);
        ddc ddcVar = this.f86649h.get(i == getAnnotatedString().length() ? l82.getLastIndex(this.f86649h) : x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.toGlobal(ddcVar.getParagraph().getCursorRect(ddcVar.toLocalIndex(i)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.f86644c;
    }

    public final float getFirstBaseline() {
        if (this.f86649h.isEmpty()) {
            return 0.0f;
        }
        return this.f86649h.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.f86646e;
    }

    public final float getHorizontalPosition(int i, boolean z) {
        requireIndexInRangeInclusiveEnd(i);
        ddc ddcVar = this.f86649h.get(i == getAnnotatedString().length() ? l82.getLastIndex(this.f86649h) : x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.getParagraph().getHorizontalPosition(ddcVar.toLocalIndex(i), z);
    }

    @yfb
    public final v2b getIntrinsics() {
        return this.f86642a;
    }

    public final float getLastBaseline() {
        if (this.f86649h.isEmpty()) {
            return 0.0f;
        }
        ddc ddcVar = (ddc) v82.last((List) this.f86649h);
        return ddcVar.toGlobalYPosition(ddcVar.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.toGlobalYPosition(ddcVar.getParagraph().getLineBaseline(ddcVar.toLocalLineIndex(i)));
    }

    public final float getLineBottom(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.toGlobalYPosition(ddcVar.getParagraph().getLineBottom(ddcVar.toLocalLineIndex(i)));
    }

    public final int getLineCount() {
        return this.f86647f;
    }

    public final int getLineEnd(int i, boolean z) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.toGlobalIndex(ddcVar.getParagraph().getLineEnd(ddcVar.toLocalLineIndex(i), z));
    }

    public final int getLineForOffset(int i) {
        ddc ddcVar = this.f86649h.get(i >= getAnnotatedString().length() ? l82.getLastIndex(this.f86649h) : i < 0 ? 0 : x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.toGlobalLineIndex(ddcVar.getParagraph().getLineForOffset(ddcVar.toLocalIndex(i)));
    }

    public final int getLineForVerticalPosition(float f) {
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByY(this.f86649h, f));
        return ddcVar.getLength() == 0 ? ddcVar.getStartLineIndex() : ddcVar.toGlobalLineIndex(ddcVar.getParagraph().getLineForVerticalPosition(ddcVar.toLocalYPosition(f)));
    }

    public final float getLineHeight(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.getParagraph().getLineHeight(ddcVar.toLocalLineIndex(i));
    }

    public final float getLineLeft(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.getParagraph().getLineLeft(ddcVar.toLocalLineIndex(i));
    }

    public final float getLineRight(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.getParagraph().getLineRight(ddcVar.toLocalLineIndex(i));
    }

    public final int getLineStart(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.toGlobalIndex(ddcVar.getParagraph().getLineStart(ddcVar.toLocalLineIndex(i)));
    }

    public final float getLineTop(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.toGlobalYPosition(ddcVar.getParagraph().getLineTop(ddcVar.toLocalLineIndex(i)));
    }

    public final float getLineWidth(int i) {
        requireLineIndexInRange(i);
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i));
        return ddcVar.getParagraph().getLineWidth(ddcVar.toLocalLineIndex(i));
    }

    public final float getMaxIntrinsicWidth() {
        return this.f86642a.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.f86643b;
    }

    public final float getMinIntrinsicWidth() {
        return this.f86642a.getMinIntrinsicWidth();
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m32532getOffsetForPositionk4lQ0M(long j) {
        ddc ddcVar = this.f86649h.get(x2b.findParagraphByY(this.f86649h, izb.m30430getYimpl(j)));
        return ddcVar.getLength() == 0 ? ddcVar.getStartIndex() : ddcVar.toGlobalIndex(ddcVar.getParagraph().mo27983getOffsetForPositionk4lQ0M(ddcVar.m28645toLocalMKHz9U(j)));
    }

    @yfb
    public final q5e getParagraphDirection(int i) {
        requireIndexInRangeInclusiveEnd(i);
        ddc ddcVar = this.f86649h.get(i == getAnnotatedString().length() ? l82.getLastIndex(this.f86649h) : x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.getParagraph().getParagraphDirection(ddcVar.toLocalIndex(i));
    }

    @yfb
    public final List<ddc> getParagraphInfoList$ui_text_release() {
        return this.f86649h;
    }

    @yfb
    public final vic getPathForRange(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= getAnnotatedString().getText().length()) {
            if (i == i2) {
                return C8522ku.Path();
            }
            vic vicVarPath = C8522ku.Path();
            x2b.m33173findParagraphsByRangeSbBc2M(this.f86649h, kvg.TextRange(i, i2), new C13334b(vicVarPath, i, i2));
            return vicVarPath;
        }
        throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
    }

    @yfb
    public final List<rud> getPlaceholderRects() {
        return this.f86648g;
    }

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m32533getRangeForRect86BmAI(@yfb rud rudVar, int i, @yfb mtg mtgVar) {
        jvg.C8123a c8123a;
        jvg.C8123a c8123a2;
        int iFindParagraphByY = x2b.findParagraphByY(this.f86649h, rudVar.getTop());
        if (this.f86649h.get(iFindParagraphByY).getBottom() >= rudVar.getBottom() || iFindParagraphByY == l82.getLastIndex(this.f86649h)) {
            ddc ddcVar = this.f86649h.get(iFindParagraphByY);
            return ddc.m28643toGlobalxdX6G0$default(ddcVar, ddcVar.getParagraph().mo27984getRangeForRect86BmAI(ddcVar.toLocal(rudVar), i, mtgVar), false, 1, null);
        }
        int iFindParagraphByY2 = x2b.findParagraphByY(this.f86649h, rudVar.getBottom());
        long jM30598getZerod9O1mEE = jvg.f52112b.m30598getZerod9O1mEE();
        while (true) {
            c8123a = jvg.f52112b;
            if (!jvg.m30586equalsimpl0(jM30598getZerod9O1mEE, c8123a.m30598getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ddc ddcVar2 = this.f86649h.get(iFindParagraphByY);
            jM30598getZerod9O1mEE = ddc.m28643toGlobalxdX6G0$default(ddcVar2, ddcVar2.getParagraph().mo27984getRangeForRect86BmAI(ddcVar2.toLocal(rudVar), i, mtgVar), false, 1, null);
            iFindParagraphByY++;
        }
        if (jvg.m30586equalsimpl0(jM30598getZerod9O1mEE, c8123a.m30598getZerod9O1mEE())) {
            return c8123a.m30598getZerod9O1mEE();
        }
        long jM30598getZerod9O1mEE2 = c8123a.m30598getZerod9O1mEE();
        while (true) {
            c8123a2 = jvg.f52112b;
            if (!jvg.m30586equalsimpl0(jM30598getZerod9O1mEE2, c8123a2.m30598getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ddc ddcVar3 = this.f86649h.get(iFindParagraphByY2);
            jM30598getZerod9O1mEE2 = ddc.m28643toGlobalxdX6G0$default(ddcVar3, ddcVar3.getParagraph().mo27984getRangeForRect86BmAI(ddcVar3.toLocal(rudVar), i, mtgVar), false, 1, null);
            iFindParagraphByY2--;
        }
        return jvg.m30586equalsimpl0(jM30598getZerod9O1mEE2, c8123a2.m30598getZerod9O1mEE()) ? jM30598getZerod9O1mEE : kvg.TextRange(jvg.m30593getStartimpl(jM30598getZerod9O1mEE), jvg.m30588getEndimpl(jM30598getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.f86645d;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m32534getWordBoundaryjx7JFs(int i) {
        requireIndexInRangeInclusiveEnd(i);
        ddc ddcVar = this.f86649h.get(i == getAnnotatedString().length() ? l82.getLastIndex(this.f86649h) : x2b.findParagraphByIndex(this.f86649h, i));
        return ddcVar.m28644toGlobalxdX6G0(ddcVar.getParagraph().mo27985getWordBoundaryjx7JFs(ddcVar.toLocalIndex(i)), false);
    }

    public final boolean isLineEllipsized(int i) {
        requireLineIndexInRange(i);
        return this.f86649h.get(x2b.findParagraphByLineIndex(this.f86649h, i)).getParagraph().isLineEllipsized(i);
    }

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m32535paintLG529CI(@yfb vq1 vq1Var, long j, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        vq1Var.save();
        List<ddc> list = this.f86649h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ddc ddcVar = list.get(i2);
            ddcVar.getParagraph().mo27986paintLG529CI(vq1Var, j, e8fVar, qqgVar, rp4Var, i);
            vq1Var.translate(0.0f, ddcVar.getParagraph().getHeight());
        }
        vq1Var.restore();
    }

    @q64(level = u64.f86867c, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m32536paintRPmYEkk(vq1 vq1Var, long j, e8f e8fVar, qqg qqgVar) {
        vq1Var.save();
        List<ddc> list = this.f86649h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ddc ddcVar = list.get(i);
            ddcVar.getParagraph().mo27987paintRPmYEkk(vq1Var, j, e8fVar, qqgVar);
            vq1Var.translate(0.0f, ddcVar.getParagraph().getHeight());
        }
        vq1Var.restore();
    }

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m32537painthn5TExg(@yfb vq1 vq1Var, @yfb he1 he1Var, float f, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        C13186tt.m32438drawMultiParagraph7AXcY_I(this, vq1Var, he1Var, f, e8fVar, qqgVar, rp4Var, i);
    }

    public /* synthetic */ u2b(v2b v2bVar, long j, int i, boolean z, jt3 jt3Var) {
        this(v2bVar, j, i, z);
    }

    private u2b(v2b v2bVar, long j, int i, boolean z) {
        boolean z2;
        int iM30762getMaxHeightimpl;
        this.f86642a = v2bVar;
        this.f86643b = i;
        if (ku2.m30765getMinWidthimpl(j) == 0 && ku2.m30764getMinHeightimpl(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<edc> infoList$ui_text_release = v2bVar.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i2 = 0;
            int i3 = 0;
            float f = 0.0f;
            int i4 = 0;
            while (i4 < size) {
                edc edcVar = infoList$ui_text_release.get(i4);
                fdc intrinsics = edcVar.getIntrinsics();
                int iM30763getMaxWidthimpl = ku2.m30763getMaxWidthimpl(j);
                if (ku2.m30758getHasBoundedHeightimpl(j)) {
                    iM30762getMaxHeightimpl = kpd.coerceAtLeast(ku2.m30762getMaxHeightimpl(j) - hdc.ceilToInt(f), i2);
                } else {
                    iM30762getMaxHeightimpl = ku2.m30762getMaxHeightimpl(j);
                }
                bdc bdcVarM29989Paragraph_EkL_Y = hdc.m29989Paragraph_EkL_Y(intrinsics, nu2.Constraints$default(0, iM30763getMaxWidthimpl, 0, iM30762getMaxHeightimpl, 5, null), this.f86643b - i3, z);
                float height = f + bdcVarM29989Paragraph_EkL_Y.getHeight();
                int lineCount = i3 + bdcVarM29989Paragraph_EkL_Y.getLineCount();
                List<edc> list = infoList$ui_text_release;
                arrayList.add(new ddc(bdcVarM29989Paragraph_EkL_Y, edcVar.getStartIndex(), edcVar.getEndIndex(), i3, lineCount, f, height));
                if (bdcVarM29989Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.f86643b && i4 != l82.getLastIndex(this.f86642a.getInfoList$ui_text_release()))) {
                    z2 = true;
                    i3 = lineCount;
                    f = height;
                    break;
                } else {
                    i4++;
                    i3 = lineCount;
                    f = height;
                    i2 = 0;
                    infoList$ui_text_release = list;
                }
            }
            z2 = false;
            this.f86646e = f;
            this.f86647f = i3;
            this.f86644c = z2;
            this.f86649h = arrayList;
            this.f86645d = ku2.m30763getMaxWidthimpl(j);
            List<rud> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ddc ddcVar = (ddc) arrayList.get(i5);
                List<rud> placeholderRects = ddcVar.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    rud rudVar = placeholderRects.get(i6);
                    arrayList3.add(rudVar != null ? ddcVar.toGlobal(rudVar) : null);
                }
                q82.addAll(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f86642a.getPlaceholders().size()) {
                int size4 = this.f86642a.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList4.add(null);
                }
                arrayList2 = v82.plus((Collection) arrayList2, (Iterable) arrayList4);
            }
            this.f86648g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public /* synthetic */ u2b(v2b v2bVar, long j, int i, boolean z, int i2, jt3 jt3Var) {
        this(v2bVar, j, (i2 & 4) != 0 ? Integer.MAX_VALUE : i, (i2 & 8) != 0 ? false : z, null);
    }

    public /* synthetic */ u2b(v2b v2bVar, int i, boolean z, float f, int i2, jt3 jt3Var) {
        this(v2bVar, (i2 & 2) != 0 ? Integer.MAX_VALUE : i, (i2 & 4) != 0 ? false : z, f);
    }

    @q64(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @i2e(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public u2b(@yfb v2b v2bVar, int i, boolean z, float f) {
        this(v2bVar, nu2.Constraints$default(0, hdc.ceilToInt(f), 0, 0, 13, null), i, z, null);
    }

    public /* synthetic */ u2b(C9041lz c9041lz, yvg yvgVar, List list, int i, boolean z, float f, c64 c64Var, xn6.InterfaceC15211b interfaceC15211b, int i2, jt3 jt3Var) {
        this(c9041lz, yvgVar, (List<C9041lz.c<ewc>>) ((i2 & 4) != 0 ? l82.emptyList() : list), (i2 & 8) != 0 ? Integer.MAX_VALUE : i, (i2 & 16) != 0 ? false : z, f, c64Var, interfaceC15211b);
    }

    @q64(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @i2e(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public u2b(@yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb List<C9041lz.c<ewc>> list, int i, boolean z, float f, @yfb c64 c64Var, @yfb xn6.InterfaceC15211b interfaceC15211b) {
        this(new v2b(c9041lz, yvgVar, list, c64Var, c44.createFontFamilyResolver(interfaceC15211b)), nu2.Constraints$default(0, hdc.ceilToInt(f), 0, 0, 13, null), i, z, null);
    }

    public /* synthetic */ u2b(C9041lz c9041lz, yvg yvgVar, float f, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List list, int i, boolean z, int i2, jt3 jt3Var) {
        this(c9041lz, yvgVar, f, c64Var, interfaceC4891b, (List<C9041lz.c<ewc>>) ((i2 & 32) != 0 ? l82.emptyList() : list), (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z);
    }

    @q64(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @i2e(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public u2b(@yfb C9041lz c9041lz, @yfb yvg yvgVar, float f, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb List<C9041lz.c<ewc>> list, int i, boolean z) {
        this(new v2b(c9041lz, yvgVar, list, c64Var, interfaceC4891b), nu2.Constraints$default(0, hdc.ceilToInt(f), 0, 0, 13, null), i, z, null);
    }

    public /* synthetic */ u2b(C9041lz c9041lz, yvg yvgVar, long j, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List list, int i, boolean z, int i2, jt3 jt3Var) {
        this(c9041lz, yvgVar, j, c64Var, interfaceC4891b, (i2 & 32) != 0 ? l82.emptyList() : list, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? false : z, null);
    }

    private u2b(C9041lz c9041lz, yvg yvgVar, long j, c64 c64Var, do6.InterfaceC4891b interfaceC4891b, List<C9041lz.c<ewc>> list, int i, boolean z) {
        this(new v2b(c9041lz, yvgVar, list, c64Var, interfaceC4891b), j, i, z, null);
    }
}
