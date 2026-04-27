package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public final class fh4 extends s8b {

    /* JADX INFO: renamed from: a */
    public static final String f36573a = "dns";

    /* JADX INFO: renamed from: b */
    public static final boolean f36574b = sb8.isAndroid(fh4.class.getClassLoader());

    @Override // p000.s8b
    /* JADX INFO: renamed from: b */
    public boolean mo10903b() {
        return true;
    }

    @Override // p000.q8b.AbstractC11374d
    public String getDefaultScheme() {
        return f36573a;
    }

    @Override // p000.s8b
    public Collection<Class<? extends SocketAddress>> getProducedSocketAddressTypes() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // p000.q8b.AbstractC11374d
    public q8b newNameResolver(URI uri, q8b.C11372b c11372b) {
        if (!f36573a.equals(uri.getScheme())) {
            return null;
        }
        String str = (String) v7d.checkNotNull(uri.getPath(), "targetPath");
        v7d.checkArgument(str.startsWith(pj4.f71071b), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new eh4(uri.getAuthority(), str.substring(1), c11372b, oc7.f67129K, d5g.createUnstarted(), f36574b);
    }

    @Override // p000.s8b
    public int priority() {
        return 5;
    }
}
