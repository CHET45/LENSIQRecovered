package p000;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import p000.pw9;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public class gv9 {

    /* JADX INFO: renamed from: a */
    public final Path f41463a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f41464b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f41465c = new Path();

    /* JADX INFO: renamed from: d */
    public final o8f f41466d = o8f.getInstance();

    /* JADX INFO: renamed from: e */
    public n8f f41467e;

    /* JADX INFO: renamed from: a */
    public void m11996a(Canvas canvas) {
        canvas.clipPath(this.f41463a);
    }

    /* JADX INFO: renamed from: b */
    public void m11997b(float f, n8f n8fVar, n8f n8fVar2, RectF rectF, RectF rectF2, RectF rectF3, pw9.C11154f c11154f) {
        n8f n8fVarM20344o = qfh.m20344o(n8fVar, n8fVar2, rectF, rectF3, c11154f.getStart(), c11154f.getEnd(), f);
        this.f41467e = n8fVarM20344o;
        this.f41466d.calculatePath(n8fVarM20344o, 1.0f, rectF2, this.f41464b);
        this.f41466d.calculatePath(this.f41467e, 1.0f, rectF3, this.f41465c);
        this.f41463a.op(this.f41464b, this.f41465c, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: c */
    public n8f m11998c() {
        return this.f41467e;
    }

    /* JADX INFO: renamed from: d */
    public Path m11999d() {
        return this.f41463a;
    }
}
