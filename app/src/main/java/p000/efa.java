package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaDataSource;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C1213a;
import androidx.media3.common.DrmInitData;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000.ejd;
import p000.gh3;
import p000.nt3;
import p000.q6h;
import p000.xh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class efa {

    /* JADX INFO: renamed from: A */
    public static final String f32807A = "MediaExtractorCompat";

    /* JADX INFO: renamed from: w */
    public static final int f32808w = 0;

    /* JADX INFO: renamed from: x */
    public static final int f32809x = 1;

    /* JADX INFO: renamed from: y */
    public static final int f32810y = 2;

    /* JADX INFO: renamed from: z */
    public static final long f32811z = 10000;

    /* JADX INFO: renamed from: a */
    public final ik5 f32812a;

    /* JADX INFO: renamed from: b */
    public final gh3.InterfaceC6313a f32813b;

    /* JADX INFO: renamed from: c */
    public final d5d f32814c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5892fn f32815d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<C5285d> f32816e;

    /* JADX INFO: renamed from: f */
    public final SparseArray<C5284c> f32817f;

    /* JADX INFO: renamed from: g */
    public final C5286e f32818g;

    /* JADX INFO: renamed from: h */
    public final oq6 f32819h;

    /* JADX INFO: renamed from: i */
    public final rl3 f32820i;

    /* JADX INFO: renamed from: j */
    public final rl3 f32821j;

    /* JADX INFO: renamed from: k */
    public final Set<Integer> f32822k;

    /* JADX INFO: renamed from: l */
    public boolean f32823l;

    /* JADX INFO: renamed from: m */
    public long f32824m;

    /* JADX INFO: renamed from: n */
    @hib
    public xj5 f32825n;

    /* JADX INFO: renamed from: o */
    @hib
    public ak5 f32826o;

    /* JADX INFO: renamed from: p */
    @hib
    public gh3 f32827p;

    /* JADX INFO: renamed from: q */
    @hib
    public lue f32828q;

    /* JADX INFO: renamed from: r */
    @hib
    public gue f32829r;

    /* JADX INFO: renamed from: s */
    public boolean f32830s;

    /* JADX INFO: renamed from: t */
    public int f32831t;

    /* JADX INFO: renamed from: u */
    @hib
    public Map<String, String> f32832u;

    /* JADX INFO: renamed from: v */
    @hib
    public LogSessionId f32833v;

    /* JADX INFO: renamed from: efa$b */
    public final class C5283b implements bk5 {
        private C5283b() {
        }

        @Override // p000.bk5
        public void endTracks() {
            efa.this.f32830s = true;
        }

        @Override // p000.bk5
        public void seekMap(gue gueVar) {
            efa.this.f32829r = gueVar;
        }

        @Override // p000.bk5
        public q6h track(int i, int i2) {
            C5284c c5284c = (C5284c) efa.this.f32817f.get(i);
            if (c5284c != null) {
                return c5284c;
            }
            if (efa.this.f32830s) {
                return new yd4();
            }
            efa efaVar = efa.this;
            C5284c c5284c2 = efaVar.new C5284c(efaVar.f32815d, i);
            efa.this.f32817f.put(i, c5284c2);
            return c5284c2;
        }
    }

    /* JADX INFO: renamed from: efa$c */
    public final class C5284c extends kle {

        /* JADX INFO: renamed from: M */
        public final int f32835M;

        /* JADX INFO: renamed from: N */
        public long f32836N;

        /* JADX INFO: renamed from: O */
        public int f32837O;

        /* JADX INFO: renamed from: P */
        public int f32838P;

        public C5284c(InterfaceC5892fn interfaceC5892fn, int i) {
            super(interfaceC5892fn, null, null);
            this.f32835M = i;
            this.f32836N = -9223372036854775807L;
            this.f32837O = -1;
            this.f32838P = -1;
        }

        private void queueSampleMetadata(long j, int i) {
            int i2 = ((1073741824 & i) != 0 ? 2 : 0) | ((i & 1) != 0 ? 1 : 0);
            if (this.f32838P != -1) {
                efa.this.f32818g.addLast(j, i2, this.f32838P);
            }
            efa.this.f32818g.addLast(j, i2, this.f32837O);
        }

        @Override // p000.q6h
        public void durationUs(long j) {
            this.f32836N = j;
            super.durationUs(j);
        }

        @Override // p000.kle
        public C1213a getAdjustedUpstreamFormat(C1213a c1213a) {
            if (getUpstreamFormat() == null) {
                efa.this.onSampleQueueFormatInitialized(this, c1213a);
            }
            return super.getAdjustedUpstreamFormat(c1213a);
        }

        @Override // p000.kle, p000.q6h
        public void sampleMetadata(long j, int i, int i2, int i3, @hib q6h.C11325a c11325a) {
            int i4 = i & (-536870913);
            v80.checkState(this.f32837O != -1);
            int writeIndex = getWriteIndex();
            super.sampleMetadata(j, i4, i2, i3, c11325a);
            if (getWriteIndex() == writeIndex + 1) {
                queueSampleMetadata(j, i4);
            }
        }

        public void setCompatibilityTrackIndex(int i) {
            this.f32838P = i;
        }

        public void setMainTrackIndex(int i) {
            this.f32837O = i;
        }

        public String toString() {
            return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Integer.valueOf(this.f32835M), Integer.valueOf(this.f32837O), Integer.valueOf(this.f32838P));
        }
    }

    /* JADX INFO: renamed from: efa$d */
    public static final class C5285d {

        /* JADX INFO: renamed from: a */
        public final C5284c f32840a;

        /* JADX INFO: renamed from: b */
        public final boolean f32841b;

        /* JADX INFO: renamed from: c */
        @hib
        public final String f32842c;

        /* JADX INFO: Access modifiers changed from: private */
        public C1213a getFormat(oq6 oq6Var, rl3 rl3Var) {
            oq6Var.clear();
            this.f32840a.read(oq6Var, rl3Var, 2, false);
            C1213a c1213a = (C1213a) v80.checkNotNull(oq6Var.f68294b);
            oq6Var.clear();
            return c1213a;
        }

        public MediaFormat createDownstreamMediaFormat(oq6 oq6Var, rl3 rl3Var) {
            C1213a format = getFormat(oq6Var, rl3Var);
            MediaFormat mediaFormatCreateMediaFormatFromFormat = jfa.createMediaFormatFromFormat(format);
            if (this.f32842c != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaFormatCreateMediaFormatFromFormat.removeKey("codecs-string");
                }
                mediaFormatCreateMediaFormatFromFormat.setString("mime", this.f32842c);
            }
            Pair<Integer, Integer> codecProfileAndLevel = d72.getCodecProfileAndLevel(format);
            if (codecProfileAndLevel != null) {
                mediaFormatCreateMediaFormatFromFormat.setInteger(Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
                mediaFormatCreateMediaFormatFromFormat.setInteger(FirebaseAnalytics.C3552d.f23228t, ((Integer) codecProfileAndLevel.second).intValue());
            }
            return mediaFormatCreateMediaFormatFromFormat;
        }

        public void discardFrontSample() {
            this.f32840a.skip(1);
            this.f32840a.discardToRead();
        }

        public int getIdOfBackingTrack() {
            return this.f32840a.f32835M;
        }

        public String toString() {
            return String.format("MediaExtractorSampleQueue: %s, isCompatibilityTrack: %s, compatibilityTrackMimeType: %s", this.f32840a, Boolean.valueOf(this.f32841b), this.f32842c);
        }

        private C5285d(C5284c c5284c, boolean z, @hib String str) {
            this.f32840a = c5284c;
            this.f32841b = z;
            this.f32842c = str;
        }
    }

    /* JADX INFO: renamed from: efa$e */
    public static final class C5286e {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque<a> f32843a = new ArrayDeque<>();

        /* JADX INFO: renamed from: b */
        public final ArrayDeque<a> f32844b = new ArrayDeque<>();

        /* JADX INFO: renamed from: efa$e$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public int f32845a;

            /* JADX INFO: renamed from: b */
            public long f32846b;

            /* JADX INFO: renamed from: c */
            public int f32847c;

            public a(long j, int i, int i2) {
                set(j, i, i2);
            }

            public void set(long j, int i, int i2) {
                this.f32846b = j;
                this.f32845a = i;
                this.f32847c = i2;
            }
        }

        private a obtainSampleMetadata(long j, int i, int i2) {
            a aVar = this.f32843a.isEmpty() ? new a(j, i, i2) : this.f32843a.pop();
            aVar.set(j, i, i2);
            return aVar;
        }

        public void addLast(long j, int i, int i2) {
            this.f32844b.addLast(obtainSampleMetadata(j, i, i2));
        }

        public void clear() {
            Iterator<a> it = this.f32844b.iterator();
            while (it.hasNext()) {
                this.f32843a.push(it.next());
            }
            this.f32844b.clear();
        }

        public boolean isEmpty() {
            return this.f32844b.isEmpty();
        }

        @hib
        public a peekFirst() {
            return this.f32844b.peekFirst();
        }

        public a removeFirst() {
            a aVarRemoveFirst = this.f32844b.removeFirst();
            this.f32843a.push(aVarRemoveFirst);
            return aVarRemoveFirst;
        }
    }

    /* JADX INFO: renamed from: efa$f */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5287f {
    }

    public efa(Context context) {
        this(new cv3(), new nt3.C10051a(context));
    }

    @a35(expression = {"sampleMetadataQueue.peekFirst()"}, result = true)
    private boolean advanceToSampleOrEndOfInput() {
        int i;
        try {
            maybeResolvePendingSeek();
            boolean z = false;
            while (true) {
                if (this.f32818g.isEmpty()) {
                    if (z) {
                        return false;
                    }
                    try {
                        i = ((xj5) v80.checkNotNull(this.f32825n)).read((ak5) v80.checkNotNull(this.f32826o), this.f32814c);
                    } catch (Exception | OutOfMemoryError e) {
                        xh9.m25149w(f32807A, "Treating exception as the end of input.", e);
                    }
                    if (i == -1) {
                        z = true;
                    } else if (i == 1) {
                        this.f32826o = reopenCurrentDataSource(this.f32814c.f28476a);
                    }
                } else {
                    if (this.f32822k.contains(Integer.valueOf(((C5286e.a) v80.checkNotNull(this.f32818g.peekFirst())).f32847c))) {
                        return true;
                    }
                    skipOneSample();
                }
            }
        } catch (IOException e2) {
            xh9.m25149w(f32807A, "Treating exception as the end of input.", e2);
            return false;
        }
    }

    private xh3 buildDataSpec(Uri uri, long j) {
        xh3.C15067b flags = new xh3.C15067b().setUri(uri).setPosition(j).setFlags(6);
        Map<String, String> map = this.f32832u;
        if (map != null) {
            flags.setHttpRequestHeaders(map);
        }
        return flags.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$selectExtractor$0(xj5 xj5Var) {
        return xj5Var.getUnderlyingImplementation().getClass().getSimpleName();
    }

    private void maybeResolvePendingSeek() throws IOException {
        lue lueVar = this.f32828q;
        if (lueVar == null) {
            return;
        }
        lue lueVar2 = (lue) v80.checkNotNull(lueVar);
        ((xj5) v80.checkNotNull(this.f32825n)).seek(lueVar2.f58834b, lueVar2.f58833a);
        this.f32826o = reopenCurrentDataSource(lueVar2.f58834b);
        this.f32828q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSampleQueueFormatInitialized(C5284c c5284c, C1213a c1213a) {
        boolean z = true;
        this.f32831t++;
        c5284c.setMainTrackIndex(this.f32816e.size());
        byte b = 0;
        this.f32816e.add(new C5285d(c5284c, false, null));
        String alternativeCodecMimeType = nea.getAlternativeCodecMimeType(c1213a);
        if (alternativeCodecMimeType != null) {
            c5284c.setCompatibilityTrackIndex(this.f32816e.size());
            this.f32816e.add(new C5285d(c5284c, z, alternativeCodecMimeType));
        }
    }

    private void peekNextSelectedTrackSample(rl3 rl3Var) {
        C5284c c5284c = this.f32816e.get(((C5286e.a) v80.checkNotNull(this.f32818g.peekFirst())).f32847c).f32840a;
        int i = c5284c.read(this.f32819h, rl3Var, 1, false);
        if (i == -5) {
            i = c5284c.read(this.f32819h, rl3Var, 1, false);
        }
        this.f32819h.clear();
        v80.checkState(i == -4);
    }

    private void populatePlatformCryptoInfoParameters(MediaCodec.CryptoInfo cryptoInfo) {
        MediaCodec.CryptoInfo frameworkCryptoInfo = ((f93) v80.checkNotNull(this.f32821j.f78607c)).getFrameworkCryptoInfo();
        cryptoInfo.numSubSamples = frameworkCryptoInfo.numSubSamples;
        cryptoInfo.numBytesOfClearData = frameworkCryptoInfo.numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = frameworkCryptoInfo.numBytesOfEncryptedData;
        cryptoInfo.key = frameworkCryptoInfo.key;
        cryptoInfo.iv = frameworkCryptoInfo.iv;
        cryptoInfo.mode = frameworkCryptoInfo.mode;
    }

    private void prepareDataSource(gh3 gh3Var, xh3 xh3Var) throws IOException {
        int i;
        v80.checkState(!this.f32823l);
        this.f32823l = true;
        this.f32824m = xh3Var.f97806g;
        this.f32827p = gh3Var;
        ak5 xu3Var = new xu3(this.f32827p, 0L, gh3Var.open(xh3Var));
        xj5 xj5VarSelectExtractor = selectExtractor(xu3Var);
        Throwable e = null;
        xj5VarSelectExtractor.init(new C5283b());
        boolean z = true;
        while (z) {
            try {
                i = xj5VarSelectExtractor.read(xu3Var, this.f32814c);
            } catch (Exception | OutOfMemoryError e2) {
                e = e2;
                i = -1;
            }
            boolean z2 = !this.f32830s || this.f32831t < this.f32817f.size() || this.f32829r == null;
            if (e != null || (z2 && i == -1)) {
                release();
                throw yhc.createForMalformedContainer(e != null ? "Exception encountered while parsing input media." : "Reached end of input before preparation completed.", e);
            }
            if (i == 1) {
                xu3Var = reopenCurrentDataSource(this.f32814c.f28476a);
            }
            z = z2;
        }
        this.f32826o = xu3Var;
        this.f32825n = xj5VarSelectExtractor;
    }

    private ak5 reopenCurrentDataSource(long j) throws IOException {
        gh3 gh3Var = (gh3) v80.checkNotNull(this.f32827p);
        Uri uri = (Uri) v80.checkNotNull(gh3Var.getUri());
        wh3.closeQuietly(gh3Var);
        long jOpen = gh3Var.open(buildDataSpec(uri, this.f32824m + j));
        if (jOpen != -1) {
            jOpen += j;
        }
        return new xu3(gh3Var, j, jOpen);
    }

    private xj5 selectExtractor(ak5 ak5Var) throws IOException {
        xj5 xj5Var;
        xj5[] xj5VarArrCreateExtractors = this.f32812a.createExtractors();
        int length = xj5VarArrCreateExtractors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                xj5Var = null;
                break;
            }
            xj5Var = xj5VarArrCreateExtractors[i];
            try {
                if (xj5Var.sniff(ak5Var)) {
                    ak5Var.resetPeekPosition();
                    break;
                }
            } catch (EOFException unused) {
            } catch (Throwable th) {
                ak5Var.resetPeekPosition();
                throw th;
            }
            ak5Var.resetPeekPosition();
            i++;
        }
        if (xj5Var != null) {
            return xj5Var;
        }
        throw new zuh("None of the available extractors (" + xj8.m25235on(", ").join(eb9.transform(kx7.copyOf(xj5VarArrCreateExtractors), new lz6() { // from class: dfa
            @Override // p000.lz6
            public final Object apply(Object obj) {
                return efa.lambda$selectExtractor$0((xj5) obj);
            }
        })) + ") could read the stream.", (Uri) v80.checkNotNull(((gh3) v80.checkNotNull(this.f32827p)).getUri()), kx7.m15110of());
    }

    private void skipOneSample() {
        C5285d c5285d = this.f32816e.get(this.f32818g.removeFirst().f32847c);
        if (c5285d.f32841b) {
            return;
        }
        c5285d.discardFrontSample();
    }

    public boolean advance() {
        if (!advanceToSampleOrEndOfInput()) {
            return false;
        }
        skipOneSample();
        return advanceToSampleOrEndOfInput();
    }

    @fdi(otherwise = 5)
    public InterfaceC5892fn getAllocator() {
        return this.f32815d;
    }

    public long getCachedDuration() {
        if (!advanceToSampleOrEndOfInput()) {
            return 0L;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MIN_VALUE;
        for (int i = 0; i < this.f32816e.size(); i++) {
            C5284c c5284c = this.f32816e.get(i).f32840a;
            jMax2 = Math.max(jMax2, c5284c.getLargestReadTimestampUs());
            jMax = Math.max(jMax, c5284c.getLargestQueuedTimestampUs());
        }
        v80.checkState(jMax != Long.MIN_VALUE);
        if (jMax2 == jMax) {
            return 0L;
        }
        return (jMax - (jMax2 != Long.MIN_VALUE ? jMax2 : 0L)) + 10000;
    }

    @hib
    public DrmInitData getDrmInitData() {
        for (int i = 0; i < this.f32816e.size(); i++) {
            DrmInitData drmInitData = this.f32816e.get(i).getFormat(this.f32819h, this.f32820i).f8295s;
            if (drmInitData != null) {
                return drmInitData;
            }
        }
        return null;
    }

    @c5e(31)
    public LogSessionId getLogSessionId() {
        LogSessionId logSessionId = this.f32833v;
        return logSessionId != null ? logSessionId : LogSessionId.LOG_SESSION_ID_NONE;
    }

    @c5e(26)
    public PersistableBundle getMetrics() {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        xj5 xj5Var = this.f32825n;
        if (xj5Var != null) {
            persistableBundle.putString("android.media.mediaextractor.fmt", xj5Var.getUnderlyingImplementation().getClass().getSimpleName());
        }
        if (!this.f32816e.isEmpty() && (str = this.f32816e.get(0).getFormat(this.f32819h, this.f32820i).f8290n) != null) {
            persistableBundle.putString("android.media.mediaextractor.mime", str);
        }
        persistableBundle.putInt("android.media.mediaextractor.ntrk", this.f32816e.size());
        return persistableBundle;
    }

    @hib
    public Map<UUID, byte[]> getPsshInfo() {
        ejd.C5345a psshAtom;
        DrmInitData drmInitData = getDrmInitData();
        if (drmInitData == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < drmInitData.f8206d; i++) {
            byte[] bArr = drmInitData.get(i).f8211e;
            if (bArr != null && (psshAtom = ejd.parsePsshAtom(bArr)) != null) {
                map.put(psshAtom.f33208a, psshAtom.f33210c);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public boolean getSampleCryptoInfo(MediaCodec.CryptoInfo cryptoInfo) {
        if (!advanceToSampleOrEndOfInput() || (this.f32818g.peekFirst().f32845a & 2) == 0) {
            return false;
        }
        peekNextSelectedTrackSample(this.f32821j);
        populatePlatformCryptoInfoParameters(cryptoInfo);
        return true;
    }

    public int getSampleFlags() {
        if (advanceToSampleOrEndOfInput()) {
            return this.f32818g.peekFirst().f32845a;
        }
        return -1;
    }

    public long getSampleSize() {
        if (!advanceToSampleOrEndOfInput()) {
            return -1L;
        }
        peekNextSelectedTrackSample(this.f32821j);
        ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(this.f32821j.f78608d);
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    public long getSampleTime() {
        if (advanceToSampleOrEndOfInput()) {
            return this.f32818g.peekFirst().f32846b;
        }
        return -1L;
    }

    public int getSampleTrackIndex() {
        if (advanceToSampleOrEndOfInput()) {
            return this.f32818g.peekFirst().f32847c;
        }
        return -1;
    }

    public int getTrackCount() {
        return this.f32816e.size();
    }

    public MediaFormat getTrackFormat(int i) {
        C5285d c5285d = this.f32816e.get(i);
        MediaFormat mediaFormatCreateDownstreamMediaFormat = c5285d.createDownstreamMediaFormat(this.f32819h, this.f32820i);
        long j = c5285d.f32840a.f32836N;
        if (j != -9223372036854775807L) {
            mediaFormatCreateDownstreamMediaFormat.setLong("durationUs", j);
        } else {
            gue gueVar = this.f32829r;
            if (gueVar != null && gueVar.getDurationUs() != -9223372036854775807L) {
                mediaFormatCreateDownstreamMediaFormat.setLong("durationUs", this.f32829r.getDurationUs());
            }
        }
        return mediaFormatCreateDownstreamMediaFormat;
    }

    public boolean hasCacheReachedEndOfStream() {
        return getCachedDuration() == 0;
    }

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        if (!advanceToSampleOrEndOfInput()) {
            return -1;
        }
        byteBuffer.position(i);
        byteBuffer.limit(byteBuffer.capacity());
        rl3 rl3Var = this.f32820i;
        rl3Var.f78608d = byteBuffer;
        peekNextSelectedTrackSample(rl3Var);
        byteBuffer.flip();
        byteBuffer.position(i);
        this.f32820i.f78608d = null;
        return byteBuffer.remaining();
    }

    public void release() {
        for (int i = 0; i < this.f32817f.size(); i++) {
            this.f32817f.valueAt(i).release();
        }
        this.f32817f.clear();
        xj5 xj5Var = this.f32825n;
        if (xj5Var != null) {
            xj5Var.release();
            this.f32825n = null;
        }
        this.f32826o = null;
        this.f32828q = null;
        wh3.closeQuietly(this.f32827p);
        this.f32827p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void seekTo(long r6, int r8) {
        /*
            r5 = this;
            gue r0 = r5.f32829r
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Set<java.lang.Integer> r0 = r5.f32822k
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L37
            xj5 r0 = r5.f32825n
            boolean r2 = r0 instanceof p000.e1b
            if (r2 == 0) goto L37
            e1b r0 = (p000.e1b) r0
            java.util.ArrayList<efa$d> r2 = r5.f32816e
            java.util.Set<java.lang.Integer> r3 = r5.f32822k
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.get(r3)
            efa$d r2 = (p000.efa.C5285d) r2
            int r2 = r2.getIdOfBackingTrack()
            gue$a r0 = r0.getSeekPoints(r6, r2)
            goto L3d
        L37:
            gue r0 = r5.f32829r
            gue$a r0 = r0.getSeekPoints(r6)
        L3d:
            if (r8 == 0) goto L6a
            if (r8 == r1) goto L67
            r1 = 2
            if (r8 != r1) goto L61
            lue r8 = r0.f41219b
            long r1 = r8.f58833a
            long r1 = r6 - r1
            long r1 = java.lang.Math.abs(r1)
            lue r8 = r0.f41218a
            long r3 = r8.f58833a
            long r6 = r6 - r3
            long r6 = java.lang.Math.abs(r6)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5e
            lue r6 = r0.f41219b
            goto L6c
        L5e:
            lue r6 = r0.f41218a
            goto L6c
        L61:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L67:
            lue r6 = r0.f41219b
            goto L6c
        L6a:
            lue r6 = r0.f41218a
        L6c:
            efa$e r7 = r5.f32818g
            r7.clear()
            r7 = 0
        L72:
            android.util.SparseArray<efa$c> r8 = r5.f32817f
            int r8 = r8.size()
            if (r7 >= r8) goto L88
            android.util.SparseArray<efa$c> r8 = r5.f32817f
            java.lang.Object r8 = r8.valueAt(r7)
            efa$c r8 = (p000.efa.C5284c) r8
            r8.reset()
            int r7 = r7 + 1
            goto L72
        L88:
            r5.f32828q = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.efa.seekTo(long, int):void");
    }

    public void selectTrack(int i) {
        this.f32822k.add(Integer.valueOf(i));
    }

    public void setDataSource(Uri uri, long j) throws IOException {
        prepareDataSource(this.f32813b.createDataSource(), buildDataSpec(uri, j));
    }

    @c5e(31)
    public void setLogSessionId(LogSessionId logSessionId) {
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.f32833v = logSessionId;
    }

    public void unselectTrack(int i) {
        this.f32822k.remove(Integer.valueOf(i));
    }

    public efa(ik5 ik5Var, gh3.InterfaceC6313a interfaceC6313a) {
        this.f32812a = ik5Var;
        this.f32813b = interfaceC6313a;
        this.f32814c = new d5d();
        this.f32815d = new nm3(true, 65536);
        this.f32816e = new ArrayList<>();
        this.f32817f = new SparseArray<>();
        this.f32818g = new C5286e();
        this.f32819h = new oq6();
        this.f32820i = rl3.newNoDataInstance();
        this.f32821j = new rl3(2);
        this.f32822k = new HashSet();
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor.getDeclaredLength() == -1) {
            setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IOException {
        setDataSource(fileDescriptor, 0L, -1L);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        prepareDataSource(new rs5(fileDescriptor, j, j2), buildDataSpec(Uri.EMPTY, 0L));
    }

    public void setDataSource(Context context, Uri uri, @hib Map<String, String> map) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        if (t0i.isLocalFileUri(uri)) {
            setDataSource((String) v80.checkNotNull(uri.getPath()));
            return;
        }
        try {
            assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        } catch (FileNotFoundException | SecurityException unused) {
        }
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            try {
                setDataSource(assetFileDescriptorOpenAssetFileDescriptor);
                assetFileDescriptorOpenAssetFileDescriptor.close();
                return;
            } catch (Throwable th) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            assetFileDescriptorOpenAssetFileDescriptor.close();
        }
        setDataSource(uri.toString(), map);
    }

    public void setDataSource(String str) throws IOException {
        setDataSource(str, (Map<String, String>) null);
    }

    public void setDataSource(String str, @hib Map<String, String> map) throws IOException {
        this.f32832u = map;
        prepareDataSource(this.f32813b.createDataSource(), buildDataSpec(Uri.parse(str), 0L));
    }

    @c5e(23)
    public void setDataSource(MediaDataSource mediaDataSource) throws IOException {
        prepareDataSource(new xea(mediaDataSource, false), buildDataSpec(Uri.EMPTY, 0L));
    }
}
