package p000;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ch3 extends vq0 {

    /* JADX INFO: renamed from: j */
    public static final String f16520j = "data";

    /* JADX INFO: renamed from: f */
    @hib
    public yh3 f16521f;

    /* JADX INFO: renamed from: g */
    @hib
    public byte[] f16522g;

    /* JADX INFO: renamed from: h */
    public int f16523h;

    /* JADX INFO: renamed from: i */
    public int f16524i;

    public ch3() {
        super(false);
    }

    @Override // p000.ih3, p000.en7
    public void close() {
        if (this.f16522g != null) {
            this.f16522g = null;
            m24113c();
        }
        this.f16521f = null;
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        yh3 yh3Var = this.f16521f;
        if (yh3Var != null) {
            return yh3Var.f101485a;
        }
        return null;
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        m24114d(yh3Var);
        this.f16521f = yh3Var;
        Uri uriNormalizeScheme = yh3Var.f101485a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        u80.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = x0i.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw xhc.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(ki3.f54183c)) {
            try {
                this.f16522g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw xhc.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f16522g = x0i.getUtf8Bytes(URLDecoder.decode(str, yw1.f103174a.name()));
        }
        long j = yh3Var.f101491g;
        byte[] bArr = this.f16522g;
        if (j > bArr.length) {
            this.f16522g = null;
            throw new rh3(2008);
        }
        int i = (int) j;
        this.f16523h = i;
        int length = bArr.length - i;
        this.f16524i = length;
        long j2 = yh3Var.f101492h;
        if (j2 != -1) {
            this.f16524i = (int) Math.min(length, j2);
        }
        m24115e(yh3Var);
        long j3 = yh3Var.f101492h;
        return j3 != -1 ? j3 : this.f16524i;
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f16524i;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(x0i.castNonNull(this.f16522g), this.f16523h, bArr, i, iMin);
        this.f16523h += iMin;
        this.f16524i -= iMin;
        m24112b(iMin);
        return iMin;
    }
}
