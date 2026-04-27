package p000;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import androidx.media3.exoplayer.InterfaceC1255s;
import p000.bh0;
import p000.kl3;
import p000.ps3;
import p000.rg0;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class ll3<T extends kl3<rl3, ? extends kif, ? extends ql3>> extends AbstractC1224c implements cda {

    /* JADX INFO: renamed from: A2 */
    public static final String f58072A2 = "DecoderAudioRenderer";

    /* JADX INFO: renamed from: B2 */
    public static final int f58073B2 = 0;

    /* JADX INFO: renamed from: C2 */
    public static final int f58074C2 = 1;

    /* JADX INFO: renamed from: D2 */
    public static final int f58075D2 = 2;

    /* JADX INFO: renamed from: E2 */
    public static final int f58076E2 = 10;

    /* JADX INFO: renamed from: V1 */
    public final rg0.C12068a f58077V1;

    /* JADX INFO: renamed from: Z1 */
    public final bh0 f58078Z1;

    /* JADX INFO: renamed from: a2 */
    public final rl3 f58079a2;

    /* JADX INFO: renamed from: b2 */
    public ol3 f58080b2;

    /* JADX INFO: renamed from: c2 */
    public C1213a f58081c2;

    /* JADX INFO: renamed from: d2 */
    public int f58082d2;

    /* JADX INFO: renamed from: e2 */
    public int f58083e2;

    /* JADX INFO: renamed from: f2 */
    public boolean f58084f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public T f58085g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public rl3 f58086h2;

    /* JADX INFO: renamed from: i2 */
    @hib
    public kif f58087i2;

    /* JADX INFO: renamed from: j2 */
    @hib
    public ar4 f58088j2;

    /* JADX INFO: renamed from: k2 */
    @hib
    public ar4 f58089k2;

    /* JADX INFO: renamed from: l2 */
    public int f58090l2;

    /* JADX INFO: renamed from: m2 */
    public boolean f58091m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f58092n2;

    /* JADX INFO: renamed from: o2 */
    public long f58093o2;

    /* JADX INFO: renamed from: p2 */
    public boolean f58094p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f58095q2;

    /* JADX INFO: renamed from: r2 */
    public boolean f58096r2;

    /* JADX INFO: renamed from: s2 */
    public long f58097s2;

    /* JADX INFO: renamed from: t2 */
    public final long[] f58098t2;

    /* JADX INFO: renamed from: u2 */
    public int f58099u2;

    /* JADX INFO: renamed from: v2 */
    public boolean f58100v2;

    /* JADX INFO: renamed from: w2 */
    public boolean f58101w2;

    /* JADX INFO: renamed from: x2 */
    public long f58102x2;

    /* JADX INFO: renamed from: y2 */
    public long f58103y2;

    /* JADX INFO: renamed from: z2 */
    public long f58104z2;

    /* JADX INFO: renamed from: ll3$b */
    @c5e(23)
    public static final class C8881b {
        private C8881b() {
        }

        public static void setAudioSinkPreferredDevice(bh0 bh0Var, @hib Object obj) {
            bh0Var.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: ll3$c */
    public final class C8882c implements bh0.InterfaceC1890d {
        private C8882c() {
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioCapabilitiesChanged() {
            ll3.this.m1765s();
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioSessionIdChanged(int i) {
            ll3.this.f58077V1.audioSessionIdChanged(i);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioSinkError(Exception exc) {
            xh9.m25145e("DecoderAudioRenderer", "Audio sink error", exc);
            ll3.this.f58077V1.audioSinkError(exc);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioTrackInitialized(bh0.C1887a c1887a) {
            ll3.this.f58077V1.audioTrackInitialized(c1887a);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onAudioTrackReleased(bh0.C1887a c1887a) {
            ll3.this.f58077V1.audioTrackReleased(c1887a);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onPositionAdvancing(long j) {
            ll3.this.f58077V1.positionAdvancing(j);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onPositionDiscontinuity() {
            ll3.this.m16219I();
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onSilenceSkipped() {
            ll3.this.f58100v2 = true;
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onSkipSilenceEnabledChanged(boolean z) {
            ll3.this.f58077V1.skipSilenceEnabledChanged(z);
        }

        @Override // p000.bh0.InterfaceC1890d
        public void onUnderrun(int i, long j, long j2) {
            ll3.this.f58077V1.underrun(i, j, j2);
        }
    }

    public ll3() {
        this((Handler) null, (rg0) null, new hf0[0]);
    }

    private boolean drainOutputBuffer() throws aa5, ql3, bh0.C1894h, bh0.C1888b, bh0.C1889c {
        if (this.f58087i2 == null) {
            kif kifVar = (kif) this.f58085g2.dequeueOutputBuffer();
            this.f58087i2 = kifVar;
            if (kifVar == null) {
                return false;
            }
            int i = kifVar.f85178c;
            if (i > 0) {
                this.f58080b2.f68021f += i;
                this.f58078Z1.handleDiscontinuity();
            }
            if (this.f58087i2.isFirstSample()) {
                processFirstSampleOfStream();
            }
        }
        if (this.f58087i2.isEndOfStream()) {
            if (this.f58090l2 == 2) {
                releaseDecoder();
                maybeInitDecoder();
                this.f58092n2 = true;
            } else {
                this.f58087i2.release();
                this.f58087i2 = null;
                try {
                    processEndOfStream();
                } catch (bh0.C1894h e) {
                    throw m1748b(e, e.f13730c, e.f13729b, 5002);
                }
            }
            return false;
        }
        this.f58104z2 = -9223372036854775807L;
        if (this.f58092n2) {
            this.f58078Z1.configure(m16217G(this.f58085g2).buildUpon().setEncoderDelay(this.f58082d2).setEncoderPadding(this.f58083e2).setMetadata(this.f58081c2.f8288l).setCustomData(this.f58081c2.f8289m).setId(this.f58081c2.f8277a).setLabel(this.f58081c2.f8278b).setLabels(this.f58081c2.f8279c).setLanguage(this.f58081c2.f8280d).setSelectionFlags(this.f58081c2.f8281e).setRoleFlags(this.f58081c2.f8282f).build(), 0, m16216F(this.f58085g2));
            this.f58092n2 = false;
        }
        bh0 bh0Var = this.f58078Z1;
        kif kifVar2 = this.f58087i2;
        if (!bh0Var.handleBuffer(kifVar2.f54233f, kifVar2.f85177b, 1)) {
            this.f58104z2 = this.f58087i2.f85177b;
            return false;
        }
        this.f58080b2.f68020e++;
        this.f58087i2.release();
        this.f58087i2 = null;
        return true;
    }

    private boolean feedInputBuffer() throws aa5, ql3 {
        T t = this.f58085g2;
        if (t == null || this.f58090l2 == 2 || this.f58095q2) {
            return false;
        }
        if (this.f58086h2 == null) {
            rl3 rl3Var = (rl3) t.dequeueInputBuffer();
            this.f58086h2 = rl3Var;
            if (rl3Var == null) {
                return false;
            }
        }
        if (this.f58090l2 == 1) {
            this.f58086h2.setFlags(4);
            this.f58085g2.queueInputBuffer(this.f58086h2);
            this.f58086h2 = null;
            this.f58090l2 = 2;
            return false;
        }
        oq6 oq6VarM1751e = m1751e();
        int iM1771y = m1771y(oq6VarM1751e, this.f58086h2, 0);
        if (iM1771y == -5) {
            onInputFormatChanged(oq6VarM1751e);
            return true;
        }
        if (iM1771y != -4) {
            if (iM1771y != -3) {
                throw new IllegalStateException();
            }
            if (hasReadStreamToEnd()) {
                this.f58103y2 = this.f58102x2;
            }
            return false;
        }
        if (this.f58086h2.isEndOfStream()) {
            this.f58095q2 = true;
            this.f58103y2 = this.f58102x2;
            this.f58085g2.queueInputBuffer(this.f58086h2);
            this.f58086h2 = null;
            return false;
        }
        if (!this.f58084f2) {
            this.f58084f2 = true;
            this.f58086h2.addFlag(134217728);
        }
        this.f58102x2 = this.f58086h2.f78610f;
        if (hasReadStreamToEnd() || this.f58086h2.isLastSample()) {
            this.f58103y2 = this.f58102x2;
        }
        this.f58086h2.flip();
        rl3 rl3Var2 = this.f58086h2;
        rl3Var2.f78606b = this.f58081c2;
        this.f58085g2.queueInputBuffer(rl3Var2);
        this.f58091m2 = true;
        this.f58080b2.f68018c++;
        this.f58086h2 = null;
        return true;
    }

    private void flushDecoder() throws aa5 {
        if (this.f58090l2 != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.f58086h2 = null;
        kif kifVar = this.f58087i2;
        if (kifVar != null) {
            kifVar.release();
            this.f58087i2 = null;
        }
        kl3 kl3Var = (kl3) v80.checkNotNull(this.f58085g2);
        kl3Var.flush();
        kl3Var.setOutputStartTimeUs(m1753g());
        this.f58091m2 = false;
    }

    private void maybeInitDecoder() throws aa5 {
        c93 cryptoConfig;
        if (this.f58085g2 != null) {
            return;
        }
        setDecoderDrmSession(this.f58089k2);
        ar4 ar4Var = this.f58088j2;
        if (ar4Var != null) {
            cryptoConfig = ar4Var.getCryptoConfig();
            if (cryptoConfig == null && this.f58088j2.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            x5h.beginSection("createAudioDecoder");
            T t = (T) m16215E(this.f58081c2, cryptoConfig);
            this.f58085g2 = t;
            t.setOutputStartTimeUs(m1753g());
            x5h.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f58077V1.decoderInitialized(this.f58085g2.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f58080b2.f68016a++;
        } catch (OutOfMemoryError e) {
            throw m1747a(e, this.f58081c2, 4001);
        } catch (ql3 e2) {
            xh9.m25145e("DecoderAudioRenderer", "Audio codec error", e2);
            this.f58077V1.audioCodecError(e2);
            throw m1747a(e2, this.f58081c2, 4001);
        }
    }

    private void onInputFormatChanged(oq6 oq6Var) throws aa5 {
        C1213a c1213a = (C1213a) v80.checkNotNull(oq6Var.f68294b);
        setSourceDrmSession(oq6Var.f68293a);
        C1213a c1213a2 = this.f58081c2;
        this.f58081c2 = c1213a;
        this.f58082d2 = c1213a.f8269J;
        this.f58083e2 = c1213a.f8270K;
        T t = this.f58085g2;
        if (t == null) {
            maybeInitDecoder();
            this.f58077V1.inputFormatChanged(this.f58081c2, null);
            return;
        }
        vl3 vl3Var = this.f58089k2 != this.f58088j2 ? new vl3(t.getName(), c1213a2, c1213a, 0, 128) : m16214D(t.getName(), c1213a2, c1213a);
        if (vl3Var.f91580d == 0) {
            if (this.f58091m2) {
                this.f58090l2 = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
                this.f58092n2 = true;
            }
        }
        this.f58077V1.inputFormatChanged(this.f58081c2, vl3Var);
    }

    private void processEndOfStream() throws bh0.C1894h {
        this.f58096r2 = true;
        this.f58078Z1.playToEndOfStream();
        this.f58104z2 = this.f58103y2;
    }

    private void processFirstSampleOfStream() {
        this.f58078Z1.handleDiscontinuity();
        if (this.f58099u2 != 0) {
            setOutputStreamOffsetUs(this.f58098t2[0]);
            int i = this.f58099u2 - 1;
            this.f58099u2 = i;
            long[] jArr = this.f58098t2;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    private void releaseDecoder() {
        this.f58086h2 = null;
        this.f58087i2 = null;
        this.f58090l2 = 0;
        this.f58091m2 = false;
        this.f58102x2 = -9223372036854775807L;
        this.f58103y2 = -9223372036854775807L;
        T t = this.f58085g2;
        if (t != null) {
            this.f58080b2.f68017b++;
            t.release();
            this.f58077V1.decoderReleased(this.f58085g2.getName());
            this.f58085g2 = null;
        }
        setDecoderDrmSession(null);
    }

    private void setDecoderDrmSession(@hib ar4 ar4Var) {
        ar4.replaceSession(this.f58088j2, ar4Var);
        this.f58088j2 = ar4Var;
    }

    private void setOutputStreamOffsetUs(long j) {
        this.f58097s2 = j;
        if (j != -9223372036854775807L) {
            this.f58078Z1.setOutputStreamOffsetUs(j);
        }
    }

    private void setSourceDrmSession(@hib ar4 ar4Var) {
        ar4.replaceSession(this.f58089k2, ar4Var);
        this.f58089k2 = ar4Var;
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.f58078Z1.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.f58094p2) {
                currentPositionUs = Math.max(this.f58093o2, currentPositionUs);
            }
            this.f58093o2 = currentPositionUs;
            this.f58094p2 = false;
        }
    }

    @vp6
    /* JADX INFO: renamed from: D */
    public vl3 m16214D(String str, C1213a c1213a, C1213a c1213a2) {
        return new vl3(str, c1213a, c1213a2, 0, 1);
    }

    @vp6
    /* JADX INFO: renamed from: E */
    public abstract T m16215E(C1213a c1213a, @hib c93 c93Var) throws ql3;

    @hib
    @vp6
    /* JADX INFO: renamed from: F */
    public int[] m16216F(T t) {
        return null;
    }

    @vp6
    /* JADX INFO: renamed from: G */
    public abstract C1213a m16217G(T t);

    /* JADX INFO: renamed from: H */
    public final int m16218H(C1213a c1213a) {
        return this.f58078Z1.getFormatSupport(c1213a);
    }

    @vp6
    @un1
    /* JADX INFO: renamed from: I */
    public void m16219I() {
        this.f58094p2 = true;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m16220J(C1213a c1213a) {
        return this.f58078Z1.supportsFormat(c1213a);
    }

    @vp6
    /* JADX INFO: renamed from: K */
    public abstract int m16221K(C1213a c1213a);

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public long getDurationToProgressUs(long j, long j2) {
        boolean z = this.f58104z2 != -9223372036854775807L;
        if (!this.f58101w2) {
            return (z || this.f58096r2) ? 1000000L : 10000L;
        }
        long audioTrackBufferSizeUs = this.f58078Z1.getAudioTrackBufferSizeUs();
        if (!z || audioTrackBufferSizeUs == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(audioTrackBufferSizeUs, this.f58104z2 - j) / (getPlaybackParameters() != null ? getPlaybackParameters().f80107a : 1.0f)) / 2.0f)) - (t0i.msToUs(m1749c().elapsedRealtime()) - j2));
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.InterfaceC1254q
    @hib
    public cda getMediaClock() {
        return this;
    }

    @Override // p000.cda
    public ryc getPlaybackParameters() {
        return this.f58078Z1.getPlaybackParameters();
    }

    @Override // p000.cda
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.f58093o2;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i == 2) {
            this.f58078Z1.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.f58078Z1.setAudioAttributes((uc0) obj);
            return;
        }
        if (i == 6) {
            this.f58078Z1.setAuxEffectInfo((pm0) obj);
        } else {
            if (i == 12) {
                C8881b.setAudioSinkPreferredDevice(this.f58078Z1, obj);
                return;
            }
            if (i == 9) {
                this.f58078Z1.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
            } else if (i != 10) {
                super.handleMessage(i, obj);
            } else {
                this.f58078Z1.setAudioSessionId(((Integer) obj).intValue());
            }
        }
    }

    @Override // p000.cda
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.f58100v2;
        this.f58100v2 = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f58096r2 && this.f58078Z1.isEnded();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return this.f58078Z1.hasPendingData() || (this.f58081c2 != null && (m1759m() || this.f58087i2 != null));
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f58081c2 = null;
        this.f58092n2 = true;
        setOutputStreamOffsetUs(-9223372036854775807L);
        this.f58100v2 = false;
        this.f58104z2 = -9223372036854775807L;
        try {
            setSourceDrmSession(null);
            releaseDecoder();
            this.f58078Z1.reset();
        } finally {
            this.f58077V1.disabled(this.f58080b2);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: o */
    public void mo1761o(boolean z, boolean z2) throws aa5 {
        ol3 ol3Var = new ol3();
        this.f58080b2 = ol3Var;
        this.f58077V1.enabled(ol3Var);
        if (m1750d().f80390b) {
            this.f58078Z1.enableTunnelingV21();
        } else {
            this.f58078Z1.disableTunneling();
        }
        this.f58078Z1.setPlayerId(m1755i());
        this.f58078Z1.setClock(m1749c());
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) throws aa5 {
        this.f58078Z1.flush();
        this.f58093o2 = j;
        this.f58104z2 = -9223372036854775807L;
        this.f58100v2 = false;
        this.f58094p2 = true;
        this.f58095q2 = false;
        this.f58096r2 = false;
        if (this.f58085g2 != null) {
            flushDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) throws aa5 {
        if (this.f58096r2) {
            try {
                this.f58078Z1.playToEndOfStream();
                this.f58104z2 = this.f58103y2;
                return;
            } catch (bh0.C1894h e) {
                throw m1748b(e, e.f13730c, e.f13729b, 5002);
            }
        }
        if (this.f58081c2 == null) {
            oq6 oq6VarM1751e = m1751e();
            this.f58079a2.clear();
            int iM1771y = m1771y(oq6VarM1751e, this.f58079a2, 2);
            if (iM1771y != -5) {
                if (iM1771y == -4) {
                    v80.checkState(this.f58079a2.isEndOfStream());
                    this.f58095q2 = true;
                    try {
                        processEndOfStream();
                        return;
                    } catch (bh0.C1894h e2) {
                        throw m1747a(e2, null, 5002);
                    }
                }
                return;
            }
            onInputFormatChanged(oq6VarM1751e);
        }
        maybeInitDecoder();
        if (this.f58085g2 != null) {
            try {
                x5h.beginSection("drainAndFeed");
                while (drainOutputBuffer()) {
                }
                while (feedInputBuffer()) {
                }
                x5h.endSection();
                this.f58080b2.ensureUpdated();
            } catch (bh0.C1888b e3) {
                throw m1747a(e3, e3.f13722a, 5001);
            } catch (bh0.C1889c e4) {
                throw m1748b(e4, e4.f13725c, e4.f13724b, 5001);
            } catch (bh0.C1894h e5) {
                throw m1748b(e5, e5.f13730c, e5.f13729b, 5002);
            } catch (ql3 e6) {
                xh9.m25145e("DecoderAudioRenderer", "Audio codec error", e6);
                this.f58077V1.audioCodecError(e6);
                throw m1747a(e6, this.f58081c2, 4003);
            }
        }
    }

    @Override // p000.cda
    public void setPlaybackParameters(ryc rycVar) {
        this.f58078Z1.setPlaybackParameters(rycVar);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public final int supportsFormat(C1213a c1213a) {
        if (!rva.isAudio(c1213a.f8291o)) {
            return InterfaceC1255s.create(0);
        }
        int iM16221K = m16221K(c1213a);
        return iM16221K <= 2 ? InterfaceC1255s.create(iM16221K) : InterfaceC1255s.create(iM16221K, 8, 32);
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: u */
    public void mo1767u() {
        this.f58078Z1.play();
        this.f58101w2 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: v */
    public void mo1768v() {
        updateCurrentPosition();
        this.f58078Z1.pause();
        this.f58101w2 = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    public void mo1769w(C1213a[] c1213aArr, long j, long j2, una.C13612b c13612b) throws aa5 {
        super.mo1769w(c1213aArr, j, j2, c13612b);
        this.f58084f2 = false;
        if (this.f58097s2 == -9223372036854775807L) {
            setOutputStreamOffsetUs(j2);
            return;
        }
        int i = this.f58099u2;
        if (i == this.f58098t2.length) {
            xh9.m25148w("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.f58098t2[this.f58099u2 - 1]);
        } else {
            this.f58099u2 = i + 1;
        }
        this.f58098t2[this.f58099u2 - 1] = j2;
    }

    public ll3(@hib Handler handler, @hib rg0 rg0Var, hf0... hf0VarArr) {
        this(handler, rg0Var, null, hf0VarArr);
    }

    public ll3(@hib Handler handler, @hib rg0 rg0Var, hd0 hd0Var, hf0... hf0VarArr) {
        this(handler, rg0Var, new ps3.C11096h().setAudioCapabilities((hd0) yya.firstNonNull(hd0Var, hd0.f43165e)).setAudioProcessors(hf0VarArr).build());
    }

    public ll3(@hib Handler handler, @hib rg0 rg0Var, bh0 bh0Var) {
        super(1);
        this.f58077V1 = new rg0.C12068a(handler, rg0Var);
        this.f58078Z1 = bh0Var;
        bh0Var.setListener(new C8882c());
        this.f58079a2 = rl3.newNoDataInstance();
        this.f58090l2 = 0;
        this.f58092n2 = true;
        setOutputStreamOffsetUs(-9223372036854775807L);
        this.f58098t2 = new long[10];
        this.f58102x2 = -9223372036854775807L;
        this.f58103y2 = -9223372036854775807L;
        this.f58104z2 = -9223372036854775807L;
    }
}
