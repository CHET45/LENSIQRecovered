package p000;

import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.watchfun.callvideo.base.BaseCallActivity;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.hue;
import p000.kq6;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@c5e(30)
@igg({"Override"})
@Deprecated
public final class j9c implements MediaParser$OutputConsumer {

    /* JADX INFO: renamed from: A */
    public static final String f50008A = "chunk-index-long-us-times";

    /* JADX INFO: renamed from: u */
    public static final String f50010u = "OConsumerAdapterV30";

    /* JADX INFO: renamed from: w */
    public static final String f50012w = "track-type-string";

    /* JADX INFO: renamed from: x */
    public static final String f50013x = "chunk-index-int-sizes";

    /* JADX INFO: renamed from: y */
    public static final String f50014y = "chunk-index-long-offsets";

    /* JADX INFO: renamed from: z */
    public static final String f50015z = "chunk-index-long-us-durations";

    /* JADX INFO: renamed from: a */
    public final ArrayList<r6h> f50016a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<kq6> f50017b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<MediaCodec.CryptoInfo> f50018c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<r6h.C11906a> f50019d;

    /* JADX INFO: renamed from: e */
    public final C7818b f50020e;

    /* JADX INFO: renamed from: f */
    public final boolean f50021f;

    /* JADX INFO: renamed from: g */
    public final int f50022g;

    /* JADX INFO: renamed from: h */
    @hib
    public final kq6 f50023h;

    /* JADX INFO: renamed from: i */
    public ck5 f50024i;

    /* JADX INFO: renamed from: j */
    @hib
    public MediaParser.SeekMap f50025j;

    /* JADX INFO: renamed from: k */
    @hib
    public MediaParser.SeekMap f50026k;

    /* JADX INFO: renamed from: l */
    @hib
    public String f50027l;

    /* JADX INFO: renamed from: m */
    @hib
    public lz1 f50028m;

    /* JADX INFO: renamed from: n */
    @hib
    public g2h f50029n;

    /* JADX INFO: renamed from: o */
    public List<kq6> f50030o;

    /* JADX INFO: renamed from: p */
    public int f50031p;

    /* JADX INFO: renamed from: q */
    public long f50032q;

    /* JADX INFO: renamed from: r */
    public boolean f50033r;

    /* JADX INFO: renamed from: s */
    public boolean f50034s;

    /* JADX INFO: renamed from: t */
    public boolean f50035t;

