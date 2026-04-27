package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface bdc {

    /* JADX INFO: renamed from: bdc$a */
    public static final class C1842a {
    }

    static /* synthetic */ int getLineEnd$default(bdc bdcVar, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return bdcVar.getLineEnd(i, z);
    }

    /* JADX INFO: renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m27979paintLG529CI$default(bdc bdcVar, vq1 vq1Var, long j, e8f e8fVar, qqg qqgVar, rp4 rp4Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        bdcVar.mo27986paintLG529CI(vq1Var, (i2 & 2) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i2 & 4) != 0 ? null : e8fVar, (i2 & 8) != 0 ? null : qqgVar, (i2 & 16) == 0 ? rp4Var : null, (i2 & 32) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : i);
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m27980paintRPmYEkk$default(bdc bdcVar, vq1 vq1Var, long j, e8f e8fVar, qqg qqgVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i & 2) != 0) {
            j = w82.f93556b.m32987getUnspecified0d7_KjU();
        }
        bdcVar.mo27987paintRPmYEkk(vq1Var, j, (i & 4) != 0 ? null : e8fVar, (i & 8) != 0 ? null : qqgVar);
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m27981painthn5TExg$default(bdc bdcVar, vq1 vq1Var, he1 he1Var, float f, e8f e8fVar, qqg qqgVar, rp4 rp4Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        bdcVar.mo27988painthn5TExg(vq1Var, he1Var, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : e8fVar, (i2 & 16) != 0 ? null : qqgVar, (i2 & 32) != 0 ? null : rp4Var, (i2 & 64) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : i);
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    void mo27982fillBoundingBoxes8ffj60Q(long j, @yfb float[] fArr, @h78(from = 0) int i);

    @yfb
    q5e getBidiRunDirection(int i);

    @yfb
    rud getBoundingBox(int i);

    @yfb
    rud getCursorRect(int i);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i, boolean z);

    float getLastBaseline();

    float getLineBaseline(int i);

    float getLineBottom(int i);

    int getLineCount();

    int getLineEnd(int i, boolean z);

    int getLineForOffset(int i);

    int getLineForVerticalPosition(float f);

    float getLineHeight(int i);

    float getLineLeft(int i);

    float getLineRight(int i);

    int getLineStart(int i);

    float getLineTop(int i);

    float getLineWidth(int i);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    int mo27983getOffsetForPositionk4lQ0M(long j);

    @yfb
    q5e getParagraphDirection(int i);

    @yfb
    vic getPathForRange(int i, int i2);

    @yfb
    List<rud> getPlaceholderRects();

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    long mo27984getRangeForRect86BmAI(@yfb rud rudVar, int i, @yfb mtg mtgVar);

    float getWidth();

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    long mo27985getWordBoundaryjx7JFs(int i);

    boolean isLineEllipsized(int i);

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    void mo27986paintLG529CI(@yfb vq1 vq1Var, long j, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i);

    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    void mo27987paintRPmYEkk(@yfb vq1 vq1Var, long j, @gib e8f e8fVar, @gib qqg qqgVar);

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    void mo27988painthn5TExg(@yfb vq1 vq1Var, @yfb he1 he1Var, float f, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i);
}
