package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class sva {

    /* JADX INFO: renamed from: A */
    public static final String f82969A = "video/mp42";

    /* JADX INFO: renamed from: A0 */
    public static final String f82970A0 = "application/ttml+xml";

    /* JADX INFO: renamed from: B */
    public static final String f82971B = "video/mp43";

    /* JADX INFO: renamed from: B0 */
    public static final String f82972B0 = "application/x-quicktime-tx3g";

    /* JADX INFO: renamed from: C */
    public static final String f82973C = "video/raw";

    /* JADX INFO: renamed from: C0 */
    public static final String f82974C0 = "application/x-mp4-vtt";

    /* JADX INFO: renamed from: D */
    public static final String f82975D = "video/x-unknown";

    /* JADX INFO: renamed from: D0 */
    public static final String f82976D0 = "application/x-mp4-cea-608";

    /* JADX INFO: renamed from: E */
    public static final String f82977E = "audio/mp4";

    /* JADX INFO: renamed from: E0 */
    @Deprecated
    public static final String f82978E0 = "application/x-rawcc";

    /* JADX INFO: renamed from: F */
    public static final String f82979F = "audio/mp4a-latm";

    /* JADX INFO: renamed from: F0 */
    public static final String f82980F0 = "application/vobsub";

    /* JADX INFO: renamed from: G */
    public static final String f82981G = "audio/x-matroska";

    /* JADX INFO: renamed from: G0 */
    public static final String f82982G0 = "application/pgs";

    /* JADX INFO: renamed from: H */
    public static final String f82983H = "audio/webm";

    /* JADX INFO: renamed from: H0 */
    public static final String f82984H0 = "application/x-scte35";

    /* JADX INFO: renamed from: I */
    public static final String f82985I = "audio/mpeg";

    /* JADX INFO: renamed from: I0 */
    public static final String f82986I0 = "application/x-camera-motion";

    /* JADX INFO: renamed from: J */
    public static final String f82987J = "audio/mpeg-L1";

    /* JADX INFO: renamed from: J0 */
    public static final String f82988J0 = "application/x-emsg";

    /* JADX INFO: renamed from: K */
    public static final String f82989K = "audio/mpeg-L2";

    /* JADX INFO: renamed from: K0 */
    public static final String f82990K0 = "application/dvbsubs";

    /* JADX INFO: renamed from: L */
    public static final String f82991L = "audio/mha1";

    /* JADX INFO: renamed from: L0 */
    public static final String f82992L0 = "application/x-exif";

    /* JADX INFO: renamed from: M */
    public static final String f82993M = "audio/mhm1";

    /* JADX INFO: renamed from: M0 */
    public static final String f82994M0 = "application/x-icy";

    /* JADX INFO: renamed from: N */
    public static final String f82995N = "audio/raw";

    /* JADX INFO: renamed from: N0 */
    public static final String f82996N0 = "application/vnd.dvb.ait";

    /* JADX INFO: renamed from: O */
    public static final String f82997O = "audio/g711-alaw";

    /* JADX INFO: renamed from: O0 */
    public static final String f82998O0 = "application/x-rtsp";

    /* JADX INFO: renamed from: P */
    public static final String f82999P = "audio/g711-mlaw";

    /* JADX INFO: renamed from: P0 */
    public static final String f83000P0 = "image/png";

    /* JADX INFO: renamed from: Q */
    public static final String f83001Q = "audio/ac3";

    /* JADX INFO: renamed from: Q0 */
    public static final String f83002Q0 = "image/webp";

    /* JADX INFO: renamed from: R */
    public static final String f83003R = "audio/eac3";

    /* JADX INFO: renamed from: R0 */
    public static final String f83004R0 = "image/jpeg";

    /* JADX INFO: renamed from: S */
    public static final String f83005S = "audio/eac3-joc";

    /* JADX INFO: renamed from: S0 */
    public static final String f83006S0 = "image/heic";

    /* JADX INFO: renamed from: T */
    public static final String f83007T = "audio/ac4";

    /* JADX INFO: renamed from: T0 */
    public static final String f83008T0 = "image/heif";

    /* JADX INFO: renamed from: U */
    public static final String f83009U = "audio/true-hd";

    /* JADX INFO: renamed from: U0 */
    public static final String f83010U0 = "ec+3";

    /* JADX INFO: renamed from: V */
    public static final String f83011V = "audio/vnd.dts";

    /* JADX INFO: renamed from: W */
    public static final String f83013W = "audio/vnd.dts.hd";

    /* JADX INFO: renamed from: X */
    public static final String f83015X = "audio/vnd.dts.hd;profile=lbr";

    /* JADX INFO: renamed from: Y */
    public static final String f83016Y = "audio/vnd.dts.uhd;profile=p2";

    /* JADX INFO: renamed from: Z */
    public static final String f83017Z = "audio/vorbis";

    /* JADX INFO: renamed from: a */
    public static final String f83018a = "video";

    /* JADX INFO: renamed from: a0 */
    public static final String f83019a0 = "audio/opus";

    /* JADX INFO: renamed from: b */
    public static final String f83020b = "audio";

    /* JADX INFO: renamed from: b0 */
    public static final String f83021b0 = "audio/amr";

    /* JADX INFO: renamed from: c */
    public static final String f83022c = "text";

    /* JADX INFO: renamed from: c0 */
    public static final String f83023c0 = "audio/3gpp";

    /* JADX INFO: renamed from: d */
    public static final String f83024d = "image";

    /* JADX INFO: renamed from: d0 */
    public static final String f83025d0 = "audio/amr-wb";

    /* JADX INFO: renamed from: e */
    public static final String f83026e = "application";

    /* JADX INFO: renamed from: e0 */
    public static final String f83027e0 = "audio/flac";

    /* JADX INFO: renamed from: f */
    public static final String f83028f = "video/mp4";

    /* JADX INFO: renamed from: f0 */
    public static final String f83029f0 = "audio/alac";

    /* JADX INFO: renamed from: g */
    public static final String f83030g = "video/x-matroska";

    /* JADX INFO: renamed from: g0 */
    public static final String f83031g0 = "audio/gsm";

    /* JADX INFO: renamed from: h */
    public static final String f83032h = "video/webm";

    /* JADX INFO: renamed from: h0 */
    public static final String f83033h0 = "audio/ogg";

    /* JADX INFO: renamed from: i */
    public static final String f83034i = "video/3gpp";

    /* JADX INFO: renamed from: i0 */
    public static final String f83035i0 = "audio/wav";

    /* JADX INFO: renamed from: j */
    public static final String f83036j = "video/avc";

    /* JADX INFO: renamed from: j0 */
    public static final String f83037j0 = "audio/midi";

    /* JADX INFO: renamed from: k */
    public static final String f83038k = "video/hevc";

    /* JADX INFO: renamed from: k0 */
    public static final String f83039k0 = "audio/x-exoplayer-midi";

    /* JADX INFO: renamed from: l */
    public static final String f83040l = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: l0 */
    public static final String f83041l0 = "audio/x-unknown";

    /* JADX INFO: renamed from: m */
    public static final String f83042m = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: m0 */
    public static final String f83043m0 = "text/vtt";

    /* JADX INFO: renamed from: n */
    public static final String f83044n = "video/av01";

    /* JADX INFO: renamed from: n0 */
    public static final String f83045n0 = "text/x-ssa";

    /* JADX INFO: renamed from: o */
    public static final String f83046o = "video/mp2t";

    /* JADX INFO: renamed from: o0 */
    public static final String f83047o0 = "text/x-exoplayer-cues";

    /* JADX INFO: renamed from: p */
    public static final String f83048p = "video/mp4v-es";

    /* JADX INFO: renamed from: p0 */
    public static final String f83049p0 = "text/x-unknown";

    /* JADX INFO: renamed from: q */
    public static final String f83050q = "video/mpeg";

    /* JADX INFO: renamed from: q0 */
    public static final String f83051q0 = "application/mp4";

    /* JADX INFO: renamed from: r */
    public static final String f83052r = "video/mp2p";

    /* JADX INFO: renamed from: r0 */
    public static final String f83053r0 = "application/webm";

    /* JADX INFO: renamed from: s */
    public static final String f83054s = "video/mpeg2";

    /* JADX INFO: renamed from: s0 */
    public static final String f83055s0 = "application/x-matroska";

    /* JADX INFO: renamed from: t */
    public static final String f83056t = "video/wvc1";

    /* JADX INFO: renamed from: t0 */
    public static final String f83057t0 = "application/dash+xml";

    /* JADX INFO: renamed from: u */
    public static final String f83058u = "video/divx";

    /* JADX INFO: renamed from: u0 */
    public static final String f83059u0 = "application/x-mpegURL";

    /* JADX INFO: renamed from: v */
    public static final String f83060v = "video/x-flv";

    /* JADX INFO: renamed from: v0 */
    public static final String f83061v0 = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: w */
    public static final String f83062w = "video/dolby-vision";

    /* JADX INFO: renamed from: w0 */
    public static final String f83063w0 = "application/id3";

    /* JADX INFO: renamed from: x */
    public static final String f83064x = "video/ogg";

    /* JADX INFO: renamed from: x0 */
    public static final String f83065x0 = "application/cea-608";

    /* JADX INFO: renamed from: y */
    public static final String f83066y = "video/x-msvideo";

    /* JADX INFO: renamed from: y0 */
    public static final String f83067y0 = "application/cea-708";

    /* JADX INFO: renamed from: z */
    public static final String f83068z = "video/mjpeg";

    /* JADX INFO: renamed from: z0 */
    public static final String f83069z0 = "application/x-subrip";

    /* JADX INFO: renamed from: V0 */
    public static final ArrayList<C12805a> f83012V0 = new ArrayList<>();

    /* JADX INFO: renamed from: W0 */
    public static final Pattern f83014W0 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: sva$a */
    public static final class C12805a {

        /* JADX INFO: renamed from: a */
        public final String f83070a;

        /* JADX INFO: renamed from: b */
        public final String f83071b;

        /* JADX INFO: renamed from: c */
        public final int f83072c;

        public C12805a(String str, String str2, int i) {
            this.f83070a = str;
            this.f83071b = str2;
            this.f83072c = i;
        }
    }

    /* JADX INFO: renamed from: sva$b */
    @fdi
    public static final class C12806b {

        /* JADX INFO: renamed from: a */
        public final int f83073a;

        /* JADX INFO: renamed from: b */
        public final int f83074b;

        public C12806b(int i, int i2) {
            this.f83073a = i;
            this.f83074b = i2;
        }

        public int getEncoding() {
            int i = this.f83074b;
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

    private sva() {
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: a */
    public static C12806b m22264a(String str) {
        Matcher matcher = f83014W0.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) u80.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new C12806b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean allSamplesAreSyncSamples(@hib String str, @hib String str2) {
        C12806b c12806bM22264a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (c12806bM22264a = m22264a(str2)) != null) {
                    int encoding = c12806bM22264a.getEncoding();
                    if (encoding == 0 || encoding == 16) {
                    }
                    break;
                }
                break;
        }
        return false;
    }

    public static boolean containsCodecsCorrespondingToMimeType(@hib String str, String str2) {
        return getCodecsCorrespondingToMimeType(str, str2) != null;
    }

    @hib
    public static String getAudioMediaMimeType(@hib String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x0i.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    @hib
    public static String getCodecsCorrespondingToMimeType(@hib String str, @hib String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrSplitCodecs = x0i.splitCodecs(str);
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
        int size = f83012V0.size();
        for (int i = 0; i < size; i++) {
            C12805a c12805a = f83012V0.get(i);
            if (str.startsWith(c12805a.f83071b)) {
                return c12805a.f83070a;
            }
        }
        return null;
    }

    public static int getEncoding(String str, @hib String str2) {
        C12806b c12806bM22264a;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c12806bM22264a = m22264a(str2)) == null) {
                    return 0;
                }
                return c12806bM22264a.getEncoding();
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
    public static String getMediaMimeType(@hib String str) {
        C12806b c12806bM22264a;
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
        if (lowerCase.startsWith("mp4a.") && (c12806bM22264a = m22264a(lowerCase)) != null) {
            mimeTypeFromMp4ObjectType = getMimeTypeFromMp4ObjectType(c12806bM22264a.f83073a);
        }
        return mimeTypeFromMp4ObjectType == null ? "audio/mp4a-latm" : mimeTypeFromMp4ObjectType;
    }

    @hib
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
    public static String getTextMediaMimeType(@hib String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x0i.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isText(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    @hib
    private static String getTopLevelType(@hib String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

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
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return getTrackTypeForCustomMimeType(str);
    }

    private static int getTrackTypeForCustomMimeType(String str) {
        int size = f83012V0.size();
        for (int i = 0; i < size; i++) {
            C12805a c12805a = f83012V0.get(i);
            if (str.equals(c12805a.f83070a)) {
                return c12805a.f83072c;
            }
        }
        return -1;
    }

    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    @hib
    public static String getVideoMediaMimeType(@hib String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : x0i.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean isAudio(@hib String str) {
        return "audio".equals(getTopLevelType(str));
    }

    public static boolean isImage(@hib String str) {
        return "image".equals(getTopLevelType(str));
    }

    public static boolean isMatroska(@hib String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean isText(@hib String str) {
        return "text".equals(getTopLevelType(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean isVideo(@hib String str) {
        return "video".equals(getTopLevelType(str));
    }

    public static String normalizeMimeType(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }

    public static void registerCustomMimeType(String str, String str2, int i) {
        C12805a c12805a = new C12805a(str, str2, i);
        int size = f83012V0.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            ArrayList<C12805a> arrayList = f83012V0;
            if (str.equals(arrayList.get(i2).f83070a)) {
                arrayList.remove(i2);
                break;
            }
            i2++;
        }
        f83012V0.add(c12805a);
    }
}
