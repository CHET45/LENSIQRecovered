package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ccd implements ih3 {

    /* JADX INFO: renamed from: b */
    public final ih3 f16241b;

    /* JADX INFO: renamed from: c */
    public final jcd f16242c;

    /* JADX INFO: renamed from: d */
    public final int f16243d;

    /* JADX INFO: renamed from: ccd$a */
    public static final class C2267a implements ih3.InterfaceC7283a {

        /* JADX INFO: renamed from: a */
        public final ih3.InterfaceC7283a f16244a;

        /* JADX INFO: renamed from: b */
        public final jcd f16245b;

        /* JADX INFO: renamed from: c */
        public final int f16246c;

        public C2267a(ih3.InterfaceC7283a interfaceC7283a, jcd jcdVar, int i) {
            this.f16244a = interfaceC7283a;
            this.f16245b = jcdVar;
            this.f16246c = i;
        }

        @Override // p000.ih3.InterfaceC7283a
        public ccd createDataSource() {
            return new ccd(this.f16244a.createDataSource(), this.f16245b, this.f16246c);
        }
    }

    public ccd(ih3 ih3Var, jcd jcdVar, int i) {
        this.f16241b = (ih3) u80.checkNotNull(ih3Var);
        this.f16242c = (jcd) u80.checkNotNull(jcdVar);
        this.f16243d = i;
    }

    @Override // p000.ih3
    public void addTransferListener(pdh pdhVar) {
        u80.checkNotNull(pdhVar);
        this.f16241b.addTransferListener(pdhVar);
    }

    @Override // p000.ih3, p000.en7
    public void close() throws IOException {
        this.f16241b.close();
    }

    @Override // p000.ih3, p000.en7
    public Map<String, List<String>> getResponseHeaders() {
        return this.f16241b.getResponseHeaders();
    }

    @Override // p000.ih3
    @hib
    public Uri getUri() {
        return this.f16241b.getUri();
    }

    @Override // p000.ih3, p000.en7
    public long open(yh3 yh3Var) throws IOException {
        this.f16242c.proceedOrThrow(this.f16243d);
        return this.f16241b.open(yh3Var);
    }

    @Override // p000.ah3, p000.en7
    public int read(byte[] bArr, int i, int i2) throws IOException {
        this.f16242c.proceedOrThrow(this.f16243d);
        return this.f16241b.read(bArr, i, i2);
    }
}
