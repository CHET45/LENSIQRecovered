package p000;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gh0 {

    /* JADX INFO: renamed from: g */
    public static final int f39793g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f39794h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f39795i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f39796j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f39797k = 4;

    /* JADX INFO: renamed from: l */
    public static final int f39798l = 10000;

    /* JADX INFO: renamed from: m */
    public static final int f39799m = 10000000;

    /* JADX INFO: renamed from: n */
    public static final int f39800n = 500000;

    /* JADX INFO: renamed from: o */
    public static final int f39801o = 500000;

    /* JADX INFO: renamed from: a */
    @hib
    public final C6310a f39802a;

    /* JADX INFO: renamed from: b */
    public int f39803b;

    /* JADX INFO: renamed from: c */
    public long f39804c;

    /* JADX INFO: renamed from: d */
    public long f39805d;

    /* JADX INFO: renamed from: e */
    public long f39806e;

    /* JADX INFO: renamed from: f */
    public long f39807f;

    /* JADX INFO: renamed from: gh0$a */
    @c5e(19)
    public static final class C6310a {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f39808a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f39809b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f39810c;

        /* JADX INFO: renamed from: d */
        public long f39811d;

        /* JADX INFO: renamed from: e */
        public long f39812e;

        public C6310a(AudioTrack audioTrack) {
            this.f39808a = audioTrack;
        }

        public long getTimestampPositionFrames() {
            return this.f39812e;
        }

        public long getTimestampSystemTimeUs() {
            return this.f39809b.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.f39808a.getTimestamp(this.f39809b);
            if (timestamp) {
                long j = this.f39809b.framePosition;
                if (this.f39811d > j) {
                    this.f39810c++;
                }
                this.f39811d = j;
                this.f39812e = j + (this.f39810c << 32);
            }
            return timestamp;
        }
    }

    public gh0(AudioTrack audioTrack) {
        if (x0i.f95978a >= 19) {
            this.f39802a = new C6310a(audioTrack);
            reset();
        } else {
            this.f39802a = null;
            updateState(3);
        }
    }

    private void updateState(int i) {
        this.f39803b = i;
        if (i == 0) {
            this.f39806e = 0L;
            this.f39807f = -1L;
            this.f39804c = System.nanoTime() / 1000;
            this.f39805d = 10000L;
            return;
        }
        if (i == 1) {
            this.f39805d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f39805d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f39805d = 500000L;
        }
    }

    public void acceptTimestamp() {
        if (this.f39803b == 4) {
            reset();
        }
    }

    @omg(19)
    public long getTimestampPositionFrames() {
        C6310a c6310a = this.f39802a;
        if (c6310a != null) {
            return c6310a.getTimestampPositionFrames();
        }
        return -1L;
    }

    @omg(19)
    public long getTimestampSystemTimeUs() {
        C6310a c6310a = this.f39802a;
        if (c6310a != null) {
            return c6310a.getTimestampSystemTimeUs();
        }
        return -9223372036854775807L;
    }

    public boolean hasAdvancingTimestamp() {
        return this.f39803b == 2;
    }

    public boolean hasTimestamp() {
        int i = this.f39803b;
        return i == 1 || i == 2;
    }

    @omg(19)
    public boolean maybePollTimestamp(long j) {
        C6310a c6310a = this.f39802a;
        if (c6310a == null || j - this.f39806e < this.f39805d) {
            return false;
        }
        this.f39806e = j;
        boolean zMaybeUpdateTimestamp = c6310a.maybeUpdateTimestamp();
        int i = this.f39803b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zMaybeUpdateTimestamp) {
                        reset();
                    }
                } else if (!zMaybeUpdateTimestamp) {
                    reset();
                }
            } else if (!zMaybeUpdateTimestamp) {
                reset();
            } else if (this.f39802a.getTimestampPositionFrames() > this.f39807f) {
                updateState(2);
            }
        } else if (zMaybeUpdateTimestamp) {
            if (this.f39802a.getTimestampSystemTimeUs() < this.f39804c) {
                return false;
            }
            this.f39807f = this.f39802a.getTimestampPositionFrames();
            updateState(1);
        } else if (j - this.f39804c > 500000) {
            updateState(3);
        }
        return zMaybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        updateState(4);
    }

    public void reset() {
        if (this.f39802a != null) {
            updateState(0);
        }
    }
}
