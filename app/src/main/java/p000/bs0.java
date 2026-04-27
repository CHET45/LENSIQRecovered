package p000;

import p000.iz1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class bs0 implements iz1.InterfaceC7669b {

    /* JADX INFO: renamed from: c */
    public static final String f14637c = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: a */
    public final int[] f14638a;

    /* JADX INFO: renamed from: b */
    public final lle[] f14639b;

    public bs0(int[] iArr, lle[] lleVarArr) {
        this.f14638a = iArr;
        this.f14639b = lleVarArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.f14639b.length];
        int i = 0;
        while (true) {
            lle[] lleVarArr = this.f14639b;
            if (i >= lleVarArr.length) {
                return iArr;
            }
            iArr[i] = lleVarArr[i].getWriteIndex();
            i++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (lle lleVar : this.f14639b) {
            lleVar.setSampleOffsetUs(j);
        }
    }

    @Override // p000.iz1.InterfaceC7669b
    public r6h track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f14638a;
            if (i3 >= iArr.length) {
                yh9.m25915e("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new ts4();
            }
            if (i2 == iArr[i3]) {
                return this.f14639b[i3];
            }
            i3++;
        }
    }
}
