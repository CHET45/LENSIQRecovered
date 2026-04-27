package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;

/* JADX INFO: renamed from: ri */
/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/8024")
public final class C12101ri extends X509ExtendedKeyManager {

    /* JADX INFO: renamed from: b */
    public static final Logger f78356b = Logger.getLogger(C12101ri.class.getName());

    /* JADX INFO: renamed from: a */
    public volatile c f78357a;

    /* JADX INFO: renamed from: ri$a */
    public class a implements b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScheduledFuture f78358a;

        public a(ScheduledFuture scheduledFuture) {
            this.f78358a = scheduledFuture;
        }

        @Override // p000.C12101ri.b, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f78358a.cancel(false);
        }
    }

    /* JADX INFO: renamed from: ri$b */
    public interface b extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();
    }

    /* JADX INFO: renamed from: ri$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final PrivateKey f78360a;

        /* JADX INFO: renamed from: b */
        public final X509Certificate[] f78361b;

        public c(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.f78360a = privateKey;
            this.f78361b = x509CertificateArr;
        }
    }

    /* JADX INFO: renamed from: ri$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public File f78362a;

        /* JADX INFO: renamed from: b */
        public File f78363b;

        /* JADX INFO: renamed from: c */
        public long f78364c = 0;

        /* JADX INFO: renamed from: d */
        public long f78365d = 0;

        public d(File file, File file2) {
            this.f78362a = file;
            this.f78363b = file2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e andUpdate = C12101ri.this.readAndUpdate(this.f78362a, this.f78363b, this.f78364c, this.f78365d);
                if (andUpdate.f78367a) {
                    this.f78364c = andUpdate.f78368b;
                    this.f78365d = andUpdate.f78369c;
                }
            } catch (IOException | GeneralSecurityException e) {
                C12101ri.f78356b.log(Level.SEVERE, "Failed refreshing private key and certificate chain from files. Using previous ones", e);
            }
        }
    }

    /* JADX INFO: renamed from: ri$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public boolean f78367a;

        /* JADX INFO: renamed from: b */
        public long f78368b;

        /* JADX INFO: renamed from: c */
        public long f78369c;

        public e(boolean z, long j, long j2) {
            this.f78367a = z;
            this.f78368b = j;
            this.f78369c = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e readAndUpdate(File file, File file2, long j, long j2) throws Throwable {
        long jLastModified = file.lastModified();
        long jLastModified2 = file2.lastModified();
        if (jLastModified == j || jLastModified2 == j2) {
            return new e(false, j, j2);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                PrivateKey privateKey = pt1.getPrivateKey(fileInputStream);
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    updateIdentityCredentials(privateKey, pt1.getX509Certificates(fileInputStream2));
                    e eVar = new e(true, jLastModified, jLastModified2);
                    fileInputStream2.close();
                    fileInputStream.close();
                    return eVar;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream.close();
            throw th;
        }
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return "default";
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        if (str.equals("default")) {
            return (X509Certificate[]) Arrays.copyOf(this.f78357a.f78361b, this.f78357a.f78361b.length);
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        if (str.equals("default")) {
            return this.f78357a.f78360a;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return new String[]{"default"};
    }

    public void updateIdentityCredentials(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
        this.f78357a = new c((PrivateKey) v7d.checkNotNull(privateKey, "key"), (X509Certificate[]) v7d.checkNotNull(x509CertificateArr, "certs"));
    }

    public b updateIdentityCredentialsFromFile(File file, File file2, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) throws GeneralSecurityException, IOException {
        if (readAndUpdate(file, file2, 0L, 0L).f78367a) {
            return new a(scheduledExecutorService.scheduleWithFixedDelay(new d(file, file2), j, j, timeUnit));
        }
        throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
    }

    public void updateIdentityCredentialsFromFile(File file, File file2) throws GeneralSecurityException, IOException {
        if (!readAndUpdate(file, file2, 0L, 0L).f78367a) {
            throw new GeneralSecurityException("Files were unmodified before their initial update. Probably a bug.");
        }
    }
}
