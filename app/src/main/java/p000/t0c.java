package p000;

import java.net.InetSocketAddress;
import p000.n3f;
import p000.s0c;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class t0c extends n3f {
    @Override // p000.n3f
    /* JADX INFO: renamed from: b */
    public boolean mo17765b() {
        return true;
    }

    @Override // p000.n3f
    /* JADX INFO: renamed from: c */
    public n3f.C9682a mo17766c(int i, e3f e3fVar) {
        s0c.C12389c c12389cM21633c = s0c.m21633c(e3fVar);
        String str = c12389cM21633c.f80344b;
        return str != null ? n3f.C9682a.error(str) : n3f.C9682a.serverBuilder(new s0c(new InetSocketAddress(i), c12389cM21633c.f80343a));
    }

    @Override // p000.n3f
    /* JADX INFO: renamed from: d */
    public int mo17767d() {
        return 4;
    }

    @Override // p000.n3f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public s0c mo17764a(int i) {
        throw new UnsupportedOperationException("Use Grpc.newServerBuilderForPort() instead");
    }
}
