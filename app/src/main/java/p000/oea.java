package p000;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@igg({"InlinedApi"})
@Deprecated
public final class oea {

    /* JADX INFO: renamed from: a */
    public static final String f67407a = "MediaCodecUtil";

    /* JADX INFO: renamed from: d */
    public static final String f67410d = "avc1";

    /* JADX INFO: renamed from: e */
    public static final String f67411e = "avc2";

    /* JADX INFO: renamed from: f */
    public static final String f67412f = "vp09";

    /* JADX INFO: renamed from: g */
    public static final String f67413g = "hev1";

    /* JADX INFO: renamed from: h */
    public static final String f67414h = "hvc1";

    /* JADX INFO: renamed from: i */
    public static final String f67415i = "av01";

    /* JADX INFO: renamed from: j */
    public static final String f67416j = "mp4a";

    /* JADX INFO: renamed from: b */
    public static final Pattern f67408b = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: c */
    @xc7("MediaCodecUtil.class")
    public static final HashMap<C10345b, List<kda>> f67409c = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public static int f67417k = -1;

    /* JADX INFO: renamed from: oea$b */
    public static final class C10345b {

        /* JADX INFO: renamed from: a */
        public final String f67418a;

        /* JADX INFO: renamed from: b */
        public final boolean f67419b;

        /* JADX INFO: renamed from: c */
        public final boolean f67420c;

        public C10345b(String str, boolean z, boolean z2) {
            this.f67418a = str;
            this.f67419b = z;
            this.f67420c = z2;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C10345b.class) {
                return false;
            }
            C10345b c10345b = (C10345b) obj;
            return TextUtils.equals(this.f67418a, c10345b.f67418a) && this.f67419b == c10345b.f67419b && this.f67420c == c10345b.f67420c;
        }

