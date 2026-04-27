package p000;

import androidx.mediarouter.media.C1340j;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class os4 {

    /* JADX INFO: renamed from: a */
    public static final int f68534a = 192000;

    /* JADX INFO: renamed from: b */
    public static final int f68535b = 2250000;

    /* JADX INFO: renamed from: c */
    public static final int f68536c = 2147385345;

    /* JADX INFO: renamed from: d */
    public static final int f68537d = 536864768;

    /* JADX INFO: renamed from: e */
    public static final int f68538e = -25230976;

    /* JADX INFO: renamed from: f */
    public static final int f68539f = -14745368;

    /* JADX INFO: renamed from: g */
    public static final int f68540g = 622876772;

    /* JADX INFO: renamed from: h */
    public static final int f68541h = -233094848;

    /* JADX INFO: renamed from: i */
    public static final int f68542i = -398277519;

    /* JADX INFO: renamed from: j */
    public static final byte f68543j = 127;

    /* JADX INFO: renamed from: k */
    public static final byte f68544k = 31;

    /* JADX INFO: renamed from: l */
    public static final byte f68545l = -2;

    /* JADX INFO: renamed from: m */
    public static final byte f68546m = -1;

    /* JADX INFO: renamed from: n */
    public static final int[] f68547n = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: o */
    public static final int[] f68548o = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, x45.f96561k3, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: p */
    public static final int[] f68549p = {64, 112, 128, 192, 224, 256, 384, Videoio.CAP_PROP_XI_WB_KR, 512, Imgcodecs.IMWRITE_JPEGXL_QUALITY, 768, C1340j.f10444b, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, kw1.f55470l, 3840, 4096, 6144, 7680};

    private os4() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getDtsFrameSize(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.os4.getDtsFrameSize(byte[]):int");
    }

    private static ghc getNormalizedFrameHeader(byte[] bArr) {
        if (bArr[0] == 127) {
            return new ghc(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b;
            }
        }
        ghc ghcVar = new ghc(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ghc ghcVar2 = new ghc(bArrCopyOf);
            while (ghcVar2.bitsLeft() >= 16) {
                ghcVar2.skipBits(2);
                ghcVar.putInt(ghcVar2.readBits(14), 14);
            }
        }
        ghcVar.reset(bArrCopyOf);
        return ghcVar;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1;
    }

    public static boolean isSyncWord(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & BuiltinOptions.LogicalOrOptions;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    public static kq6 parseDtsFormat(byte[] bArr, @hib String str, @hib String str2, @hib DrmInitData drmInitData) {
        ghc normalizedFrameHeader = getNormalizedFrameHeader(bArr);
        normalizedFrameHeader.skipBits(60);
        int i = f68547n[normalizedFrameHeader.readBits(6)];
        int i2 = f68548o[normalizedFrameHeader.readBits(4)];
        int bits = normalizedFrameHeader.readBits(5);
        int[] iArr = f68549p;
        int i3 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrameHeader.skipBits(10);
        return new kq6.C8497b().setId(str).setSampleMimeType("audio/vnd.dts").setAverageBitrate(i3).setChannelCount(i + (normalizedFrameHeader.readBits(2) > 0 ? 1 : 0)).setSampleRate(i2).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            }
            i2 = b2 & BuiltinOptions.LogicalOrOptions;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }
}
