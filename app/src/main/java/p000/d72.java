package p000;

import android.util.Pair;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@igg({"InlinedApi"})
public final class d72 {

    /* JADX INFO: renamed from: c */
    public static final int f28603c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f28604d = 32;

    /* JADX INFO: renamed from: e */
    public static final int f28605e = 15;

    /* JADX INFO: renamed from: f */
    public static final int f28606f = 0;

    /* JADX INFO: renamed from: g */
    public static final String f28607g = "s263";

    /* JADX INFO: renamed from: h */
    public static final String f28608h = "avc1";

    /* JADX INFO: renamed from: i */
    public static final String f28609i = "avc2";

    /* JADX INFO: renamed from: j */
    public static final String f28610j = "vp09";

    /* JADX INFO: renamed from: k */
    public static final String f28611k = "hev1";

    /* JADX INFO: renamed from: l */
    public static final String f28612l = "hvc1";

    /* JADX INFO: renamed from: m */
    public static final String f28613m = "av01";

    /* JADX INFO: renamed from: n */
    public static final String f28614n = "mp4a";

    /* JADX INFO: renamed from: o */
    public static final String f28615o = "ac-4";

    /* JADX INFO: renamed from: p */
    public static final String f28616p = "iamf";

    /* JADX INFO: renamed from: r */
    public static final String f28618r = "CodecSpecificDataUtil";

    /* JADX INFO: renamed from: a */
    public static final byte[] f28601a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f28602b = {"", k95.f53065W4, "B", "C"};

    /* JADX INFO: renamed from: q */
    public static final Pattern f28617q = Pattern.compile("^\\D?(\\d+)$");

    private d72() {
    }

