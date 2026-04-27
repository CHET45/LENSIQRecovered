package p000;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public final class rq9 extends AbstractC11839r1 {

    /* JADX INFO: renamed from: a */
    public final Mac f79029a;

    /* JADX INFO: renamed from: b */
    public final Key f79030b;

    /* JADX INFO: renamed from: c */
    public final String f79031c;

    /* JADX INFO: renamed from: d */
    public final int f79032d;

    /* JADX INFO: renamed from: e */
    public final boolean f79033e;

    /* JADX INFO: renamed from: rq9$b */
    public static final class C12205b extends AbstractC7092i0 {

        /* JADX INFO: renamed from: b */
        public final Mac f79034b;

        /* JADX INFO: renamed from: c */
        public boolean f79035c;

        private void checkNotDone() {
            v7d.checkState(!this.f79035c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: a */
        public void mo12584a(byte b) {
            checkNotDone();
            this.f79034b.update(b);
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: b */
        public void mo12585b(ByteBuffer bytes) {
            checkNotDone();
            v7d.checkNotNull(bytes);
            this.f79034b.update(bytes);
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: c */
        public void mo12679c(byte[] b) {
            checkNotDone();
            this.f79034b.update(b);
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: d */
        public void mo12586d(byte[] b, int off, int len) {
            checkNotDone();
            this.f79034b.update(b, off, len);
        }

        @Override // p000.wh7
        public jh7 hash() {
            checkNotDone();
            this.f79035c = true;
            return jh7.m14081b(this.f79034b.doFinal());
        }

        private C12205b(Mac mac) {
            this.f79034b = mac;
        }
    }

    public rq9(String algorithmName, Key key, String toString) {
        Mac mac = getMac(algorithmName, key);
        this.f79029a = mac;
        this.f79030b = (Key) v7d.checkNotNull(key);
        this.f79031c = (String) v7d.checkNotNull(toString);
        this.f79032d = mac.getMacLength() * 8;
        this.f79033e = supportsClone(mac);
    }

    private static Mac getMac(String algorithmName, Key key) {
        try {
            Mac mac = Mac.getInstance(algorithmName);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static boolean supportsClone(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // p000.lh7
    public int bits() {
        return this.f79032d;
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        if (this.f79033e) {
            try {
                return new C12205b((Mac) this.f79029a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C12205b(getMac(this.f79029a.getAlgorithm(), this.f79030b));
    }

    public String toString() {
        return this.f79031c;
    }
}
