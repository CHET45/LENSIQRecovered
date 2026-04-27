package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class zng implements gh3 {

    /* JADX INFO: renamed from: b */
    public final gh3 f105566b;

    /* JADX INFO: renamed from: c */
    public final eh3 f105567c;

    /* JADX INFO: renamed from: d */
    public boolean f105568d;

    /* JADX INFO: renamed from: e */
    public long f105569e;

    public zng(gh3 gh3Var, eh3 eh3Var) {
        this.f105566b = (gh3) v80.checkNotNull(gh3Var);
        this.f105567c = (eh3) v80.checkNotNull(eh3Var);
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f105566b.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() throws IOException {
        try {
            this.f105566b.close();
        } finally {
            if (this.f105568d) {
                this.f105568d = false;
                this.f105567c.close();
            }
        }
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return this.f105566b.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f105566b.getUri();
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        long jOpen = this.f105566b.open(xh3Var);
        this.f105569e = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (xh3Var.f97807h == -1 && jOpen != -1) {
            xh3Var = xh3Var.subrange(0L, jOpen);
        }
        this.f105568d = true;
        this.f105567c.open(xh3Var);
        return this.f105569e;
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f105569e == 0) {
            return -1;
        }
        int i3 = this.f105566b.read(bArr, i, i2);
        if (i3 > 0) {
            this.f105567c.write(bArr, i, i3);
            long j = this.f105569e;
            if (j != -1) {
                this.f105569e = j - ((long) i3);
            }
        }
        return i3;
    }
}
