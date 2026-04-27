package p000;

import java.util.Arrays;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lz1 implements hue {

    /* JADX INFO: renamed from: d */
    public final int f59299d;

    /* JADX INFO: renamed from: e */
    public final int[] f59300e;

    /* JADX INFO: renamed from: f */
    public final long[] f59301f;

    /* JADX INFO: renamed from: g */
    public final long[] f59302g;

    /* JADX INFO: renamed from: h */
    public final long[] f59303h;

    /* JADX INFO: renamed from: i */
    public final long f59304i;

    public lz1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f59300e = iArr;
        this.f59301f = jArr;
        this.f59302g = jArr2;
        this.f59303h = jArr3;
        int length = iArr.length;
        this.f59299d = length;
        if (length > 0) {
            this.f59304i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f59304i = 0L;
        }
    }

    public int getChunkIndex(long j) {
        return x0i.binarySearchFloor(this.f59303h, j, true, true);
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f59304i;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        int chunkIndex = getChunkIndex(j);
        kue kueVar = new kue(this.f59303h[chunkIndex], this.f59301f[chunkIndex]);
        if (kueVar.f55384a >= j || chunkIndex == this.f59299d - 1) {
            return new hue.C7023a(kueVar);
        }
        int i = chunkIndex + 1;
        return new hue.C7023a(kueVar, new kue(this.f59303h[i], this.f59301f[i]));
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f59299d + ", sizes=" + Arrays.toString(this.f59300e) + ", offsets=" + Arrays.toString(this.f59301f) + ", timeUs=" + Arrays.toString(this.f59303h) + ", durationsUs=" + Arrays.toString(this.f59302g) + c0b.f15434d;
    }
}
