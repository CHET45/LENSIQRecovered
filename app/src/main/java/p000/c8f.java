package p000;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class c8f {
    public static final void transform(@yfb Shader shader, @yfb qy6<? super Matrix, bth> qy6Var) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        qy6Var.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
