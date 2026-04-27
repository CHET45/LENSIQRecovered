package p000;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C1213a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@igg({"InlinedApi"})
public final class nea {

    /* JADX INFO: renamed from: a */
    public static final String f64140a = "MediaCodecUtil";

    /* JADX INFO: renamed from: b */
    @xc7("MediaCodecUtil.class")
    public static final HashMap<C9820b, List<lda>> f64141b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static int f64142c = -1;

    /* JADX INFO: renamed from: nea$b */
    public static final class C9820b {

        /* JADX INFO: renamed from: a */
        public final String f64143a;

        /* JADX INFO: renamed from: b */
        public final boolean f64144b;

        /* JADX INFO: renamed from: c */
        public final boolean f64145c;

        public C9820b(String str, boolean z, boolean z2) {
            this.f64143a = str;
            this.f64144b = z;
            this.f64145c = z2;
        }

        public boolean equals(@hib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C9820b.class) {
                return false;
            }
            C9820b c9820b = (C9820b) obj;
            return TextUtils.equals(this.f64143a, c9820b.f64143a) && this.f64144b == c9820b.f64144b && this.f64145c == c9820b.f64145c;
        }

        public int hashCode() {
            return ((((this.f64143a.hashCode() + 31) * 31) + (this.f64144b ? 1231 : 1237)) * 31) + (this.f64145c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: nea$c */
    public static class C9821c extends Exception {
        private C9821c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: nea$d */
    public interface InterfaceC9822d {
        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: renamed from: nea$e */
    public static final class C9823e implements InterfaceC9822d {
        private C9823e() {
        }

        @Override // p000.nea.InterfaceC9822d
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p000.nea.InterfaceC9822d
        public MediaCodecInfo getCodecInfoAt(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p000.nea.InterfaceC9822d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p000.nea.InterfaceC9822d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // p000.nea.InterfaceC9822d
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* JADX INFO: renamed from: nea$f */
    public static final class C9824f implements InterfaceC9822d {

        /* JADX INFO: renamed from: a */
        public final int f64146a;

        /* JADX INFO: renamed from: b */
        @hib
        public MediaCodecInfo[] f64147b;

        public C9824f(boolean z, boolean z2, boolean z3) {
            this.f64146a = (z || z2 || z3) ? 1 : 0;
        }

        @z25({"mediaCodecInfos"})
        private void ensureMediaCodecInfosInitialized() {
            if (this.f64147b == null) {
                this.f64147b = new MediaCodecList(this.f64146a).getCodecInfos();
            }
        }

        @Override // p000.nea.InterfaceC9822d
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.f64147b.length;
        }

        @Override // p000.nea.InterfaceC9822d
        public MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.f64147b[i];
        }

        @Override // p000.nea.InterfaceC9822d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p000.nea.InterfaceC9822d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p000.nea.InterfaceC9822d
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* JADX INFO: renamed from: nea$g */
    public interface InterfaceC9825g<T> {
        int getScore(T t);
    }

    private nea() {
    }

    private static void applyWorkarounds(String str, List<lda> list) {
        if ("audio/raw".equals(str)) {
            sortByScore(list, new InterfaceC9825g() { // from class: lea
                @Override // p000.nea.InterfaceC9825g
                public final int getScore(Object obj) {
                    return nea.lambda$applyWorkarounds$3((lda) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f57252a)) {
            return;
        }
        list.add(list.remove(0));
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

    @fdi
    public static synchronized void clearDecoderInfoCache() {
        f64141b.clear();
    }

    @ovh
    public static MediaCodecInfo.CodecProfileLevel createCodecProfileLevel(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    @hib
    public static String getAlternativeCodecMimeType(C1213a c1213a) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if ("audio/eac3-joc".equals(c1213a.f8291o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c1213a.f8291o) && (codecProfileAndLevel = getCodecProfileAndLevel(c1213a)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if (rva.f79761D.equals(c1213a.f8291o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<lda> getAlternativeDecoderInfos(zda zdaVar, C1213a c1213a, boolean z, boolean z2) throws C9821c {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(c1213a);
        return alternativeCodecMimeType == null ? kx7.m15110of() : zdaVar.getDecoderInfos(alternativeCodecMimeType, z, z2);
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
        if (str2.equals(rva.f79761D)) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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
    @Deprecated
    @p28(imports = {"androidx.media3.common.util.CodecSpecificDataUtil"}, replacement = "CodecSpecificDataUtil.getCodecProfileAndLevel(format)")
    public static Pair<Integer, Integer> getCodecProfileAndLevel(C1213a c1213a) {
        return d72.getCodecProfileAndLevel(c1213a);
    }

    @hib
    public static lda getDecoderInfo(String str, boolean z, boolean z2) throws C9821c {
        List<lda> decoderInfos = getDecoderInfos(str, z, z2);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<lda> getDecoderInfos(String str, boolean z, boolean z2) throws C9821c {
        try {
            C9820b c9820b = new C9820b(str, z, z2);
            HashMap<C9820b, List<lda>> map = f64141b;
            List<lda> list = map.get(c9820b);
            if (list != null) {
                return list;
            }
            ArrayList<lda> decoderInfosInternal = getDecoderInfosInternal(c9820b, new C9824f(z, z2, str.equals(rva.f79761D)));
            if (z) {
                decoderInfosInternal.isEmpty();
            }
            applyWorkarounds(str, decoderInfosInternal);
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) decoderInfosInternal);
            map.put(c9820b, kx7VarCopyOf);
            return kx7VarCopyOf;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<p000.lda> getDecoderInfosInternal(p000.nea.C9820b r23, p000.nea.InterfaceC9822d r24) throws p000.nea.C9821c {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nea.getDecoderInfosInternal(nea$b, nea$d):java.util.ArrayList");
    }

    @g5e({"#2.sampleMimeType"})
    public static List<lda> getDecoderInfosSoftMatch(zda zdaVar, C1213a c1213a, boolean z, boolean z2) throws C9821c {
        List<lda> decoderInfos = zdaVar.getDecoderInfos(c1213a.f8291o, z, z2);
        return kx7.builder().addAll((Iterable) decoderInfos).addAll((Iterable) getAlternativeDecoderInfos(zdaVar, c1213a, z, z2)).build();
    }

    @yx1
    public static List<lda> getDecoderInfosSortedByFormatSupport(List<lda> list, final C1213a c1213a) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new InterfaceC9825g() { // from class: mea
            @Override // p000.nea.InterfaceC9825g
            public final int getScore(Object obj) {
                return nea.lambda$getDecoderInfosSortedByFormatSupport$0(c1213a, (lda) obj);
            }
        });
        return arrayList;
    }

    @yx1
    public static List<lda> getDecoderInfosSortedByFullFormatSupport(List<lda> list, final C1213a c1213a) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new InterfaceC9825g() { // from class: jea
            @Override // p000.nea.InterfaceC9825g
            public final int getScore(Object obj) {
                return nea.lambda$getDecoderInfosSortedByFullFormatSupport$1(c1213a, (lda) obj);
            }
        });
        return arrayList;
    }

    @yx1
    public static List<lda> getDecoderInfosSortedBySoftwareOnly(List<lda> list) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new InterfaceC9825g() { // from class: iea
            @Override // p000.nea.InterfaceC9825g
            public final int getScore(Object obj) {
                return nea.lambda$getDecoderInfosSortedBySoftwareOnly$2((lda) obj);
            }
        });
        return kx7.copyOf((Collection) arrayList);
    }

    @hib
    public static lda getDecryptOnlyDecoderInfo() throws C9821c {
        return getDecoderInfo("audio/raw", false, false);
    }

    @hib
    public static Pair<Integer, Integer> getHevcBaseLayerCodecProfileAndLevel(C1213a c1213a) {
        String h265BaseLayerCodecsString = n8b.getH265BaseLayerCodecsString(c1213a.f8294r);
        if (h265BaseLayerCodecsString == null) {
            return null;
        }
        return d72.getHevcProfileAndLevel(h265BaseLayerCodecsString, t0i.split(h265BaseLayerCodecsString.trim(), "\\."), c1213a.f8264E);
    }

    private static boolean isAlias(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    @c5e(29)
    private static boolean isAliasV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z || !str.endsWith(".secure");
    }

    private static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    @c5e(29)
    private static boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (rva.isAudio(str)) {
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
        if (Build.VERSION.SDK_INT >= 29) {
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
    public static /* synthetic */ int lambda$applyWorkarounds$3(lda ldaVar) {
        String str = ldaVar.f57252a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(C1213a c1213a, lda ldaVar) {
        return ldaVar.isFormatFunctionallySupported(c1213a) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFullFormatSupport$1(C1213a c1213a, lda ldaVar) {
        try {
            return ldaVar.isFormatSupported(c1213a) ? 1 : 0;
        } catch (C9821c unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedBySoftwareOnly$2(lda ldaVar) {
        return (ldaVar.f57260i ? 2 : 0) + (!ldaVar.f57261j ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortByScore$4(InterfaceC9825g interfaceC9825g, Object obj, Object obj2) {
        return interfaceC9825g.getScore(obj2) - interfaceC9825g.getScore(obj);
    }

    public static int maxH264DecodableFrameSize() throws C9821c {
        if (f64142c == -1) {
            int iMax = 0;
            lda decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, 345600);
            }
            f64142c = iMax;
        }
        return f64142c;
    }

    private static <T> void sortByScore(List<T> list, final InterfaceC9825g<T> interfaceC9825g) {
        Collections.sort(list, new Comparator() { // from class: kea
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nea.lambda$sortByScore$4(interfaceC9825g, obj, obj2);
            }
        });
    }

    public static void warmDecoderInfoCache(String str, boolean z, boolean z2) {
        try {
            getDecoderInfos(str, z, z2);
        } catch (C9821c e) {
            xh9.m25145e("MediaCodecUtil", "Codec warming failed", e);
        }
    }
}
