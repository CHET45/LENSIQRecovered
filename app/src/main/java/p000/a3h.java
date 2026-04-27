package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public final class a3h extends eu1 {

    /* JADX INFO: renamed from: a */
    public final boolean f317a;

    /* JADX INFO: renamed from: b */
    public final byte[] f318b;

    /* JADX INFO: renamed from: c */
    public final byte[] f319c;

    /* JADX INFO: renamed from: d */
    public final String f320d;

    /* JADX INFO: renamed from: e */
    public final List<KeyManager> f321e;

    /* JADX INFO: renamed from: f */
    public final byte[] f322f;

    /* JADX INFO: renamed from: g */
    public final List<TrustManager> f323g;

    /* JADX INFO: renamed from: a3h$b */
    public static final class C0049b {

        /* JADX INFO: renamed from: a */
        public boolean f324a;

        /* JADX INFO: renamed from: b */
        public byte[] f325b;

        /* JADX INFO: renamed from: c */
        public byte[] f326c;

        /* JADX INFO: renamed from: d */
        public String f327d;

        /* JADX INFO: renamed from: e */
        public List<KeyManager> f328e;

        /* JADX INFO: renamed from: f */
        public byte[] f329f;

        /* JADX INFO: renamed from: g */
        public List<TrustManager> f330g;

        private void clearKeyManagers() {
            this.f325b = null;
            this.f326c = null;
            this.f327d = null;
            this.f328e = null;
        }

        private void clearTrustManagers() {
            this.f329f = null;
            this.f330g = null;
        }

        public eu1 build() {
            return new a3h(this);
        }

        public C0049b keyManager(File file, File file2) throws IOException {
            return keyManager(file, file2, (String) null);
        }

        public C0049b requireFakeFeature() {
            this.f324a = true;
            return this;
        }

        public C0049b trustManager(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return trustManager(fileInputStream);
            } finally {
                fileInputStream.close();
            }
        }

        private C0049b() {
        }

        public C0049b keyManager(File file, File file2, String str) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file2);
                C0049b c0049bKeyManager = keyManager(fileInputStream, fileInputStream, str);
                fileInputStream.close();
                return c0049bKeyManager;
            } catch (Throwable th) {
                throw th;
            } finally {
                fileInputStream.close();
            }
        }

        public C0049b trustManager(InputStream inputStream) throws IOException {
            byte[] byteArray = tj1.toByteArray(inputStream);
            clearTrustManagers();
            this.f329f = byteArray;
            return this;
        }

        public C0049b trustManager(TrustManager... trustManagerArr) {
            List<TrustManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            clearTrustManagers();
            this.f330g = listUnmodifiableList;
            return this;
        }

        public C0049b keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public C0049b keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] byteArray = tj1.toByteArray(inputStream);
            byte[] byteArray2 = tj1.toByteArray(inputStream2);
            clearKeyManagers();
            this.f325b = byteArray;
            this.f326c = byteArray2;
            this.f327d = str;
            return this;
        }

        public C0049b keyManager(KeyManager... keyManagerArr) {
            List<KeyManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            clearKeyManagers();
            this.f328e = listUnmodifiableList;
            return this;
        }
    }

    /* JADX INFO: renamed from: a3h$c */
    public enum EnumC0050c {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    public a3h(C0049b c0049b) {
        this.f317a = c0049b.f324a;
        this.f318b = c0049b.f325b;
        this.f319c = c0049b.f326c;
        this.f320d = c0049b.f327d;
        this.f321e = c0049b.f328e;
        this.f322f = c0049b.f329f;
        this.f323g = c0049b.f330g;
    }

    public static eu1 create() {
        return newBuilder().build();
    }

    public static C0049b newBuilder() {
        return new C0049b();
    }

    private static void requiredFeature(Set<EnumC0050c> set, Set<EnumC0050c> set2, EnumC0050c enumC0050c) {
        if (set.contains(enumC0050c)) {
            return;
        }
        set2.add(enumC0050c);
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f318b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<KeyManager> getKeyManagers() {
        return this.f321e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f319c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f320d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f322f;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f323g;
    }

    public Set<EnumC0050c> incomprehensible(Set<EnumC0050c> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC0050c.class);
        if (this.f317a) {
            requiredFeature(set, enumSetNoneOf, EnumC0050c.FAKE);
        }
        if (this.f322f != null || this.f319c != null || this.f321e != null) {
            requiredFeature(set, enumSetNoneOf, EnumC0050c.MTLS);
        }
        if (this.f321e != null || this.f323g != null) {
            requiredFeature(set, enumSetNoneOf, EnumC0050c.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    @Override // p000.eu1
    public eu1 withoutBearerTokens() {
        return this;
    }
}