        public int hashCode() {
            return ((((this.f67418a.hashCode() + 31) * 31) + (this.f67419b ? 1231 : 1237)) * 31) + (this.f67420c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: oea$c */
    public static class C10346c extends Exception {
        private C10346c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: oea$d */
    public interface InterfaceC10347d {
        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: renamed from: oea$e */
    public static final class C10348e implements InterfaceC10347d {
        private C10348e() {
        }

        @Override // p000.oea.InterfaceC10347d
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p000.oea.InterfaceC10347d
        public MediaCodecInfo getCodecInfoAt(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p000.oea.InterfaceC10347d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p000.oea.InterfaceC10347d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p000.oea.InterfaceC10347d
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* JADX INFO: renamed from: oea$f */
    @c5e(21)
    public static final class C10349f implements InterfaceC10347d {

        /* JADX INFO: renamed from: a */
        public final int f67421a;

        /* JADX INFO: renamed from: b */
        @hib
        public MediaCodecInfo[] f67422b;

        public C10349f(boolean z, boolean z2) {
            this.f67421a = (z || z2) ? 1 : 0;
        }

        @z25({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.f67422b == null) {
                this.f67422b = new MediaCodecList(this.f67421a).getCodecInfos();
            }
        }

        @Override // p000.oea.InterfaceC10347d
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.f67422b.length;
        }

        @Override // p000.oea.InterfaceC10347d
        public MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.f67422b[i];
        }

        @Override // p000.oea.InterfaceC10347d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p000.oea.InterfaceC10347d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p000.oea.InterfaceC10347d
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* JADX INFO: renamed from: oea$g */
    public interface InterfaceC10350g<T> {
        int getScore(T t);
    }

    private oea() {
    }

    private static void applyWorkarounds(String str, List<kda> list) {
        if ("audio/raw".equals(str)) {
            if (x0i.f95978a < 26 && x0i.f95979b.equals("R9") && list.size() == 1 && list.get(0).f53649a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(kda.newInstance("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            sortByScore(list, new InterfaceC10350g() { // from class: fea
                @Override // p000.oea.InterfaceC10350g
                public final int getScore(Object obj) {
                    return oea.lambda$applyWorkarounds$1((kda) obj);
                }
            });
        }
        int i = x0i.f95978a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f53649a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                sortByScore(list, new InterfaceC10350g() { // from class: gea
                    @Override // p000.oea.InterfaceC10350g
                    public final int getScore(Object obj) {
                        return oea.lambda$applyWorkarounds$2((kda) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f53649a)) {
            return;
        }
        list.add(list.remove(0));
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

    private static int avcLevelToMaxFrameSize(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
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

    @fdi
    public static synchronized void clearDecoderInfoCache() {
        f67409c.clear();
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

    @hib
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(sva.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @hib
    public static String getAlternativeCodecMimeType(kq6 kq6Var) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if ("audio/eac3-joc".equals(kq6Var.f54989M)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(kq6Var.f54989M) || (codecProfileAndLevel = getCodecProfileAndLevel(kq6Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List<kda> getAlternativeDecoderInfos(yda ydaVar, kq6 kq6Var, boolean z, boolean z2) throws C10346c {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(kq6Var);
        return alternativeCodecMimeType == null ? kx7.m15110of() : ydaVar.getDecoderInfos(alternativeCodecMimeType, z, z2);
    }

    @hib
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, @hib f92 f92Var) {
        int i;
        if (strArr.length < 4) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2].substring(0, 2));
            int i4 = Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                yh9.m25919w("MediaCodecUtil", "Unknown AV1 profile: " + i2);
                return null;
            }
            if (i4 != 8 && i4 != 10) {
                yh9.m25919w("MediaCodecUtil", "Unknown AV1 bit depth: " + i4);
                return null;
            }
            int i5 = i4 != 8 ? (f92Var == null || !(f92Var.f35740d != null || (i = f92Var.f35739c) == 7 || i == 6)) ? 2 : 4096 : 1;
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i3);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i5), Integer.valueOf(iAv1LevelNumberToConst));
            }
            yh9.m25919w("MediaCodecUtil", "Unknown AV1 level: " + i3);
            return null;
        } catch (NumberFormatException unused) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @hib
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    yh9.m25919w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i2);
            if (iAvcProfileNumberToConst == -1) {
                yh9.m25919w("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            yh9.m25919w("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @hib
    private static String getCodecMimeType(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @hib
    public static Pair<Integer, Integer> getCodecProfileAndLevel(kq6 kq6Var) {
        String str = kq6Var.f54986F;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(kq6Var.f54989M)) {
            return getDolbyVisionProfileAndLevel(kq6Var.f54986F, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2) {
            case "av01":
                return getAv1ProfileAndLevel(kq6Var.f54986F, strArrSplit, kq6Var.f55005d2);
            case "avc1":
            case "avc2":
                return getAvcProfileAndLevel(kq6Var.f54986F, strArrSplit);
            case "hev1":
            case "hvc1":
                return getHevcProfileAndLevel(kq6Var.f54986F, strArrSplit, kq6Var.f55005d2);
            case "mp4a":
                return getAacCodecProfileAndLevel(kq6Var.f54986F, strArrSplit);
            case "vp09":
                return getVp9ProfileAndLevel(kq6Var.f54986F, strArrSplit);
            default:
                return null;
        }
    }

    @hib
    public static kda getDecoderInfo(String str, boolean z, boolean z2) throws C10346c {
        List<kda> decoderInfos = getDecoderInfos(str, z, z2);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<kda> getDecoderInfos(String str, boolean z, boolean z2) throws C10346c {
        try {
            C10345b c10345b = new C10345b(str, z, z2);
            HashMap<C10345b, List<kda>> map = f67409c;
            List<kda> list = map.get(c10345b);
            if (list != null) {
                return list;
            }
            int i = x0i.f95978a;
            ArrayList<kda> decoderInfosInternal = getDecoderInfosInternal(c10345b, i >= 21 ? new C10349f(z, z2) : new C10348e());
            if (z && decoderInfosInternal.isEmpty() && 21 <= i && i <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(c10345b, new C10348e());
                if (!decoderInfosInternal.isEmpty()) {
                    yh9.m25919w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + decoderInfosInternal.get(0).f53649a);
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) decoderInfosInternal);
            map.put(c10345b, kx7VarCopyOf);
            return kx7VarCopyOf;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105 A[Catch: Exception -> 0x012e, TRY_ENTER, TryCatch #1 {Exception -> 0x012e, blocks: (B:3:0x0008, B:5:0x001b, B:61:0x0124, B:8:0x002d, B:11:0x0038, B:55:0x00fd, B:58:0x0105, B:60:0x010b, B:64:0x0130, B:65:0x0153), top: B:71:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<p000.kda> getDecoderInfosInternal(p000.oea.C10345b r24, p000.oea.InterfaceC10347d r25) throws p000.oea.C10346c {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oea.getDecoderInfosInternal(oea$b, oea$d):java.util.ArrayList");
    }

    @g5e({"#2.sampleMimeType"})
    public static List<kda> getDecoderInfosSoftMatch(yda ydaVar, kq6 kq6Var, boolean z, boolean z2) throws C10346c {
        List<kda> decoderInfos = ydaVar.getDecoderInfos(kq6Var.f54989M, z, z2);
        return kx7.builder().addAll((Iterable) decoderInfos).addAll((Iterable) getAlternativeDecoderInfos(ydaVar, kq6Var, z, z2)).build();
    }

    @yx1
    public static List<kda> getDecoderInfosSortedByFormatSupport(List<kda> list, final kq6 kq6Var) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new InterfaceC10350g() { // from class: hea
            @Override // p000.oea.InterfaceC10350g
            public final int getScore(Object obj) {
                return oea.lambda$getDecoderInfosSortedByFormatSupport$0(kq6Var, (kda) obj);
            }
        });
        return arrayList;
    }

    @hib
    public static kda getDecryptOnlyDecoderInfo() throws C10346c {
        return getDecoderInfo("audio/raw", false, false);
    }

    @hib
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f67408b.matcher(strArr[1]);
        if (!matcher.matches()) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            yh9.m25919w("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        yh9.m25919w("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @hib
    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, @hib f92 f92Var) {
        if (strArr.length < 4) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f67408b.matcher(strArr[1]);
        if (!matcher.matches()) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!k95.f53083Y4.equals(strGroup)) {
                yh9.m25919w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = (f92Var == null || f92Var.f35739c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i), numHevcCodecStringToProfileLevel);
        }
        yh9.m25919w("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    @hib
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i);
            if (iVp9ProfileNumberToConst == -1) {
                yh9.m25919w("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i2);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            yh9.m25919w("MediaCodecUtil", "Unknown VP9 level: " + i2);
            return null;
        } catch (NumberFormatException unused) {
            yh9.m25919w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
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

    private static boolean isAlias(MediaCodecInfo mediaCodecInfo) {
        return x0i.f95978a >= 29 && isAliasV29(mediaCodecInfo);
    }

    @c5e(29)
    private static boolean isAliasV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = x0i.f95978a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = x0i.f95979b;
            if ("a70".equals(str3) || ("Xiaomi".equals(x0i.f95980c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = x0i.f95979b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = x0i.f95979b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && as9.f11748b.equals(x0i.f95980c))) {
            String str6 = x0i.f95979b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && as9.f11748b.equals(x0i.f95980c)) {
            String str7 = x0i.f95979b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && x0i.f95979b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        return x0i.f95978a >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    @c5e(29)
    private static boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (x0i.f95978a >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (sva.isAudio(str)) {
            return true;
        }
        String lowerCase = i80.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    @c5e(29)
    private static boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(MediaCodecInfo mediaCodecInfo) {
        if (x0i.f95978a >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String lowerCase = i80.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    @c5e(29)
    private static boolean isVendorV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyWorkarounds$1(kda kdaVar) {
        String str = kdaVar.f53649a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (x0i.f95978a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyWorkarounds$2(kda kdaVar) {
        return kdaVar.f53649a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(kq6 kq6Var, kda kdaVar) {
        return kdaVar.isFormatFunctionallySupported(kq6Var) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortByScore$3(InterfaceC10350g interfaceC10350g, Object obj, Object obj2) {
        return interfaceC10350g.getScore(obj2) - interfaceC10350g.getScore(obj);
    }

    public static int maxH264DecodableFrameSize() throws C10346c {
        if (f67417k == -1) {
            int iMax = 0;
            kda decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, x0i.f95978a >= 21 ? 345600 : 172800);
            }
            f67417k = iMax;
        }
        return f67417k;
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

    private static <T> void sortByScore(List<T> list, final InterfaceC10350g<T> interfaceC10350g) {
        Collections.sort(list, new Comparator() { // from class: eea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return oea.lambda$sortByScore$3(interfaceC10350g, obj, obj2);
            }
        });
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

    public static void warmDecoderInfoCache(String str, boolean z, boolean z2) {
        try {
            getDecoderInfos(str, z, z2);
        } catch (C10346c e) {
            yh9.m25916e("MediaCodecUtil", "Codec warming failed", e);
        }
    }
}
