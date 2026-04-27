package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p000.uc9;
import p000.xh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cic<T> implements uc9.InterfaceC13493e {

    /* JADX INFO: renamed from: a */
    public final long f16637a;

    /* JADX INFO: renamed from: b */
    public final xh3 f16638b;

    /* JADX INFO: renamed from: c */
    public final int f16639c;

    /* JADX INFO: renamed from: d */
    public final j4g f16640d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2324a<? extends T> f16641e;

    /* JADX INFO: renamed from: f */
    @hib
    public volatile T f16642f;

    /* JADX INFO: renamed from: cic$a */
    public interface InterfaceC2324a<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public cic(gh3 gh3Var, Uri uri, int i, InterfaceC2324a<? extends T> interfaceC2324a) {
        this(gh3Var, new xh3.C15067b().setUri(uri).setFlags(1).build(), i, interfaceC2324a);
    }

    public static <T> T load(gh3 gh3Var, InterfaceC2324a<? extends T> interfaceC2324a, Uri uri, int i) throws IOException {
        cic cicVar = new cic(gh3Var, uri, i, interfaceC2324a);
        cicVar.load();
        return (T) v80.checkNotNull(cicVar.getResult());
    }

    public long bytesLoaded() {
        return this.f16640d.getBytesRead();
    }

    @Override // p000.uc9.InterfaceC13493e
    public final void cancelLoad() {
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f16640d.getLastResponseHeaders();
    }

    @hib
    public final T getResult() {
        return this.f16642f;
    }

    public Uri getUri() {
        return this.f16640d.getLastOpenedUri();
    }

    public cic(gh3 gh3Var, xh3 xh3Var, int i, InterfaceC2324a<? extends T> interfaceC2324a) {
        this.f16640d = new j4g(gh3Var);
        this.f16638b = xh3Var;
        this.f16639c = i;
        this.f16641e = interfaceC2324a;
        this.f16637a = kc9.getNewId();
    }

    public static <T> T load(gh3 gh3Var, InterfaceC2324a<? extends T> interfaceC2324a, xh3 xh3Var, int i) throws IOException {
        cic cicVar = new cic(gh3Var, xh3Var, i, interfaceC2324a);
        cicVar.load();
        return (T) v80.checkNotNull(cicVar.getResult());
    }

    @Override // p000.uc9.InterfaceC13493e
    public final void load() throws IOException {
        this.f16640d.resetBytesRead();
        uh3 uh3Var = new uh3(this.f16640d, this.f16638b);
        try {
            uh3Var.open();
            this.f16642f = this.f16641e.parse((Uri) v80.checkNotNull(this.f16640d.getUri()), uh3Var);
        } finally {
            t0i.closeQuietly(uh3Var);
        }
    }
}
