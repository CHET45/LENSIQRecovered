package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/4159")
public abstract class s8b extends q8b.AbstractC11374d {
    /* JADX INFO: renamed from: a */
    public String m21775a() {
        return getDefaultScheme();
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo10903b();

    public Collection<Class<? extends SocketAddress>> getProducedSocketAddressTypes() {
        return Collections.singleton(InetSocketAddress.class);
    }

    public abstract int priority();
}
