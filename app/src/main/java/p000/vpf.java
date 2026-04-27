package p000;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public final class vpf extends AbstractC11839r1 implements Serializable {

    /* JADX INFO: renamed from: e */
    public static final lh7 f91941e = new vpf(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final int f91942a;

    /* JADX INFO: renamed from: b */
    public final int f91943b;

    /* JADX INFO: renamed from: c */
    public final long f91944c;

    /* JADX INFO: renamed from: d */
    public final long f91945d;

    /* JADX INFO: renamed from: vpf$a */
    public static final class C14212a extends AbstractC15483y4 {

        /* JADX INFO: renamed from: l */
        public static final int f91946l = 8;

        /* JADX INFO: renamed from: d */
        public final int f91947d;

        /* JADX INFO: renamed from: e */
        public final int f91948e;

        /* JADX INFO: renamed from: f */
        public long f91949f;

        /* JADX INFO: renamed from: g */
        public long f91950g;

        /* JADX INFO: renamed from: h */
        public long f91951h;

        /* JADX INFO: renamed from: i */
        public long f91952i;

        /* JADX INFO: renamed from: j */
        public long f91953j;

        /* JADX INFO: renamed from: k */
        public long f91954k;

        public C14212a(int c, int d, long k0, long k1) {
            super(8);
            this.f91953j = 0L;
            this.f91954k = 0L;
            this.f91947d = c;
            this.f91948e = d;
            this.f91949f = 8317987319222330741L ^ k0;
            this.f91950g = 7237128888997146477L ^ k1;
            this.f91951h = 7816392313619706465L ^ k0;
            this.f91952i = 8387220255154660723L ^ k1;
        }

        private void processM(long m) {
            this.f91952i ^= m;
            sipRound(this.f91947d);
            this.f91949f = m ^ this.f91949f;
        }

        private void sipRound(int iterations) {
            for (int i = 0; i < iterations; i++) {
                long j = this.f91949f;
                long j2 = this.f91950g;
                this.f91949f = j + j2;
                this.f91951h += this.f91952i;
                this.f91950g = Long.rotateLeft(j2, 13);
                long jRotateLeft = Long.rotateLeft(this.f91952i, 16);
                long j3 = this.f91950g;
                long j4 = this.f91949f;
                this.f91950g = j3 ^ j4;
                this.f91952i = jRotateLeft ^ this.f91951h;
                long jRotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f91951h;
                long j6 = this.f91950g;
                this.f91951h = j5 + j6;
                this.f91949f = jRotateLeft2 + this.f91952i;
                this.f91950g = Long.rotateLeft(j6, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f91952i, 21);
                long j7 = this.f91950g;
                long j8 = this.f91951h;
                this.f91950g = j7 ^ j8;
                this.f91952i = jRotateLeft3 ^ this.f91949f;
                this.f91951h = Long.rotateLeft(j8, 32);
            }
        }

        @Override // p000.AbstractC15483y4
        /* JADX INFO: renamed from: a */
        public jh7 mo10527a() {
            long j = this.f91954k ^ (this.f91953j << 56);
            this.f91954k = j;
            processM(j);
            this.f91951h ^= 255;
            sipRound(this.f91948e);
            return jh7.fromLong(((this.f91949f ^ this.f91950g) ^ this.f91951h) ^ this.f91952i);
        }

        @Override // p000.AbstractC15483y4
        /* JADX INFO: renamed from: b */
        public void mo10528b(ByteBuffer buffer) {
            this.f91953j += 8;
            processM(buffer.getLong());
        }

        @Override // p000.AbstractC15483y4
        /* JADX INFO: renamed from: c */
        public void mo10529c(ByteBuffer buffer) {
            this.f91953j += (long) buffer.remaining();
            int i = 0;
            while (buffer.hasRemaining()) {
                this.f91954k ^= (((long) buffer.get()) & 255) << i;
                i += 8;
            }
        }
    }

    public vpf(int c, int d, long k0, long k1) {
        v7d.checkArgument(c > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c);
        v7d.checkArgument(d > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d);
        this.f91942a = c;
        this.f91943b = d;
        this.f91944c = k0;
        this.f91945d = k1;
    }

    @Override // p000.lh7
    public int bits() {
        return 64;
    }

    public boolean equals(@wx1 Object object) {
        if (!(object instanceof vpf)) {
            return false;
        }
        vpf vpfVar = (vpf) object;
        return this.f91942a == vpfVar.f91942a && this.f91943b == vpfVar.f91943b && this.f91944c == vpfVar.f91944c && this.f91945d == vpfVar.f91945d;
    }

    public int hashCode() {
        return (int) ((((long) ((vpf.class.hashCode() ^ this.f91942a) ^ this.f91943b)) ^ this.f91944c) ^ this.f91945d);
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        return new C14212a(this.f91942a, this.f91943b, this.f91944c, this.f91945d);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f91942a + "" + this.f91943b + c0b.f15433c + this.f91944c + ", " + this.f91945d + c0b.f15434d;
    }
}
