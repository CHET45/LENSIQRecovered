package p000;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ot5 {

    /* JADX INFO: renamed from: A */
    public static final String f68656A = ".flv";

    /* JADX INFO: renamed from: B */
    public static final String f68657B = ".mid";

    /* JADX INFO: renamed from: C */
    public static final String f68658C = ".midi";

    /* JADX INFO: renamed from: D */
    public static final String f68659D = ".smf";

    /* JADX INFO: renamed from: E */
    public static final String f68660E = ".mk";

    /* JADX INFO: renamed from: F */
    public static final String f68661F = ".webm";

    /* JADX INFO: renamed from: G */
    public static final String f68662G = ".og";

    /* JADX INFO: renamed from: H */
    public static final String f68663H = ".opus";

    /* JADX INFO: renamed from: I */
    public static final String f68664I = ".mp3";

    /* JADX INFO: renamed from: J */
    public static final String f68665J = ".mp4";

    /* JADX INFO: renamed from: K */
    public static final String f68666K = ".m4";

    /* JADX INFO: renamed from: L */
    public static final String f68667L = ".mp4";

    /* JADX INFO: renamed from: M */
    public static final String f68668M = ".cmf";

    /* JADX INFO: renamed from: N */
    public static final String f68669N = ".ps";

    /* JADX INFO: renamed from: O */
    public static final String f68670O = ".mpeg";

    /* JADX INFO: renamed from: P */
    public static final String f68671P = ".mpg";

    /* JADX INFO: renamed from: Q */
    public static final String f68672Q = ".m2p";

    /* JADX INFO: renamed from: R */
    public static final String f68673R = ".ts";

    /* JADX INFO: renamed from: S */
    public static final String f68674S = ".ts";

    /* JADX INFO: renamed from: T */
    public static final String f68675T = ".wav";

    /* JADX INFO: renamed from: U */
    public static final String f68676U = ".wave";

    /* JADX INFO: renamed from: V */
    public static final String f68677V = ".vtt";

    /* JADX INFO: renamed from: W */
    public static final String f68678W = ".webvtt";

    /* JADX INFO: renamed from: X */
    public static final String f68679X = ".jpg";

    /* JADX INFO: renamed from: Y */
    public static final String f68680Y = ".jpeg";

    /* JADX INFO: renamed from: Z */
    public static final String f68681Z = ".avi";

    /* JADX INFO: renamed from: a */
    public static final int f68682a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f68683b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f68684c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f68685d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f68686e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f68687f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f68688g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f68689h = 6;

    /* JADX INFO: renamed from: i */
    public static final int f68690i = 7;

    /* JADX INFO: renamed from: j */
    public static final int f68691j = 8;

    /* JADX INFO: renamed from: k */
    public static final int f68692k = 9;

    /* JADX INFO: renamed from: l */
    public static final int f68693l = 10;

    /* JADX INFO: renamed from: m */
    public static final int f68694m = 11;

    /* JADX INFO: renamed from: n */
    public static final int f68695n = 12;

    /* JADX INFO: renamed from: o */
    public static final int f68696o = 13;

    /* JADX INFO: renamed from: p */
    public static final int f68697p = 14;

    /* JADX INFO: renamed from: q */
    public static final int f68698q = 15;

    /* JADX INFO: renamed from: r */
    public static final int f68699r = 16;

    /* JADX INFO: renamed from: s */
    @fdi
    public static final String f68700s = "Content-Type";

    /* JADX INFO: renamed from: t */
    public static final String f68701t = ".ac3";

    /* JADX INFO: renamed from: u */
    public static final String f68702u = ".ec3";

    /* JADX INFO: renamed from: v */
    public static final String f68703v = ".ac4";

    /* JADX INFO: renamed from: w */
    public static final String f68704w = ".adts";

    /* JADX INFO: renamed from: x */
    public static final String f68705x = ".aac";

    /* JADX INFO: renamed from: y */
    public static final String f68706y = ".amr";

    /* JADX INFO: renamed from: z */
    public static final String f68707z = ".flac";

    /* JADX INFO: renamed from: ot5$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10649a {
    }

    private ot5() {
    }

    public static int inferFileTypeFromMimeType(@hib String str) {
        if (str == null) {
            return -1;
        }
        String strNormalizeMimeType = sva.normalizeMimeType(str);
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
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }
}
