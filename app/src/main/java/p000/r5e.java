package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000.gh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class r5e implements gh3 {

    /* JADX INFO: renamed from: b */
    public final gh3 f77097b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11899b f77098c;

    /* JADX INFO: renamed from: d */
    public boolean f77099d;

    /* JADX INFO: renamed from: r5e$a */
    public static final class C11898a implements gh3.InterfaceC6313a {

        /* JADX INFO: renamed from: a */
        public final gh3.InterfaceC6313a f77100a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC11899b f77101b;

        public C11898a(gh3.InterfaceC6313a interfaceC6313a, InterfaceC11899b interfaceC11899b) {
            this.f77100a = interfaceC6313a;
            this.f77101b = interfaceC11899b;
        }

        @Override // p000.gh3.InterfaceC6313a
        public r5e createDataSource() {
            return new r5e(this.f77100a.createDataSource(), this.f77101b);
        }
    }

    /* JADX INFO: renamed from: r5e$b */
    public interface InterfaceC11899b {
        xh3 resolveDataSpec(xh3 xh3Var) throws IOException;

        default Uri resolveReportedUri(Uri uri) {
            return uri;
        }
    }

    public r5e(gh3 gh3Var, InterfaceC11899b interfaceC11899b) {
        this.f77097b = gh3Var;
        this.f77098c = interfaceC11899b;
    }

    @Override // p000.gh3
    public void addTransferListener(qdh qdhVar) {
        v80.checkNotNull(qdhVar);
        this.f77097b.addTransferListener(qdhVar);
    }

    @Override // p000.gh3
    public void close() throws IOException {
        if (this.f77099d) {
            this.f77099d = false;
            this.f77097b.close();
        }
    }

    @Override // p000.gh3
    public Map<String, List<String>> getResponseHeaders() {
        return this.f77097b.getResponseHeaders();
    }

    @Override // p000.gh3
    @hib
    public Uri getUri() {
        Uri uri = this.f77097b.getUri();
        if (uri == null) {
            return null;
        }
        return this.f77098c.resolveReportedUri(uri);
    }

    @Override // p000.gh3
    public long open(xh3 xh3Var) throws IOException {
        xh3 xh3VarResolveDataSpec = this.f77098c.resolveDataSpec(xh3Var);
        this.f77099d = true;
        return this.f77097b.open(xh3VarResolveDataSpec);
    }

    @Override // p000.bh3
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f77097b.read(bArr, i, i2);
    }
}
