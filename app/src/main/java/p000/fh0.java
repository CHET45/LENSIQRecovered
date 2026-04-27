package p000;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p000.jh0;

/* JADX INFO: loaded from: classes3.dex */
public final class fh0 {

    /* JADX INFO: renamed from: j */
    public static final int f36538j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f36539k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f36540l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f36541m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f36542n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f36543o = 10000;

    /* JADX INFO: renamed from: p */
    public static final int f36544p = 10000000;

    /* JADX INFO: renamed from: q */
    public static final int f36545q = 500000;

    /* JADX INFO: renamed from: r */
    public static final int f36546r = 500000;

    /* JADX INFO: renamed from: s */
    public static final long f36547s = 1000;

    /* JADX INFO: renamed from: t */
    public static final int f36548t = 2000000;

    /* JADX INFO: renamed from: u */
    public static final long f36549u = 5000000;

    /* JADX INFO: renamed from: a */
    public final C5801a f36550a;

    /* JADX INFO: renamed from: b */
    public final int f36551b;

    /* JADX INFO: renamed from: c */
    public final jh0.InterfaceC7899a f36552c;

    /* JADX INFO: renamed from: d */
    public int f36553d;

    /* JADX INFO: renamed from: e */
    public long f36554e;

    /* JADX INFO: renamed from: f */
    public long f36555f;

    /* JADX INFO: renamed from: g */
    public long f36556g;

    /* JADX INFO: renamed from: h */
    public long f36557h;

    /* JADX INFO: renamed from: i */
    public long f36558i;

    /* JADX INFO: renamed from: fh0$a */
    public static final class C5801a {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f36559a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f36560b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f36561c;

        /* JADX INFO: renamed from: d */
        public long f36562d;

        /* JADX INFO: renamed from: e */
        public long f36563e;

        /* JADX INFO: renamed from: f */
        public boolean f36564f;

        /* JADX INFO: renamed from: g */
        public long f36565g;

        public C5801a(AudioTrack audioTrack) {
            this.f36559a = audioTrack;
        }

        public void expectTimestampFramePositionReset() {
            this.f36564f = true;
        }

        public long getTimestampPositionFrames() {
            return this.f36563e;
        }

        public long getTimestampSystemTimeUs() {
            return this.f36560b.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.f36559a.getTimestamp(this.f36560b);
            if (timestamp) {
                long j = this.f36560b.framePosition;
                long j2 = this.f36562d;
                if (j2 > j) {
                    if (this.f36564f) {
                        this.f36565g += j2;
                        this.f36564f = false;
                    } else {
                        this.f36561c++;
                    }
                }
                this.f36562d = j;
                this.f36563e = j + this.f36565g + (this.f36561c << 32);
            }
            return timestamp;
        }
    }

    public fh0(AudioTrack audioTrack, jh0.InterfaceC7899a interfaceC7899a) {
        this.f36550a = new C5801a(audioTrack);
        this.f36551b = audioTrack.getSampleRate();
        this.f36552c = interfaceC7899a;
        reset();
    }

    private void checkTimestampIsPlausibleAndUpdateErrorState(long j, float f, long j2) {
        long timestampSystemTimeUs = this.f36550a.getTimestampSystemTimeUs();
        long jComputeTimestampPositionUs = computeTimestampPositionUs(j, f);
        if (Math.abs(timestampSystemTimeUs - j) > 5000000) {
            this.f36552c.onSystemTimeUsMismatch(this.f36550a.getTimestampPositionFrames(), timestampSystemTimeUs, j, j2);
            updateState(4);
        } else if (Math.abs(jComputeTimestampPositionUs - j2) > 5000000) {
            this.f36552c.onPositionFramesMismatch(this.f36550a.getTimestampPositionFrames(), timestampSystemTimeUs, j, j2);
            updateState(4);
        } else if (this.f36553d == 4) {
            reset();
        }
    }

    private long computeTimestampPositionUs(long j, float f) {
        return computeTimestampPositionUs(this.f36550a.getTimestampPositionFrames(), this.f36550a.getTimestampSystemTimeUs(), j, f);
    }

    private boolean isTimestampAdvancingFromInitialTimestamp(long j, float f) {
        long timestampPositionFrames = this.f36550a.getTimestampPositionFrames();
        long j2 = this.f36557h;
        if (timestampPositionFrames <= j2) {
            return false;
        }
        return Math.abs(computeTimestampPositionUs(j, f) - computeTimestampPositionUs(j2, this.f36558i, j, f)) < 1000;
    }

    private void updateState(int i) {
        this.f36553d = i;
        if (i == 0) {
            this.f36556g = 0L;
            this.f36557h = -1L;
            this.f36558i = -9223372036854775807L;
            this.f36554e = System.nanoTime() / 1000;
            this.f36555f = 10000L;
            return;
        }
        if (i == 1) {
            this.f36555f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f36555f = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f36555f = 500000L;
        }
    }

    public void expectTimestampFramePositionReset() {
        this.f36550a.expectTimestampFramePositionReset();
    }

    public long getTimestampPositionUs(long j, float f) {
        return computeTimestampPositionUs(j, f);
    }

    public boolean hasAdvancingTimestamp() {
        return this.f36553d == 2;
    }

    public boolean isWaitingForAdvancingTimestamp() {
        int i = this.f36553d;
        return i == 0 || i == 1;
    }

    public void maybePollTimestamp(long j, float f, long j2) {
        if (j - this.f36556g < this.f36555f) {
            return;
        }
        this.f36556g = j;
        boolean zMaybeUpdateTimestamp = this.f36550a.maybeUpdateTimestamp();
        if (zMaybeUpdateTimestamp) {
            checkTimestampIsPlausibleAndUpdateErrorState(j, f, j2);
        }
        int i = this.f36553d;
        if (i == 0) {
            if (!zMaybeUpdateTimestamp) {
                if (j - this.f36554e > 500000) {
                    updateState(3);
                    return;
                }
                return;
            } else {
                if (this.f36550a.getTimestampSystemTimeUs() >= this.f36554e) {
                    this.f36557h = this.f36550a.getTimestampPositionFrames();
                    this.f36558i = this.f36550a.getTimestampSystemTimeUs();
                    updateState(1);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (!zMaybeUpdateTimestamp) {
                reset();
                return;
            }
            if (isTimestampAdvancingFromInitialTimestamp(j, f)) {
                updateState(2);
                return;
            } else if (j - this.f36554e > pcf.f70342A) {
                updateState(3);
                return;
            } else {
                this.f36557h = this.f36550a.getTimestampPositionFrames();
                this.f36558i = this.f36550a.getTimestampSystemTimeUs();
                return;
            }
        }
        if (i == 2) {
            if (zMaybeUpdateTimestamp) {
                return;
            }
            reset();
        } else if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
        } else if (zMaybeUpdateTimestamp) {
            reset();
        }
    }

    public void reset() {
        updateState(0);
    }

    private long computeTimestampPositionUs(long j, long j2, long j3, float f) {
        return t0i.sampleCountToDurationUs(j, this.f36551b) + t0i.getMediaDurationForPlayoutDuration(j3 - j2, f);
    }
}
