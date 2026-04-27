package p000;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import p000.una;
import p000.v7i;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class yl3 extends AbstractC1224c {

    /* JADX INFO: renamed from: E2 */
    public static final String f101957E2 = "DecoderVideoRenderer";

    /* JADX INFO: renamed from: F2 */
    public static final int f101958F2 = 0;

    /* JADX INFO: renamed from: G2 */
    public static final int f101959G2 = 1;

    /* JADX INFO: renamed from: H2 */
    public static final int f101960H2 = 2;

    /* JADX INFO: renamed from: A2 */
    public int f101961A2;

    /* JADX INFO: renamed from: B2 */
    public int f101962B2;

    /* JADX INFO: renamed from: C2 */
    public long f101963C2;

    /* JADX INFO: renamed from: D2 */
    public ol3 f101964D2;

    /* JADX INFO: renamed from: V1 */
    public final long f101965V1;

    /* JADX INFO: renamed from: Z1 */
    public final int f101966Z1;

    /* JADX INFO: renamed from: a2 */
    public final v7i.C13929a f101967a2;

    /* JADX INFO: renamed from: b2 */
    public final m1h<C1213a> f101968b2;

    /* JADX INFO: renamed from: c2 */
    public final rl3 f101969c2;

    /* JADX INFO: renamed from: d2 */
    @hib
    public C1213a f101970d2;

    /* JADX INFO: renamed from: e2 */
    @hib
    public C1213a f101971e2;

    /* JADX INFO: renamed from: f2 */
    @hib
    public kl3<rl3, ? extends h6i, ? extends ql3> f101972f2;

    /* JADX INFO: renamed from: g2 */
    @hib
    public rl3 f101973g2;

    /* JADX INFO: renamed from: h2 */
    @hib
    public h6i f101974h2;

    /* JADX INFO: renamed from: i2 */
    public int f101975i2;

    /* JADX INFO: renamed from: j2 */
    @hib
    public Object f101976j2;

    /* JADX INFO: renamed from: k2 */
    @hib
    public Surface f101977k2;

    /* JADX INFO: renamed from: l2 */
    @hib
    public j6i f101978l2;

    /* JADX INFO: renamed from: m2 */
    @hib
    public o6i f101979m2;

    /* JADX INFO: renamed from: n2 */
    @hib
    public ar4 f101980n2;

    /* JADX INFO: renamed from: o2 */
    @hib
    public ar4 f101981o2;

    /* JADX INFO: renamed from: p2 */
    public int f101982p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f101983q2;

    /* JADX INFO: renamed from: r2 */
    public int f101984r2;

    /* JADX INFO: renamed from: s2 */
    public long f101985s2;

    /* JADX INFO: renamed from: t2 */
    public long f101986t2;

    /* JADX INFO: renamed from: u2 */
    public boolean f101987u2;

    /* JADX INFO: renamed from: v2 */
    public boolean f101988v2;

    /* JADX INFO: renamed from: w2 */
    public boolean f101989w2;

    /* JADX INFO: renamed from: x2 */
    @hib
    public a8i f101990x2;

    /* JADX INFO: renamed from: y2 */
    public long f101991y2;

    /* JADX INFO: renamed from: z2 */
    public int f101992z2;

    public yl3(long j, @hib Handler handler, @hib v7i v7iVar, int i) {
        super(2);
        this.f101965V1 = j;
        this.f101966Z1 = i;
        this.f101986t2 = -9223372036854775807L;
        this.f101968b2 = new m1h<>();
        this.f101969c2 = rl3.newNoDataInstance();
        this.f101967a2 = new v7i.C13929a(handler, v7iVar);
        this.f101982p2 = 0;
        this.f101975i2 = -1;
        this.f101984r2 = 0;
        this.f101964D2 = new ol3();
    }

    private boolean drainOutputBuffer(long j, long j2) throws aa5, ql3 {
        if (this.f101974h2 == null) {
            h6i h6iVar = (h6i) ((kl3) v80.checkNotNull(this.f101972f2)).dequeueOutputBuffer();
            this.f101974h2 = h6iVar;
            if (h6iVar == null) {
                return false;
            }
            ol3 ol3Var = this.f101964D2;
            int i = ol3Var.f68021f;
            int i2 = h6iVar.f85178c;
            ol3Var.f68021f = i + i2;
            this.f101962B2 -= i2;
        }
        if (!this.f101974h2.isEndOfStream()) {
            boolean zProcessOutputBuffer = processOutputBuffer(j, j2);
            if (zProcessOutputBuffer) {
                onProcessedOutputBuffer(((h6i) v80.checkNotNull(this.f101974h2)).f85177b);
                this.f101974h2 = null;
            }
            return zProcessOutputBuffer;
        }
        if (this.f101982p2 == 2) {
            releaseDecoder();
            maybeInitDecoder();
        } else {
            this.f101974h2.release();
            this.f101974h2 = null;
            this.f101989w2 = true;
        }
        return false;
    }

    private boolean feedInputBuffer() throws aa5, ql3 {
        kl3<rl3, ? extends h6i, ? extends ql3> kl3Var = this.f101972f2;
        if (kl3Var == null || this.f101982p2 == 2 || this.f101988v2) {
            return false;
        }
        if (this.f101973g2 == null) {
            rl3 rl3VarDequeueInputBuffer = kl3Var.dequeueInputBuffer();
            this.f101973g2 = rl3VarDequeueInputBuffer;
            if (rl3VarDequeueInputBuffer == null) {
                return false;
            }
        }
        rl3 rl3Var = (rl3) v80.checkNotNull(this.f101973g2);
        if (this.f101982p2 == 1) {
            rl3Var.setFlags(4);
            ((kl3) v80.checkNotNull(this.f101972f2)).queueInputBuffer(rl3Var);
            this.f101973g2 = null;
            this.f101982p2 = 2;
            return false;
        }
        oq6 oq6VarM1751e = m1751e();
        int iM1771y = m1771y(oq6VarM1751e, rl3Var, 0);
        if (iM1771y == -5) {
            onInputFormatChanged(oq6VarM1751e);
            return true;
        }
        if (iM1771y != -4) {
            if (iM1771y == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (rl3Var.isEndOfStream()) {
            this.f101988v2 = true;
            ((kl3) v80.checkNotNull(this.f101972f2)).queueInputBuffer(rl3Var);
            this.f101973g2 = null;
            return false;
        }
        if (this.f101987u2) {
            this.f101968b2.add(rl3Var.f78610f, (C1213a) v80.checkNotNull(this.f101970d2));
            this.f101987u2 = false;
        }
        rl3Var.flip();
        rl3Var.f78606b = this.f101970d2;
        m26172E(rl3Var);
        ((kl3) v80.checkNotNull(this.f101972f2)).queueInputBuffer(rl3Var);
        this.f101962B2++;
        this.f101983q2 = true;
        this.f101964D2.f68018c++;
        this.f101973g2 = null;
        return true;
    }

    private boolean hasOutput() {
        return this.f101975i2 != -1;
    }

    private static boolean isBufferLate(long j) {
        return j < rea.f78021I4;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < rea.f78022J4;
    }

    private void lowerFirstFrameState(int i) {
        this.f101984r2 = Math.min(this.f101984r2, i);
    }

    private void maybeInitDecoder() throws aa5 {
        c93 cryptoConfig;
        if (this.f101972f2 != null) {
            return;
        }
        setDecoderDrmSession(this.f101981o2);
        ar4 ar4Var = this.f101980n2;
        if (ar4Var != null) {
            cryptoConfig = ar4Var.getCryptoConfig();
            if (cryptoConfig == null && this.f101980n2.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kl3<rl3, ? extends h6i, ? extends ql3> kl3VarM26169B = m26169B((C1213a) v80.checkNotNull(this.f101970d2), cryptoConfig);
            this.f101972f2 = kl3VarM26169B;
            kl3VarM26169B.setOutputStartTimeUs(m1753g());
            m26175H(this.f101975i2);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f101967a2.decoderInitialized(((kl3) v80.checkNotNull(this.f101972f2)).getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.f101964D2.f68016a++;
        } catch (OutOfMemoryError e) {
            throw m1747a(e, this.f101970d2, 4001);
        } catch (ql3 e2) {
            xh9.m25145e("DecoderVideoRenderer", "Video codec error", e2);
            this.f101967a2.videoCodecError(e2);
            throw m1747a(e2, this.f101970d2, 4001);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.f101992z2 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f101967a2.droppedFrames(this.f101992z2, jElapsedRealtime - this.f101991y2);
            this.f101992z2 = 0;
            this.f101991y2 = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (this.f101984r2 != 3) {
            this.f101984r2 = 3;
            Object obj = this.f101976j2;
            if (obj != null) {
                this.f101967a2.renderedFirstFrame(obj);
            }
        }
    }

    private void maybeNotifyVideoSizeChanged(int i, int i2) {
        a8i a8iVar = this.f101990x2;
        if (a8iVar != null && a8iVar.f647a == i && a8iVar.f648b == i2) {
            return;
        }
        a8i a8iVar2 = new a8i(i, i2);
        this.f101990x2 = a8iVar2;
        this.f101967a2.videoSizeChanged(a8iVar2);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Object obj;
        if (this.f101984r2 != 3 || (obj = this.f101976j2) == null) {
            return;
        }
        this.f101967a2.renderedFirstFrame(obj);
    }

    private void maybeRenotifyVideoSizeChanged() {
        a8i a8iVar = this.f101990x2;
        if (a8iVar != null) {
            this.f101967a2.videoSizeChanged(a8iVar);
        }
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        lowerFirstFrameState(1);
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        this.f101990x2 = null;
        lowerFirstFrameState(1);
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private boolean processOutputBuffer(long j, long j2) throws aa5, ql3 {
        if (this.f101985s2 == -9223372036854775807L) {
            this.f101985s2 = j;
        }
        h6i h6iVar = (h6i) v80.checkNotNull(this.f101974h2);
        long j3 = h6iVar.f85177b;
        long j4 = j3 - j;
        if (!hasOutput()) {
            if (!isBufferLate(j4)) {
                return false;
            }
            m26179L(h6iVar);
            return true;
        }
        C1213a c1213aPollFloor = this.f101968b2.pollFloor(j3);
        if (c1213aPollFloor != null) {
            this.f101971e2 = c1213aPollFloor;
        } else if (this.f101971e2 == null) {
            this.f101971e2 = this.f101968b2.pollFirst();
        }
        long jM1757k = j3 - m1757k();
        if (shouldForceRender(j4)) {
            m26173F(h6iVar, jM1757k, (C1213a) v80.checkNotNull(this.f101971e2));
            return true;
        }
        if (getState() != 2 || j == this.f101985s2 || (m26176I(j4, j2) && m26171D(j))) {
            return false;
        }
        if (m26177J(j4, j2)) {
            m26170C(h6iVar);
            return true;
        }
        if (j4 < 30000) {
            m26173F(h6iVar, jM1757k, (C1213a) v80.checkNotNull(this.f101971e2));
            return true;
        }
        return false;
    }

    private void setDecoderDrmSession(@hib ar4 ar4Var) {
        ar4.replaceSession(this.f101980n2, ar4Var);
        this.f101980n2 = ar4Var;
    }

    private void setJoiningDeadlineMs() {
        this.f101986t2 = this.f101965V1 > 0 ? SystemClock.elapsedRealtime() + this.f101965V1 : -9223372036854775807L;
    }

    private void setSourceDrmSession(@hib ar4 ar4Var) {
        ar4.replaceSession(this.f101981o2, ar4Var);
        this.f101981o2 = ar4Var;
    }

    private boolean shouldForceRender(long j) {
        boolean z = getState() == 2;
        int i = this.f101984r2;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return z && m26178K(j, t0i.msToUs(SystemClock.elapsedRealtime()) - this.f101963C2);
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: A */
    public vl3 m26168A(String str, C1213a c1213a, C1213a c1213a2) {
        return new vl3(str, c1213a, c1213a2, 0, 1);
    }

    /* JADX INFO: renamed from: B */
    public abstract kl3<rl3, ? extends h6i, ? extends ql3> m26169B(C1213a c1213a, @hib c93 c93Var) throws ql3;

    /* JADX INFO: renamed from: C */
    public void m26170C(h6i h6iVar) {
        m26180M(0, 1);
        h6iVar.release();
    }

    /* JADX INFO: renamed from: D */
    public boolean m26171D(long j) throws aa5 {
        int iM1772z = m1772z(j);
        if (iM1772z == 0) {
            return false;
        }
        this.f101964D2.f68025j++;
        m26180M(iM1772z, this.f101962B2);
        flushDecoder();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public void m26172E(rl3 rl3Var) {
    }

    /* JADX INFO: renamed from: F */
    public void m26173F(h6i h6iVar, long j, C1213a c1213a) throws ql3 {
        o6i o6iVar = this.f101979m2;
        if (o6iVar != null) {
            o6iVar.onVideoFrameAboutToBeRendered(j, m1749c().nanoTime(), c1213a, null);
        }
        this.f101963C2 = t0i.msToUs(SystemClock.elapsedRealtime());
        int i = h6iVar.f42538f;
        boolean z = i == 1 && this.f101977k2 != null;
        boolean z2 = i == 0 && this.f101978l2 != null;
        if (!z2 && !z) {
            m26170C(h6iVar);
            return;
        }
        maybeNotifyVideoSizeChanged(h6iVar.f42527C, h6iVar.f42528F);
        if (z2) {
            ((j6i) v80.checkNotNull(this.f101978l2)).setOutputBuffer(h6iVar);
        } else {
            m26174G(h6iVar, (Surface) v80.checkNotNull(this.f101977k2));
        }
        this.f101961A2 = 0;
        this.f101964D2.f68020e++;
        maybeNotifyRenderedFirstFrame();
    }

    /* JADX INFO: renamed from: G */
    public abstract void m26174G(h6i h6iVar, Surface surface) throws ql3;

    /* JADX INFO: renamed from: H */
    public abstract void m26175H(int i);

    /* JADX INFO: renamed from: I */
    public boolean m26176I(long j, long j2) {
        return isBufferVeryLate(j);
    }

    /* JADX INFO: renamed from: J */
    public boolean m26177J(long j, long j2) {
        return isBufferLate(j);
    }

    /* JADX INFO: renamed from: K */
    public boolean m26178K(long j, long j2) {
        return isBufferLate(j) && j2 > 100000;
    }

    /* JADX INFO: renamed from: L */
    public void m26179L(h6i h6iVar) {
        this.f101964D2.f68021f++;
        h6iVar.release();
    }

    /* JADX INFO: renamed from: M */
    public void m26180M(int i, int i2) {
        ol3 ol3Var = this.f101964D2;
        ol3Var.f68023h += i;
        int i3 = i + i2;
        ol3Var.f68022g += i3;
        this.f101992z2 += i3;
        int i4 = this.f101961A2 + i3;
        this.f101961A2 = i4;
        ol3Var.f68024i = Math.max(i4, ol3Var.f68024i);
        int i5 = this.f101966Z1;
        if (i5 <= 0 || this.f101992z2 < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void enableMayRenderStartOfStream() {
        if (this.f101984r2 == 0) {
            this.f101984r2 = 1;
        }
    }

    @un1
    public void flushDecoder() throws aa5 {
        this.f101962B2 = 0;
        if (this.f101982p2 != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.f101973g2 = null;
        h6i h6iVar = this.f101974h2;
        if (h6iVar != null) {
            h6iVar.release();
            this.f101974h2 = null;
        }
        kl3 kl3Var = (kl3) v80.checkNotNull(this.f101972f2);
        kl3Var.flush();
        kl3Var.setOutputStartTimeUs(m1753g());
        this.f101983q2 = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i == 1) {
            setOutput(obj);
        } else if (i == 7) {
            this.f101979m2 = (o6i) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f101989w2;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        if (this.f101970d2 != null && ((m1759m() || this.f101974h2 != null) && (this.f101984r2 == 3 || !hasOutput()))) {
            this.f101986t2 = -9223372036854775807L;
            return true;
        }
        if (this.f101986t2 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f101986t2) {
            return true;
        }
        this.f101986t2 = -9223372036854775807L;
        return false;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f101970d2 = null;
        this.f101990x2 = null;
        lowerFirstFrameState(0);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.f101967a2.disabled(this.f101964D2);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: o */
    public void mo1761o(boolean z, boolean z2) throws aa5 {
        ol3 ol3Var = new ol3();
        this.f101964D2 = ol3Var;
        this.f101967a2.enabled(ol3Var);
        this.f101984r2 = z2 ? 1 : 0;
    }

    @un1
    public void onInputFormatChanged(oq6 oq6Var) throws aa5 {
        this.f101987u2 = true;
        C1213a c1213a = (C1213a) v80.checkNotNull(oq6Var.f68294b);
        setSourceDrmSession(oq6Var.f68293a);
        C1213a c1213a2 = this.f101970d2;
        this.f101970d2 = c1213a;
        kl3<rl3, ? extends h6i, ? extends ql3> kl3Var = this.f101972f2;
        if (kl3Var == null) {
            maybeInitDecoder();
            this.f101967a2.inputFormatChanged((C1213a) v80.checkNotNull(this.f101970d2), null);
            return;
        }
        vl3 vl3Var = this.f101981o2 != this.f101980n2 ? new vl3(kl3Var.getName(), (C1213a) v80.checkNotNull(c1213a2), c1213a, 0, 128) : m26168A(kl3Var.getName(), (C1213a) v80.checkNotNull(c1213a2), c1213a);
        if (vl3Var.f91580d == 0) {
            if (this.f101983q2) {
                this.f101982p2 = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        this.f101967a2.inputFormatChanged((C1213a) v80.checkNotNull(this.f101970d2), vl3Var);
    }

    @un1
    public void onProcessedOutputBuffer(long j) {
        this.f101962B2--;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) throws aa5 {
        this.f101988v2 = false;
        this.f101989w2 = false;
        lowerFirstFrameState(1);
        this.f101985s2 = -9223372036854775807L;
        this.f101961A2 = 0;
        if (this.f101972f2 != null) {
            flushDecoder();
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.f101986t2 = -9223372036854775807L;
        }
        this.f101968b2.clear();
    }

    @un1
    public void releaseDecoder() {
        this.f101973g2 = null;
        this.f101974h2 = null;
        this.f101982p2 = 0;
        this.f101983q2 = false;
        this.f101962B2 = 0;
        kl3<rl3, ? extends h6i, ? extends ql3> kl3Var = this.f101972f2;
        if (kl3Var != null) {
            this.f101964D2.f68017b++;
            kl3Var.release();
            this.f101967a2.decoderReleased(this.f101972f2.getName());
            this.f101972f2 = null;
        }
        setDecoderDrmSession(null);
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) throws aa5 {
        if (this.f101989w2) {
            return;
        }
        if (this.f101970d2 == null) {
            oq6 oq6VarM1751e = m1751e();
            this.f101969c2.clear();
            int iM1771y = m1771y(oq6VarM1751e, this.f101969c2, 2);
            if (iM1771y != -5) {
                if (iM1771y == -4) {
                    v80.checkState(this.f101969c2.isEndOfStream());
                    this.f101988v2 = true;
                    this.f101989w2 = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(oq6VarM1751e);
        }
        maybeInitDecoder();
        if (this.f101972f2 != null) {
            try {
                x5h.beginSection("drainAndFeed");
                while (drainOutputBuffer(j, j2)) {
                }
                while (feedInputBuffer()) {
                }
                x5h.endSection();
                this.f101964D2.ensureUpdated();
            } catch (ql3 e) {
                xh9.m25145e("DecoderVideoRenderer", "Video codec error", e);
                this.f101967a2.videoCodecError(e);
                throw m1747a(e, this.f101970d2, 4003);
            }
        }
    }

    public final void setOutput(@hib Object obj) {
        if (obj instanceof Surface) {
            this.f101977k2 = (Surface) obj;
            this.f101978l2 = null;
            this.f101975i2 = 1;
        } else if (obj instanceof j6i) {
            this.f101977k2 = null;
            this.f101978l2 = (j6i) obj;
            this.f101975i2 = 0;
        } else {
            this.f101977k2 = null;
            this.f101978l2 = null;
            this.f101975i2 = -1;
            obj = null;
        }
        if (this.f101976j2 == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.f101976j2 = obj;
        if (obj == null) {
            onOutputRemoved();
            return;
        }
        if (this.f101972f2 != null) {
            m26175H(this.f101975i2);
        }
        onOutputChanged();
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: u */
    public void mo1767u() {
        this.f101992z2 = 0;
        this.f101991y2 = SystemClock.elapsedRealtime();
        this.f101963C2 = t0i.msToUs(SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: v */
    public void mo1768v() {
        this.f101986t2 = -9223372036854775807L;
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    public void mo1769w(C1213a[] c1213aArr, long j, long j2, una.C13612b c13612b) throws aa5 {
        super.mo1769w(c1213aArr, j, j2, c13612b);
    }
}
