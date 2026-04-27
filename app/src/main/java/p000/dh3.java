package p000;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class dh3 extends wq0 {

    /* JADX INFO: renamed from: j */
    public static final String f29630j = "data";

    /* JADX INFO: renamed from: f */
    @hib
    public xh3 f29631f;

    /* JADX INFO: renamed from: g */
    @hib
    public byte[] f29632g;

    /* JADX INFO: renamed from: h */
    public int f29633h;

    /* JADX INFO: renamed from: i */
    public int f29634i;

    public dh3() {
        super(false);
    }

    @Override // p000.gh3
    public void close() {
        if (this.f29632g != null) {
            this.f29632g = null;
            m24715c();
        }
        this.f29631f = null;
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        xh3 xh3Var = this.f29631f;
        if (xh3Var != null) {
            return xh3Var.f97800a;
        }
        return null;
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        m24716d(xh3Var);
        this.f29631f = xh3Var;
        Uri uriNormalizeScheme = xh3Var.f97800a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        v80.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = t0i.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw yhc.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(ki3.f54183c)) {
            try {
                this.f29632g = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw yhc.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f29632g = t0i.getUtf8Bytes(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j = xh3Var.f97806g;
        byte[] bArr = this.f29632g;
        if (j > bArr.length) {
            this.f29632g = null;
            throw new sh3(2008);
        }
        int i = (int) j;
        this.f29633h = i;
        int length = bArr.length - i;
        this.f29634i = length;
        long j2 = xh3Var.f97807h;
        if (j2 != -1) {
            this.f29634i = (int) Math.min(length, j2);
        }
        m24717e(xh3Var);
        long j3 = xh3Var.f97807h;
        return j3 != -1 ? j3 : this.f29634i;
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f29634i;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(t0i.castNonNull(this.f29632g), this.f29633h, bArr, i, iMin);
        this.f29633h += iMin;
        this.f29634i -= iMin;
        m24714b(iMin);
        return iMin;
    }
}
