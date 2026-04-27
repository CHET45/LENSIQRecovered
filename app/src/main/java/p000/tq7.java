package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tq7 implements ih3 {

    /* JADX INFO: renamed from: b */
    public final ih3 f85578b;

    /* JADX INFO: renamed from: c */
    public final int f85579c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13163a f85580d;

    /* JADX INFO: renamed from: e */
    public final byte[] f85581e;

    /* JADX INFO: renamed from: f */
    public int f85582f;

    /* JADX INFO: renamed from: tq7$a */
    public interface InterfaceC13163a {
        void onIcyMetadata(ihc ihcVar);
    }

    public tq7(ih3 ih3Var, int i, InterfaceC13163a interfaceC13163a) {
        u80.checkArgument(i > 0);
        this.f85578b = ih3Var;
        this.f85579c = i;
        this.f85580d = interfaceC13163a;
        this.f85581e = new byte[1];
        this.f85582f = i;
    }

    private boolean readMetadata() throws IOException {
        if (this.f85578b.read(this.f85581e, 0, 1) == -1) {
            return false;
        }
        int i = (this.f85581e[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f85578b.read(bArr, i3, i2);
            if (i4 == -1) {
                return false;
            }
            i3 += i4;
            i2 -= i4;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f85580d.onIcyMetadata(new ihc(bArr, i));
        }
        return true;
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f85578b.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return this.f85578b.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f85578b.getUri();
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f85582f == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.f85582f = this.f85579c;
        }
        int i3 = this.f85578b.read(bArr, i, Math.min(this.f85582f, i2));
        if (i3 != -1) {
            this.f85582f -= i3;
        }
        return i3;
    }
}
