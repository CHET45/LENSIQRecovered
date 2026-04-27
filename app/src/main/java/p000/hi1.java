package p000;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hi1 extends vq0 {

    /* JADX INFO: renamed from: f */
    public final byte[] f43682f;

    /* JADX INFO: renamed from: g */
    @hib
    public Uri f43683g;

    /* JADX INFO: renamed from: h */
    public int f43684h;

    /* JADX INFO: renamed from: i */
    public int f43685i;

    /* JADX INFO: renamed from: j */
    public boolean f43686j;

    public hi1(byte[] bArr) {
        super(false);
        u80.checkNotNull(bArr);
        u80.checkArgument(bArr.length > 0);
        this.f43682f = bArr;
    }

    @Override // p000.ih3, p000.en7
    public void close() {
        if (this.f43686j) {
            this.f43686j = false;
            m24113c();
        }
        this.f43683g = null;
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f43683g;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        this.f43683g = yh3Var.f101485a;
        m24114d(yh3Var);
        long j = yh3Var.f101491g;
        byte[] bArr = this.f43682f;
        if (j > bArr.length) {
            throw new rh3(2008);
        }
        this.f43684h = (int) j;
        int length = bArr.length - ((int) j);
        this.f43685i = length;
        long j2 = yh3Var.f101492h;
        if (j2 != -1) {
            this.f43685i = (int) Math.min(length, j2);
        }
        this.f43686j = true;
        m24115e(yh3Var);
        long j3 = yh3Var.f101492h;
        return j3 != -1 ? j3 : this.f43685i;
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f43685i;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.f43682f, this.f43684h, bArr, i, iMin);
        this.f43684h += iMin;
        this.f43685i -= iMin;
        m24112b(iMin);
        return iMin;
    }
}
