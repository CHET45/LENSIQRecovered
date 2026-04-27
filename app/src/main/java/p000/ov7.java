package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public class ov7 extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a */
    public final Matrix f68935a;

    public ov7() {
        super(Matrix.class, "imageMatrixProperty");
        this.f68935a = new Matrix();
    }

    @Override // android.util.Property
    @efb
    public Matrix get(@efb ImageView imageView) {
        this.f68935a.set(imageView.getImageMatrix());
        return this.f68935a;
    }

    @Override // android.util.Property
    public void set(@efb ImageView imageView, @efb Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
