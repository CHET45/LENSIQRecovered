package p000;

import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import androidx.mediarouter.media.C1340j;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ns4 {

    /* JADX INFO: renamed from: A */
    public static final byte f65436A = 113;

    /* JADX INFO: renamed from: B */
    public static final byte f65437B = -24;

    /* JADX INFO: renamed from: C */
    public static final int[] f65438C = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: D */
    public static final int[] f65439D = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, x45.f96561k3, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: E */
    public static final int[] f65440E = {64, 112, 128, 192, 224, 256, 384, Videoio.CAP_PROP_XI_WB_KR, 512, Imgcodecs.IMWRITE_JPEGXL_QUALITY, 768, C1340j.f10444b, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, kw1.f55470l, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: F */
    public static final int[] f65441F = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, x45.f96561k3, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: G */
    public static final int[] f65442G = {5, 8, 10, 12};

    /* JADX INFO: renamed from: H */
    public static final int[] f65443H = {6, 9, 12, 15};

    /* JADX INFO: renamed from: I */
    public static final int[] f65444I = {2, 4, 6, 8};

    /* JADX INFO: renamed from: J */
    public static final int[] f65445J = {9, 11, 13, 16};

    /* JADX INFO: renamed from: K */
    public static final int[] f65446K = {5, 8, 10, 12};

    /* JADX INFO: renamed from: a */
    public static final int f65447a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f65448b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f65449c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f65450d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f65451e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f65452f = 192000;

    /* JADX INFO: renamed from: g */
    public static final int f65453g = 2250000;

    /* JADX INFO: renamed from: h */
    public static final int f65454h = 768000;

    /* JADX INFO: renamed from: i */
    public static final int f65455i = 2147385345;

    /* JADX INFO: renamed from: j */
    public static final int f65456j = 536864768;

    /* JADX INFO: renamed from: k */
    public static final int f65457k = -25230976;

    /* JADX INFO: renamed from: l */
    public static final int f65458l = -14745368;

    /* JADX INFO: renamed from: m */
    public static final int f65459m = 1683496997;

    /* JADX INFO: renamed from: n */
    public static final int f65460n = 622876772;

    /* JADX INFO: renamed from: o */
    public static final int f65461o = 1078008818;

    /* JADX INFO: renamed from: p */
    public static final int f65462p = -233094848;

    /* JADX INFO: renamed from: q */
    public static final int f65463q = 1908687592;

    /* JADX INFO: renamed from: r */
    public static final int f65464r = -398277519;

    /* JADX INFO: renamed from: s */
    public static final byte f65465s = 127;

    /* JADX INFO: renamed from: t */
    public static final byte f65466t = 31;

    /* JADX INFO: renamed from: u */
    public static final byte f65467u = -2;

    /* JADX INFO: renamed from: v */
    public static final byte f65468v = -1;

    /* JADX INFO: renamed from: w */
    public static final byte f65469w = 100;

    /* JADX INFO: renamed from: x */
    public static final byte f65470x = 37;

    /* JADX INFO: renamed from: y */
    public static final byte f65471y = 64;

    /* JADX INFO: renamed from: z */
    public static final byte f65472z = -14;

    /* JADX INFO: renamed from: ns4$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10035b {
    }

    /* JADX INFO: renamed from: ns4$c */
    public static final class C10036c {

        /* JADX INFO: renamed from: a */
        public final String f65473a;

        /* JADX INFO: renamed from: b */
        public final int f65474b;

        /* JADX INFO: renamed from: c */
        public final int f65475c;

        /* JADX INFO: renamed from: d */
        public final int f65476d;

        /* JADX INFO: renamed from: e */
        public final long f65477e;

        /* JADX INFO: renamed from: f */
        public final int f65478f;

        private C10036c(String str, int i, int i2, int i3, long j, int i4) {
            this.f65473a = str;
            this.f65475c = i;
            this.f65474b = i2;
            this.f65476d = i3;
            this.f65477e = j;
            this.f65478f = i4;
        }
    }

    /* JADX INFO: renamed from: ns4$d */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10037d {
    }

    private ns4() {
    }

    private static void checkCrc(byte[] bArr, int i) throws yhc {
        int i2 = i - 2;
        if (((bArr[i - 1] & 255) | ((bArr[i2] << 8) & 65535)) != t0i.crc16(bArr, 0, i2, 65535)) {
            throw yhc.createForMalformedContainer("CRC check failed", null);
        }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ns4.getDtsFrameSize(byte[]):int");
    }

    public static int getFrameType(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    private static hhc getNormalizedFrame(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new hhc(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        hhc hhcVar = new hhc(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            hhc hhcVar2 = new hhc(bArrCopyOf);
            while (hhcVar2.bitsLeft() >= 16) {
                hhcVar2.skipBits(2);
                hhcVar.putInt(hhcVar2.readBits(14), 14);
            }
        }
        hhcVar.reset(bArrCopyOf);
        return hhcVar;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1 || b == 37 || b == -14 || b == -24;
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

    public static C1213a parseDtsFormat(byte[] bArr, @hib String str, @hib String str2, int i, String str3, @hib DrmInitData drmInitData) {
        hhc normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i2 = f65438C[normalizedFrame.readBits(6)];
        int i3 = f65439D[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = f65440E;
        int i4 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrame.skipBits(10);
        return new C1213a.b().setId(str).setContainerMimeType(str3).setSampleMimeType("audio/vnd.dts").setAverageBitrate(i4).setChannelCount(i2 + (normalizedFrame.readBits(2) > 0 ? 1 : 0)).setSampleRate(i3).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i).build();
    }

    public static C10036c parseDtsHdHeader(byte[] bArr) throws yhc {
        int i;
        int i2;
        int bits;
        int i3;
        int bits2;
        long jScaleLargeTimestamp;
        int i4;
        hhc normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits3 = normalizedFrame.readBits(2);
        if (normalizedFrame.readBit()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        normalizedFrame.skipBits(i2);
        int bits4 = normalizedFrame.readBits(i) + 1;
        boolean bit = normalizedFrame.readBit();
        int i5 = 0;
        if (bit) {
            bits = normalizedFrame.readBits(2);
            int bits5 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 != 1 || bits7 != 1) {
                throw yhc.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
            int i6 = bits3 + 1;
            int bits8 = normalizedFrame.readBits(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((bits8 >> i7) & 1) == 1) {
                    normalizedFrame.skipBits(8);
                }
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(2);
                int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                int bits10 = normalizedFrame.readBits(2) + 1;
                while (i5 < bits10) {
                    normalizedFrame.skipBits(bits9);
                    i5++;
                }
            }
            i5 = bits5;
        } else {
            bits = -1;
        }
        normalizedFrame.skipBits(i);
        normalizedFrame.skipBits(12);
        if (bit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            int i8 = f65441F[normalizedFrame.readBits(4)];
            bits2 = normalizedFrame.readBits(8) + 1;
            i3 = i8;
        } else {
            i3 = -2147483647;
            bits2 = -1;
        }
        if (bit) {
            if (bits == 0) {
                i4 = 32000;
            } else if (bits == 1) {
                i4 = 44100;
            } else {
                if (bits != 2) {
                    throw yhc.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                }
                i4 = 48000;
            }
            jScaleLargeTimestamp = t0i.scaleLargeTimestamp(i5, 1000000L, i4);
        } else {
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        return new C10036c("audio/vnd.dts.hd;profile=lbr", bits2, i3, bits4, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        hhc normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        return normalizedFrame.readBits(normalizedFrame.readBit() ? 12 : 8) + 1;
    }

    public static C10036c parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws yhc {
        int bits;
        long jScaleLargeTimestamp;
        int i;
        int i2;
        hhc normalizedFrame = getNormalizedFrame(bArr);
        int i3 = normalizedFrame.readBits(32) == 1078008818 ? 1 : 0;
        int unsignedVarInt = parseUnsignedVarInt(normalizedFrame, f65442G, true) + 1;
        if (i3 == 0) {
            bits = -2147483647;
            jScaleLargeTimestamp = -9223372036854775807L;
        } else {
            if (!normalizedFrame.readBit()) {
                throw yhc.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
            checkCrc(bArr, unsignedVarInt);
            int bits2 = normalizedFrame.readBits(2);
            if (bits2 == 0) {
                i = 512;
            } else if (bits2 == 1) {
                i = Videoio.CAP_PROP_XI_CC_MATRIX_01;
            } else {
                if (bits2 != 2) {
                    throw yhc.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                }
                i = 384;
            }
            int bits3 = i * (normalizedFrame.readBits(3) + 1);
            int bits4 = normalizedFrame.readBits(2);
            if (bits4 == 0) {
                i2 = 32000;
            } else if (bits4 == 1) {
                i2 = 44100;
            } else {
                if (bits4 != 2) {
                    throw yhc.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                }
                i2 = 48000;
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            bits = (1 << normalizedFrame.readBits(2)) * i2;
            jScaleLargeTimestamp = t0i.scaleLargeTimestamp(bits3, 1000000L, i2);
        }
        int i4 = bits;
        long j = jScaleLargeTimestamp;
        int unsignedVarInt2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            unsignedVarInt2 += parseUnsignedVarInt(normalizedFrame, f65443H, true);
        }
        if (i3 != 0) {
            atomicInteger.set(parseUnsignedVarInt(normalizedFrame, f65444I, true));
        }
        return new C10036c("audio/vnd.dts.uhd;profile=p2", 2, i4, unsignedVarInt + unsignedVarInt2 + (atomicInteger.get() != 0 ? parseUnsignedVarInt(normalizedFrame, f65445J, true) : 0), j, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        hhc normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, f65446K, true) + 1;
    }

    private static int parseUnsignedVarInt(hhc hhcVar, int[] iArr, boolean z) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && hhcVar.readBit(); i3++) {
            i2++;
        }
        if (z) {
            int i4 = 0;
            while (i < i2) {
                i4 += 1 << iArr[i];
                i++;
            }
            i = i4;
        }
        return i + hhcVar.readBits(iArr[i2]);
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
