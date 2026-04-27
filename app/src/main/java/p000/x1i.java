package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x1i implements nzb {

    /* JADX INFO: renamed from: b */
    @yfb
    public final nzb f96042b;

    /* JADX INFO: renamed from: c */
    public final int f96043c;

    /* JADX INFO: renamed from: d */
    public final int f96044d;

    public x1i(@yfb nzb nzbVar, int i, int i2) {
        this.f96042b = nzbVar;
        this.f96043c = i;
        this.f96044d = i2;
    }

    @Override // p000.nzb
    public int originalToTransformed(int i) {
        int iOriginalToTransformed = this.f96042b.originalToTransformed(i);
        if (i >= 0 && i <= this.f96043c) {
            y1i.validateOriginalToTransformed(iOriginalToTransformed, this.f96044d, i);
        }
        return iOriginalToTransformed;
    }

    @Override // p000.nzb
    public int transformedToOriginal(int i) {
        int iTransformedToOriginal = this.f96042b.transformedToOriginal(i);
        if (i >= 0 && i <= this.f96044d) {
            y1i.validateTransformedToOriginal(iTransformedToOriginal, this.f96043c, i);
        }
        return iTransformedToOriginal;
    }
}
