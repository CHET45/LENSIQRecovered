package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class o8f {

    /* JADX INFO: renamed from: a */
    public final a9f[] f66718a = new a9f[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f66719b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f66720c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f66721d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f66722e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f66723f = new Path();

    /* JADX INFO: renamed from: g */
    public final a9f f66724g = new a9f();

    /* JADX INFO: renamed from: h */
    public final float[] f66725h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f66726i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f66727j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f66728k = new Path();

    /* JADX INFO: renamed from: l */
    public boolean f66729l = true;

    /* JADX INFO: renamed from: o8f$a */
    public static class C10228a {

        /* JADX INFO: renamed from: a */
        public static final o8f f66730a = new o8f();

        private C10228a() {
        }
    }

    /* JADX INFO: renamed from: o8f$b */
    @p7e({p7e.EnumC10826a.f69935b})
    public interface InterfaceC10229b {
        void onCornerPathCreated(a9f a9fVar, Matrix matrix, int i);

        void onEdgePathCreated(a9f a9fVar, Matrix matrix, int i);
    }

    /* JADX INFO: renamed from: o8f$c */
    public static final class C10230c {

        /* JADX INFO: renamed from: a */
        @efb
        public final n8f f66731a;

        /* JADX INFO: renamed from: b */
        @efb
        public final Path f66732b;

        /* JADX INFO: renamed from: c */
        @efb
        public final RectF f66733c;

        /* JADX INFO: renamed from: d */
        @hib
        public final InterfaceC10229b f66734d;

        /* JADX INFO: renamed from: e */
        public final float f66735e;

        public C10230c(@efb n8f n8fVar, float f, RectF rectF, @hib InterfaceC10229b interfaceC10229b, Path path) {
            this.f66734d = interfaceC10229b;
            this.f66731a = n8fVar;
            this.f66735e = f;
            this.f66733c = rectF;
            this.f66732b = path;
        }
    }

    public o8f() {
        for (int i = 0; i < 4; i++) {
            this.f66718a[i] = new a9f();
            this.f66719b[i] = new Matrix();
            this.f66720c[i] = new Matrix();
        }
    }

    private float angleOfEdge(int i) {
        return ((i + 1) % 4) * 90;
    }

    private void appendCornerPath(@efb C10230c c10230c, int i) {
        this.f66725h[0] = this.f66718a[i].m230e();
        this.f66725h[1] = this.f66718a[i].m231f();
        this.f66719b[i].mapPoints(this.f66725h);
        if (i == 0) {
            Path path = c10230c.f66732b;
            float[] fArr = this.f66725h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c10230c.f66732b;
            float[] fArr2 = this.f66725h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f66718a[i].applyToPath(this.f66719b[i], c10230c.f66732b);
        InterfaceC10229b interfaceC10229b = c10230c.f66734d;
        if (interfaceC10229b != null) {
            interfaceC10229b.onCornerPathCreated(this.f66718a[i], this.f66719b[i], i);
        }
    }

    private void appendEdgePath(@efb C10230c c10230c, int i) {
        int i2 = (i + 1) % 4;
        this.f66725h[0] = this.f66718a[i].m228c();
        this.f66725h[1] = this.f66718a[i].m229d();
        this.f66719b[i].mapPoints(this.f66725h);
        this.f66726i[0] = this.f66718a[i2].m230e();
        this.f66726i[1] = this.f66718a[i2].m231f();
        this.f66719b[i2].mapPoints(this.f66726i);
        float f = this.f66725h[0];
        float[] fArr = this.f66726i;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(c10230c.f66733c, i);
        this.f66724g.reset(0.0f, 0.0f);
        jw4 edgeTreatmentForIndex = getEdgeTreatmentForIndex(i, c10230c.f66731a);
        edgeTreatmentForIndex.getEdgePath(fMax, edgeCenterForIndex, c10230c.f66735e, this.f66724g);
        this.f66727j.reset();
        this.f66724g.applyToPath(this.f66720c[i], this.f66727j);
        if (this.f66729l && (edgeTreatmentForIndex.mo11188a() || pathOverlapsCorner(this.f66727j, i) || pathOverlapsCorner(this.f66727j, i2))) {
            Path path = this.f66727j;
            path.op(path, this.f66723f, Path.Op.DIFFERENCE);
            this.f66725h[0] = this.f66724g.m230e();
            this.f66725h[1] = this.f66724g.m231f();
            this.f66720c[i].mapPoints(this.f66725h);
            Path path2 = this.f66722e;
            float[] fArr2 = this.f66725h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f66724g.applyToPath(this.f66720c[i], this.f66722e);
        } else {
            this.f66724g.applyToPath(this.f66720c[i], c10230c.f66732b);
        }
        InterfaceC10229b interfaceC10229b = c10230c.f66734d;
        if (interfaceC10229b != null) {
            interfaceC10229b.onEdgePathCreated(this.f66724g, this.f66720c[i], i);
        }
    }

    private void getCoordinatesOfCorner(int i, @efb RectF rectF, @efb PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private x03 getCornerSizeForIndex(int i, @efb n8f n8fVar) {
        return i != 1 ? i != 2 ? i != 3 ? n8fVar.getTopRightCornerSize() : n8fVar.getTopLeftCornerSize() : n8fVar.getBottomLeftCornerSize() : n8fVar.getBottomRightCornerSize();
    }

    private a13 getCornerTreatmentForIndex(int i, @efb n8f n8fVar) {
        return i != 1 ? i != 2 ? i != 3 ? n8fVar.getTopRightCorner() : n8fVar.getTopLeftCorner() : n8fVar.getBottomLeftCorner() : n8fVar.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(@efb RectF rectF, int i) {
        float[] fArr = this.f66725h;
        a9f a9fVar = this.f66718a[i];
        fArr[0] = a9fVar.f735c;
        fArr[1] = a9fVar.f736d;
        this.f66719b[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.f66725h[0]) : Math.abs(rectF.centerY() - this.f66725h[1]);
    }

    private jw4 getEdgeTreatmentForIndex(int i, @efb n8f n8fVar) {
        return i != 1 ? i != 2 ? i != 3 ? n8fVar.getRightEdge() : n8fVar.getTopEdge() : n8fVar.getLeftEdge() : n8fVar.getBottomEdge();
    }

    @efb
    @erh
    @p7e({p7e.EnumC10826a.f69935b})
    public static o8f getInstance() {
        return C10228a.f66730a;
    }

    @c5e(19)
    private boolean pathOverlapsCorner(Path path, int i) {
        this.f66728k.reset();
        this.f66718a[i].applyToPath(this.f66719b[i], this.f66728k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f66728k.computeBounds(rectF, true);
        path.op(this.f66728k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void setCornerPathAndTransform(@efb C10230c c10230c, int i) {
        getCornerTreatmentForIndex(i, c10230c.f66731a).getCornerPath(this.f66718a[i], 90.0f, c10230c.f66735e, c10230c.f66733c, getCornerSizeForIndex(i, c10230c.f66731a));
        float fAngleOfEdge = angleOfEdge(i);
        this.f66719b[i].reset();
        getCoordinatesOfCorner(i, c10230c.f66733c, this.f66721d);
        Matrix matrix = this.f66719b[i];
        PointF pointF = this.f66721d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f66719b[i].preRotate(fAngleOfEdge);
    }

    private void setEdgePathAndTransform(int i) {
        this.f66725h[0] = this.f66718a[i].m228c();
        this.f66725h[1] = this.f66718a[i].m229d();
        this.f66719b[i].mapPoints(this.f66725h);
        float fAngleOfEdge = angleOfEdge(i);
        this.f66720c[i].reset();
        Matrix matrix = this.f66720c[i];
        float[] fArr = this.f66725h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f66720c[i].preRotate(fAngleOfEdge);
    }

    /* JADX INFO: renamed from: a */
    public void m18420a(boolean z) {
        this.f66729l = z;
    }

    public void calculatePath(n8f n8fVar, float f, RectF rectF, @efb Path path) {
        calculatePath(n8fVar, f, rectF, null, path);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void calculatePath(n8f n8fVar, float f, RectF rectF, InterfaceC10229b interfaceC10229b, @efb Path path) {
        path.rewind();
        this.f66722e.rewind();
        this.f66723f.rewind();
        this.f66723f.addRect(rectF, Path.Direction.CW);
        C10230c c10230c = new C10230c(n8fVar, f, rectF, interfaceC10229b, path);
        for (int i = 0; i < 4; i++) {
            setCornerPathAndTransform(c10230c, i);
            setEdgePathAndTransform(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            appendCornerPath(c10230c, i2);
            appendEdgePath(c10230c, i2);
        }
        path.close();
        this.f66722e.close();
        if (this.f66722e.isEmpty()) {
            return;
        }
        path.op(this.f66722e, Path.Op.UNION);
    }
}
