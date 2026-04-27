package p000;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.media3.common.C1213a;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class kja {

    /* JADX INFO: renamed from: a */
    public static final String f54289a = "android.media.mediaparser.inBandCryptoInfo";

    /* JADX INFO: renamed from: b */
    public static final String f54290b = "android.media.mediaparser.includeSupplementalData";

    /* JADX INFO: renamed from: c */
    public static final String f54291c = "android.media.mediaparser.eagerlyExposeTrackType";

    /* JADX INFO: renamed from: d */
    public static final String f54292d = "android.media.mediaparser.exposeDummySeekMap";

    /* JADX INFO: renamed from: e */
    public static final String f54293e = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";

    /* JADX INFO: renamed from: f */
    public static final String f54294f = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: renamed from: g */
    public static final String f54295g = "android.media.mediaParser.exposeCaptionFormats";

    /* JADX INFO: renamed from: h */
    public static final String f54296h = "android.media.mediaparser.ignoreTimestampOffset";

    /* JADX INFO: renamed from: kja$a */
    @c5e(31)
    public static final class C8396a {
        private C8396a() {
        }

        public static void setLogSessionIdOnMediaParser(MediaParser mediaParser, j0d j0dVar) {
            LogSessionId logSessionId = j0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionId);
        }
    }

    private kja() {
    }

    @c5e(31)
    public static void setLogSessionIdOnMediaParser(MediaParser mediaParser, j0d j0dVar) {
        C8396a.setLogSessionIdOnMediaParser(mediaParser, j0dVar);
    }

    public static MediaFormat toCaptionsMediaFormat(C1213a c1213a) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c1213a.f8291o);
        int i = c1213a.f8271L;
        if (i != -1) {
            mediaFormat.setInteger("caption-service-number", i);
        }
        return mediaFormat;
    }
}
