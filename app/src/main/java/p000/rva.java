package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class rva {

    /* JADX INFO: renamed from: A */
    public static final String f79755A = "video/mjpeg";

    /* JADX INFO: renamed from: A0 */
    public static final String f79756A0 = "application/cea-708";

    /* JADX INFO: renamed from: B */
    public static final String f79757B = "video/mp42";

    /* JADX INFO: renamed from: B0 */
    public static final String f79758B0 = "application/x-subrip";

    /* JADX INFO: renamed from: C */
    public static final String f79759C = "video/mp43";

    /* JADX INFO: renamed from: C0 */
    public static final String f79760C0 = "application/ttml+xml";

    /* JADX INFO: renamed from: D */
    @ovh
    public static final String f79761D = "video/mv-hevc";

    /* JADX INFO: renamed from: D0 */
    public static final String f79762D0 = "application/x-quicktime-tx3g";

    /* JADX INFO: renamed from: E */
    @ovh
    public static final String f79763E = "video/raw";

    /* JADX INFO: renamed from: E0 */
    public static final String f79764E0 = "application/x-mp4-vtt";

    /* JADX INFO: renamed from: F */
    @ovh
    public static final String f79765F = "video/x-unknown";

    /* JADX INFO: renamed from: F0 */
    public static final String f79766F0 = "application/x-mp4-cea-608";

    /* JADX INFO: renamed from: G */
    public static final String f79767G = "audio/mp4";

    /* JADX INFO: renamed from: G0 */
    @Deprecated
    public static final String f79768G0 = "application/x-rawcc";

    /* JADX INFO: renamed from: H */
    public static final String f79769H = "audio/mp4a-latm";

    /* JADX INFO: renamed from: H0 */
    public static final String f79770H0 = "application/vobsub";

    /* JADX INFO: renamed from: I */
    @ovh
    public static final String f79771I = "audio/x-matroska";

    /* JADX INFO: renamed from: I0 */
    public static final String f79772I0 = "application/pgs";

    /* JADX INFO: renamed from: J */
    public static final String f79773J = "audio/webm";

    /* JADX INFO: renamed from: J0 */
    @ovh
    public static final String f79774J0 = "application/x-scte35";

    /* JADX INFO: renamed from: K */
    public static final String f79775K = "audio/mpeg";

    /* JADX INFO: renamed from: K0 */
    public static final String f79776K0 = "application/sdp";

    /* JADX INFO: renamed from: L */
    public static final String f79777L = "audio/mpeg-L1";

    /* JADX INFO: renamed from: L0 */
    @ovh
    public static final String f79778L0 = "application/x-camera-motion";

    /* JADX INFO: renamed from: M */
    public static final String f79779M = "audio/mpeg-L2";

    /* JADX INFO: renamed from: M0 */
    @ovh
    public static final String f79780M0 = "application/x-depth-metadata";

    /* JADX INFO: renamed from: N */
    public static final String f79781N = "audio/mha1";

    /* JADX INFO: renamed from: N0 */
    @ovh
    public static final String f79782N0 = "application/x-emsg";

    /* JADX INFO: renamed from: O */
    public static final String f79783O = "audio/mhm1";

    /* JADX INFO: renamed from: O0 */
    public static final String f79784O0 = "application/dvbsubs";

    /* JADX INFO: renamed from: P */
    public static final String f79785P = "audio/raw";

    /* JADX INFO: renamed from: P0 */
    @ovh
    public static final String f79786P0 = "application/x-exif";

    /* JADX INFO: renamed from: Q */
    public static final String f79787Q = "audio/g711-alaw";

    /* JADX INFO: renamed from: Q0 */
    @ovh
    public static final String f79788Q0 = "application/x-icy";

    /* JADX INFO: renamed from: R */
    public static final String f79789R = "audio/g711-mlaw";

    /* JADX INFO: renamed from: R0 */
    public static final String f79790R0 = "application/vnd.dvb.ait";

    /* JADX INFO: renamed from: S */
    public static final String f79791S = "audio/ac3";

    /* JADX INFO: renamed from: S0 */
    public static final String f79792S0 = "application/x-rtsp";

    /* JADX INFO: renamed from: T */
    public static final String f79793T = "audio/eac3";

    /* JADX INFO: renamed from: T0 */
    @ovh
    public static final String f79794T0 = "application/x-media3-cues";

    /* JADX INFO: renamed from: U */
    public static final String f79795U = "audio/eac3-joc";

    /* JADX INFO: renamed from: U0 */
    @ovh
    public static final String f79796U0 = "application/x-image-uri";

    /* JADX INFO: renamed from: V */
    public static final String f79797V = "audio/ac4";

    /* JADX INFO: renamed from: V0 */
    public static final String f79798V0 = "image/jpeg";

    /* JADX INFO: renamed from: W */
    public static final String f79799W = "audio/true-hd";

    /* JADX INFO: renamed from: W0 */
    @ovh
    public static final String f79800W0 = "image/jpeg_r";

    /* JADX INFO: renamed from: X */
    public static final String f79801X = "audio/vnd.dts";

    /* JADX INFO: renamed from: X0 */
    @ovh
    public static final String f79802X0 = "image/png";

    /* JADX INFO: renamed from: Y */
    public static final String f79803Y = "audio/vnd.dts.hd";

    /* JADX INFO: renamed from: Y0 */
    @ovh
    public static final String f79804Y0 = "image/heif";

    /* JADX INFO: renamed from: Z */
    public static final String f79805Z = "audio/vnd.dts.hd;profile=lbr";

    /* JADX INFO: renamed from: Z0 */
    @ovh
    public static final String f79806Z0 = "image/heic";

    /* JADX INFO: renamed from: a */
    @ovh
    public static final String f79807a = "video";

    /* JADX INFO: renamed from: a0 */
    @ovh
    public static final String f79808a0 = "audio/vnd.dts.uhd;profile=p2";

    /* JADX INFO: renamed from: a1 */
    @ovh
    public static final String f79809a1 = "image/avif";

    /* JADX INFO: renamed from: b */
    @ovh
    public static final String f79810b = "audio";

    /* JADX INFO: renamed from: b0 */
    public static final String f79811b0 = "audio/vorbis";

    /* JADX INFO: renamed from: b1 */
    @ovh
    public static final String f79812b1 = "image/bmp";

    /* JADX INFO: renamed from: c */
    @ovh
    public static final String f79813c = "text";

    /* JADX INFO: renamed from: c0 */
    public static final String f79814c0 = "audio/opus";

    /* JADX INFO: renamed from: c1 */
    @ovh
    public static final String f79815c1 = "image/webp";

    /* JADX INFO: renamed from: d */
    @ovh
    public static final String f79816d = "image";

    /* JADX INFO: renamed from: d0 */
    public static final String f79817d0 = "audio/amr";

    /* JADX INFO: renamed from: d1 */
    @ovh
    public static final String f79818d1 = "image/raw";

    /* JADX INFO: renamed from: e */
    @ovh
    public static final String f79819e = "application";

    /* JADX INFO: renamed from: e0 */
    public static final String f79820e0 = "audio/3gpp";

    /* JADX INFO: renamed from: e1 */
    @ovh
    public static final String f79821e1 = "ec+3";

    /* JADX INFO: renamed from: f */
    public static final String f79822f = "video/mp4";

    /* JADX INFO: renamed from: f0 */
    public static final String f79823f0 = "audio/amr-wb";

    /* JADX INFO: renamed from: g */
    @ovh
    public static final String f79825g = "video/x-matroska";

    /* JADX INFO: renamed from: g0 */
    public static final String f79826g0 = "audio/flac";

    /* JADX INFO: renamed from: h */
    public static final String f79828h = "video/webm";

    /* JADX INFO: renamed from: h0 */
    public static final String f79829h0 = "audio/alac";

    /* JADX INFO: renamed from: i */
    public static final String f79830i = "video/3gpp";

    /* JADX INFO: renamed from: i0 */
    public static final String f79831i0 = "audio/gsm";

    /* JADX INFO: renamed from: j */
    public static final String f79832j = "video/avc";

    /* JADX INFO: renamed from: j0 */
    public static final String f79833j0 = "audio/ogg";

    /* JADX INFO: renamed from: k */
    @ovh
    public static final String f79834k = "video/apv";

    /* JADX INFO: renamed from: k0 */
    public static final String f79835k0 = "audio/wav";

    /* JADX INFO: renamed from: l */
    public static final String f79836l = "video/hevc";

    /* JADX INFO: renamed from: l0 */
    public static final String f79837l0 = "audio/midi";

    /* JADX INFO: renamed from: m */
    @ovh
    public static final String f79838m = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: m0 */
    @ovh
    public static final String f79839m0 = "audio/iamf";

    /* JADX INFO: renamed from: n */
    @ovh
    public static final String f79840n = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: n0 */
    @ovh
    public static final String f79841n0 = "audio/x-exoplayer-midi";

    /* JADX INFO: renamed from: o */
    public static final String f79842o = "video/av01";

    /* JADX INFO: renamed from: o0 */
    @ovh
    public static final String f79843o0 = "audio/x-unknown";

    /* JADX INFO: renamed from: p */
    public static final String f79844p = "video/mp2t";

    /* JADX INFO: renamed from: p0 */
    public static final String f79845p0 = "text/vtt";

    /* JADX INFO: renamed from: q */
    public static final String f79846q = "video/mp4v-es";

    /* JADX INFO: renamed from: q0 */
    public static final String f79847q0 = "text/x-ssa";

    /* JADX INFO: renamed from: r */
    public static final String f79848r = "video/mpeg";

    /* JADX INFO: renamed from: r0 */
    @ovh
    public static final String f79849r0 = "text/x-unknown";

    /* JADX INFO: renamed from: s */
    public static final String f79850s = "video/mp2p";

    /* JADX INFO: renamed from: s0 */
    public static final String f79851s0 = "application/mp4";

    /* JADX INFO: renamed from: t */
    public static final String f79852t = "video/mpeg2";

    /* JADX INFO: renamed from: t0 */
    public static final String f79853t0 = "application/webm";

    /* JADX INFO: renamed from: u */
    public static final String f79854u = "video/wvc1";

    /* JADX INFO: renamed from: u0 */
    public static final String f79855u0 = "application/x-matroska";

    /* JADX INFO: renamed from: v */
    public static final String f79856v = "video/divx";

    /* JADX INFO: renamed from: v0 */
    public static final String f79857v0 = "application/dash+xml";

    /* JADX INFO: renamed from: w */
    @ovh
    public static final String f79858w = "video/x-flv";

    /* JADX INFO: renamed from: w0 */
    public static final String f79859w0 = "application/x-mpegURL";

    /* JADX INFO: renamed from: x */
    public static final String f79860x = "video/dolby-vision";

    /* JADX INFO: renamed from: x0 */
    public static final String f79861x0 = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: y */
    public static final String f79862y = "video/ogg";

    /* JADX INFO: renamed from: y0 */
    public static final String f79863y0 = "application/id3";

    /* JADX INFO: renamed from: z */
    public static final String f79864z = "video/x-msvideo";

    /* JADX INFO: renamed from: z0 */
    public static final String f79865z0 = "application/cea-608";

    /* JADX INFO: renamed from: f1 */
    public static final ArrayList<C12317a> f79824f1 = new ArrayList<>();

    /* JADX INFO: renamed from: g1 */
    public static final Pattern f79827g1 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: rva$a */
    public static final class C12317a {

        /* JADX INFO: renamed from: a */
        public final String f79866a;

        /* JADX INFO: renamed from: b */
        public final String f79867b;

        /* JADX INFO: renamed from: c */
        public final int f79868c;

        public C12317a(String str, String str2, int i) {
            this.f79866a = str;
            this.f79867b = str2;
            this.f79868c = i;
        }
    }

    /* JADX INFO: renamed from: rva$b */
    @fdi
    public static final class C12318b {

        /* JADX INFO: renamed from: a */
        public final int f79869a;

        /* JADX INFO: renamed from: b */
        public final int f79870b;

        public C12318b(int i, int i2) {
            this.f79869a = i;
            this.f79870b = i2;
        }

        public int getEncoding() {
            int i = this.f79870b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private rva() {
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: a */
    public static C12318b m21577a(String str) {
        Matcher matcher = f79827g1.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) v80.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new C12318b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @ovh
    public static boolean allSamplesAreSyncSamples(@hib String str, @hib String str2) {
        C12318b c12318bM21577a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (c12318bM21577a = m21577a(str2)) != null) {
                    int encoding = c12318bM21577a.getEncoding();
                    if (encoding == 0 || encoding == 16) {
                    }
                    break;
                }
                break;
        }
        return false;
    }

    @ovh
    public static boolean containsCodecsCorrespondingToMimeType(@hib String str, String str2) {
        return getCodecsCorrespondingToMimeType(str, str2) != null;
    }

    @hib
    @ovh
    public static String getAudioMediaMimeType(@hib String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : t0i.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    @hib
    @ovh
    public static String getCodecsCorrespondingToMimeType(@hib String str, @hib String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrSplitCodecs = t0i.splitCodecs(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrSplitCodecs) {
            if (str2.equals(getMediaMimeType(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @hib
    private static String getCustomMimeTypeForCodec(String str) {
        int size = f79824f1.size();
        for (int i = 0; i < size; i++) {
            C12317a c12317a = f79824f1.get(i);
            if (str.startsWith(c12317a.f79867b)) {
                return c12317a.f79866a;
            }
        }
        return null;
    }

    @ovh
    public static int getEncoding(String str, @hib String str2) {
        C12318b c12318bM21577a;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c12318bM21577a = m21577a(str2)) == null) {
                    return 0;
                }
                return c12318bM21577a.getEncoding();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @hib
    @ovh
    public static String getMediaMimeType(@hib String str) {
        C12318b c12318bM21577a;
        String mimeTypeFromMp4ObjectType = null;
        if (str == null) {
            return null;
        }
        String lowerCase = i80.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? "audio/mha1" : lowerCase.startsWith("mhm1") ? "audio/mhm1" : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? "audio/ac3" : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? "audio/eac3" : lowerCase.startsWith("ec+3") ? "audio/eac3-joc" : (lowerCase.startsWith(d72.f28615o) || lowerCase.startsWith("dac4")) ? "audio/ac4" : lowerCase.startsWith("dtsc") ? "audio/vnd.dts" : lowerCase.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? "audio/vnd.dts.hd" : lowerCase.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : lowerCase.startsWith("opus") ? "audio/opus" : lowerCase.startsWith("vorbis") ? "audio/vorbis" : lowerCase.startsWith("flac") ? "audio/flac" : lowerCase.startsWith("stpp") ? "application/ttml+xml" : lowerCase.startsWith("wvtt") ? "text/vtt" : lowerCase.contains("cea708") ? "application/cea-708" : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : getCustomMimeTypeForCodec(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (c12318bM21577a = m21577a(lowerCase)) != null) {
            mimeTypeFromMp4ObjectType = getMimeTypeFromMp4ObjectType(c12318bM21577a.f79869a);
        }
        return mimeTypeFromMp4ObjectType == null ? "audio/mp4a-latm" : mimeTypeFromMp4ObjectType;
    }

    @hib
    @ovh
    public static String getMimeTypeFromMp4ObjectType(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case dk4.f29869f /* 170 */:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @hib
    @ovh
    public static Byte getMp4ObjectTypeFromMimeType(String str) {
        str.hashCode();
        switch (str) {
            case "audio/vorbis":
                return (byte) -35;
            case "audio/mp4a-latm":
                return (byte) 64;
            case "video/mp4v-es":
                return (byte) 32;
            default:
                return null;
        }
    }

    @hib
    @ovh
    public static String getTextMediaMimeType(@hib String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : t0i.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isText(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    @hib
    @ovh
    private static String getTopLevelType(@hib String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    @ovh
    public static int getTrackType(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (isText(str)) {
            return 3;
        }
        if (isImage(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return getTrackTypeForCustomMimeType(str);
    }

    private static int getTrackTypeForCustomMimeType(String str) {
        int size = f79824f1.size();
        for (int i = 0; i < size; i++) {
            C12317a c12317a = f79824f1.get(i);
            if (str.equals(c12317a.f79866a)) {
                return c12317a.f79868c;
            }
        }
        return -1;
    }

    @ovh
    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    @hib
    @ovh
    public static String getVideoMediaMimeType(@hib String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : t0i.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    @ovh
    public static boolean isAudio(@hib String str) {
        return "audio".equals(getTopLevelType(str));
    }

    @ovh
    public static boolean isDolbyVisionCodec(@hib String str, @hib String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    @ovh
    public static boolean isImage(@hib String str) {
        return "image".equals(getTopLevelType(str)) || f79796U0.equals(str);
    }

    @ovh
    public static boolean isMatroska(@hib String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    @bkd
    @ovh
    public static boolean isText(@hib String str) {
        return "text".equals(getTopLevelType(str)) || f79794T0.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    @ovh
    public static boolean isVideo(@hib String str) {
        return "video".equals(getTopLevelType(str));
    }

    @ovh
    public static String normalizeMimeType(String str) {
        String lowerCase;
        if (str == null) {
            return null;
        }
        lowerCase = i80.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "video/x-mvhevc":
                return f79761D;
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return lowerCase;
        }
    }

    @ovh
    public static void registerCustomMimeType(String str, String str2, int i) {
        C12317a c12317a = new C12317a(str, str2, i);
        int size = f79824f1.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            ArrayList<C12317a> arrayList = f79824f1;
            if (str.equals(arrayList.get(i2).f79866a)) {
                arrayList.remove(i2);
                break;
            }
            i2++;
        }
        f79824f1.add(c12317a);
    }
}
