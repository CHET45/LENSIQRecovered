package p000;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import p000.qw9;

/* JADX INFO: loaded from: classes5.dex */
public class hv9 {

    /* JADX INFO: renamed from: a */
    public final Path f44944a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f44945b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f44946c = new Path();

    /* JADX INFO: renamed from: d */
    public final o8f f44947d = o8f.getInstance();

    /* JADX INFO: renamed from: e */
    public n8f f44948e;

    /* JADX INFO: renamed from: a */
    public void m12613a(Canvas canvas) {
        canvas.clipPath(this.f44944a);
    }

    /* JADX INFO: renamed from: b */
    public void m12614b(float f, n8f n8fVar, n8f n8fVar2, RectF rectF, RectF rectF2, RectF rectF3, qw9.C11731e c11731e) {
        n8f n8fVarM21278o = rfh.m21278o(n8fVar, n8fVar2, rectF, rectF3, c11731e.getStart(), c11731e.getEnd(), f);
        this.f44948e = n8fVarM21278o;
        this.f44947d.calculatePath(n8fVarM21278o, 1.0f, rectF2, this.f44945b);
        this.f44947d.calculatePath(this.f44948e, 1.0f, rectF3, this.f44946c);
        this.f44944a.op(this.f44945b, this.f44946c, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: c */
    public n8f m12615c() {
        return this.f44948e;
    }

    /* JADX INFO: renamed from: d */
    public Path m12616d() {
        return this.f44944a;
    }
}
