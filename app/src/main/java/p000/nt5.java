package p000;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class nt5 {

    /* JADX INFO: renamed from: A */
    public static final String f65579A = ".ac4";

    /* JADX INFO: renamed from: B */
    public static final String f65580B = ".adts";

    /* JADX INFO: renamed from: C */
    public static final String f65581C = ".aac";

    /* JADX INFO: renamed from: D */
    public static final String f65582D = ".amr";

    /* JADX INFO: renamed from: E */
    public static final String f65583E = ".flac";

    /* JADX INFO: renamed from: F */
    public static final String f65584F = ".flv";

    /* JADX INFO: renamed from: G */
    public static final String f65585G = ".mid";

    /* JADX INFO: renamed from: H */
    public static final String f65586H = ".midi";

    /* JADX INFO: renamed from: I */
    public static final String f65587I = ".smf";

    /* JADX INFO: renamed from: J */
    public static final String f65588J = ".mk";

    /* JADX INFO: renamed from: K */
    public static final String f65589K = ".webm";

    /* JADX INFO: renamed from: L */
    public static final String f65590L = ".og";

    /* JADX INFO: renamed from: M */
    public static final String f65591M = ".opus";

    /* JADX INFO: renamed from: N */
    public static final String f65592N = ".mp3";

    /* JADX INFO: renamed from: O */
    public static final String f65593O = ".mp4";

    /* JADX INFO: renamed from: P */
    public static final String f65594P = ".m4";

    /* JADX INFO: renamed from: Q */
    public static final String f65595Q = ".mp4";

    /* JADX INFO: renamed from: R */
    public static final String f65596R = ".cmf";

    /* JADX INFO: renamed from: S */
    public static final String f65597S = ".ps";

    /* JADX INFO: renamed from: T */
    public static final String f65598T = ".mpeg";

    /* JADX INFO: renamed from: U */
    public static final String f65599U = ".mpg";

    /* JADX INFO: renamed from: V */
    public static final String f65600V = ".m2p";

    /* JADX INFO: renamed from: W */
    public static final String f65601W = ".ts";

    /* JADX INFO: renamed from: X */
    public static final String f65602X = ".ts";

    /* JADX INFO: renamed from: Y */
    public static final String f65603Y = ".wav";

    /* JADX INFO: renamed from: Z */
    public static final String f65604Z = ".wave";

    /* JADX INFO: renamed from: a */
    public static final int f65605a = -1;

    /* JADX INFO: renamed from: a0 */
    public static final String f65606a0 = ".vtt";

    /* JADX INFO: renamed from: b */
    public static final int f65607b = 0;

    /* JADX INFO: renamed from: b0 */
    public static final String f65608b0 = ".webvtt";

    /* JADX INFO: renamed from: c */
    public static final int f65609c = 1;

    /* JADX INFO: renamed from: c0 */
    public static final String f65610c0 = ".jpg";

    /* JADX INFO: renamed from: d */
    public static final int f65611d = 2;

    /* JADX INFO: renamed from: d0 */
    public static final String f65612d0 = ".jpeg";

    /* JADX INFO: renamed from: e */
    public static final int f65613e = 3;

    /* JADX INFO: renamed from: e0 */
    public static final String f65614e0 = ".avi";

    /* JADX INFO: renamed from: f */
    public static final int f65615f = 4;

    /* JADX INFO: renamed from: f0 */
    public static final String f65616f0 = ".png";

    /* JADX INFO: renamed from: g */
    public static final int f65617g = 5;

    /* JADX INFO: renamed from: g0 */
    public static final String f65618g0 = ".webp";

    /* JADX INFO: renamed from: h */
    public static final int f65619h = 6;

    /* JADX INFO: renamed from: h0 */
    public static final String f65620h0 = ".bmp";

    /* JADX INFO: renamed from: i */
    public static final int f65621i = 7;

    /* JADX INFO: renamed from: i0 */
    public static final String f65622i0 = ".dib";

    /* JADX INFO: renamed from: j */
    public static final int f65623j = 8;

    /* JADX INFO: renamed from: j0 */
    public static final String f65624j0 = ".heic";

    /* JADX INFO: renamed from: k */
    public static final int f65625k = 9;

    /* JADX INFO: renamed from: k0 */
    public static final String f65626k0 = ".heif";

    /* JADX INFO: renamed from: l */
    public static final int f65627l = 10;

    /* JADX INFO: renamed from: l0 */
    public static final String f65628l0 = ".avif";

    /* JADX INFO: renamed from: m */
    public static final int f65629m = 11;

    /* JADX INFO: renamed from: n */
    public static final int f65630n = 12;

    /* JADX INFO: renamed from: o */
    public static final int f65631o = 13;

    /* JADX INFO: renamed from: p */
    public static final int f65632p = 14;

    /* JADX INFO: renamed from: q */
    public static final int f65633q = 15;

    /* JADX INFO: renamed from: r */
    public static final int f65634r = 16;

    /* JADX INFO: renamed from: s */
    public static final int f65635s = 17;

    /* JADX INFO: renamed from: t */
    public static final int f65636t = 18;

    /* JADX INFO: renamed from: u */
    public static final int f65637u = 19;

    /* JADX INFO: renamed from: v */
    public static final int f65638v = 20;

    /* JADX INFO: renamed from: w */
    public static final int f65639w = 21;

    /* JADX INFO: renamed from: x */
    @fdi
    public static final String f65640x = "Content-Type";

    /* JADX INFO: renamed from: y */
    public static final String f65641y = ".ac3";

    /* JADX INFO: renamed from: z */
    public static final String f65642z = ".ec3";

    /* JADX INFO: renamed from: nt5$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10053a {
    }

    private nt5() {
    }

    public static int inferFileTypeFromMimeType(@hib String str) {
        if (str == null) {
            return -1;
        }
        String strNormalizeMimeType = rva.normalizeMimeType(str);
        strNormalizeMimeType.hashCode();
        switch (strNormalizeMimeType) {
        }
        return -1;
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(f65618g0)) {
            return 18;
        }
        if (lastPathSegment.endsWith(f65620h0) || lastPathSegment.endsWith(f65622i0)) {
            return 19;
        }
        if (lastPathSegment.endsWith(f65624j0) || lastPathSegment.endsWith(f65626k0)) {
            return 20;
        }
        return lastPathSegment.endsWith(f65628l0) ? 21 : -1;
    }
}
