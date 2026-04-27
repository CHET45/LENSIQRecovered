package p000;

import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@tw7
public final class ty1 extends AbstractC11839r1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public final sy7<? extends Checksum> f86294a;

    /* JADX INFO: renamed from: b */
    public final int f86295b;

    /* JADX INFO: renamed from: c */
    public final String f86296c;

    /* JADX INFO: renamed from: ty1$b */
    public final class C13282b extends AbstractC7092i0 {

        /* JADX INFO: renamed from: b */
        public final Checksum f86297b;

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: a */
        public void mo12584a(byte b) {
            this.f86297b.update(b);
        }

        @Override // p000.AbstractC7092i0
        /* JADX INFO: renamed from: d */
        public void mo12586d(byte[] bytes, int off, int len) {
            this.f86297b.update(bytes, off, len);
        }

        @Override // p000.wh7
        public jh7 hash() {
            long value = this.f86297b.getValue();
            return ty1.this.f86295b == 32 ? jh7.fromInt((int) value) : jh7.fromLong(value);
        }

        private C13282b(Checksum checksum) {
            this.f86297b = (Checksum) v7d.checkNotNull(checksum);
        }
    }

    public ty1(sy7<? extends Checksum> checksumSupplier, int bits, String toString) {
        this.f86294a = (sy7) v7d.checkNotNull(checksumSupplier);
        v7d.checkArgument(bits == 32 || bits == 64, "bits (%s) must be either 32 or 64", bits);
        this.f86295b = bits;
        this.f86296c = (String) v7d.checkNotNull(toString);
    }

    @Override // p000.lh7
    public int bits() {
        return this.f86295b;
    }

    @Override // p000.lh7
    public wh7 newHasher() {
        return new C13282b(this.f86294a.get());
    }

    public String toString() {
        return this.f86296c;
    }
}
