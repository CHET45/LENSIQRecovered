package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.List;
import p000.p1d;

/* JADX INFO: renamed from: dq */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n38#2,5:436\n38#2,5:441\n33#3,6:446\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:436,5\n242#1:441,5\n319#1:446,6\n*E\n"})
@yjd
public final class C4905dq implements vq1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public Canvas f30352a = C5437eq.f33826a;

    /* JADX INFO: renamed from: b */
    @gib
    public Rect f30353b;

    /* JADX INFO: renamed from: c */
    @gib
    public Rect f30354c;

    private final void drawLines(List<izb> list, icc iccVar, int i) {
        if (list.size() >= 2) {
            Paint paintAsFrameworkPaint = iccVar.asFrameworkPaint();
            int i2 = 0;
            while (i2 < list.size() - 1) {
                long jM30439unboximpl = list.get(i2).m30439unboximpl();
                long jM30439unboximpl2 = list.get(i2 + 1).m30439unboximpl();
                this.f30352a.drawLine(izb.m30429getXimpl(jM30439unboximpl), izb.m30430getYimpl(jM30439unboximpl), izb.m30429getXimpl(jM30439unboximpl2), izb.m30430getYimpl(jM30439unboximpl2), paintAsFrameworkPaint);
                i2 += i;
            }
        }
    }

    private final void drawPoints(List<izb> list, icc iccVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long jM30439unboximpl = list.get(i).m30439unboximpl();
            this.f30352a.drawPoint(izb.m30429getXimpl(jM30439unboximpl), izb.m30430getYimpl(jM30439unboximpl), iccVar.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, icc iccVar, int i) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        Paint paintAsFrameworkPaint = iccVar.asFrameworkPaint();
        int i2 = 0;
        while (i2 < fArr.length - 3) {
            this.f30352a.drawLine(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], paintAsFrameworkPaint);
            i2 += i * 2;
        }
    }

    private final void drawRawPoints(float[] fArr, icc iccVar, int i) {
        if (fArr.length % 2 == 0) {
            Paint paintAsFrameworkPaint = iccVar.asFrameworkPaint();
            int i2 = 0;
            while (i2 < fArr.length - 1) {
                this.f30352a.drawPoint(fArr[i2], fArr[i2 + 1], paintAsFrameworkPaint);
                i2 += i;
            }
        }
    }

    @yjd
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo28666clipPathmtrdDE(@yfb vic vicVar, int i) {
        Canvas canvas = this.f30352a;
        if (!(vicVar instanceof C4947du)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C4947du) vicVar).getInternalPath(), m28676toRegionOp7u2Bmg(i));
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo28667clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.f30352a.clipRect(f, f2, f3, f4, m28676toRegionOp7u2Bmg(i));
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo28668concat58bKbWc(@yfb float[] fArr) {
        if (a4a.m27189isIdentity58bKbWc(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        C12773st.m32333setFromEL8BTi8(matrix, fArr);
        this.f30352a.concat(matrix);
    }

    @Override // p000.vq1
    public void disableZ() {
        ur1.f88828a.enableZ(this.f30352a, false);
    }

    @Override // p000.vq1
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @yfb icc iccVar) {
        this.f30352a.drawArc(f, f2, f3, f4, f5, f6, z, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo28669drawCircle9KIMszo(long j, float f, @yfb icc iccVar) {
        this.f30352a.drawCircle(izb.m30429getXimpl(j), izb.m30430getYimpl(j), f, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo28670drawImaged4ec7I(@yfb rs7 rs7Var, long j, @yfb icc iccVar) {
        this.f30352a.drawBitmap(C5460et.asAndroidBitmap(rs7Var), izb.m30429getXimpl(j), izb.m30430getYimpl(j), iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo28671drawImageRectHPBpro0(@yfb rs7 rs7Var, long j, long j2, long j3, long j4, @yfb icc iccVar) {
        if (this.f30353b == null) {
            this.f30353b = new Rect();
            this.f30354c = new Rect();
        }
        Canvas canvas = this.f30352a;
        Bitmap bitmapAsAndroidBitmap = C5460et.asAndroidBitmap(rs7Var);
        Rect rect = this.f30353b;
        md8.checkNotNull(rect);
        rect.left = a78.m27201getXimpl(j);
        rect.top = a78.m27202getYimpl(j);
        rect.right = a78.m27201getXimpl(j) + r78.m32087getWidthimpl(j2);
        rect.bottom = a78.m27202getYimpl(j) + r78.m32086getHeightimpl(j2);
        bth bthVar = bth.f14751a;
        Rect rect2 = this.f30354c;
        md8.checkNotNull(rect2);
        rect2.left = a78.m27201getXimpl(j3);
        rect2.top = a78.m27202getYimpl(j3);
        rect2.right = a78.m27201getXimpl(j3) + r78.m32087getWidthimpl(j4);
        rect2.bottom = a78.m27202getYimpl(j3) + r78.m32086getHeightimpl(j4);
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo28672drawLineWko1d7g(long j, long j2, @yfb icc iccVar) {
        this.f30352a.drawLine(izb.m30429getXimpl(j), izb.m30430getYimpl(j), izb.m30429getXimpl(j2), izb.m30430getYimpl(j2), iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    public void drawOval(float f, float f2, float f3, float f4, @yfb icc iccVar) {
        this.f30352a.drawOval(f, f2, f3, f4, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    public void drawPath(@yfb vic vicVar, @yfb icc iccVar) {
        Canvas canvas = this.f30352a;
        if (!(vicVar instanceof C4947du)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C4947du) vicVar).getInternalPath(), iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo28673drawPointsO7TthRY(int i, @yfb List<izb> list, @yfb icc iccVar) {
        p1d.C10752a c10752a = p1d.f69427b;
        if (p1d.m31709equalsimpl0(i, c10752a.m31713getLinesr_lszbg())) {
            drawLines(list, iccVar, 2);
        } else if (p1d.m31709equalsimpl0(i, c10752a.m31715getPolygonr_lszbg())) {
            drawLines(list, iccVar, 1);
        } else if (p1d.m31709equalsimpl0(i, c10752a.m31714getPointsr_lszbg())) {
            drawPoints(list, iccVar);
        }
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo28674drawRawPointsO7TthRY(int i, @yfb float[] fArr, @yfb icc iccVar) {
        if (fArr.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        p1d.C10752a c10752a = p1d.f69427b;
        if (p1d.m31709equalsimpl0(i, c10752a.m31713getLinesr_lszbg())) {
            drawRawLines(fArr, iccVar, 2);
        } else if (p1d.m31709equalsimpl0(i, c10752a.m31715getPolygonr_lszbg())) {
            drawRawLines(fArr, iccVar, 1);
        } else if (p1d.m31709equalsimpl0(i, c10752a.m31714getPointsr_lszbg())) {
            drawRawPoints(fArr, iccVar, 2);
        }
    }

    @Override // p000.vq1
    public void drawRect(float f, float f2, float f3, float f4, @yfb icc iccVar) {
        this.f30352a.drawRect(f, f2, f3, f4, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @yfb icc iccVar) {
        this.f30352a.drawRoundRect(f, f2, f3, f4, f5, f6, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo28675drawVerticesTPEHhCM(@yfb l5i l5iVar, int i, @yfb icc iccVar) {
        this.f30352a.drawVertices(C6000fw.m29671toAndroidVertexModeJOOmi9M(l5iVar.m30810getVertexModec2xauaI()), l5iVar.getPositions().length, l5iVar.getPositions(), 0, l5iVar.getTextureCoordinates(), 0, l5iVar.getColors(), 0, l5iVar.getIndices(), 0, l5iVar.getIndices().length, iccVar.asFrameworkPaint());
    }

    @Override // p000.vq1
    public void enableZ() {
        ur1.f88828a.enableZ(this.f30352a, true);
    }

    @yfb
    public final Canvas getInternalCanvas() {
        return this.f30352a;
    }

    @Override // p000.vq1
    public void restore() {
        this.f30352a.restore();
    }

    @Override // p000.vq1
    public void rotate(float f) {
        this.f30352a.rotate(f);
    }

    @Override // p000.vq1
    public void save() {
        this.f30352a.save();
    }

    @Override // p000.vq1
    public void saveLayer(@yfb rud rudVar, @yfb icc iccVar) {
        this.f30352a.saveLayer(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom(), iccVar.asFrameworkPaint(), 31);
    }

    @Override // p000.vq1
    public void scale(float f, float f2) {
        this.f30352a.scale(f, f2);
    }

    public final void setInternalCanvas(@yfb Canvas canvas) {
        this.f30352a = canvas;
    }

    @Override // p000.vq1
    public void skew(float f, float f2) {
        this.f30352a.skew(f, f2);
    }

    @yfb
    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m28676toRegionOp7u2Bmg(int i) {
        return x42.m33208equalsimpl0(i, x42.f96262b.m33212getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // p000.vq1
    public void translate(float f, float f2) {
        this.f30352a.translate(f, f2);
    }
}
