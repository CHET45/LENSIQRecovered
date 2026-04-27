package p000;

import android.media.MediaParser;
import android.os.Build;
import androidx.media3.common.C1213a;
import com.blankj.utilcode.util.C2473f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.hz1;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@c5e(30)
@ovh
public final class via implements hz1 {

    /* JADX INFO: renamed from: F */
    public static final String f91243F = "MediaPrsrChunkExtractor";

    /* JADX INFO: renamed from: H */
    @Deprecated
    public static final hz1.InterfaceC7085a f91244H = new C14092b();

    /* JADX INFO: renamed from: C */
    @hib
    public C1213a[] f91245C;

    /* JADX INFO: renamed from: a */
    public final e9c f91246a;

    /* JADX INFO: renamed from: b */
    public final d48 f91247b;

    /* JADX INFO: renamed from: c */
    public final MediaParser f91248c;

    /* JADX INFO: renamed from: d */
    public final C14093c f91249d;

    /* JADX INFO: renamed from: e */
    public final yd4 f91250e;

    /* JADX INFO: renamed from: f */
    public long f91251f;

    /* JADX INFO: renamed from: m */
    @hib
    public hz1.InterfaceC7086b f91252m;

    /* JADX INFO: renamed from: via$b */
    public static class C14092b implements hz1.InterfaceC7085a {

        /* JADX INFO: renamed from: a */
        public peg.InterfaceC10936a f91253a = new oz3();

        /* JADX INFO: renamed from: b */
        public boolean f91254b;

        @Override // p000.hz1.InterfaceC7085a
        @hib
        public hz1 createProgressiveMediaExtractor(int i, C1213a c1213a, boolean z, List<C1213a> list, @hib q6h q6hVar, j0d j0dVar) {
            if (!rva.isText(c1213a.f8290n)) {
                return new via(i, c1213a, list, j0dVar);
            }
            if (this.f91254b) {
                return new kh1(new geg(this.f91253a.create(c1213a), c1213a), i, c1213a);
            }
            return null;
        }

        @Override // p000.hz1.InterfaceC7085a
        public C1213a getOutputTextFormat(C1213a c1213a) {
            String str;
            if (!this.f91254b || !this.f91253a.supportsFormat(c1213a)) {
                return c1213a;
            }
            C1213a.b cueReplacementBehavior = c1213a.buildUpon().setSampleMimeType(rva.f79794T0).setCueReplacementBehavior(this.f91253a.getCueReplacementBehavior(c1213a));
            StringBuilder sb = new StringBuilder();
            sb.append(c1213a.f8291o);
            if (c1213a.f8287k != null) {
                str = C2473f.f17566z + c1213a.f8287k;
            } else {
                str = "";
            }
            sb.append(str);
            return cueReplacementBehavior.setCodecs(sb.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // p000.hz1.InterfaceC7085a
        @op1
        public C14092b experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.f91254b = z;
            return this;
        }

        @Override // p000.hz1.InterfaceC7085a
        @op1
        public C14092b setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
            this.f91253a = (peg.InterfaceC10936a) v80.checkNotNull(interfaceC10936a);
            return this;
        }
    }

    /* JADX INFO: renamed from: via$c */
    public class C14093c implements bk5 {
        private C14093c() {
        }

        @Override // p000.bk5
        public void endTracks() {
            via viaVar = via.this;
            viaVar.f91245C = viaVar.f91246a.getSampleFormats();
        }

        @Override // p000.bk5
        public void seekMap(gue gueVar) {
        }

        @Override // p000.bk5
        public q6h track(int i, int i2) {
            return via.this.f91252m != null ? via.this.f91252m.track(i, i2) : via.this.f91250e;
        }
    }

    @igg({"WrongConstant"})
    public via(int i, C1213a c1213a, List<C1213a> list, j0d j0dVar) {
        e9c e9cVar = new e9c(c1213a, i, true);
        this.f91246a = e9cVar;
        this.f91247b = new d48();
        String str = rva.isMatroska((String) v80.checkNotNull(c1213a.f8290n)) ? "android.media.mediaparser.MatroskaParser" : "android.media.mediaparser.FragmentedMp4Parser";
        e9cVar.setSelectedParserName(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, e9cVar);
        this.f91248c = mediaParserCreateByName;
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
            arrayList.add(kja.toCaptionsMediaFormat(list.get(i2)));
        }
        this.f91248c.setParameter("android.media.mediaParser.exposeCaptionFormats", arrayList);
        if (Build.VERSION.SDK_INT >= 31) {
            kja.setLogSessionIdOnMediaParser(this.f91248c, j0dVar);
        }
        this.f91246a.setMuxedCaptionFormats(list);
        this.f91249d = new C14093c();
        this.f91250e = new yd4();
        this.f91251f = -9223372036854775807L;
    }

    private void maybeExecutePendingSeek() {
        MediaParser.SeekMap dummySeekMap = this.f91246a.getDummySeekMap();
        long j = this.f91251f;
        if (j == -9223372036854775807L || dummySeekMap == null) {
            return;
        }
        this.f91248c.seek(zia.m26863a(dummySeekMap.getSeekPoints(j).first));
        this.f91251f = -9223372036854775807L;
    }

    @Override // p000.hz1
    @hib
    public mz1 getChunkIndex() {
        return this.f91246a.getChunkIndex();
    }

    @Override // p000.hz1
    @hib
    public C1213a[] getSampleFormats() {
        return this.f91245C;
    }

    @Override // p000.hz1
    public void init(@hib hz1.InterfaceC7086b interfaceC7086b, long j, long j2) {
        this.f91252m = interfaceC7086b;
        this.f91246a.setSampleTimestampUpperLimitFilterUs(j2);
        this.f91246a.setExtractorOutput(this.f91249d);
        this.f91251f = j;
    }

    @Override // p000.hz1
    public boolean read(ak5 ak5Var) throws IOException {
        maybeExecutePendingSeek();
        this.f91247b.setDataReader(ak5Var, ak5Var.getLength());
        return this.f91248c.advance(this.f91247b);
    }

    @Override // p000.hz1
    public void release() {
        this.f91248c.release();
    }
}
