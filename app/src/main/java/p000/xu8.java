package p000;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class xu8<T> {

    /* JADX INFO: renamed from: i */
    public static final int f99356i = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<T, Matrix, bth> f99357a;

    /* JADX INFO: renamed from: b */
    @gib
    public Matrix f99358b;

    /* JADX INFO: renamed from: c */
    @gib
    public Matrix f99359c;

    /* JADX INFO: renamed from: d */
    @gib
    public float[] f99360d;

    /* JADX INFO: renamed from: e */
    @gib
    public float[] f99361e;

    /* JADX INFO: renamed from: f */
    public boolean f99362f = true;

    /* JADX INFO: renamed from: g */
    public boolean f99363g = true;

    /* JADX INFO: renamed from: h */
    public boolean f99364h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public xu8(@yfb gz6<? super T, ? super Matrix, bth> gz6Var) {
        this.f99357a = gz6Var;
    }

    @gib
    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m33299calculateInverseMatrixbWbORWo(T t) {
        float[] fArrM33183constructorimpl$default = this.f99361e;
        if (fArrM33183constructorimpl$default == null) {
            fArrM33183constructorimpl$default = x3a.m33183constructorimpl$default(null, 1, null);
            this.f99361e = fArrM33183constructorimpl$default;
        }
        if (this.f99363g) {
            this.f99364h = re8.m32116invertToJiSxe2E(m33300calculateMatrixGrdbGEg(t), fArrM33183constructorimpl$default);
            this.f99363g = false;
        }
        if (this.f99364h) {
            return fArrM33183constructorimpl$default;
        }
        return null;
    }

    @yfb
    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m33300calculateMatrixGrdbGEg(T t) {
        float[] fArrM33183constructorimpl$default = this.f99360d;
        if (fArrM33183constructorimpl$default == null) {
            fArrM33183constructorimpl$default = x3a.m33183constructorimpl$default(null, 1, null);
            this.f99360d = fArrM33183constructorimpl$default;
        }
        if (!this.f99362f) {
            return fArrM33183constructorimpl$default;
        }
        Matrix matrix = this.f99358b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f99358b = matrix;
        }
        this.f99357a.invoke(t, matrix);
        Matrix matrix2 = this.f99359c;
        if (matrix2 == null || !md8.areEqual(matrix, matrix2)) {
            C12773st.m32334setFromtUYjHk(fArrM33183constructorimpl$default, matrix);
            this.f99358b = matrix2;
            this.f99359c = matrix;
        }
        this.f99362f = false;
        return fArrM33183constructorimpl$default;
    }

    public final void invalidate() {
        this.f99362f = true;
        this.f99363g = true;
    }
}
