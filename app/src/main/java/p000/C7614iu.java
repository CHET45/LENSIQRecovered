package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: renamed from: iu */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n38#2,5:87\n38#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
public final class C7614iu implements ojc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final PathMeasure f48261a;

    /* JADX INFO: renamed from: b */
    @gib
    public float[] f48262b;

    /* JADX INFO: renamed from: c */
    @gib
    public float[] f48263c;

    public C7614iu(@yfb PathMeasure pathMeasure) {
        this.f48261a = pathMeasure;
    }

    @Override // p000.ojc
    public float getLength() {
        return this.f48261a.getLength();
    }

    @Override // p000.ojc
    /* JADX INFO: renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo30402getPositiontuRUvjQ(float f) {
        if (this.f48262b == null) {
            this.f48262b = new float[2];
        }
        if (this.f48263c == null) {
            this.f48263c = new float[2];
        }
        if (!this.f48261a.getPosTan(f, this.f48262b, this.f48263c)) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.f48262b;
        md8.checkNotNull(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.f48262b;
        md8.checkNotNull(fArr2);
        return mzb.Offset(f2, fArr2[1]);
    }

    @Override // p000.ojc
    public boolean getSegment(float f, float f2, @yfb vic vicVar, boolean z) {
        PathMeasure pathMeasure = this.f48261a;
        if (vicVar instanceof C4947du) {
            return pathMeasure.getSegment(f, f2, ((C4947du) vicVar).getInternalPath(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p000.ojc
    /* JADX INFO: renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo30403getTangenttuRUvjQ(float f) {
        if (this.f48262b == null) {
            this.f48262b = new float[2];
        }
        if (this.f48263c == null) {
            this.f48263c = new float[2];
        }
        if (!this.f48261a.getPosTan(f, this.f48262b, this.f48263c)) {
            return izb.f49009b.m30444getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.f48263c;
        md8.checkNotNull(fArr);
        float f2 = fArr[0];
        float[] fArr2 = this.f48263c;
        md8.checkNotNull(fArr2);
        return mzb.Offset(f2, fArr2[1]);
    }

    @Override // p000.ojc
    public void setPath(@gib vic vicVar, boolean z) {
        Path internalPath;
        PathMeasure pathMeasure = this.f48261a;
        if (vicVar == null) {
            internalPath = null;
        } else {
            if (!(vicVar instanceof C4947du)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((C4947du) vicVar).getInternalPath();
        }
        pathMeasure.setPath(internalPath, z);
    }
}
