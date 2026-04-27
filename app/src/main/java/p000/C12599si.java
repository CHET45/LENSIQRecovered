package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;

/* JADX INFO: renamed from: si */
/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/8024")
@yr7
public final class C12599si extends X509ExtendedTrustManager {

    /* JADX INFO: renamed from: d */
    public static final Logger f81880d = Logger.getLogger(C12599si.class.getName());

    /* JADX INFO: renamed from: a */
    public final f f81881a;

    /* JADX INFO: renamed from: b */
    public final e f81882b;

    /* JADX INFO: renamed from: c */
    public volatile X509ExtendedTrustManager f81883c;

    /* JADX INFO: renamed from: si$a */
    public class a implements c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScheduledFuture f81884a;

        public a(ScheduledFuture scheduledFuture) {
            this.f81884a = scheduledFuture;
        }

        @Override // p000.C12599si.c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f81884a.cancel(false);
        }
    }

    /* JADX INFO: renamed from: si$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public f f81886a;

        /* JADX INFO: renamed from: b */
        public e f81887b;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public C12599si build() throws CertificateException {
            return new C12599si(this.f81886a, this.f81887b, null);
        }

        public b setSslSocketAndEnginePeerVerifier(e eVar) {
            this.f81887b = eVar;
            return this;
        }

        public b setVerification(f fVar) {
            this.f81886a = fVar;
            return this;
        }

        private b() {
            this.f81886a = f.CERTIFICATE_AND_HOST_NAME_VERIFICATION;
        }
    }

    /* JADX INFO: renamed from: si$c */
    public interface c extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    /* JADX INFO: renamed from: si$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public File f81888a;

        /* JADX INFO: renamed from: b */
        public long f81889b = 0;

        public d(File file) {
            this.f81888a = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f81889b = C12599si.this.readAndUpdate(this.f81888a, this.f81889b);
            } catch (IOException | GeneralSecurityException e) {
                C12599si.f81880d.log(Level.SEVERE, "Failed refreshing trust CAs from file. Using previous CAs", e);
            }
        }
    }

    /* JADX INFO: renamed from: si$e */
    public interface e {
        void verifyPeerCertificate(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException;

        void verifyPeerCertificate(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException;
    }

    /* JADX INFO: renamed from: si$f */
    public enum f {
        CERTIFICATE_AND_HOST_NAME_VERIFICATION,
        CERTIFICATE_ONLY_VERIFICATION,
        INSECURELY_SKIP_ALL_VERIFICATION
    }

    public /* synthetic */ C12599si(f fVar, e eVar, a aVar) throws CertificateException {
        this(fVar, eVar);
    }

    private void checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, Socket socket, boolean z) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("Want certificate verification but got null or empty certificates");
        }
        if (sSLEngine == null && socket == null) {
            throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
        }
        if (this.f81881a != f.INSECURELY_SKIP_ALL_VERIFICATION) {
            X509ExtendedTrustManager x509ExtendedTrustManager = this.f81883c;
            if (x509ExtendedTrustManager == null) {
                throw new CertificateException("No trust roots configured");
            }
            if (z) {
                String str2 = this.f81881a == f.CERTIFICATE_AND_HOST_NAME_VERIFICATION ? "HTTPS" : "";
                if (sSLEngine != null) {
                    SSLParameters sSLParameters = sSLEngine.getSSLParameters();
                    sSLParameters.setEndpointIdentificationAlgorithm(str2);
                    sSLEngine.setSSLParameters(sSLParameters);
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLEngine);
                } else {
                    if (!(socket instanceof SSLSocket)) {
                        throw new CertificateException("socket is not a type of SSLSocket");
                    }
                    SSLSocket sSLSocket = (SSLSocket) socket;
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    sSLParameters2.setEndpointIdentificationAlgorithm(str2);
                    sSLSocket.setSSLParameters(sSLParameters2);
                    x509ExtendedTrustManager.checkServerTrusted(x509CertificateArr, str, sSLSocket);
                }
            } else {
                x509ExtendedTrustManager.checkClientTrusted(x509CertificateArr, str, sSLEngine);
            }
        }
        e eVar = this.f81882b;
        if (eVar != null) {
            if (sSLEngine != null) {
                eVar.verifyPeerCertificate(x509CertificateArr, str, sSLEngine);
            } else {
                eVar.verifyPeerCertificate(x509CertificateArr, str, socket);
            }
        }
    }

    private static X509ExtendedTrustManager createDelegateTrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        X509ExtendedTrustManager x509ExtendedTrustManager;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        int i = 0;
        while (true) {
            if (i >= trustManagers.length) {
                x509ExtendedTrustManager = null;
                break;
            }
            TrustManager trustManager = trustManagers[i];
            if (trustManager instanceof X509ExtendedTrustManager) {
                x509ExtendedTrustManager = (X509ExtendedTrustManager) trustManager;
                break;
            }
            i++;
        }
        if (x509ExtendedTrustManager != null) {
            return x509ExtendedTrustManager;
        }
        throw new CertificateException("Failed to find X509ExtendedTrustManager with default TrustManager algorithm " + TrustManagerFactory.getDefaultAlgorithm());
    }

    public static b newBuilder() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long readAndUpdate(File file, long j) throws GeneralSecurityException, IOException {
        long jLastModified = file.lastModified();
        if (jLastModified == j) {
            return j;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            updateTrustCredentials(pt1.getX509Certificates(fileInputStream));
            return jLastModified;
        } finally {
            fileInputStream.close();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        checkTrusted(x509CertificateArr, str, sSLEngine, null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f81883c == null ? new X509Certificate[0] : this.f81883c.getAcceptedIssuers();
    }

    public void updateTrustCredentials(X509Certificate[] x509CertificateArr) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i = 1;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            keyStore.setCertificateEntry(Integer.toString(i), x509Certificate);
            i++;
        }
        this.f81883c = createDelegateTrustManager(keyStore);
    }

    public c updateTrustCredentialsFromFile(File file, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        if (readAndUpdate(file, 0L) != 0) {
            return new a(scheduledExecutorService.scheduleWithFixedDelay(new d(file), j, j, timeUnit));
        }
        throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
    }

    public void useSystemDefaultTrustCerts() throws NoSuchAlgorithmException, CertificateException, KeyStoreException {
        this.f81883c = createDelegateTrustManager(null);
    }

    private C12599si(f fVar, e eVar) throws CertificateException {
        this.f81883c = null;
        this.f81881a = fVar;
        this.f81882b = eVar;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        checkTrusted(x509CertificateArr, str, null, socket, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Not enough information to validate peer. SSLEngine or Socket required.");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        checkTrusted(x509CertificateArr, str, sSLEngine, null, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        checkTrusted(x509CertificateArr, str, null, socket, true);
    }

    public void updateTrustCredentialsFromFile(File file) throws GeneralSecurityException, IOException {
        if (readAndUpdate(file, 0L) == 0) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
    }
}
