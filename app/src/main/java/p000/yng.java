package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class yng implements ih3 {

    /* JADX INFO: renamed from: b */
    public final ih3 f102359b;

    /* JADX INFO: renamed from: c */
    public final fh3 f102360c;

    /* JADX INFO: renamed from: d */
    public boolean f102361d;

    /* JADX INFO: renamed from: e */
    public long f102362e;

    public yng(ih3 ih3Var, fh3 fh3Var) {
        this.f102359b = (ih3) u80.checkNotNull(ih3Var);
        this.f102360c = (fh3) u80.checkNotNull(fh3Var);
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f102359b.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        try {
            this.f102359b.close();
        } finally {
            if (this.f102361d) {
                this.f102361d = false;
                this.f102360c.close();
            }
        }
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return this.f102359b.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f102359b.getUri();
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        long jOpen = this.f102359b.open(yh3Var);
        this.f102362e = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (yh3Var.f101492h == -1 && jOpen != -1) {
            yh3Var = yh3Var.subrange(0L, jOpen);
        }
        this.f102361d = true;
        this.f102360c.open(yh3Var);
        return this.f102362e;
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f102362e == 0) {
            return -1;
        }
        int i3 = this.f102359b.read(bArr, i, i2);
        if (i3 > 0) {
            this.f102360c.write(bArr, i, i3);
            long j = this.f102362e;
            if (j != -1) {
                this.f102362e = j - ((long) i3);
            }
        }
        return i3;
    }
}
