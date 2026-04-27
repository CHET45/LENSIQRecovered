package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class j4g implements gh3 {

    /* JADX INFO: renamed from: b */
    public final gh3 f49524b;

    /* JADX INFO: renamed from: c */
    public long f49525c;

    /* JADX INFO: renamed from: d */
    public Uri f49526d = Uri.EMPTY;

    /* JADX INFO: renamed from: e */
    public Map<String, List<String>> f49527e = Collections.emptyMap();

    public j4g(gh3 gh3Var) {
        this.f49524b = (gh3) v80.checkNotNull(gh3Var);
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f49524b.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() throws IOException {
        this.f49524b.close();
    }

    public long getBytesRead() {
        return this.f49525c;
    }

    public Uri getLastOpenedUri() {
        return this.f49526d;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.f49527e;
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return this.f49524b.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f49524b.getUri();
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        this.f49526d = xh3Var.f97800a;
        this.f49527e = Collections.emptyMap();
        try {
            return this.f49524b.open(xh3Var);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f49526d = uri;
            }
            this.f49527e = getResponseHeaders();
        }
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f49524b.read(bArr, i, i2);
        if (i3 != -1) {
            this.f49525c += (long) i3;
        }
        return i3;
    }

    public void resetBytesRead() {
        this.f49525c = 0L;
    }
}
