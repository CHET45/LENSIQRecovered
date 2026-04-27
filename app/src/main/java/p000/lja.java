package p000;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lja {

    /* JADX INFO: renamed from: a */
    public static final String f57734a = "android.media.mediaparser.inBandCryptoInfo";

    /* JADX INFO: renamed from: b */
    public static final String f57735b = "android.media.mediaparser.includeSupplementalData";

    /* JADX INFO: renamed from: c */
    public static final String f57736c = "android.media.mediaparser.eagerlyExposeTrackType";

    /* JADX INFO: renamed from: d */
    public static final String f57737d = "android.media.mediaparser.exposeDummySeekMap";

    /* JADX INFO: renamed from: e */
    public static final String f57738e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";

    /* JADX INFO: renamed from: f */
    public static final String f57739f = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: renamed from: g */
    public static final String f57740g = "android.media.mediaParser.exposeCaptionFormats";

    /* JADX INFO: renamed from: h */
    public static final String f57741h = "android.media.mediaparser.ignoreTimestampOffset";

    /* JADX INFO: renamed from: lja$a */
    @c5e(31)
    public static final class C8839a {
        private C8839a() {
        }

        @ih4
        public static void setLogSessionIdOnMediaParser(MediaParser mediaParser, k0d k0dVar) {
            LogSessionId logSessionId = k0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionId);
        }
    }

    private lja() {
    }

    @c5e(31)
    public static void setLogSessionIdOnMediaParser(MediaParser mediaParser, k0d k0dVar) {
        C8839a.setLogSessionIdOnMediaParser(mediaParser, k0dVar);
    }

    public static MediaFormat toCaptionsMediaFormat(kq6 kq6Var) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", kq6Var.f54989M);
        int i = kq6Var.f55013j2;
        if (i != -1) {
            mediaFormat.setInteger("caption-service-number", i);
        }
        return mediaFormat;
    }
}
