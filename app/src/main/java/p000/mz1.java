package p000;

import java.util.Arrays;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mz1 implements gue {

    /* JADX INFO: renamed from: d */
    public final int f62830d;

    /* JADX INFO: renamed from: e */
    public final int[] f62831e;

    /* JADX INFO: renamed from: f */
    public final long[] f62832f;

    /* JADX INFO: renamed from: g */
    public final long[] f62833g;

    /* JADX INFO: renamed from: h */
    public final long[] f62834h;

    /* JADX INFO: renamed from: i */
    public final long f62835i;

    public mz1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f62831e = iArr;
        this.f62832f = jArr;
        this.f62833g = jArr2;
        this.f62834h = jArr3;
        int length = iArr.length;
        this.f62830d = length;
        if (length > 0) {
            this.f62835i = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f62835i = 0L;
        }
    }

    public int getChunkIndex(long j) {
        return t0i.binarySearchFloor(this.f62834h, j, true, true);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f62835i;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        int chunkIndex = getChunkIndex(j);
        lue lueVar = new lue(this.f62834h[chunkIndex], this.f62832f[chunkIndex]);
        if (lueVar.f58833a >= j || chunkIndex == this.f62830d - 1) {
            return new gue.C6548a(lueVar);
        }
        int i = chunkIndex + 1;
        return new gue.C6548a(lueVar, new lue(this.f62834h[i], this.f62832f[i]));
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f62830d + ", sizes=" + Arrays.toString(this.f62831e) + ", offsets=" + Arrays.toString(this.f62832f) + ", timeUs=" + Arrays.toString(this.f62834h) + ", durationsUs=" + Arrays.toString(this.f62833g) + c0b.f15434d;
    }
}
