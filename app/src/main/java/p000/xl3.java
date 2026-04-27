package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import p000.w7i;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class xl3 extends bu0 {

    /* JADX INFO: renamed from: E2 */
    public static final String f98362E2 = "DecoderVideoRenderer";

    /* JADX INFO: renamed from: F2 */
    public static final int f98363F2 = 0;

    /* JADX INFO: renamed from: G2 */
    public static final int f98364G2 = 1;

    /* JADX INFO: renamed from: H2 */
    public static final int f98365H2 = 2;

    /* JADX INFO: renamed from: A2 */
    public int f98366A2;

    /* JADX INFO: renamed from: B2 */
    public long f98367B2;

    /* JADX INFO: renamed from: C2 */
    public long f98368C2;

    /* JADX INFO: renamed from: D2 */
    public nl3 f98369D2;

    /* JADX INFO: renamed from: M1 */
    public final w7i.C14466a f98370M1;

    /* JADX INFO: renamed from: V1 */
    public final l1h<kq6> f98371V1;

    /* JADX INFO: renamed from: Y */
    public final long f98372Y;

    /* JADX INFO: renamed from: Z */
    public final int f98373Z;

    /* JADX INFO: renamed from: Z1 */
    public final sl3 f98374Z1;

    /* JADX INFO: renamed from: a2 */
    public kq6 f98375a2;

    /* JADX INFO: renamed from: b2 */
    public kq6 f98376b2;

    /* JADX INFO: renamed from: c2 */
    @hib
    public il3<sl3, ? extends g6i, ? extends pl3> f98377c2;

    /* JADX INFO: renamed from: d2 */
    public sl3 f98378d2;

    /* JADX INFO: renamed from: e2 */
    public g6i f98379e2;

    /* JADX INFO: renamed from: f2 */
    public int f98380f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public Object f98381g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public Surface f98382h2;

    /* JADX INFO: renamed from: i2 */
    @hib
    public i6i f98383i2;

    /* JADX INFO: renamed from: j2 */
    @hib
    public n6i f98384j2;

    /* JADX INFO: renamed from: k2 */
    @hib
    public InterfaceC3004d f98385k2;

    /* JADX INFO: renamed from: l2 */
    @hib
    public InterfaceC3004d f98386l2;

    /* JADX INFO: renamed from: m2 */
    public int f98387m2;

    /* JADX INFO: renamed from: n2 */
    public boolean f98388n2;

    /* JADX INFO: renamed from: o2 */
    public boolean f98389o2;

    /* JADX INFO: renamed from: p2 */
    public boolean f98390p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f98391q2;

    /* JADX INFO: renamed from: r2 */
    public long f98392r2;

    /* JADX INFO: renamed from: s2 */
    public long f98393s2;

    /* JADX INFO: renamed from: t2 */
    public boolean f98394t2;

    /* JADX INFO: renamed from: u2 */
    public boolean f98395u2;

    /* JADX INFO: renamed from: v2 */
    public boolean f98396v2;

    /* JADX INFO: renamed from: w2 */
    @hib
    public z7i f98397w2;

    /* JADX INFO: renamed from: x2 */
    public long f98398x2;

    /* JADX INFO: renamed from: y2 */
    public int f98399y2;

    /* JADX INFO: renamed from: z2 */
    public int f98400z2;

    public xl3(long j, @hib Handler handler, @hib w7i w7iVar, int i) {
        super(2);
        this.f98372Y = j;
        this.f98373Z = i;
        this.f98393s2 = -9223372036854775807L;
        clearReportedVideoSize();
        this.f98371V1 = new l1h<>();
        this.f98374Z1 = sl3.newNoDataInstance();
        this.f98370M1 = new w7i.C14466a(handler, w7iVar);
        this.f98387m2 = 0;
        this.f98380f2 = -1;
    }

    private void clearRenderedFirstFrame() {
        this.f98389o2 = false;
    }

    private void clearReportedVideoSize() {
        this.f98397w2 = null;
    }

    private boolean drainOutputBuffer(long j, long j2) throws pl3, ba5 {
        if (this.f98379e2 == null) {
            g6i g6iVarDequeueOutputBuffer = this.f98377c2.dequeueOutputBuffer();
            this.f98379e2 = g6iVarDequeueOutputBuffer;
            if (g6iVarDequeueOutputBuffer == null) {
                return false;
            }
            nl3 nl3Var = this.f98369D2;
            int i = nl3Var.f64833f;
            int i2 = g6iVarDequeueOutputBuffer.f88312c;
            nl3Var.f64833f = i + i2;
            this.f98366A2 -= i2;
        }
        if (!this.f98379e2.isEndOfStream()) {
            boolean zProcessOutputBuffer = processOutputBuffer(j, j2);
            if (zProcessOutputBuffer) {
                m25277y(this.f98379e2.f88311b);
                this.f98379e2 = null;
            }
            return zProcessOutputBuffer;
        }
        if (this.f98387m2 == 2) {
            releaseDecoder();
            maybeInitDecoder();
        } else {
            this.f98379e2.release();
            this.f98379e2 = null;
            this.f98396v2 = true;
        }
        return false;
    }

    private boolean feedInputBuffer() throws pl3, ba5 {
        il3<sl3, ? extends g6i, ? extends pl3> il3Var = this.f98377c2;
        if (il3Var == null || this.f98387m2 == 2 || this.f98395u2) {
            return false;
        }
        if (this.f98378d2 == null) {
            sl3 sl3VarDequeueInputBuffer = il3Var.dequeueInputBuffer();
            this.f98378d2 = sl3VarDequeueInputBuffer;
            if (sl3VarDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.f98387m2 == 1) {
            this.f98378d2.setFlags(4);
            this.f98377c2.queueInputBuffer(this.f98378d2);
            this.f98378d2 = null;
            this.f98387m2 = 2;
            return false;
        }
        nq6 nq6VarM3406d = m3406d();
        int iM3421s = m3421s(nq6VarM3406d, this.f98378d2, 0);
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
        if (this.f98378d2.isEndOfStream()) {
            this.f98395u2 = true;
            this.f98377c2.queueInputBuffer(this.f98378d2);
            this.f98378d2 = null;
            return false;
        }
        if (this.f98394t2) {
            this.f98371V1.add(this.f98378d2.f82164f, this.f98375a2);
            this.f98394t2 = false;
        }
        this.f98378d2.flip();
        sl3 sl3Var = this.f98378d2;
        sl3Var.f82160b = this.f98375a2;
        m25278z(sl3Var);
        this.f98377c2.queueInputBuffer(this.f98378d2);
        this.f98366A2++;
        this.f98388n2 = true;
        this.f98369D2.f64830c++;
        this.f98378d2 = null;
        return true;
    }

    private boolean hasOutput() {
        return this.f98380f2 != -1;
    }

    private static boolean isBufferLate(long j) {
        return j < rea.f78021I4;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < rea.f78022J4;
    }

    private void maybeInitDecoder() throws ba5 {
        b93 cryptoConfig;
        if (this.f98377c2 != null) {
            return;
        }
        setDecoderDrmSession(this.f98386l2);
        InterfaceC3004d interfaceC3004d = this.f98385k2;
        if (interfaceC3004d != null) {
            cryptoConfig = interfaceC3004d.getCryptoConfig();
            if (cryptoConfig == null && this.f98385k2.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f98377c2 = m25274v(this.f98375a2, cryptoConfig);
            m25267C(this.f98380f2);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f98370M1.decoderInitialized(this.f98377c2.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f98369D2.f64828a++;
        } catch (OutOfMemoryError e) {
            throw m3403a(e, this.f98375a2, 4001);
        } catch (pl3 e2) {
            yh9.m25916e("DecoderVideoRenderer", "Video codec error", e2);
            this.f98370M1.videoCodecError(e2);
            throw m3403a(e2, this.f98375a2, 4001);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.f98399y2 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f98370M1.droppedFrames(this.f98399y2, jElapsedRealtime - this.f98398x2);
            this.f98399y2 = 0;
            this.f98398x2 = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        this.f98391q2 = true;
        if (this.f98389o2) {
            return;
        }
        this.f98389o2 = true;
        this.f98370M1.renderedFirstFrame(this.f98381g2);
    }

    private void maybeNotifyVideoSizeChanged(int i, int i2) {
        z7i z7iVar = this.f98397w2;
        if (z7iVar != null && z7iVar.f104349a == i && z7iVar.f104350b == i2) {
            return;
        }
        z7i z7iVar2 = new z7i(i, i2);
        this.f98397w2 = z7iVar2;
        this.f98370M1.videoSizeChanged(z7iVar2);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.f98389o2) {
            this.f98370M1.renderedFirstFrame(this.f98381g2);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        z7i z7iVar = this.f98397w2;
        if (z7iVar != null) {
            this.f98370M1.videoSizeChanged(z7iVar);
        }
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        clearReportedVideoSize();
        clearRenderedFirstFrame();
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private boolean processOutputBuffer(long j, long j2) throws pl3, ba5 {
        if (this.f98392r2 == -9223372036854775807L) {
            this.f98392r2 = j;
        }
        long j3 = this.f98379e2.f88311b - j;
        if (!hasOutput()) {
            if (!isBufferLate(j3)) {
                return false;
            }
            m25271G(this.f98379e2);
            return true;
        }
        long j4 = this.f98379e2.f88311b - this.f98368C2;
        kq6 kq6VarPollFloor = this.f98371V1.pollFloor(j4);
        if (kq6VarPollFloor != null) {
            this.f98376b2 = kq6VarPollFloor;
        }
        long jMsToUs = x0i.msToUs(SystemClock.elapsedRealtime()) - this.f98367B2;
        boolean z = getState() == 2;
        if (this.f98391q2 ? this.f98389o2 : !z && !this.f98390p2) {
            if (!z || !m25270F(j3, jMsToUs)) {
                if (!z || j == this.f98392r2 || (m25268D(j3, j2) && m25276x(j))) {
                    return false;
                }
                if (m25269E(j3, j2)) {
                    m25275w(this.f98379e2);
                    return true;
                }
                if (j3 < 30000) {
                    m25265A(this.f98379e2, j4, this.f98376b2);
                    return true;
                }
                return false;
            }
        }
        m25265A(this.f98379e2, j4, this.f98376b2);
        return true;
    }

    private void setDecoderDrmSession(@hib InterfaceC3004d interfaceC3004d) {
        InterfaceC3004d.replaceSession(this.f98385k2, interfaceC3004d);
        this.f98385k2 = interfaceC3004d;
    }

    private void setJoiningDeadlineMs() {
        this.f98393s2 = this.f98372Y > 0 ? SystemClock.elapsedRealtime() + this.f98372Y : -9223372036854775807L;
    }

    private void setSourceDrmSession(@hib InterfaceC3004d interfaceC3004d) {
        InterfaceC3004d.replaceSession(this.f98386l2, interfaceC3004d);
        this.f98386l2 = interfaceC3004d;
    }

    /* JADX INFO: renamed from: A */
    public void m25265A(g6i g6iVar, long j, kq6 kq6Var) throws pl3 {
        n6i n6iVar = this.f98384j2;
        if (n6iVar != null) {
            n6iVar.onVideoFrameAboutToBeRendered(j, System.nanoTime(), kq6Var, null);
        }
        this.f98367B2 = x0i.msToUs(SystemClock.elapsedRealtime());
        int i = g6iVar.f38924e;
        boolean z = i == 1 && this.f98382h2 != null;
        boolean z2 = i == 0 && this.f98383i2 != null;
        if (!z2 && !z) {
            m25275w(g6iVar);
            return;
        }
        maybeNotifyVideoSizeChanged(g6iVar.f38926m, g6iVar.f38916C);
        if (z2) {
            this.f98383i2.setOutputBuffer(g6iVar);
        } else {
            m25266B(g6iVar, this.f98382h2);
        }
        this.f98400z2 = 0;
        this.f98369D2.f64832e++;
        maybeNotifyRenderedFirstFrame();
    }

    /* JADX INFO: renamed from: B */
    public abstract void m25266B(g6i g6iVar, Surface surface) throws pl3;

    /* JADX INFO: renamed from: C */
    public abstract void m25267C(int i);

    /* JADX INFO: renamed from: D */
    public boolean m25268D(long j, long j2) {
        return isBufferVeryLate(j);
    }

    /* JADX INFO: renamed from: E */
    public boolean m25269E(long j, long j2) {
        return isBufferLate(j);
    }

    /* JADX INFO: renamed from: F */
    public boolean m25270F(long j, long j2) {
        return isBufferLate(j) && j2 > 100000;
    }

    /* JADX INFO: renamed from: G */
    public void m25271G(g6i g6iVar) {
        this.f98369D2.f64833f++;
        g6iVar.release();
    }

    /* JADX INFO: renamed from: H */
    public void m25272H(int i, int i2) {
        nl3 nl3Var = this.f98369D2;
        nl3Var.f64835h += i;
        int i3 = i + i2;
        nl3Var.f64834g += i3;
        this.f98399y2 += i3;
        int i4 = this.f98400z2 + i3;
        this.f98400z2 = i4;
        nl3Var.f64836i = Math.max(i4, nl3Var.f64836i);
        int i5 = this.f98373Z;
        if (i5 <= 0 || this.f98399y2 < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    @un1
    public void flushDecoder() throws ba5 {
        this.f98366A2 = 0;
        if (this.f98387m2 != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.f98378d2 = null;
        g6i g6iVar = this.f98379e2;
        if (g6iVar != null) {
            g6iVar.release();
            this.f98379e2 = null;
        }
        this.f98377c2.flush();
        this.f98388n2 = false;
    }

    @Override // p000.bu0, p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
        if (i == 1) {
            setOutput(obj);
        } else if (i == 7) {
            this.f98384j2 = (n6i) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // p000.n1e
    public boolean isEnded() {
        return this.f98396v2;
    }

    @Override // p000.n1e
    public boolean isReady() {
        if (this.f98375a2 != null && ((m3411i() || this.f98379e2 != null) && (this.f98389o2 || !hasOutput()))) {
            this.f98393s2 = -9223372036854775807L;
            return true;
        }
        if (this.f98393s2 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f98393s2) {
            return true;
        }
        this.f98393s2 = -9223372036854775807L;
        return false;
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        this.f98375a2 = null;
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.f98370M1.disabled(this.f98369D2);
        }
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: k */
    public void mo3413k(boolean z, boolean z2) throws ba5 {
        nl3 nl3Var = new nl3();
        this.f98369D2 = nl3Var;
        this.f98370M1.enabled(nl3Var);
        this.f98390p2 = z2;
        this.f98391q2 = false;
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) throws ba5 {
        this.f98395u2 = false;
        this.f98396v2 = false;
        clearRenderedFirstFrame();
        this.f98392r2 = -9223372036854775807L;
        this.f98400z2 = 0;
        if (this.f98377c2 != null) {
            flushDecoder();
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.f98393s2 = -9223372036854775807L;
        }
        this.f98371V1.clear();
    }

    @un1
    public void onInputFormatChanged(nq6 nq6Var) throws ba5 {
        this.f98394t2 = true;
        kq6 kq6Var = (kq6) u80.checkNotNull(nq6Var.f65258b);
        setSourceDrmSession(nq6Var.f65257a);
        kq6 kq6Var2 = this.f98375a2;
        this.f98375a2 = kq6Var;
        il3<sl3, ? extends g6i, ? extends pl3> il3Var = this.f98377c2;
        if (il3Var == null) {
            maybeInitDecoder();
            this.f98370M1.inputFormatChanged(this.f98375a2, null);
            return;
        }
        wl3 wl3Var = this.f98386l2 != this.f98385k2 ? new wl3(il3Var.getName(), kq6Var2, kq6Var, 0, 128) : m25273u(il3Var.getName(), kq6Var2, kq6Var);
        if (wl3Var.f94612d == 0) {
            if (this.f98388n2) {
                this.f98387m2 = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        this.f98370M1.inputFormatChanged(this.f98375a2, wl3Var);
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: p */
    public void mo3418p() {
        this.f98399y2 = 0;
        this.f98398x2 = SystemClock.elapsedRealtime();
        this.f98367B2 = x0i.msToUs(SystemClock.elapsedRealtime());
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: q */
    public void mo3419q() {
        this.f98393s2 = -9223372036854775807L;
        maybeNotifyDroppedFrames();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: r */
    public void mo3420r(kq6[] kq6VarArr, long j, long j2) throws ba5 {
        this.f98368C2 = j2;
        super.mo3420r(kq6VarArr, j, j2);
    }

    @un1
    public void releaseDecoder() {
        this.f98378d2 = null;
        this.f98379e2 = null;
        this.f98387m2 = 0;
        this.f98388n2 = false;
        this.f98366A2 = 0;
        il3<sl3, ? extends g6i, ? extends pl3> il3Var = this.f98377c2;
        if (il3Var != null) {
            this.f98369D2.f64829b++;
            il3Var.release();
            this.f98370M1.decoderReleased(this.f98377c2.getName());
            this.f98377c2 = null;
        }
        setDecoderDrmSession(null);
    }

    @Override // p000.n1e
    public void render(long j, long j2) throws ba5 {
        if (this.f98396v2) {
            return;
        }
        if (this.f98375a2 == null) {
            nq6 nq6VarM3406d = m3406d();
            this.f98374Z1.clear();
            int iM3421s = m3421s(nq6VarM3406d, this.f98374Z1, 2);
            if (iM3421s != -5) {
                if (iM3421s == -4) {
                    u80.checkState(this.f98374Z1.isEndOfStream());
                    this.f98395u2 = true;
                    this.f98396v2 = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(nq6VarM3406d);
        }
        maybeInitDecoder();
        if (this.f98377c2 != null) {
            try {
                w5h.beginSection("drainAndFeed");
                while (drainOutputBuffer(j, j2)) {
                }
                while (feedInputBuffer()) {
                }
                w5h.endSection();
                this.f98369D2.ensureUpdated();
            } catch (pl3 e) {
                yh9.m25916e("DecoderVideoRenderer", "Video codec error", e);
                this.f98370M1.videoCodecError(e);
                throw m3403a(e, this.f98375a2, 4003);
            }
        }
    }

    public final void setOutput(@hib Object obj) {
        if (obj instanceof Surface) {
            this.f98382h2 = (Surface) obj;
            this.f98383i2 = null;
            this.f98380f2 = 1;
        } else if (obj instanceof i6i) {
            this.f98382h2 = null;
            this.f98383i2 = (i6i) obj;
            this.f98380f2 = 0;
        } else {
            this.f98382h2 = null;
            this.f98383i2 = null;
            this.f98380f2 = -1;
            obj = null;
        }
        if (this.f98381g2 == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.f98381g2 = obj;
        if (obj == null) {
            onOutputRemoved();
            return;
        }
        if (this.f98377c2 != null) {
            m25267C(this.f98380f2);
        }
        onOutputChanged();
    }

    /* JADX INFO: renamed from: u */
    public wl3 m25273u(String str, kq6 kq6Var, kq6 kq6Var2) {
        return new wl3(str, kq6Var, kq6Var2, 0, 1);
    }

    /* JADX INFO: renamed from: v */
    public abstract il3<sl3, ? extends g6i, ? extends pl3> m25274v(kq6 kq6Var, @hib b93 b93Var) throws pl3;

    /* JADX INFO: renamed from: w */
    public void m25275w(g6i g6iVar) {
        m25272H(0, 1);
        g6iVar.release();
    }

    /* JADX INFO: renamed from: x */
    public boolean m25276x(long j) throws ba5 {
        int iM3422t = m3422t(j);
        if (iM3422t == 0) {
            return false;
        }
        this.f98369D2.f64837j++;
        m25272H(iM3422t, this.f98366A2);
        flushDecoder();
        return true;
    }

    @un1
    /* JADX INFO: renamed from: y */
    public void m25277y(long j) {
        this.f98366A2--;
    }

    /* JADX INFO: renamed from: z */
    public void m25278z(sl3 sl3Var) {
    }
}
