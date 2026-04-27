package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class C7091i {

    /* JADX INFO: renamed from: a */
    public static final String f45309a = "AacUtil";

    /* JADX INFO: renamed from: b */
    public static final int f45310b = 1024;

    /* JADX INFO: renamed from: c */
    public static final int f45311c = 1024;

    /* JADX INFO: renamed from: d */
    public static final int f45312d = 2048;

    /* JADX INFO: renamed from: e */
    public static final int f45313e = 512;

    /* JADX INFO: renamed from: f */
    public static final int f45314f = 100000;

    /* JADX INFO: renamed from: g */
    public static final int f45315g = 16000;

    /* JADX INFO: renamed from: h */
    public static final int f45316h = 7000;

    /* JADX INFO: renamed from: i */
    public static final int f45317i = 256000;

    /* JADX INFO: renamed from: j */
    public static final int f45318j = 8000;

    /* JADX INFO: renamed from: k */
    public static final int f45319k = 15;

    /* JADX INFO: renamed from: m */
    public static final int f45321m = -1;

    /* JADX INFO: renamed from: o */
    public static final String f45323o = "mp4a.40.";

    /* JADX INFO: renamed from: p */
    public static final int f45324p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f45325q = 5;

    /* JADX INFO: renamed from: r */
    public static final int f45326r = 22;

    /* JADX INFO: renamed from: s */
    public static final int f45327s = 23;

    /* JADX INFO: renamed from: t */
    public static final int f45328t = 29;

    /* JADX INFO: renamed from: u */
    public static final int f45329u = 31;

    /* JADX INFO: renamed from: v */
    public static final int f45330v = 42;

    /* JADX INFO: renamed from: l */
    public static final int[] f45320l = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, x45.f96561k3, 11025, 8000, 7350};

    /* JADX INFO: renamed from: n */
    public static final int[] f45322n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: i$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: i$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f45331a;

        /* JADX INFO: renamed from: b */
        public final int f45332b;

        /* JADX INFO: renamed from: c */
        public final String f45333c;

        private c(int i, int i2, String str) {
            this.f45331a = i;
            this.f45332b = i2;
            this.f45333c = str;
        }
    }

    private C7091i() {
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f45320l;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f45322n;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return buildAudioSpecificConfig(2, i4, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    public static byte[] buildAudioSpecificConfig(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    private static int getAudioObjectType(hhc hhcVar) {
        int bits = hhcVar.readBits(5);
        return bits == 31 ? hhcVar.readBits(6) + 32 : bits;
    }

    private static int getSamplingFrequency(hhc hhcVar) throws yhc {
        int bits = hhcVar.readBits(4);
        if (bits == 15) {
            if (hhcVar.bitsLeft() >= 24) {
                return hhcVar.readBits(24);
            }
            throw yhc.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (bits < 13) {
            return f45320l[bits];
        }
        throw yhc.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    public static c parseAudioSpecificConfig(byte[] bArr) throws yhc {
        return parseAudioSpecificConfig(new hhc(bArr), false);
    }

    private static void parseGaSpecificConfig(hhc hhcVar, int i, int i2) {
        if (hhcVar.readBit()) {
            xh9.m25148w("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (hhcVar.readBit()) {
            hhcVar.skipBits(14);
        }
        boolean bit = hhcVar.readBit();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            hhcVar.skipBits(3);
        }
        if (bit) {
            if (i == 22) {
                hhcVar.skipBits(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                hhcVar.skipBits(3);
            }
            hhcVar.skipBits(1);
        }
    }

    public static c parseAudioSpecificConfig(hhc hhcVar, boolean z) throws yhc {
        int audioObjectType = getAudioObjectType(hhcVar);
        int samplingFrequency = getSamplingFrequency(hhcVar);
        int bits = hhcVar.readBits(4);
        String str = "mp4a.40." + audioObjectType;
        if (audioObjectType == 5 || audioObjectType == 29) {
            samplingFrequency = getSamplingFrequency(hhcVar);
            audioObjectType = getAudioObjectType(hhcVar);
            if (audioObjectType == 22) {
                bits = hhcVar.readBits(4);
            }
        }
        if (z) {
            if (audioObjectType != 1 && audioObjectType != 2 && audioObjectType != 3 && audioObjectType != 4 && audioObjectType != 6 && audioObjectType != 7 && audioObjectType != 17) {
                switch (audioObjectType) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw yhc.createForUnsupportedContainerFeature("Unsupported audio object type: " + audioObjectType);
                }
            }
            parseGaSpecificConfig(hhcVar, audioObjectType, bits);
            switch (audioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = hhcVar.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        throw yhc.createForUnsupportedContainerFeature("Unsupported epConfig: " + bits2);
                    }
                    break;
            }
        }
        int i = f45322n[bits];
        if (i != -1) {
            return new c(samplingFrequency, i, str);
        }
        throw yhc.createForMalformedContainer(null, null);
    }
}
