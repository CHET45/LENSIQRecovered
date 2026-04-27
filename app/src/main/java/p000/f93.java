package p000;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class f93 {

    /* JADX INFO: renamed from: a */
    @hib
    public byte[] f35746a;

    /* JADX INFO: renamed from: b */
    @hib
    public byte[] f35747b;

    /* JADX INFO: renamed from: c */
    public int f35748c;

    /* JADX INFO: renamed from: d */
    @hib
    public int[] f35749d;

    /* JADX INFO: renamed from: e */
    @hib
    public int[] f35750e;

    /* JADX INFO: renamed from: f */
    public int f35751f;

    /* JADX INFO: renamed from: g */
    public int f35752g;

    /* JADX INFO: renamed from: h */
    public int f35753h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f35754i;

    /* JADX INFO: renamed from: j */
    @hib
    public final C5682b f35755j;

    /* JADX INFO: renamed from: f93$b */
    @c5e(24)
    public static final class C5682b {

        /* JADX INFO: renamed from: a */
        public final MediaCodec.CryptoInfo f35756a;

        /* JADX INFO: renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f35757b;

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i, int i2) {
            this.f35757b.set(i, i2);
            this.f35756a.setPattern(this.f35757b);
        }

        private C5682b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f35756a = cryptoInfo;
            this.f35757b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public f93() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f35754i = cryptoInfo;
        this.f35755j = new C5682b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.f35754i;
    }

    public void increaseClearDataFirstSubSampleBy(int i) {
        if (i == 0) {
            return;
        }
        if (this.f35749d == null) {
            int[] iArr = new int[1];
            this.f35749d = iArr;
            this.f35754i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f35749d;
        iArr2[0] = iArr2[0] + i;
    }

    public void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f35751f = i;
        this.f35749d = iArr;
        this.f35750e = iArr2;
        this.f35747b = bArr;
        this.f35746a = bArr2;
        this.f35748c = i2;
        this.f35752g = i3;
        this.f35753h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f35754i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        ((C5682b) v80.checkNotNull(this.f35755j)).set(i3, i4);
    }
}
