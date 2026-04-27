package p000;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.common.C1213a;
import java.util.List;
import p000.nea;

/* JADX INFO: loaded from: classes3.dex */
public final class rda {

    /* JADX INFO: renamed from: a */
    public static Boolean f77941a = null;

    /* JADX INFO: renamed from: b */
    public static final int f77942b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f77943c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f77944d = 2;

    /* JADX INFO: renamed from: rda$a */
    @c5e(29)
    public static final class C12031a {
        private C12031a() {
        }

        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            qda.m20266a();
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, pda.m19430a(i, i2, (int) d));
            if (iEvaluatePerformancePointCoverage == 1 && rda.f77941a == null) {
                Boolean unused = rda.f77941a = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (rda.f77941a.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }

        private static int evaluateH264RequiredSupport(boolean z) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List supportedPerformancePoints;
            try {
                C1213a c1213aBuild = new C1213a.b().setSampleMimeType("video/avc").build();
                if (c1213aBuild.f8291o != null) {
                    List<lda> decoderInfosSoftMatch = nea.getDecoderInfosSoftMatch(zda.f104850a, c1213aBuild, z, false);
                    for (int i = 0; i < decoderInfosSoftMatch.size(); i++) {
                        if (decoderInfosSoftMatch.get(i).f57255d != null && (videoCapabilities = decoderInfosSoftMatch.get(i).f57255d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            qda.m20266a();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, pda.m19430a(1280, 720, 60));
                        }
                    }
                }
            } catch (nea.C9821c unused) {
            }
            return 0;
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (nda.m17855a(list.get(i)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int iEvaluateH264RequiredSupport = evaluateH264RequiredSupport(false);
            int iEvaluateH264RequiredSupport2 = evaluateH264RequiredSupport(true);
            if (iEvaluateH264RequiredSupport == 0) {
                return true;
            }
            return iEvaluateH264RequiredSupport2 == 0 ? iEvaluateH264RequiredSupport != 2 : (iEvaluateH264RequiredSupport == 2 && iEvaluateH264RequiredSupport2 == 2) ? false : true;
        }
    }

    private rda() {
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f77941a;
        if (bool == null || !bool.booleanValue()) {
            return C12031a.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
