package p000;

import java.net.SocketAddress;
import java.util.Collection;
import p000.g0c;
import p000.tr9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public final class h0c extends tr9 {
    @Override // p000.tr9
    /* JADX INFO: renamed from: a */
    public Collection<Class<? extends SocketAddress>> mo12062a() {
        return g0c.m11285i();
    }

    @Override // p000.tr9
    public boolean isAvailable() {
        return true;
    }

    @Override // p000.tr9
    public tr9.C13176a newChannelBuilder(String str, eu1 eu1Var) {
        g0c.C6075g c6075gM11286k = g0c.m11286k(eu1Var);
        String str2 = c6075gM11286k.f38188c;
        return str2 != null ? tr9.C13176a.error(str2) : tr9.C13176a.channelBuilder(new g0c(str, eu1Var, c6075gM11286k.f38187b, c6075gM11286k.f38186a));
    }

    @Override // p000.tr9
    public int priority() {
        return sb8.isAndroid(h0c.class.getClassLoader()) ? 8 : 3;
    }

    @Override // p000.tr9
    public g0c builderForAddress(String str, int i) {
        return g0c.forAddress(str, i);
    }

    @Override // p000.tr9
    public g0c builderForTarget(String str) {
        return g0c.forTarget(str);
    }
}
