package p000;

import java.io.IOException;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class j21 {

    /* JADX INFO: renamed from: e */
    public static final long f49379e = 262144;

    /* JADX INFO: renamed from: a */
    public final C7719a f49380a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7724f f49381b;

    /* JADX INFO: renamed from: c */
    @hib
    public C7721c f49382c;

    /* JADX INFO: renamed from: d */
    public final int f49383d;

    /* JADX INFO: renamed from: j21$a */
    public static class C7719a implements gue {

        /* JADX INFO: renamed from: d */
        public final InterfaceC7722d f49384d;

        /* JADX INFO: renamed from: e */
        public final long f49385e;

        /* JADX INFO: renamed from: f */
        public final long f49386f;

        /* JADX INFO: renamed from: g */
        public final long f49387g;

        /* JADX INFO: renamed from: h */
        public final long f49388h;

        /* JADX INFO: renamed from: i */
        public final long f49389i;

        /* JADX INFO: renamed from: j */
        public final long f49390j;

        public C7719a(InterfaceC7722d interfaceC7722d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f49384d = interfaceC7722d;
            this.f49385e = j;
            this.f49386f = j2;
            this.f49387g = j3;
            this.f49388h = j4;
            this.f49389i = j5;
            this.f49390j = j6;
        }

        @Override // p000.gue
        public long getDurationUs() {
            return this.f49385e;
        }

        @Override // p000.gue
        public gue.C6548a getSeekPoints(long j) {
            return new gue.C6548a(new lue(j, C7721c.m13699h(this.f49384d.timeUsToTargetTime(j), this.f49386f, this.f49387g, this.f49388h, this.f49389i, this.f49390j)));
        }

        @Override // p000.gue
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j) {
            return this.f49384d.timeUsToTargetTime(j);
        }
    }

    /* JADX INFO: renamed from: j21$b */
    public static final class C7720b implements InterfaceC7722d {
        @Override // p000.j21.InterfaceC7722d
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    /* JADX INFO: renamed from: j21$c */
    public static class C7721c {

        /* JADX INFO: renamed from: a */
        public final long f49391a;

        /* JADX INFO: renamed from: b */
        public final long f49392b;

        /* JADX INFO: renamed from: c */
        public final long f49393c;

        /* JADX INFO: renamed from: d */
        public long f49394d;

        /* JADX INFO: renamed from: e */
        public long f49395e;

        /* JADX INFO: renamed from: f */
        public long f49396f;

        /* JADX INFO: renamed from: g */
        public long f49397g;

        /* JADX INFO: renamed from: h */
        public long f49398h;

        public C7721c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f49391a = j;
            this.f49392b = j2;
            this.f49394d = j3;
            this.f49395e = j4;
            this.f49396f = j5;
            this.f49397g = j6;
            this.f49393c = j7;
            this.f49398h = m13699h(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.f49397g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.f49396f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.f49398h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.f49391a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.f49392b;
        }

        /* JADX INFO: renamed from: h */
        public static long m13699h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return t0i.constrainValue(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        private void updateNextSearchBytePosition() {
            this.f49398h = m13699h(this.f49392b, this.f49394d, this.f49395e, this.f49396f, this.f49397g, this.f49393c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j, long j2) {
            this.f49395e = j;
            this.f49397g = j2;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j, long j2) {
            this.f49394d = j;
            this.f49396f = j2;
            updateNextSearchBytePosition();
        }
    }

    /* JADX INFO: renamed from: j21$d */
    public interface InterfaceC7722d {
        long timeUsToTargetTime(long j);
    }

    /* JADX INFO: renamed from: j21$e */
    public static final class C7723e {

        /* JADX INFO: renamed from: d */
        public static final int f49399d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f49400e = -1;

        /* JADX INFO: renamed from: f */
        public static final int f49401f = -2;

        /* JADX INFO: renamed from: g */
        public static final int f49402g = -3;

        /* JADX INFO: renamed from: h */
        public static final C7723e f49403h = new C7723e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a */
        public final int f49404a;

        /* JADX INFO: renamed from: b */
        public final long f49405b;

        /* JADX INFO: renamed from: c */
        public final long f49406c;

        private C7723e(int i, long j, long j2) {
            this.f49404a = i;
            this.f49405b = j;
            this.f49406c = j2;
        }

        public static C7723e overestimatedResult(long j, long j2) {
            return new C7723e(-1, j, j2);
        }

        public static C7723e targetFoundResult(long j) {
            return new C7723e(0, -9223372036854775807L, j);
        }

        public static C7723e underestimatedResult(long j, long j2) {
            return new C7723e(-2, j, j2);
        }
    }

    /* JADX INFO: renamed from: j21$f */
    public interface InterfaceC7724f {
        default void onSeekFinished() {
        }

        C7723e searchForTimestamp(ak5 ak5Var, long j) throws IOException;
    }

    public j21(InterfaceC7722d interfaceC7722d, InterfaceC7724f interfaceC7724f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f49381b = interfaceC7724f;
        this.f49383d = i;
        this.f49380a = new C7719a(interfaceC7722d, j, j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a */
    public C7721c m13682a(long j) {
        return new C7721c(j, this.f49380a.timeUsToTargetTime(j), this.f49380a.f49386f, this.f49380a.f49387g, this.f49380a.f49388h, this.f49380a.f49389i, this.f49380a.f49390j);
    }

    /* JADX INFO: renamed from: b */
    public final void m13683b(boolean z, long j) {
        this.f49382c = null;
        this.f49381b.onSeekFinished();
        m13684c(z, j);
    }

    /* JADX INFO: renamed from: c */
    public void m13684c(boolean z, long j) {
    }

    /* JADX INFO: renamed from: d */
    public final int m13685d(ak5 ak5Var, long j, d5d d5dVar) {
        if (j == ak5Var.getPosition()) {
            return 0;
        }
        d5dVar.f28476a = j;
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13686e(ak5 ak5Var, long j) throws IOException {
        long position = j - ak5Var.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        ak5Var.skipFully((int) position);
        return true;
    }

    public final gue getSeekMap() {
        return this.f49380a;
    }

    public int handlePendingSeek(ak5 ak5Var, d5d d5dVar) throws IOException {
        while (true) {
            C7721c c7721c = (C7721c) v80.checkStateNotNull(this.f49382c);
            long floorBytePosition = c7721c.getFloorBytePosition();
            long ceilingBytePosition = c7721c.getCeilingBytePosition();
            long nextSearchBytePosition = c7721c.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.f49383d) {
                m13683b(false, floorBytePosition);
                return m13685d(ak5Var, floorBytePosition, d5dVar);
            }
            if (!m13686e(ak5Var, nextSearchBytePosition)) {
                return m13685d(ak5Var, nextSearchBytePosition, d5dVar);
            }
            ak5Var.resetPeekPosition();
            C7723e c7723eSearchForTimestamp = this.f49381b.searchForTimestamp(ak5Var, c7721c.getTargetTimePosition());
            int i = c7723eSearchForTimestamp.f49404a;
            if (i == -3) {
                m13683b(false, nextSearchBytePosition);
                return m13685d(ak5Var, nextSearchBytePosition, d5dVar);
            }
            if (i == -2) {
                c7721c.updateSeekFloor(c7723eSearchForTimestamp.f49405b, c7723eSearchForTimestamp.f49406c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m13686e(ak5Var, c7723eSearchForTimestamp.f49406c);
                    m13683b(true, c7723eSearchForTimestamp.f49406c);
                    return m13685d(ak5Var, c7723eSearchForTimestamp.f49406c, d5dVar);
                }
                c7721c.updateSeekCeiling(c7723eSearchForTimestamp.f49405b, c7723eSearchForTimestamp.f49406c);
            }
        }
    }

    public final boolean isSeeking() {
        return this.f49382c != null;
    }

    public final void setSeekTargetUs(long j) {
        C7721c c7721c = this.f49382c;
        if (c7721c == null || c7721c.getSeekTimeUs() != j) {
            this.f49382c = m13682a(j);
        }
    }
}
