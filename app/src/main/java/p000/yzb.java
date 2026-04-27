package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yzb {

    /* JADX INFO: renamed from: a */
    public final a0c f103534a = new a0c();

    /* JADX INFO: renamed from: b */
    public final ihc f103535b = new ihc(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f103536c = -1;

    /* JADX INFO: renamed from: d */
    public int f103537d;

    /* JADX INFO: renamed from: e */
    public boolean f103538e;

    private int calculatePacketSize(int i) {
        int i2;
        int i3 = 0;
        this.f103537d = 0;
        do {
            int i4 = this.f103537d;
            int i5 = i + i4;
            a0c a0cVar = this.f103534a;
            if (i5 >= a0cVar.f37g) {
                break;
            }
            int[] iArr = a0cVar.f40j;
            this.f103537d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public a0c getPageHeader() {
        return this.f103534a;
    }

    public ihc getPayload() {
        return this.f103535b;
    }

    public boolean populate(zj5 zj5Var) throws IOException {
        int i;
        u80.checkState(zj5Var != null);
        if (this.f103538e) {
            this.f103538e = false;
            this.f103535b.reset(0);
        }
        while (!this.f103538e) {
            if (this.f103536c < 0) {
                if (!this.f103534a.skipToNextPage(zj5Var) || !this.f103534a.populate(zj5Var, true)) {
                    return false;
                }
                a0c a0cVar = this.f103534a;
                int iCalculatePacketSize = a0cVar.f38h;
                if ((a0cVar.f32b & 1) == 1 && this.f103535b.limit() == 0) {
                    iCalculatePacketSize += calculatePacketSize(0);
                    i = this.f103537d;
                } else {
                    i = 0;
                }
                if (!dk5.skipFullyQuietly(zj5Var, iCalculatePacketSize)) {
                    return false;
                }
                this.f103536c = i;
            }
            int iCalculatePacketSize2 = calculatePacketSize(this.f103536c);
            int i2 = this.f103536c + this.f103537d;
            if (iCalculatePacketSize2 > 0) {
                ihc ihcVar = this.f103535b;
                ihcVar.ensureCapacity(ihcVar.limit() + iCalculatePacketSize2);
                if (!dk5.readFullyQuietly(zj5Var, this.f103535b.getData(), this.f103535b.limit(), iCalculatePacketSize2)) {
                    return false;
                }
                ihc ihcVar2 = this.f103535b;
                ihcVar2.setLimit(ihcVar2.limit() + iCalculatePacketSize2);
                this.f103538e = this.f103534a.f40j[i2 + (-1)] != 255;
            }
            if (i2 == this.f103534a.f37g) {
                i2 = -1;
            }
            this.f103536c = i2;
        }
        return true;
    }

    public void reset() {
        this.f103534a.reset();
        this.f103535b.reset(0);
        this.f103536c = -1;
        this.f103538e = false;
    }

    public void trimPayload() {
        if (this.f103535b.getData().length == 65025) {
            return;
        }
        ihc ihcVar = this.f103535b;
        ihcVar.reset(Arrays.copyOf(ihcVar.getData(), Math.max(65025, this.f103535b.limit())), this.f103535b.limit());
    }
}
