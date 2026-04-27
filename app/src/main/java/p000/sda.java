package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.AbstractC1224c;
import androidx.media3.exoplayer.InterfaceC1254q;
import com.arthenica.ffmpegkit.StreamInformation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.ar4;
import p000.dda;
import p000.nea;
import p000.rl3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class sda extends AbstractC1224c {

    /* JADX INFO: renamed from: A3 */
    public static final int f81371A3 = 3;

    /* JADX INFO: renamed from: B3 */
    public static final int f81372B3 = 0;

    /* JADX INFO: renamed from: C3 */
    public static final int f81373C3 = 1;

    /* JADX INFO: renamed from: D3 */
    public static final int f81374D3 = 2;

    /* JADX INFO: renamed from: E3 */
    public static final byte[] f81375E3 = {0, 0, 1, 103, BuiltinOptions.SquareOptions, k95.f53214o7, 11, k95.f52879B7, 37, -112, 0, 0, 1, BuiltinOptions.BroadcastToOptions, k95.f53307z7, 15, 19, 32, 0, 0, 1, BuiltinOptions.BatchMatMulOptions, -120, -124, 13, k95.f53307z7, 113, 24, -96, 0, 47, -65, 28, 49, k95.f53238r7, 39, BuiltinOptions.WhileOptions, 120};

    /* JADX INFO: renamed from: F3 */
    public static final int f81376F3 = 32;

    /* JADX INFO: renamed from: o3 */
    public static final float f81377o3 = -1.0f;

    /* JADX INFO: renamed from: p3 */
    public static final String f81378p3 = "MediaCodecRenderer";

    /* JADX INFO: renamed from: q3 */
    public static final long f81379q3 = 1000;

    /* JADX INFO: renamed from: r3 */
    public static final int f81380r3 = 0;

    /* JADX INFO: renamed from: s3 */
    public static final int f81381s3 = 1;

    /* JADX INFO: renamed from: t3 */
    public static final int f81382t3 = 2;

    /* JADX INFO: renamed from: u3 */
    public static final int f81383u3 = 0;

    /* JADX INFO: renamed from: v3 */
    public static final int f81384v3 = 1;

    /* JADX INFO: renamed from: w3 */
    public static final int f81385w3 = 2;

    /* JADX INFO: renamed from: x3 */
    public static final int f81386x3 = 0;

    /* JADX INFO: renamed from: y3 */
    public static final int f81387y3 = 1;

    /* JADX INFO: renamed from: z3 */
    public static final int f81388z3 = 2;

    /* JADX INFO: renamed from: A2 */
    public int f81389A2;

    /* JADX INFO: renamed from: B2 */
    public boolean f81390B2;

    /* JADX INFO: renamed from: C2 */
    public boolean f81391C2;

    /* JADX INFO: renamed from: D2 */
    public boolean f81392D2;

    /* JADX INFO: renamed from: E2 */
    public boolean f81393E2;

    /* JADX INFO: renamed from: F2 */
    public boolean f81394F2;

    /* JADX INFO: renamed from: G2 */
    public boolean f81395G2;

    /* JADX INFO: renamed from: H2 */
    public long f81396H2;

    /* JADX INFO: renamed from: I2 */
    public boolean f81397I2;

    /* JADX INFO: renamed from: J2 */
    public long f81398J2;

    /* JADX INFO: renamed from: K2 */
    public int f81399K2;

    /* JADX INFO: renamed from: L2 */
    public int f81400L2;

    /* JADX INFO: renamed from: M2 */
    @hib
    public ByteBuffer f81401M2;

    /* JADX INFO: renamed from: N2 */
    public boolean f81402N2;

    /* JADX INFO: renamed from: O2 */
    public boolean f81403O2;

    /* JADX INFO: renamed from: P2 */
    public boolean f81404P2;

    /* JADX INFO: renamed from: Q2 */
    public boolean f81405Q2;

    /* JADX INFO: renamed from: R2 */
    public boolean f81406R2;

    /* JADX INFO: renamed from: S2 */
    public boolean f81407S2;

    /* JADX INFO: renamed from: T2 */
    public int f81408T2;

    /* JADX INFO: renamed from: U2 */
    public int f81409U2;

    /* JADX INFO: renamed from: V1 */
    public final dda.InterfaceC4752b f81410V1;

    /* JADX INFO: renamed from: V2 */
    public int f81411V2;

    /* JADX INFO: renamed from: W2 */
    public boolean f81412W2;

    /* JADX INFO: renamed from: X2 */
    public boolean f81413X2;

    /* JADX INFO: renamed from: Y2 */
    public boolean f81414Y2;

    /* JADX INFO: renamed from: Z1 */
    public final zda f81415Z1;

    /* JADX INFO: renamed from: Z2 */
    public long f81416Z2;

    /* JADX INFO: renamed from: a2 */
    public final boolean f81417a2;

    /* JADX INFO: renamed from: a3 */
    public long f81418a3;

    /* JADX INFO: renamed from: b2 */
    public final float f81419b2;

    /* JADX INFO: renamed from: b3 */
    public boolean f81420b3;

    /* JADX INFO: renamed from: c2 */
    public final rl3 f81421c2;

    /* JADX INFO: renamed from: c3 */
    public boolean f81422c3;

    /* JADX INFO: renamed from: d2 */
    public final rl3 f81423d2;

    /* JADX INFO: renamed from: d3 */
    public boolean f81424d3;

    /* JADX INFO: renamed from: e2 */
    public final rl3 f81425e2;

    /* JADX INFO: renamed from: e3 */
    public boolean f81426e3;

    /* JADX INFO: renamed from: f2 */
    public final nw0 f81427f2;

    /* JADX INFO: renamed from: f3 */
    @hib
    public aa5 f81428f3;

    /* JADX INFO: renamed from: g2 */
    public final MediaCodec.BufferInfo f81429g2;

    /* JADX INFO: renamed from: g3 */
    public ol3 f81430g3;

    /* JADX INFO: renamed from: h2 */
    public final ArrayDeque<C12536e> f81431h2;

    /* JADX INFO: renamed from: h3 */
    public C12536e f81432h3;

    /* JADX INFO: renamed from: i2 */
    public final xzb f81433i2;

    /* JADX INFO: renamed from: i3 */
    public long f81434i3;

    /* JADX INFO: renamed from: j2 */
    @hib
    public C1213a f81435j2;

    /* JADX INFO: renamed from: j3 */
    public boolean f81436j3;

    /* JADX INFO: renamed from: k2 */
    public C1213a f81437k2;

    /* JADX INFO: renamed from: k3 */
    public boolean f81438k3;

    /* JADX INFO: renamed from: l2 */
    @hib
    public ar4 f81439l2;

    /* JADX INFO: renamed from: l3 */
    public boolean f81440l3;

    /* JADX INFO: renamed from: m2 */
    @hib
    public ar4 f81441m2;

    /* JADX INFO: renamed from: m3 */
    public long f81442m3;

    /* JADX INFO: renamed from: n2 */
    public InterfaceC1254q.c f81443n2;

    /* JADX INFO: renamed from: n3 */
    public long f81444n3;

    /* JADX INFO: renamed from: o2 */
    @hib
    public MediaCrypto f81445o2;

    /* JADX INFO: renamed from: p2 */
    public long f81446p2;

    /* JADX INFO: renamed from: q2 */
    public float f81447q2;

    /* JADX INFO: renamed from: r2 */
    public float f81448r2;

    /* JADX INFO: renamed from: s2 */
    @hib
    public dda f81449s2;

    /* JADX INFO: renamed from: t2 */
    @hib
    public C1213a f81450t2;

    /* JADX INFO: renamed from: u2 */
    @hib
    public MediaFormat f81451u2;

    /* JADX INFO: renamed from: v2 */
    public boolean f81452v2;

    /* JADX INFO: renamed from: w2 */
    public float f81453w2;

    /* JADX INFO: renamed from: x2 */
    @hib
    public ArrayDeque<lda> f81454x2;

    /* JADX INFO: renamed from: y2 */
    @hib
    public C12534c f81455y2;

    /* JADX INFO: renamed from: z2 */
    @hib
    public lda f81456z2;

    /* JADX INFO: renamed from: sda$b */
    @c5e(31)
    public static final class C12533b {
        private C12533b() {
        }

        public static void setLogSessionIdToMediaCodecFormat(dda.C4751a c4751a, j0d j0dVar) {
            LogSessionId logSessionId = j0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            c4751a.f29421b.setString("log-session-id", logSessionId.getStringId());
        }
    }

    /* JADX INFO: renamed from: sda$d */
    public final class C12535d implements dda.InterfaceC4753c {
        private C12535d() {
        }

        @Override // p000.dda.InterfaceC4753c
        public void onInputBufferAvailable() {
            if (sda.this.f81443n2 != null) {
                sda.this.f81443n2.onWakeup();
            }
        }

        @Override // p000.dda.InterfaceC4753c
        public void onOutputBufferAvailable() {
            if (sda.this.f81443n2 != null) {
                sda.this.f81443n2.onWakeup();
            }
        }
    }

    /* JADX INFO: renamed from: sda$e */
    public static final class C12536e {

        /* JADX INFO: renamed from: e */
        public static final C12536e f81466e = new C12536e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a */
        public final long f81467a;

        /* JADX INFO: renamed from: b */
        public final long f81468b;

        /* JADX INFO: renamed from: c */
        public final long f81469c;

        /* JADX INFO: renamed from: d */
        public final m1h<C1213a> f81470d = new m1h<>();

        public C12536e(long j, long j2, long j3) {
            this.f81467a = j;
            this.f81468b = j2;
            this.f81469c = j3;
        }
    }

    public sda(int i, dda.InterfaceC4752b interfaceC4752b, zda zdaVar, boolean z, float f) {
        super(i);
        this.f81410V1 = interfaceC4752b;
        this.f81415Z1 = (zda) v80.checkNotNull(zdaVar);
        this.f81417a2 = z;
        this.f81419b2 = f;
        this.f81421c2 = rl3.newNoDataInstance();
        this.f81423d2 = new rl3(0);
        this.f81425e2 = new rl3(2);
        nw0 nw0Var = new nw0();
        this.f81427f2 = nw0Var;
        this.f81429g2 = new MediaCodec.BufferInfo();
        this.f81447q2 = 1.0f;
        this.f81448r2 = 1.0f;
        this.f81446p2 = -9223372036854775807L;
        this.f81431h2 = new ArrayDeque<>();
        this.f81432h3 = C12536e.f81466e;
        nw0Var.ensureSpaceForWrite(0);
        nw0Var.f78608d.order(ByteOrder.nativeOrder());
        this.f81433i2 = new xzb();
        this.f81453w2 = -1.0f;
        this.f81389A2 = 0;
        this.f81408T2 = 0;
        this.f81399K2 = -1;
        this.f81400L2 = -1;
        this.f81398J2 = -9223372036854775807L;
        this.f81416Z2 = -9223372036854775807L;
        this.f81418a3 = -9223372036854775807L;
        this.f81434i3 = -9223372036854775807L;
        this.f81396H2 = -9223372036854775807L;
        this.f81409U2 = 0;
        this.f81411V2 = 0;
        this.f81430g3 = new ol3();
        this.f81442m3 = -9223372036854775807L;
        this.f81444n3 = -9223372036854775807L;
    }

    private void bypassRead() throws aa5 {
        v80.checkState(!this.f81420b3);
        oq6 oq6VarM1751e = m1751e();
        this.f81425e2.clear();
        do {
            this.f81425e2.clear();
            int iM1771y = m1771y(oq6VarM1751e, this.f81425e2, 0);
            if (iM1771y == -5) {
                mo10832d0(oq6VarM1751e);
                return;
            }
            if (iM1771y == -4) {
                if (!this.f81425e2.isEndOfStream()) {
                    this.f81416Z2 = Math.max(this.f81416Z2, this.f81425e2.f78610f);
                    if (hasReadStreamToEnd() || this.f81423d2.isLastSample()) {
                        this.f81418a3 = this.f81416Z2;
                    }
                    if (this.f81424d3) {
                        C1213a c1213a = (C1213a) v80.checkNotNull(this.f81435j2);
                        this.f81437k2 = c1213a;
                        if (Objects.equals(c1213a.f8291o, "audio/opus") && !this.f81437k2.f8294r.isEmpty()) {
                            this.f81437k2 = this.f81437k2.buildUpon().setEncoderDelay(m7c.getPreSkipSamples(this.f81437k2.f8294r.get(0))).build();
                        }
                        mo10833e0(this.f81437k2, null);
                        this.f81424d3 = false;
                    }
                    this.f81425e2.flip();
                    C1213a c1213a2 = this.f81437k2;
                    if (c1213a2 != null && Objects.equals(c1213a2.f8291o, "audio/opus")) {
                        if (this.f81425e2.hasSupplementalData()) {
                            rl3 rl3Var = this.f81425e2;
                            rl3Var.f78606b = this.f81437k2;
                            mo10828U(rl3Var);
                        }
                        if (m7c.needToDecodeOpusFrame(m1753g(), this.f81425e2.f78610f)) {
                            this.f81433i2.packetize(this.f81425e2, this.f81437k2.f8294r);
                        }
                    }
                    if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                        break;
                    }
                } else {
                    this.f81420b3 = true;
                    this.f81418a3 = this.f81416Z2;
                    return;
                }
            } else {
                if (iM1771y != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    this.f81418a3 = this.f81416Z2;
                    return;
                }
                return;
            }
        } while (this.f81427f2.append(this.f81425e2));
        this.f81405Q2 = true;
    }

    private boolean bypassRender(long j, long j2) throws aa5 {
        boolean z;
        v80.checkState(!this.f81422c3);
        if (this.f81427f2.hasSamples()) {
            nw0 nw0Var = this.f81427f2;
            if (!mo10836i0(j, j2, null, nw0Var.f78608d, this.f81400L2, 0, nw0Var.getSampleCount(), this.f81427f2.getFirstSampleTimeUs(), isDecodeOnly(m1753g(), this.f81427f2.getLastSampleTimeUs()), this.f81427f2.isEndOfStream(), (C1213a) v80.checkNotNull(this.f81437k2))) {
                return false;
            }
            onProcessedOutputBuffer(this.f81427f2.getLastSampleTimeUs());
            this.f81427f2.clear();
            z = false;
        } else {
            z = false;
        }
        if (this.f81420b3) {
            this.f81422c3 = true;
            return z;
        }
        if (this.f81405Q2) {
            v80.checkState(this.f81427f2.append(this.f81425e2));
            this.f81405Q2 = z;
        }
        if (this.f81406R2) {
            if (this.f81427f2.hasSamples()) {
                return true;
            }
            disableBypass();
            this.f81406R2 = z;
            m21851Y();
            if (!this.f81404P2) {
                return z;
            }
        }
        bypassRead();
        if (this.f81427f2.hasSamples()) {
            this.f81427f2.flip();
        }
        if (this.f81427f2.hasSamples() || this.f81420b3 || this.f81406R2) {
            return true;
        }
        return z;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        return 0;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        return false;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return false;
    }

    private static boolean codecNeedsEosPropagationWorkaround(lda ldaVar) {
        String str = ldaVar.f57252a;
        return (Build.VERSION.SDK_INT <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && ldaVar.f57258g);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void disableBypass() {
        this.f81404P2 = false;
        resetBypassState();
    }

    private boolean drainAndFlushCodec() {
        if (this.f81412W2) {
            this.f81409U2 = 1;
            if (this.f81391C2) {
                this.f81411V2 = 3;
                return false;
            }
            this.f81411V2 = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws aa5 {
        if (!this.f81412W2) {
            reinitializeCodec();
        } else {
            this.f81409U2 = 1;
            this.f81411V2 = 3;
        }
    }

    @omg(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws aa5 {
        if (this.f81412W2) {
            this.f81409U2 = 1;
            if (this.f81391C2) {
                this.f81411V2 = 3;
                return false;
            }
            this.f81411V2 = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j, long j2) throws aa5 {
        boolean z;
        boolean z2;
        boolean zMo10836i0;
        int iDequeueOutputBufferIndex;
        dda ddaVar = (dda) v80.checkNotNull(this.f81449s2);
        if (!hasOutputBuffer()) {
            if (this.f81392D2 && this.f81413X2) {
                try {
                    iDequeueOutputBufferIndex = ddaVar.dequeueOutputBufferIndex(this.f81429g2);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.f81422c3) {
                        m21852j0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = ddaVar.dequeueOutputBufferIndex(this.f81429g2);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.f81395G2 && (this.f81420b3 || this.f81409U2 == 2)) {
                    processEndOfStream();
                }
                long j3 = this.f81396H2;
                if (j3 != -9223372036854775807L && j3 + 100 < m1749c().currentTimeMillis()) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.f81394F2) {
                this.f81394F2 = false;
                ddaVar.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f81429g2;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.f81400L2 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = ddaVar.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f81401M2 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f81429g2.offset);
                ByteBuffer byteBuffer = this.f81401M2;
                MediaCodec.BufferInfo bufferInfo2 = this.f81429g2;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            m21859z0(this.f81429g2.presentationTimeUs);
        }
        this.f81402N2 = this.f81429g2.presentationTimeUs < m1753g();
        long j4 = this.f81418a3;
        this.f81403O2 = j4 != -9223372036854775807L && j4 <= this.f81429g2.presentationTimeUs;
        if (this.f81440l3) {
            long j5 = this.f81442m3;
            if (j5 == -9223372036854775807L || this.f81429g2.presentationTimeUs > j5) {
                this.f81442m3 = this.f81429g2.presentationTimeUs;
                this.f81402N2 = true;
                this.f81403O2 = false;
            } else {
                this.f81440l3 = false;
                this.f81442m3 = -9223372036854775807L;
            }
        }
        if (this.f81392D2 && this.f81413X2) {
            try {
                ByteBuffer byteBuffer2 = this.f81401M2;
                int i = this.f81400L2;
                MediaCodec.BufferInfo bufferInfo3 = this.f81429g2;
                z = false;
                z2 = true;
                try {
                    zMo10836i0 = mo10836i0(j, j2, ddaVar, byteBuffer2, i, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f81402N2, this.f81403O2, (C1213a) v80.checkNotNull(this.f81437k2));
                } catch (IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.f81422c3) {
                        m21852j0();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            z2 = true;
            ByteBuffer byteBuffer3 = this.f81401M2;
            int i2 = this.f81400L2;
            MediaCodec.BufferInfo bufferInfo4 = this.f81429g2;
            zMo10836i0 = mo10836i0(j, j2, ddaVar, byteBuffer3, i2, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f81402N2, this.f81403O2, (C1213a) v80.checkNotNull(this.f81437k2));
        }
        if (zMo10836i0) {
            onProcessedOutputBuffer(this.f81429g2.presentationTimeUs);
            boolean z3 = (this.f81429g2.flags & 4) != 0 ? z2 : z;
            if (!z3 && this.f81413X2 && this.f81403O2) {
                this.f81396H2 = m1749c().currentTimeMillis();
            }
            resetOutputBuffer();
            if (!z3) {
                return z2;
            }
            processEndOfStream();
        }
        return z;
    }

    private boolean drmNeedsCodecReinitialization(lda ldaVar, C1213a c1213a, @hib ar4 ar4Var, @hib ar4 ar4Var2) throws aa5 {
        c93 cryptoConfig;
        c93 cryptoConfig2;
        if (ar4Var == ar4Var2) {
            return false;
        }
        if (ar4Var2 != null && ar4Var != null && (cryptoConfig = ar4Var2.getCryptoConfig()) != null && (cryptoConfig2 = ar4Var.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof sv6)) {
                return false;
            }
            if (!ar4Var2.getSchemeUuid().equals(ar4Var.getSchemeUuid())) {
                return true;
            }
            UUID uuid = jk1.f50933o2;
            if (!uuid.equals(ar4Var.getSchemeUuid()) && !uuid.equals(ar4Var2.getSchemeUuid())) {
                if (ldaVar.f57258g) {
                    return false;
                }
                return ar4Var2.getState() == 2 || ((ar4Var2.getState() == 3 || ar4Var2.getState() == 4) && ar4Var2.requiresSecureDecoder((String) v80.checkNotNull(c1213a.f8291o)));
            }
        }
        return true;
    }

    private boolean feedInputBuffer() throws aa5 {
        int i;
        if (this.f81449s2 == null || (i = this.f81409U2) == 2 || this.f81420b3) {
            return false;
        }
        if (i == 0 && m21856s0()) {
            drainAndReinitializeCodec();
        }
        dda ddaVar = (dda) v80.checkNotNull(this.f81449s2);
        if (this.f81399K2 < 0) {
            int iDequeueInputBufferIndex = ddaVar.dequeueInputBufferIndex();
            this.f81399K2 = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.f81423d2.f78608d = ddaVar.getInputBuffer(iDequeueInputBufferIndex);
            this.f81423d2.clear();
        }
        if (this.f81409U2 == 1) {
            if (!this.f81395G2) {
                this.f81413X2 = true;
                ddaVar.queueInputBuffer(this.f81399K2, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.f81409U2 = 2;
            return false;
        }
        if (this.f81393E2) {
            this.f81393E2 = false;
            ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(this.f81423d2.f78608d);
            byte[] bArr = f81375E3;
            byteBuffer.put(bArr);
            ddaVar.queueInputBuffer(this.f81399K2, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.f81412W2 = true;
            return true;
        }
        if (this.f81408T2 == 1) {
            for (int i2 = 0; i2 < ((C1213a) v80.checkNotNull(this.f81450t2)).f8294r.size(); i2++) {
                ((ByteBuffer) v80.checkNotNull(this.f81423d2.f78608d)).put(this.f81450t2.f8294r.get(i2));
            }
            this.f81408T2 = 2;
        }
        int iPosition = ((ByteBuffer) v80.checkNotNull(this.f81423d2.f78608d)).position();
        oq6 oq6VarM1751e = m1751e();
        try {
            int iM1771y = m1771y(oq6VarM1751e, this.f81423d2, 0);
            if (iM1771y == -3) {
                if (hasReadStreamToEnd()) {
                    this.f81418a3 = this.f81416Z2;
                }
                return false;
            }
            if (iM1771y == -5) {
                if (this.f81408T2 == 2) {
                    this.f81423d2.clear();
                    this.f81408T2 = 1;
                }
                mo10832d0(oq6VarM1751e);
                return true;
            }
            if (this.f81423d2.isEndOfStream()) {
                this.f81418a3 = this.f81416Z2;
                if (this.f81408T2 == 2) {
                    this.f81423d2.clear();
                    this.f81408T2 = 1;
                }
                this.f81420b3 = true;
                if (!this.f81412W2) {
                    processEndOfStream();
                    return false;
                }
                if (!this.f81395G2) {
                    this.f81413X2 = true;
                    ddaVar.queueInputBuffer(this.f81399K2, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            }
            if (!this.f81412W2 && !this.f81423d2.isKeyFrame()) {
                this.f81423d2.clear();
                if (this.f81408T2 == 2) {
                    this.f81408T2 = 1;
                }
                return true;
            }
            if (mo21228p0(this.f81423d2)) {
                return true;
            }
            boolean zIsEncrypted = this.f81423d2.isEncrypted();
            if (zIsEncrypted) {
                this.f81423d2.f78607c.increaseClearDataFirstSubSampleBy(iPosition);
            }
            long j = this.f81423d2.f78610f;
            if (this.f81424d3) {
                if (this.f81431h2.isEmpty()) {
                    this.f81432h3.f81470d.add(j, (C1213a) v80.checkNotNull(this.f81435j2));
                } else {
                    this.f81431h2.peekLast().f81470d.add(j, (C1213a) v80.checkNotNull(this.f81435j2));
                }
                this.f81424d3 = false;
            }
            this.f81416Z2 = Math.max(this.f81416Z2, j);
            if (hasReadStreamToEnd() || this.f81423d2.isLastSample()) {
                this.f81418a3 = this.f81416Z2;
            }
            this.f81423d2.flip();
            if (this.f81423d2.hasSupplementalData()) {
                mo10828U(this.f81423d2);
            }
            mo21225h0(this.f81423d2);
            int iMo21199F = mo21199F(this.f81423d2);
            if ((Build.VERSION.SDK_INT < 34 || (iMo21199F & 32) == 0) && !m1750d().f80390b) {
                this.f81444n3 = Math.max(this.f81444n3, this.f81423d2.f78610f);
            }
            if (zIsEncrypted) {
                ((dda) v80.checkNotNull(ddaVar)).queueSecureInputBuffer(this.f81399K2, 0, this.f81423d2.f78607c, j, iMo21199F);
            } else {
                ((dda) v80.checkNotNull(ddaVar)).queueInputBuffer(this.f81399K2, 0, ((ByteBuffer) v80.checkNotNull(this.f81423d2.f78608d)).limit(), j, iMo21199F);
            }
            resetInputBuffer();
            this.f81412W2 = true;
            this.f81408T2 = 0;
            this.f81430g3.f68018c++;
            return true;
        } catch (rl3.C12142b e) {
            mo10829a0(e);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    private void flushCodec() {
        try {
            ((dda) v80.checkStateNotNull(this.f81449s2)).flush();
        } finally {
            mo21227l0();
        }
    }

    private boolean flushOrReleaseCodec() {
        if (this.f81449s2 == null) {
            return false;
        }
        if (mo21231t0()) {
            m21852j0();
            return true;
        }
        if (mo21229q0()) {
            flushCodec();
        } else {
            onSkippedFlushCodec();
        }
        return false;
    }

    private List<lda> getAvailableCodecInfos(boolean z) throws nea.C9821c {
        C1213a c1213a = (C1213a) v80.checkNotNull(this.f81435j2);
        List<lda> listMo10825M = mo10825M(this.f81415Z1, c1213a, z);
        if (listMo10825M.isEmpty() && z) {
            listMo10825M = mo10825M(this.f81415Z1, c1213a, false);
            if (!listMo10825M.isEmpty()) {
                xh9.m25148w("MediaCodecRenderer", "Drm session requires secure decoder for " + c1213a.f8291o + ", but no secure decoder available. Trying to proceed with " + listMo10825M + ".");
            }
        }
        return listMo10825M;
    }

    private boolean hasOutputBuffer() {
        return this.f81400L2 >= 0;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.f81427f2.hasSamples()) {
            return true;
        }
        long jM1753g = m1753g();
        return isDecodeOnly(jM1753g, this.f81427f2.getLastSampleTimeUs()) == isDecodeOnly(jM1753g, this.f81425e2.f78610f);
    }

    private void initBypass(C1213a c1213a) {
        disableBypass();
        String str = c1213a.f8291o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f81427f2.setMaxSampleCount(32);
        } else {
            this.f81427f2.setMaxSampleCount(1);
        }
        this.f81404P2 = true;
    }

    private void initCodec(lda ldaVar, @hib MediaCrypto mediaCrypto) throws Exception {
        this.f81456z2 = ldaVar;
        C1213a c1213a = (C1213a) v80.checkNotNull(this.f81435j2);
        String str = ldaVar.f57252a;
        int i = Build.VERSION.SDK_INT;
        float fMo10824K = mo10824K(this.f81448r2, c1213a, m1756j());
        if (fMo10824K <= this.f81419b2) {
            fMo10824K = -1.0f;
        }
        long jElapsedRealtime = m1749c().elapsedRealtime();
        dda.C4751a c4751aMo10827P = mo10827P(ldaVar, c1213a, mediaCrypto, fMo10824K);
        if (i >= 31) {
            C12533b.setLogSessionIdToMediaCodecFormat(c4751aMo10827P, m1755i());
        }
        try {
            x5h.beginSection("createCodec:" + str);
            dda ddaVarCreateAdapter = this.f81410V1.createAdapter(c4751aMo10827P);
            this.f81449s2 = ddaVarCreateAdapter;
            this.f81397I2 = ddaVarCreateAdapter.registerOnBufferAvailableListener(new C12535d());
            x5h.endSection();
            long jElapsedRealtime2 = m1749c().elapsedRealtime();
            if (!ldaVar.isFormatSupported(c1213a)) {
                xh9.m25148w("MediaCodecRenderer", t0i.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", C1213a.toLogString(c1213a), str));
            }
            this.f81453w2 = fMo10824K;
            this.f81450t2 = c1213a;
            this.f81389A2 = codecAdaptationWorkaroundMode(str);
            this.f81390B2 = codecNeedsSosFlushWorkaround(str);
            this.f81391C2 = codecNeedsEosFlushWorkaround(str);
            this.f81392D2 = codecNeedsEosOutputExceptionWorkaround(str);
            this.f81395G2 = codecNeedsEosPropagationWorkaround(ldaVar) || mo21200I();
            if (((dda) v80.checkNotNull(this.f81449s2)).needsReconfiguration()) {
                this.f81407S2 = true;
                this.f81408T2 = 1;
                this.f81393E2 = this.f81389A2 != 0;
            }
            if (getState() == 2) {
                this.f81398J2 = m1749c().elapsedRealtime() + 1000;
            }
            this.f81430g3.f68016a++;
            mo10830b0(str, c4751aMo10827P, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            x5h.endSection();
            throw th;
        }
    }

    @g5e({"this.codecDrmSession"})
    private boolean initMediaCryptoIfDrmSessionReady() throws aa5 {
        v80.checkState(this.f81445o2 == null);
        ar4 ar4Var = this.f81439l2;
        c93 cryptoConfig = ar4Var.getCryptoConfig();
        if (sv6.f82948d && (cryptoConfig instanceof sv6)) {
            int state = ar4Var.getState();
            if (state == 1) {
                ar4.C1571a c1571a = (ar4.C1571a) v80.checkNotNull(ar4Var.getError());
                throw m1747a(c1571a, this.f81435j2, c1571a.f11651a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return ar4Var.getError() != null;
        }
        if (cryptoConfig instanceof sv6) {
            sv6 sv6Var = (sv6) cryptoConfig;
            try {
                this.f81445o2 = new MediaCrypto(sv6Var.f82949a, sv6Var.f82950b);
            } catch (MediaCryptoException e) {
                throw m1747a(e, this.f81435j2, 6006);
            }
        }
        return true;
    }

    private boolean isDecodeOnly(long j, long j2) {
        C1213a c1213a;
        return j2 < j && !((c1213a = this.f81437k2) != null && Objects.equals(c1213a.f8291o, "audio/opus") && m7c.needToDecodeOpusFrame(j, j2));
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void maybeInitCodecWithFallback(@hib MediaCrypto mediaCrypto, boolean z) throws aa5, C12534c {
        C1213a c1213a = (C1213a) v80.checkNotNull(this.f81435j2);
        if (this.f81454x2 == null) {
            try {
                List<lda> availableCodecInfos = getAvailableCodecInfos(z);
                ArrayDeque<lda> arrayDeque = new ArrayDeque<>();
                this.f81454x2 = arrayDeque;
                if (this.f81417a2) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.f81454x2.add(availableCodecInfos.get(0));
                }
                this.f81455y2 = null;
            } catch (nea.C9821c e) {
                throw new C12534c(c1213a, e, z, -49998);
            }
        }
        if (this.f81454x2.isEmpty()) {
            throw new C12534c(c1213a, (Throwable) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) v80.checkNotNull(this.f81454x2);
        while (this.f81449s2 == null) {
            lda ldaVar = (lda) v80.checkNotNull((lda) arrayDeque2.peekFirst());
            if (!mo21216Z(c1213a) || !mo21230r0(ldaVar)) {
                return;
            }
            try {
                initCodec(ldaVar, mediaCrypto);
            } catch (Exception e2) {
                xh9.m25149w("MediaCodecRenderer", "Failed to initialize decoder: " + ldaVar, e2);
                arrayDeque2.removeFirst();
                C12534c c12534c = new C12534c(c1213a, e2, z, ldaVar);
                mo10829a0(c12534c);
                if (this.f81455y2 == null) {
                    this.f81455y2 = c12534c;
                } else {
                    this.f81455y2 = this.f81455y2.copyWithFallbackException(c12534c);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f81455y2;
                }
            }
        }
        this.f81454x2 = null;
    }

    private void onSkippedFlushCodec() {
        if (this.f81444n3 != -9223372036854775807L) {
            long jM1753g = m1753g();
            long j = this.f81444n3;
            if (jM1753g > j || this.f81434i3 >= j) {
                return;
            }
            this.f81440l3 = true;
            this.f81444n3 = -9223372036854775807L;
        }
    }

    @omg(23)
    private void processEndOfStream() throws aa5 {
        int i = this.f81411V2;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.f81422c3 = true;
            mo10837k0();
        }
    }

    private void processOutputMediaFormatChanged() {
        this.f81414Y2 = true;
        MediaFormat outputFormat = ((dda) v80.checkNotNull(this.f81449s2)).getOutputFormat();
        if (this.f81389A2 != 0 && outputFormat.getInteger(StreamInformation.KEY_WIDTH) == 32 && outputFormat.getInteger(StreamInformation.KEY_HEIGHT) == 32) {
            this.f81394F2 = true;
        } else {
            this.f81451u2 = outputFormat;
            this.f81452v2 = true;
        }
    }

    private boolean readSourceOmittingSampleData(int i) throws aa5 {
        oq6 oq6VarM1751e = m1751e();
        this.f81421c2.clear();
        int iM1771y = m1771y(oq6VarM1751e, this.f81421c2, i | 4);
        if (iM1771y == -5) {
            mo10832d0(oq6VarM1751e);
            return true;
        }
        if (iM1771y != -4 || !this.f81421c2.isEndOfStream()) {
            return false;
        }
        this.f81420b3 = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() throws aa5 {
        m21852j0();
        m21851Y();
    }

    private void resetBypassState() {
        resetCommonStateForFlush();
        this.f81406R2 = false;
        this.f81427f2.clear();
        this.f81425e2.clear();
        this.f81405Q2 = false;
        this.f81433i2.reset();
    }

    private void resetCommonStateForFlush() {
        this.f81416Z2 = -9223372036854775807L;
        this.f81418a3 = -9223372036854775807L;
        this.f81434i3 = -9223372036854775807L;
    }

    private void resetInputBuffer() {
        this.f81399K2 = -1;
        this.f81423d2.f78608d = null;
    }

    private void resetOutputBuffer() {
        this.f81400L2 = -1;
        this.f81401M2 = null;
    }

    private void setCodecDrmSession(@hib ar4 ar4Var) {
        ar4.replaceSession(this.f81439l2, ar4Var);
        this.f81439l2 = ar4Var;
    }

    private void setOutputStreamInfo(C12536e c12536e) {
        this.f81432h3 = c12536e;
        long j = c12536e.f81469c;
        if (j != -9223372036854775807L) {
            this.f81436j3 = true;
            mo10834f0(j);
        }
    }

    private void setSourceDrmSession(@hib ar4 ar4Var) {
        ar4.replaceSession(this.f81441m2, ar4Var);
        this.f81441m2 = ar4Var;
    }

    private boolean shouldContinueRendering(long j) {
        return this.f81446p2 == -9223372036854775807L || m1749c().elapsedRealtime() - j < this.f81446p2;
    }

    private boolean updateCodecOperatingRate(@hib C1213a c1213a) throws aa5 {
        if (this.f81449s2 != null && this.f81411V2 != 3 && getState() != 0) {
            float fMo10824K = mo10824K(this.f81448r2, (C1213a) v80.checkNotNull(c1213a), m1756j());
            float f = this.f81453w2;
            if (f == fMo10824K) {
                return true;
            }
            if (fMo10824K == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f == -1.0f && fMo10824K <= this.f81419b2) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo10824K);
            ((dda) v80.checkNotNull(this.f81449s2)).setParameters(bundle);
            this.f81453w2 = fMo10824K;
        }
        return true;
    }

    @c5e(23)
    private void updateDrmSessionV23() throws aa5 {
        c93 cryptoConfig = ((ar4) v80.checkNotNull(this.f81441m2)).getCryptoConfig();
        if (cryptoConfig instanceof sv6) {
            try {
                ((MediaCrypto) v80.checkNotNull(this.f81445o2)).setMediaDrmSession(((sv6) cryptoConfig).f82950b);
            } catch (MediaCryptoException e) {
                throw m1747a(e, this.f81435j2, 6006);
            }
        }
        setCodecDrmSession(this.f81441m2);
        this.f81409U2 = 0;
        this.f81411V2 = 0;
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m21836x0(C1213a c1213a) {
        int i = c1213a.f8275P;
        return i == 0 || i == 2;
    }

    /* JADX INFO: renamed from: B */
    public vl3 mo10820B(lda ldaVar, C1213a c1213a, C1213a c1213a2) {
        return new vl3(ldaVar.f57252a, c1213a, c1213a2, 0, 1);
    }

    /* JADX INFO: renamed from: C */
    public jda mo21198C(Throwable th, @hib lda ldaVar) {
        return new jda(th, ldaVar);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m21837D() throws aa5 {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            m21851Y();
        }
        return zFlushOrReleaseCodec;
    }

    @hib
    /* JADX INFO: renamed from: E */
    public final dda m21838E() {
        return this.f81449s2;
    }

    /* JADX INFO: renamed from: F */
    public int mo21199F(rl3 rl3Var) {
        return 0;
    }

    @hib
    /* JADX INFO: renamed from: G */
    public final lda m21839G() {
        return this.f81456z2;
    }

    @hib
    /* JADX INFO: renamed from: H */
    public final C1213a m21840H() {
        return this.f81450t2;
    }

    /* JADX INFO: renamed from: I */
    public boolean mo21200I() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public float m21841J() {
        return this.f81453w2;
    }

    /* JADX INFO: renamed from: K */
    public float mo10824K(float f, C1213a c1213a, C1213a[] c1213aArr) {
        return -1.0f;
    }

    @hib
    /* JADX INFO: renamed from: L */
    public final MediaFormat m21842L() {
        return this.f81451u2;
    }

    /* JADX INFO: renamed from: M */
    public abstract List<lda> mo10825M(zda zdaVar, C1213a c1213a, boolean z) throws nea.C9821c;

    /* JADX INFO: renamed from: N */
    public long mo10826N(long j, long j2, boolean z) {
        return super.getDurationToProgressUs(j, j2);
    }

    /* JADX INFO: renamed from: O */
    public long m21843O() {
        return this.f81418a3;
    }

    /* JADX INFO: renamed from: P */
    public abstract dda.C4751a mo10827P(lda ldaVar, C1213a c1213a, @hib MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: Q */
    public final long m21844Q() {
        return this.f81432h3.f81469c;
    }

    /* JADX INFO: renamed from: R */
    public final long m21845R() {
        return this.f81432h3.f81468b;
    }

    /* JADX INFO: renamed from: S */
    public float m21846S() {
        return this.f81447q2;
    }

    @hib
    /* JADX INFO: renamed from: T */
    public final InterfaceC1254q.c m21847T() {
        return this.f81443n2;
    }

    /* JADX INFO: renamed from: U */
    public void mo10828U(rl3 rl3Var) throws aa5 {
    }

    /* JADX INFO: renamed from: V */
    public boolean m21848V() {
        return this.f81440l3;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m21849W() {
        return this.f81404P2;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m21850X(C1213a c1213a) {
        return this.f81441m2 == null && mo10838v0(c1213a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21851Y() throws p000.aa5 {
        /*
            r3 = this;
            dda r0 = r3.f81449s2
            if (r0 != 0) goto L6b
            boolean r0 = r3.f81404P2
            if (r0 != 0) goto L6b
            androidx.media3.common.a r0 = r3.f81435j2
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.m21850X(r0)
            if (r1 == 0) goto L17
            r3.initBypass(r0)
            return
        L17:
            ar4 r1 = r3.f81441m2
            r3.setCodecDrmSession(r1)
            ar4 r1 = r3.f81439l2
            if (r1 == 0) goto L26
            boolean r1 = r3.initMediaCryptoIfDrmSessionReady()
            if (r1 == 0) goto L55
        L26:
            ar4 r1 = r3.f81439l2     // Catch: p000.sda.C12534c -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: p000.sda.C12534c -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            ar4 r1 = r3.f81439l2     // Catch: p000.sda.C12534c -> L3b
            int r1 = r1.getState()     // Catch: p000.sda.C12534c -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            ar4 r1 = r3.f81439l2     // Catch: p000.sda.C12534c -> L3b
            java.lang.String r2 = r0.f8291o     // Catch: p000.sda.C12534c -> L3b
            java.lang.Object r2 = p000.v80.checkStateNotNull(r2)     // Catch: p000.sda.C12534c -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: p000.sda.C12534c -> L3b
            boolean r1 = r1.requiresSecureDecoder(r2)     // Catch: p000.sda.C12534c -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.f81445o2     // Catch: p000.sda.C12534c -> L3b
            r3.maybeInitCodecWithFallback(r2, r1)     // Catch: p000.sda.C12534c -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.f81445o2
            if (r0 == 0) goto L63
            dda r1 = r3.f81449s2
            if (r1 != 0) goto L63
            r0.release()
            r0 = 0
            r3.f81445o2 = r0
        L63:
            return
        L64:
            r2 = 4001(0xfa1, float:5.607E-42)
            aa5 r0 = r3.m1747a(r1, r0, r2)
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sda.m21851Y():void");
    }

    /* JADX INFO: renamed from: Z */
    public boolean mo21216Z(C1213a c1213a) throws aa5 {
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo10829a0(Exception exc) {
    }

    /* JADX INFO: renamed from: b0 */
    public void mo10830b0(String str, dda.C4751a c4751a, long j, long j2) {
    }

    /* JADX INFO: renamed from: c0 */
    public void mo10831c0(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    @p000.hib
    @p000.un1
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.vl3 mo10832d0(p000.oq6 r12) throws p000.aa5 {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sda.mo10832d0(oq6):vl3");
    }

    /* JADX INFO: renamed from: e0 */
    public void mo10833e0(C1213a c1213a, @hib MediaFormat mediaFormat) throws aa5 {
    }

    public void experimentalEnableProcessedStreamChangedAtStart() {
        this.f81438k3 = true;
    }

    /* JADX INFO: renamed from: f0 */
    public void mo10834f0(long j) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo10835g0() {
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public final long getDurationToProgressUs(long j, long j2) {
        return mo10826N(j, j2, this.f81397I2);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo21225h0(rl3 rl3Var) throws aa5 {
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i == 11) {
            this.f81443n2 = (InterfaceC1254q.c) v80.checkNotNull((InterfaceC1254q.c) obj);
        } else {
            super.handleMessage(i, obj);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public abstract boolean mo10836i0(long j, long j2, @hib dda ddaVar, @hib ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1213a c1213a) throws aa5;

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        return this.f81422c3;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        return this.f81435j2 != null && (m1759m() || hasOutputBuffer() || (this.f81398J2 != -9223372036854775807L && m1749c().elapsedRealtime() < this.f81398J2));
    }

    /* JADX INFO: renamed from: j0 */
    public void m21852j0() {
        try {
            dda ddaVar = this.f81449s2;
            if (ddaVar != null) {
                ddaVar.release();
                this.f81430g3.f68017b++;
                mo10831c0(((lda) v80.checkNotNull(this.f81456z2)).f57252a);
            }
            this.f81449s2 = null;
            try {
                MediaCrypto mediaCrypto = this.f81445o2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f81449s2 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f81445o2;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void mo10837k0() throws aa5 {
    }

    @un1
    /* JADX INFO: renamed from: l0 */
    public void mo21227l0() {
        resetInputBuffer();
        resetOutputBuffer();
        resetCommonStateForFlush();
        this.f81398J2 = -9223372036854775807L;
        this.f81413X2 = false;
        this.f81396H2 = -9223372036854775807L;
        this.f81412W2 = false;
        this.f81393E2 = false;
        this.f81394F2 = false;
        this.f81402N2 = false;
        this.f81403O2 = false;
        this.f81409U2 = 0;
        this.f81411V2 = 0;
        this.f81408T2 = this.f81407S2 ? 1 : 0;
        this.f81440l3 = false;
        this.f81442m3 = -9223372036854775807L;
        this.f81444n3 = -9223372036854775807L;
    }

    @un1
    /* JADX INFO: renamed from: m0 */
    public void m21853m0() {
        mo21227l0();
        this.f81428f3 = null;
        this.f81454x2 = null;
        this.f81456z2 = null;
        this.f81450t2 = null;
        this.f81451u2 = null;
        this.f81452v2 = false;
        this.f81414Y2 = false;
        this.f81453w2 = -1.0f;
        this.f81389A2 = 0;
        this.f81390B2 = false;
        this.f81391C2 = false;
        this.f81392D2 = false;
        this.f81395G2 = false;
        this.f81397I2 = false;
        this.f81407S2 = false;
        this.f81408T2 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f81435j2 = null;
        setOutputStreamInfo(C12536e.f81466e);
        this.f81431h2.clear();
        if (this.f81404P2) {
            disableBypass();
        } else {
            flushOrReleaseCodec();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m21854n0() {
        this.f81426e3 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: o */
    public void mo1761o(boolean z, boolean z2) throws aa5 {
        this.f81430g3 = new ol3();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m21855o0(aa5 aa5Var) {
        this.f81428f3 = aa5Var;
    }

    @un1
    public void onProcessedOutputBuffer(long j) {
        this.f81434i3 = j;
        while (!this.f81431h2.isEmpty() && j >= this.f81431h2.peek().f81467a) {
            setOutputStreamInfo((C12536e) v80.checkNotNull(this.f81431h2.poll()));
            mo10835g0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean mo21228p0(rl3 rl3Var) {
        if (!m21857u0(rl3Var)) {
            return false;
        }
        rl3Var.clear();
        this.f81430g3.f68019d++;
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) throws aa5 {
        this.f81420b3 = false;
        this.f81422c3 = false;
        this.f81426e3 = false;
        if (this.f81404P2) {
            resetBypassState();
        } else {
            m21837D();
        }
        if (this.f81432h3.f81470d.size() > 0) {
            this.f81424d3 = true;
        }
        this.f81432h3.f81470d.clear();
        this.f81431h2.clear();
    }

    /* JADX INFO: renamed from: q0 */
    public boolean mo21229q0() {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean mo21230r0(lda ldaVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void render(long j, long j2) throws aa5 {
        boolean z = false;
        if (this.f81426e3) {
            this.f81426e3 = false;
            processEndOfStream();
        }
        aa5 aa5Var = this.f81428f3;
        if (aa5Var != null) {
            this.f81428f3 = null;
            throw aa5Var;
        }
        try {
            if (this.f81422c3) {
                mo10837k0();
                return;
            }
            if (this.f81435j2 != null || readSourceOmittingSampleData(2)) {
                m21851Y();
                if (this.f81404P2) {
                    x5h.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    x5h.endSection();
                } else if (this.f81449s2 != null) {
                    long jElapsedRealtime = m1749c().elapsedRealtime();
                    x5h.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    x5h.endSection();
                } else {
                    this.f81430g3.f68019d += m1772z(j);
                    readSourceOmittingSampleData(1);
                }
                this.f81430g3.ensureUpdated();
            }
        } catch (MediaCodec.CryptoException e) {
            throw m1747a(e, this.f81435j2, t0i.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            if (!isMediaCodecException(e2)) {
                throw e2;
            }
            mo10829a0(e2);
            if ((e2 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                m21852j0();
            }
            jda jdaVarMo21198C = mo21198C(e2, m21839G());
            throw m1748b(jdaVarMo21198C, this.f81435j2, z, jdaVarMo21198C.f50355c == 1101 ? kyc.f55697u2 : 4003);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m21856s0() {
        return false;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void setPlaybackSpeed(float f, float f2) throws aa5 {
        this.f81447q2 = f;
        this.f81448r2 = f2;
        updateCodecOperatingRate(this.f81450t2);
    }

    public void setRenderTimeLimitMs(long j) {
        this.f81446p2 = j;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1255s
    public final int supportsFormat(C1213a c1213a) throws aa5 {
        try {
            return mo10839w0(this.f81415Z1, c1213a);
        } catch (nea.C9821c e) {
            throw m1747a(e, c1213a, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.InterfaceC1255s
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: t */
    public void mo1766t() {
        try {
            disableBypass();
            m21852j0();
        } finally {
            setSourceDrmSession(null);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean mo21231t0() {
        int i = this.f81411V2;
        if (i == 3 || ((this.f81390B2 && !this.f81414Y2) || (this.f81391C2 && this.f81413X2))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        v80.checkState(true);
        try {
            updateDrmSessionV23();
            return false;
        } catch (aa5 e) {
            xh9.m25149w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: u */
    public void mo1767u() {
    }

    /* JADX INFO: renamed from: u0 */
    public boolean m21857u0(rl3 rl3Var) {
        return false;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: v */
    public void mo1768v() {
    }

    /* JADX INFO: renamed from: v0 */
    public boolean mo10838v0(C1213a c1213a) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r5 >= r1) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1769w(androidx.media3.common.C1213a[] r13, long r14, long r16, p000.una.C13612b r18) throws p000.aa5 {
        /*
            r12 = this;
            r0 = r12
            sda$e r1 = r0.f81432h3
            long r1 = r1.f81469c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            sda$e r1 = new sda$e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r1)
            boolean r1 = r0.f81438k3
            if (r1 == 0) goto L6c
            r12.mo10835g0()
            goto L6c
        L27:
            java.util.ArrayDeque<sda$e> r1 = r0.f81431h2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5c
            long r1 = r0.f81416Z2
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3f
            long r5 = r0.f81434i3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L5c
        L3f:
            sda$e r1 = new sda$e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r1)
            sda$e r1 = r0.f81432h3
            long r1 = r1.f81469c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L6c
            r12.mo10835g0()
            goto L6c
        L5c:
            java.util.ArrayDeque<sda$e> r1 = r0.f81431h2
            sda$e r9 = new sda$e
            long r3 = r0.f81416Z2
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sda.mo1769w(androidx.media3.common.a[], long, long, una$b):void");
    }

    /* JADX INFO: renamed from: w0 */
    public abstract int mo10839w0(zda zdaVar, C1213a c1213a) throws nea.C9821c;

    /* JADX INFO: renamed from: y0 */
    public final boolean m21858y0() throws aa5 {
        return updateCodecOperatingRate(this.f81450t2);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m21859z0(long j) throws aa5 {
        C1213a c1213aPollFloor = this.f81432h3.f81470d.pollFloor(j);
        if (c1213aPollFloor == null && this.f81436j3 && this.f81451u2 != null) {
            c1213aPollFloor = this.f81432h3.f81470d.pollFirst();
        }
        if (c1213aPollFloor != null) {
            this.f81437k2 = c1213aPollFloor;
        } else if (!this.f81452v2 || this.f81437k2 == null) {
            return;
        }
        mo10833e0((C1213a) v80.checkNotNull(this.f81437k2), this.f81451u2);
        this.f81452v2 = false;
        this.f81436j3 = false;
    }

    /* JADX INFO: renamed from: sda$c */
    public static class C12534c extends Exception {

        /* JADX INFO: renamed from: C */
        public static final int f81457C = -49998;

        /* JADX INFO: renamed from: f */
        public static final int f81458f = -50000;

        /* JADX INFO: renamed from: m */
        public static final int f81459m = -49999;

        /* JADX INFO: renamed from: a */
        @hib
        public final String f81460a;

        /* JADX INFO: renamed from: b */
        public final boolean f81461b;

        /* JADX INFO: renamed from: c */
        @hib
        public final lda f81462c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f81463d;

        /* JADX INFO: renamed from: e */
        @hib
        public final C12534c f81464e;

        public C12534c(C1213a c1213a, @hib Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + c1213a, th, c1213a.f8291o, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @yx1
        public C12534c copyWithFallbackException(C12534c c12534c) {
            return new C12534c(getMessage(), getCause(), this.f81460a, this.f81461b, this.f81462c, this.f81463d, c12534c);
        }

        public C12534c(C1213a c1213a, @hib Throwable th, boolean z, lda ldaVar) {
            this("Decoder init failed: " + ldaVar.f57252a + ", " + c1213a, th, c1213a.f8291o, z, ldaVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private C12534c(@hib String str, @hib Throwable th, @hib String str2, boolean z, @hib lda ldaVar, @hib String str3, @hib C12534c c12534c) {
            super(str, th);
            this.f81460a = str2;
            this.f81461b = z;
            this.f81462c = ldaVar;
            this.f81463d = str3;
            this.f81464e = c12534c;
        }
    }
}
