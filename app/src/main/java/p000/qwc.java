package p000;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class qwc {

    /* JADX INFO: renamed from: b */
    public static final Logger f76183b = Logger.getLogger(qwc.class.getName());

    /* JADX INFO: renamed from: c */
    public static final String[] f76184c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d */
    public static final qwc f76185d = findPlatform();

    /* JADX INFO: renamed from: a */
    public final Provider f76186a;

    /* JADX INFO: renamed from: qwc$a */
    public class C11735a implements PrivilegedExceptionAction<Method> {
        @Override // java.security.PrivilegedExceptionAction
        public Method run() throws Exception {
            return SSLEngine.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* JADX INFO: renamed from: qwc$b */
    public class C11736b implements PrivilegedExceptionAction<Method> {
        @Override // java.security.PrivilegedExceptionAction
        public Method run() throws Exception {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: renamed from: qwc$c */
    public class C11737c implements PrivilegedExceptionAction<Method> {
        @Override // java.security.PrivilegedExceptionAction
        public Method run() throws Exception {
            return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* JADX INFO: renamed from: qwc$d */
    public static class C11738d extends qwc {

        /* JADX INFO: renamed from: e */
        public final c7c<Socket> f76187e;

        /* JADX INFO: renamed from: f */
        public final c7c<Socket> f76188f;

        /* JADX INFO: renamed from: g */
        public final Method f76189g;

        /* JADX INFO: renamed from: h */
        public final Method f76190h;

        /* JADX INFO: renamed from: i */
        public final c7c<Socket> f76191i;

        /* JADX INFO: renamed from: j */
        public final c7c<Socket> f76192j;

        /* JADX INFO: renamed from: k */
        public final EnumC11742h f76193k;

        public C11738d(c7c<Socket> c7cVar, c7c<Socket> c7cVar2, Method method, Method method2, c7c<Socket> c7cVar3, c7c<Socket> c7cVar4, Provider provider, EnumC11742h enumC11742h) {
            super(provider);
            this.f76187e = c7cVar;
            this.f76188f = c7cVar2;
            this.f76189g = method;
            this.f76190h = method2;
            this.f76191i = c7cVar3;
            this.f76192j = c7cVar4;
            this.f76193k = enumC11742h;
        }

        @Override // p000.qwc
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<uhd> list) {
            if (str != null) {
                this.f76187e.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                this.f76188f.invokeOptionalWithoutCheckedException(sSLSocket, str);
            }
            if (this.f76192j.isSupported(sSLSocket)) {
                this.f76192j.invokeWithoutCheckedException(sSLSocket, qwc.concatLengthPrefixed(list));
            }
        }

        @Override // p000.qwc
        public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (SecurityException e) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e);
                throw iOException;
            }
        }

        @Override // p000.qwc
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f76191i.isSupported(sSLSocket) && (bArr = (byte[]) this.f76191i.invokeWithoutCheckedException(sSLSocket, new Object[0])) != null) {
                return new String(bArr, y0i.f99994b);
            }
            return null;
        }

        @Override // p000.qwc
        public EnumC11742h getTlsExtensionType() {
            return this.f76193k;
        }

        @Override // p000.qwc
        public void tagSocket(Socket socket) throws SocketException {
            Method method = this.f76189g;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }

        @Override // p000.qwc
        public void untagSocket(Socket socket) throws SocketException {
            Method method = this.f76190h;
            if (method == null) {
                return;
            }
            try {
                method.invoke(null, socket);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: qwc$e */
    public static class C11739e extends qwc {

        /* JADX INFO: renamed from: e */
        public final Method f76194e;

        /* JADX INFO: renamed from: f */
        public final Method f76195f;

        public /* synthetic */ C11739e(Provider provider, Method method, Method method2, C11735a c11735a) {
            this(provider, method, method2);
        }

        @Override // p000.qwc
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<uhd> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (uhd uhdVar : list) {
                if (uhdVar != uhd.HTTP_1_0) {
                    arrayList.add(uhdVar.toString());
                }
            }
            try {
                this.f76194e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // p000.qwc
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                return (String) this.f76195f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // p000.qwc
        public EnumC11742h getTlsExtensionType() {
            return EnumC11742h.ALPN_AND_NPN;
        }

        private C11739e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f76194e = method;
            this.f76195f = method2;
        }
    }

    /* JADX INFO: renamed from: qwc$f */
    public static class C11740f extends qwc {

        /* JADX INFO: renamed from: e */
        public final Method f76196e;

        /* JADX INFO: renamed from: f */
        public final Method f76197f;

        /* JADX INFO: renamed from: g */
        public final Method f76198g;

        /* JADX INFO: renamed from: h */
        public final Class<?> f76199h;

        /* JADX INFO: renamed from: i */
        public final Class<?> f76200i;

        public C11740f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f76196e = method;
            this.f76197f = method2;
            this.f76198g = method3;
            this.f76199h = cls;
            this.f76200i = cls2;
        }

        @Override // p000.qwc
        public void afterHandshake(SSLSocket sSLSocket) {
            try {
                this.f76198g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                qwc.f76183b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
            }
        }

        @Override // p000.qwc
        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<uhd> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                uhd uhdVar = list.get(i);
                if (uhdVar != uhd.HTTP_1_0) {
                    arrayList.add(uhdVar.toString());
                }
            }
            try {
                this.f76196e.invoke(null, sSLSocket, Proxy.newProxyInstance(qwc.class.getClassLoader(), new Class[]{this.f76199h, this.f76200i}, new C11741g(arrayList)));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // p000.qwc
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                C11741g c11741g = (C11741g) Proxy.getInvocationHandler(this.f76197f.invoke(null, sSLSocket));
                if (!c11741g.f76202b && c11741g.f76203c == null) {
                    qwc.f76183b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (c11741g.f76202b) {
                    return null;
                }
                return c11741g.f76203c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // p000.qwc
        public EnumC11742h getTlsExtensionType() {
            return EnumC11742h.ALPN_AND_NPN;
        }
    }

    /* JADX INFO: renamed from: qwc$g */
    public static class C11741g implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final List<String> f76201a;

        /* JADX INFO: renamed from: b */
        public boolean f76202b;

        /* JADX INFO: renamed from: c */
        public String f76203c;

        public C11741g(List<String> list) {
            this.f76201a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = y0i.f99993a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f76202b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f76201a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f76201a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f76203c = str;
                            return str;
                        }
                    }
                    String str2 = this.f76201a.get(0);
                    this.f76203c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f76203c = (String) objArr[0];
            return null;
        }
    }

    /* JADX INFO: renamed from: qwc$h */
    public enum EnumC11742h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public qwc(Provider provider) {
        this.f76186a = provider;
    }

    public static byte[] concatLengthPrefixed(List<uhd> list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uhd uhdVar = list.get(i);
            if (uhdVar != uhd.HTTP_1_0) {
                buffer.writeByte(uhdVar.toString().length());
                buffer.writeUtf8(uhdVar.toString());
            }
        }
        return buffer.readByteArray();
    }

    private static qwc findPlatform() throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3;
        Class<?> cls;
        Provider androidSecurityProvider = getAndroidSecurityProvider();
        C11735a c11735a = null;
        if (androidSecurityProvider != null) {
            c7c c7cVar = new c7c(null, "setUseSessionTickets", Boolean.TYPE);
            c7c c7cVar2 = new c7c(null, "setHostname", String.class);
            c7c c7cVar3 = new c7c(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            c7c c7cVar4 = new c7c(null, "setAlpnProtocols", byte[].class);
            try {
                cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = null;
            }
            try {
                method3 = cls.getMethod("untagSocket", Socket.class);
                method2 = method;
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = method;
                method3 = null;
            }
            EnumC11742h enumC11742h = (androidSecurityProvider.getName().equals("GmsCore_OpenSSL") || androidSecurityProvider.getName().equals("Conscrypt") || androidSecurityProvider.getName().equals("Ssl_Guard") || isAtLeastAndroid5()) ? EnumC11742h.ALPN_AND_NPN : isAtLeastAndroid41() ? EnumC11742h.NPN : EnumC11742h.NONE;
            return new C11738d(c7cVar, c7cVar2, method2, method3, c7cVar3, c7cVar4, androidSecurityProvider, enumC11742h);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new C11735a())).invoke(sSLContext.createSSLEngine(), null);
                    return new C11739e(provider, (Method) AccessController.doPrivileged(new C11736b()), (Method) AccessController.doPrivileged(new C11737c()), c11735a);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    return new qwc(provider);
                }
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused4) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new C11740f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static qwc get() {
        return f76185d;
    }

    private static Provider getAndroidSecurityProvider() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f76184c) {
                if (str.equals(provider.getClass().getName())) {
                    f76183b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f76183b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean isAtLeastAndroid41() {
        try {
            qwc.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            f76183b.log(Level.FINE, "Can't find class", (Throwable) e);
            return false;
        }
    }

    private static boolean isAtLeastAndroid5() {
        try {
            qwc.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            f76183b.log(Level.FINE, "Can't find class", (Throwable) e);
            return false;
        }
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<uhd> list) {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public Provider getProvider() {
        return this.f76186a;
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC11742h getTlsExtensionType() {
        return EnumC11742h.NONE;
    }

    public void logW(String str) {
        System.out.println(str);
    }

    public void tagSocket(Socket socket) throws SocketException {
    }

    public void untagSocket(Socket socket) throws SocketException {
    }
}
