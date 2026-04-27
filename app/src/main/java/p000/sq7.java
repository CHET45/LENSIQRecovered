package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sq7 implements gh3 {

    /* JADX INFO: renamed from: b */
    public final gh3 f82593b;

    /* JADX INFO: renamed from: c */
    public final int f82594c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC12746a f82595d;

    /* JADX INFO: renamed from: e */
    public final byte[] f82596e;

    /* JADX INFO: renamed from: f */
    public int f82597f;

    /* JADX INFO: renamed from: sq7$a */
    public interface InterfaceC12746a {
        void onIcyMetadata(jhc jhcVar);
    }

    public sq7(gh3 gh3Var, int i, InterfaceC12746a interfaceC12746a) {
        v80.checkArgument(i > 0);
        this.f82593b = gh3Var;
        this.f82594c = i;
        this.f82595d = interfaceC12746a;
        this.f82596e = new byte[1];
        this.f82597f = i;
    }

    private boolean readMetadata() throws IOException {
        if (this.f82593b.read(this.f82596e, 0, 1) == -1) {
            return false;
        }
        int i = (this.f82596e[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f82593b.read(bArr, i3, i2);
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
            this.f82595d.onIcyMetadata(new jhc(bArr, i));
        }
        return true;
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f82593b.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return this.f82593b.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f82593b.getUri();
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f82597f == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.f82597f = this.f82594c;
        }
        int i3 = this.f82593b.read(bArr, i, Math.min(this.f82597f, i2));
        if (i3 != -1) {
            this.f82597f -= i3;
        }
        return i3;
    }
}
