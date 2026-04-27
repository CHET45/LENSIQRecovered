package p000;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class jjc extends hs8<PointF> {

    /* JADX INFO: renamed from: s */
    @hib
    public Path f50719s;

    /* JADX INFO: renamed from: t */
    public final hs8<PointF> f50720t;

    public jjc(bn9 bn9Var, hs8<PointF> hs8Var) {
        super(bn9Var, hs8Var.f44691b, hs8Var.f44692c, hs8Var.f44693d, hs8Var.f44694e, hs8Var.f44695f, hs8Var.f44696g, hs8Var.f44697h);
        this.f50720t = hs8Var;
        createPath();
    }

    @hib
    /* JADX INFO: renamed from: a */
    public Path m14135a() {
        return this.f50719s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void createPath() {
        T t;
        T t2;
        T t3 = this.f44692c;
        boolean z = (t3 == 0 || (t2 = this.f44691b) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.f44691b;
        if (t4 == 0 || (t = this.f44692c) == 0 || z) {
            return;
        }
        hs8<PointF> hs8Var = this.f50720t;
        this.f50719s = e1i.createPath((PointF) t4, (PointF) t, hs8Var.f44704o, hs8Var.f44705p);
    }
}
