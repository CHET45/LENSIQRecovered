package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000.gh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class bcd implements gh3 {

    /* JADX INFO: renamed from: b */
    public final gh3 f13332b;

    /* JADX INFO: renamed from: c */
    public final icd f13333c;

    /* JADX INFO: renamed from: d */
    public final int f13334d;

    /* JADX INFO: renamed from: bcd$a */
    public static final class C1830a implements gh3.InterfaceC6313a {

        /* JADX INFO: renamed from: a */
        public final gh3.InterfaceC6313a f13335a;

        /* JADX INFO: renamed from: b */
        public final icd f13336b;

        /* JADX INFO: renamed from: c */
        public final int f13337c;

        public C1830a(gh3.InterfaceC6313a interfaceC6313a, icd icdVar, int i) {
            this.f13335a = interfaceC6313a;
            this.f13336b = icdVar;
            this.f13337c = i;
        }

        @Override // p000.gh3.InterfaceC6313a
        public bcd createDataSource() {
            return new bcd(this.f13335a.createDataSource(), this.f13336b, this.f13337c);
        }
    }

    public bcd(gh3 gh3Var, icd icdVar, int i) {
        this.f13332b = (gh3) v80.checkNotNull(gh3Var);
        this.f13333c = (icd) v80.checkNotNull(icdVar);
        this.f13334d = i;
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f13332b.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() throws IOException {
        this.f13332b.close();
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return this.f13332b.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        return this.f13332b.getUri();
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        this.f13333c.proceedOrThrow(this.f13334d);
        return this.f13332b.open(xh3Var);
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f13333c.proceedOrThrow(this.f13334d);
        return this.f13332b.read(bArr, i, i2);
    }
}
