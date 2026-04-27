package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public final class hsa extends AbstractC11839r1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final MessageDigest f44707a;

    /* JADX INFO: renamed from: b */
    public final int f44708b;

    /* JADX INFO: renamed from: c */
    public final boolean f44709c;

    /* JADX INFO: renamed from: d */
    public final String f44710d;

    /* JADX INFO: renamed from: hsa$b */
    public static final class C6990b extends AbstractC7092i0 {

        /* JADX INFO: renamed from: b */
        public final MessageDigest f44711b;

        /* JADX INFO: renamed from: c */
        public final int f44712c;

        /* JADX INFO: renamed from: d */
        public boolean f44713d;

        private void checkNotDone() {
            v7d.checkState(!this.f44713d, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: a */
        public void mo12584a(byte b) {
            checkNotDone();
            this.f44711b.update(b);
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: b */
        public void mo12585b(ByteBuffer bytes) {
            checkNotDone();
            this.f44711b.update(bytes);
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: d */
        public void mo12586d(byte[] b, int off, int len) {
            checkNotDone();
            this.f44711b.update(b, off, len);
        }

        @Override // p000.wh7
        public jh7 hash() {
            checkNotDone();
            this.f44713d = true;
            return this.f44712c == this.f44711b.getDigestLength() ? jh7.m14081b(this.f44711b.digest()) : jh7.m14081b(Arrays.copyOf(this.f44711b.digest(), this.f44712c));
        }

        private C6990b(MessageDigest digest, int bytes) {
            this.f44711b = digest;
            this.f44712c = bytes;
        }
    }

    /* JADX INFO: renamed from: hsa$c */
    public static final class C6991c implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final String f44714a;

        /* JADX INFO: renamed from: b */
        public final int f44715b;

        /* JADX INFO: renamed from: c */
        public final String f44716c;

        private Object readResolve() {
            return new hsa(this.f44714a, this.f44715b, this.f44716c);
        }

        private C6991c(String algorithmName, int bytes, String toString) {
            this.f44714a = algorithmName;
            this.f44715b = bytes;
            this.f44716c = toString;
        }
    }

    public hsa(String algorithmName, String toString) {
        MessageDigest messageDigest = getMessageDigest(algorithmName);
        this.f44707a = messageDigest;
        this.f44708b = messageDigest.getDigestLength();
        this.f44710d = (String) v7d.checkNotNull(toString);
        this.f44709c = supportsClone(messageDigest);
    }

    private static MessageDigest getMessageDigest(String algorithmName) {
        try {
            return MessageDigest.getInstance(algorithmName);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static boolean supportsClone(MessageDigest digest) {
        try {
            digest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // p000.lh7
    public int bits() {
        return this.f44708b * 8;
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        if (this.f44709c) {
            try {
                return new C6990b((MessageDigest) this.f44707a.clone(), this.f44708b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C6990b(getMessageDigest(this.f44707a.getAlgorithm()), this.f44708b);
    }

    public String toString() {
        return this.f44710d;
    }

    public Object writeReplace() {
        return new C6991c(this.f44707a.getAlgorithm(), this.f44708b, this.f44710d);
    }

    public hsa(String algorithmName, int bytes, String toString) {
        this.f44710d = (String) v7d.checkNotNull(toString);
        MessageDigest messageDigest = getMessageDigest(algorithmName);
        this.f44707a = messageDigest;
        int digestLength = messageDigest.getDigestLength();
        v7d.checkArgument(bytes >= 4 && bytes <= digestLength, "bytes (%s) must be >= 4 and < %s", bytes, digestLength);
        this.f44708b = bytes;
        this.f44709c = supportsClone(messageDigest);
    }
}
