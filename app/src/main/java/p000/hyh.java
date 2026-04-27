package p000;

import java.io.InputStream;
import java.net.URL;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public class hyh implements vwa<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    public final vwa<k77, InputStream> f45280a;

    /* JADX INFO: renamed from: hyh$a */
    public static class C7083a implements wwa<URL, InputStream> {
        @Override // p000.wwa
        @efb
        public vwa<URL, InputStream> build(t2b t2bVar) {
            return new hyh(t2bVar.build(k77.class, InputStream.class));
        }

        @Override // p000.wwa
        public void teardown() {
        }
    }

    public hyh(vwa<k77, InputStream> vwaVar) {
        this.f45280a = vwaVar;
    }

    @Override // p000.vwa
    public vwa.C14279a<InputStream> buildLoadData(@efb URL url, int i, int i2, @efb i7c i7cVar) {
        return this.f45280a.buildLoadData(new k77(url), i, i2, i7cVar);
    }

    @Override // p000.vwa
    public boolean handles(@efb URL url) {
        return true;
    }
}
