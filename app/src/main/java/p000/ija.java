package p000;

import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p000.ved;

/* JADX INFO: loaded from: classes4.dex */
@c5e(30)
@Deprecated
public final class ija implements ved {

    /* JADX INFO: renamed from: e */
    public static final ved.InterfaceC14020a f47200e = new ved.InterfaceC14020a() { // from class: fja
        @Override // p000.ved.InterfaceC14020a
        public final ved createProgressiveMediaExtractor(k0d k0dVar) {
            return new ija(k0dVar);
        }
    };

    /* JADX INFO: renamed from: a */
    public final j9c f47201a;

    /* JADX INFO: renamed from: b */
    public final c48 f47202b;

    /* JADX INFO: renamed from: c */
    public final MediaParser f47203c;

    /* JADX INFO: renamed from: d */
    public String f47204d;

    @igg({"WrongConstant"})
    public ija(k0d k0dVar) {
        j9c j9cVar = new j9c();
        this.f47201a = j9cVar;
        this.f47202b = new c48();
        MediaParser mediaParserCreate = MediaParser.create(j9cVar, new String[0]);
        this.f47203c = mediaParserCreate;
        Boolean bool = Boolean.TRUE;
        mediaParserCreate.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        mediaParserCreate.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        mediaParserCreate.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        this.f47204d = "android.media.mediaparser.UNKNOWN";
        if (x0i.f95978a >= 31) {
            lja.setLogSessionIdOnMediaParser(mediaParserCreate, k0dVar);
        }
    }

    @Override // p000.ved
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f47204d)) {
            this.f47201a.disableSeeking();
        }
    }

    @Override // p000.ved
    public long getCurrentInputPosition() {
        return this.f47202b.getPosition();
    }

    @Override // p000.ved
    public void init(ah3 ah3Var, Uri uri, Map<String, List<String>> map, long j, long j2, ck5 ck5Var) throws IOException {
        this.f47201a.setExtractorOutput(ck5Var);
        this.f47202b.setDataReader(ah3Var, j2);
        this.f47202b.setCurrentPosition(j);
        String parserName = this.f47203c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.f47203c.advance(this.f47202b);
            String parserName2 = this.f47203c.getParserName();
            this.f47204d = parserName2;
            this.f47201a.setSelectedParserName(parserName2);
            return;
        }
        if (parserName.equals(this.f47204d)) {
            return;
        }
        String parserName3 = this.f47203c.getParserName();
        this.f47204d = parserName3;
        this.f47201a.setSelectedParserName(parserName3);
    }

    @Override // p000.ved
    public int read(c5d c5dVar) throws IOException {
        boolean zAdvance = this.f47203c.advance(this.f47202b);
        long andResetSeekPosition = this.f47202b.getAndResetSeekPosition();
        c5dVar.f15813a = andResetSeekPosition;
        if (zAdvance) {
            return andResetSeekPosition != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // p000.ved
    public void release() {
        this.f47203c.release();
    }

    @Override // p000.ved
    public void seek(long j, long j2) {
        this.f47202b.setCurrentPosition(j);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.f47201a.getSeekPoints(j2);
        this.f47203c.seek(zia.m26863a(zia.m26863a(seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }
}
