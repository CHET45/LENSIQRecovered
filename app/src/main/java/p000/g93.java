package p000;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g93 {

    /* JADX INFO: renamed from: a */
    @hib
    public byte[] f39028a;

    /* JADX INFO: renamed from: b */
    @hib
    public byte[] f39029b;

    /* JADX INFO: renamed from: c */
    public int f39030c;

    /* JADX INFO: renamed from: d */
    @hib
    public int[] f39031d;

    /* JADX INFO: renamed from: e */
    @hib
    public int[] f39032e;

    /* JADX INFO: renamed from: f */
    public int f39033f;

    /* JADX INFO: renamed from: g */
    public int f39034g;

    /* JADX INFO: renamed from: h */
    public int f39035h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f39036i;

    /* JADX INFO: renamed from: j */
    @hib
    public final C6171b f39037j;

    /* JADX INFO: renamed from: g93$b */
    @c5e(24)
    public static final class C6171b {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f39038a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f39039b;

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i, int i2) {
            this.f39039b.set(i, i2);
            this.f39038a.setPattern(this.f39039b);
        }

        private C6171b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f39038a = cryptoInfo;
            this.f39039b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public g93() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f39036i = cryptoInfo;
        this.f39037j = x0i.f95978a >= 24 ? new C6171b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.f39036i;
    }

    public void increaseClearDataFirstSubSampleBy(int i) {
        if (i == 0) {
            return;
        }
        if (this.f39031d == null) {
            int[] iArr = new int[1];
            this.f39031d = iArr;
            this.f39036i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f39031d;
        iArr2[0] = iArr2[0] + i;
    }

    public void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f39033f = i;
        this.f39031d = iArr;
        this.f39032e = iArr2;
        this.f39029b = bArr;
        this.f39028a = bArr2;
        this.f39030c = i2;
        this.f39034g = i3;
        this.f39035h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f39036i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (x0i.f95978a >= 24) {
            ((C6171b) u80.checkNotNull(this.f39037j)).set(i3, i4);
        }
    }
}
