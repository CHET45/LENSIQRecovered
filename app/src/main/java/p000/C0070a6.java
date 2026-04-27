package p000;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import org.opencv.videoio.Videoio;
import p000.kq6;

/* JADX INFO: renamed from: a6 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C0070a6 {

    /* JADX INFO: renamed from: a */
    public static final int f481a = 44096;

    /* JADX INFO: renamed from: b */
    public static final int f482b = 44097;

    /* JADX INFO: renamed from: c */
    public static final int f483c = 336000;

    /* JADX INFO: renamed from: d */
    public static final int f484d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f485e = 7;

    /* JADX INFO: renamed from: f */
    public static final int f486f = 16;

    /* JADX INFO: renamed from: g */
    public static final int[] f487g = {2002, 2000, 1920, 1601, Videoio.CAP_OPENNI2, 1001, 1000, 960, 800, 800, Videoio.CAP_PROP_XI_CC_MATRIX_01, 400, 400, 2048};

    /* JADX INFO: renamed from: a6$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f488a;

        /* JADX INFO: renamed from: b */
        public final int f489b;

        /* JADX INFO: renamed from: c */
        public final int f490c;

        /* JADX INFO: renamed from: d */
        public final int f491d;

        /* JADX INFO: renamed from: e */
        public final int f492e;

        private b(int i, int i2, int i3, int i4, int i5) {
            this.f488a = i;
            this.f490c = i2;
            this.f489b = i3;
            this.f491d = i4;
            this.f492e = i5;
        }
    }

    private C0070a6() {
    }

    public static void getAc4SampleHeader(int i, ihc ihcVar) {
        ihcVar.reset(7);
        byte[] data = ihcVar.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i >> 16) & 255);
        data[5] = (byte) ((i >> 8) & 255);
        data[6] = (byte) (i & 255);
    }

    public static kq6 parseAc4AnnexEFormat(ihc ihcVar, String str, String str2, @hib DrmInitData drmInitData) {
        ihcVar.skipBytes(1);
        return new kq6.C8497b().setId(str).setSampleMimeType("audio/ac4").setChannelCount(2).setSampleRate(((ihcVar.readUnsignedByte() & 32) >> 5) == 1 ? 48000 : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new ghc(bArr)).f492e;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C0070a6.b parseAc4SyncframeInfo(p000.ghc r11) {
        /*
            r0 = 16
            int r1 = r11.readBits(r0)
            int r0 = r11.readBits(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.readBits(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.readBits(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = readVariableBits(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.readBits(r1)
            boolean r4 = r11.readBit()
            if (r4 == 0) goto L45
            int r4 = r11.readBits(r2)
            if (r4 <= 0) goto L45
            r11.skipBits(r0)
        L45:
            boolean r4 = r11.readBit()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r9 = r7
            goto L54
        L53:
            r9 = r6
        L54:
            int r11 = r11.readBits(r3)
            if (r9 != r6) goto L63
            r4 = 13
            if (r11 != r4) goto L63
            int[] r0 = p000.C0070a6.f487g
            r11 = r0[r11]
            goto L91
        L63:
            if (r9 != r7) goto L90
            int[] r4 = p000.C0070a6.f487g
            int r6 = r4.length
            if (r11 >= r6) goto L90
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L8b
            r7 = 11
            if (r1 == r0) goto L86
            if (r1 == r2) goto L8b
            if (r1 == r3) goto L7c
            goto L84
        L7c:
            if (r11 == r2) goto L82
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
        L82:
            int r4 = r4 + 1
        L84:
            r11 = r4
            goto L91
        L86:
            if (r11 == r6) goto L82
            if (r11 != r7) goto L84
            goto L82
        L8b:
            if (r11 == r2) goto L82
            if (r11 != r6) goto L84
            goto L82
        L90:
            r11 = 0
        L91:
            a6$b r0 = new a6$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0070a6.parseAc4SyncframeInfo(ghc):a6$b");
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static int readVariableBits(ghc ghcVar, int i) {
        int i2 = 0;
        while (true) {
            int bits = i2 + ghcVar.readBits(i);
            if (!ghcVar.readBit()) {
                return bits;
            }
            i2 = (bits + 1) << i;
        }
    }
}
