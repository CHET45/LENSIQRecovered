package p000;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.List;
import p000.oea;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kda {

    /* JADX INFO: renamed from: l */
    public static final String f53644l = "MediaCodecInfo";

    /* JADX INFO: renamed from: m */
    public static final int f53645m = -1;

    /* JADX INFO: renamed from: n */
    public static final int f53646n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f53647o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f53648p = 0;

    /* JADX INFO: renamed from: a */
    public final String f53649a;

    /* JADX INFO: renamed from: b */
    public final String f53650b;

    /* JADX INFO: renamed from: c */
    public final String f53651c;

    /* JADX INFO: renamed from: d */
    @hib
    public final MediaCodecInfo.CodecCapabilities f53652d;

    /* JADX INFO: renamed from: e */
    public final boolean f53653e;

    /* JADX INFO: renamed from: f */
    public final boolean f53654f;

    /* JADX INFO: renamed from: g */
    public final boolean f53655g;

    /* JADX INFO: renamed from: h */
    public final boolean f53656h;

    /* JADX INFO: renamed from: i */
    public final boolean f53657i;

    /* JADX INFO: renamed from: j */
    public final boolean f53658j;

    /* JADX INFO: renamed from: k */
    public final boolean f53659k;

    /* JADX INFO: renamed from: kda$a */
    @c5e(29)
    public static final class C8289a {
        private C8289a() {
        }

        @ih4
        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || kda.needsIgnorePerformancePointsWorkaround()) {
                return 0;
            }
            qda.m20266a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM19430a = pda.m19430a(i, i2, (int) d);
            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                if (nda.m17855a(supportedPerformancePoints.get(i3)).covers(performancePointM19430a)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @fdi
    public kda(String str, String str2, String str3, @hib MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f53649a = (String) u80.checkNotNull(str);
        this.f53650b = str2;
        this.f53651c = str3;
        this.f53652d = codecCapabilities;
        this.f53656h = z;
        this.f53657i = z2;
        this.f53658j = z3;
        this.f53653e = z4;
        this.f53654f = z5;
        this.f53655g = z6;
        this.f53659k = sva.isVideo(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
        if (i > 1 || ((x0i.f95978a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        yh9.m25919w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    @c5e(21)
    private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointAlignVideoSizeV21 = alignVideoSizeV21(videoCapabilities, i, i2);
        int i3 = pointAlignVideoSizeV21.x;
        int i4 = pointAlignVideoSizeV21.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@hib MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @c5e(23)
    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return x0i.f95978a >= 19 && isAdaptiveV19(codecCapabilities);
    }

    @c5e(19)
    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean isCodecProfileAndLevelSupported(kq6 kq6Var, boolean z) {
        Pair<Integer, Integer> codecProfileAndLevel = oea.getCodecProfileAndLevel(kq6Var);
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if ("video/dolby-vision".equals(kq6Var.f54989M)) {
            if (!"video/avc".equals(this.f53650b)) {
                iIntValue = "video/hevc".equals(this.f53650b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f53659k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (x0i.f95978a <= 23 && "video/x-vnd.on2.vp9".equals(this.f53650b) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.f53652d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !needsProfileExcludedWorkaround(this.f53650b, iIntValue))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + kq6Var.f54986F + ", " + this.f53651c);
        return false;
    }

    private boolean isSampleMimeTypeSupported(kq6 kq6Var) {
        return this.f53650b.equals(kq6Var.f54989M) || this.f53650b.equals(oea.getAlternativeCodecMimeType(kq6Var));
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return x0i.f95978a >= 21 && isSecureV21(codecCapabilities);
    }

    @c5e(21)
    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return x0i.f95978a >= 21 && isTunnelingV21(codecCapabilities);
    }

    @c5e(21)
    private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        yh9.m25913d("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f53649a + ", " + this.f53650b + "] [" + x0i.f95982e + "]");
    }

    private void logNoSupport(String str) {
        yh9.m25913d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f53649a + ", " + this.f53650b + "] [" + x0i.f95982e + "]");
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return x0i.f95981d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        if (x0i.f95978a <= 22) {
            String str2 = x0i.f95981d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsIgnorePerformancePointsWorkaround() {
        String str = x0i.f95979b;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = x0i.f95981d;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = x0i.f95979b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(x0i.f95979b)) ? false : true;
    }

    public static kda newInstance(String str, String str2, String str3, @hib MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new kda(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z5 || (codecCapabilities != null && isSecure(codecCapabilities)));
    }

    @c5e(21)
    @hib
    public Point alignVideoSizeV21(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f53652d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSizeV21(videoCapabilities, i, i2);
    }

    public wl3 canReuseCodec(kq6 kq6Var, kq6 kq6Var2) {
        int i = !x0i.areEqual(kq6Var.f54989M, kq6Var2.f54989M) ? 8 : 0;
        if (this.f53659k) {
            if (kq6Var.f54997Z1 != kq6Var2.f54997Z1) {
                i |= 1024;
            }
            if (!this.f53653e && (kq6Var.f54996Z != kq6Var2.f54996Z || kq6Var.f54990M1 != kq6Var2.f54990M1)) {
                i |= 512;
            }
            if (!x0i.areEqual(kq6Var.f55005d2, kq6Var2.f55005d2)) {
                i |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.f53649a) && !kq6Var.initializationDataEquals(kq6Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new wl3(this.f53649a, kq6Var, kq6Var2, kq6Var.initializationDataEquals(kq6Var2) ? 3 : 2, 0);
            }
        } else {
            if (kq6Var.f55007e2 != kq6Var2.f55007e2) {
                i |= 4096;
            }
            if (kq6Var.f55009f2 != kq6Var2.f55009f2) {
                i |= 8192;
            }
            if (kq6Var.f55010g2 != kq6Var2.f55010g2) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f53650b)) {
                Pair<Integer, Integer> codecProfileAndLevel = oea.getCodecProfileAndLevel(kq6Var);
                Pair<Integer, Integer> codecProfileAndLevel2 = oea.getCodecProfileAndLevel(kq6Var2);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new wl3(this.f53649a, kq6Var, kq6Var2, 3, 0);
                    }
                }
            }
            if (!kq6Var.initializationDataEquals(kq6Var2)) {
                i |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.f53650b)) {
                i |= 2;
            }
            if (i == 0) {
                return new wl3(this.f53649a, kq6Var, kq6Var2, 1, 0);
            }
        }
        return new wl3(this.f53649a, kq6Var, kq6Var2, 0, i);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (x0i.f95978a < 23 || (codecCapabilities = this.f53652d) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f53652d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @c5e(21)
    public boolean isAudioChannelCountSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f53652d;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.f53649a, this.f53650b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        logNoSupport("channelCount.support, " + i);
        return false;
    }

    @c5e(21)
    public boolean isAudioSampleRateSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f53652d;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        logNoSupport("sampleRate.support, " + i);
        return false;
    }

    public boolean isFormatFunctionallySupported(kq6 kq6Var) {
        return isSampleMimeTypeSupported(kq6Var) && isCodecProfileAndLevelSupported(kq6Var, false);
    }

    public boolean isFormatSupported(kq6 kq6Var) throws oea.C10346c {
        int i;
        if (!isSampleMimeTypeSupported(kq6Var) || !isCodecProfileAndLevelSupported(kq6Var, true)) {
            return false;
        }
        if (!this.f53659k) {
            if (x0i.f95978a >= 21) {
                int i2 = kq6Var.f55009f2;
                if (i2 != -1 && !isAudioSampleRateSupportedV21(i2)) {
                    return false;
                }
                int i3 = kq6Var.f55007e2;
                if (i3 != -1 && !isAudioChannelCountSupportedV21(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = kq6Var.f54996Z;
        if (i4 <= 0 || (i = kq6Var.f54990M1) <= 0) {
            return true;
        }
        if (x0i.f95978a >= 21) {
            return isVideoSizeAndRateSupportedV21(i4, i, kq6Var.f54993V1);
        }
        boolean z = i4 * i <= oea.maxH264DecodableFrameSize();
        if (!z) {
            logNoSupport("legacyFrameSize, " + kq6Var.f54996Z + "x" + kq6Var.f54990M1);
        }
        return z;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (x0i.f95978a >= 29 && "video/x-vnd.on2.vp9".equals(this.f53650b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(kq6 kq6Var) {
        if (this.f53659k) {
            return this.f53653e;
        }
        Pair<Integer, Integer> codecProfileAndLevel = oea.getCodecProfileAndLevel(kq6Var);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    @c5e(21)
    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f53652d;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (x0i.f95978a >= 29) {
            int iAreResolutionAndFrameRateCovered = C8289a.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                logNoSupport("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!areSizeAndRateSupportedV21(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !needsRotatedVerticalResolutionWorkaround(this.f53649a) || !areSizeAndRateSupportedV21(videoCapabilities, i2, i, d)) {
                logNoSupport("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            logAssumedSupport("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }

    public String toString() {
        return this.f53649a;
    }

    @c5e(21)
    private static Point alignVideoSizeV21(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(x0i.ceilDivide(i, widthAlignment) * widthAlignment, x0i.ceilDivide(i2, heightAlignment) * heightAlignment);
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(kq6 kq6Var, kq6 kq6Var2, boolean z) {
        if (!z && kq6Var.f55005d2 != null && kq6Var2.f55005d2 == null) {
            kq6Var2 = kq6Var2.buildUpon().setColorInfo(kq6Var.f55005d2).build();
        }
        int i = canReuseCodec(kq6Var, kq6Var2).f94612d;
        return i == 2 || i == 3;
    }
}