    /* JADX INFO: renamed from: v */
    public static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f50011v = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);

    /* JADX INFO: renamed from: B */
    public static final Pattern f50009B = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* JADX INFO: renamed from: j9c$b */
    public static final class C7818b implements ah3 {

        /* JADX INFO: renamed from: b */
        @hib
        public MediaParser$InputReader f50036b;

        private C7818b() {
        }

        @Override // p000.ah3, p000.en7
        public int read(byte[] bArr, int i, int i2) throws IOException {
            return f9c.m10730a(x0i.castNonNull(this.f50036b)).read(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: j9c$c */
    public static final class C7819c implements hue {

        /* JADX INFO: renamed from: d */
        public final MediaParser.SeekMap f50037d;

        public C7819c(MediaParser.SeekMap seekMap) {
            this.f50037d = seekMap;
        }

        private static kue asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new kue(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // p000.hue
        public long getDurationUs() {
            long durationMicros = this.f50037d.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // p000.hue
        public hue.C7023a getSeekPoints(long j) {
            Pair seekPoints = this.f50037d.getSeekPoints(j);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new hue.C7023a(asExoPlayerSeekPoint(zia.m26863a(obj))) : new hue.C7023a(asExoPlayerSeekPoint(zia.m26863a(obj)), asExoPlayerSeekPoint(zia.m26863a(seekPoints.second)));
        }

        @Override // p000.hue
        public boolean isSeekable() {
            return this.f50037d.isSeekable();
        }
    }

    public j9c() {
        this(null, -2, false);
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.f50016a.size(); size <= i; size++) {
            this.f50016a.add(null);
            this.f50017b.add(null);
            this.f50018c.add(null);
            this.f50019d.add(null);
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
            arrayList.add(ifa.getArray(byteBuffer));
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
        if (!this.f50033r || this.f50034s) {
            return;
        }
        int size = this.f50016a.size();
        for (int i = 0; i < size; i++) {
            if (this.f50016a.get(i) == null) {
                return;
            }
        }
        this.f50024i.endTracks();
        this.f50034s = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("chunk-index-int-sizes");
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) u80.checkNotNull(mediaFormat.getByteBuffer("chunk-index-long-offsets"))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) u80.checkNotNull(mediaFormat.getByteBuffer("chunk-index-long-us-durations"))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) u80.checkNotNull(mediaFormat.getByteBuffer("chunk-index-long-us-times"))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        lz1 lz1Var = new lz1(iArr, jArr, jArr2, jArr3);
        this.f50028m = lz1Var;
        this.f50024i.seekMap(lz1Var);
        return true;
    }

    @hib
    private r6h.C11906a toExoPlayerCryptoData(int i, @hib MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.f50018c.get(i) == cryptoInfo) {
            return (r6h.C11906a) u80.checkNotNull(this.f50019d.get(i));
        }
        try {
            Matcher matcher = f50009B.matcher(cryptoInfo.toString());
            matcher.find();
            i2 = Integer.parseInt((String) x0i.castNonNull(matcher.group(1)));
            i3 = Integer.parseInt((String) x0i.castNonNull(matcher.group(2)));
        } catch (RuntimeException e) {
            yh9.m25916e("OConsumerAdapterV30", "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i2 = 0;
            i3 = 0;
        }
        r6h.C11906a c11906a = new r6h.C11906a(cryptoInfo.mode, cryptoInfo.key, i2, i3);
        this.f50018c.set(i, cryptoInfo);
        this.f50019d.set(i, c11906a);
        return c11906a;
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
        return new com.google.android.exoplayer2.drm.DrmInitData(str, schemeDataArr);
    }

    private kq6 toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        int i = 0;
        kq6.C8497b accessibilityChannel = new kq6.C8497b().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.f50027l).setPeakBitrate(mediaFormat.getInteger("bitrate", -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(ifa.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger(StreamInformation.KEY_WIDTH, -1)).setHeight(mediaFormat.getInteger(StreamInformation.KEY_HEIGHT, -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString(BaseCallActivity.f25142j2)).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        while (true) {
            if (i >= this.f50030o.size()) {
                break;
            }
            kq6 kq6Var = this.f50030o.get(i);
            if (x0i.areEqual(kq6Var.f54989M, string) && kq6Var.f55013j2 == integer) {
                accessibilityChannel.setLanguage(kq6Var.f55002c).setRoleFlags(kq6Var.f55006e).setSelectionFlags(kq6Var.f55004d).setLabel(kq6Var.f55000b).setMetadata(kq6Var.f54987H);
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
                return sva.getTrackType(str);
        }
    }

    public void disableSeeking() {
        this.f50035t = true;
    }

    @hib
    public lz1 getChunkIndex() {
        return this.f50028m;
    }

    @hib
    public MediaParser.SeekMap getDummySeekMap() {
        return this.f50025j;
    }

    @hib
    public kq6[] getSampleFormats() {
        if (!this.f50033r) {
            return null;
        }
        kq6[] kq6VarArr = new kq6[this.f50017b.size()];
        for (int i = 0; i < this.f50017b.size(); i++) {
            kq6VarArr[i] = (kq6) u80.checkNotNull(this.f50017b.get(i));
        }
        return kq6VarArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j) {
        MediaParser.SeekMap seekMap = this.f50026k;
        return seekMap != null ? seekMap.getSeekPoints(j) : f50011v;
    }

    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, @hib MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.f50032q;
        if (j2 == -9223372036854775807L || j < j2) {
            g2h g2hVar = this.f50029n;
            if (g2hVar != null) {
                j = g2hVar.adjustSampleTimestamp(j);
            }
            ((r6h) u80.checkNotNull(this.f50016a.get(i))).sampleMetadata(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        ensureSpaceForTrackIndex(i);
        this.f50020e.f50036b = mediaParser$InputReader;
        r6h r6hVarTrack = this.f50016a.get(i);
        if (r6hVarTrack == null) {
            r6hVarTrack = this.f50024i.track(i, -1);
            this.f50016a.set(i, r6hVarTrack);
        }
        r6hVarTrack.sampleData((ah3) this.f50020e, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        hue c7819c;
        if (this.f50021f && this.f50025j == null) {
            this.f50025j = seekMap;
            return;
        }
        this.f50026k = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ck5 ck5Var = this.f50024i;
        if (this.f50035t) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            c7819c = new hue.C7024b(durationMicros);
        } else {
            c7819c = new C7819c(seekMap);
        }
        ck5Var.seekMap(c7819c);
    }

    public void onTrackCountFound(int i) {
        this.f50033r = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i);
        r6h r6hVar = this.f50016a.get(i);
        if (r6hVar == null) {
            String string = trackData.mediaFormat.getString("track-type-string");
            int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (trackTypeConstant == this.f50022g) {
                this.f50031p = i;
            }
            r6h r6hVarTrack = this.f50024i.track(i, trackTypeConstant);
            this.f50016a.set(i, r6hVarTrack);
            if (string != null) {
                return;
            } else {
                r6hVar = r6hVarTrack;
            }
        }
        kq6 exoPlayerFormat = toExoPlayerFormat(trackData);
        kq6 kq6Var = this.f50023h;
        r6hVar.format((kq6Var == null || i != this.f50031p) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(kq6Var));
        this.f50017b.set(i, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(ck5 ck5Var) {
        this.f50024i = ck5Var;
    }

    public void setMuxedCaptionFormats(List<kq6> list) {
        this.f50030o = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.f50032q = j;
    }

    public void setSelectedParserName(String str) {
        this.f50027l = getMimeType(str);
    }

    public void setTimestampAdjuster(g2h g2hVar) {
        this.f50029n = g2hVar;
    }

    public j9c(@hib kq6 kq6Var, int i, boolean z) {
        this.f50021f = z;
        this.f50023h = kq6Var;
        this.f50022g = i;
        this.f50016a = new ArrayList<>();
        this.f50017b = new ArrayList<>();
        this.f50018c = new ArrayList<>();
        this.f50019d = new ArrayList<>();
        this.f50020e = new C7818b();
        this.f50024i = new qs4();
        this.f50032q = -9223372036854775807L;
        this.f50030o = kx7.m15110of();
    }
}
