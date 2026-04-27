package p000;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p000.vc9;
import p000.yh3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dic<T> implements vc9.InterfaceC13997e {

    /* JADX INFO: renamed from: a */
    public final long f29706a;

    /* JADX INFO: renamed from: b */
    public final yh3 f29707b;

    /* JADX INFO: renamed from: c */
    public final int f29708c;

    /* JADX INFO: renamed from: d */
    public final i4g f29709d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4797a<? extends T> f29710e;

    /* JADX INFO: renamed from: f */
    @hib
    public volatile T f29711f;

    /* JADX INFO: renamed from: dic$a */
    public interface InterfaceC4797a<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public dic(ih3 ih3Var, Uri uri, int i, InterfaceC4797a<? extends T> interfaceC4797a) {
        this(ih3Var, new yh3.C15662b().setUri(uri).setFlags(1).build(), i, interfaceC4797a);
    }

    public static <T> T load(ih3 ih3Var, InterfaceC4797a<? extends T> interfaceC4797a, Uri uri, int i) throws IOException {
        dic dicVar = new dic(ih3Var, uri, i, interfaceC4797a);
        dicVar.load();
        return (T) u80.checkNotNull(dicVar.getResult());
    }

    public long bytesLoaded() {
        return this.f29709d.getBytesRead();
    }

    @Override // p000.vc9.InterfaceC13997e
    public final void cancelLoad() {
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f29709d.getLastResponseHeaders();
    }

    @hib
    public final T getResult() {
        return this.f29711f;
    }

    public Uri getUri() {
        return this.f29709d.getLastOpenedUri();
    }

    public dic(ih3 ih3Var, yh3 yh3Var, int i, InterfaceC4797a<? extends T> interfaceC4797a) {
        this.f29709d = new i4g(ih3Var);
        this.f29707b = yh3Var;
        this.f29708c = i;
        this.f29710e = interfaceC4797a;
        this.f29706a = jc9.getNewId();
    }

    public static <T> T load(ih3 ih3Var, InterfaceC4797a<? extends T> interfaceC4797a, yh3 yh3Var, int i) throws IOException {
        dic dicVar = new dic(ih3Var, yh3Var, i, interfaceC4797a);
        dicVar.load();
        return (T) u80.checkNotNull(dicVar.getResult());
    }

    @Override // p000.vc9.InterfaceC13997e
    public final void load() throws IOException {
        this.f29709d.resetBytesRead();
        th3 th3Var = new th3(this.f29709d, this.f29707b);
        try {
            th3Var.open();
            this.f29711f = this.f29710e.parse((Uri) u80.checkNotNull(this.f29709d.getUri()), th3Var);
        } finally {
            x0i.closeQuietly(th3Var);
        }
    }
}
