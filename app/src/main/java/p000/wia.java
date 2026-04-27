package p000;

import android.media.MediaParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.iz1;

/* JADX INFO: loaded from: classes4.dex */
@c5e(30)
@Deprecated
public final class wia implements iz1 {

    /* JADX INFO: renamed from: F */
    public static final String f94347F = "MediaPrsrChunkExtractor";

    /* JADX INFO: renamed from: H */
    public static final iz1.InterfaceC7668a f94348H = new iz1.InterfaceC7668a() { // from class: uia
        @Override // p000.iz1.InterfaceC7668a
        public final iz1 createProgressiveMediaExtractor(int i, kq6 kq6Var, boolean z, List list, r6h r6hVar, k0d k0dVar) {
            return wia.lambda$static$0(i, kq6Var, z, list, r6hVar, k0dVar);
        }
    };

    /* JADX INFO: renamed from: C */
    @hib
    public kq6[] f94349C;

    /* JADX INFO: renamed from: a */
    public final j9c f94350a;

    /* JADX INFO: renamed from: b */
    public final c48 f94351b;

    /* JADX INFO: renamed from: c */
    public final MediaParser f94352c;

    /* JADX INFO: renamed from: d */
    public final C14625b f94353d;

    /* JADX INFO: renamed from: e */
    public final ts4 f94354e;

    /* JADX INFO: renamed from: f */
    public long f94355f;

    /* JADX INFO: renamed from: m */
    @hib
    public iz1.InterfaceC7669b f94356m;

    /* JADX INFO: renamed from: wia$b */
    public class C14625b implements ck5 {
        private C14625b() {
        }

        @Override // p000.ck5
        public void endTracks() {
            wia wiaVar = wia.this;
            wiaVar.f94349C = wiaVar.f94350a.getSampleFormats();
        }

        @Override // p000.ck5
        public void seekMap(hue hueVar) {
        }

        @Override // p000.ck5
        public r6h track(int i, int i2) {
            return wia.this.f94356m != null ? wia.this.f94356m.track(i, i2) : wia.this.f94354e;
        }
    }

    @igg({"WrongConstant"})
    public wia(int i, kq6 kq6Var, List<kq6> list, k0d k0dVar) {
        j9c j9cVar = new j9c(kq6Var, i, true);
        this.f94350a = j9cVar;
        this.f94351b = new c48();
        String str = sva.isMatroska((String) u80.checkNotNull(kq6Var.f54988L)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        j9cVar.setSelectedParserName(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, j9cVar);
        this.f94352c = mediaParserCreateByName;
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.exposeDummySeekMap", bool);
        mediaParserCreateByName.setParameter("android.media.mediaParser.exposeChunkIndexAsMediaFormat", bool);
        mediaParserCreateByName.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", bool);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(lja.toCaptionsMediaFormat(list.get(i2)));
        }
        this.f94352c.setParameter("android.media.mediaParser.exposeCaptionFormats", arrayList);
        if (x0i.f95978a >= 31) {
            lja.setLogSessionIdOnMediaParser(this.f94352c, k0dVar);
        }
        this.f94350a.setMuxedCaptionFormats(list);
        this.f94353d = new C14625b();
        this.f94354e = new ts4();
        this.f94355f = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ iz1 lambda$static$0(int i, kq6 kq6Var, boolean z, List list, r6h r6hVar, k0d k0dVar) {
        if (sva.isText(kq6Var.f54988L)) {
            return null;
        }
        return new wia(i, kq6Var, list, k0dVar);
    }

    private void maybeExecutePendingSeek() {
        MediaParser.SeekMap dummySeekMap = this.f94350a.getDummySeekMap();
        long j = this.f94355f;
        if (j == -9223372036854775807L || dummySeekMap == null) {
            return;
        }
        this.f94352c.seek(zia.m26863a(dummySeekMap.getSeekPoints(j).first));
        this.f94355f = -9223372036854775807L;
    }

    @Override // p000.iz1
    @hib
    public lz1 getChunkIndex() {
        return this.f94350a.getChunkIndex();
    }

    @Override // p000.iz1
    @hib
    public kq6[] getSampleFormats() {
        return this.f94349C;
    }

    @Override // p000.iz1
    public void init(@hib iz1.InterfaceC7669b interfaceC7669b, long j, long j2) {
        this.f94356m = interfaceC7669b;
        this.f94350a.setSampleTimestampUpperLimitFilterUs(j2);
        this.f94350a.setExtractorOutput(this.f94353d);
        this.f94355f = j;
    }

    @Override // p000.iz1
    public boolean read(zj5 zj5Var) throws IOException {
        maybeExecutePendingSeek();
        this.f94351b.setDataReader(zj5Var, zj5Var.getLength());
        return this.f94352c.advance(this.f94351b);
    }

    @Override // p000.iz1
    public void release() {
        this.f94352c.release();
    }
}
