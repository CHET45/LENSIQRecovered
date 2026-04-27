package p000;

import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import com.arthenica.ffmpegkit.StreamInformation;
import com.watchfun.callvideo.base.BaseCallActivity;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.gue;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@c5e(30)
@ovh
public final class e9c implements MediaParser$OutputConsumer {

    /* JADX INFO: renamed from: A */
    public static final String f32240A = "chunk-index-long-us-times";

    /* JADX INFO: renamed from: u */
    public static final String f32242u = "OConsumerAdapterV30";

    /* JADX INFO: renamed from: w */
    public static final String f32244w = "track-type-string";

    /* JADX INFO: renamed from: x */
    public static final String f32245x = "chunk-index-int-sizes";

    /* JADX INFO: renamed from: y */
    public static final String f32246y = "chunk-index-long-offsets";

    /* JADX INFO: renamed from: z */
    public static final String f32247z = "chunk-index-long-us-durations";

    /* JADX INFO: renamed from: a */
    public final ArrayList<q6h> f32248a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<C1213a> f32249b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<MediaCodec.CryptoInfo> f32250c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<q6h.C11325a> f32251d;

    /* JADX INFO: renamed from: e */
    public final C5205b f32252e;

    /* JADX INFO: renamed from: f */
    public final boolean f32253f;

    /* JADX INFO: renamed from: g */
    public final int f32254g;

    /* JADX INFO: renamed from: h */
    @hib
    public final C1213a f32255h;

    /* JADX INFO: renamed from: i */
    public bk5 f32256i;

    /* JADX INFO: renamed from: j */
    @hib
    public MediaParser.SeekMap f32257j;

    /* JADX INFO: renamed from: k */
    @hib
    public MediaParser.SeekMap f32258k;

    /* JADX INFO: renamed from: l */
    @hib
    public String f32259l;

    /* JADX INFO: renamed from: m */
    @hib
    public mz1 f32260m;

    /* JADX INFO: renamed from: n */
    @hib
    public h2h f32261n;

    /* JADX INFO: renamed from: o */
    public List<C1213a> f32262o;

    /* JADX INFO: renamed from: p */
    public int f32263p;

    /* JADX INFO: renamed from: q */
    public long f32264q;

    /* JADX INFO: renamed from: r */
    public boolean f32265r;

    /* JADX INFO: renamed from: s */
    public boolean f32266s;

    /* JADX INFO: renamed from: t */
    public boolean f32267t;

