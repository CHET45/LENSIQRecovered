package p000;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {

    /* JADX INFO: renamed from: a */
    public final b0c f106575a = new b0c();

    /* JADX INFO: renamed from: b */
    public final jhc f106576b = new jhc(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f106577c = -1;

    /* JADX INFO: renamed from: d */
    public int f106578d;

    /* JADX INFO: renamed from: e */
    public boolean f106579e;

    private int calculatePacketSize(int i) {
        int i2;
        int i3 = 0;
        this.f106578d = 0;
        do {
            int i4 = this.f106578d;
            int i5 = i + i4;
            b0c b0cVar = this.f106575a;
            if (i5 >= b0cVar.f12343g) {
                break;
            }
            int[] iArr = b0cVar.f12346j;
            this.f106578d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public b0c getPageHeader() {
        return this.f106575a;
    }

    public jhc getPayload() {
        return this.f106576b;
    }

    public boolean populate(ak5 ak5Var) throws IOException {
        int i;
        v80.checkState(ak5Var != null);
        if (this.f106579e) {
            this.f106579e = false;
            this.f106576b.reset(0);
        }
        while (!this.f106579e) {
            if (this.f106577c < 0) {
                if (!this.f106575a.skipToNextPage(ak5Var) || !this.f106575a.populate(ak5Var, true)) {
                    return false;
                }
                b0c b0cVar = this.f106575a;
                int iCalculatePacketSize = b0cVar.f12344h;
                if ((b0cVar.f12338b & 1) == 1 && this.f106576b.limit() == 0) {
                    iCalculatePacketSize += calculatePacketSize(0);
                    i = this.f106578d;
                } else {
                    i = 0;
                }
                if (!ek5.skipFullyQuietly(ak5Var, iCalculatePacketSize)) {
                    return false;
                }
                this.f106577c = i;
            }
            int iCalculatePacketSize2 = calculatePacketSize(this.f106577c);
            int i2 = this.f106577c + this.f106578d;
            if (iCalculatePacketSize2 > 0) {
                jhc jhcVar = this.f106576b;
                jhcVar.ensureCapacity(jhcVar.limit() + iCalculatePacketSize2);
                if (!ek5.readFullyQuietly(ak5Var, this.f106576b.getData(), this.f106576b.limit(), iCalculatePacketSize2)) {
                    return false;
                }
                jhc jhcVar2 = this.f106576b;
                jhcVar2.setLimit(jhcVar2.limit() + iCalculatePacketSize2);
                this.f106579e = this.f106575a.f12346j[i2 + (-1)] != 255;
            }
            if (i2 == this.f106575a.f12343g) {
                i2 = -1;
            }
            this.f106577c = i2;
        }
        return true;
    }

    public void reset() {
        this.f106575a.reset();
        this.f106576b.reset(0);
        this.f106577c = -1;
        this.f106579e = false;
    }

    public void trimPayload() {
        if (this.f106576b.getData().length == 65025) {
            return;
        }
        jhc jhcVar = this.f106576b;
        jhcVar.reset(Arrays.copyOf(jhcVar.getData(), Math.max(65025, this.f106576b.limit())), this.f106576b.limit());
    }
}
