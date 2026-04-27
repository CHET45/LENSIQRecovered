package p000;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes7.dex */
public final class ls2 {

    /* JADX INFO: renamed from: e */
    public static final vz1[] f58575e;

    /* JADX INFO: renamed from: f */
    public static final ls2 f58576f;

    /* JADX INFO: renamed from: g */
    public static final ls2 f58577g;

    /* JADX INFO: renamed from: h */
    public static final ls2 f58578h;

    /* JADX INFO: renamed from: a */
    public final boolean f58579a;

    /* JADX INFO: renamed from: b */
    public final String[] f58580b;

    /* JADX INFO: renamed from: c */
    public final String[] f58581c;

    /* JADX INFO: renamed from: d */
    public final boolean f58582d;

    static {
        vz1[] vz1VarArr = {vz1.TLS_AES_128_GCM_SHA256, vz1.TLS_AES_256_GCM_SHA384, vz1.TLS_CHACHA20_POLY1305_SHA256, vz1.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, vz1.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, vz1.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, vz1.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, vz1.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, vz1.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, vz1.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, vz1.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, vz1.TLS_RSA_WITH_AES_128_GCM_SHA256, vz1.TLS_RSA_WITH_AES_256_GCM_SHA384, vz1.TLS_RSA_WITH_AES_128_CBC_SHA, vz1.TLS_RSA_WITH_AES_256_CBC_SHA, vz1.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f58575e = vz1VarArr;
        C8950b c8950bCipherSuites = new C8950b(true).cipherSuites(vz1VarArr);
        d3h d3hVar = d3h.TLS_1_3;
        d3h d3hVar2 = d3h.TLS_1_2;
        ls2 ls2VarBuild = c8950bCipherSuites.tlsVersions(d3hVar, d3hVar2).supportsTlsExtensions(true).build();
        f58576f = ls2VarBuild;
        f58577g = new C8950b(ls2VarBuild).tlsVersions(d3hVar, d3hVar2, d3h.TLS_1_1, d3h.TLS_1_0).supportsTlsExtensions(true).build();
        f58578h = new C8950b(false).build();
    }

    private static <T> boolean contains(T[] tArr, T t) {
        for (T t2 : tArr) {
            if (y0i.equal(t, t2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean nonEmptyIntersection(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                if (contains(strArr2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private ls2 supportedSpec(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        if (this.f58580b != null) {
            enabledCipherSuites = (String[]) y0i.intersect(String.class, this.f58580b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new C8950b(this).cipherSuites(enabledCipherSuites).tlsVersions((String[]) y0i.intersect(String.class, this.f58581c, sSLSocket.getEnabledProtocols())).build();
    }

    public void apply(SSLSocket sSLSocket, boolean z) {
        ls2 ls2VarSupportedSpec = supportedSpec(sSLSocket, z);
        sSLSocket.setEnabledProtocols(ls2VarSupportedSpec.f58581c);
        String[] strArr = ls2VarSupportedSpec.f58580b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<vz1> cipherSuites() {
        String[] strArr = this.f58580b;
        if (strArr == null) {
            return null;
        }
        vz1[] vz1VarArr = new vz1[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.f58580b;
            if (i >= strArr2.length) {
                return y0i.immutableList(vz1VarArr);
            }
            vz1VarArr[i] = vz1.forJavaName(strArr2[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ls2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ls2 ls2Var = (ls2) obj;
        boolean z = this.f58579a;
        if (z != ls2Var.f58579a) {
            return false;
        }
        return !z || (Arrays.equals(this.f58580b, ls2Var.f58580b) && Arrays.equals(this.f58581c, ls2Var.f58581c) && this.f58582d == ls2Var.f58582d);
    }

    public int hashCode() {
        if (this.f58579a) {
            return ((((527 + Arrays.hashCode(this.f58580b)) * 31) + Arrays.hashCode(this.f58581c)) * 31) + (!this.f58582d ? 1 : 0);
        }
        return 17;
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (!this.f58579a) {
            return false;
        }
        if (!nonEmptyIntersection(this.f58581c, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f58580b == null) {
            return sSLSocket.getEnabledCipherSuites().length > 0;
        }
        return nonEmptyIntersection(this.f58580b, sSLSocket.getEnabledCipherSuites());
    }

    public boolean isTls() {
        return this.f58579a;
    }

    public boolean supportsTlsExtensions() {
        return this.f58582d;
    }

    public List<d3h> tlsVersions() {
        d3h[] d3hVarArr = new d3h[this.f58581c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.f58581c;
            if (i >= strArr.length) {
                return y0i.immutableList(d3hVarArr);
            }
            d3hVarArr[i] = d3h.forJavaName(strArr[i]);
            i++;
        }
    }

    public String toString() {
        if (!this.f58579a) {
            return "ConnectionSpec()";
        }
        List<vz1> listCipherSuites = cipherSuites();
        return "ConnectionSpec(cipherSuites=" + (listCipherSuites == null ? "[use default]" : listCipherSuites.toString()) + ", tlsVersions=" + tlsVersions() + ", supportsTlsExtensions=" + this.f58582d + c0b.f15434d;
    }

    /* JADX INFO: renamed from: ls2$b */
    public static final class C8950b {

        /* JADX INFO: renamed from: a */
        public boolean f58583a;

        /* JADX INFO: renamed from: b */
        public String[] f58584b;

        /* JADX INFO: renamed from: c */
        public String[] f58585c;

        /* JADX INFO: renamed from: d */
        public boolean f58586d;

        public C8950b(boolean z) {
            this.f58583a = z;
        }

        public ls2 build() {
            return new ls2(this);
        }

        public C8950b cipherSuites(vz1... vz1VarArr) {
            if (!this.f58583a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[vz1VarArr.length];
            for (int i = 0; i < vz1VarArr.length; i++) {
                strArr[i] = vz1VarArr[i].f92860a;
            }
            this.f58584b = strArr;
            return this;
        }

        public C8950b supportsTlsExtensions(boolean z) {
            if (!this.f58583a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f58586d = z;
            return this;
        }

        public C8950b tlsVersions(d3h... d3hVarArr) {
            if (!this.f58583a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (d3hVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[d3hVarArr.length];
            for (int i = 0; i < d3hVarArr.length; i++) {
                strArr[i] = d3hVarArr[i].f28377a;
            }
            this.f58585c = strArr;
            return this;
        }

        public C8950b(ls2 ls2Var) {
            this.f58583a = ls2Var.f58579a;
            this.f58584b = ls2Var.f58580b;
            this.f58585c = ls2Var.f58581c;
            this.f58586d = ls2Var.f58582d;
        }

        public C8950b cipherSuites(String... strArr) {
            if (!this.f58583a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f58584b = null;
            } else {
                this.f58584b = (String[]) strArr.clone();
            }
            return this;
        }

        public C8950b tlsVersions(String... strArr) {
            if (!this.f58583a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f58585c = null;
            } else {
                this.f58585c = (String[]) strArr.clone();
            }
            return this;
        }
    }

    private ls2(C8950b c8950b) {
        this.f58579a = c8950b.f58583a;
        this.f58580b = c8950b.f58584b;
        this.f58581c = c8950b.f58585c;
        this.f58582d = c8950b.f58586d;
    }
}
