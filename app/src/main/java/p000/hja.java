package p000;

import android.media.MediaParser;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.ued;

/* JADX INFO: loaded from: classes3.dex */
@c5e(30)
@ovh
public final class hja implements ued {

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final ued.InterfaceC13516a f43810e = new ued.InterfaceC13516a() { // from class: gja
        @Override // p000.ued.InterfaceC13516a
        public final ued createProgressiveMediaExtractor(j0d j0dVar) {
            return hja.lambda$static$0(j0dVar);
        }
    };

    /* JADX INFO: renamed from: a */
    public final e9c f43811a;

    /* JADX INFO: renamed from: b */
    public final d48 f43812b;

    /* JADX INFO: renamed from: c */
    public final MediaParser f43813c;

    /* JADX INFO: renamed from: d */
    public String f43814d;

    /* JADX INFO: renamed from: hja$b */
    public static final class C6873b implements ued.InterfaceC13516a {

        /* JADX INFO: renamed from: a */
        public static final Map<String, Object> f43815a = new HashMap();

        public void setConstantBitrateSeekingEnabled(boolean z) {
            if (!z) {
                Map<String, Object> map = f43815a;
                map.remove("android.media.mediaparser.adts.enableCbrSeeking");
                map.remove("android.media.mediaparser.amr.enableCbrSeeking");
                map.remove("android.media.mediaparser.mp3.enableCbrSeeking");
                return;
            }
            Map<String, Object> map2 = f43815a;
            Boolean bool = Boolean.TRUE;
            map2.put("android.media.mediaparser.adts.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.amr.enableCbrSeeking", bool);
            map2.put("android.media.mediaparser.mp3.enableCbrSeeking", bool);
        }

        @Override // p000.ued.InterfaceC13516a
        public hja createProgressiveMediaExtractor(j0d j0dVar) {
            return new hja(j0dVar, f43815a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ued lambda$static$0(j0d j0dVar) {
        return new hja(j0dVar, ox7.m19076of());
    }

    @Override // p000.ued
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f43814d)) {
            this.f43811a.disableSeeking();
        }
    }

    @Override // p000.ued
    public long getCurrentInputPosition() {
        return this.f43812b.getPosition();
    }

    @Override // p000.ued
    public void init(bh3 bh3Var, Uri uri, Map<String, List<String>> map, long j, long j2, bk5 bk5Var) throws IOException {
        this.f43811a.setExtractorOutput(bk5Var);
        this.f43812b.setDataReader(bh3Var, j2);
        this.f43812b.setCurrentPosition(j);
        String parserName = this.f43813c.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.f43813c.advance(this.f43812b);
            String parserName2 = this.f43813c.getParserName();
            this.f43814d = parserName2;
            this.f43811a.setSelectedParserName(parserName2);
            return;
        }
        if (parserName.equals(this.f43814d)) {
            return;
        }
        String parserName3 = this.f43813c.getParserName();
        this.f43814d = parserName3;
        this.f43811a.setSelectedParserName(parserName3);
    }

    @Override // p000.ued
    public int read(d5d d5dVar) throws IOException {
        boolean zAdvance = this.f43813c.advance(this.f43812b);
        long andResetSeekPosition = this.f43812b.getAndResetSeekPosition();
        d5dVar.f28476a = andResetSeekPosition;
        if (zAdvance) {
            return andResetSeekPosition != -1 ? 1 : 0;
        }
        return -1;
    }

    @Override // p000.ued
    public void release() {
        this.f43813c.release();
    }

    @Override // p000.ued
    public void seek(long j, long j2) {
        this.f43812b.setCurrentPosition(j);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.f43811a.getSeekPoints(j2);
        this.f43813c.seek(zia.m26863a(zia.m26863a(seekPoints.second).position == j ? seekPoints.second : seekPoints.first));
    }

    @Deprecated
    public hja(j0d j0dVar) {
        this(j0dVar, ox7.m19076of());
    }

    @igg({"WrongConstant"})
    private hja(j0d j0dVar, Map<String, Object> map) {
        e9c e9cVar = new e9c();
        this.f43811a = e9cVar;
        this.f43812b = new d48();
        MediaParser mediaParserCreate = MediaParser.create(e9cVar, new String[0]);
        this.f43813c = mediaParserCreate;
        Boolean bool = Boolean.TRUE;
        mediaParserCreate.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        mediaParserCreate.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        mediaParserCreate.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.f43813c.setParameter(entry.getKey(), entry.getValue());
        }
        this.f43814d = "android.media.mediaparser.UNKNOWN";
        if (Build.VERSION.SDK_INT >= 31) {
            kja.setLogSessionIdOnMediaParser(this.f43813c, j0dVar);
        }
    }
}
