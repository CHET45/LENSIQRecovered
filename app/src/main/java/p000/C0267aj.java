package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: aj */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C0267aj implements gh3 {

    /* JADX INFO: renamed from: b */
    public final gh3 f1683b;

    /* JADX INFO: renamed from: c */
    public final byte[] f1684c;

    /* JADX INFO: renamed from: d */
    @hib
    public C2326cj f1685d;

    public C0267aj(byte[] bArr, gh3 gh3Var) {
        this.f1683b = gh3Var;
        this.f1684c = bArr;
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f1683b.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() throws IOException {
        this.f1685d = null;
        this.f1683b.close();
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return this.f1683b.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f1683b.getUri();
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        long jOpen = this.f1683b.open(xh3Var);
        this.f1685d = new C2326cj(2, this.f1684c, xh3Var.f97808i, xh3Var.f97806g + xh3Var.f97801b);
        return jOpen;
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f1683b.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        ((C2326cj) t0i.castNonNull(this.f1685d)).updateInPlace(bArr, i, i3);
        return i3;
    }
}
