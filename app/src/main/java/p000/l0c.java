package p000;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p000.qwc;

/* JADX INFO: loaded from: classes7.dex */
public class l0c {

    /* JADX INFO: renamed from: b */
    public static final Logger f55857b = Logger.getLogger(l0c.class.getName());

    /* JADX INFO: renamed from: c */
    public static final qwc f55858c = qwc.get();

    /* JADX INFO: renamed from: d */
    public static l0c f55859d = m15232d(l0c.class.getClassLoader());

    /* JADX INFO: renamed from: a */
    public final qwc f55860a;

    /* JADX INFO: renamed from: l0c$a */
    @gdi
    public static final class C8569a extends l0c {

        /* JADX INFO: renamed from: e */
        public static final c7c<Socket> f55861e;

        /* JADX INFO: renamed from: f */
        public static final c7c<Socket> f55862f;

        /* JADX INFO: renamed from: g */
        public static final c7c<Socket> f55863g;

        /* JADX INFO: renamed from: h */
        public static final c7c<Socket> f55864h;

        /* JADX INFO: renamed from: i */
        public static final c7c<Socket> f55865i;

        /* JADX INFO: renamed from: j */
        public static final c7c<Socket> f55866j;

        /* JADX INFO: renamed from: k */
        public static final Method f55867k;

        /* JADX INFO: renamed from: l */
        public static final Method f55868l;

        /* JADX INFO: renamed from: m */
        public static final Method f55869m;

        /* JADX INFO: renamed from: n */
        public static final Method f55870n;

        /* JADX INFO: renamed from: o */
        public static final Method f55871o;

        /* JADX INFO: renamed from: p */
        public static final Method f55872p;

        /* JADX INFO: renamed from: q */
        public static final Constructor<?> f55873q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f55861e = new c7c<>(null, "setUseSessionTickets", cls2);
            f55862f = new c7c<>(null, "setHostname", String.class);
            f55863g = new c7c<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f55864h = new c7c<>(null, "setAlpnProtocols", byte[].class);
            f55865i = new c7c<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f55866j = new c7c<>(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException e) {
                            e = e;
                            method4 = null;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            method4 = null;
                        }
                        try {
                            method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                        } catch (ClassNotFoundException e3) {
                            e = e3;
                            l0c.f55857b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            l0c.f55857b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        method3 = null;
                        method4 = method3;
                        l0c.f55857b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f55869m = method;
                        f55870n = method2;
                        f55871o = method3;
                        f55867k = method4;
                        f55868l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f55872p = method6;
                        f55873q = constructor;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        method3 = null;
                        method4 = method3;
                        l0c.f55857b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f55869m = method;
                        f55870n = method2;
                        f55871o = method3;
                        f55867k = method4;
                        f55868l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f55872p = method6;
                        f55873q = constructor;
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    l0c.f55857b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f55869m = method;
                    f55870n = method2;
                    f55871o = method3;
                    f55867k = method4;
                    f55868l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f55872p = method6;
                    f55873q = constructor;
                } catch (NoSuchMethodException e8) {
                    e = e8;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    l0c.f55857b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f55869m = method;
                    f55870n = method2;
                    f55871o = method3;
                    f55867k = method4;
                    f55868l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f55872p = method6;
                    f55873q = constructor;
                }
            } catch (ClassNotFoundException e9) {
                e = e9;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e10) {
                e = e10;
                method = null;
                method2 = null;
            }
            f55869m = method;
            f55870n = method2;
            f55871o = method3;
            f55867k = method4;
            f55868l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            } catch (ClassNotFoundException e11) {
                e = e11;
                method6 = null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                method6 = null;
            }
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e13) {
                e = e13;
                l0c.f55857b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            } catch (NoSuchMethodException e14) {
                e = e14;
                l0c.f55857b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
            f55872p = method6;
            f55873q = constructor;
        }

        public C8569a(qwc qwcVar) {
            super(qwcVar);
        }

        @Override // p000.l0c
        /* JADX INFO: renamed from: c */
        public void mo15234c(SSLSocket sSLSocket, String str, List<uhd> list) {
            Constructor<?> constructor;
            boolean z;
            Method method;
            String[] strArrProtocolIds = l0c.protocolIds(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (l0c.m15233e(str)) {
                            Method method2 = f55867k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f55861e.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                            } else {
                                f55868l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f55872p;
                            if (method3 == null || (constructor = f55873q) == null) {
                                f55862f.invokeOptionalWithoutCheckedException(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
            }
            Method method4 = f55871o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    f55869m.invoke(sSLParameters, strArrProtocolIds);
                    z = true;
                } catch (InvocationTargetException e4) {
                    if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e4;
                    }
                    l0c.f55857b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z = false;
                }
            } else {
                z = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z && (method = f55870n) != null && Arrays.equals(strArrProtocolIds, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {qwc.concatLengthPrefixed(list)};
            if (this.f55860a.getTlsExtensionType() == qwc.EnumC11742h.ALPN_AND_NPN) {
                f55864h.invokeWithoutCheckedException(sSLSocket, objArr);
            }
            if (this.f55860a.getTlsExtensionType() == qwc.EnumC11742h.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f55866j.invokeWithoutCheckedException(sSLSocket, objArr);
        }

        @Override // p000.l0c
        public String getSelectedProtocol(SSLSocket sSLSocket) {
            Method method = f55871o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e2);
                    }
                    l0c.f55857b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f55860a.getTlsExtensionType() == qwc.EnumC11742h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f55863g.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, y0i.f99994b);
                    }
                } catch (Exception e3) {
                    l0c.f55857b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
                }
            }
            if (this.f55860a.getTlsExtensionType() != qwc.EnumC11742h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f55865i.invokeWithoutCheckedException(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, y0i.f99994b);
                    }
                } catch (Exception e4) {
                    l0c.f55857b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
                }
            }
            return null;
        }

        @Override // p000.l0c
        public String negotiate(SSLSocket sSLSocket, String str, List<uhd> list) throws IOException {
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            return selectedProtocol == null ? super.negotiate(sSLSocket, str, list) : selectedProtocol;
        }
    }

    @gdi
    public l0c(qwc qwcVar) {
        this.f55860a = (qwc) v7d.checkNotNull(qwcVar, "platform");
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public static l0c m15232d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f55857b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f55857b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                return new l0c(f55858c);
            }
        }
        return new C8569a(f55858c);
    }

    @gdi
    /* JADX INFO: renamed from: e */
    public static boolean m15233e(String str) {
        if (str.contains(p43.f69617m)) {
            return false;
        }
        try {
            oc7.checkAuthority(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static l0c get() {
        return f55859d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] protocolIds(List<uhd> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<uhd> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: c */
    public void mo15234c(SSLSocket sSLSocket, String str, List<uhd> list) {
        this.f55860a.configureTlsExtensions(sSLSocket, str, list);
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return this.f55860a.getSelectedProtocol(sSLSocket);
    }

    public String negotiate(SSLSocket sSLSocket, String str, @eib List<uhd> list) throws IOException {
        if (list != null) {
            mo15234c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String selectedProtocol = getSelectedProtocol(sSLSocket);
            if (selectedProtocol != null) {
                return selectedProtocol;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f55860a.afterHandshake(sSLSocket);
        }
    }
}
