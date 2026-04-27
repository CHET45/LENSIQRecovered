package p000;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.C1213a;
import java.util.Objects;
import p000.ju9;
import p000.nea;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lda {

    /* JADX INFO: renamed from: p */
    public static final String f57250p = "MediaCodecInfo";

    /* JADX INFO: renamed from: q */
    public static final int f57251q = -1;

    /* JADX INFO: renamed from: a */
    public final String f57252a;

    /* JADX INFO: renamed from: b */
    public final String f57253b;

    /* JADX INFO: renamed from: c */
    public final String f57254c;

    /* JADX INFO: renamed from: d */
    @hib
    public final MediaCodecInfo.CodecCapabilities f57255d;

    /* JADX INFO: renamed from: e */
    public final boolean f57256e;

    /* JADX INFO: renamed from: f */
    public final boolean f57257f;

    /* JADX INFO: renamed from: g */
    public final boolean f57258g;

    /* JADX INFO: renamed from: h */
    public final boolean f57259h;

    /* JADX INFO: renamed from: i */
    public final boolean f57260i;

    /* JADX INFO: renamed from: j */
    public final boolean f57261j;

    /* JADX INFO: renamed from: k */
    public final boolean f57262k;

    /* JADX INFO: renamed from: l */
    public final boolean f57263l;

    /* JADX INFO: renamed from: o */
    public float f57266o = -3.4028235E38f;

    /* JADX INFO: renamed from: m */
    public int f57264m = -1;

    /* JADX INFO: renamed from: n */
    public int f57265n = -1;

    @fdi
    public lda(String str, String str2, String str3, @hib MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f57252a = (String) v80.checkNotNull(str);
        this.f57253b = str2;
        this.f57254c = str3;
        this.f57255d = codecCapabilities;
        this.f57259h = z;
        this.f57260i = z2;
        this.f57261j = z3;
        this.f57256e = z4;
        this.f57257f = z5;
        this.f57258g = z6;
        this.f57262k = z7;
        this.f57263l = rva.isVideo(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
        if (i > 1 || i > 0 || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2)) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        xh9.m25148w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    private static Point alignVideoSize(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(t0i.ceilDivide(i, widthAlignment) * widthAlignment, t0i.ceilDivide(i2, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointAlignVideoSize = alignVideoSize(videoCapabilities, i, i2);
        int i3 = pointAlignVideoSize.x;
        int i4 = pointAlignVideoSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float computeMaxSupportedFrameRate(int i, int i2) {
        float f = 1024.0f;
        if (isVideoSizeAndRateSupportedV21(i, i2, 1024.0f)) {
            return 1024.0f;
        }
        float f2 = 0.0f;
        while (true) {
            float f3 = f - f2;
            if (Math.abs(f3) <= 5.0f) {
                return f2;
            }
            float f4 = (f3 / 2.0f) + f2;
            if (isVideoSizeAndRateSupportedV21(i, i2, f4)) {
                f2 = f4;
            } else {
                f = f4;
            }
        }
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@hib MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        return new MediaCodecInfo.CodecProfileLevel[]{nea.createCodecProfileLevel(1, iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1)};
    }

    @c5e(23)
    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isCodecProfileAndLevelSupported(androidx.media3.common.C1213a r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lda.isCodecProfileAndLevelSupported(androidx.media3.common.a, boolean):boolean");
    }

    private boolean isCompressedAudioBitDepthSupported(C1213a c1213a) {
        return (Objects.equals(c1213a.f8291o, "audio/flac") && c1213a.f8268I == 22 && Build.VERSION.SDK_INT < 34 && this.f57252a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean isDetachedSurfaceSupported(@hib MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !needsDetachedSurfaceUnsupportedWorkaround();
    }

    private boolean isSampleMimeTypeSupported(C1213a c1213a) {
        return this.f57253b.equals(c1213a.f8291o) || this.f57253b.equals(nea.getAlternativeCodecMimeType(c1213a));
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        xh9.m25142d("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f57252a + ", " + this.f57253b + "] [" + t0i.f83320e + "]");
    }

    private void logNoSupport(String str) {
        xh9.m25142d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f57252a + ", " + this.f57253b + "] [" + t0i.f83320e + "]");
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDetachedSurfaceUnsupportedWorkaround() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals(ju9.C8096a.f51941c) || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        return false;
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = Build.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static lda newInstance(String str, String str2, String str3, @hib MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new lda(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z5 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    @hib
    public Point alignVideoSizeV21(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f57255d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i, i2);
    }

    public vl3 canReuseCodec(C1213a c1213a, C1213a c1213a2) {
        int i;
        int i2 = !Objects.equals(c1213a.f8291o, c1213a2.f8291o) ? 8 : 0;
        if (this.f57263l) {
            if (c1213a.f8260A != c1213a2.f8260A) {
                i2 |= 1024;
            }
            boolean z = (c1213a.f8298v == c1213a2.f8298v && c1213a.f8299w == c1213a2.f8299w) ? false : true;
            if (!this.f57256e && z) {
                i2 |= 512;
            }
            if ((!e92.isEquivalentToAssumedSdrDefault(c1213a.f8264E) || !e92.isEquivalentToAssumedSdrDefault(c1213a2.f8264E)) && !Objects.equals(c1213a.f8264E, c1213a2.f8264E)) {
                i2 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.f57252a) && !c1213a.initializationDataEquals(c1213a2)) {
                i2 |= 2;
            }
            int i3 = c1213a.f8300x;
            if (i3 != -1 && (i = c1213a.f8301y) != -1 && i3 == c1213a2.f8300x && i == c1213a2.f8301y && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new vl3(this.f57252a, c1213a, c1213a2, c1213a.initializationDataEquals(c1213a2) ? 3 : 2, 0);
            }
        } else {
            if (c1213a.f8266G != c1213a2.f8266G) {
                i2 |= 4096;
            }
            if (c1213a.f8267H != c1213a2.f8267H) {
                i2 |= 8192;
            }
            if (c1213a.f8268I != c1213a2.f8268I) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.f57253b)) {
                Pair<Integer, Integer> codecProfileAndLevel = nea.getCodecProfileAndLevel(c1213a);
                Pair<Integer, Integer> codecProfileAndLevel2 = nea.getCodecProfileAndLevel(c1213a2);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new vl3(this.f57252a, c1213a, c1213a2, 3, 0);
                    }
                }
            }
            if (!c1213a.initializationDataEquals(c1213a2)) {
                i2 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.f57253b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new vl3(this.f57252a, c1213a, c1213a2, 1, 0);
            }
        }
        return new vl3(this.f57252a, c1213a, c1213a2, 0, i2);
    }

    public float getMaxSupportedFrameRate(int i, int i2) {
        if (!this.f57263l) {
            return -3.4028235E38f;
        }
        float f = this.f57266o;
        if (f != -3.4028235E38f && this.f57264m == i && this.f57265n == i2) {
            return f;
        }
        float fComputeMaxSupportedFrameRate = computeMaxSupportedFrameRate(i, i2);
        this.f57266o = fComputeMaxSupportedFrameRate;
        this.f57264m = i;
        this.f57265n = i2;
        return fComputeMaxSupportedFrameRate;
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f57255d;
        if (codecCapabilities == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f57255d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f57255d;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.f57252a, this.f57253b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        logNoSupport("channelCount.support, " + i);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f57255d;
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

    public boolean isFormatFunctionallySupported(C1213a c1213a) {
        return isSampleMimeTypeSupported(c1213a) && isCodecProfileAndLevelSupported(c1213a, false) && isCompressedAudioBitDepthSupported(c1213a);
    }

    public boolean isFormatSupported(C1213a c1213a) throws nea.C9821c {
        int i;
        if (!isSampleMimeTypeSupported(c1213a) || !isCodecProfileAndLevelSupported(c1213a, true) || !isCompressedAudioBitDepthSupported(c1213a)) {
            return false;
        }
        if (this.f57263l) {
            int i2 = c1213a.f8298v;
            if (i2 <= 0 || (i = c1213a.f8299w) <= 0) {
                return true;
            }
            return isVideoSizeAndRateSupportedV21(i2, i, c1213a.f8302z);
        }
        int i3 = c1213a.f8267H;
        if (i3 != -1 && !isAudioSampleRateSupportedV21(i3)) {
            return false;
        }
        int i4 = c1213a.f8266G;
        return i4 == -1 || isAudioChannelCountSupportedV21(i4);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f57253b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(C1213a c1213a) {
        if (this.f57263l) {
            return this.f57256e;
        }
        Pair<Integer, Integer> codecProfileAndLevel = nea.getCodecProfileAndLevel(c1213a);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f57255d;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iAreResolutionAndFrameRateCovered = rda.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                logNoSupport("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !needsRotatedVerticalResolutionWorkaround(this.f57252a) || !areSizeAndRateSupported(videoCapabilities, i2, i, d)) {
                logNoSupport("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            logAssumedSupport("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
        }
        return true;
    }

    public String toString() {
        return this.f57252a;
    }
}
