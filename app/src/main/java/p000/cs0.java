package p000;

import p000.hz1;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cs0 implements hz1.InterfaceC7086b {

    /* JADX INFO: renamed from: c */
    public static final String f27179c = "BaseMediaChunkOutput";

    /* JADX INFO: renamed from: a */
    public final int[] f27180a;

    /* JADX INFO: renamed from: b */
    public final kle[] f27181b;

    public cs0(int[] iArr, kle[] kleVarArr) {
        this.f27180a = iArr;
        this.f27181b = kleVarArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.f27181b.length];
        int i = 0;
        while (true) {
            kle[] kleVarArr = this.f27181b;
            if (i >= kleVarArr.length) {
                return iArr;
            }
            iArr[i] = kleVarArr[i].getWriteIndex();
            i++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (kle kleVar : this.f27181b) {
            kleVar.setSampleOffsetUs(j);
        }
    }

    @Override // p000.hz1.InterfaceC7086b
    public q6h track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f27180a;
            if (i3 >= iArr.length) {
                xh9.m25144e("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new yd4();
            }
            if (i2 == iArr[i3]) {
                return this.f27181b[i3];
            }
            i3++;
        }
    }
}
