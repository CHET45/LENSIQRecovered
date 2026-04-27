package p000;

import android.graphics.PointF;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageSwirlFilter;

/* JADX INFO: loaded from: classes7.dex */
public class mhg extends f27 {

    /* JADX INFO: renamed from: j */
    public static final int f61029j = 1;

    /* JADX INFO: renamed from: k */
    public static final String f61030k = "jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final float f61031g;

    /* JADX INFO: renamed from: h */
    public final float f61032h;

    /* JADX INFO: renamed from: i */
    public final PointF f61033i;

    public mhg() {
        this(0.5f, 1.0f, new PointF(0.5f, 0.5f));
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof mhg) {
            mhg mhgVar = (mhg) o;
            float f = mhgVar.f61031g;
            float f2 = this.f61031g;
            if (f == f2 && mhgVar.f61032h == f2) {
                PointF pointF = mhgVar.f61033i;
                PointF pointF2 = this.f61033i;
                if (pointF.equals(pointF2.x, pointF2.y)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return (-981084566) + ((int) (this.f61031g * 1000.0f)) + ((int) (this.f61032h * 10.0f)) + this.f61033i.hashCode();
    }

    @Override // p000.f27
    public String toString() {
        return "SwirlFilterTransformation(radius=" + this.f61031g + ",angle=" + this.f61032h + ",center=" + this.f61033i.toString() + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f61030k + this.f61031g + this.f61032h + this.f61033i.hashCode()).getBytes(eq8.f33838b));
    }

    public mhg(float radius, float angle, PointF center) {
        super(new GPUImageSwirlFilter());
        this.f61031g = radius;
        this.f61032h = angle;
        this.f61033i = center;
        GPUImageSwirlFilter gPUImageSwirlFilter = (GPUImageSwirlFilter) getFilter();
        gPUImageSwirlFilter.setRadius(radius);
        gPUImageSwirlFilter.setAngle(angle);
        gPUImageSwirlFilter.setCenter(center);
    }
}
