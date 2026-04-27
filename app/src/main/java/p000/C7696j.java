package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: j */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C7696j {

    /* JADX INFO: renamed from: a */
    public static final String f49171a = "AacUtil";

    /* JADX INFO: renamed from: b */
    public static final int f49172b = 1024;

    /* JADX INFO: renamed from: c */
    public static final int f49173c = 1024;

    /* JADX INFO: renamed from: d */
    public static final int f49174d = 2048;

    /* JADX INFO: renamed from: e */
    public static final int f49175e = 512;

    /* JADX INFO: renamed from: f */
    public static final int f49176f = 100000;

    /* JADX INFO: renamed from: g */
    public static final int f49177g = 16000;

    /* JADX INFO: renamed from: h */
    public static final int f49178h = 7000;

    /* JADX INFO: renamed from: i */
    public static final int f49179i = 256000;

    /* JADX INFO: renamed from: j */
    public static final int f49180j = 8000;

    /* JADX INFO: renamed from: k */
    public static final int f49181k = 15;

    /* JADX INFO: renamed from: m */
    public static final int f49183m = -1;

    /* JADX INFO: renamed from: o */
    public static final String f49185o = "mp4a.40.";

    /* JADX INFO: renamed from: p */
    public static final int f49186p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f49187q = 5;

    /* JADX INFO: renamed from: r */
    public static final int f49188r = 22;

    /* JADX INFO: renamed from: s */
    public static final int f49189s = 23;

    /* JADX INFO: renamed from: t */
    public static final int f49190t = 29;

    /* JADX INFO: renamed from: u */
    public static final int f49191u = 31;

    /* JADX INFO: renamed from: v */
    public static final int f49192v = 42;

    /* JADX INFO: renamed from: l */
    public static final int[] f49182l = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, x45.f96561k3, 11025, 8000, 7350};

    /* JADX INFO: renamed from: n */
    public static final int[] f49184n = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: j$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: j$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f49193a;

        /* JADX INFO: renamed from: b */
        public final int f49194b;

        /* JADX INFO: renamed from: c */
        public final String f49195c;

        private c(int i, int i2, String str) {
            this.f49193a = i;
            this.f49194b = i2;
            this.f49195c = str;
        }
    }

    private C7696j() {
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f49182l;
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
            int[] iArr2 = f49184n;
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

    private static int getAudioObjectType(ghc ghcVar) {
        int bits = ghcVar.readBits(5);
        return bits == 31 ? ghcVar.readBits(6) + 32 : bits;
    }

    private static int getSamplingFrequency(ghc ghcVar) throws xhc {
        int bits = ghcVar.readBits(4);
        if (bits == 15) {
            if (ghcVar.bitsLeft() >= 24) {
                return ghcVar.readBits(24);
            }
            throw xhc.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (bits < 13) {
            return f49182l[bits];
        }
        throw xhc.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    public static c parseAudioSpecificConfig(byte[] bArr) throws xhc {
        return parseAudioSpecificConfig(new ghc(bArr), false);
    }

    private static void parseGaSpecificConfig(ghc ghcVar, int i, int i2) {
        if (ghcVar.readBit()) {
            yh9.m25919w("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (ghcVar.readBit()) {
            ghcVar.skipBits(14);
        }
        boolean bit = ghcVar.readBit();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            ghcVar.skipBits(3);
        }
        if (bit) {
            if (i == 22) {
                ghcVar.skipBits(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                ghcVar.skipBits(3);
            }
            ghcVar.skipBits(1);
        }
    }

    public static c parseAudioSpecificConfig(ghc ghcVar, boolean z) throws xhc {
        int audioObjectType = getAudioObjectType(ghcVar);
        int samplingFrequency = getSamplingFrequency(ghcVar);
        int bits = ghcVar.readBits(4);
        String str = "mp4a.40." + audioObjectType;
        if (audioObjectType == 5 || audioObjectType == 29) {
            samplingFrequency = getSamplingFrequency(ghcVar);
            audioObjectType = getAudioObjectType(ghcVar);
            if (audioObjectType == 22) {
                bits = ghcVar.readBits(4);
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
                        throw xhc.createForUnsupportedContainerFeature("Unsupported audio object type: " + audioObjectType);
                }
            }
            parseGaSpecificConfig(ghcVar, audioObjectType, bits);
            switch (audioObjectType) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int bits2 = ghcVar.readBits(2);
                    if (bits2 == 2 || bits2 == 3) {
                        throw xhc.createForUnsupportedContainerFeature("Unsupported epConfig: " + bits2);
                    }
                    break;
            }
        }
        int i = f49184n[bits];
        if (i != -1) {
            return new c(samplingFrequency, i, str);
        }
        throw xhc.createForMalformedContainer(null, null);
    }
}
