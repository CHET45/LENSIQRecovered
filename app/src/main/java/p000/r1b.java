package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class r1b {

    /* JADX INFO: renamed from: a */
    public static final int f76748a = 12583333;

    /* JADX INFO: renamed from: r1b$b */
    public static class C11845b {

        /* JADX INFO: renamed from: d */
        public static final int f76749d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f76750e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f76751f = 2;

        /* JADX INFO: renamed from: g */
        public static final int f76752g = 3;

        /* JADX INFO: renamed from: h */
        public static final int f76753h = 6;

        /* JADX INFO: renamed from: i */
        public static final int f76754i = 7;

        /* JADX INFO: renamed from: j */
        public static final int f76755j = 8;

        /* JADX INFO: renamed from: k */
        public static final int f76756k = 9;

        /* JADX INFO: renamed from: l */
        public static final int f76757l = 10;

        /* JADX INFO: renamed from: m */
        public static final int f76758m = 11;

        /* JADX INFO: renamed from: n */
        public static final int f76759n = 12;

        /* JADX INFO: renamed from: o */
        public static final int f76760o = 13;

        /* JADX INFO: renamed from: p */
        public static final int f76761p = 14;

        /* JADX INFO: renamed from: q */
        public static final int f76762q = 15;

        /* JADX INFO: renamed from: r */
        public static final int f76763r = 16;

        /* JADX INFO: renamed from: s */
        public static final int f76764s = 17;

        /* JADX INFO: renamed from: t */
        public static final int f76765t = 18;

        /* JADX INFO: renamed from: u */
        public static final int f76766u = 19;

        /* JADX INFO: renamed from: v */
        public static final int f76767v = 20;

        /* JADX INFO: renamed from: w */
        public static final int f76768w = 21;

        /* JADX INFO: renamed from: x */
        public static final int f76769x = 22;

        /* JADX INFO: renamed from: a */
        public int f76770a;

        /* JADX INFO: renamed from: b */
        public long f76771b;

        /* JADX INFO: renamed from: c */
        public int f76772c;

        /* JADX INFO: renamed from: r1b$b$a */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }

    /* JADX INFO: renamed from: r1b$c */
    public static class C11846c {

        /* JADX INFO: renamed from: a */
        public final int f76773a;

        /* JADX INFO: renamed from: b */
        public final int f76774b;

        /* JADX INFO: renamed from: c */
        public final int f76775c;

        /* JADX INFO: renamed from: d */
        @hib
        public final byte[] f76776d;

        private C11846c(int i, int i2, int i3, @hib byte[] bArr) {
            this.f76773a = i;
            this.f76774b = i2;
            this.f76775c = i3;
            this.f76776d = bArr;
        }
    }

    private r1b() {
    }

    private static int getOutputFrameLength(int i) throws yhc {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw yhc.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i);
    }

    private static double getResamplingRatio(int i) throws yhc {
        switch (i) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw yhc.createForUnsupportedContainerFeature("Unsupported sampling rate " + i);
        }
    }

    private static int getSamplingFrequency(int i) throws yhc {
        switch (i) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return x45.f96561k3;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw yhc.createForUnsupportedContainerFeature("Unsupported sampling rate index " + i);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int getSbrRatioIndex(int i) throws yhc {
        if (i == 0 || i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                throw yhc.createForUnsupportedContainerFeature("Unsupported coreSbrFrameLengthIndex " + i);
            }
        }
        return i2;
    }

    public static boolean isSyncWord(int i) {
        return (i & 16777215) == 12583333;
    }

    public static int parseAudioTruncationInfo(hhc hhcVar) {
        if (!hhcVar.readBit()) {
            return 0;
        }
        hhcVar.skipBits(2);
        return hhcVar.readBits(13);
    }

    public static boolean parseMhasPacketHeader(hhc hhcVar, C11845b c11845b) throws yhc {
        hhcVar.getBytePosition();
        int escapedIntValue = readEscapedIntValue(hhcVar, 3, 8, 8);
        c11845b.f76770a = escapedIntValue;
        if (escapedIntValue == -1) {
            return false;
        }
        long escapedLongValue = readEscapedLongValue(hhcVar, 2, 8, 32);
        c11845b.f76771b = escapedLongValue;
        if (escapedLongValue == -1) {
            return false;
        }
        if (escapedLongValue > 16) {
            throw yhc.createForUnsupportedContainerFeature("Contains sub-stream with an invalid packet label " + c11845b.f76771b);
        }
        if (escapedLongValue == 0) {
            int i = c11845b.f76770a;
            if (i == 1) {
                throw yhc.createForMalformedContainer("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw yhc.createForMalformedContainer("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw yhc.createForMalformedContainer("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int escapedIntValue2 = readEscapedIntValue(hhcVar, 11, 24, 24);
        c11845b.f76772c = escapedIntValue2;
        return escapedIntValue2 != -1;
    }

    public static C11846c parseMpegh3daConfig(hhc hhcVar) throws yhc {
        int bits = hhcVar.readBits(8);
        int bits2 = hhcVar.readBits(5);
        int bits3 = bits2 == 31 ? hhcVar.readBits(24) : getSamplingFrequency(bits2);
        int bits4 = hhcVar.readBits(3);
        int outputFrameLength = getOutputFrameLength(bits4);
        int sbrRatioIndex = getSbrRatioIndex(bits4);
        hhcVar.skipBits(2);
        skipSpeakerConfig3d(hhcVar);
        skipMpegh3daDecoderConfig(hhcVar, parseSignals3d(hhcVar), sbrRatioIndex);
        byte[] bArr = null;
        if (hhcVar.readBit()) {
            int escapedIntValue = readEscapedIntValue(hhcVar, 2, 4, 8) + 1;
            for (int i = 0; i < escapedIntValue; i++) {
                int escapedIntValue2 = readEscapedIntValue(hhcVar, 4, 8, 16);
                int escapedIntValue3 = readEscapedIntValue(hhcVar, 4, 8, 16);
                if (escapedIntValue2 == 7) {
                    int bits5 = hhcVar.readBits(4) + 1;
                    hhcVar.skipBits(4);
                    byte[] bArr2 = new byte[bits5];
                    for (int i2 = 0; i2 < bits5; i2++) {
                        bArr2[i2] = (byte) hhcVar.readBits(8);
                    }
                    bArr = bArr2;
                } else {
                    hhcVar.skipBits(escapedIntValue3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double resamplingRatio = getResamplingRatio(bits3);
        return new C11846c(bits, (int) (((double) bits3) * resamplingRatio), (int) (((double) outputFrameLength) * resamplingRatio), bArr3);
    }

    private static boolean parseMpegh3daCoreConfig(hhc hhcVar) {
        hhcVar.skipBits(3);
        boolean bit = hhcVar.readBit();
        if (bit) {
            hhcVar.skipBits(13);
        }
        return bit;
    }

    private static int parseSignals3d(hhc hhcVar) {
        int bits = hhcVar.readBits(5);
        int escapedIntValue = 0;
        for (int i = 0; i < bits + 1; i++) {
            int bits2 = hhcVar.readBits(3);
            escapedIntValue += readEscapedIntValue(hhcVar, 5, 8, 16) + 1;
            if ((bits2 == 0 || bits2 == 2) && hhcVar.readBit()) {
                skipSpeakerConfig3d(hhcVar);
            }
        }
        return escapedIntValue;
    }

    private static int readEscapedIntValue(hhc hhcVar, int i, int i2, int i3) {
        v80.checkArgument(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        w68.checkedAdd(w68.checkedAdd(i4, i5), 1 << i3);
        if (hhcVar.bitsLeft() < i) {
            return -1;
        }
        int bits = hhcVar.readBits(i);
        if (bits != i4) {
            return bits;
        }
        if (hhcVar.bitsLeft() < i2) {
            return -1;
        }
        int bits2 = hhcVar.readBits(i2);
        int i6 = bits + bits2;
        if (bits2 != i5) {
            return i6;
        }
        if (hhcVar.bitsLeft() < i3) {
            return -1;
        }
        return i6 + hhcVar.readBits(i3);
    }

    private static long readEscapedLongValue(hhc hhcVar, int i, int i2, int i3) {
        v80.checkArgument(Math.max(Math.max(i, i2), i3) <= 63);
        long j = (1 << i) - 1;
        long j2 = (1 << i2) - 1;
        nl9.checkedAdd(nl9.checkedAdd(j, j2), 1 << i3);
        if (hhcVar.bitsLeft() < i) {
            return -1L;
        }
        long bitsToLong = hhcVar.readBitsToLong(i);
        if (bitsToLong != j) {
            return bitsToLong;
        }
        if (hhcVar.bitsLeft() < i2) {
            return -1L;
        }
        long bitsToLong2 = hhcVar.readBitsToLong(i2);
        long j3 = bitsToLong + bitsToLong2;
        if (bitsToLong2 != j2) {
            return j3;
        }
        if (hhcVar.bitsLeft() < i3) {
            return -1L;
        }
        return j3 + hhcVar.readBitsToLong(i3);
    }

    private static void skipMpegh3daDecoderConfig(hhc hhcVar, int i, int i2) {
        int bits;
        int escapedIntValue = readEscapedIntValue(hhcVar, 4, 8, 16) + 1;
        hhcVar.skipBit();
        for (int i3 = 0; i3 < escapedIntValue; i3++) {
            int bits2 = hhcVar.readBits(2);
            if (bits2 == 0) {
                parseMpegh3daCoreConfig(hhcVar);
                if (i2 > 0) {
                    skipSbrConfig(hhcVar);
                }
            } else if (bits2 == 1) {
                if (parseMpegh3daCoreConfig(hhcVar)) {
                    hhcVar.skipBit();
                }
                if (i2 > 0) {
                    skipSbrConfig(hhcVar);
                    bits = hhcVar.readBits(2);
                } else {
                    bits = 0;
                }
                if (bits > 0) {
                    hhcVar.skipBits(6);
                    int bits3 = hhcVar.readBits(2);
                    hhcVar.skipBits(4);
                    if (hhcVar.readBit()) {
                        hhcVar.skipBits(5);
                    }
                    if (bits == 2 || bits == 3) {
                        hhcVar.skipBits(6);
                    }
                    if (bits3 == 2) {
                        hhcVar.skipBit();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i - 1) / Math.log(2.0d))) + 1;
                int bits4 = hhcVar.readBits(2);
                if (bits4 > 0 && hhcVar.readBit()) {
                    hhcVar.skipBits(iFloor);
                }
                if (hhcVar.readBit()) {
                    hhcVar.skipBits(iFloor);
                }
                if (i2 == 0 && bits4 == 0) {
                    hhcVar.skipBit();
                }
            } else if (bits2 == 3) {
                readEscapedIntValue(hhcVar, 4, 8, 16);
                int escapedIntValue2 = readEscapedIntValue(hhcVar, 4, 8, 16);
                if (hhcVar.readBit()) {
                    readEscapedIntValue(hhcVar, 8, 16, 0);
                }
                hhcVar.skipBit();
                if (escapedIntValue2 > 0) {
                    hhcVar.skipBits(escapedIntValue2 * 8);
                }
            }
        }
    }

    private static void skipMpegh3daFlexibleSpeakerConfig(hhc hhcVar, int i) {
        int bits;
        boolean bit = hhcVar.readBit();
        int i2 = bit ? 1 : 5;
        int i3 = bit ? 7 : 5;
        int i4 = bit ? 8 : 6;
        int i5 = 0;
        while (i5 < i) {
            if (hhcVar.readBit()) {
                hhcVar.skipBits(7);
                bits = 0;
            } else {
                if (hhcVar.readBits(2) == 3 && hhcVar.readBits(i3) * i2 != 0) {
                    hhcVar.skipBit();
                }
                bits = hhcVar.readBits(i4) * i2;
                if (bits != 0 && bits != 180) {
                    hhcVar.skipBit();
                }
                hhcVar.skipBit();
            }
            if (bits != 0 && bits != 180 && hhcVar.readBit()) {
                i5++;
            }
            i5++;
        }
    }

    private static void skipSbrConfig(hhc hhcVar) {
        hhcVar.skipBits(3);
        hhcVar.skipBits(8);
        boolean bit = hhcVar.readBit();
        boolean bit2 = hhcVar.readBit();
        if (bit) {
            hhcVar.skipBits(5);
        }
        if (bit2) {
            hhcVar.skipBits(6);
        }
    }

    private static void skipSpeakerConfig3d(hhc hhcVar) {
        int bits = hhcVar.readBits(2);
        if (bits == 0) {
            hhcVar.skipBits(6);
            return;
        }
        int escapedIntValue = readEscapedIntValue(hhcVar, 5, 8, 16) + 1;
        if (bits == 1) {
            hhcVar.skipBits(escapedIntValue * 7);
        } else if (bits == 2) {
            skipMpegh3daFlexibleSpeakerConfig(hhcVar, escapedIntValue);
        }
    }
}
