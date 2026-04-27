package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p000.ca5;
import p000.ch0;
import p000.if0;
import p000.kh0;
import p000.kx7;
import p000.nd0;
import p000.ws3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class us3 implements ch0 {

    /* JADX INFO: renamed from: A0 */
    public static final int f88909A0 = 100;

    /* JADX INFO: renamed from: B0 */
    public static final String f88910B0 = "DefaultAudioSink";

    /* JADX INFO: renamed from: C0 */
    public static boolean f88911C0 = false;

    /* JADX INFO: renamed from: D0 */
    public static final Object f88912D0 = new Object();

    /* JADX INFO: renamed from: E0 */
    @xc7("releaseExecutorLock")
    @hib
    public static ExecutorService f88913E0 = null;

    /* JADX INFO: renamed from: F0 */
    @xc7("releaseExecutorLock")
    public static int f88914F0 = 0;

    /* JADX INFO: renamed from: l0 */
    public static final int f88915l0 = 1000000;

    /* JADX INFO: renamed from: m0 */
    public static final float f88916m0 = 1.0f;

    /* JADX INFO: renamed from: n0 */
    public static final float f88917n0 = 0.1f;

    /* JADX INFO: renamed from: o0 */
    public static final float f88918o0 = 8.0f;

    /* JADX INFO: renamed from: p0 */
    public static final float f88919p0 = 0.1f;

    /* JADX INFO: renamed from: q0 */
    public static final float f88920q0 = 8.0f;

    /* JADX INFO: renamed from: r0 */
    public static final boolean f88921r0 = false;

    /* JADX INFO: renamed from: s0 */
    public static final int f88922s0 = 0;

    /* JADX INFO: renamed from: t0 */
    public static final int f88923t0 = 1;

    /* JADX INFO: renamed from: u0 */
    public static final int f88924u0 = 2;

    /* JADX INFO: renamed from: v0 */
    public static final int f88925v0 = 3;

    /* JADX INFO: renamed from: w0 */
    public static final int f88926w0 = 0;

    /* JADX INFO: renamed from: x0 */
    public static final int f88927x0 = 1;

    /* JADX INFO: renamed from: y0 */
    public static final int f88928y0 = 2;

    /* JADX INFO: renamed from: z0 */
    public static final int f88929z0 = -32;

    /* JADX INFO: renamed from: A */
    @hib
    public AudioTrack f88930A;

    /* JADX INFO: renamed from: B */
    public ld0 f88931B;

    /* JADX INFO: renamed from: C */
    public nd0 f88932C;

    /* JADX INFO: renamed from: D */
    public yc0 f88933D;

    /* JADX INFO: renamed from: E */
    @hib
    public C13686l f88934E;

    /* JADX INFO: renamed from: F */
    public C13686l f88935F;

    /* JADX INFO: renamed from: G */
    public qyc f88936G;

    /* JADX INFO: renamed from: H */
    public boolean f88937H;

    /* JADX INFO: renamed from: I */
    @hib
    public ByteBuffer f88938I;

    /* JADX INFO: renamed from: J */
    public int f88939J;

    /* JADX INFO: renamed from: K */
    public long f88940K;

    /* JADX INFO: renamed from: L */
    public long f88941L;

    /* JADX INFO: renamed from: M */
    public long f88942M;

    /* JADX INFO: renamed from: N */
    public long f88943N;

    /* JADX INFO: renamed from: O */
    public int f88944O;

    /* JADX INFO: renamed from: P */
    public boolean f88945P;

    /* JADX INFO: renamed from: Q */
    public boolean f88946Q;

    /* JADX INFO: renamed from: R */
    public long f88947R;

    /* JADX INFO: renamed from: S */
    public float f88948S;

    /* JADX INFO: renamed from: T */
    @hib
    public ByteBuffer f88949T;

    /* JADX INFO: renamed from: U */
    public int f88950U;

    /* JADX INFO: renamed from: V */
    @hib
    public ByteBuffer f88951V;

    /* JADX INFO: renamed from: W */
    public byte[] f88952W;

    /* JADX INFO: renamed from: X */
    public int f88953X;

    /* JADX INFO: renamed from: Y */
    public boolean f88954Y;

    /* JADX INFO: renamed from: Z */
    public boolean f88955Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f88956a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f88957b0;

    /* JADX INFO: renamed from: c0 */
    public int f88958c0;

    /* JADX INFO: renamed from: d0 */
    public om0 f88959d0;

    /* JADX INFO: renamed from: e */
    @hib
    public final Context f88960e;

    /* JADX INFO: renamed from: e0 */
    @hib
    public C13679e f88961e0;

    /* JADX INFO: renamed from: f */
    public final jf0 f88962f;

    /* JADX INFO: renamed from: f0 */
    public boolean f88963f0;

    /* JADX INFO: renamed from: g */
    public final boolean f88964g;

    /* JADX INFO: renamed from: g0 */
    public long f88965g0;

    /* JADX INFO: renamed from: h */
    public final ru1 f88966h;

    /* JADX INFO: renamed from: h0 */
    public long f88967h0;

    /* JADX INFO: renamed from: i */
    public final bjh f88968i;

    /* JADX INFO: renamed from: i0 */
    public boolean f88969i0;

    /* JADX INFO: renamed from: j */
    public final kx7<if0> f88970j;

    /* JADX INFO: renamed from: j0 */
    public boolean f88971j0;

    /* JADX INFO: renamed from: k */
    public final kx7<if0> f88972k;

    /* JADX INFO: renamed from: k0 */
    @hib
    public Looper f88973k0;

    /* JADX INFO: renamed from: l */
    public final wp2 f88974l;

    /* JADX INFO: renamed from: m */
    public final kh0 f88975m;

    /* JADX INFO: renamed from: n */
    public final ArrayDeque<C13686l> f88976n;

    /* JADX INFO: renamed from: o */
    public final boolean f88977o;

    /* JADX INFO: renamed from: p */
    public final int f88978p;

    /* JADX INFO: renamed from: q */
    public C13675a f88979q;

    /* JADX INFO: renamed from: r */
    public final C13689o<ch0.C2309b> f88980r;

    /* JADX INFO: renamed from: s */
    public final C13689o<ch0.C2313f> f88981s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC13681g f88982t;

    /* JADX INFO: renamed from: u */
    @hib
    public final ca5.InterfaceC2248b f88983u;

    /* JADX INFO: renamed from: v */
    @hib
    public k0d f88984v;

    /* JADX INFO: renamed from: w */
    @hib
    public ch0.InterfaceC2310c f88985w;

    /* JADX INFO: renamed from: x */
    @hib
    public C13683i f88986x;

    /* JADX INFO: renamed from: y */
    public C13683i f88987y;

    /* JADX INFO: renamed from: z */
    public ff0 f88988z;

    /* JADX INFO: renamed from: us3$a */
    @c5e(29)
    public final class C13675a {

        /* JADX INFO: renamed from: a */
        public final Handler f88989a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b */
        public final AudioTrack$StreamEventCallback f88990b;

        /* JADX INFO: renamed from: us3$a$a */
        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ us3 f88992a;

            public a(us3 us3Var) {
                this.f88992a = us3Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(us3.this.f88930A) && us3.this.f88985w != null && us3.this.f88956a0) {
                    us3.this.f88985w.onOffloadBufferEmptying();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(us3.this.f88930A) && us3.this.f88985w != null && us3.this.f88956a0) {
                    us3.this.f88985w.onOffloadBufferEmptying();
                }
            }
        }

        public C13675a() {
            this.f88990b = new a(us3.this);
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.f88989a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new gp2(handler), this.f88990b);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f88990b);
            this.f88989a.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: us3$c */
    @c5e(23)
    public static final class C13677c {
        private C13677c() {
        }

        @ih4
        public static void setPreferredDeviceOnAudioTrack(AudioTrack audioTrack, @hib C13679e c13679e) {
            audioTrack.setPreferredDevice(c13679e == null ? null : c13679e.f88994a);
        }
    }

    /* JADX INFO: renamed from: us3$d */
    @c5e(31)
    public static final class C13678d {
        private C13678d() {
        }

        @ih4
        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, k0d k0dVar) {
            LogSessionId logSessionId = k0dVar.getLogSessionId();
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    /* JADX INFO: renamed from: us3$e */
    @c5e(23)
    public static final class C13679e {

        /* JADX INFO: renamed from: a */
        public final AudioDeviceInfo f88994a;

        public C13679e(AudioDeviceInfo audioDeviceInfo) {
            this.f88994a = audioDeviceInfo;
        }
    }

    /* JADX INFO: renamed from: us3$f */
    @Deprecated
    public interface InterfaceC13680f extends jf0 {
    }

    /* JADX INFO: renamed from: us3$g */
    public interface InterfaceC13681g {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC13681g f88995a = new ws3.C14767a().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    /* JADX INFO: renamed from: us3$i */
    public static final class C13683i {

        /* JADX INFO: renamed from: a */
        public final kq6 f89004a;

        /* JADX INFO: renamed from: b */
        public final int f89005b;

        /* JADX INFO: renamed from: c */
        public final int f89006c;

        /* JADX INFO: renamed from: d */
        public final int f89007d;

        /* JADX INFO: renamed from: e */
        public final int f89008e;

        /* JADX INFO: renamed from: f */
        public final int f89009f;

        /* JADX INFO: renamed from: g */
        public final int f89010g;

        /* JADX INFO: renamed from: h */
        public final int f89011h;

        /* JADX INFO: renamed from: i */
        public final ff0 f89012i;

        /* JADX INFO: renamed from: j */
        public final boolean f89013j;

        public C13683i(kq6 kq6Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, ff0 ff0Var, boolean z) {
            this.f89004a = kq6Var;
            this.f89005b = i;
            this.f89006c = i2;
            this.f89007d = i3;
            this.f89008e = i4;
            this.f89009f = i5;
            this.f89010g = i6;
            this.f89011h = i7;
            this.f89012i = ff0Var;
            this.f89013j = z;
        }

        private AudioTrack createAudioTrack(boolean z, yc0 yc0Var, int i) {
            int i2 = x0i.f95978a;
            return i2 >= 29 ? createAudioTrackV29(z, yc0Var, i) : i2 >= 21 ? createAudioTrackV21(z, yc0Var, i) : createAudioTrackV9(yc0Var, i);
        }

        @c5e(21)
        private AudioTrack createAudioTrackV21(boolean z, yc0 yc0Var, int i) {
            return new AudioTrack(getAudioTrackAttributesV21(yc0Var, z), us3.getAudioFormat(this.f89008e, this.f89009f, this.f89010g), this.f89011h, 1, i);
        }

        @c5e(29)
        private AudioTrack createAudioTrackV29(boolean z, yc0 yc0Var, int i) {
            return new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(yc0Var, z)).setAudioFormat(us3.getAudioFormat(this.f89008e, this.f89009f, this.f89010g)).setTransferMode(1).setBufferSizeInBytes(this.f89011h).setSessionId(i).setOffloadedPlayback(this.f89006c == 1).build();
        }

        private AudioTrack createAudioTrackV9(yc0 yc0Var, int i) {
            int streamTypeForAudioUsage = x0i.getStreamTypeForAudioUsage(yc0Var.f101072c);
            return i == 0 ? new AudioTrack(streamTypeForAudioUsage, this.f89008e, this.f89009f, this.f89010g, this.f89011h, 1) : new AudioTrack(streamTypeForAudioUsage, this.f89008e, this.f89009f, this.f89010g, this.f89011h, 1, i);
        }

        @c5e(21)
        private static AudioAttributes getAudioTrackAttributesV21(yc0 yc0Var, boolean z) {
            return z ? getAudioTrackTunnelingAttributesV21() : yc0Var.getAudioAttributesV21().f101076a;
        }

        @c5e(21)
        private static AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack buildAudioTrack(boolean z, yc0 yc0Var, int i) throws ch0.C2309b {
            try {
                AudioTrack audioTrackCreateAudioTrack = createAudioTrack(z, yc0Var, i);
                int state = audioTrackCreateAudioTrack.getState();
                if (state == 1) {
                    return audioTrackCreateAudioTrack;
                }
                try {
                    audioTrackCreateAudioTrack.release();
                } catch (Exception unused) {
                }
                throw new ch0.C2309b(state, this.f89008e, this.f89009f, this.f89011h, this.f89004a, outputModeIsOffload(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new ch0.C2309b(0, this.f89008e, this.f89009f, this.f89011h, this.f89004a, outputModeIsOffload(), e);
            }
        }

        public boolean canReuseAudioTrack(C13683i c13683i) {
            return c13683i.f89006c == this.f89006c && c13683i.f89010g == this.f89010g && c13683i.f89008e == this.f89008e && c13683i.f89009f == this.f89009f && c13683i.f89007d == this.f89007d && c13683i.f89013j == this.f89013j;
        }

        public C13683i copyWithBufferSize(int i) {
            return new C13683i(this.f89004a, this.f89005b, this.f89006c, this.f89007d, this.f89008e, this.f89009f, this.f89010g, i, this.f89012i, this.f89013j);
        }

        public long framesToDurationUs(long j) {
            return x0i.sampleCountToDurationUs(j, this.f89008e);
        }

        public long inputFramesToDurationUs(long j) {
            return x0i.sampleCountToDurationUs(j, this.f89004a.f55009f2);
        }

        public boolean outputModeIsOffload() {
            return this.f89006c == 1;
        }
    }

    /* JADX INFO: renamed from: us3$j */
    public static class C13684j implements InterfaceC13680f {

        /* JADX INFO: renamed from: a */
        public final if0[] f89014a;

        /* JADX INFO: renamed from: b */
        public final ocf f89015b;

        /* JADX INFO: renamed from: c */
        public final hvf f89016c;

        public C13684j(if0... if0VarArr) {
            this(if0VarArr, new ocf(), new hvf());
        }

        @Override // p000.jf0
        public qyc applyPlaybackParameters(qyc qycVar) {
            this.f89016c.setSpeed(qycVar.f76315a);
            this.f89016c.setPitch(qycVar.f76316b);
            return qycVar;
        }

        @Override // p000.jf0
        public boolean applySkipSilenceEnabled(boolean z) {
            this.f89015b.setEnabled(z);
            return z;
        }

        @Override // p000.jf0
        public if0[] getAudioProcessors() {
            return this.f89014a;
        }

        @Override // p000.jf0
        public long getMediaDuration(long j) {
            return this.f89016c.getMediaDuration(j);
        }

        @Override // p000.jf0
        public long getSkippedOutputFrameCount() {
            return this.f89015b.getSkippedFrames();
        }

        public C13684j(if0[] if0VarArr, ocf ocfVar, hvf hvfVar) {
            if0[] if0VarArr2 = new if0[if0VarArr.length + 2];
            this.f89014a = if0VarArr2;
            System.arraycopy(if0VarArr, 0, if0VarArr2, 0, if0VarArr.length);
            this.f89015b = ocfVar;
            this.f89016c = hvfVar;
            if0VarArr2[if0VarArr.length] = ocfVar;
            if0VarArr2[if0VarArr.length + 1] = hvfVar;
        }
    }

    /* JADX INFO: renamed from: us3$k */
    public static final class C13685k extends RuntimeException {
        private C13685k(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: us3$l */
    public static final class C13686l {

        /* JADX INFO: renamed from: a */
        public final qyc f89017a;

        /* JADX INFO: renamed from: b */
        public final long f89018b;

        /* JADX INFO: renamed from: c */
        public final long f89019c;

        private C13686l(qyc qycVar, long j, long j2) {
            this.f89017a = qycVar;
            this.f89018b = j;
            this.f89019c = j2;
        }
    }

    /* JADX INFO: renamed from: us3$m */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13687m {
    }

    /* JADX INFO: renamed from: us3$n */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC13688n {
    }

    /* JADX INFO: renamed from: us3$o */
    public static final class C13689o<T extends Exception> {

        /* JADX INFO: renamed from: a */
        public final long f89020a;

        /* JADX INFO: renamed from: b */
        @hib
        public T f89021b;

        /* JADX INFO: renamed from: c */
        public long f89022c;

        public C13689o(long j) {
            this.f89020a = j;
        }

        public void clear() {
            this.f89021b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f89021b == null) {
                this.f89021b = t;
                this.f89022c = this.f89020a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f89022c) {
                T t2 = this.f89021b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f89021b;
                clear();
                throw t3;
            }
        }
    }

    /* JADX INFO: renamed from: us3$p */
    public final class C13690p implements kh0.InterfaceC8363a {
        private C13690p() {
        }

        @Override // p000.kh0.InterfaceC8363a
        public void onInvalidLatency(long j) {
            yh9.m25919w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // p000.kh0.InterfaceC8363a
        public void onPositionAdvancing(long j) {
            if (us3.this.f88985w != null) {
                us3.this.f88985w.onPositionAdvancing(j);
            }
        }

        @Override // p000.kh0.InterfaceC8363a
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + us3.this.getSubmittedFrames() + ", " + us3.this.getWrittenFrames();
            if (us3.f88911C0) {
                throw new C13685k(str);
            }
            yh9.m25919w("DefaultAudioSink", str);
        }

        @Override // p000.kh0.InterfaceC8363a
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + us3.this.getSubmittedFrames() + ", " + us3.this.getWrittenFrames();
            if (us3.f88911C0) {
                throw new C13685k(str);
            }
            yh9.m25919w("DefaultAudioSink", str);
        }

        @Override // p000.kh0.InterfaceC8363a
        public void onUnderrun(int i, long j) {
            if (us3.this.f88985w != null) {
                us3.this.f88985w.onUnderrun(i, j, SystemClock.elapsedRealtime() - us3.this.f88967h0);
            }
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        qyc qycVarApplyPlaybackParameters;
        if (useAudioTrackPlaybackParams()) {
            qycVarApplyPlaybackParameters = qyc.f76311d;
        } else {
            qycVarApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.f88962f.applyPlaybackParameters(this.f88936G) : qyc.f76311d;
            this.f88936G = qycVarApplyPlaybackParameters;
        }
        qyc qycVar = qycVarApplyPlaybackParameters;
        this.f88937H = shouldApplyAudioProcessorPlaybackParameters() ? this.f88962f.applySkipSilenceEnabled(this.f88937H) : false;
        this.f88976n.add(new C13686l(qycVar, Math.max(0L, j), this.f88987y.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        ch0.InterfaceC2310c interfaceC2310c = this.f88985w;
        if (interfaceC2310c != null) {
            interfaceC2310c.onSkipSilenceEnabledChanged(this.f88937H);
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.f88976n.isEmpty() && j >= this.f88976n.getFirst().f89019c) {
            this.f88935F = this.f88976n.remove();
        }
        C13686l c13686l = this.f88935F;
        long j2 = j - c13686l.f89019c;
        if (c13686l.f89017a.equals(qyc.f76311d)) {
            return this.f88935F.f89018b + j2;
        }
        if (this.f88976n.isEmpty()) {
            return this.f88935F.f89018b + this.f88962f.getMediaDuration(j2);
        }
        C13686l first = this.f88976n.getFirst();
        return first.f89018b - x0i.getMediaDurationForPlayoutDuration(first.f89019c - j, this.f88935F.f89017a.f76315a);
    }

    private long applySkipping(long j) {
        return j + this.f88987y.framesToDurationUs(this.f88962f.getSkippedOutputFrameCount());
    }

    private AudioTrack buildAudioTrack(C13683i c13683i) throws ch0.C2309b {
        try {
            AudioTrack audioTrackBuildAudioTrack = c13683i.buildAudioTrack(this.f88963f0, this.f88933D, this.f88958c0);
            ca5.InterfaceC2248b interfaceC2248b = this.f88983u;
            if (interfaceC2248b != null) {
                interfaceC2248b.onExperimentalOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            }
            return audioTrackBuildAudioTrack;
        } catch (ch0.C2309b e) {
            ch0.InterfaceC2310c interfaceC2310c = this.f88985w;
            if (interfaceC2310c != null) {
                interfaceC2310c.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws ch0.C2309b {
        try {
            return buildAudioTrack((C13683i) u80.checkNotNull(this.f88987y));
        } catch (ch0.C2309b e) {
            C13683i c13683i = this.f88987y;
            if (c13683i.f89011h > 1000000) {
                C13683i c13683iCopyWithBufferSize = c13683i.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(c13683iCopyWithBufferSize);
                    this.f88987y = c13683iCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (ch0.C2309b e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    private boolean drainToEndOfStream() throws Exception {
        if (!this.f88988z.isOperational()) {
            ByteBuffer byteBuffer = this.f88951V;
            if (byteBuffer == null) {
                return true;
            }
            writeBuffer(byteBuffer, Long.MIN_VALUE);
            return this.f88951V == null;
        }
        this.f88988z.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        if (!this.f88988z.isEnded()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f88951V;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private ld0 getAudioCapabilities() {
        if (this.f88932C == null && this.f88960e != null) {
            this.f88973k0 = Looper.myLooper();
            nd0 nd0Var = new nd0(this.f88960e, new nd0.InterfaceC9789f() { // from class: js3
                @Override // p000.nd0.InterfaceC9789f
                public final void onAudioCapabilitiesChanged(ld0 ld0Var) {
                    this.f51656a.onAudioCapabilitiesChanged(ld0Var);
                }
            });
            this.f88932C = nd0Var;
            this.f88931B = nd0Var.register();
        }
        return this.f88931B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @c5e(21)
    public static AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        u80.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C12443s5.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return os4.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int mpegAudioFrameSampleCount = p1b.parseMpegAudioFrameSampleCount(x0i.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int iFindTrueHdSyncframeOffset = C12443s5.findTrueHdSyncframeOffset(byteBuffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return C12443s5.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C0070a6.parseAc4SyncframeAudioSampleCount(byteBuffer);
            case 20:
                return l7c.parseOggPacketAudioSampleCount(byteBuffer);
        }
    }

    @c5e(29)
    @igg({"InlinedApi"})
    private int getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = x0i.f95978a;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i == 30 && x0i.f95981d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        C13683i c13683i = this.f88987y;
        return c13683i.f89006c == 0 ? this.f88940K / ((long) c13683i.f89005b) : this.f88941L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        C13683i c13683i = this.f88987y;
        return c13683i.f89006c == 0 ? this.f88942M / ((long) c13683i.f89007d) : this.f88943N;
    }

    private boolean initializeAudioTrack() throws ch0.C2309b {
        k0d k0dVar;
        if (!this.f88974l.isOpen()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.f88930A = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.f88930A);
            if (this.f88978p != 3) {
                AudioTrack audioTrack = this.f88930A;
                kq6 kq6Var = this.f88987y.f89004a;
                audioTrack.setOffloadDelayPadding(kq6Var.f55011h2, kq6Var.f55012i2);
            }
        }
        int i = x0i.f95978a;
        if (i >= 31 && (k0dVar = this.f88984v) != null) {
            C13678d.setLogSessionIdOnAudioTrack(this.f88930A, k0dVar);
        }
        this.f88958c0 = this.f88930A.getAudioSessionId();
        kh0 kh0Var = this.f88975m;
        AudioTrack audioTrack2 = this.f88930A;
        C13683i c13683i = this.f88987y;
        kh0Var.setAudioTrack(audioTrack2, c13683i.f89006c == 2, c13683i.f89010g, c13683i.f89007d, c13683i.f89011h);
        setVolumeInternal();
        int i2 = this.f88959d0.f68109a;
        if (i2 != 0) {
            this.f88930A.attachAuxEffect(i2);
            this.f88930A.setAuxEffectSendLevel(this.f88959d0.f68110b);
        }
        C13679e c13679e = this.f88961e0;
        if (c13679e != null && i >= 23) {
            C13677c.setPreferredDeviceOnAudioTrack(this.f88930A, c13679e);
        }
        this.f88946Q = true;
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (x0i.f95978a >= 24 && i == -6) || i == -32;
    }

    private boolean isAudioTrackInitialized() {
        return this.f88930A != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return x0i.f95978a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$0(AudioTrack audioTrack, wp2 wp2Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            wp2Var.open();
            synchronized (f88912D0) {
                try {
                    int i = f88914F0 - 1;
                    f88914F0 = i;
                    if (i == 0) {
                        f88913E0.shutdown();
                        f88913E0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            wp2Var.open();
            synchronized (f88912D0) {
                try {
                    int i2 = f88914F0 - 1;
                    f88914F0 = i2;
                    if (i2 == 0) {
                        f88913E0.shutdown();
                        f88913E0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void maybeDisableOffload() {
        if (this.f88987y.outputModeIsOffload()) {
            this.f88969i0 = true;
        }
    }

    private void playPendingData() {
        if (this.f88955Z) {
            return;
        }
        this.f88955Z = true;
        this.f88975m.handleEndOfStream(getWrittenFrames());
        this.f88930A.stop();
        this.f88939J = 0;
    }

    private void processBuffers(long j) throws Exception {
        ByteBuffer output;
        if (!this.f88988z.isOperational()) {
            ByteBuffer byteBuffer = this.f88949T;
            if (byteBuffer == null) {
                byteBuffer = if0.f46718a;
            }
            writeBuffer(byteBuffer, j);
            return;
        }
        while (!this.f88988z.isEnded()) {
            do {
                output = this.f88988z.getOutput();
                if (output.hasRemaining()) {
                    writeBuffer(output, j);
                } else {
                    ByteBuffer byteBuffer2 = this.f88949T;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f88988z.queueInput(this.f88949T);
                    }
                }
            } while (!output.hasRemaining());
            return;
        }
    }

    @c5e(29)
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.f88979q == null) {
            this.f88979q = new C13675a();
        }
        this.f88979q.register(audioTrack);
    }

    private static void releaseAudioTrackAsync(final AudioTrack audioTrack, final wp2 wp2Var) {
        wp2Var.close();
        synchronized (f88912D0) {
            try {
                if (f88913E0 == null) {
                    f88913E0 = x0i.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
                }
                f88914F0++;
                f88913E0.execute(new Runnable() { // from class: ks3
                    @Override // java.lang.Runnable
                    public final void run() {
                        us3.lambda$releaseAudioTrackAsync$0(audioTrack, wp2Var);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetSinkStateForFlush() {
        this.f88940K = 0L;
        this.f88941L = 0L;
        this.f88942M = 0L;
        this.f88943N = 0L;
        this.f88971j0 = false;
        this.f88944O = 0;
        this.f88935F = new C13686l(this.f88936G, 0L, 0L);
        this.f88947R = 0L;
        this.f88934E = null;
        this.f88976n.clear();
        this.f88949T = null;
        this.f88950U = 0;
        this.f88951V = null;
        this.f88955Z = false;
        this.f88954Y = false;
        this.f88938I = null;
        this.f88939J = 0;
        this.f88968i.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioProcessorPlaybackParameters(qyc qycVar) {
        C13686l c13686l = new C13686l(qycVar, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.f88934E = c13686l;
        } else {
            this.f88935F = c13686l;
        }
    }

    @c5e(23)
    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.f88930A.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f88936G.f76315a).setPitch(this.f88936G.f76316b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                yh9.m25920w("DefaultAudioSink", "Failed to set playback params", e);
            }
            qyc qycVar = new qyc(this.f88930A.getPlaybackParams().getSpeed(), this.f88930A.getPlaybackParams().getPitch());
            this.f88936G = qycVar;
            this.f88975m.setAudioTrackPlaybackSpeed(qycVar.f76315a);
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            if (x0i.f95978a >= 21) {
                setVolumeInternalV21(this.f88930A, this.f88948S);
            } else {
                setVolumeInternalV3(this.f88930A, this.f88948S);
            }
        }
    }

    @c5e(21)
    private static void setVolumeInternalV21(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void setupAudioProcessors() {
        ff0 ff0Var = this.f88987y.f89012i;
        this.f88988z = ff0Var;
        ff0Var.flush();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        if (!this.f88963f0) {
            C13683i c13683i = this.f88987y;
            if (c13683i.f89006c == 0 && !shouldUseFloatOutput(c13683i.f89004a.f55010g2)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.f88964g && x0i.isEncodingHighResolutionPcm(i);
    }

    private boolean useAudioTrackPlaybackParams() {
        C13683i c13683i = this.f88987y;
        return c13683i != null && c13683i.f89013j && x0i.f95978a >= 23;
    }

    private boolean useOffloadedPlayback(kq6 kq6Var, yc0 yc0Var) {
        int encoding;
        int audioTrackChannelConfig;
        int offloadedPlaybackSupport;
        if (x0i.f95978a < 29 || this.f88978p == 0 || (encoding = sva.getEncoding((String) u80.checkNotNull(kq6Var.f54989M), kq6Var.f54986F)) == 0 || (audioTrackChannelConfig = x0i.getAudioTrackChannelConfig(kq6Var.f55007e2)) == 0 || (offloadedPlaybackSupport = getOffloadedPlaybackSupport(getAudioFormat(kq6Var.f55009f2, audioTrackChannelConfig, encoding), yc0Var.getAudioAttributesV21().f101076a)) == 0) {
            return false;
        }
        if (offloadedPlaybackSupport == 1) {
            return ((kq6Var.f55011h2 != 0 || kq6Var.f55012i2 != 0) && (this.f88978p == 1)) ? false : true;
        }
        if (offloadedPlaybackSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j) throws Exception {
        int iWriteNonBlockingV21;
        ch0.InterfaceC2310c interfaceC2310c;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f88951V;
            if (byteBuffer2 != null) {
                u80.checkArgument(byteBuffer2 == byteBuffer);
            } else {
                this.f88951V = byteBuffer;
                if (x0i.f95978a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f88952W;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f88952W = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f88952W, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f88953X = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (x0i.f95978a < 21) {
                int availableBufferSize = this.f88975m.getAvailableBufferSize(this.f88942M);
                if (availableBufferSize > 0) {
                    iWriteNonBlockingV21 = this.f88930A.write(this.f88952W, this.f88953X, Math.min(iRemaining2, availableBufferSize));
                    if (iWriteNonBlockingV21 > 0) {
                        this.f88953X += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                } else {
                    iWriteNonBlockingV21 = 0;
                }
            } else if (this.f88963f0) {
                u80.checkState(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f88965g0;
                } else {
                    this.f88965g0 = j;
                }
                iWriteNonBlockingV21 = writeNonBlockingWithAvSyncV21(this.f88930A, byteBuffer, iRemaining2, j);
            } else {
                iWriteNonBlockingV21 = writeNonBlockingV21(this.f88930A, byteBuffer, iRemaining2);
            }
            this.f88967h0 = SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                ch0.C2313f c2313f = new ch0.C2313f(iWriteNonBlockingV21, this.f88987y.f89004a, isAudioTrackDeadObject(iWriteNonBlockingV21) && this.f88943N > 0);
                ch0.InterfaceC2310c interfaceC2310c2 = this.f88985w;
                if (interfaceC2310c2 != null) {
                    interfaceC2310c2.onAudioSinkError(c2313f);
                }
                if (c2313f.f16518b) {
                    this.f88931B = ld0.f57217e;
                    throw c2313f;
                }
                this.f88981s.throwExceptionIfDeadlineIsReached(c2313f);
                return;
            }
            this.f88981s.clear();
            if (isOffloadedPlayback(this.f88930A)) {
                if (this.f88943N > 0) {
                    this.f88971j0 = false;
                }
                if (this.f88956a0 && (interfaceC2310c = this.f88985w) != null && iWriteNonBlockingV21 < iRemaining2 && !this.f88971j0) {
                    interfaceC2310c.onOffloadBufferFull();
                }
            }
            int i = this.f88987y.f89006c;
            if (i == 0) {
                this.f88942M += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (i != 0) {
                    u80.checkState(byteBuffer == this.f88949T);
                    this.f88943N += ((long) this.f88944O) * ((long) this.f88950U);
                }
                this.f88951V = null;
            }
        }
    }

    @c5e(21)
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @c5e(21)
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (x0i.f95978a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f88938I == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f88938I = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f88938I.putInt(1431633921);
        }
        if (this.f88939J == 0) {
            this.f88938I.putInt(4, i);
            this.f88938I.putLong(8, j * 1000);
            this.f88938I.position(0);
            this.f88939J = i;
        }
        int iRemaining = this.f88938I.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f88938I, iRemaining, 1);
            if (iWrite < 0) {
                this.f88939J = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i);
        if (iWriteNonBlockingV21 < 0) {
            this.f88939J = 0;
            return iWriteNonBlockingV21;
        }
        this.f88939J -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    @Override // p000.ch0
    public void configure(kq6 kq6Var, int i, @hib int[] iArr) throws ch0.C2308a {
        ff0 ff0Var;
        int pcmFrameSize;
        int pcmFrameSize2;
        int i2;
        int iIntValue;
        int encoding;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int bufferSizeInBytes;
        int[] iArr2;
        if ("audio/raw".equals(kq6Var.f54989M)) {
            u80.checkArgument(x0i.isEncodingLinearPcm(kq6Var.f55010g2));
            pcmFrameSize = x0i.getPcmFrameSize(kq6Var.f55010g2, kq6Var.f55007e2);
            kx7.C8541a c8541a = new kx7.C8541a();
            if (shouldUseFloatOutput(kq6Var.f55010g2)) {
                c8541a.addAll((Iterable) this.f88972k);
            } else {
                c8541a.addAll((Iterable) this.f88970j);
                c8541a.add((Object[]) this.f88962f.getAudioProcessors());
            }
            ff0 ff0Var2 = new ff0(c8541a.build());
            if (ff0Var2.equals(this.f88988z)) {
                ff0Var2 = this.f88988z;
            }
            this.f88968i.setTrimFrameCount(kq6Var.f55011h2, kq6Var.f55012i2);
            if (x0i.f95978a < 21 && kq6Var.f55007e2 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f88966h.setChannelMap(iArr2);
            try {
                if0.C7262a c7262aConfigure = ff0Var2.configure(new if0.C7262a(kq6Var.f55009f2, kq6Var.f55007e2, kq6Var.f55010g2));
                int i9 = c7262aConfigure.f46722c;
                int i10 = c7262aConfigure.f46720a;
                int audioTrackChannelConfig = x0i.getAudioTrackChannelConfig(c7262aConfigure.f46721b);
                i3 = 0;
                pcmFrameSize2 = x0i.getPcmFrameSize(i9, c7262aConfigure.f46721b);
                ff0Var = ff0Var2;
                i2 = i10;
                iIntValue = audioTrackChannelConfig;
                z = this.f88977o;
                encoding = i9;
            } catch (if0.C7263b e) {
                throw new ch0.C2308a(e, kq6Var);
            }
        } else {
            ff0 ff0Var3 = new ff0(kx7.m15110of());
            int i11 = kq6Var.f55009f2;
            if (useOffloadedPlayback(kq6Var, this.f88933D)) {
                ff0Var = ff0Var3;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i3 = 1;
                z = true;
                i2 = i11;
                encoding = sva.getEncoding((String) u80.checkNotNull(kq6Var.f54989M), kq6Var.f54986F);
                iIntValue = x0i.getAudioTrackChannelConfig(kq6Var.f55007e2);
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = getAudioCapabilities().getEncodingAndChannelConfigForPassthrough(kq6Var);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new ch0.C2308a("Unable to configure passthrough for: " + kq6Var, kq6Var);
                }
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                ff0Var = ff0Var3;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i2 = i11;
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                encoding = iIntValue2;
                z = this.f88977o;
                i3 = 2;
            }
        }
        if (encoding == 0) {
            throw new ch0.C2308a("Invalid output encoding (mode=" + i3 + ") for: " + kq6Var, kq6Var);
        }
        if (iIntValue == 0) {
            throw new ch0.C2308a("Invalid output channel config (mode=" + i3 + ") for: " + kq6Var, kq6Var);
        }
        if (i != 0) {
            bufferSizeInBytes = i;
            i4 = encoding;
            i5 = iIntValue;
            i6 = pcmFrameSize2;
            i7 = i2;
        } else {
            i4 = encoding;
            i5 = iIntValue;
            i6 = pcmFrameSize2;
            i7 = i2;
            bufferSizeInBytes = this.f88982t.getBufferSizeInBytes(getAudioTrackMinBufferSize(i2, iIntValue, encoding), encoding, i3, pcmFrameSize2 != -1 ? pcmFrameSize2 : 1, i2, kq6Var.f54985C, z ? 8.0d : 1.0d);
        }
        this.f88969i0 = false;
        C13683i c13683i = new C13683i(kq6Var, pcmFrameSize, i3, i6, i7, i5, i4, bufferSizeInBytes, ff0Var, z);
        if (isAudioTrackInitialized()) {
            this.f88986x = c13683i;
        } else {
            this.f88987y = c13683i;
        }
    }

    @Override // p000.ch0
    public void disableTunneling() {
        if (this.f88963f0) {
            this.f88963f0 = false;
            flush();
        }
    }

    @Override // p000.ch0
    public void enableTunnelingV21() {
        u80.checkState(x0i.f95978a >= 21);
        u80.checkState(this.f88957b0);
        if (this.f88963f0) {
            return;
        }
        this.f88963f0 = true;
        flush();
    }

    @Override // p000.ch0
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (x0i.f95978a < 25) {
            flush();
            return;
        }
        this.f88981s.clear();
        this.f88980r.clear();
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.f88975m.isPlaying()) {
                this.f88930A.pause();
            }
            this.f88930A.flush();
            this.f88975m.reset();
            kh0 kh0Var = this.f88975m;
            AudioTrack audioTrack = this.f88930A;
            C13683i c13683i = this.f88987y;
            kh0Var.setAudioTrack(audioTrack, c13683i.f89006c == 2, c13683i.f89010g, c13683i.f89007d, c13683i.f89011h);
            this.f88946Q = true;
        }
    }

    @Override // p000.ch0
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.f88975m.isPlaying()) {
                this.f88930A.pause();
            }
            if (isOffloadedPlayback(this.f88930A)) {
                ((C13675a) u80.checkNotNull(this.f88979q)).unregister(this.f88930A);
            }
            if (x0i.f95978a < 21 && !this.f88957b0) {
                this.f88958c0 = 0;
            }
            C13683i c13683i = this.f88986x;
            if (c13683i != null) {
                this.f88987y = c13683i;
                this.f88986x = null;
            }
            this.f88975m.reset();
            releaseAudioTrackAsync(this.f88930A, this.f88974l);
            this.f88930A = null;
        }
        this.f88981s.clear();
        this.f88980r.clear();
    }

    @Override // p000.ch0
    public yc0 getAudioAttributes() {
        return this.f88933D;
    }

    @Override // p000.ch0
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioTrackInitialized() || this.f88946Q) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.f88975m.getCurrentPositionUs(z), this.f88987y.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // p000.ch0
    public int getFormatSupport(kq6 kq6Var) {
        if (!"audio/raw".equals(kq6Var.f54989M)) {
            return ((this.f88969i0 || !useOffloadedPlayback(kq6Var, this.f88933D)) && !getAudioCapabilities().isPassthroughPlaybackSupported(kq6Var)) ? 0 : 2;
        }
        if (x0i.isEncodingLinearPcm(kq6Var.f55010g2)) {
            int i = kq6Var.f55010g2;
            return (i == 2 || (this.f88964g && i == 4)) ? 2 : 1;
        }
        yh9.m25919w("DefaultAudioSink", "Invalid PCM encoding: " + kq6Var.f55010g2);
        return 0;
    }

    @Override // p000.ch0
    public qyc getPlaybackParameters() {
        return this.f88936G;
    }

    @Override // p000.ch0
    public boolean getSkipSilenceEnabled() {
        return this.f88937H;
    }

    @Override // p000.ch0
    public boolean handleBuffer(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.f88949T;
        u80.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f88986x != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.f88986x.canReuseAudioTrack(this.f88987y)) {
                this.f88987y = this.f88986x;
                this.f88986x = null;
                if (isOffloadedPlayback(this.f88930A) && this.f88978p != 3) {
                    if (this.f88930A.getPlayState() == 3) {
                        this.f88930A.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f88930A;
                    kq6 kq6Var = this.f88987y.f89004a;
                    audioTrack.setOffloadDelayPadding(kq6Var.f55011h2, kq6Var.f55012i2);
                    this.f88971j0 = true;
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
            } catch (ch0.C2309b e) {
                if (e.f16513b) {
                    throw e;
                }
                this.f88980r.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.f88980r.clear();
        if (this.f88946Q) {
            this.f88947R = Math.max(0L, j);
            this.f88945P = false;
            this.f88946Q = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.f88956a0) {
                play();
            }
        }
        if (!this.f88975m.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.f88949T == null) {
            u80.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C13683i c13683i = this.f88987y;
            if (c13683i.f89006c != 0 && this.f88944O == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(c13683i.f89010g, byteBuffer);
                this.f88944O = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.f88934E != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.f88934E = null;
            }
            long jInputFramesToDurationUs = this.f88947R + this.f88987y.inputFramesToDurationUs(getSubmittedFrames() - this.f88968i.getTrimmedFrameCount());
            if (!this.f88945P && Math.abs(jInputFramesToDurationUs - j) > 200000) {
                ch0.InterfaceC2310c interfaceC2310c = this.f88985w;
                if (interfaceC2310c != null) {
                    interfaceC2310c.onAudioSinkError(new ch0.C2312e(j, jInputFramesToDurationUs));
                }
                this.f88945P = true;
            }
            if (this.f88945P) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j2 = j - jInputFramesToDurationUs;
                this.f88947R += j2;
                this.f88945P = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                ch0.InterfaceC2310c interfaceC2310c2 = this.f88985w;
                if (interfaceC2310c2 != null && j2 != 0) {
                    interfaceC2310c2.onPositionDiscontinuity();
                }
            }
            if (this.f88987y.f89006c == 0) {
                this.f88940K += (long) byteBuffer.remaining();
            } else {
                this.f88941L += ((long) this.f88944O) * ((long) i);
            }
            this.f88949T = byteBuffer;
            this.f88950U = i;
        }
        processBuffers(j);
        if (!this.f88949T.hasRemaining()) {
            this.f88949T = null;
            this.f88950U = 0;
            return true;
        }
        if (!this.f88975m.isStalled(getWrittenFrames())) {
            return false;
        }
        yh9.m25919w("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // p000.ch0
    public void handleDiscontinuity() {
        this.f88945P = true;
    }

    @Override // p000.ch0
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && this.f88975m.hasPendingData(getWrittenFrames());
    }

    @Override // p000.ch0
    public boolean isEnded() {
        return !isAudioTrackInitialized() || (this.f88954Y && !hasPendingData());
    }

    public void onAudioCapabilitiesChanged(ld0 ld0Var) {
        u80.checkState(this.f88973k0 == Looper.myLooper());
        if (ld0Var.equals(getAudioCapabilities())) {
            return;
        }
        this.f88931B = ld0Var;
        ch0.InterfaceC2310c interfaceC2310c = this.f88985w;
        if (interfaceC2310c != null) {
            interfaceC2310c.onAudioCapabilitiesChanged();
        }
    }

    @Override // p000.ch0
    public void pause() {
        this.f88956a0 = false;
        if (isAudioTrackInitialized() && this.f88975m.pause()) {
            this.f88930A.pause();
        }
    }

    @Override // p000.ch0
    public void play() {
        this.f88956a0 = true;
        if (isAudioTrackInitialized()) {
            this.f88975m.start();
            this.f88930A.play();
        }
    }

    @Override // p000.ch0
    public void playToEndOfStream() throws ch0.C2313f {
        if (!this.f88954Y && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.f88954Y = true;
        }
    }

    @Override // p000.ch0
    public void release() {
        nd0 nd0Var = this.f88932C;
        if (nd0Var != null) {
            nd0Var.unregister();
        }
    }

    @Override // p000.ch0
    public void reset() {
        flush();
        quh<if0> it = this.f88970j.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        quh<if0> it2 = this.f88972k.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        ff0 ff0Var = this.f88988z;
        if (ff0Var != null) {
            ff0Var.reset();
        }
        this.f88956a0 = false;
        this.f88969i0 = false;
    }

    @Override // p000.ch0
    public void setAudioAttributes(yc0 yc0Var) {
        if (this.f88933D.equals(yc0Var)) {
            return;
        }
        this.f88933D = yc0Var;
        if (this.f88963f0) {
            return;
        }
        flush();
    }

    @Override // p000.ch0
    public void setAudioSessionId(int i) {
        if (this.f88958c0 != i) {
            this.f88958c0 = i;
            this.f88957b0 = i != 0;
            flush();
        }
    }

    @Override // p000.ch0
    public void setAuxEffectInfo(om0 om0Var) {
        if (this.f88959d0.equals(om0Var)) {
            return;
        }
        int i = om0Var.f68109a;
        float f = om0Var.f68110b;
        AudioTrack audioTrack = this.f88930A;
        if (audioTrack != null) {
            if (this.f88959d0.f68109a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f88930A.setAuxEffectSendLevel(f);
            }
        }
        this.f88959d0 = om0Var;
    }

    @Override // p000.ch0
    public void setListener(ch0.InterfaceC2310c interfaceC2310c) {
        this.f88985w = interfaceC2310c;
    }

    @Override // p000.ch0
    public void setPlaybackParameters(qyc qycVar) {
        this.f88936G = new qyc(x0i.constrainValue(qycVar.f76315a, 0.1f, 8.0f), x0i.constrainValue(qycVar.f76316b, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(qycVar);
        }
    }

    @Override // p000.ch0
    public void setPlayerId(@hib k0d k0dVar) {
        this.f88984v = k0dVar;
    }

    @Override // p000.ch0
    @c5e(23)
    public void setPreferredDevice(@hib AudioDeviceInfo audioDeviceInfo) {
        C13679e c13679e = audioDeviceInfo == null ? null : new C13679e(audioDeviceInfo);
        this.f88961e0 = c13679e;
        AudioTrack audioTrack = this.f88930A;
        if (audioTrack != null) {
            C13677c.setPreferredDeviceOnAudioTrack(audioTrack, c13679e);
        }
    }

    @Override // p000.ch0
    public void setSkipSilenceEnabled(boolean z) {
        this.f88937H = z;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? qyc.f76311d : this.f88936G);
    }

    @Override // p000.ch0
    public void setVolume(float f) {
        if (this.f88948S != f) {
            this.f88948S = f;
            setVolumeInternal();
        }
    }

    @Override // p000.ch0
    public boolean supportsFormat(kq6 kq6Var) {
        return getFormatSupport(kq6Var) != 0;
    }

    @g5e({"#1.audioProcessorChain"})
    private us3(C13682h c13682h) {
        Context context = c13682h.f88996a;
        this.f88960e = context;
        this.f88931B = context != null ? ld0.getCapabilities(context) : c13682h.f88997b;
        this.f88962f = c13682h.f88998c;
        int i = x0i.f95978a;
        this.f88964g = i >= 21 && c13682h.f88999d;
        this.f88977o = i >= 23 && c13682h.f89000e;
        this.f88978p = i >= 29 ? c13682h.f89001f : 0;
        this.f88982t = c13682h.f89002g;
        wp2 wp2Var = new wp2(h52.f42390a);
        this.f88974l = wp2Var;
        wp2Var.open();
        this.f88975m = new kh0(new C13690p());
        ru1 ru1Var = new ru1();
        this.f88966h = ru1Var;
        bjh bjhVar = new bjh();
        this.f88968i = bjhVar;
        this.f88970j = kx7.m15113of((bjh) new i3h(), (bjh) ru1Var, bjhVar);
        this.f88972k = kx7.m15111of(new g3h());
        this.f88948S = 1.0f;
        this.f88933D = yc0.f101069m;
        this.f88958c0 = 0;
        this.f88959d0 = new om0(0, 0.0f);
        qyc qycVar = qyc.f76311d;
        this.f88935F = new C13686l(qycVar, 0L, 0L);
        this.f88936G = qycVar;
        this.f88937H = false;
        this.f88976n = new ArrayDeque<>();
        this.f88980r = new C13689o<>(100L);
        this.f88981s = new C13689o<>(100L);
        this.f88983u = c13682h.f89003h;
    }

    /* JADX INFO: renamed from: us3$h */
    public static final class C13682h {

        /* JADX INFO: renamed from: a */
        @hib
        public final Context f88996a;

        /* JADX INFO: renamed from: b */
        public ld0 f88997b;

        /* JADX INFO: renamed from: c */
        @hib
        public jf0 f88998c;

        /* JADX INFO: renamed from: d */
        public boolean f88999d;

        /* JADX INFO: renamed from: e */
        public boolean f89000e;

        /* JADX INFO: renamed from: f */
        public int f89001f;

        /* JADX INFO: renamed from: g */
        public InterfaceC13681g f89002g;

        /* JADX INFO: renamed from: h */
        @hib
        public ca5.InterfaceC2248b f89003h;

        @Deprecated
        public C13682h() {
            this.f88996a = null;
            this.f88997b = ld0.f57217e;
            this.f89001f = 0;
            this.f89002g = InterfaceC13681g.f88995a;
        }

        public us3 build() {
            if (this.f88998c == null) {
                this.f88998c = new C13684j(new if0[0]);
            }
            return new us3(this);
        }

        @op1
        @Deprecated
        public C13682h setAudioCapabilities(ld0 ld0Var) {
            u80.checkNotNull(ld0Var);
            this.f88997b = ld0Var;
            return this;
        }

        @op1
        public C13682h setAudioProcessorChain(jf0 jf0Var) {
            u80.checkNotNull(jf0Var);
            this.f88998c = jf0Var;
            return this;
        }

        @op1
        public C13682h setAudioProcessors(if0[] if0VarArr) {
            u80.checkNotNull(if0VarArr);
            return setAudioProcessorChain(new C13684j(if0VarArr));
        }

        @op1
        public C13682h setAudioTrackBufferSizeProvider(InterfaceC13681g interfaceC13681g) {
            this.f89002g = interfaceC13681g;
            return this;
        }

        @op1
        public C13682h setEnableAudioTrackPlaybackParams(boolean z) {
            this.f89000e = z;
            return this;
        }

        @op1
        public C13682h setEnableFloatOutput(boolean z) {
            this.f88999d = z;
            return this;
        }

        @op1
        public C13682h setExperimentalAudioOffloadListener(@hib ca5.InterfaceC2248b interfaceC2248b) {
            this.f89003h = interfaceC2248b;
            return this;
        }

        @op1
        public C13682h setOffloadMode(int i) {
            this.f89001f = i;
            return this;
        }

        public C13682h(Context context) {
            this.f88996a = context;
            this.f88997b = ld0.f57217e;
            this.f89001f = 0;
            this.f89002g = InterfaceC13681g.f88995a;
        }
    }
}