    private static int ac4BitstreamAndPresentationVersionsToProfileConst(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (i2 == 1) {
                        return 1026;
                    }
                    if (i2 == 2) {
                        return 1028;
                    }
                }
            } else {
                if (i2 == 0) {
                    return 513;
                }
                if (i2 == 1) {
                    return 514;
                }
            }
        } else if (i2 == 0) {
            return 257;
        }
        return -1;
    }

    private static int ac4LevelNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? -1 : 16;
        }
        return 8;
    }

    private static int av1LevelNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcProfileNumberToConst(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildAvcCodecString(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String buildDolbyVisionCodecString(int i, int i2) {
        return i > 9 ? t0i.formatInvariant("dvh1.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2)) : i > 8 ? t0i.formatInvariant("dvav.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2)) : t0i.formatInvariant("dvhe.%02d.%02d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static byte[] buildDolbyVisionInitializationData(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = new byte[24];
        if (i == 8) {
            i3 = 4;
            i4 = 0;
        } else if (i == 9) {
            i3 = 2;
            i4 = 1;
        } else {
            i3 = 0;
            i4 = 0;
        }
        bArr[0] = 1;
        bArr[1] = 0;
        byte b = (byte) ((i & 127) << 1);
        bArr[2] = b;
        bArr[2] = (byte) ((b | ((i2 >> 5) & 1)) & 255);
        byte b2 = (byte) ((i2 & 31) << 3);
        bArr[3] = b2;
        byte b3 = (byte) (b2 | 4);
        bArr[3] = b3;
        byte b4 = b3;
        bArr[3] = b4;
        bArr[3] = (byte) (b4 | 1);
        byte b5 = (byte) (i3 << 4);
        bArr[4] = b5;
        bArr[4] = (byte) (b5 | (i4 << 2));
        return bArr;
    }

    public static String buildH263CodecString(int i, int i2) {
        return t0i.formatInvariant("s263.%d.%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String buildHevcCodecString(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(t0i.formatInvariant("hvc1.%s%d.%X.%c%d", f28602b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? sjc.f82018h : sjc.f82016f), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String buildIamfCodecString(byte[] bArr) {
        jhc jhcVar = new jhc(bArr);
        jhcVar.skipLeb128();
        jhcVar.skipBytes(4);
        int unsignedByte = jhcVar.readUnsignedByte();
        int unsignedByte2 = jhcVar.readUnsignedByte();
        jhcVar.skipBytes(1);
        jhcVar.skipLeb128();
        jhcVar.skipLeb128();
        String string = jhcVar.readString(4);
        if (string.equals("mp4a")) {
            jhcVar.skipLeb128();
            jhcVar.skipBytes(2);
            hhc hhcVar = new hhc();
            hhcVar.reset(jhcVar);
            int bits = hhcVar.readBits(5);
            if (bits == 31) {
                bits = hhcVar.readBits(6) + 32;
            }
            string = string + ".40." + bits;
        }
        return t0i.formatInvariant("iamf.%03X.%03X.%s", Integer.valueOf(unsignedByte), Integer.valueOf(unsignedByte2), string);
    }

    public static byte[] buildNalUnit(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f28601a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static kx7<byte[]> buildVp9CodecPrivateInitializationData(byte b, byte b2, byte b3, byte b4) {
        return kx7.m15111of(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static int dolbyVisionConstantToLevelNumber(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                switch (i) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        throw new IllegalArgumentException("Unknown Dolby Vision level: " + i);
                }
            }
        }
        return i2;
    }

    public static int dolbyVisionConstantToProfileNumber(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        if (i == 1024) {
            return 10;
        }
        throw new IllegalArgumentException("Unknown Dolby Vision profile: " + i);
    }

    @hib
    private static Integer dolbyVisionStringToLevel(@hib String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @hib
    private static Integer dolbyVisionStringToProfile(@hib String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static int findNalStartCode(byte[] bArr, int i) {
        int length = bArr.length - f28601a.length;
        while (i <= length) {
            if (isNalStartCode(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @hib
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            xh9.m25148w(f28618r, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(rva.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            xh9.m25148w(f28618r, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @hib
    private static Pair<Integer, Integer> getAc4CodecProfileAndLevel(String str, String[] strArr) {
        if (strArr.length != 4) {
            xh9.m25148w(f28618r, "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int i3 = Integer.parseInt(strArr[3]);
            int iAc4BitstreamAndPresentationVersionsToProfileConst = ac4BitstreamAndPresentationVersionsToProfileConst(i, i2);
            if (iAc4BitstreamAndPresentationVersionsToProfileConst == -1) {
                xh9.m25148w(f28618r, "Unknown AC-4 profile: " + i + "." + i2);
                return null;
            }
            int iAc4LevelNumberToConst = ac4LevelNumberToConst(i3);
            if (iAc4LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAc4BitstreamAndPresentationVersionsToProfileConst), Integer.valueOf(iAc4LevelNumberToConst));
            }
            xh9.m25148w(f28618r, "Unknown AC-4 level: " + i3);
            return null;
        } catch (NumberFormatException unused) {
            xh9.m25148w(f28618r, "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    @hib
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, @hib e92 e92Var) {
        int i;
        if (strArr.length < 4) {
            xh9.m25148w(f28618r, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2].substring(0, 2));
            int i4 = Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                xh9.m25148w(f28618r, "Unknown AV1 profile: " + i2);
                return null;
            }
            if (i4 != 8 && i4 != 10) {
                xh9.m25148w(f28618r, "Unknown AV1 bit depth: " + i4);
                return null;
            }
            int i5 = i4 != 8 ? (e92Var == null || !(e92Var.f32176d != null || (i = e92Var.f32175c) == 7 || i == 6)) ? 2 : 4096 : 1;
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i3);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i5), Integer.valueOf(iAv1LevelNumberToConst));
            }
            xh9.m25148w(f28618r, "Unknown AV1 level: " + i3);
            return null;
        } catch (NumberFormatException unused) {
            xh9.m25148w(f28618r, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @hib
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            xh9.m25148w(f28618r, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    xh9.m25148w(f28618r, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i2);
            if (iAvcProfileNumberToConst == -1) {
                xh9.m25148w(f28618r, "Unknown AVC profile: " + i2);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            xh9.m25148w(f28618r, "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            xh9.m25148w(f28618r, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @hib
    public static Pair<Integer, Integer> getCodecProfileAndLevel(C1213a c1213a) {
        String str = c1213a.f8287k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(c1213a.f8291o)) {
            return getDolbyVisionProfileAndLevel(c1213a.f8287k, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2) {
            case "ac-4":
                return getAc4CodecProfileAndLevel(c1213a.f8287k, strArrSplit);
            case "av01":
                return getAv1ProfileAndLevel(c1213a.f8287k, strArrSplit, c1213a.f8264E);
            case "avc1":
            case "avc2":
                return getAvcProfileAndLevel(c1213a.f8287k, strArrSplit);
            case "hev1":
            case "hvc1":
                return getHevcProfileAndLevel(c1213a.f8287k, strArrSplit, c1213a.f8264E);
            case "iamf":
                return getIamfCodecProfileAndLevel(c1213a.f8287k, strArrSplit);
            case "mp4a":
                return getAacCodecProfileAndLevel(c1213a.f8287k, strArrSplit);
            case "s263":
                return getH263ProfileAndLevel(c1213a.f8287k, strArrSplit);
            case "vp09":
                return getVp9ProfileAndLevel(c1213a.f8287k, strArrSplit);
            default:
                return null;
        }
    }

    @hib
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            xh9.m25148w(f28618r, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f28617q.matcher(strArr[1]);
        if (!matcher.matches()) {
            xh9.m25148w(f28618r, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            xh9.m25148w(f28618r, "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        xh9.m25148w(f28618r, "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> getH263ProfileAndLevel(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            xh9.m25148w(f28618r, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            xh9.m25148w(f28618r, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    @hib
    public static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, @hib e92 e92Var) {
        if (strArr.length < 4) {
            xh9.m25148w(f28618r, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f28617q.matcher(strArr[1]);
        if (!matcher.matches()) {
            xh9.m25148w(f28618r, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i = 6;
            if (k95.f53083Y4.equals(strGroup)) {
                i = (e92Var == null || e92Var.f32175c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                xh9.m25148w(f28618r, "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i), numHevcCodecStringToProfileLevel);
        }
        xh9.m25148w(f28618r, "Unknown HEVC level string: " + str2);
        return null;
    }

    @hib
    private static Pair<Integer, Integer> getIamfCodecProfileAndLevel(String str, String[] strArr) {
        int i = 2;
        if (strArr.length < 4) {
            xh9.m25148w(f28618r, "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int i2 = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.hashCode();
            switch (str2) {
                case "Opus":
                    i = 1;
                    break;
                case "fLaC":
                    i = 4;
                    break;
                case "ipcm":
                    i = 8;
                    break;
                case "mp4a":
                    break;
                default:
                    xh9.m25148w(f28618r, "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair<>(Integer.valueOf(i2 | 16777216 | i), 0);
        } catch (NumberFormatException e) {
            xh9.m25149w(f28618r, "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e);
            return null;
        }
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z;
        jhc jhcVar = new jhc(bArr);
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 3;
            if (i3 >= bArr.length) {
                z = false;
                break;
            }
            if (jhcVar.readUnsignedInt24() == 1 && (bArr[i3] & 240) == 32) {
                z = true;
                break;
            }
            jhcVar.setPosition(jhcVar.getPosition() - 2);
            i2++;
        }
        v80.checkArgument(z, "Invalid input: VOL not found.");
        hhc hhcVar = new hhc(bArr);
        hhcVar.skipBits((i2 + 4) * 8);
        hhcVar.skipBits(1);
        hhcVar.skipBits(8);
        if (hhcVar.readBit()) {
            hhcVar.skipBits(4);
            hhcVar.skipBits(3);
        }
        if (hhcVar.readBits(4) == 15) {
            hhcVar.skipBits(8);
            hhcVar.skipBits(8);
        }
        if (hhcVar.readBit()) {
            hhcVar.skipBits(2);
            hhcVar.skipBits(1);
            if (hhcVar.readBit()) {
                hhcVar.skipBits(79);
            }
        }
        v80.checkArgument(hhcVar.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        v80.checkArgument(hhcVar.readBit());
        int bits = hhcVar.readBits(16);
        v80.checkArgument(hhcVar.readBit());
        if (hhcVar.readBit()) {
            v80.checkArgument(bits > 0);
            for (int i4 = bits - 1; i4 > 0; i4 >>= 1) {
                i++;
            }
            hhcVar.skipBits(i);
        }
        v80.checkArgument(hhcVar.readBit());
        int bits2 = hhcVar.readBits(13);
        v80.checkArgument(hhcVar.readBit());
        int bits3 = hhcVar.readBits(13);
        v80.checkArgument(hhcVar.readBit());
        hhcVar.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    @hib
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            xh9.m25148w(f28618r, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i);
            if (iVp9ProfileNumberToConst == -1) {
                xh9.m25148w(f28618r, "Unknown VP9 profile: " + i);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i2);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            xh9.m25148w(f28618r, "Unknown VP9 level: " + i2);
            return null;
        } catch (NumberFormatException unused) {
            xh9.m25148w(f28618r, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    @hib
    private static Integer hevcCodecStringToProfileLevel(@hib String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static boolean isNalStartCode(byte[] bArr, int i) {
        if (bArr.length - i <= f28601a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f28601a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        jhc jhcVar = new jhc(bArr);
        jhcVar.setPosition(9);
        int unsignedByte = jhcVar.readUnsignedByte();
        jhcVar.setPosition(20);
        return Pair.create(Integer.valueOf(jhcVar.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @hib
    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + f28601a.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }

    private static int vp9LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }
}
