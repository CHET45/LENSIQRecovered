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
public final class b3h extends e3f {

    /* JADX INFO: renamed from: a */
    public final boolean f12591a;

    /* JADX INFO: renamed from: b */
    public final byte[] f12592b;

    /* JADX INFO: renamed from: c */
    public final byte[] f12593c;

    /* JADX INFO: renamed from: d */
    public final String f12594d;

    /* JADX INFO: renamed from: e */
    public final List<KeyManager> f12595e;

    /* JADX INFO: renamed from: f */
    public final EnumC1729c f12596f;

    /* JADX INFO: renamed from: g */
    public final byte[] f12597g;

    /* JADX INFO: renamed from: h */
    public final List<TrustManager> f12598h;

    /* JADX INFO: renamed from: b3h$b */
    public static final class C1728b {

        /* JADX INFO: renamed from: a */
        public boolean f12599a;

        /* JADX INFO: renamed from: b */
        public byte[] f12600b;

        /* JADX INFO: renamed from: c */
        public byte[] f12601c;

        /* JADX INFO: renamed from: d */
        public String f12602d;

        /* JADX INFO: renamed from: e */
        public List<KeyManager> f12603e;

        /* JADX INFO: renamed from: f */
        public EnumC1729c f12604f;

        /* JADX INFO: renamed from: g */
        public byte[] f12605g;

        /* JADX INFO: renamed from: h */
        public List<TrustManager> f12606h;

        private void clearKeyManagers() {
            this.f12600b = null;
            this.f12601c = null;
            this.f12602d = null;
            this.f12603e = null;
        }

        private void clearTrustManagers() {
            this.f12605g = null;
            this.f12606h = null;
        }

        public e3f build() {
            if (this.f12600b == null && this.f12603e == null) {
                throw new IllegalStateException("A key manager is required");
            }
            return new b3h(this);
        }

        public C1728b clientAuth(EnumC1729c enumC1729c) {
            v7d.checkNotNull(enumC1729c, "clientAuth");
            this.f12604f = enumC1729c;
            return this;
        }

        public C1728b keyManager(File file, File file2) throws IOException {
            return keyManager(file, file2, (String) null);
        }

        public C1728b requireFakeFeature() {
            this.f12599a = true;
            return this;
        }

        public C1728b trustManager(File file) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return trustManager(fileInputStream);
            } finally {
                fileInputStream.close();
            }
        }

        private C1728b() {
            this.f12604f = EnumC1729c.NONE;
        }

        public C1728b keyManager(File file, File file2, String str) throws IOException {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream = new FileInputStream(file2);
                C1728b c1728bKeyManager = keyManager(fileInputStream, fileInputStream, str);
                fileInputStream.close();
                return c1728bKeyManager;
            } catch (Throwable th) {
                throw th;
            } finally {
                fileInputStream.close();
            }
        }

        public C1728b trustManager(InputStream inputStream) throws IOException {
            byte[] byteArray = tj1.toByteArray(inputStream);
            clearTrustManagers();
            this.f12605g = byteArray;
            return this;
        }

        public C1728b trustManager(TrustManager... trustManagerArr) {
            List<TrustManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
            clearTrustManagers();
            this.f12606h = listUnmodifiableList;
            return this;
        }

        public C1728b keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
            return keyManager(inputStream, inputStream2, (String) null);
        }

        public C1728b keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
            byte[] byteArray = tj1.toByteArray(inputStream);
            byte[] byteArray2 = tj1.toByteArray(inputStream2);
            clearKeyManagers();
            this.f12600b = byteArray;
            this.f12601c = byteArray2;
            this.f12602d = str;
            return this;
        }

        public C1728b keyManager(KeyManager... keyManagerArr) {
            List<KeyManager> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
            clearKeyManagers();
            this.f12603e = listUnmodifiableList;
            return this;
        }
    }

    /* JADX INFO: renamed from: b3h$c */
    public enum EnumC1729c {
        NONE,
        OPTIONAL,
        REQUIRE
    }

    /* JADX INFO: renamed from: b3h$d */
    public enum EnumC1730d {
        FAKE,
        MTLS,
        CUSTOM_MANAGERS
    }

    public b3h(C1728b c1728b) {
        this.f12591a = c1728b.f12599a;
        this.f12592b = c1728b.f12600b;
        this.f12593c = c1728b.f12601c;
        this.f12594d = c1728b.f12602d;
        this.f12595e = c1728b.f12603e;
        this.f12596f = c1728b.f12604f;
        this.f12597g = c1728b.f12605g;
        this.f12598h = c1728b.f12606h;
    }

    public static e3f create(File file, File file2) throws IOException {
        return newBuilder().keyManager(file, file2).build();
    }

    public static C1728b newBuilder() {
        return new C1728b();
    }

    private static void requiredFeature(Set<EnumC1730d> set, Set<EnumC1730d> set2, EnumC1730d enumC1730d) {
        if (set.contains(enumC1730d)) {
            return;
        }
        set2.add(enumC1730d);
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f12592b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public EnumC1729c getClientAuth() {
        return this.f12596f;
    }

    public List<KeyManager> getKeyManagers() {
        return this.f12595e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f12593c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f12594d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f12597g;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f12598h;
    }

    public Set<EnumC1730d> incomprehensible(Set<EnumC1730d> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC1730d.class);
        if (this.f12591a) {
            requiredFeature(set, enumSetNoneOf, EnumC1730d.FAKE);
        }
        if (this.f12596f != EnumC1729c.NONE) {
            requiredFeature(set, enumSetNoneOf, EnumC1730d.MTLS);
        }
        if (this.f12595e != null || this.f12598h != null) {
            requiredFeature(set, enumSetNoneOf, EnumC1730d.CUSTOM_MANAGERS);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static e3f create(InputStream inputStream, InputStream inputStream2) throws IOException {
        return newBuilder().keyManager(inputStream, inputStream2).build();
    }
}
