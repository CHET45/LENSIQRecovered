package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.sc0;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1770")
public final class s45 {

    /* JADX INFO: renamed from: d */
    @lg5("https://github.com/grpc/grpc-java/issues/6138")
    public static final sc0.C12516c<String> f80626d = sc0.C12516c.create("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a */
    public final List<SocketAddress> f80627a;

    /* JADX INFO: renamed from: b */
    public final sc0 f80628b;

    /* JADX INFO: renamed from: c */
    public final int f80629c;

    /* JADX INFO: renamed from: s45$a */
    @lg5("https://github.com/grpc/grpc-java/issues/4972")
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC12433a {
    }

    public s45(List<SocketAddress> list) {
        this(list, sc0.f81180c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s45)) {
            return false;
        }
        s45 s45Var = (s45) obj;
        if (this.f80627a.size() != s45Var.f80627a.size()) {
            return false;
        }
        for (int i = 0; i < this.f80627a.size(); i++) {
            if (!this.f80627a.get(i).equals(s45Var.f80627a.get(i))) {
                return false;
            }
        }
        return this.f80628b.equals(s45Var.f80628b);
    }

    public List<SocketAddress> getAddresses() {
        return this.f80627a;
    }

    public sc0 getAttributes() {
        return this.f80628b;
    }

    public int hashCode() {
        return this.f80629c;
    }

    public String toString() {
        return "[" + this.f80627a + pj4.f71071b + this.f80628b + "]";
    }

    public s45(List<SocketAddress> list, sc0 sc0Var) {
        v7d.checkArgument(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f80627a = listUnmodifiableList;
        this.f80628b = (sc0) v7d.checkNotNull(sc0Var, "attrs");
        this.f80629c = listUnmodifiableList.hashCode();
    }

    public s45(SocketAddress socketAddress) {
        this(socketAddress, sc0.f81180c);
    }

    public s45(SocketAddress socketAddress, sc0 sc0Var) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), sc0Var);
    }
}
