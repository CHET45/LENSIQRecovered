package p000;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.an7;

/* JADX INFO: loaded from: classes7.dex */
public class sid implements rid {

    /* JADX INFO: renamed from: d */
    public static final Logger f81931d = Logger.getLogger(sid.class.getName());

    /* JADX INFO: renamed from: e */
    public static final InterfaceC12605c f81932e = new C12603a();

    /* JADX INFO: renamed from: f */
    public static final lfg<ProxySelector> f81933f = new C12604b();

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final String f81934g = "GRPC_PROXY_EXP";

    /* JADX INFO: renamed from: h */
    public static final String f81935h = "https";

    /* JADX INFO: renamed from: a */
    public final lfg<ProxySelector> f81936a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12605c f81937b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f81938c;

    /* JADX INFO: renamed from: sid$a */
    public class C12603a implements InterfaceC12605c {
        @Override // p000.sid.InterfaceC12605c
        public PasswordAuthentication requestPasswordAuthentication(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i, "");
            } catch (MalformedURLException unused) {
                sid.f81931d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* JADX INFO: renamed from: sid$b */
    public class C12604b implements lfg<ProxySelector> {
        @Override // p000.lfg
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: renamed from: sid$c */
    public interface InterfaceC12605c {
        PasswordAuthentication requestPasswordAuthentication(String str, InetAddress inetAddress, int i, String str2, String str3, String str4);
    }

    public sid() {
        this(f81933f, f81932e, System.getenv(f81934g));
    }

    private qid detectProxy(InetSocketAddress inetSocketAddress) throws IOException {
        try {
            try {
                URI uri = new URI("https", null, oc7.getHost(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f81936a.get();
                if (proxySelector == null) {
                    f81931d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    f81931d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = this.f81937b.requestPasswordAuthentication(oc7.getHost(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                an7.C0338b proxyAddress = an7.newBuilder().setTargetAddress(inetSocketAddress).setProxyAddress(inetSocketAddress2);
                if (passwordAuthenticationRequestPasswordAuthentication == null) {
                    return proxyAddress.build();
                }
                return proxyAddress.setUsername(passwordAuthenticationRequestPasswordAuthentication.getUserName()).setPassword(passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null).build();
            } catch (URISyntaxException e) {
                f81931d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            f81931d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    private static InetSocketAddress overrideProxy(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(g1i.f38277c, 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f81931d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(strArrSplit[0], i);
    }

    @Override // p000.rid
    @eib
    public qid proxyFor(SocketAddress socketAddress) throws IOException {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f81938c != null ? an7.newBuilder().setProxyAddress(this.f81938c).setTargetAddress((InetSocketAddress) socketAddress).build() : detectProxy((InetSocketAddress) socketAddress);
        }
        return null;
    }

    @gdi
    public sid(lfg<ProxySelector> lfgVar, InterfaceC12605c interfaceC12605c, @eib String str) {
        this.f81936a = (lfg) v7d.checkNotNull(lfgVar);
        this.f81937b = (InterfaceC12605c) v7d.checkNotNull(interfaceC12605c);
        if (str != null) {
            this.f81938c = overrideProxy(str);
        } else {
            this.f81938c = null;
        }
    }
}