    /* JADX INFO: renamed from: v */
    public static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f32243v = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);

    /* JADX INFO: renamed from: B */
    public static final Pattern f32241B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* JADX INFO: renamed from: e9c$b */
    public static final class C5205b implements bh3 {

        /* JADX INFO: renamed from: b */
        @hib
        public MediaParser$InputReader f32268b;

        private C5205b() {
        }

        @Override // p000.bh3
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return f9c.m10730a(t0i.castNonNull(this.f32268b)).read(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: e9c$c */
    public static final class C5206c implements gue {

        /* JADX INFO: renamed from: d */
        public final MediaParser.SeekMap f32269d;

        public C5206c(MediaParser.SeekMap seekMap) {
            this.f32269d = seekMap;
        }

        private static lue asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new lue(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // p000.gue
        public long getDurationUs() {
            long durationMicros = this.f32269d.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // p000.gue
        public gue.C6548a getSeekPoints(long j) {
            Pair seekPoints = this.f32269d.getSeekPoints(j);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new gue.C6548a(asExoPlayerSeekPoint(zia.m26863a(obj))) : new gue.C6548a(asExoPlayerSeekPoint(zia.m26863a(obj)), asExoPlayerSeekPoint(zia.m26863a(seekPoints.second)));
        }

        @Override // p000.gue
        public boolean isSeekable() {
            return this.f32269d.isSeekable();
        }
    }

    public e9c() {
        this(null, -2, false);
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.f32248a.size(); size <= i; size++) {
            this.f32248a.add(null);
            this.f32249b.add(null);
            this.f32250c.add(null);
            this.f32251d.add(null);
        }
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
            sb.append("csd-");
            int i2 = i + 1;
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(jfa.getArray(byteBuffer));
            i = i2;
        }
    }

    private static String getMimeType(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return "video/mp4";
            case "android.media.mediaparser.OggParser":
                return "audio/ogg";
            case "android.media.mediaparser.TsParser":
                return "video/mp2t";
            case "android.media.mediaparser.AdtsParser":
                return "audio/mp4a-latm";
            case "android.media.mediaparser.WavParser":
                return "audio/raw";
            case "android.media.mediaparser.PsParser":
                return "video/mp2p";
            case "android.media.mediaparser.Ac3Parser":
                return "audio/ac3";
            case "android.media.mediaparser.AmrParser":
                return "audio/amr";
            case "android.media.mediaparser.FlacParser":
                return "audio/flac";
            case "android.media.mediaparser.MatroskaParser":
                return "video/webm";
            case "android.media.mediaparser.Ac4Parser":
                return "audio/ac4";
            case "android.media.mediaparser.Mp3Parser":
                return "audio/mpeg";
            case "android.media.mediaparser.FlvParser":
                return "video/x-flv";
            default:
                throw new IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.f32265r || this.f32266s) {
            return;
        }
        int size = this.f32248a.size();
        for (int i = 0; i < size; i++) {
            if (this.f32248a.get(i) == null) {
                return;
            }
        }
        this.f32256i.endTracks();
        this.f32266s = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("chunk-index-int-sizes");
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) v80.checkNotNull(mediaFormat.getByteBuffer("chunk-index-long-offsets"))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) v80.checkNotNull(mediaFormat.getByteBuffer("chunk-index-long-us-durations"))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) v80.checkNotNull(mediaFormat.getByteBuffer("chunk-index-long-us-times"))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        mz1 mz1Var = new mz1(iArr, jArr, jArr2, jArr3);
        this.f32260m = mz1Var;
        this.f32256i.seekMap(mz1Var);
        return true;
    }

    @hib
    private q6h.C11325a toExoPlayerCryptoData(int i, @hib MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.f32250c.get(i) == cryptoInfo) {
            return (q6h.C11325a) v80.checkNotNull(this.f32251d.get(i));
        }
        try {
            Matcher matcher = f32241B.matcher(cryptoInfo.toString());
            matcher.find();
            i2 = Integer.parseInt((String) t0i.castNonNull(matcher.group(1)));
            i3 = Integer.parseInt((String) t0i.castNonNull(matcher.group(2)));
        } catch (RuntimeException e) {
            xh9.m25145e("OConsumerAdapterV30", "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i2 = 0;
            i3 = 0;
        }
        q6h.C11325a c11325a = new q6h.C11325a(cryptoInfo.mode, cryptoInfo.key, i2, i3);
        this.f32250c.set(i, cryptoInfo);
        this.f32251d.set(i, c11325a);
        return c11325a;
    }

    @hib
    private static DrmInitData toExoPlayerDrmInitData(@hib String str, @hib android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            schemeDataArr[i] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr);
    }

    private C1213a toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        int i = 0;
        C1213a.b accessibilityChannel = new C1213a.b().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.f32259l).setPeakBitrate(mediaFormat.getInteger("bitrate", -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(jfa.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger(StreamInformation.KEY_WIDTH, -1)).setHeight(mediaFormat.getInteger(StreamInformation.KEY_HEIGHT, -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString(BaseCallActivity.f25142j2)).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        while (true) {
            if (i >= this.f32262o.size()) {
                break;
            }
            C1213a c1213a = this.f32262o.get(i);
            if (Objects.equals(c1213a.f8291o, string) && c1213a.f8271L == integer) {
                accessibilityChannel.setLanguage(c1213a.f8280d).setRoleFlags(c1213a.f8282f).setSelectionFlags(c1213a.f8281e).setLabel(c1213a.f8278b).setLabels(c1213a.f8279c).setMetadata(c1213a.f8288l);
                break;
            }
            i++;
        }
        return accessibilityChannel.build();
    }

    private static int toTrackTypeConstant(@hib String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return rva.getTrackType(str);
        }
    }

    public void disableSeeking() {
        this.f32267t = true;
    }

    @hib
    public mz1 getChunkIndex() {
        return this.f32260m;
    }

    @hib
    public MediaParser.SeekMap getDummySeekMap() {
        return this.f32257j;
    }

    @hib
    public C1213a[] getSampleFormats() {
        if (!this.f32265r) {
            return null;
        }
        C1213a[] c1213aArr = new C1213a[this.f32249b.size()];
        for (int i = 0; i < this.f32249b.size(); i++) {
            c1213aArr[i] = (C1213a) v80.checkNotNull(this.f32249b.get(i));
        }
        return c1213aArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j) {
        MediaParser.SeekMap seekMap = this.f32258k;
        return seekMap != null ? seekMap.getSeekPoints(j) : f32243v;
    }

    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, @hib MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.f32264q;
        if (j2 == -9223372036854775807L || j < j2) {
            h2h h2hVar = this.f32261n;
            if (h2hVar != null) {
                j = h2hVar.adjustSampleTimestamp(j);
            }
            ((q6h) v80.checkNotNull(this.f32248a.get(i))).sampleMetadata(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        ensureSpaceForTrackIndex(i);
        this.f32252e.f32268b = mediaParser$InputReader;
        q6h q6hVarTrack = this.f32248a.get(i);
        if (q6hVarTrack == null) {
            q6hVarTrack = this.f32256i.track(i, -1);
            this.f32248a.set(i, q6hVarTrack);
        }
        q6hVarTrack.sampleData((bh3) this.f32252e, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        gue c5206c;
        if (this.f32253f && this.f32257j == null) {
            this.f32257j = seekMap;
            return;
        }
        this.f32258k = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        bk5 bk5Var = this.f32256i;
        if (this.f32267t) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            c5206c = new gue.C6549b(durationMicros);
        } else {
            c5206c = new C5206c(seekMap);
        }
        bk5Var.seekMap(c5206c);
    }

    public void onTrackCountFound(int i) {
        this.f32265r = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i);
        q6h q6hVar = this.f32248a.get(i);
        if (q6hVar == null) {
            String string = trackData.mediaFormat.getString("track-type-string");
            int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (trackTypeConstant == this.f32254g) {
                this.f32263p = i;
            }
            q6h q6hVarTrack = this.f32256i.track(i, trackTypeConstant);
            this.f32248a.set(i, q6hVarTrack);
            if (string != null) {
                return;
            } else {
                q6hVar = q6hVarTrack;
            }
        }
        C1213a exoPlayerFormat = toExoPlayerFormat(trackData);
        C1213a c1213a = this.f32255h;
        q6hVar.format((c1213a == null || i != this.f32263p) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(c1213a));
        this.f32249b.set(i, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(bk5 bk5Var) {
        this.f32256i = bk5Var;
    }

    public void setMuxedCaptionFormats(List<C1213a> list) {
        this.f32262o = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.f32264q = j;
    }

    public void setSelectedParserName(String str) {
        this.f32259l = getMimeType(str);
    }

    public void setTimestampAdjuster(h2h h2hVar) {
        this.f32261n = h2hVar;
    }

    public e9c(@hib C1213a c1213a, int i, boolean z) {
        this.f32253f = z;
        this.f32255h = c1213a;
        this.f32254g = i;
        this.f32248a = new ArrayList<>();
        this.f32249b = new ArrayList<>();
        this.f32250c = new ArrayList<>();
        this.f32251d = new ArrayList<>();
        this.f32252e = new C5205b();
        this.f32256i = new tdb();
        this.f32264q = -9223372036854775807L;
        this.f32262o = kx7.m15110of();
    }
}
