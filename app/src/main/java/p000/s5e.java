package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s5e implements ih3 {

    /* JADX INFO: renamed from: b */
    public final ih3 f80729b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12454b f80730c;

    /* JADX INFO: renamed from: d */
    public boolean f80731d;

    /* JADX INFO: renamed from: s5e$a */
    public static final class C12453a implements ih3.InterfaceC7283a {

        /* JADX INFO: renamed from: a */
        public final ih3.InterfaceC7283a f80732a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12454b f80733b;

        public C12453a(ih3.InterfaceC7283a interfaceC7283a, InterfaceC12454b interfaceC12454b) {
            this.f80732a = interfaceC7283a;
            this.f80733b = interfaceC12454b;
        }

        @Override // p000.ih3.InterfaceC7283a
        public s5e createDataSource() {
            return new s5e(this.f80732a.createDataSource(), this.f80733b);
        }
    }

    /* JADX INFO: renamed from: s5e$b */
    public interface InterfaceC12454b {
        yh3 resolveDataSpec(yh3 yh3Var) throws IOException;

        default Uri resolveReportedUri(Uri uri) {
            return uri;
        }
    }

    public s5e(ih3 ih3Var, InterfaceC12454b interfaceC12454b) {
        this.f80729b = ih3Var;
        this.f80730c = interfaceC12454b;
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f80729b.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        if (this.f80731d) {
            this.f80731d = false;
            this.f80729b.close();
        }
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return this.f80729b.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        Uri uri = this.f80729b.getUri();
        if (uri == null) {
            return null;
        }
        return this.f80730c.resolveReportedUri(uri);
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        yh3 yh3VarResolveDataSpec = this.f80730c.resolveDataSpec(yh3Var);
        this.f80731d = true;
        return this.f80729b.open(yh3VarResolveDataSpec);
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f80729b.read(bArr, i, i2);
    }
}
