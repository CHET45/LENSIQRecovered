package p000;

import android.graphics.PointF;
import java.security.MessageDigest;
import java.util.Arrays;
import jp.co.cyberagent.android.gpuimage.filter.GPUImageVignetteFilter;

/* JADX INFO: loaded from: classes7.dex */
public class zci extends f27 {

    /* JADX INFO: renamed from: k */
    public static final int f104809k = 1;

    /* JADX INFO: renamed from: l */
    public static final String f104810l = "jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation.1";

    /* JADX INFO: renamed from: g */
    public final PointF f104811g;

    /* JADX INFO: renamed from: h */
    public final float[] f104812h;

    /* JADX INFO: renamed from: i */
    public final float f104813i;

    /* JADX INFO: renamed from: j */
    public final float f104814j;

    public zci() {
        this(new PointF(0.5f, 0.5f), new float[]{0.0f, 0.0f, 0.0f}, 0.0f, 0.75f);
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof zci) {
            zci zciVar = (zci) o;
            PointF pointF = zciVar.f104811g;
            PointF pointF2 = this.f104811g;
            if (pointF.equals(pointF2.x, pointF2.y) && Arrays.equals(zciVar.f104812h, this.f104812h) && zciVar.f104813i == this.f104813i && zciVar.f104814j == this.f104814j) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public int hashCode() {
        return 1874002103 + this.f104811g.hashCode() + Arrays.hashCode(this.f104812h) + ((int) (this.f104813i * 100.0f)) + ((int) (this.f104814j * 10.0f));
    }

    @Override // p000.f27
    public String toString() {
        return "VignetteFilterTransformation(center=" + this.f104811g.toString() + ",color=" + Arrays.toString(this.f104812h) + ",start=" + this.f104813i + ",end=" + this.f104814j + c0b.f15434d;
    }

    @Override // p000.f27, p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f104810l + this.f104811g + Arrays.hashCode(this.f104812h) + this.f104813i + this.f104814j).getBytes(eq8.f33838b));
    }

    public zci(PointF center, float[] color, float start, float end) {
        super(new GPUImageVignetteFilter());
        this.f104811g = center;
        this.f104812h = color;
        this.f104813i = start;
        this.f104814j = end;
        GPUImageVignetteFilter gPUImageVignetteFilter = (GPUImageVignetteFilter) getFilter();
        gPUImageVignetteFilter.setVignetteCenter(center);
        gPUImageVignetteFilter.setVignetteColor(color);
        gPUImageVignetteFilter.setVignetteStart(start);
        gPUImageVignetteFilter.setVignetteEnd(end);
    }
}
