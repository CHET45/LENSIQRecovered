package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000.bh0;
import p000.hf0;
import p000.jh0;
import p000.kx7;
import p000.md0;
import p000.vs3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ps3 implements bh0 {

    /* JADX INFO: renamed from: A0 */
    public static final int f71791A0 = 20;

    /* JADX INFO: renamed from: B0 */
    public static final float f71792B0 = 1.0f;

    /* JADX INFO: renamed from: C0 */
    public static final float f71793C0 = 0.1f;

    /* JADX INFO: renamed from: D0 */
    public static final float f71794D0 = 8.0f;

    /* JADX INFO: renamed from: E0 */
    public static final float f71795E0 = 0.1f;

    /* JADX INFO: renamed from: F0 */
    public static final float f71796F0 = 8.0f;

    /* JADX INFO: renamed from: G0 */
    public static final boolean f71797G0 = false;

    /* JADX INFO: renamed from: H0 */
    public static final int f71798H0 = 0;

    /* JADX INFO: renamed from: I0 */
    public static final int f71799I0 = 1;

    /* JADX INFO: renamed from: J0 */
    public static final int f71800J0 = 2;

    /* JADX INFO: renamed from: K0 */
    public static final int f71801K0 = -32;

    /* JADX INFO: renamed from: L0 */
    public static final String f71802L0 = "DefaultAudioSink";

    /* JADX INFO: renamed from: M0 */
    public static boolean f71803M0 = false;

    /* JADX INFO: renamed from: N0 */
    public static final Object f71804N0 = new Object();

    /* JADX INFO: renamed from: O0 */
    @xc7("releaseExecutorLock")
    @hib
    public static ScheduledExecutorService f71805O0 = null;

    /* JADX INFO: renamed from: P0 */
    @xc7("releaseExecutorLock")
    public static int f71806P0 = 0;

    /* JADX INFO: renamed from: x0 */
    public static final int f71807x0 = 1000000;

    /* JADX INFO: renamed from: y0 */
    public static final int f71808y0 = 300000;

    /* JADX INFO: renamed from: z0 */
    public static final int f71809z0 = 100;

    /* JADX INFO: renamed from: A */
    public final int f71810A;

    /* JADX INFO: renamed from: B */
    @hib
    public j0d f71811B;

    /* JADX INFO: renamed from: C */
    @hib
    public bh0.InterfaceC1890d f71812C;

    /* JADX INFO: renamed from: D */
    @hib
    public C11097i f71813D;

    /* JADX INFO: renamed from: E */
    public C11097i f71814E;

    /* JADX INFO: renamed from: F */
    public gf0 f71815F;

    /* JADX INFO: renamed from: G */
    @hib
    public AudioTrack f71816G;

    /* JADX INFO: renamed from: H */
    public hd0 f71817H;

    /* JADX INFO: renamed from: I */
    public md0 f71818I;

    /* JADX INFO: renamed from: J */
    @hib
    public C11101m f71819J;

    /* JADX INFO: renamed from: K */
    public uc0 f71820K;

    /* JADX INFO: renamed from: L */
    @hib
    public C11100l f71821L;

    /* JADX INFO: renamed from: M */
    public C11100l f71822M;

    /* JADX INFO: renamed from: N */
    public ryc f71823N;

    /* JADX INFO: renamed from: O */
    public boolean f71824O;

    /* JADX INFO: renamed from: P */
    @hib
    public ByteBuffer f71825P;

    /* JADX INFO: renamed from: Q */
    public int f71826Q;

    /* JADX INFO: renamed from: R */
    public long f71827R;

    /* JADX INFO: renamed from: S */
    public long f71828S;

    /* JADX INFO: renamed from: T */
    public long f71829T;

    /* JADX INFO: renamed from: U */
    public long f71830U;

    /* JADX INFO: renamed from: V */
    public int f71831V;

    /* JADX INFO: renamed from: W */
    public boolean f71832W;

    /* JADX INFO: renamed from: X */
    public boolean f71833X;

    /* JADX INFO: renamed from: Y */
    public long f71834Y;

    /* JADX INFO: renamed from: Z */
    public float f71835Z;

    /* JADX INFO: renamed from: a0 */
    @hib
    public ByteBuffer f71836a0;

    /* JADX INFO: renamed from: b0 */
    public int f71837b0;

    /* JADX INFO: renamed from: c0 */
    @hib
    public ByteBuffer f71838c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f71839d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f71840e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f71841f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f71842g0;

    /* JADX INFO: renamed from: h */
    @hib
    public final Context f71843h;

    /* JADX INFO: renamed from: h0 */
    public boolean f71844h0;

    /* JADX INFO: renamed from: i */
    public final kf0 f71845i;

    /* JADX INFO: renamed from: i0 */
    public int f71846i0;

    /* JADX INFO: renamed from: j */
    public final boolean f71847j;

    /* JADX INFO: renamed from: j0 */
    public boolean f71848j0;

    /* JADX INFO: renamed from: k */
    public final su1 f71849k;

    /* JADX INFO: renamed from: k0 */
    public pm0 f71850k0;

    /* JADX INFO: renamed from: l */
    public final cjh f71851l;

    /* JADX INFO: renamed from: l0 */
    @hib
    public vd0 f71852l0;

    /* JADX INFO: renamed from: m */
    public final j3h f71853m;

    /* JADX INFO: renamed from: m0 */
    public boolean f71854m0;

    /* JADX INFO: renamed from: n */
    public final h3h f71855n;

    /* JADX INFO: renamed from: n0 */
    public long f71856n0;

    /* JADX INFO: renamed from: o */
    public final kx7<hf0> f71857o;

    /* JADX INFO: renamed from: o0 */
    public long f71858o0;

    /* JADX INFO: renamed from: p */
    public final jh0 f71859p;

    /* JADX INFO: renamed from: p0 */
    public boolean f71860p0;

    /* JADX INFO: renamed from: q */
    public final ArrayDeque<C11100l> f71861q;

    /* JADX INFO: renamed from: q0 */
    public boolean f71862q0;

    /* JADX INFO: renamed from: r */
    public final boolean f71863r;

    /* JADX INFO: renamed from: r0 */
    @hib
    public Looper f71864r0;

    /* JADX INFO: renamed from: s */
    public int f71865s;

    /* JADX INFO: renamed from: s0 */
    public long f71866s0;

    /* JADX INFO: renamed from: t */
    public C11105q f71867t;

    /* JADX INFO: renamed from: t0 */
    public long f71868t0;

    /* JADX INFO: renamed from: u */
    public final C11103o<bh0.C1889c> f71869u;

    /* JADX INFO: renamed from: u0 */
    public Handler f71870u0;

    /* JADX INFO: renamed from: v */
    public final C11103o<bh0.C1894h> f71871v;

    /* JADX INFO: renamed from: v0 */
    @hib
    public Context f71872v0;

    /* JADX INFO: renamed from: w */
    public final InterfaceC11094f f71873w;

    /* JADX INFO: renamed from: w0 */
    public boolean f71874w0;

    /* JADX INFO: renamed from: x */
    public final InterfaceC11092d f71875x;

    /* JADX INFO: renamed from: y */
    @hib
    public final ExoPlayer.InterfaceC1218a f71876y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC11095g f71877z;

    /* JADX INFO: renamed from: ps3$b */
    @c5e(23)
    public static final class C11090b {
        private C11090b() {
        }

        public static long getAudioTrackBufferSizeUs(AudioTrack audioTrack, C11097i c11097i) {
            return c11097i.f71893c == 0 ? c11097i.framesToDurationUs(audioTrack.getBufferSizeInFrames()) : t0i.scaleLargeValue(audioTrack.getBufferSizeInFrames(), 1000000L, ps3.getNonPcmMaximumEncodedRateBytesPerSecond(c11097i.f71897g), RoundingMode.DOWN);
        }

        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, @hib vd0 vd0Var) {
            audioTrack.setPreferredDevice(vd0Var == null ? null : vd0Var.f90707a);
        }
    }

    /* JADX INFO: renamed from: ps3$c */
    @c5e(31)
    public static final class C11091c {
        private C11091c() {
        }

        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, j0d j0dVar) {
            LogSessionId logSessionId = j0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    /* JADX INFO: renamed from: ps3$d */
    public interface InterfaceC11092d {
        oe0 getAudioOffloadSupport(C1213a c1213a, uc0 uc0Var);
    }

    /* JADX INFO: renamed from: ps3$e */
    @Deprecated
    public interface InterfaceC11093e extends kf0 {
    }

    /* JADX INFO: renamed from: ps3$f */
    public interface InterfaceC11094f {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC11094f f71878a = new vs3.C14241a().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* JADX INFO: renamed from: ps3$g */
    public interface InterfaceC11095g {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC11095g f71879a = new zs3();

        AudioTrack getAudioTrack(bh0.C1887a c1887a, uc0 uc0Var, int i, @hib Context context);

        default int getAudioTrackChannelConfig(int i) {
            return t0i.getAudioTrackChannelConfig(i);
        }
    }

    /* JADX INFO: renamed from: ps3$i */
    public static final class C11097i {

        /* JADX INFO: renamed from: a */
        public final C1213a f71891a;

        /* JADX INFO: renamed from: b */
        public final int f71892b;

        /* JADX INFO: renamed from: c */
        public final int f71893c;

        /* JADX INFO: renamed from: d */
        public final int f71894d;

        /* JADX INFO: renamed from: e */
        public final int f71895e;

        /* JADX INFO: renamed from: f */
        public final int f71896f;

        /* JADX INFO: renamed from: g */
        public final int f71897g;

        /* JADX INFO: renamed from: h */
        public final int f71898h;

        /* JADX INFO: renamed from: i */
        public final gf0 f71899i;

        /* JADX INFO: renamed from: j */
        public final boolean f71900j;

        /* JADX INFO: renamed from: k */
        public final boolean f71901k;

        /* JADX INFO: renamed from: l */
        public final boolean f71902l;

        public C11097i(C1213a c1213a, int i, int i2, int i3, int i4, int i5, int i6, int i7, gf0 gf0Var, boolean z, boolean z2, boolean z3) {
            this.f71891a = c1213a;
            this.f71892b = i;
            this.f71893c = i2;
            this.f71894d = i3;
            this.f71895e = i4;
            this.f71896f = i5;
            this.f71897g = i6;
            this.f71898h = i7;
            this.f71899i = gf0Var;
            this.f71900j = z;
            this.f71901k = z2;
            this.f71902l = z3;
        }

        public bh0.C1887a buildAudioTrackConfig() {
            return new bh0.C1887a(this.f71897g, this.f71895e, this.f71896f, this.f71902l, this.f71893c == 1, this.f71898h);
        }

        public boolean canReuseAudioTrack(C11097i c11097i) {
            return c11097i.f71893c == this.f71893c && c11097i.f71897g == this.f71897g && c11097i.f71895e == this.f71895e && c11097i.f71896f == this.f71896f && c11097i.f71894d == this.f71894d && c11097i.f71900j == this.f71900j && c11097i.f71901k == this.f71901k;
        }

        public C11097i copyWithBufferSize(int i) {
            return new C11097i(this.f71891a, this.f71892b, this.f71893c, this.f71894d, this.f71895e, this.f71896f, this.f71897g, i, this.f71899i, this.f71900j, this.f71901k, this.f71902l);
        }

        public long framesToDurationUs(long j) {
            return t0i.sampleCountToDurationUs(j, this.f71895e);
        }

        public long inputFramesToDurationUs(long j) {
            return t0i.sampleCountToDurationUs(j, this.f71891a.f8267H);
        }

        public boolean outputModeIsOffload() {
            return this.f71893c == 1;
        }
    }

    /* JADX INFO: renamed from: ps3$j */
    public static class C11098j implements InterfaceC11093e {

        /* JADX INFO: renamed from: a */
        public final hf0[] f71903a;

        /* JADX INFO: renamed from: b */
        public final pcf f71904b;

        /* JADX INFO: renamed from: c */
        public final ivf f71905c;

        public C11098j(hf0... hf0VarArr) {
            this(hf0VarArr, new pcf(), new ivf());
        }

        @Override // p000.kf0
        public ryc applyPlaybackParameters(ryc rycVar) {
            this.f71905c.setSpeed(rycVar.f80107a);
            this.f71905c.setPitch(rycVar.f80108b);
            return rycVar;
        }

        @Override // p000.kf0
        public boolean applySkipSilenceEnabled(boolean z) {
            this.f71904b.setEnabled(z);
            return z;
        }

        @Override // p000.kf0
        public hf0[] getAudioProcessors() {
            return this.f71903a;
        }

        @Override // p000.kf0
        public long getMediaDuration(long j) {
            return this.f71905c.isActive() ? this.f71905c.getMediaDuration(j) : j;
        }

        @Override // p000.kf0
        public long getSkippedOutputFrameCount() {
            return this.f71904b.getSkippedFrames();
        }

        public C11098j(hf0[] hf0VarArr, pcf pcfVar, ivf ivfVar) {
            hf0[] hf0VarArr2 = new hf0[hf0VarArr.length + 2];
            this.f71903a = hf0VarArr2;
            System.arraycopy(hf0VarArr, 0, hf0VarArr2, 0, hf0VarArr.length);
            this.f71904b = pcfVar;
            this.f71905c = ivfVar;
            hf0VarArr2[hf0VarArr.length] = pcfVar;
            hf0VarArr2[hf0VarArr.length + 1] = ivfVar;
        }
    }

    /* JADX INFO: renamed from: ps3$k */
    public static final class C11099k extends RuntimeException {
        private C11099k(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: ps3$l */
    public static final class C11100l {

        /* JADX INFO: renamed from: a */
        public final ryc f71906a;

        /* JADX INFO: renamed from: b */
        public final long f71907b;

        /* JADX INFO: renamed from: c */
        public final long f71908c;

        /* JADX INFO: renamed from: d */
        public long f71909d;

        private C11100l(ryc rycVar, long j, long j2) {
            this.f71906a = rycVar;
            this.f71907b = j;
            this.f71908c = j2;
        }
    }

    /* JADX INFO: renamed from: ps3$m */
    @c5e(24)
    public static final class C11101m {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f71910a;

        /* JADX INFO: renamed from: b */
        public final md0 f71911b;

        /* JADX INFO: renamed from: c */
        @hib
        public AudioRouting.OnRoutingChangedListener f71912c = new AudioRouting.OnRoutingChangedListener() { // from class: rs3
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f79183a.onRoutingChanged(audioRouting);
            }
        };

        public C11101m(AudioTrack audioTrack, md0 md0Var) {
            this.f71910a = audioTrack;
            this.f71911b = md0Var;
            audioTrack.addOnRoutingChangedListener(this.f71912c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f71912c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f71911b.setRoutedDevice(routedDevice);
        }

        public void release() {
            this.f71910a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) v80.checkNotNull(this.f71912c));
            this.f71912c = null;
        }
    }

    /* JADX INFO: renamed from: ps3$n */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11102n {
    }

    /* JADX INFO: renamed from: ps3$o */
    public static final class C11103o<T extends Exception> {

        /* JADX INFO: renamed from: d */
        public static final int f71913d = 200;

        /* JADX INFO: renamed from: e */
        public static final int f71914e = 50;

        /* JADX INFO: renamed from: a */
        @hib
        public T f71915a;

        /* JADX INFO: renamed from: b */
        public long f71916b = -9223372036854775807L;

        /* JADX INFO: renamed from: c */
        public long f71917c = -9223372036854775807L;

        public void clear() {
            this.f71915a = null;
            this.f71916b = -9223372036854775807L;
            this.f71917c = -9223372036854775807L;
        }

        public boolean shouldWaitBeforeRetry() {
            if (this.f71915a == null) {
                return false;
            }
            return ps3.hasPendingAudioTrackReleases() || SystemClock.elapsedRealtime() < this.f71917c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f71915a == null) {
                this.f71915a = t;
            }
            if (this.f71916b == -9223372036854775807L && !ps3.hasPendingAudioTrackReleases()) {
                this.f71916b = 200 + jElapsedRealtime;
            }
            long j = this.f71916b;
            if (j == -9223372036854775807L || jElapsedRealtime < j) {
                this.f71917c = jElapsedRealtime + 50;
                return;
            }
            T t2 = this.f71915a;
            if (t2 != t) {
                t2.addSuppressed(t);
            }
            T t3 = this.f71915a;
            clear();
            throw t3;
        }
    }

    /* JADX INFO: renamed from: ps3$p */
    public final class C11104p implements jh0.InterfaceC7899a {
        private C11104p() {
        }

        @Override // p000.jh0.InterfaceC7899a
        public void onInvalidLatency(long j) {
            xh9.m25148w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // p000.jh0.InterfaceC7899a
        public void onPositionAdvancing(long j) {
            if (ps3.this.f71812C != null) {
                ps3.this.f71812C.onPositionAdvancing(j);
            }
        }

        @Override // p000.jh0.InterfaceC7899a
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + ps3.this.getSubmittedFrames() + ", " + ps3.this.getWrittenFrames();
            if (ps3.f71803M0) {
                throw new C11099k(str);
            }
            xh9.m25148w("DefaultAudioSink", str);
        }

        @Override // p000.jh0.InterfaceC7899a
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + ps3.this.getSubmittedFrames() + ", " + ps3.this.getWrittenFrames();
            if (ps3.f71803M0) {
                throw new C11099k(str);
            }
            xh9.m25148w("DefaultAudioSink", str);
        }

        @Override // p000.jh0.InterfaceC7899a
        public void onUnderrun(int i, long j) {
            if (ps3.this.f71812C != null) {
                ps3.this.f71812C.onUnderrun(i, j, SystemClock.elapsedRealtime() - ps3.this.f71858o0);
            }
        }
    }

    /* JADX INFO: renamed from: ps3$q */
    @c5e(29)
    public final class C11105q {

        /* JADX INFO: renamed from: a */
        public final Handler f71919a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b */
        public final AudioTrack$StreamEventCallback f71920b;

        /* JADX INFO: renamed from: ps3$q$a */
        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ps3 f71922a;

            public a(ps3 ps3Var) {
                this.f71922a = ps3Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(ps3.this.f71816G) && ps3.this.f71812C != null && ps3.this.f71842g0) {
                    ps3.this.f71812C.onOffloadBufferEmptying();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(ps3.this.f71816G)) {
                    ps3.this.f71841f0 = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(ps3.this.f71816G) && ps3.this.f71812C != null && ps3.this.f71842g0) {
                    ps3.this.f71812C.onOffloadBufferEmptying();
                }
            }
        }

        public C11105q() {
            this.f71920b = new a(ps3.this);
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.f71919a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new gp2(handler), this.f71920b);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f71920b);
            this.f71919a.removeCallbacksAndMessages(null);
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        ryc rycVarApplyPlaybackParameters;
        if (useAudioTrackPlaybackParams()) {
            rycVarApplyPlaybackParameters = ryc.f80104d;
        } else {
            rycVarApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.f71845i.applyPlaybackParameters(this.f71823N) : ryc.f80104d;
            this.f71823N = rycVarApplyPlaybackParameters;
        }
        ryc rycVar = rycVarApplyPlaybackParameters;
        this.f71824O = shouldApplyAudioProcessorPlaybackParameters() ? this.f71845i.applySkipSilenceEnabled(this.f71824O) : false;
        this.f71861q.add(new C11100l(rycVar, Math.max(0L, j), this.f71814E.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        bh0.InterfaceC1890d interfaceC1890d = this.f71812C;
        if (interfaceC1890d != null) {
            interfaceC1890d.onSkipSilenceEnabledChanged(this.f71824O);
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.f71861q.isEmpty() && j >= this.f71861q.getFirst().f71908c) {
            this.f71822M = this.f71861q.remove();
        }
        C11100l c11100l = this.f71822M;
        long j2 = j - c11100l.f71908c;
        long mediaDurationForPlayoutDuration = t0i.getMediaDurationForPlayoutDuration(j2, c11100l.f71906a.f80107a);
        if (!this.f71861q.isEmpty()) {
            C11100l c11100l2 = this.f71822M;
            return c11100l2.f71907b + mediaDurationForPlayoutDuration + c11100l2.f71909d;
        }
        long mediaDuration = this.f71845i.getMediaDuration(j2);
        C11100l c11100l3 = this.f71822M;
        long j3 = c11100l3.f71907b + mediaDuration;
        c11100l3.f71909d = mediaDuration - mediaDurationForPlayoutDuration;
        return j3;
    }

    private long applySkipping(long j) {
        long skippedOutputFrameCount = this.f71845i.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j + this.f71814E.framesToDurationUs(skippedOutputFrameCount);
        long j2 = this.f71866s0;
        if (skippedOutputFrameCount > j2) {
            long jFramesToDurationUs2 = this.f71814E.framesToDurationUs(skippedOutputFrameCount - j2);
            this.f71866s0 = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private AudioTrack buildAudioTrack(C11097i c11097i) throws bh0.C1889c {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.f71846i0;
            int i3 = this.f71810A;
            if (i3 == -1 || (context2 = this.f71843h) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.f71872v0 == null) {
                    this.f71872v0 = context2.createDeviceContext(i3);
                }
                context = this.f71872v0;
                i = 0;
            }
            AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(c11097i.buildAudioTrackConfig(), this.f71820K, i, c11097i.f71891a, context);
            ExoPlayer.InterfaceC1218a interfaceC1218a = this.f71876y;
            if (interfaceC1218a != null) {
                interfaceC1218a.onOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            }
            return audioTrackBuildAudioTrack;
        } catch (bh0.C1889c e) {
            bh0.InterfaceC1890d interfaceC1890d = this.f71812C;
            if (interfaceC1890d != null) {
                interfaceC1890d.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws bh0.C1889c {
        try {
            return buildAudioTrack((C11097i) v80.checkNotNull(this.f71814E));
        } catch (bh0.C1889c e) {
            C11097i c11097i = this.f71814E;
            if (c11097i.f71898h > 1000000) {
                C11097i c11097iCopyWithBufferSize = c11097i.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(c11097iCopyWithBufferSize);
                    this.f71814E = c11097iCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (bh0.C1889c e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    private void drainOutputBuffer(long j) throws Exception {
        int iWriteNonBlocking;
        bh0.InterfaceC1890d interfaceC1890d;
        if (this.f71838c0 == null || this.f71871v.shouldWaitBeforeRetry()) {
            return;
        }
        int iRemaining = this.f71838c0.remaining();
        if (this.f71854m0) {
            v80.checkState(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f71856n0;
            } else {
                this.f71856n0 = j;
            }
            iWriteNonBlocking = writeNonBlockingWithAvSync(this.f71816G, this.f71838c0, iRemaining, j);
        } else {
            iWriteNonBlocking = writeNonBlocking(this.f71816G, this.f71838c0, iRemaining);
        }
        this.f71858o0 = SystemClock.elapsedRealtime();
        if (iWriteNonBlocking < 0) {
            if (isAudioTrackDeadObject(iWriteNonBlocking)) {
                if (getWrittenFrames() > 0) {
                    z = true;
                } else if (isOffloadedPlayback(this.f71816G)) {
                    maybeDisableOffload();
                    z = true;
                }
            }
            bh0.C1894h c1894h = new bh0.C1894h(iWriteNonBlocking, this.f71814E.f71891a, z);
            bh0.InterfaceC1890d interfaceC1890d2 = this.f71812C;
            if (interfaceC1890d2 != null) {
                interfaceC1890d2.onAudioSinkError(c1894h);
            }
            if (!c1894h.f13729b || this.f71843h == null) {
                this.f71871v.throwExceptionIfDeadlineIsReached(c1894h);
                return;
            }
            hd0 hd0Var = hd0.f43165e;
            this.f71817H = hd0Var;
            this.f71818I.overrideCapabilities(hd0Var);
            throw c1894h;
        }
        this.f71871v.clear();
        if (isOffloadedPlayback(this.f71816G)) {
            if (this.f71830U > 0) {
                this.f71862q0 = false;
            }
            if (this.f71842g0 && (interfaceC1890d = this.f71812C) != null && iWriteNonBlocking < iRemaining && !this.f71862q0) {
                interfaceC1890d.onOffloadBufferFull();
            }
        }
        int i = this.f71814E.f71893c;
        if (i == 0) {
            this.f71829T += (long) iWriteNonBlocking;
        }
        if (iWriteNonBlocking == iRemaining) {
            if (i != 0) {
                v80.checkState(this.f71838c0 == this.f71836a0);
                this.f71830U += ((long) this.f71831V) * ((long) this.f71837b0);
            }
            this.f71838c0 = null;
        }
    }

    private boolean drainToEndOfStream() throws Exception {
        if (!this.f71815F.isOperational()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.f71838c0 == null;
        }
        this.f71815F.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        if (!this.f71815F.isEnded()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f71838c0;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        v80.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    @c5e(34)
    private static int getDeviceIdFromContext(Context context) {
        int deviceId = context.getDeviceId();
        if (deviceId == 0 || deviceId == -1) {
            return -1;
        }
        return deviceId;
    }

    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        if (i == 20) {
            return m7c.parseOggPacketAudioSampleCount(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int mpegAudioFrameSampleCount = o1b.parseMpegAudioFrameSampleCount(t0i.getBigEndianInt(byteBuffer, byteBuffer.position()));
                    if (mpegAudioFrameSampleCount != -1) {
                        return mpegAudioFrameSampleCount;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iFindTrueHdSyncframeOffset = C11891r5.findTrueHdSyncframeOffset(byteBuffer);
                            if (iFindTrueHdSyncframeOffset == -1) {
                                return 0;
                            }
                            return C11891r5.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return C16006z5.parseAc4SyncframeAudioSampleCount(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i);
                    }
                    break;
            }
            return C11891r5.parseAc3SyncframeAudioSampleCount(byteBuffer);
        }
        return ns4.parseDtsAudioSampleCount(byteBuffer);
    }

    private static String getLooperThreadName(@hib Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNonPcmMaximumEncodedRateBytesPerSecond(int i) {
        int maximumEncodedRateBytesPerSecond = ek5.getMaximumEncodedRateBytesPerSecond(i);
        v80.checkState(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        C11097i c11097i = this.f71814E;
        return c11097i.f71893c == 0 ? this.f71827R / ((long) c11097i.f71892b) : this.f71828S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        return this.f71814E.f71893c == 0 ? t0i.ceilDivide(this.f71829T, r0.f71894d) : this.f71830U;
    }

    private void handleSkippedSilence(long j) {
        this.f71868t0 += j;
        if (this.f71870u0 == null) {
            this.f71870u0 = new Handler(Looper.myLooper());
        }
        this.f71870u0.removeCallbacksAndMessages(null);
        this.f71870u0.postDelayed(new Runnable() { // from class: ms3
            @Override // java.lang.Runnable
            public final void run() {
                this.f61901a.maybeReportSkippedSilence();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasPendingAudioTrackReleases() {
        boolean z;
        synchronized (f71804N0) {
            z = f71806P0 > 0;
        }
        return z;
    }

    private boolean initializeAudioTrack() throws bh0.C1889c {
        j0d j0dVar;
        if (this.f71869u.shouldWaitBeforeRetry()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.f71816G = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.f71816G);
            C11097i c11097i = this.f71814E;
            if (c11097i.f71901k) {
                AudioTrack audioTrack = this.f71816G;
                C1213a c1213a = c11097i.f71891a;
                audioTrack.setOffloadDelayPadding(c1213a.f8269J, c1213a.f8270K);
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (j0dVar = this.f71811B) != null) {
            C11091c.setLogSessionIdOnAudioTrack(this.f71816G, j0dVar);
        }
        jh0 jh0Var = this.f71859p;
        AudioTrack audioTrack2 = this.f71816G;
        C11097i c11097i2 = this.f71814E;
        jh0Var.setAudioTrack(audioTrack2, c11097i2.f71893c == 2, c11097i2.f71897g, c11097i2.f71894d, c11097i2.f71898h, this.f71874w0);
        setVolumeInternal();
        int i = this.f71850k0.f71364a;
        if (i != 0) {
            this.f71816G.attachAuxEffect(i);
            this.f71816G.setAuxEffectSendLevel(this.f71850k0.f71365b);
        }
        vd0 vd0Var = this.f71852l0;
        if (vd0Var != null) {
            C11090b.setPreferredDeviceOnAudioTrack(this.f71816G, vd0Var);
            md0 md0Var = this.f71818I;
            if (md0Var != null) {
                md0Var.setRoutedDevice(this.f71852l0.f90707a);
            }
        }
        md0 md0Var2 = this.f71818I;
        if (md0Var2 != null) {
            this.f71819J = new C11101m(this.f71816G, md0Var2);
        }
        this.f71833X = true;
        int audioSessionId = this.f71816G.getAudioSessionId();
        boolean z = audioSessionId != this.f71846i0;
        this.f71846i0 = audioSessionId;
        bh0.InterfaceC1890d interfaceC1890d = this.f71812C;
        if (interfaceC1890d != null) {
            interfaceC1890d.onAudioTrackInitialized(this.f71814E.buildAudioTrackConfig());
            if (z) {
                this.f71848j0 = true;
                this.f71812C.onAudioSessionIdChanged(this.f71846i0);
            }
        }
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return i == -6 || i == -32;
    }

    private boolean isAudioTrackInitialized() {
        return this.f71816G != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$1(AudioTrack audioTrack, final bh0.InterfaceC1890d interfaceC1890d, Handler handler, final bh0.C1887a c1887a) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC1890d != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: os3
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1890d.onAudioTrackReleased(c1887a);
                    }
                });
            }
            synchronized (f71804N0) {
                try {
                    int i = f71806P0 - 1;
                    f71806P0 = i;
                    if (i == 0) {
                        f71805O0.shutdown();
                        f71805O0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (interfaceC1890d != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: os3
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1890d.onAudioTrackReleased(c1887a);
                    }
                });
            }
            synchronized (f71804N0) {
                try {
                    int i2 = f71806P0 - 1;
                    f71806P0 = i2;
                    if (i2 == 0) {
                        f71805O0.shutdown();
                        f71805O0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void maybeDisableOffload() {
        if (this.f71814E.outputModeIsOffload()) {
            this.f71860p0 = true;
        }
    }

    private ByteBuffer maybeRampUpVolume(ByteBuffer byteBuffer) {
        if (this.f71814E.f71893c != 0) {
            return byteBuffer;
        }
        int iDurationUsToSampleCount = (int) t0i.durationUsToSampleCount(t0i.msToUs(20L), this.f71814E.f71895e);
        long writtenFrames = getWrittenFrames();
        if (writtenFrames >= iDurationUsToSampleCount) {
            return byteBuffer;
        }
        C11097i c11097i = this.f71814E;
        return ilc.rampUpVolume(byteBuffer, c11097i.f71897g, c11097i.f71894d, (int) writtenFrames, iDurationUsToSampleCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.f71868t0 >= 300000) {
            this.f71812C.onSilenceSkipped();
            this.f71868t0 = 0L;
        }
    }

    @z25({"audioCapabilities"})
    private void maybeStartAudioCapabilitiesReceiver() {
        Context context;
        Looper looperMyLooper = Looper.myLooper();
        v80.checkState(this.f71818I == null || this.f71864r0 == looperMyLooper, "DefaultAudioSink accessed on multiple threads: " + getLooperThreadName(this.f71864r0) + " and " + getLooperThreadName(looperMyLooper));
        if (this.f71818I == null && (context = this.f71843h) != null) {
            this.f71864r0 = looperMyLooper;
            md0 md0Var = new md0(context, new md0.InterfaceC9295f() { // from class: ns3
                @Override // p000.md0.InterfaceC9295f
                public final void onAudioCapabilitiesChanged(hd0 hd0Var) {
                    this.f65435a.onAudioCapabilitiesChanged(hd0Var);
                }
            }, this.f71820K, this.f71852l0);
            this.f71818I = md0Var;
            this.f71817H = md0Var.register();
        }
        v80.checkNotNull(this.f71817H);
    }

    private void playPendingData() {
        if (this.f71840e0) {
            return;
        }
        this.f71840e0 = true;
        this.f71859p.handleEndOfStream(getWrittenFrames());
        if (isOffloadedPlayback(this.f71816G)) {
            this.f71841f0 = false;
        }
        this.f71816G.stop();
        this.f71826Q = 0;
    }

    private void processBuffers(long j) throws Exception {
        drainOutputBuffer(j);
        if (this.f71838c0 != null) {
            return;
        }
        if (!this.f71815F.isOperational()) {
            ByteBuffer byteBuffer = this.f71836a0;
            if (byteBuffer != null) {
                setOutputBuffer(byteBuffer);
                drainOutputBuffer(j);
                return;
            }
            return;
        }
        while (!this.f71815F.isEnded()) {
            do {
                ByteBuffer output = this.f71815F.getOutput();
                if (output.hasRemaining()) {
                    setOutputBuffer(output);
                    drainOutputBuffer(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f71836a0;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f71815F.queueInput(this.f71836a0);
                    }
                }
            } while (this.f71838c0 == null);
            return;
        }
    }

    @c5e(29)
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.f71867t == null) {
            this.f71867t = new C11105q();
        }
        this.f71867t.register(audioTrack);
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, @hib final bh0.InterfaceC1890d interfaceC1890d, final bh0.C1887a c1887a) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f71804N0) {
            try {
                if (f71805O0 == null) {
                    f71805O0 = t0i.newSingleThreadScheduledExecutor("ExoPlayer:AudioTrackReleaseThread");
                }
                f71806P0++;
                f71805O0.schedule(new Runnable() { // from class: ls3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ps3.lambda$releaseAudioTrackAsync$1(audioTrack, interfaceC1890d, handler, c1887a);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetSinkStateForFlush() {
        this.f71827R = 0L;
        this.f71828S = 0L;
        this.f71829T = 0L;
        this.f71830U = 0L;
        this.f71862q0 = false;
        this.f71831V = 0;
        this.f71822M = new C11100l(this.f71823N, 0L, 0L);
        this.f71834Y = 0L;
        this.f71821L = null;
        this.f71861q.clear();
        this.f71836a0 = null;
        this.f71837b0 = 0;
        this.f71838c0 = null;
        this.f71840e0 = false;
        this.f71839d0 = false;
        this.f71841f0 = false;
        this.f71825P = null;
        this.f71826Q = 0;
        this.f71851l.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioProcessorPlaybackParameters(ryc rycVar) {
        C11100l c11100l = new C11100l(rycVar, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.f71821L = c11100l;
        } else {
            this.f71822M = c11100l;
        }
    }

    @c5e(23)
    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.f71816G.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f71823N.f80107a).setPitch(this.f71823N.f80108b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                xh9.m25149w("DefaultAudioSink", "Failed to set playback params", e);
            }
            ryc rycVar = new ryc(this.f71816G.getPlaybackParams().getSpeed(), this.f71816G.getPlaybackParams().getPitch());
            this.f71823N = rycVar;
            this.f71859p.setAudioTrackPlaybackSpeed(rycVar.f80107a);
        }
    }

    private void setOutputBuffer(ByteBuffer byteBuffer) {
        v80.checkState(this.f71838c0 == null);
        if (byteBuffer.hasRemaining()) {
            this.f71838c0 = maybeRampUpVolume(byteBuffer);
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            this.f71816G.setVolume(this.f71835Z);
        }
    }

    private void setupAudioProcessors() {
        gf0 gf0Var = this.f71814E.f71899i;
        this.f71815F = gf0Var;
        gf0Var.flush();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        if (!this.f71854m0) {
            C11097i c11097i = this.f71814E;
            if (c11097i.f71893c == 0 && !shouldUseFloatOutput(c11097i.f71891a.f8268I)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.f71847j && t0i.isEncodingHighResolutionPcm(i);
    }

    private boolean useAudioTrackPlaybackParams() {
        C11097i c11097i = this.f71814E;
        return c11097i != null && c11097i.f71900j;
    }

    private static int writeNonBlocking(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSync(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        return audioTrack.write(byteBuffer, i, 1, j * 1000);
    }

    @Override // p000.bh0
    public void configure(C1213a c1213a, int i, @hib int[] iArr) throws bh0.C1888b {
        gf0 gf0Var;
        int pcmFrameSize;
        int pcmFrameSize2;
        boolean z;
        int i2;
        int iIntValue;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int bufferSizeInBytes;
        maybeStartAudioCapabilitiesReceiver();
        if ("audio/raw".equals(c1213a.f8291o)) {
            v80.checkArgument(t0i.isEncodingLinearPcm(c1213a.f8268I));
            pcmFrameSize = t0i.getPcmFrameSize(c1213a.f8268I, c1213a.f8266G);
            kx7.C8541a c8541a = new kx7.C8541a();
            c8541a.addAll((Iterable) this.f71857o);
            if (shouldUseFloatOutput(c1213a.f8268I)) {
                c8541a.add(this.f71855n);
            } else {
                c8541a.add(this.f71853m);
                c8541a.add((Object[]) this.f71845i.getAudioProcessors());
            }
            gf0 gf0Var2 = new gf0(c8541a.build());
            if (gf0Var2.equals(this.f71815F)) {
                gf0Var2 = this.f71815F;
            }
            this.f71851l.setTrimFrameCount(c1213a.f8269J, c1213a.f8270K);
            this.f71849k.setChannelMap(iArr);
            try {
                hf0.C6832a c6832aConfigure = gf0Var2.configure(new hf0.C6832a(c1213a));
                int i9 = c6832aConfigure.f43352c;
                int i10 = c6832aConfigure.f43350a;
                int audioTrackChannelConfig = this.f71877z.getAudioTrackChannelConfig(c6832aConfigure.f43351b);
                i4 = 0;
                z = false;
                pcmFrameSize2 = t0i.getPcmFrameSize(i9, c6832aConfigure.f43351b);
                gf0Var = gf0Var2;
                i2 = i10;
                iIntValue = audioTrackChannelConfig;
                z2 = this.f71863r;
                i3 = i9;
            } catch (hf0.C6833b e) {
                throw new bh0.C1888b(e, c1213a);
            }
        } else {
            gf0 gf0Var3 = new gf0(kx7.m15110of());
            int i11 = c1213a.f8267H;
            oe0 formatOffloadSupport = this.f71865s != 0 ? getFormatOffloadSupport(c1213a) : oe0.f67372d;
            if (this.f71865s == 0 || !formatOffloadSupport.f67373a) {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.f71817H.getEncodingAndChannelConfigForPassthrough(c1213a, this.f71820K);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new bh0.C1888b("Unable to configure passthrough for: " + c1213a, c1213a);
                }
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                gf0Var = gf0Var3;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                z = false;
                i2 = i11;
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i3 = iIntValue2;
                z2 = this.f71863r;
                i4 = 2;
            } else {
                int encoding = rva.getEncoding((String) v80.checkNotNull(c1213a.f8291o), c1213a.f8287k);
                int audioTrackChannelConfig2 = this.f71877z.getAudioTrackChannelConfig(c1213a.f8266G);
                gf0Var = gf0Var3;
                i4 = 1;
                z2 = true;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i2 = i11;
                z = formatOffloadSupport.f67374b;
                i3 = encoding;
                iIntValue = audioTrackChannelConfig2;
            }
        }
        if (i3 == 0) {
            throw new bh0.C1888b("Invalid output encoding (mode=" + i4 + ") for: " + c1213a, c1213a);
        }
        if (iIntValue == 0) {
            throw new bh0.C1888b("Invalid output channel config (mode=" + i4 + ") for: " + c1213a, c1213a);
        }
        int i12 = c1213a.f8286j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c1213a.f8291o) && i12 == -1) {
            i12 = 768000;
        }
        int i13 = i12;
        if (i != 0) {
            bufferSizeInBytes = i;
            i5 = i3;
            i6 = iIntValue;
            i7 = pcmFrameSize2;
            i8 = i2;
        } else {
            i5 = i3;
            i6 = iIntValue;
            i7 = pcmFrameSize2;
            i8 = i2;
            bufferSizeInBytes = this.f71873w.getBufferSizeInBytes(getAudioTrackMinBufferSize(i2, iIntValue, i3), i3, i4, pcmFrameSize2 != -1 ? pcmFrameSize2 : 1, i2, i13, z2 ? 8.0d : 1.0d);
        }
        this.f71860p0 = false;
        C11097i c11097i = new C11097i(c1213a, pcmFrameSize, i4, i7, i8, i6, i5, bufferSizeInBytes, gf0Var, z2, z, this.f71854m0);
        if (isAudioTrackInitialized()) {
            this.f71813D = c11097i;
        } else {
            this.f71814E = c11097i;
        }
    }

    @Override // p000.bh0
    public void disableTunneling() {
        if (this.f71854m0) {
            this.f71854m0 = false;
            flush();
        }
    }

    @Override // p000.bh0
    public void enableTunnelingV21() {
        v80.checkState(this.f71844h0);
        if (this.f71854m0) {
            return;
        }
        this.f71854m0 = true;
        flush();
    }

    @Override // p000.bh0
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.f71859p.isPlaying()) {
                this.f71816G.pause();
            }
            if (isOffloadedPlayback(this.f71816G)) {
                ((C11105q) v80.checkNotNull(this.f71867t)).unregister(this.f71816G);
            }
            bh0.C1887a c1887aBuildAudioTrackConfig = this.f71814E.buildAudioTrackConfig();
            C11097i c11097i = this.f71813D;
            if (c11097i != null) {
                this.f71814E = c11097i;
                this.f71813D = null;
            }
            this.f71859p.reset();
            C11101m c11101m = this.f71819J;
            if (c11101m != null) {
                c11101m.release();
                this.f71819J = null;
            }
            releaseAudioTrackAsync(this.f71816G, this.f71812C, c1887aBuildAudioTrackConfig);
            this.f71816G = null;
        }
        this.f71871v.clear();
        this.f71869u.clear();
        this.f71866s0 = 0L;
        this.f71868t0 = 0L;
        Handler handler = this.f71870u0;
        if (handler != null) {
            ((Handler) v80.checkNotNull(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // p000.bh0
    public uc0 getAudioAttributes() {
        return this.f71820K;
    }

    @Override // p000.bh0
    public long getAudioTrackBufferSizeUs() {
        if (isAudioTrackInitialized()) {
            return C11090b.getAudioTrackBufferSizeUs(this.f71816G, this.f71814E);
        }
        return -9223372036854775807L;
    }

    @Override // p000.bh0
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioTrackInitialized() || this.f71833X) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.f71859p.getCurrentPositionUs(), this.f71814E.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // p000.bh0
    public oe0 getFormatOffloadSupport(C1213a c1213a) {
        return this.f71860p0 ? oe0.f67372d : this.f71875x.getAudioOffloadSupport(c1213a, this.f71820K);
    }

    @Override // p000.bh0
    public int getFormatSupport(C1213a c1213a) {
        maybeStartAudioCapabilitiesReceiver();
        if (!"audio/raw".equals(c1213a.f8291o)) {
            return this.f71817H.isPassthroughPlaybackSupported(c1213a, this.f71820K) ? 2 : 0;
        }
        if (t0i.isEncodingLinearPcm(c1213a.f8268I)) {
            int i = c1213a.f8268I;
            return (i == 2 || (this.f71847j && i == 4)) ? 2 : 1;
        }
        xh9.m25148w("DefaultAudioSink", "Invalid PCM encoding: " + c1213a.f8268I);
        return 0;
    }

    @Override // p000.bh0
    public ryc getPlaybackParameters() {
        return this.f71823N;
    }

    @Override // p000.bh0
    public boolean getSkipSilenceEnabled() {
        return this.f71824O;
    }

    @Override // p000.bh0
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.f71836a0;
        v80.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f71813D != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.f71813D.canReuseAudioTrack(this.f71814E)) {
                this.f71814E = this.f71813D;
                this.f71813D = null;
                AudioTrack audioTrack = this.f71816G;
                if (audioTrack != null && isOffloadedPlayback(audioTrack) && this.f71814E.f71901k) {
                    if (this.f71816G.getPlayState() == 3) {
                        this.f71816G.setOffloadEndOfStream();
                        this.f71859p.expectRawPlaybackHeadReset();
                    }
                    AudioTrack audioTrack2 = this.f71816G;
                    C1213a c1213a = this.f71814E.f71891a;
                    audioTrack2.setOffloadDelayPadding(c1213a.f8269J, c1213a.f8270K);
                    this.f71862q0 = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (bh0.C1889c e) {
                if (e.f13724b) {
                    throw e;
                }
                this.f71869u.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.f71869u.clear();
        if (this.f71833X) {
            this.f71834Y = Math.max(0L, j);
            this.f71832W = false;
            this.f71833X = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.f71842g0) {
                play();
            }
        }
        if (!this.f71859p.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.f71836a0 == null) {
            v80.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C11097i c11097i = this.f71814E;
            if (c11097i.f71893c != 0 && this.f71831V == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(c11097i.f71897g, byteBuffer);
                this.f71831V = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.f71821L != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.f71821L = null;
            }
            long jInputFramesToDurationUs = this.f71834Y + this.f71814E.inputFramesToDurationUs(getSubmittedFrames() - this.f71851l.getTrimmedFrameCount());
            if (!this.f71832W && Math.abs(jInputFramesToDurationUs - j) > 200000) {
                bh0.InterfaceC1890d interfaceC1890d = this.f71812C;
                if (interfaceC1890d != null) {
                    interfaceC1890d.onAudioSinkError(new bh0.C1893g(j, jInputFramesToDurationUs));
                }
                this.f71832W = true;
            }
            if (this.f71832W) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j2 = j - jInputFramesToDurationUs;
                this.f71834Y += j2;
                this.f71832W = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                bh0.InterfaceC1890d interfaceC1890d2 = this.f71812C;
                if (interfaceC1890d2 != null && j2 != 0) {
                    interfaceC1890d2.onPositionDiscontinuity();
                }
            }
            if (this.f71814E.f71893c == 0) {
                this.f71827R += (long) byteBuffer.remaining();
            } else {
                this.f71828S += ((long) this.f71831V) * ((long) i);
            }
            this.f71836a0 = byteBuffer;
            this.f71837b0 = i;
        }
        processBuffers(j);
        if (!this.f71836a0.hasRemaining()) {
            this.f71836a0 = null;
            this.f71837b0 = 0;
            return true;
        }
        if (!this.f71859p.isStalled(getWrittenFrames())) {
            return false;
        }
        xh9.m25148w("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // p000.bh0
    public void handleDiscontinuity() {
        this.f71832W = true;
    }

    @Override // p000.bh0
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && !(Build.VERSION.SDK_INT >= 29 && this.f71816G.isOffloadedPlayback() && this.f71841f0) && this.f71859p.hasPendingData(getWrittenFrames());
    }

    @Override // p000.bh0
    public boolean isEnded() {
        return !isAudioTrackInitialized() || (this.f71839d0 && !hasPendingData());
    }

    public void onAudioCapabilitiesChanged(hd0 hd0Var) {
        Looper looperMyLooper = Looper.myLooper();
        v80.checkState(this.f71864r0 == looperMyLooper, "Current looper (" + getLooperThreadName(looperMyLooper) + ") is not the playback looper (" + getLooperThreadName(this.f71864r0) + c0b.f15434d);
        hd0 hd0Var2 = this.f71817H;
        if (hd0Var2 == null || hd0Var.equals(hd0Var2)) {
            return;
        }
        this.f71817H = hd0Var;
        bh0.InterfaceC1890d interfaceC1890d = this.f71812C;
        if (interfaceC1890d != null) {
            interfaceC1890d.onAudioCapabilitiesChanged();
        }
    }

    @Override // p000.bh0
    public void pause() {
        this.f71842g0 = false;
        if (isAudioTrackInitialized()) {
            this.f71859p.pause();
            if (!this.f71840e0 || isOffloadedPlayback(this.f71816G)) {
                this.f71816G.pause();
            }
        }
    }

    @Override // p000.bh0
    public void play() {
        this.f71842g0 = true;
        if (isAudioTrackInitialized()) {
            this.f71859p.start();
            if (!this.f71840e0 || isOffloadedPlayback(this.f71816G)) {
                this.f71816G.play();
            }
        }
    }

    @Override // p000.bh0
    public void playToEndOfStream() throws bh0.C1894h {
        if (!this.f71839d0 && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.f71839d0 = true;
        }
    }

    @Override // p000.bh0
    public void release() {
        md0 md0Var = this.f71818I;
        if (md0Var != null) {
            md0Var.unregister();
        }
    }

    @Override // p000.bh0
    public void reset() {
        flush();
        quh<hf0> it = this.f71857o.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        this.f71853m.reset();
        this.f71855n.reset();
        gf0 gf0Var = this.f71815F;
        if (gf0Var != null) {
            gf0Var.reset();
        }
        this.f71842g0 = false;
        this.f71860p0 = false;
    }

    @Override // p000.bh0
    public void setAudioAttributes(uc0 uc0Var) {
        if (this.f71820K.equals(uc0Var)) {
            return;
        }
        this.f71820K = uc0Var;
        if (this.f71854m0) {
            return;
        }
        md0 md0Var = this.f71818I;
        if (md0Var != null) {
            md0Var.setAudioAttributes(uc0Var);
        }
        flush();
    }

    @Override // p000.bh0
    public void setAudioSessionId(int i) {
        if (this.f71848j0) {
            if (this.f71846i0 != i) {
                return;
            } else {
                this.f71848j0 = false;
            }
        }
        if (this.f71846i0 != i) {
            this.f71846i0 = i;
            this.f71844h0 = i != 0;
            flush();
        }
    }

    @Override // p000.bh0
    public void setAuxEffectInfo(pm0 pm0Var) {
        if (this.f71850k0.equals(pm0Var)) {
            return;
        }
        int i = pm0Var.f71364a;
        float f = pm0Var.f71365b;
        AudioTrack audioTrack = this.f71816G;
        if (audioTrack != null) {
            if (this.f71850k0.f71364a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f71816G.setAuxEffectSendLevel(f);
            }
        }
        this.f71850k0 = pm0Var;
    }

    @Override // p000.bh0
    public void setClock(j52 j52Var) {
        this.f71859p.setClock(j52Var);
    }

    @Override // p000.bh0
    public void setListener(bh0.InterfaceC1890d interfaceC1890d) {
        this.f71812C = interfaceC1890d;
    }

    @Override // p000.bh0
    @c5e(29)
    public void setOffloadDelayPadding(int i, int i2) {
        C11097i c11097i;
        AudioTrack audioTrack = this.f71816G;
        if (audioTrack == null || !isOffloadedPlayback(audioTrack) || (c11097i = this.f71814E) == null || !c11097i.f71901k) {
            return;
        }
        this.f71816G.setOffloadDelayPadding(i, i2);
    }

    @Override // p000.bh0
    @c5e(29)
    public void setOffloadMode(int i) {
        v80.checkState(Build.VERSION.SDK_INT >= 29);
        this.f71865s = i;
    }

    @Override // p000.bh0
    public void setPlaybackParameters(ryc rycVar) {
        this.f71823N = new ryc(t0i.constrainValue(rycVar.f80107a, 0.1f, 8.0f), t0i.constrainValue(rycVar.f80108b, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(rycVar);
        }
    }

    @Override // p000.bh0
    public void setPlayerId(@hib j0d j0dVar) {
        this.f71811B = j0dVar;
    }

    @Override // p000.bh0
    @c5e(23)
    public void setPreferredDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        this.f71852l0 = audioDeviceInfo == null ? null : new vd0(audioDeviceInfo);
        md0 md0Var = this.f71818I;
        if (md0Var != null) {
            md0Var.setRoutedDevice(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f71816G;
        if (audioTrack != null) {
            C11090b.setPreferredDeviceOnAudioTrack(audioTrack, this.f71852l0);
        }
    }

    @Override // p000.bh0
    public void setSkipSilenceEnabled(boolean z) {
        this.f71824O = z;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? ryc.f80104d : this.f71823N);
    }

    @Override // p000.bh0
    public void setVolume(float f) {
        if (this.f71835Z != f) {
            this.f71835Z = f;
            setVolumeInternal();
        }
    }

    @Override // p000.bh0
    public boolean supportsFormat(C1213a c1213a) {
        return getFormatSupport(c1213a) != 0;
    }

    @g5e({"#1.audioProcessorChain"})
    private ps3(C11096h c11096h) {
        Context applicationContext = c11096h.f71880a == null ? null : c11096h.f71880a.getApplicationContext();
        this.f71843h = applicationContext;
        this.f71820K = uc0.f87467h;
        this.f71817H = applicationContext != null ? null : c11096h.f71881b;
        this.f71845i = c11096h.f71882c;
        this.f71847j = c11096h.f71883d;
        int i = Build.VERSION.SDK_INT;
        this.f71863r = c11096h.f71884e;
        this.f71865s = 0;
        this.f71873w = c11096h.f71886g;
        this.f71875x = (InterfaceC11092d) v80.checkNotNull(c11096h.f71888i);
        this.f71859p = new jh0(new C11104p());
        su1 su1Var = new su1();
        this.f71849k = su1Var;
        cjh cjhVar = new cjh();
        this.f71851l = cjhVar;
        this.f71853m = new j3h();
        this.f71855n = new h3h();
        this.f71857o = kx7.m15112of((su1) cjhVar, su1Var);
        this.f71835Z = 1.0f;
        this.f71846i0 = 0;
        this.f71850k0 = new pm0(0, 0.0f);
        ryc rycVar = ryc.f80104d;
        this.f71822M = new C11100l(rycVar, 0L, 0L);
        this.f71823N = rycVar;
        this.f71824O = false;
        this.f71861q = new ArrayDeque<>();
        this.f71869u = new C11103o<>();
        this.f71871v = new C11103o<>();
        this.f71876y = c11096h.f71890k;
        this.f71877z = c11096h.f71887h;
        this.f71810A = (i < 34 || c11096h.f71880a == null) ? -1 : getDeviceIdFromContext(c11096h.f71880a);
        this.f71874w0 = c11096h.f71889j;
    }

    /* JADX INFO: renamed from: ps3$h */
    public static final class C11096h {

        /* JADX INFO: renamed from: a */
        @hib
        public final Context f71880a;

        /* JADX INFO: renamed from: b */
        public hd0 f71881b;

        /* JADX INFO: renamed from: c */
        @hib
        public kf0 f71882c;

        /* JADX INFO: renamed from: d */
        public boolean f71883d;

        /* JADX INFO: renamed from: e */
        public boolean f71884e;

        /* JADX INFO: renamed from: f */
        public boolean f71885f;

        /* JADX INFO: renamed from: g */
        public InterfaceC11094f f71886g;

        /* JADX INFO: renamed from: h */
        public InterfaceC11095g f71887h;

        /* JADX INFO: renamed from: i */
        public InterfaceC11092d f71888i;

        /* JADX INFO: renamed from: j */
        public boolean f71889j;

        /* JADX INFO: renamed from: k */
        @hib
        public ExoPlayer.InterfaceC1218a f71890k;

        @Deprecated
        public C11096h() {
            this.f71889j = true;
            this.f71880a = null;
            this.f71881b = hd0.f43165e;
            this.f71886g = InterfaceC11094f.f71878a;
            this.f71887h = InterfaceC11095g.f71879a;
        }

        public ps3 build() {
            v80.checkState(!this.f71885f);
            this.f71885f = true;
            if (this.f71882c == null) {
                this.f71882c = new C11098j(new hf0[0]);
            }
            if (this.f71888i == null) {
                this.f71888i = new cs3(this.f71880a);
            }
            return new ps3(this);
        }

        @op1
        @Deprecated
        public C11096h setAudioCapabilities(hd0 hd0Var) {
            v80.checkNotNull(hd0Var);
            this.f71881b = hd0Var;
            return this;
        }

        @op1
        public C11096h setAudioOffloadSupportProvider(InterfaceC11092d interfaceC11092d) {
            this.f71888i = interfaceC11092d;
            return this;
        }

        @op1
        public C11096h setAudioProcessorChain(kf0 kf0Var) {
            v80.checkNotNull(kf0Var);
            this.f71882c = kf0Var;
            return this;
        }

        @op1
        public C11096h setAudioProcessors(hf0[] hf0VarArr) {
            v80.checkNotNull(hf0VarArr);
            return setAudioProcessorChain(new C11098j(hf0VarArr));
        }

        @op1
        public C11096h setAudioTrackBufferSizeProvider(InterfaceC11094f interfaceC11094f) {
            this.f71886g = interfaceC11094f;
            return this;
        }

        @op1
        public C11096h setAudioTrackProvider(InterfaceC11095g interfaceC11095g) {
            this.f71887h = interfaceC11095g;
            return this;
        }

        @op1
        public C11096h setEnableAudioTrackPlaybackParams(boolean z) {
            this.f71884e = z;
            return this;
        }

        @op1
        public C11096h setEnableFloatOutput(boolean z) {
            this.f71883d = z;
            return this;
        }

        @op1
        public C11096h setEnableOnAudioPositionAdvancingFix(boolean z) {
            this.f71889j = z;
            return this;
        }

        @op1
        public C11096h setExperimentalAudioOffloadListener(@hib ExoPlayer.InterfaceC1218a interfaceC1218a) {
            this.f71890k = interfaceC1218a;
            return this;
        }

        public C11096h(Context context) {
            this.f71889j = true;
            this.f71880a = context;
            this.f71881b = hd0.f43165e;
            this.f71886g = InterfaceC11094f.f71878a;
            this.f71887h = InterfaceC11095g.f71879a;
        }
    }

    private AudioTrack buildAudioTrack(bh0.C1887a c1887a, uc0 uc0Var, int i, C1213a c1213a, @hib Context context) throws bh0.C1889c {
        try {
            AudioTrack audioTrack = this.f71877z.getAudioTrack(c1887a, uc0Var, i, context);
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new bh0.C1889c(state, c1887a.f13717b, c1887a.f13718c, c1887a.f13716a, c1887a.f13721f, c1213a, c1887a.f13720e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new bh0.C1889c(0, c1887a.f13717b, c1887a.f13718c, c1887a.f13716a, c1887a.f13721f, c1213a, c1887a.f13720e, e);
        }
    }
}
