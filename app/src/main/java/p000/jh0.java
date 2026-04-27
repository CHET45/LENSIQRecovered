package p000;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class jh0 {

    /* JADX INFO: renamed from: J */
    public static final int f50512J = 1;

    /* JADX INFO: renamed from: K */
    public static final int f50513K = 2;

    /* JADX INFO: renamed from: L */
    public static final int f50514L = 3;

    /* JADX INFO: renamed from: M */
    public static final long f50515M = 5000000;

    /* JADX INFO: renamed from: N */
    public static final long f50516N = 1000000;

    /* JADX INFO: renamed from: O */
    public static final int f50517O = 10;

    /* JADX INFO: renamed from: P */
    public static final long f50518P = 5;

    /* JADX INFO: renamed from: Q */
    public static final long f50519Q = 200;

    /* JADX INFO: renamed from: R */
    public static final int f50520R = 10;

    /* JADX INFO: renamed from: S */
    public static final int f50521S = 30000;

    /* JADX INFO: renamed from: T */
    public static final int f50522T = 500000;

    /* JADX INFO: renamed from: A */
    public long f50523A;

    /* JADX INFO: renamed from: B */
    public long f50524B;

    /* JADX INFO: renamed from: C */
    public long f50525C;

    /* JADX INFO: renamed from: D */
    public boolean f50526D;

    /* JADX INFO: renamed from: E */
    public long f50527E;

    /* JADX INFO: renamed from: F */
    public long f50528F;

    /* JADX INFO: renamed from: G */
    public boolean f50529G;

    /* JADX INFO: renamed from: H */
    public long f50530H;

    /* JADX INFO: renamed from: I */
    public j52 f50531I;

    /* JADX INFO: renamed from: a */
    public final InterfaceC7899a f50532a;

    /* JADX INFO: renamed from: b */
    public final long[] f50533b;

    /* JADX INFO: renamed from: c */
    @hib
    public AudioTrack f50534c;

    /* JADX INFO: renamed from: d */
    public int f50535d;

    /* JADX INFO: renamed from: e */
    @hib
    public fh0 f50536e;

    /* JADX INFO: renamed from: f */
    public int f50537f;

    /* JADX INFO: renamed from: g */
    public boolean f50538g;

    /* JADX INFO: renamed from: h */
    public long f50539h;

    /* JADX INFO: renamed from: i */
    public float f50540i;

    /* JADX INFO: renamed from: j */
    public boolean f50541j;

    /* JADX INFO: renamed from: k */
    public long f50542k;

    /* JADX INFO: renamed from: l */
    public int f50543l;

    /* JADX INFO: renamed from: m */
    public long f50544m;

    /* JADX INFO: renamed from: n */
    public long f50545n;

    /* JADX INFO: renamed from: o */
    @hib
    public Method f50546o;

    /* JADX INFO: renamed from: p */
    public long f50547p;

    /* JADX INFO: renamed from: q */
    public boolean f50548q;

    /* JADX INFO: renamed from: r */
    public boolean f50549r;

    /* JADX INFO: renamed from: s */
    public long f50550s;

    /* JADX INFO: renamed from: t */
    public long f50551t;

    /* JADX INFO: renamed from: u */
    public long f50552u;

    /* JADX INFO: renamed from: v */
    public long f50553v;

    /* JADX INFO: renamed from: w */
    public long f50554w;

    /* JADX INFO: renamed from: x */
    public int f50555x;

    /* JADX INFO: renamed from: y */
    public int f50556y;

    /* JADX INFO: renamed from: z */
    public long f50557z;

    /* JADX INFO: renamed from: jh0$a */
    public interface InterfaceC7899a {
        void onInvalidLatency(long j);

        void onPositionAdvancing(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);
    }

    public jh0(InterfaceC7899a interfaceC7899a) {
        this.f50532a = (InterfaceC7899a) v80.checkNotNull(interfaceC7899a);
        try {
            this.f50546o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f50533b = new long[10];
        this.f50528F = -9223372036854775807L;
        this.f50527E = -9223372036854775807L;
        this.f50531I = j52.f49539a;
    }

    private boolean forceHasPendingData() {
        return this.f50538g && ((AudioTrack) v80.checkNotNull(this.f50534c)).getPlayState() == 2 && getPlaybackHeadPosition() == 0;
    }

    private long getPlaybackHeadPosition() {
        if (this.f50557z != -9223372036854775807L) {
            return Math.min(this.f50525C, getSimulatedPlaybackHeadPositionAfterStop());
        }
        long jElapsedRealtime = this.f50531I.elapsedRealtime();
        if (jElapsedRealtime - this.f50551t >= 5) {
            updateRawPlaybackHeadPosition(jElapsedRealtime);
            this.f50551t = jElapsedRealtime;
        }
        return this.f50552u + this.f50530H + (this.f50553v << 32);
    }

    private long getPlaybackHeadPositionEstimateUs(long j) {
        long jMax = Math.max(0L, (this.f50556y == 0 ? this.f50557z != -9223372036854775807L ? t0i.sampleCountToDurationUs(getSimulatedPlaybackHeadPositionAfterStop(), this.f50537f) : getPlaybackHeadPositionUs() : t0i.getMediaDurationForPlayoutDuration(j + this.f50544m, this.f50540i)) - this.f50547p);
        return this.f50557z != -9223372036854775807L ? Math.min(t0i.sampleCountToDurationUs(this.f50525C, this.f50537f), jMax) : jMax;
    }

    private long getPlaybackHeadPositionUs() {
        return t0i.sampleCountToDurationUs(getPlaybackHeadPosition(), this.f50537f);
    }

    private long getSimulatedPlaybackHeadPositionAfterStop() {
        if (((AudioTrack) v80.checkNotNull(this.f50534c)).getPlayState() == 2) {
            return this.f50524B;
        }
        return this.f50524B + t0i.durationUsToSampleCount(t0i.getMediaDurationForPlayoutDuration(t0i.msToUs(this.f50531I.elapsedRealtime()) - this.f50557z, this.f50540i), this.f50537f);
    }

    @c5e(24)
    private boolean hasPendingAudioTrackUnderruns() {
        int underrunCount = ((AudioTrack) v80.checkNotNull(this.f50534c)).getUnderrunCount();
        boolean z = underrunCount > this.f50543l;
        this.f50543l = underrunCount;
        return z;
    }

    private void maybeSampleSyncParams() {
        long jNanoTime = this.f50531I.nanoTime() / 1000;
        if (jNanoTime - this.f50545n >= 30000) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.f50533b[this.f50555x] = t0i.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.f50540i) - jNanoTime;
                this.f50555x = (this.f50555x + 1) % 10;
                int i = this.f50556y;
                if (i < 10) {
                    this.f50556y = i + 1;
                }
                this.f50545n = jNanoTime;
                this.f50544m = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.f50556y;
                    if (i2 >= i3) {
                        break;
                    }
                    this.f50544m += this.f50533b[i2] / ((long) i3);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.f50538g) {
            return;
        }
        maybeUpdateLatency(jNanoTime);
        ((fh0) v80.checkNotNull(this.f50536e)).maybePollTimestamp(jNanoTime, this.f50540i, getPlaybackHeadPositionEstimateUs(jNanoTime));
    }

    private void maybeTriggerOnPositionAdvancingCallback(long j) {
        if (this.f50526D) {
            long j2 = this.f50542k;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jCurrentTimeMillis = this.f50531I.currentTimeMillis() - t0i.usToMs(t0i.getPlayoutDurationForMediaDuration(j - j2, this.f50540i));
            this.f50542k = -9223372036854775807L;
            this.f50532a.onPositionAdvancing(jCurrentTimeMillis);
        }
    }

    private void maybeUpdateLatency(long j) {
        Method method;
        if (!this.f50549r || (method = this.f50546o) == null || j - this.f50550s < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) t0i.castNonNull((Integer) method.invoke(v80.checkNotNull(this.f50534c), null))).intValue()) * 1000) - this.f50539h;
            this.f50547p = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f50547p = jMax;
            if (jMax > 5000000) {
                this.f50532a.onInvalidLatency(jMax);
                this.f50547p = 0L;
            }
        } catch (Exception unused) {
            this.f50546o = null;
        }
        this.f50550s = j;
    }

    private static boolean needsPassthroughWorkarounds(int i) {
        return false;
    }

    private void resetSyncParams() {
        this.f50544m = 0L;
        this.f50556y = 0;
        this.f50555x = 0;
        this.f50545n = 0L;
        this.f50527E = -9223372036854775807L;
        this.f50528F = -9223372036854775807L;
        this.f50541j = false;
    }

    private void updateRawPlaybackHeadPosition(long j) {
        AudioTrack audioTrack = (AudioTrack) v80.checkNotNull(this.f50534c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f50538g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f50554w = this.f50552u;
            }
            playbackHeadPosition += this.f50554w;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.f50552u > 0 && playState == 3) {
                if (this.f50523A == -9223372036854775807L) {
                    this.f50523A = j;
                    return;
                }
                return;
            }
            this.f50523A = -9223372036854775807L;
        }
        long j2 = this.f50552u;
        if (j2 > playbackHeadPosition) {
            if (this.f50529G) {
                this.f50530H += j2;
                this.f50529G = false;
            } else {
                this.f50553v++;
            }
        }
        this.f50552u = playbackHeadPosition;
    }

    public void expectRawPlaybackHeadReset() {
        this.f50529G = true;
        fh0 fh0Var = this.f50536e;
        if (fh0Var != null) {
            fh0Var.expectTimestampFramePositionReset();
        }
    }

    public long getCurrentPositionUs() {
        AudioTrack audioTrack = (AudioTrack) v80.checkNotNull(this.f50534c);
        if (audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long jNanoTime = this.f50531I.nanoTime() / 1000;
        fh0 fh0Var = (fh0) v80.checkNotNull(this.f50536e);
        boolean zHasAdvancingTimestamp = fh0Var.hasAdvancingTimestamp();
        long timestampPositionUs = zHasAdvancingTimestamp ? fh0Var.getTimestampPositionUs(jNanoTime, this.f50540i) : getPlaybackHeadPositionEstimateUs(jNanoTime);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zHasAdvancingTimestamp || !fh0Var.isWaitingForAdvancingTimestamp()) {
                maybeTriggerOnPositionAdvancingCallback(timestampPositionUs);
            }
            long j = this.f50528F;
            if (j != -9223372036854775807L) {
                long j2 = timestampPositionUs - this.f50527E;
                long mediaDurationForPlayoutDuration = t0i.getMediaDurationForPlayoutDuration(jNanoTime - j, this.f50540i);
                long j3 = this.f50527E + mediaDurationForPlayoutDuration;
                long jAbs = Math.abs(j3 - timestampPositionUs);
                if (j2 != 0 && jAbs < 1000000) {
                    long j4 = (mediaDurationForPlayoutDuration * 10) / 100;
                    timestampPositionUs = t0i.constrainValue(timestampPositionUs, j3 - j4, j3 + j4);
                }
            }
            if (!this.f50526D && !this.f50541j) {
                long j5 = this.f50527E;
                if (j5 != -9223372036854775807L && timestampPositionUs > j5) {
                    this.f50541j = true;
                    this.f50532a.onPositionAdvancing(this.f50531I.currentTimeMillis() - t0i.usToMs(t0i.getPlayoutDurationForMediaDuration(t0i.usToMs(timestampPositionUs - j5), this.f50540i)));
                }
            }
            this.f50528F = jNanoTime;
            this.f50527E = timestampPositionUs;
        } else if (playState == 1) {
            maybeTriggerOnPositionAdvancingCallback(timestampPositionUs);
        }
        return timestampPositionUs;
    }

    public void handleEndOfStream(long j) {
        this.f50524B = getPlaybackHeadPosition();
        this.f50557z = t0i.msToUs(this.f50531I.elapsedRealtime());
        this.f50525C = j;
    }

    public boolean hasPendingData(long j) {
        return j > t0i.durationUsToSampleCount(getCurrentPositionUs(), this.f50537f) || forceHasPendingData();
    }

    public boolean isPlaying() {
        return ((AudioTrack) v80.checkNotNull(this.f50534c)).getPlayState() == 3;
    }

    public boolean isStalled(long j) {
        return this.f50523A != -9223372036854775807L && j > 0 && this.f50531I.elapsedRealtime() - this.f50523A >= 200;
    }

    public boolean mayHandleBuffer(long j) {
        int playState = ((AudioTrack) v80.checkNotNull(this.f50534c)).getPlayState();
        if (this.f50538g) {
            if (playState == 2) {
                this.f50548q = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        if (hasPendingAudioTrackUnderruns()) {
            this.f50532a.onUnderrun(this.f50535d, t0i.usToMs(this.f50539h));
        }
        return true;
    }

    public void pause() {
        resetSyncParams();
        if (this.f50557z == -9223372036854775807L) {
            ((fh0) v80.checkNotNull(this.f50536e)).reset();
        }
        this.f50524B = getPlaybackHeadPosition();
    }

    public void reset() {
        resetSyncParams();
        this.f50534c = null;
        this.f50536e = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z, int i, int i2, int i3, boolean z2) {
        this.f50534c = audioTrack;
        this.f50535d = i3;
        this.f50536e = new fh0(audioTrack, this.f50532a);
        this.f50537f = audioTrack.getSampleRate();
        this.f50538g = z && needsPassthroughWorkarounds(i);
        boolean zIsEncodingLinearPcm = t0i.isEncodingLinearPcm(i);
        this.f50549r = zIsEncodingLinearPcm;
        this.f50539h = zIsEncodingLinearPcm ? t0i.sampleCountToDurationUs(i3 / i2, this.f50537f) : -9223372036854775807L;
        this.f50552u = 0L;
        this.f50553v = 0L;
        this.f50529G = false;
        this.f50530H = 0L;
        this.f50554w = 0L;
        this.f50548q = false;
        this.f50557z = -9223372036854775807L;
        this.f50523A = -9223372036854775807L;
        this.f50550s = 0L;
        this.f50547p = 0L;
        this.f50540i = 1.0f;
        this.f50543l = 0;
        this.f50542k = -9223372036854775807L;
        this.f50526D = z2;
    }

    public void setAudioTrackPlaybackSpeed(float f) {
        this.f50540i = f;
        fh0 fh0Var = this.f50536e;
        if (fh0Var != null) {
            fh0Var.reset();
        }
        resetSyncParams();
    }

    public void setClock(j52 j52Var) {
        this.f50531I = j52Var;
    }

    public void start() {
        if (this.f50557z != -9223372036854775807L) {
            this.f50557z = t0i.msToUs(this.f50531I.elapsedRealtime());
        }
        this.f50542k = getPlaybackHeadPositionUs();
        ((fh0) v80.checkNotNull(this.f50536e)).reset();
    }
}
