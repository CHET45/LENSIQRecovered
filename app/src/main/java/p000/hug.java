package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class hug {

    /* JADX INFO: renamed from: g */
    public static final int f44911g = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final gug f44912a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u2b f44913b;

    /* JADX INFO: renamed from: c */
    public final long f44914c;

    /* JADX INFO: renamed from: d */
    public final float f44915d;

    /* JADX INFO: renamed from: e */
    public final float f44916e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final List<rud> f44917f;

    public /* synthetic */ hug(gug gugVar, u2b u2bVar, long j, jt3 jt3Var) {
        this(gugVar, u2bVar, j);
    }

    /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ hug m30127copyO0kMr_c$default(hug hugVar, gug gugVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            gugVar = hugVar.f44912a;
        }
        if ((i & 2) != 0) {
            j = hugVar.f44914c;
        }
        return hugVar.m30128copyO0kMr_c(gugVar, j);
    }

    public static /* synthetic */ int getLineEnd$default(hug hugVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return hugVar.getLineEnd(i, z);
    }

    @yfb
    /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
    public final hug m30128copyO0kMr_c(@yfb gug gugVar, long j) {
        return new hug(gugVar, this.f44913b, j, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hug)) {
            return false;
        }
        hug hugVar = (hug) obj;
        return md8.areEqual(this.f44912a, hugVar.f44912a) && md8.areEqual(this.f44913b, hugVar.f44913b) && r78.m32085equalsimpl0(this.f44914c, hugVar.f44914c) && this.f44915d == hugVar.f44915d && this.f44916e == hugVar.f44916e && md8.areEqual(this.f44917f, hugVar.f44917f);
    }

    @yfb
    public final q5e getBidiRunDirection(int i) {
        return this.f44913b.getBidiRunDirection(i);
    }

    @yfb
    public final rud getBoundingBox(int i) {
        return this.f44913b.getBoundingBox(i);
    }

    @yfb
    public final rud getCursorRect(int i) {
        return this.f44913b.getCursorRect(i);
    }

    public final boolean getDidOverflowHeight() {
        return this.f44913b.getDidExceedMaxLines() || ((float) r78.m32086getHeightimpl(this.f44914c)) < this.f44913b.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) r78.m32087getWidthimpl(this.f44914c)) < this.f44913b.getWidth();
    }

    public final float getFirstBaseline() {
        return this.f44915d;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i, boolean z) {
        return this.f44913b.getHorizontalPosition(i, z);
    }

    public final float getLastBaseline() {
        return this.f44916e;
    }

    @yfb
    public final gug getLayoutInput() {
        return this.f44912a;
    }

    public final float getLineBaseline(int i) {
        return this.f44913b.getLineBaseline(i);
    }

    public final float getLineBottom(int i) {
        return this.f44913b.getLineBottom(i);
    }

    public final int getLineCount() {
        return this.f44913b.getLineCount();
    }

    public final int getLineEnd(int i, boolean z) {
        return this.f44913b.getLineEnd(i, z);
    }

    public final int getLineForOffset(int i) {
        return this.f44913b.getLineForOffset(i);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.f44913b.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int i) {
        return this.f44913b.getLineLeft(i);
    }

    public final float getLineRight(int i) {
        return this.f44913b.getLineRight(i);
    }

    public final int getLineStart(int i) {
        return this.f44913b.getLineStart(i);
    }

    public final float getLineTop(int i) {
        return this.f44913b.getLineTop(i);
    }

    @yfb
    public final u2b getMultiParagraph() {
        return this.f44913b;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m30129getOffsetForPositionk4lQ0M(long j) {
        return this.f44913b.m32532getOffsetForPositionk4lQ0M(j);
    }

    @yfb
    public final q5e getParagraphDirection(int i) {
        return this.f44913b.getParagraphDirection(i);
    }

    @yfb
    public final vic getPathForRange(int i, int i2) {
        return this.f44913b.getPathForRange(i, i2);
    }

    @yfb
    public final List<rud> getPlaceholderRects() {
        return this.f44917f;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m30130getSizeYbymL2g() {
        return this.f44914c;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m30131getWordBoundaryjx7JFs(int i) {
        return this.f44913b.m32534getWordBoundaryjx7JFs(i);
    }

    public int hashCode() {
        return (((((((((this.f44912a.hashCode() * 31) + this.f44913b.hashCode()) * 31) + r78.m32088hashCodeimpl(this.f44914c)) * 31) + Float.hashCode(this.f44915d)) * 31) + Float.hashCode(this.f44916e)) * 31) + this.f44917f.hashCode();
    }

    public final boolean isLineEllipsized(int i) {
        return this.f44913b.isLineEllipsized(i);
    }

    @yfb
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f44912a + ", multiParagraph=" + this.f44913b + ", size=" + ((Object) r78.m32090toStringimpl(this.f44914c)) + ", firstBaseline=" + this.f44915d + ", lastBaseline=" + this.f44916e + ", placeholderRects=" + this.f44917f + ')';
    }

    private hug(gug gugVar, u2b u2bVar, long j) {
        this.f44912a = gugVar;
        this.f44913b = u2bVar;
        this.f44914c = j;
        this.f44915d = u2bVar.getFirstBaseline();
        this.f44916e = u2bVar.getLastBaseline();
        this.f44917f = u2bVar.getPlaceholderRects();
    }
}
