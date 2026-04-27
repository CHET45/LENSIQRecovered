package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i4g implements ih3 {

    /* JADX INFO: renamed from: b */
    public final ih3 f45745b;

    /* JADX INFO: renamed from: c */
    public long f45746c;

    /* JADX INFO: renamed from: d */
    public Uri f45747d = Uri.EMPTY;

    /* JADX INFO: renamed from: e */
    public Map<String, List<String>> f45748e = Collections.emptyMap();

    public i4g(ih3 ih3Var) {
        this.f45745b = (ih3) u80.checkNotNull(ih3Var);
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f45745b.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        this.f45745b.close();
    }

    public long getBytesRead() {
        return this.f45746c;
    }

    public Uri getLastOpenedUri() {
        return this.f45747d;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.f45748e;
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return this.f45745b.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f45745b.getUri();
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        this.f45747d = yh3Var.f101485a;
        this.f45748e = Collections.emptyMap();
        long jOpen = this.f45745b.open(yh3Var);
        this.f45747d = (Uri) u80.checkNotNull(getUri());
        this.f45748e = getResponseHeaders();
        return jOpen;
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f45745b.read(bArr, i, i2);
        if (i3 != -1) {
            this.f45746c += (long) i3;
        }
        return i3;
    }

    public void resetBytesRead() {
        this.f45746c = 0L;
    }
}
