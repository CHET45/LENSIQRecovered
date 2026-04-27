package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: zi */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C16144zi implements ih3 {

    /* JADX INFO: renamed from: b */
    public final ih3 f105117b;

    /* JADX INFO: renamed from: c */
    public final byte[] f105118c;

    /* JADX INFO: renamed from: d */
    @hib
    public C1916bj f105119d;

    public C16144zi(byte[] bArr, ih3 ih3Var) {
        this.f105117b = ih3Var;
        this.f105118c = bArr;
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f105117b.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        this.f105119d = null;
        this.f105117b.close();
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return this.f105117b.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f105117b.getUri();
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        long jOpen = this.f105117b.open(yh3Var);
        this.f105119d = new C1916bj(2, this.f105118c, yh3Var.f101493i, yh3Var.f101491g + yh3Var.f101486b);
        return jOpen;
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f105117b.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        ((C1916bj) x0i.castNonNull(this.f105119d)).updateInPlace(bArr, i, i3);
        return i3;
    }
}
