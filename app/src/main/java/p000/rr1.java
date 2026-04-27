package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rr1 {
    @yfb
    public static final vq1 Canvas(@yfb rs7 rs7Var) {
        return C5437eq.ActualCanvas(rs7Var);
    }

    public static final void rotate(@yfb vq1 vq1Var, float f, float f2, float f3) {
        if (f == 0.0f) {
            return;
        }
        vq1Var.translate(f2, f3);
        vq1Var.rotate(f);
        vq1Var.translate(-f2, -f3);
    }

    public static final void rotateRad(@yfb vq1 vq1Var, float f, float f2, float f3) {
        rotate(vq1Var, n34.degrees(f), f2, f3);
    }

    public static /* synthetic */ void rotateRad$default(vq1 vq1Var, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        rotateRad(vq1Var, f, f2, f3);
    }

    public static final void scale(@yfb vq1 vq1Var, float f, float f2, float f3, float f4) {
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        vq1Var.translate(f3, f4);
        vq1Var.scale(f, f2);
        vq1Var.translate(-f3, -f4);
    }

    public static /* synthetic */ void scale$default(vq1 vq1Var, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        scale(vq1Var, f, f2, f3, f4);
    }

    public static final void withSave(@yfb vq1 vq1Var, @yfb ny6<bth> ny6Var) {
        try {
            vq1Var.save();
            ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            vq1Var.restore();
            o28.finallyEnd(1);
        }
    }

    public static final void withSaveLayer(@yfb vq1 vq1Var, @yfb rud rudVar, @yfb icc iccVar, @yfb ny6<bth> ny6Var) {
        try {
            vq1Var.saveLayer(rudVar, iccVar);
            ny6Var.invoke();
        } finally {
            o28.finallyStart(1);
            vq1Var.restore();
            o28.finallyEnd(1);
        }
    }
}
