package p000;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import p000.ch0;
import p000.il3;
import p000.sg0;
import p000.us3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ml3<T extends il3<sl3, ? extends jif, ? extends pl3>> extends bu0 implements bda {

    /* JADX INFO: renamed from: u2 */
    public static final String f61332u2 = "DecoderAudioRenderer";

    /* JADX INFO: renamed from: v2 */
    public static final int f61333v2 = 0;

    /* JADX INFO: renamed from: w2 */
    public static final int f61334w2 = 1;

    /* JADX INFO: renamed from: x2 */
    public static final int f61335x2 = 2;

    /* JADX INFO: renamed from: y2 */
    public static final int f61336y2 = 10;

    /* JADX INFO: renamed from: M1 */
    public final sl3 f61337M1;

    /* JADX INFO: renamed from: V1 */
    public nl3 f61338V1;

    /* JADX INFO: renamed from: Y */
    public final sg0.C12563a f61339Y;

    /* JADX INFO: renamed from: Z */
    public final ch0 f61340Z;

    /* JADX INFO: renamed from: Z1 */
    public kq6 f61341Z1;

    /* JADX INFO: renamed from: a2 */
    public int f61342a2;

    /* JADX INFO: renamed from: b2 */
    public int f61343b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f61344c2;

    /* JADX INFO: renamed from: d2 */
    public boolean f61345d2;

    /* JADX INFO: renamed from: e2 */
    @hib
    public T f61346e2;

    /* JADX INFO: renamed from: f2 */
    @hib
    public sl3 f61347f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public jif f61348g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public InterfaceC3004d f61349h2;

    /* JADX INFO: renamed from: i2 */
    @hib
    public InterfaceC3004d f61350i2;

    /* JADX INFO: renamed from: j2 */
    public int f61351j2;

    /* JADX INFO: renamed from: k2 */
    public boolean f61352k2;

    /* JADX INFO: renamed from: l2 */
    public boolean f61353l2;

    /* JADX INFO: renamed from: m2 */
    public long f61354m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f61355n2;

    /* JADX INFO: renamed from: o2 */
    public boolean f61356o2;

    /* JADX INFO: renamed from: p2 */
    public boolean f61357p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f61358q2;

    /* JADX INFO: renamed from: r2 */
    public long f61359r2;

    /* JADX INFO: renamed from: s2 */
    public final long[] f61360s2;

    /* JADX INFO: renamed from: t2 */
    public int f61361t2;

    /* JADX INFO: renamed from: ml3$b */
    @c5e(23)
    public static final class C9398b {
        private C9398b() {
        }

        @ih4
        public static void setAudioSinkPreferredDevice(ch0 ch0Var, @hib Object obj) {
            ch0Var.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* JADX INFO: renamed from: ml3$c */
    public final class C9399c implements ch0.InterfaceC2310c {
        private C9399c() {
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onAudioSinkError(Exception exc) {
            yh9.m25916e("DecoderAudioRenderer", "Audio sink error", exc);
            ml3.this.f61339Y.audioSinkError(exc);
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onPositionAdvancing(long j) {
            ml3.this.f61339Y.positionAdvancing(j);
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onPositionDiscontinuity() {
            ml3.this.m17378z();
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onSkipSilenceEnabledChanged(boolean z) {
            ml3.this.f61339Y.skipSilenceEnabledChanged(z);
        }

        @Override // p000.ch0.InterfaceC2310c
        public void onUnderrun(int i, long j, long j2) {
            ml3.this.f61339Y.underrun(i, j, j2);
        }
    }

    public ml3() {
        this((Handler) null, (sg0) null, new if0[0]);
    }

    private boolean drainOutputBuffer() throws pl3, ba5, ch0.C2309b, ch0.C2308a, ch0.C2313f {
        if (this.f61348g2 == null) {
            jif jifVar = (jif) this.f61346e2.dequeueOutputBuffer();
            this.f61348g2 = jifVar;
            if (jifVar == null) {
                return false;
            }
            int i = jifVar.f88312c;
            if (i > 0) {
                this.f61338V1.f64833f += i;
                this.f61340Z.handleDiscontinuity();
            }
            if (this.f61348g2.isFirstSample()) {
                processFirstSampleOfStream();
            }
        }
        if (this.f61348g2.isEndOfStream()) {
            if (this.f61351j2 == 2) {
                releaseDecoder();
                maybeInitDecoder();
                this.f61353l2 = true;
            } else {
                this.f61348g2.release();
                this.f61348g2 = null;
                try {
                    processEndOfStream();
                } catch (ch0.C2313f e) {
                    throw m3404b(e, e.f16519c, e.f16518b, 5002);
                }
            }
            return false;
        }
        if (this.f61353l2) {
            this.f61340Z.configure(m17376x(this.f61346e2).buildUpon().setEncoderDelay(this.f61342a2).setEncoderPadding(this.f61343b2).build(), 0, null);
            this.f61353l2 = false;
        }
        ch0 ch0Var = this.f61340Z;
        jif jifVar2 = this.f61348g2;
        if (!ch0Var.handleBuffer(jifVar2.f50683e, jifVar2.f88311b, 1)) {
            return false;
        }
        this.f61338V1.f64832e++;
        this.f61348g2.release();
        this.f61348g2 = null;
        return true;
    }

    private boolean feedInputBuffer() throws pl3, ba5 {
        T t = this.f61346e2;
        if (t == null || this.f61351j2 == 2 || this.f61357p2) {
            return false;
        }
        if (this.f61347f2 == null) {
            sl3 sl3Var = (sl3) t.dequeueInputBuffer();
            this.f61347f2 = sl3Var;
            if (sl3Var == null) {
                return false;
            }
        }
        if (this.f61351j2 == 1) {
            this.f61347f2.setFlags(4);
            this.f61346e2.queueInputBuffer(this.f61347f2);
            this.f61347f2 = null;
            this.f61351j2 = 2;
            return false;
        }
        nq6 nq6VarM3406d = m3406d();
        int iM3421s = m3421s(nq6VarM3406d, this.f61347f2, 0);
        if (iM3421s == -5) {
            onInputFormatChanged(nq6VarM3406d);
            return true;
        }
        if (iM3421s != -4) {
            if (iM3421s == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f61347f2.isEndOfStream()) {
            this.f61357p2 = true;
            this.f61346e2.queueInputBuffer(this.f61347f2);
            this.f61347f2 = null;
            return false;
        }
        if (!this.f61345d2) {
            this.f61345d2 = true;
            this.f61347f2.addFlag(134217728);
        }
        this.f61347f2.flip();
        sl3 sl3Var2 = this.f61347f2;
        sl3Var2.f82160b = this.f61341Z1;
        m17371A(sl3Var2);
        this.f61346e2.queueInputBuffer(this.f61347f2);
        this.f61352k2 = true;
        this.f61338V1.f64830c++;
        this.f61347f2 = null;
        return true;
    }

    private void flushDecoder() throws ba5 {
        if (this.f61351j2 != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.f61347f2 = null;
        jif jifVar = this.f61348g2;
        if (jifVar != null) {
            jifVar.release();
            this.f61348g2 = null;
        }
        this.f61346e2.flush();
        this.f61352k2 = false;
    }

    private void maybeInitDecoder() throws ba5 {
        b93 cryptoConfig;
        if (this.f61346e2 != null) {
            return;
        }
        setDecoderDrmSession(this.f61350i2);
        InterfaceC3004d interfaceC3004d = this.f61349h2;
        if (interfaceC3004d != null) {
            cryptoConfig = interfaceC3004d.getCryptoConfig();
            if (cryptoConfig == null && this.f61349h2.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            w5h.beginSection("createAudioDecoder");
            this.f61346e2 = (T) m17375w(this.f61341Z1, cryptoConfig);
            w5h.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f61339Y.decoderInitialized(this.f61346e2.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f61338V1.f64828a++;
        } catch (OutOfMemoryError e) {
            throw m3403a(e, this.f61341Z1, 4001);
        } catch (pl3 e2) {
            yh9.m25916e("DecoderAudioRenderer", "Audio codec error", e2);
            this.f61339Y.audioCodecError(e2);
            throw m3403a(e2, this.f61341Z1, 4001);
        }
    }

    private void onInputFormatChanged(nq6 nq6Var) throws ba5 {
        kq6 kq6Var = (kq6) u80.checkNotNull(nq6Var.f65258b);
        setSourceDrmSession(nq6Var.f65257a);
        kq6 kq6Var2 = this.f61341Z1;
        this.f61341Z1 = kq6Var;
        this.f61342a2 = kq6Var.f55011h2;
        this.f61343b2 = kq6Var.f55012i2;
        T t = this.f61346e2;
        if (t == null) {
            maybeInitDecoder();
            this.f61339Y.inputFormatChanged(this.f61341Z1, null);
            return;
        }
        wl3 wl3Var = this.f61350i2 != this.f61349h2 ? new wl3(t.getName(), kq6Var2, kq6Var, 0, 128) : m17374v(t.getName(), kq6Var2, kq6Var);
        if (wl3Var.f94612d == 0) {
            if (this.f61352k2) {
                this.f61351j2 = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
                this.f61353l2 = true;
            }
        }
        this.f61339Y.inputFormatChanged(this.f61341Z1, wl3Var);
    }

    private void processEndOfStream() throws ch0.C2313f {
        this.f61358q2 = true;
        this.f61340Z.playToEndOfStream();
    }

    private void processFirstSampleOfStream() {
        this.f61340Z.handleDiscontinuity();
        if (this.f61361t2 != 0) {
            setOutputStreamOffsetUs(this.f61360s2[0]);
            int i = this.f61361t2 - 1;
            this.f61361t2 = i;
            long[] jArr = this.f61360s2;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    private void releaseDecoder() {
        this.f61347f2 = null;
        this.f61348g2 = null;
        this.f61351j2 = 0;
        this.f61352k2 = false;
        T t = this.f61346e2;
        if (t != null) {
            this.f61338V1.f64829b++;
            t.release();
            this.f61339Y.decoderReleased(this.f61346e2.getName());
            this.f61346e2 = null;
        }
        setDecoderDrmSession(null);
    }

    private void setDecoderDrmSession(@hib InterfaceC3004d interfaceC3004d) {
        InterfaceC3004d.replaceSession(this.f61349h2, interfaceC3004d);
        this.f61349h2 = interfaceC3004d;
    }

    private void setOutputStreamOffsetUs(long j) {
        this.f61359r2 = j;
        if (j != -9223372036854775807L) {
            this.f61340Z.setOutputStreamOffsetUs(j);
        }
    }

    private void setSourceDrmSession(@hib InterfaceC3004d interfaceC3004d) {
        InterfaceC3004d.replaceSession(this.f61350i2, interfaceC3004d);
        this.f61350i2 = interfaceC3004d;
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.f61340Z.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.f61356o2) {
                currentPositionUs = Math.max(this.f61354m2, currentPositionUs);
            }
            this.f61354m2 = currentPositionUs;
            this.f61356o2 = false;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m17371A(sl3 sl3Var) {
        if (!this.f61355n2 || sl3Var.isDecodeOnly()) {
            return;
        }
        if (Math.abs(sl3Var.f82164f - this.f61354m2) > 500000) {
            this.f61354m2 = sl3Var.f82164f;
        }
        this.f61355n2 = false;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m17372B(kq6 kq6Var) {
        return this.f61340Z.supportsFormat(kq6Var);
    }

    @vp6
    /* JADX INFO: renamed from: C */
    public abstract int m17373C(kq6 kq6Var);

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean z) {
        this.f61344c2 = z;
    }

    @Override // p000.bu0, p000.n1e
    @hib
    public bda getMediaClock() {
        return this;
    }

    @Override // p000.bda
    public qyc getPlaybackParameters() {
        return this.f61340Z.getPlaybackParameters();
    }

    @Override // p000.bda
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.f61354m2;
    }

    @Override // p000.bu0, p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
        if (i == 2) {
            this.f61340Z.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.f61340Z.setAudioAttributes((yc0) obj);
            return;
        }
        if (i == 6) {
            this.f61340Z.setAuxEffectInfo((om0) obj);
            return;
        }
        if (i == 12) {
            if (x0i.f95978a >= 23) {
                C9398b.setAudioSinkPreferredDevice(this.f61340Z, obj);
            }
        } else if (i == 9) {
            this.f61340Z.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
        } else if (i != 10) {
            super.handleMessage(i, obj);
        } else {
            this.f61340Z.setAudioSessionId(((Integer) obj).intValue());
        }
    }

    @Override // p000.n1e
    public boolean isEnded() {
        return this.f61358q2 && this.f61340Z.isEnded();
    }

    @Override // p000.n1e
    public boolean isReady() {
        return this.f61340Z.hasPendingData() || (this.f61341Z1 != null && (m3411i() || this.f61348g2 != null));
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        this.f61341Z1 = null;
        this.f61353l2 = true;
        setOutputStreamOffsetUs(-9223372036854775807L);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
            this.f61340Z.reset();
        } finally {
            this.f61339Y.disabled(this.f61338V1);
        }
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: k */
    public void mo3413k(boolean z, boolean z2) throws ba5 {
        nl3 nl3Var = new nl3();
        this.f61338V1 = nl3Var;
        this.f61339Y.enabled(nl3Var);
        if (m3405c().f76783a) {
            this.f61340Z.enableTunnelingV21();
        } else {
            this.f61340Z.disableTunneling();
        }
        this.f61340Z.setPlayerId(m3409g());
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) throws ba5 {
        if (this.f61344c2) {
            this.f61340Z.experimentalFlushWithoutAudioTrackRelease();
        } else {
            this.f61340Z.flush();
        }
        this.f61354m2 = j;
        this.f61355n2 = true;
        this.f61356o2 = true;
        this.f61357p2 = false;
        this.f61358q2 = false;
        if (this.f61346e2 != null) {
            flushDecoder();
        }
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: p */
    public void mo3418p() {
        this.f61340Z.play();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: q */
    public void mo3419q() {
        updateCurrentPosition();
        this.f61340Z.pause();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: r */
    public void mo3420r(kq6[] kq6VarArr, long j, long j2) throws ba5 {
        super.mo3420r(kq6VarArr, j, j2);
        this.f61345d2 = false;
        if (this.f61359r2 == -9223372036854775807L) {
            setOutputStreamOffsetUs(j2);
            return;
        }
        int i = this.f61361t2;
        if (i == this.f61360s2.length) {
            yh9.m25919w("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.f61360s2[this.f61361t2 - 1]);
        } else {
            this.f61361t2 = i + 1;
        }
        this.f61360s2[this.f61361t2 - 1] = j2;
    }

    @Override // p000.n1e
    public void render(long j, long j2) throws ba5 {
        if (this.f61358q2) {
            try {
                this.f61340Z.playToEndOfStream();
                return;
            } catch (ch0.C2313f e) {
                throw m3404b(e, e.f16519c, e.f16518b, 5002);
            }
        }
        if (this.f61341Z1 == null) {
            nq6 nq6VarM3406d = m3406d();
            this.f61337M1.clear();
            int iM3421s = m3421s(nq6VarM3406d, this.f61337M1, 2);
            if (iM3421s != -5) {
                if (iM3421s == -4) {
                    u80.checkState(this.f61337M1.isEndOfStream());
                    this.f61357p2 = true;
                    try {
                        processEndOfStream();
                        return;
                    } catch (ch0.C2313f e2) {
                        throw m3403a(e2, null, 5002);
                    }
                }
                return;
            }
            onInputFormatChanged(nq6VarM3406d);
        }
        maybeInitDecoder();
        if (this.f61346e2 != null) {
            try {
                w5h.beginSection("drainAndFeed");
                while (drainOutputBuffer()) {
                }
                while (feedInputBuffer()) {
                }
                w5h.endSection();
                this.f61338V1.ensureUpdated();
            } catch (ch0.C2308a e3) {
                throw m3403a(e3, e3.f16511a, 5001);
            } catch (ch0.C2309b e4) {
                throw m3404b(e4, e4.f16514c, e4.f16513b, 5001);
            } catch (ch0.C2313f e5) {
                throw m3404b(e5, e5.f16519c, e5.f16518b, 5002);
            } catch (pl3 e6) {
                yh9.m25916e("DecoderAudioRenderer", "Audio codec error", e6);
                this.f61339Y.audioCodecError(e6);
                throw m3403a(e6, this.f61341Z1, 4003);
            }
        }
    }

    @Override // p000.bda
    public void setPlaybackParameters(qyc qycVar) {
        this.f61340Z.setPlaybackParameters(qycVar);
    }

    @Override // p000.p1e
    public final int supportsFormat(kq6 kq6Var) {
        if (!sva.isAudio(kq6Var.f54989M)) {
            return p1e.create(0);
        }
        int iM17373C = m17373C(kq6Var);
        if (iM17373C <= 2) {
            return p1e.create(iM17373C);
        }
        return p1e.create(iM17373C, 8, x0i.f95978a >= 21 ? 32 : 0);
    }

    @vp6
    /* JADX INFO: renamed from: v */
    public wl3 m17374v(String str, kq6 kq6Var, kq6 kq6Var2) {
        return new wl3(str, kq6Var, kq6Var2, 0, 1);
    }

    @vp6
    /* JADX INFO: renamed from: w */
    public abstract T m17375w(kq6 kq6Var, @hib b93 b93Var) throws pl3;

    @vp6
    /* JADX INFO: renamed from: x */
    public abstract kq6 m17376x(T t);

    /* JADX INFO: renamed from: y */
    public final int m17377y(kq6 kq6Var) {
        return this.f61340Z.getFormatSupport(kq6Var);
    }

    @vp6
    @un1
    /* JADX INFO: renamed from: z */
    public void m17378z() {
        this.f61356o2 = true;
    }

    public ml3(@hib Handler handler, @hib sg0 sg0Var, if0... if0VarArr) {
        this(handler, sg0Var, null, if0VarArr);
    }

    public ml3(@hib Handler handler, @hib sg0 sg0Var, ld0 ld0Var, if0... if0VarArr) {
        this(handler, sg0Var, new us3.C13682h().setAudioCapabilities((ld0) yya.firstNonNull(ld0Var, ld0.f57217e)).setAudioProcessors(if0VarArr).build());
    }

    public ml3(@hib Handler handler, @hib sg0 sg0Var, ch0 ch0Var) {
        super(1);
        this.f61339Y = new sg0.C12563a(handler, sg0Var);
        this.f61340Z = ch0Var;
        ch0Var.setListener(new C9399c());
        this.f61337M1 = sl3.newNoDataInstance();
        this.f61351j2 = 0;
        this.f61353l2 = true;
        setOutputStreamOffsetUs(-9223372036854775807L);
        this.f61360s2 = new long[10];
    }
}
