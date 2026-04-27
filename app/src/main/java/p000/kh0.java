package p000;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kh0 {

    /* JADX INFO: renamed from: H */
    public static final int f54062H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f54063I = 2;

    /* JADX INFO: renamed from: J */
    public static final int f54064J = 3;

    /* JADX INFO: renamed from: K */
    public static final long f54065K = 5000000;

    /* JADX INFO: renamed from: L */
    public static final long f54066L = 5000000;

    /* JADX INFO: renamed from: M */
    public static final long f54067M = 1000000;

    /* JADX INFO: renamed from: N */
    public static final long f54068N = 5;

    /* JADX INFO: renamed from: O */
    public static final long f54069O = 200;

    /* JADX INFO: renamed from: P */
    public static final int f54070P = 10;

    /* JADX INFO: renamed from: Q */
    public static final int f54071Q = 30000;

    /* JADX INFO: renamed from: R */
    public static final int f54072R = 500000;

    /* JADX INFO: renamed from: A */
    public long f54073A;

    /* JADX INFO: renamed from: B */
    public long f54074B;

    /* JADX INFO: renamed from: C */
    public long f54075C;

    /* JADX INFO: renamed from: D */
    public long f54076D;

    /* JADX INFO: renamed from: E */
    public boolean f54077E;

    /* JADX INFO: renamed from: F */
    public long f54078F;

    /* JADX INFO: renamed from: G */
    public long f54079G;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8363a f54080a;

    /* JADX INFO: renamed from: b */
    public final long[] f54081b;

    /* JADX INFO: renamed from: c */
    @hib
    public AudioTrack f54082c;

    /* JADX INFO: renamed from: d */
    public int f54083d;

    /* JADX INFO: renamed from: e */
    public int f54084e;

    /* JADX INFO: renamed from: f */
    @hib
    public gh0 f54085f;

    /* JADX INFO: renamed from: g */
    public int f54086g;

    /* JADX INFO: renamed from: h */
    public boolean f54087h;

    /* JADX INFO: renamed from: i */
    public long f54088i;

    /* JADX INFO: renamed from: j */
    public float f54089j;

    /* JADX INFO: renamed from: k */
    public boolean f54090k;

    /* JADX INFO: renamed from: l */
    public long f54091l;

    /* JADX INFO: renamed from: m */
    public long f54092m;

    /* JADX INFO: renamed from: n */
    @hib
    public Method f54093n;

    /* JADX INFO: renamed from: o */
    public long f54094o;

    /* JADX INFO: renamed from: p */
    public boolean f54095p;

    /* JADX INFO: renamed from: q */
    public boolean f54096q;

    /* JADX INFO: renamed from: r */
    public long f54097r;

    /* JADX INFO: renamed from: s */
    public long f54098s;

    /* JADX INFO: renamed from: t */
    public long f54099t;

    /* JADX INFO: renamed from: u */
    public long f54100u;

    /* JADX INFO: renamed from: v */
    public long f54101v;

    /* JADX INFO: renamed from: w */
    public int f54102w;

    /* JADX INFO: renamed from: x */
    public int f54103x;

    /* JADX INFO: renamed from: y */
    public long f54104y;

    /* JADX INFO: renamed from: z */
    public long f54105z;

    /* JADX INFO: renamed from: kh0$a */
    public interface InterfaceC8363a {
        void onInvalidLatency(long j);

        void onPositionAdvancing(long j);

        void onPositionFramesMismatch(long j, long j2, long j3, long j4);

        void onSystemTimeUsMismatch(long j, long j2, long j3, long j4);

        void onUnderrun(int i, long j);
    }

    public kh0(InterfaceC8363a interfaceC8363a) {
        this.f54080a = (InterfaceC8363a) u80.checkNotNull(interfaceC8363a);
        if (x0i.f95978a >= 18) {
            try {
                this.f54093n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f54081b = new long[10];
    }

    private boolean forceHasPendingData() {
        return this.f54087h && ((AudioTrack) u80.checkNotNull(this.f54082c)).getPlayState() == 2 && getPlaybackHeadPosition() == 0;
    }

    private long getPlaybackHeadPosition() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f54104y;
        if (j != -9223372036854775807L) {
            return Math.min(this.f54074B, this.f54073A + x0i.durationUsToSampleCount(x0i.getMediaDurationForPlayoutDuration((jElapsedRealtime * 1000) - j, this.f54089j), this.f54086g));
        }
        if (jElapsedRealtime - this.f54098s >= 5) {
            updateRawPlaybackHeadPosition(jElapsedRealtime);
            this.f54098s = jElapsedRealtime;
        }
        return this.f54099t + (this.f54100u << 32);
    }

    private long getPlaybackHeadPositionUs() {
        return x0i.sampleCountToDurationUs(getPlaybackHeadPosition(), this.f54086g);
    }

    private void maybePollAndCheckTimestamp(long j) {
        gh0 gh0Var = (gh0) u80.checkNotNull(this.f54085f);
        if (gh0Var.maybePollTimestamp(j)) {
            long timestampSystemTimeUs = gh0Var.getTimestampSystemTimeUs();
            long timestampPositionFrames = gh0Var.getTimestampPositionFrames();
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (Math.abs(timestampSystemTimeUs - j) > 5000000) {
                this.f54080a.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j, playbackHeadPositionUs);
                gh0Var.rejectTimestamp();
            } else if (Math.abs(x0i.sampleCountToDurationUs(timestampPositionFrames, this.f54086g) - playbackHeadPositionUs) <= 5000000) {
                gh0Var.acceptTimestamp();
            } else {
                this.f54080a.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j, playbackHeadPositionUs);
                gh0Var.rejectTimestamp();
            }
        }
    }

    private void maybeSampleSyncParams() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f54092m >= 30000) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.f54081b[this.f54102w] = x0i.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.f54089j) - jNanoTime;
                this.f54102w = (this.f54102w + 1) % 10;
                int i = this.f54103x;
                if (i < 10) {
                    this.f54103x = i + 1;
                }
                this.f54092m = jNanoTime;
                this.f54091l = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.f54103x;
                    if (i2 >= i3) {
                        break;
                    }
                    this.f54091l += this.f54081b[i2] / ((long) i3);
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.f54087h) {
            return;
        }
        maybePollAndCheckTimestamp(jNanoTime);
        maybeUpdateLatency(jNanoTime);
    }

    private void maybeUpdateLatency(long j) {
        Method method;
        if (!this.f54096q || (method = this.f54093n) == null || j - this.f54097r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) x0i.castNonNull((Integer) method.invoke(u80.checkNotNull(this.f54082c), null))).intValue()) * 1000) - this.f54088i;
            this.f54094o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f54094o = jMax;
            if (jMax > 5000000) {
                this.f54080a.onInvalidLatency(jMax);
                this.f54094o = 0L;
            }
        } catch (Exception unused) {
            this.f54093n = null;
        }
        this.f54097r = j;
    }

    private static boolean needsPassthroughWorkarounds(int i) {
        return x0i.f95978a < 23 && (i == 5 || i == 6);
    }

    private void resetSyncParams() {
        this.f54091l = 0L;
        this.f54103x = 0;
        this.f54102w = 0;
        this.f54092m = 0L;
        this.f54076D = 0L;
        this.f54079G = 0L;
        this.f54090k = false;
    }

    private void updateRawPlaybackHeadPosition(long j) {
        AudioTrack audioTrack = (AudioTrack) u80.checkNotNull(this.f54082c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f54087h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f54101v = this.f54099t;
            }
            playbackHeadPosition += this.f54101v;
        }
        if (x0i.f95978a <= 29) {
            if (playbackHeadPosition == 0 && this.f54099t > 0 && playState == 3) {
                if (this.f54105z == -9223372036854775807L) {
                    this.f54105z = j;
                    return;
                }
                return;
            }
            this.f54105z = -9223372036854775807L;
        }
        if (this.f54099t > playbackHeadPosition) {
            this.f54100u++;
        }
        this.f54099t = playbackHeadPosition;
    }

    public int getAvailableBufferSize(long j) {
        return this.f54084e - ((int) (j - (getPlaybackHeadPosition() * ((long) this.f54083d))));
    }

    public long getCurrentPositionUs(boolean z) {
        long playbackHeadPositionUs;
        if (((AudioTrack) u80.checkNotNull(this.f54082c)).getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long jNanoTime = System.nanoTime() / 1000;
        gh0 gh0Var = (gh0) u80.checkNotNull(this.f54085f);
        boolean zHasAdvancingTimestamp = gh0Var.hasAdvancingTimestamp();
        if (zHasAdvancingTimestamp) {
            playbackHeadPositionUs = x0i.sampleCountToDurationUs(gh0Var.getTimestampPositionFrames(), this.f54086g) + x0i.getMediaDurationForPlayoutDuration(jNanoTime - gh0Var.getTimestampSystemTimeUs(), this.f54089j);
        } else {
            playbackHeadPositionUs = this.f54103x == 0 ? getPlaybackHeadPositionUs() : x0i.getMediaDurationForPlayoutDuration(this.f54091l + jNanoTime, this.f54089j);
            if (!z) {
                playbackHeadPositionUs = Math.max(0L, playbackHeadPositionUs - this.f54094o);
            }
        }
        if (this.f54077E != zHasAdvancingTimestamp) {
            this.f54079G = this.f54076D;
            this.f54078F = this.f54075C;
        }
        long j = jNanoTime - this.f54079G;
        if (j < 1000000) {
            long mediaDurationForPlayoutDuration = this.f54078F + x0i.getMediaDurationForPlayoutDuration(j, this.f54089j);
            long j2 = (j * 1000) / 1000000;
            playbackHeadPositionUs = ((playbackHeadPositionUs * j2) + ((1000 - j2) * mediaDurationForPlayoutDuration)) / 1000;
        }
        if (!this.f54090k) {
            long j3 = this.f54075C;
            if (playbackHeadPositionUs > j3) {
                this.f54090k = true;
                this.f54080a.onPositionAdvancing(System.currentTimeMillis() - x0i.usToMs(x0i.getPlayoutDurationForMediaDuration(x0i.usToMs(playbackHeadPositionUs - j3), this.f54089j)));
            }
        }
        this.f54076D = jNanoTime;
        this.f54075C = playbackHeadPositionUs;
        this.f54077E = zHasAdvancingTimestamp;
        return playbackHeadPositionUs;
    }

    public void handleEndOfStream(long j) {
        this.f54073A = getPlaybackHeadPosition();
        this.f54104y = SystemClock.elapsedRealtime() * 1000;
        this.f54074B = j;
    }

    public boolean hasPendingData(long j) {
        return j > x0i.durationUsToSampleCount(getCurrentPositionUs(false), this.f54086g) || forceHasPendingData();
    }

    public boolean isPlaying() {
        return ((AudioTrack) u80.checkNotNull(this.f54082c)).getPlayState() == 3;
    }

    public boolean isStalled(long j) {
        return this.f54105z != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f54105z >= 200;
    }

    public boolean mayHandleBuffer(long j) {
        int playState = ((AudioTrack) u80.checkNotNull(this.f54082c)).getPlayState();
        if (this.f54087h) {
            if (playState == 2) {
                this.f54095p = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z = this.f54095p;
        boolean zHasPendingData = hasPendingData(j);
        this.f54095p = zHasPendingData;
        if (z && !zHasPendingData && playState != 1) {
            this.f54080a.onUnderrun(this.f54084e, x0i.usToMs(this.f54088i));
        }
        return true;
    }

    public boolean pause() {
        resetSyncParams();
        if (this.f54104y != -9223372036854775807L) {
            return false;
        }
        ((gh0) u80.checkNotNull(this.f54085f)).reset();
        return true;
    }

    public void reset() {
        resetSyncParams();
        this.f54082c = null;
        this.f54085f = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f54082c = audioTrack;
        this.f54083d = i2;
        this.f54084e = i3;
        this.f54085f = new gh0(audioTrack);
        this.f54086g = audioTrack.getSampleRate();
        this.f54087h = z && needsPassthroughWorkarounds(i);
        boolean zIsEncodingLinearPcm = x0i.isEncodingLinearPcm(i);
        this.f54096q = zIsEncodingLinearPcm;
        this.f54088i = zIsEncodingLinearPcm ? x0i.sampleCountToDurationUs(i3 / i2, this.f54086g) : -9223372036854775807L;
        this.f54099t = 0L;
        this.f54100u = 0L;
        this.f54101v = 0L;
        this.f54095p = false;
        this.f54104y = -9223372036854775807L;
        this.f54105z = -9223372036854775807L;
        this.f54097r = 0L;
        this.f54094o = 0L;
        this.f54089j = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f) {
        this.f54089j = f;
        gh0 gh0Var = this.f54085f;
        if (gh0Var != null) {
            gh0Var.reset();
        }
        resetSyncParams();
    }

    public void start() {
        ((gh0) u80.checkNotNull(this.f54085f)).reset();
    }
}
