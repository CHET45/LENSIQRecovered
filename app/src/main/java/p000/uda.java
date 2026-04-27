package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.exoplayer2.drm.InterfaceC3004d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.eda;
import p000.oea;
import p000.sl3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class uda extends bu0 {

    /* JADX INFO: renamed from: A3 */
    public static final int f87655A3 = 2;

    /* JADX INFO: renamed from: B3 */
    public static final byte[] f87656B3 = {0, 0, 1, 103, BuiltinOptions.SquareOptions, k95.f53214o7, 11, k95.f52879B7, 37, -112, 0, 0, 1, BuiltinOptions.BroadcastToOptions, k95.f53307z7, 15, 19, 32, 0, 0, 1, BuiltinOptions.BatchMatMulOptions, -120, -124, 13, k95.f53307z7, 113, 24, -96, 0, 47, -65, 28, 49, k95.f53238r7, 39, BuiltinOptions.WhileOptions, 120};

    /* JADX INFO: renamed from: C3 */
    public static final int f87657C3 = 32;

    /* JADX INFO: renamed from: l3 */
    public static final float f87658l3 = -1.0f;

    /* JADX INFO: renamed from: m3 */
    public static final String f87659m3 = "MediaCodecRenderer";

    /* JADX INFO: renamed from: n3 */
    public static final long f87660n3 = 1000;

    /* JADX INFO: renamed from: o3 */
    public static final int f87661o3 = 0;

    /* JADX INFO: renamed from: p3 */
    public static final int f87662p3 = 1;

    /* JADX INFO: renamed from: q3 */
    public static final int f87663q3 = 2;

    /* JADX INFO: renamed from: r3 */
    public static final int f87664r3 = 0;

    /* JADX INFO: renamed from: s3 */
    public static final int f87665s3 = 1;

    /* JADX INFO: renamed from: t3 */
    public static final int f87666t3 = 2;

    /* JADX INFO: renamed from: u3 */
    public static final int f87667u3 = 0;

    /* JADX INFO: renamed from: v3 */
    public static final int f87668v3 = 1;

    /* JADX INFO: renamed from: w3 */
    public static final int f87669w3 = 2;

    /* JADX INFO: renamed from: x3 */
    public static final int f87670x3 = 3;

    /* JADX INFO: renamed from: y3 */
    public static final int f87671y3 = 0;

    /* JADX INFO: renamed from: z3 */
    public static final int f87672z3 = 1;

    /* JADX INFO: renamed from: A2 */
    public boolean f87673A2;

    /* JADX INFO: renamed from: B2 */
    public boolean f87674B2;

    /* JADX INFO: renamed from: C2 */
    public boolean f87675C2;

    /* JADX INFO: renamed from: D2 */
    public boolean f87676D2;

    /* JADX INFO: renamed from: E2 */
    public boolean f87677E2;

    /* JADX INFO: renamed from: F2 */
    public boolean f87678F2;

    /* JADX INFO: renamed from: G2 */
    public boolean f87679G2;

    /* JADX INFO: renamed from: H2 */
    public boolean f87680H2;

    /* JADX INFO: renamed from: I2 */
    public boolean f87681I2;

    /* JADX INFO: renamed from: J2 */
    @hib
    public mk1 f87682J2;

    /* JADX INFO: renamed from: K2 */
    public long f87683K2;

    /* JADX INFO: renamed from: L2 */
    public int f87684L2;

    /* JADX INFO: renamed from: M1 */
    public final boolean f87685M1;

    /* JADX INFO: renamed from: M2 */
    public int f87686M2;

    /* JADX INFO: renamed from: N2 */
    @hib
    public ByteBuffer f87687N2;

    /* JADX INFO: renamed from: O2 */
    public boolean f87688O2;

    /* JADX INFO: renamed from: P2 */
    public boolean f87689P2;

    /* JADX INFO: renamed from: Q2 */
    public boolean f87690Q2;

    /* JADX INFO: renamed from: R2 */
    public boolean f87691R2;

    /* JADX INFO: renamed from: S2 */
    public boolean f87692S2;

    /* JADX INFO: renamed from: T2 */
    public boolean f87693T2;

    /* JADX INFO: renamed from: U2 */
    public int f87694U2;

    /* JADX INFO: renamed from: V1 */
    public final float f87695V1;

    /* JADX INFO: renamed from: V2 */
    public int f87696V2;

    /* JADX INFO: renamed from: W2 */
    public int f87697W2;

    /* JADX INFO: renamed from: X2 */
    public boolean f87698X2;

    /* JADX INFO: renamed from: Y */
    public final eda.InterfaceC5266b f87699Y;

    /* JADX INFO: renamed from: Y2 */
    public boolean f87700Y2;

    /* JADX INFO: renamed from: Z */
    public final yda f87701Z;

    /* JADX INFO: renamed from: Z1 */
    public final sl3 f87702Z1;

    /* JADX INFO: renamed from: Z2 */
    public boolean f87703Z2;

    /* JADX INFO: renamed from: a2 */
    public final sl3 f87704a2;

    /* JADX INFO: renamed from: a3 */
    public long f87705a3;

    /* JADX INFO: renamed from: b2 */
    public final sl3 f87706b2;

    /* JADX INFO: renamed from: b3 */
    public long f87707b3;

    /* JADX INFO: renamed from: c2 */
    public final mw0 f87708c2;

    /* JADX INFO: renamed from: c3 */
    public boolean f87709c3;

    /* JADX INFO: renamed from: d2 */
    public final ArrayList<Long> f87710d2;

    /* JADX INFO: renamed from: d3 */
    public boolean f87711d3;

    /* JADX INFO: renamed from: e2 */
    public final MediaCodec.BufferInfo f87712e2;

    /* JADX INFO: renamed from: e3 */
    public boolean f87713e3;

    /* JADX INFO: renamed from: f2 */
    public final ArrayDeque<C13510c> f87714f2;

    /* JADX INFO: renamed from: f3 */
    public boolean f87715f3;

    /* JADX INFO: renamed from: g2 */
    public final wzb f87716g2;

    /* JADX INFO: renamed from: g3 */
    @hib
    public ba5 f87717g3;

    /* JADX INFO: renamed from: h2 */
    @hib
    public kq6 f87718h2;

    /* JADX INFO: renamed from: h3 */
    public nl3 f87719h3;

    /* JADX INFO: renamed from: i2 */
    @hib
    public kq6 f87720i2;

    /* JADX INFO: renamed from: i3 */
    public C13510c f87721i3;

    /* JADX INFO: renamed from: j2 */
    @hib
    public InterfaceC3004d f87722j2;

    /* JADX INFO: renamed from: j3 */
    public long f87723j3;

    /* JADX INFO: renamed from: k2 */
    @hib
    public InterfaceC3004d f87724k2;

    /* JADX INFO: renamed from: k3 */
    public boolean f87725k3;

    /* JADX INFO: renamed from: l2 */
    @hib
    public MediaCrypto f87726l2;

    /* JADX INFO: renamed from: m2 */
    public boolean f87727m2;

    /* JADX INFO: renamed from: n2 */
    public long f87728n2;

    /* JADX INFO: renamed from: o2 */
    public float f87729o2;

    /* JADX INFO: renamed from: p2 */
    public float f87730p2;

    /* JADX INFO: renamed from: q2 */
    @hib
    public eda f87731q2;

    /* JADX INFO: renamed from: r2 */
    @hib
    public kq6 f87732r2;

    /* JADX INFO: renamed from: s2 */
    @hib
    public MediaFormat f87733s2;

    /* JADX INFO: renamed from: t2 */
    public boolean f87734t2;

    /* JADX INFO: renamed from: u2 */
    public float f87735u2;

    /* JADX INFO: renamed from: v2 */
    @hib
    public ArrayDeque<kda> f87736v2;

    /* JADX INFO: renamed from: w2 */
    @hib
    public C13509b f87737w2;

    /* JADX INFO: renamed from: x2 */
    @hib
    public kda f87738x2;

    /* JADX INFO: renamed from: y2 */
    public int f87739y2;

    /* JADX INFO: renamed from: z2 */
    public boolean f87740z2;

    /* JADX INFO: renamed from: uda$a */
    @c5e(31)
    public static final class C13508a {
        private C13508a() {
        }

        @ih4
        public static void setLogSessionIdToMediaCodecFormat(eda.C5265a c5265a, k0d k0dVar) {
            LogSessionId logSessionId = k0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            c5265a.f32701b.setString("log-session-id", logSessionId.getStringId());
        }
    }

    /* JADX INFO: renamed from: uda$c */
    public static final class C13510c {

        /* JADX INFO: renamed from: e */
        public static final C13510c f87749e = new C13510c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a */
        public final long f87750a;

        /* JADX INFO: renamed from: b */
        public final long f87751b;

        /* JADX INFO: renamed from: c */
        public final long f87752c;

        /* JADX INFO: renamed from: d */
        public final l1h<kq6> f87753d = new l1h<>();

        public C13510c(long j, long j2, long j3) {
            this.f87750a = j;
            this.f87751b = j2;
            this.f87752c = j3;
        }
    }

    public uda(int i, eda.InterfaceC5266b interfaceC5266b, yda ydaVar, boolean z, float f) {
        super(i);
        this.f87699Y = interfaceC5266b;
        this.f87701Z = (yda) u80.checkNotNull(ydaVar);
        this.f87685M1 = z;
        this.f87695V1 = f;
        this.f87702Z1 = sl3.newNoDataInstance();
        this.f87704a2 = new sl3(0);
        this.f87706b2 = new sl3(2);
        mw0 mw0Var = new mw0();
        this.f87708c2 = mw0Var;
        this.f87710d2 = new ArrayList<>();
        this.f87712e2 = new MediaCodec.BufferInfo();
        this.f87729o2 = 1.0f;
        this.f87730p2 = 1.0f;
        this.f87728n2 = -9223372036854775807L;
        this.f87714f2 = new ArrayDeque<>();
        setOutputStreamInfo(C13510c.f87749e);
        mw0Var.ensureSpaceForWrite(0);
        mw0Var.f82162d.order(ByteOrder.nativeOrder());
        this.f87716g2 = new wzb();
        this.f87735u2 = -1.0f;
        this.f87739y2 = 0;
        this.f87694U2 = 0;
        this.f87684L2 = -1;
        this.f87686M2 = -1;
        this.f87683K2 = -9223372036854775807L;
        this.f87705a3 = -9223372036854775807L;
        this.f87707b3 = -9223372036854775807L;
        this.f87723j3 = -9223372036854775807L;
        this.f87696V2 = 0;
        this.f87697W2 = 0;
    }

    private void bypassRead() throws ba5 {
        String str;
        u80.checkState(!this.f87709c3);
        nq6 nq6VarM3406d = m3406d();
        this.f87706b2.clear();
        do {
            this.f87706b2.clear();
            int iM3421s = m3421s(nq6VarM3406d, this.f87706b2, 0);
            if (iM3421s == -5) {
                mo11633O(nq6VarM3406d);
                return;
            }
            if (iM3421s != -4) {
                if (iM3421s != -3) {
                    throw new IllegalStateException();
                }
                return;
            }
            if (this.f87706b2.isEndOfStream()) {
                this.f87709c3 = true;
                return;
            }
            if (this.f87713e3) {
                kq6 kq6Var = (kq6) u80.checkNotNull(this.f87718h2);
                this.f87720i2 = kq6Var;
                mo11634P(kq6Var, null);
                this.f87713e3 = false;
            }
            this.f87706b2.flip();
            kq6 kq6Var2 = this.f87718h2;
            if (kq6Var2 != null && (str = kq6Var2.f54989M) != null && str.equals("audio/opus")) {
                this.f87716g2.packetize(this.f87706b2, this.f87718h2.f54992Q);
            }
        } while (this.f87708c2.append(this.f87706b2));
        this.f87691R2 = true;
    }

    private boolean bypassRender(long j, long j2) throws ba5 {
        boolean z;
        u80.checkState(!this.f87711d3);
        if (this.f87708c2.hasSamples()) {
            mw0 mw0Var = this.f87708c2;
            if (!mo11638V(j, j2, null, mw0Var.f82162d, this.f87686M2, 0, mw0Var.getSampleCount(), this.f87708c2.getFirstSampleTimeUs(), this.f87708c2.isDecodeOnly(), this.f87708c2.isEndOfStream(), this.f87720i2)) {
                return false;
            }
            mo21895R(this.f87708c2.getLastSampleTimeUs());
            this.f87708c2.clear();
            z = false;
        } else {
            z = false;
        }
        if (this.f87709c3) {
            this.f87711d3 = true;
            return z;
        }
        if (this.f87691R2) {
            u80.checkState(this.f87708c2.append(this.f87706b2));
            this.f87691R2 = z;
        }
        if (this.f87692S2) {
            if (this.f87708c2.hasSamples()) {
                return true;
            }
            disableBypass();
            this.f87692S2 = z;
            m23262K();
            if (!this.f87690Q2) {
                return z;
            }
        }
        bypassRead();
        if (this.f87708c2.hasSamples()) {
            this.f87708c2.flip();
        }
        if (this.f87708c2.hasSamples() || this.f87709c3 || this.f87692S2) {
            return true;
        }
        return z;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i = x0i.f95978a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = x0i.f95981d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = x0i.f95979b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, kq6 kq6Var) {
        return x0i.f95978a < 21 && kq6Var.f54992Q.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String str) {
        if (x0i.f95978a < 21 && "OMX.SEC.mp3.dec".equals(str) && as9.f11748b.equals(x0i.f95980c)) {
            String str2 = x0i.f95979b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        int i = x0i.f95978a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = x0i.f95979b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return x0i.f95978a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(kda kdaVar) {
        String str = kdaVar.f53649a;
        int i = x0i.f95978a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(x0i.f95980c) && "AFTS".equals(x0i.f95981d) && kdaVar.f53655g));
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i = x0i.f95978a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && x0i.f95981d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, kq6 kq6Var) {
        return x0i.f95978a <= 18 && kq6Var.f55007e2 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return x0i.f95978a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void disableBypass() {
        this.f87692S2 = false;
        this.f87708c2.clear();
        this.f87706b2.clear();
        this.f87691R2 = false;
        this.f87690Q2 = false;
        this.f87716g2.reset();
    }

    private boolean drainAndFlushCodec() {
        if (this.f87698X2) {
            this.f87696V2 = 1;
            if (this.f87673A2 || this.f87675C2) {
                this.f87697W2 = 3;
                return false;
            }
            this.f87697W2 = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws ba5 {
        if (!this.f87698X2) {
            reinitializeCodec();
        } else {
            this.f87696V2 = 1;
            this.f87697W2 = 3;
        }
    }

    @omg(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws ba5 {
        if (this.f87698X2) {
            this.f87696V2 = 1;
            if (this.f87673A2 || this.f87675C2) {
                this.f87697W2 = 3;
                return false;
            }
            this.f87697W2 = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j, long j2) throws ba5 {
        boolean z;
        boolean zMo11638V;
        int iDequeueOutputBufferIndex;
        if (!hasOutputBuffer()) {
            if (this.f87676D2 && this.f87700Y2) {
                try {
                    iDequeueOutputBufferIndex = this.f87731q2.dequeueOutputBufferIndex(this.f87712e2);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.f87711d3) {
                        m23263W();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = this.f87731q2.dequeueOutputBufferIndex(this.f87712e2);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.f87681I2 && (this.f87709c3 || this.f87696V2 == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.f87680H2) {
                this.f87680H2 = false;
                this.f87731q2.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f87712e2;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.f87686M2 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.f87731q2.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f87687N2 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f87712e2.offset);
                ByteBuffer byteBuffer = this.f87687N2;
                MediaCodec.BufferInfo bufferInfo2 = this.f87712e2;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f87677E2) {
                MediaCodec.BufferInfo bufferInfo3 = this.f87712e2;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j3 = this.f87705a3;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j3;
                    }
                }
            }
            this.f87688O2 = isDecodeOnlyBuffer(this.f87712e2.presentationTimeUs);
            long j4 = this.f87707b3;
            long j5 = this.f87712e2.presentationTimeUs;
            this.f87689P2 = j4 == j5;
            m23269i0(j5);
        }
        if (this.f87676D2 && this.f87700Y2) {
            try {
                eda edaVar = this.f87731q2;
                ByteBuffer byteBuffer2 = this.f87687N2;
                int i = this.f87686M2;
                MediaCodec.BufferInfo bufferInfo4 = this.f87712e2;
                z = false;
                try {
                    zMo11638V = mo11638V(j, j2, edaVar, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f87688O2, this.f87689P2, this.f87720i2);
                } catch (IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.f87711d3) {
                        m23263W();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            eda edaVar2 = this.f87731q2;
            ByteBuffer byteBuffer3 = this.f87687N2;
            int i2 = this.f87686M2;
            MediaCodec.BufferInfo bufferInfo5 = this.f87712e2;
            zMo11638V = mo11638V(j, j2, edaVar2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f87688O2, this.f87689P2, this.f87720i2);
        }
        if (zMo11638V) {
            mo21895R(this.f87712e2.presentationTimeUs);
            boolean z2 = (this.f87712e2.flags & 4) != 0 ? true : z;
            resetOutputBuffer();
            if (!z2) {
                return true;
            }
            processEndOfStream();
        }
        return z;
    }

    private boolean drmNeedsCodecReinitialization(kda kdaVar, kq6 kq6Var, @hib InterfaceC3004d interfaceC3004d, @hib InterfaceC3004d interfaceC3004d2) throws ba5 {
        b93 cryptoConfig;
        b93 cryptoConfig2;
        if (interfaceC3004d == interfaceC3004d2) {
            return false;
        }
        if (interfaceC3004d2 != null && interfaceC3004d != null && (cryptoConfig = interfaceC3004d2.getCryptoConfig()) != null && (cryptoConfig2 = interfaceC3004d.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof rv6)) {
                return false;
            }
            rv6 rv6Var = (rv6) cryptoConfig;
            if (!interfaceC3004d2.getSchemeUuid().equals(interfaceC3004d.getSchemeUuid()) || x0i.f95978a < 23) {
                return true;
            }
            UUID uuid = kk1.f54466h2;
            if (!uuid.equals(interfaceC3004d.getSchemeUuid()) && !uuid.equals(interfaceC3004d2.getSchemeUuid())) {
                return !kdaVar.f53655g && (rv6Var.f79738c ? false : interfaceC3004d2.requiresSecureDecoder(kq6Var.f54989M));
            }
        }
        return true;
    }

    private boolean feedInputBuffer() throws ba5 {
        int i;
        if (this.f87731q2 == null || (i = this.f87696V2) == 2 || this.f87709c3) {
            return false;
        }
        if (i == 0 && m23267d0()) {
            drainAndReinitializeCodec();
        }
        if (this.f87684L2 < 0) {
            int iDequeueInputBufferIndex = this.f87731q2.dequeueInputBufferIndex();
            this.f87684L2 = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.f87704a2.f82162d = this.f87731q2.getInputBuffer(iDequeueInputBufferIndex);
            this.f87704a2.clear();
        }
        if (this.f87696V2 == 1) {
            if (!this.f87681I2) {
                this.f87700Y2 = true;
                this.f87731q2.queueInputBuffer(this.f87684L2, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.f87696V2 = 2;
            return false;
        }
        if (this.f87679G2) {
            this.f87679G2 = false;
            ByteBuffer byteBuffer = this.f87704a2.f82162d;
            byte[] bArr = f87656B3;
            byteBuffer.put(bArr);
            this.f87731q2.queueInputBuffer(this.f87684L2, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.f87698X2 = true;
            return true;
        }
        if (this.f87694U2 == 1) {
            for (int i2 = 0; i2 < this.f87732r2.f54992Q.size(); i2++) {
                this.f87704a2.f82162d.put(this.f87732r2.f54992Q.get(i2));
            }
            this.f87694U2 = 2;
        }
        int iPosition = this.f87704a2.f82162d.position();
        nq6 nq6VarM3406d = m3406d();
        try {
            int iM3421s = m3421s(nq6VarM3406d, this.f87704a2, 0);
            if (hasReadStreamToEnd() || this.f87704a2.isLastSample()) {
                this.f87707b3 = this.f87705a3;
            }
            if (iM3421s == -3) {
                return false;
            }
            if (iM3421s == -5) {
                if (this.f87694U2 == 2) {
                    this.f87704a2.clear();
                    this.f87694U2 = 1;
                }
                mo11633O(nq6VarM3406d);
                return true;
            }
            if (this.f87704a2.isEndOfStream()) {
                if (this.f87694U2 == 2) {
                    this.f87704a2.clear();
                    this.f87694U2 = 1;
                }
                this.f87709c3 = true;
                if (!this.f87698X2) {
                    processEndOfStream();
                    return false;
                }
                try {
                    if (!this.f87681I2) {
                        this.f87700Y2 = true;
                        this.f87731q2.queueInputBuffer(this.f87684L2, 0, 0, 0L, 4);
                        resetInputBuffer();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m3403a(e, this.f87718h2, x0i.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                }
            }
            if (!this.f87698X2 && !this.f87704a2.isKeyFrame()) {
                this.f87704a2.clear();
                if (this.f87694U2 == 2) {
                    this.f87694U2 = 1;
                }
                return true;
            }
            boolean zIsEncrypted = this.f87704a2.isEncrypted();
            if (zIsEncrypted) {
                this.f87704a2.f82161c.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.f87740z2 && !zIsEncrypted) {
                o8b.discardToSps(this.f87704a2.f82162d);
                if (this.f87704a2.f82162d.position() == 0) {
                    return true;
                }
                this.f87740z2 = false;
            }
            sl3 sl3Var = this.f87704a2;
            long jUpdateAndGetPresentationTimeUs = sl3Var.f82164f;
            mk1 mk1Var = this.f87682J2;
            if (mk1Var != null) {
                jUpdateAndGetPresentationTimeUs = mk1Var.updateAndGetPresentationTimeUs(this.f87718h2, sl3Var);
                this.f87705a3 = Math.max(this.f87705a3, this.f87682J2.getLastOutputBufferPresentationTimeUs(this.f87718h2));
            }
            long j = jUpdateAndGetPresentationTimeUs;
            if (this.f87704a2.isDecodeOnly()) {
                this.f87710d2.add(Long.valueOf(j));
            }
            if (this.f87713e3) {
                if (this.f87714f2.isEmpty()) {
                    this.f87721i3.f87753d.add(j, this.f87718h2);
                } else {
                    this.f87714f2.peekLast().f87753d.add(j, this.f87718h2);
                }
                this.f87713e3 = false;
            }
            this.f87705a3 = Math.max(this.f87705a3, j);
            this.f87704a2.flip();
            if (this.f87704a2.hasSupplementalData()) {
                mo21887I(this.f87704a2);
            }
            mo11637T(this.f87704a2);
            try {
                if (zIsEncrypted) {
                    this.f87731q2.queueSecureInputBuffer(this.f87684L2, 0, this.f87704a2.f82161c, j, 0);
                } else {
                    this.f87731q2.queueInputBuffer(this.f87684L2, 0, this.f87704a2.f82162d.limit(), j, 0);
                }
                resetInputBuffer();
                this.f87698X2 = true;
                this.f87694U2 = 0;
                this.f87719h3.f64830c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw m3403a(e2, this.f87718h2, x0i.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
            }
        } catch (sl3.C12646b e3) {
            mo11630L(e3);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    private void flushCodec() {
        try {
            this.f87731q2.flush();
        } finally {
            mo21897Y();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m23256g0(kq6 kq6Var) {
        int i = kq6Var.f55017m2;
        return i == 0 || i == 2;
    }

    private List<kda> getAvailableCodecInfos(boolean z) throws oea.C10346c {
        List<kda> listMo11628E = mo11628E(this.f87701Z, this.f87718h2, z);
        if (listMo11628E.isEmpty() && z) {
            listMo11628E = mo11628E(this.f87701Z, this.f87718h2, false);
            if (!listMo11628E.isEmpty()) {
                yh9.m25919w("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f87718h2.f54989M + ", but no secure decoder available. Trying to proceed with " + listMo11628E + ".");
            }
        }
        return listMo11628E;
    }

    private boolean hasOutputBuffer() {
        return this.f87686M2 >= 0;
    }

    private void initBypass(kq6 kq6Var) {
        disableBypass();
        String str = kq6Var.f54989M;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f87708c2.setMaxSampleCount(32);
        } else {
            this.f87708c2.setMaxSampleCount(1);
        }
        this.f87690Q2 = true;
    }

    private void initCodec(kda kdaVar, @hib MediaCrypto mediaCrypto) throws Exception {
        String str = kdaVar.f53649a;
        int i = x0i.f95978a;
        float fMo11627C = i < 23 ? -1.0f : mo11627C(this.f87730p2, this.f87718h2, m3410h());
        float f = fMo11627C > this.f87695V1 ? fMo11627C : -1.0f;
        mo21896U(this.f87718h2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        eda.C5265a c5265aMo11629F = mo11629F(kdaVar, this.f87718h2, mediaCrypto, f);
        if (i >= 31) {
            C13508a.setLogSessionIdToMediaCodecFormat(c5265aMo11629F, m3409g());
        }
        try {
            w5h.beginSection("createCodec:" + str);
            this.f87731q2 = this.f87699Y.createAdapter(c5265aMo11629F);
            w5h.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!kdaVar.isFormatSupported(this.f87718h2)) {
                yh9.m25919w("MediaCodecRenderer", x0i.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", kq6.toLogString(this.f87718h2), str));
            }
            this.f87738x2 = kdaVar;
            this.f87735u2 = f;
            this.f87732r2 = this.f87718h2;
            this.f87739y2 = codecAdaptationWorkaroundMode(str);
            this.f87740z2 = codecNeedsDiscardToSpsWorkaround(str, this.f87732r2);
            this.f87673A2 = codecNeedsFlushWorkaround(str);
            this.f87674B2 = codecNeedsSosFlushWorkaround(str);
            this.f87675C2 = codecNeedsEosFlushWorkaround(str);
            this.f87676D2 = codecNeedsEosOutputExceptionWorkaround(str);
            this.f87677E2 = codecNeedsEosBufferTimestampWorkaround(str);
            this.f87678F2 = codecNeedsMonoChannelCountWorkaround(str, this.f87732r2);
            this.f87681I2 = codecNeedsEosPropagationWorkaround(kdaVar) || mo21879A();
            if (this.f87731q2.needsReconfiguration()) {
                this.f87693T2 = true;
                this.f87694U2 = 1;
                this.f87679G2 = this.f87739y2 != 0;
            }
            if ("c2.android.mp3.decoder".equals(kdaVar.f53649a)) {
                this.f87682J2 = new mk1();
            }
            if (getState() == 2) {
                this.f87683K2 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f87719h3.f64828a++;
            mo11631M(str, c5265aMo11629F, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            w5h.endSection();
            throw th;
        }
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.f87710d2.size();
        for (int i = 0; i < size; i++) {
            if (this.f87710d2.get(i).longValue() == j) {
                this.f87710d2.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (x0i.f95978a >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @c5e(21)
    private static boolean isMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @c5e(21)
    private static boolean isRecoverableMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void maybeInitCodecWithFallback(@p000.hib android.media.MediaCrypto r8, boolean r9) throws p000.uda.C13509b {
        /*
            r7 = this;
            java.util.ArrayDeque<kda> r0 = r7.f87736v2
            r1 = 0
            if (r0 != 0) goto L3a
            java.util.List r0 = r7.getAvailableCodecInfos(r9)     // Catch: p000.oea.C10346c -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: p000.oea.C10346c -> L18
            r2.<init>()     // Catch: p000.oea.C10346c -> L18
            r7.f87736v2 = r2     // Catch: p000.oea.C10346c -> L18
            boolean r3 = r7.f87685M1     // Catch: p000.oea.C10346c -> L18
            if (r3 == 0) goto L1a
            r2.addAll(r0)     // Catch: p000.oea.C10346c -> L18
            goto L2c
        L18:
            r8 = move-exception
            goto L2f
        L1a:
            boolean r2 = r0.isEmpty()     // Catch: p000.oea.C10346c -> L18
            if (r2 != 0) goto L2c
            java.util.ArrayDeque<kda> r2 = r7.f87736v2     // Catch: p000.oea.C10346c -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: p000.oea.C10346c -> L18
            kda r0 = (p000.kda) r0     // Catch: p000.oea.C10346c -> L18
            r2.add(r0)     // Catch: p000.oea.C10346c -> L18
        L2c:
            r7.f87737w2 = r1     // Catch: p000.oea.C10346c -> L18
            goto L3a
        L2f:
            uda$b r0 = new uda$b
            kq6 r1 = r7.f87718h2
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L3a:
            java.util.ArrayDeque<kda> r0 = r7.f87736v2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb6
            java.util.ArrayDeque<kda> r0 = r7.f87736v2
            java.lang.Object r0 = r0.peekFirst()
            kda r0 = (p000.kda) r0
        L4a:
            eda r2 = r7.f87731q2
            if (r2 != 0) goto Lb3
            java.util.ArrayDeque<kda> r2 = r7.f87736v2
            java.lang.Object r2 = r2.peekFirst()
            kda r2 = (p000.kda) r2
            boolean r3 = r7.mo21898c0(r2)
            if (r3 != 0) goto L5d
            return
        L5d:
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L61
            goto L4a
        L61:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L76
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            p000.yh9.m25919w(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.initCodec(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L4a
        L74:
            r3 = move-exception
            goto L77
        L76:
            throw r3     // Catch: java.lang.Exception -> L74
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            p000.yh9.m25920w(r4, r5, r3)
            java.util.ArrayDeque<kda> r4 = r7.f87736v2
            r4.removeFirst()
            uda$b r4 = new uda$b
            kq6 r5 = r7.f87718h2
            r4.<init>(r5, r3, r9, r2)
            r7.mo11630L(r4)
            uda$b r2 = r7.f87737w2
            if (r2 != 0) goto La1
            r7.f87737w2 = r4
            goto La7
        La1:
            uda$b r2 = p000.uda.C13509b.m23274a(r2, r4)
            r7.f87737w2 = r2
        La7:
            java.util.ArrayDeque<kda> r2 = r7.f87736v2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            goto L4a
        Lb0:
            uda$b r8 = r7.f87737w2
            throw r8
        Lb3:
            r7.f87736v2 = r1
            return
        Lb6:
            uda$b r8 = new uda$b
            kq6 r0 = r7.f87718h2
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uda.maybeInitCodecWithFallback(android.media.MediaCrypto, boolean):void");
    }

    @omg(23)
    private void processEndOfStream() throws ba5 {
        int i = this.f87697W2;
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
            this.f87711d3 = true;
            mo11639X();
        }
    }

    private void processOutputMediaFormatChanged() {
        this.f87703Z2 = true;
        MediaFormat outputFormat = this.f87731q2.getOutputFormat();
        if (this.f87739y2 != 0 && outputFormat.getInteger(StreamInformation.KEY_WIDTH) == 32 && outputFormat.getInteger(StreamInformation.KEY_HEIGHT) == 32) {
            this.f87680H2 = true;
            return;
        }
        if (this.f87678F2) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.f87733s2 = outputFormat;
        this.f87734t2 = true;
    }

    private boolean readSourceOmittingSampleData(int i) throws ba5 {
        nq6 nq6VarM3406d = m3406d();
        this.f87702Z1.clear();
        int iM3421s = m3421s(nq6VarM3406d, this.f87702Z1, i | 4);
        if (iM3421s == -5) {
            mo11633O(nq6VarM3406d);
            return true;
        }
        if (iM3421s != -4 || !this.f87702Z1.isEndOfStream()) {
            return false;
        }
        this.f87709c3 = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() throws ba5 {
        m23263W();
        m23262K();
    }

    private void resetInputBuffer() {
        this.f87684L2 = -1;
        this.f87704a2.f82162d = null;
    }

    private void resetOutputBuffer() {
        this.f87686M2 = -1;
        this.f87687N2 = null;
    }

    private void setCodecDrmSession(@hib InterfaceC3004d interfaceC3004d) {
        InterfaceC3004d.replaceSession(this.f87722j2, interfaceC3004d);
        this.f87722j2 = interfaceC3004d;
    }

    private void setOutputStreamInfo(C13510c c13510c) {
        this.f87721i3 = c13510c;
        long j = c13510c.f87752c;
        if (j != -9223372036854775807L) {
            this.f87725k3 = true;
            mo11635Q(j);
        }
    }

    private void setSourceDrmSession(@hib InterfaceC3004d interfaceC3004d) {
        InterfaceC3004d.replaceSession(this.f87724k2, interfaceC3004d);
        this.f87724k2 = interfaceC3004d;
    }

    private boolean shouldContinueRendering(long j) {
        return this.f87728n2 == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f87728n2;
    }

    private boolean updateCodecOperatingRate(kq6 kq6Var) throws ba5 {
        if (x0i.f95978a >= 23 && this.f87731q2 != null && this.f87697W2 != 3 && getState() != 0) {
            float fMo11627C = mo11627C(this.f87730p2, kq6Var, m3410h());
            float f = this.f87735u2;
            if (f == fMo11627C) {
                return true;
            }
            if (fMo11627C == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f == -1.0f && fMo11627C <= this.f87695V1) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fMo11627C);
            this.f87731q2.setParameters(bundle);
            this.f87735u2 = fMo11627C;
        }
        return true;
    }

    @c5e(23)
    private void updateDrmSessionV23() throws ba5 {
        b93 cryptoConfig = this.f87724k2.getCryptoConfig();
        if (cryptoConfig instanceof rv6) {
            try {
                this.f87726l2.setMediaDrmSession(((rv6) cryptoConfig).f79737b);
            } catch (MediaCryptoException e) {
                throw m3403a(e, this.f87718h2, 6006);
            }
        }
        setCodecDrmSession(this.f87724k2);
        this.f87696V2 = 0;
        this.f87697W2 = 0;
    }

    /* JADX INFO: renamed from: A */
    public boolean mo21879A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public float m23257B() {
        return this.f87735u2;
    }

    /* JADX INFO: renamed from: C */
    public float mo11627C(float f, kq6 kq6Var, kq6[] kq6VarArr) {
        return -1.0f;
    }

    @hib
    /* JADX INFO: renamed from: D */
    public final MediaFormat m23258D() {
        return this.f87733s2;
    }

    /* JADX INFO: renamed from: E */
    public abstract List<kda> mo11628E(yda ydaVar, kq6 kq6Var, boolean z) throws oea.C10346c;

    /* JADX INFO: renamed from: F */
    public abstract eda.C5265a mo11629F(kda kdaVar, kq6 kq6Var, @hib MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: G */
    public final long m23259G() {
        return this.f87721i3.f87752c;
    }

    /* JADX INFO: renamed from: H */
    public float m23260H() {
        return this.f87729o2;
    }

    /* JADX INFO: renamed from: I */
    public void mo21887I(sl3 sl3Var) throws ba5 {
    }

    /* JADX INFO: renamed from: J */
    public final boolean m23261J(kq6 kq6Var) {
        return this.f87724k2 == null && mo11640e0(kq6Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m23262K() throws ba5 {
        kq6 kq6Var;
        if (this.f87731q2 != null || this.f87690Q2 || (kq6Var = this.f87718h2) == null) {
            return;
        }
        if (m23261J(kq6Var)) {
            initBypass(this.f87718h2);
            return;
        }
        setCodecDrmSession(this.f87724k2);
        String str = this.f87718h2.f54989M;
        InterfaceC3004d interfaceC3004d = this.f87722j2;
        if (interfaceC3004d != null) {
            b93 cryptoConfig = interfaceC3004d.getCryptoConfig();
            if (this.f87726l2 == null) {
                if (cryptoConfig == null) {
                    if (this.f87722j2.getError() == null) {
                        return;
                    }
                } else if (cryptoConfig instanceof rv6) {
                    rv6 rv6Var = (rv6) cryptoConfig;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(rv6Var.f79736a, rv6Var.f79737b);
                        this.f87726l2 = mediaCrypto;
                        this.f87727m2 = !rv6Var.f79738c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw m3403a(e, this.f87718h2, 6006);
                    }
                }
            }
            if (rv6.f79735d && (cryptoConfig instanceof rv6)) {
                int state = this.f87722j2.getState();
                if (state == 1) {
                    InterfaceC3004d.a aVar = (InterfaceC3004d.a) u80.checkNotNull(this.f87722j2.getError());
                    throw m3403a(aVar, this.f87718h2, aVar.f19499a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            maybeInitCodecWithFallback(this.f87726l2, this.f87727m2);
        } catch (C13509b e2) {
            throw m3403a(e2, this.f87718h2, 4001);
        }
    }

    /* JADX INFO: renamed from: L */
    public void mo11630L(Exception exc) {
    }

    /* JADX INFO: renamed from: M */
    public void mo11631M(String str, eda.C5265a c5265a, long j, long j2) {
    }

    /* JADX INFO: renamed from: N */
    public void mo11632N(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    @p000.hib
    @p000.un1
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.wl3 mo11633O(p000.nq6 r12) throws p000.ba5 {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uda.mo11633O(nq6):wl3");
    }

    /* JADX INFO: renamed from: P */
    public void mo11634P(kq6 kq6Var, @hib MediaFormat mediaFormat) throws ba5 {
    }

    /* JADX INFO: renamed from: Q */
    public void mo11635Q(long j) {
    }

    @un1
    /* JADX INFO: renamed from: R */
    public void mo21895R(long j) {
        this.f87723j3 = j;
        while (!this.f87714f2.isEmpty() && j >= this.f87714f2.peek().f87750a) {
            setOutputStreamInfo(this.f87714f2.poll());
            mo11636S();
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo11636S() {
    }

    /* JADX INFO: renamed from: T */
    public void mo11637T(sl3 sl3Var) throws ba5 {
    }

    /* JADX INFO: renamed from: U */
    public void mo21896U(kq6 kq6Var) throws ba5 {
    }

    /* JADX INFO: renamed from: V */
    public abstract boolean mo11638V(long j, long j2, @hib eda edaVar, @hib ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, kq6 kq6Var) throws ba5;

    /* JADX INFO: renamed from: W */
    public void m23263W() {
        try {
            eda edaVar = this.f87731q2;
            if (edaVar != null) {
                edaVar.release();
                this.f87719h3.f64829b++;
                mo11632N(this.f87738x2.f53649a);
            }
            this.f87731q2 = null;
            try {
                MediaCrypto mediaCrypto = this.f87726l2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f87731q2 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f87726l2;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void mo11639X() throws ba5 {
    }

    @un1
    /* JADX INFO: renamed from: Y */
    public void mo21897Y() {
        resetInputBuffer();
        resetOutputBuffer();
        this.f87683K2 = -9223372036854775807L;
        this.f87700Y2 = false;
        this.f87698X2 = false;
        this.f87679G2 = false;
        this.f87680H2 = false;
        this.f87688O2 = false;
        this.f87689P2 = false;
        this.f87710d2.clear();
        this.f87705a3 = -9223372036854775807L;
        this.f87707b3 = -9223372036854775807L;
        this.f87723j3 = -9223372036854775807L;
        mk1 mk1Var = this.f87682J2;
        if (mk1Var != null) {
            mk1Var.reset();
        }
        this.f87696V2 = 0;
        this.f87697W2 = 0;
        this.f87694U2 = this.f87693T2 ? 1 : 0;
    }

    @un1
    /* JADX INFO: renamed from: Z */
    public void m23264Z() {
        mo21897Y();
        this.f87717g3 = null;
        this.f87682J2 = null;
        this.f87736v2 = null;
        this.f87738x2 = null;
        this.f87732r2 = null;
        this.f87733s2 = null;
        this.f87734t2 = false;
        this.f87703Z2 = false;
        this.f87735u2 = -1.0f;
        this.f87739y2 = 0;
        this.f87740z2 = false;
        this.f87673A2 = false;
        this.f87674B2 = false;
        this.f87675C2 = false;
        this.f87676D2 = false;
        this.f87677E2 = false;
        this.f87678F2 = false;
        this.f87681I2 = false;
        this.f87693T2 = false;
        this.f87694U2 = 0;
        this.f87727m2 = false;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m23265a0() {
        this.f87715f3 = true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m23266b0(ba5 ba5Var) {
        this.f87717g3 = ba5Var;
    }

    /* JADX INFO: renamed from: c0 */
    public boolean mo21898c0(kda kdaVar) {
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m23267d0() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean mo11640e0(kq6 kq6Var) {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public abstract int mo11641f0(yda ydaVar, kq6 kq6Var) throws oea.C10346c;

    /* JADX INFO: renamed from: h0 */
    public final boolean m23268h0() throws ba5 {
        return updateCodecOperatingRate(this.f87732r2);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m23269i0(long j) throws ba5 {
        kq6 kq6VarPollFloor = this.f87721i3.f87753d.pollFloor(j);
        if (kq6VarPollFloor == null && this.f87725k3 && this.f87733s2 != null) {
            kq6VarPollFloor = this.f87721i3.f87753d.pollFirst();
        }
        if (kq6VarPollFloor != null) {
            this.f87720i2 = kq6VarPollFloor;
        } else if (!this.f87734t2 || this.f87720i2 == null) {
            return;
        }
        mo11634P(this.f87720i2, this.f87733s2);
        this.f87734t2 = false;
        this.f87725k3 = false;
    }

    @Override // p000.n1e
    public boolean isEnded() {
        return this.f87711d3;
    }

    @Override // p000.n1e
    public boolean isReady() {
        return this.f87718h2 != null && (m3411i() || hasOutputBuffer() || (this.f87683K2 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f87683K2));
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        this.f87718h2 = null;
        setOutputStreamInfo(C13510c.f87749e);
        this.f87714f2.clear();
        m23271x();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: k */
    public void mo3413k(boolean z, boolean z2) throws ba5 {
        this.f87719h3 = new nl3();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) throws ba5 {
        this.f87709c3 = false;
        this.f87711d3 = false;
        this.f87715f3 = false;
        if (this.f87690Q2) {
            this.f87708c2.clear();
            this.f87706b2.clear();
            this.f87691R2 = false;
            this.f87716g2.reset();
        } else {
            m23270w();
        }
        if (this.f87721i3.f87753d.size() > 0) {
            this.f87713e3 = true;
        }
        this.f87721i3.f87753d.clear();
        this.f87714f2.clear();
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: o */
    public void mo3417o() {
        try {
            disableBypass();
            m23263W();
        } finally {
            setSourceDrmSession(null);
        }
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: p */
    public void mo3418p() {
    }

    @Override // p000.bu0
    /* JADX INFO: renamed from: q */
    public void mo3419q() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // p000.bu0
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3420r(p000.kq6[] r13, long r14, long r16) throws p000.ba5 {
        /*
            r12 = this;
            r0 = r12
            uda$c r1 = r0.f87721i3
            long r1 = r1.f87752c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            uda$c r1 = new uda$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r1)
            goto L65
        L20:
            java.util.ArrayDeque<uda$c> r1 = r0.f87714f2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f87705a3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f87723j3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            uda$c r1 = new uda$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.setOutputStreamInfo(r1)
            uda$c r1 = r0.f87721i3
            long r1 = r1.f87752c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.mo11636S()
            goto L65
        L55:
            java.util.ArrayDeque<uda$c> r1 = r0.f87714f2
            uda$c r9 = new uda$c
            long r3 = r0.f87705a3
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uda.mo3420r(kq6[], long, long):void");
    }

    @Override // p000.n1e
    public void render(long j, long j2) throws ba5 {
        boolean z = false;
        if (this.f87715f3) {
            this.f87715f3 = false;
            processEndOfStream();
        }
        ba5 ba5Var = this.f87717g3;
        if (ba5Var != null) {
            this.f87717g3 = null;
            throw ba5Var;
        }
        try {
            if (this.f87711d3) {
                mo11639X();
                return;
            }
            if (this.f87718h2 != null || readSourceOmittingSampleData(2)) {
                m23262K();
                if (this.f87690Q2) {
                    w5h.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    w5h.endSection();
                } else if (this.f87731q2 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    w5h.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    w5h.endSection();
                } else {
                    this.f87719h3.f64831d += m3422t(j);
                    readSourceOmittingSampleData(1);
                }
                this.f87719h3.ensureUpdated();
            }
        } catch (IllegalStateException e) {
            if (!isMediaCodecException(e)) {
                throw e;
            }
            mo11630L(e);
            if (x0i.f95978a >= 21 && isRecoverableMediaCodecExceptionV21(e)) {
                z = true;
            }
            if (z) {
                m23263W();
            }
            throw m3404b(mo21899v(e, m23273z()), this.f87718h2, z, 4003);
        }
    }

    @Override // p000.n1e
    public void setPlaybackSpeed(float f, float f2) throws ba5 {
        this.f87729o2 = f;
        this.f87730p2 = f2;
        updateCodecOperatingRate(this.f87732r2);
    }

    public void setRenderTimeLimitMs(long j) {
        this.f87728n2 = j;
    }

    @Override // p000.p1e
    public final int supportsFormat(kq6 kq6Var) throws ba5 {
        try {
            return mo11641f0(this.f87701Z, kq6Var);
        } catch (oea.C10346c e) {
            throw m3403a(e, kq6Var, 4002);
        }
    }

    @Override // p000.bu0, p000.p1e
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* JADX INFO: renamed from: u */
    public wl3 mo11645u(kda kdaVar, kq6 kq6Var, kq6 kq6Var2) {
        return new wl3(kdaVar.f53649a, kq6Var, kq6Var2, 0, 1);
    }

    /* JADX INFO: renamed from: v */
    public ida mo21899v(Throwable th, @hib kda kdaVar) {
        return new ida(th, kdaVar);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m23270w() throws ba5 {
        boolean zM23271x = m23271x();
        if (zM23271x) {
            m23262K();
        }
        return zM23271x;
    }

    /* JADX INFO: renamed from: x */
    public boolean m23271x() {
        if (this.f87731q2 == null) {
            return false;
        }
        int i = this.f87697W2;
        if (i == 3 || this.f87673A2 || ((this.f87674B2 && !this.f87703Z2) || (this.f87675C2 && this.f87700Y2))) {
            m23263W();
            return true;
        }
        if (i == 2) {
            int i2 = x0i.f95978a;
            u80.checkState(i2 >= 23);
            if (i2 >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (ba5 e) {
                    yh9.m25920w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    m23263W();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    @hib
    /* JADX INFO: renamed from: y */
    public final eda m23272y() {
        return this.f87731q2;
    }

    @hib
    /* JADX INFO: renamed from: z */
    public final kda m23273z() {
        return this.f87738x2;
    }

    /* JADX INFO: renamed from: uda$b */
    public static class C13509b extends Exception {

        /* JADX INFO: renamed from: C */
        public static final int f87741C = -49998;

        /* JADX INFO: renamed from: f */
        public static final int f87742f = -50000;

        /* JADX INFO: renamed from: m */
        public static final int f87743m = -49999;

        /* JADX INFO: renamed from: a */
        public final String f87744a;

        /* JADX INFO: renamed from: b */
        public final boolean f87745b;

        /* JADX INFO: renamed from: c */
        @hib
        public final kda f87746c;

        /* JADX INFO: renamed from: d */
        @hib
        public final String f87747d;

        /* JADX INFO: renamed from: e */
        @hib
        public final C13509b f87748e;

        public C13509b(kq6 kq6Var, @hib Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + kq6Var, th, kq6Var.f54989M, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @yx1
        public C13509b copyWithFallbackException(C13509b c13509b) {
            return new C13509b(getMessage(), getCause(), this.f87744a, this.f87745b, this.f87746c, this.f87747d, c13509b);
        }

        @c5e(21)
        @hib
        private static String getDiagnosticInfoV21(@hib Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public C13509b(kq6 kq6Var, @hib Throwable th, boolean z, kda kdaVar) {
            this("Decoder init failed: " + kdaVar.f53649a + ", " + kq6Var, th, kq6Var.f54989M, z, kdaVar, x0i.f95978a >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private C13509b(String str, @hib Throwable th, String str2, boolean z, @hib kda kdaVar, @hib String str3, @hib C13509b c13509b) {
            super(str, th);
            this.f87744a = str2;
            this.f87745b = z;
            this.f87746c = kdaVar;
            this.f87747d = str3;
            this.f87748e = c13509b;
        }
    }
}
