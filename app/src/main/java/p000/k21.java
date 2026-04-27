package p000;

import java.io.IOException;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class k21 {

    /* JADX INFO: renamed from: e */
    public static final long f52399e = 262144;

    /* JADX INFO: renamed from: a */
    public final C8168a f52400a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8173f f52401b;

    /* JADX INFO: renamed from: c */
    @hib
    public C8170c f52402c;

    /* JADX INFO: renamed from: d */
    public final int f52403d;

    /* JADX INFO: renamed from: k21$a */
    public static class C8168a implements hue {

        /* JADX INFO: renamed from: d */
        public final InterfaceC8171d f52404d;

        /* JADX INFO: renamed from: e */
        public final long f52405e;

        /* JADX INFO: renamed from: f */
        public final long f52406f;

        /* JADX INFO: renamed from: g */
        public final long f52407g;

        /* JADX INFO: renamed from: h */
        public final long f52408h;

        /* JADX INFO: renamed from: i */
        public final long f52409i;

        /* JADX INFO: renamed from: j */
        public final long f52410j;

        public C8168a(InterfaceC8171d interfaceC8171d, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f52404d = interfaceC8171d;
            this.f52405e = j;
            this.f52406f = j2;
            this.f52407g = j3;
            this.f52408h = j4;
            this.f52409i = j5;
            this.f52410j = j6;
        }

        @Override // p000.hue
        public long getDurationUs() {
            return this.f52405e;
        }

        @Override // p000.hue
        public hue.C7023a getSeekPoints(long j) {
            return new hue.C7023a(new kue(j, C8170c.m14469h(this.f52404d.timeUsToTargetTime(j), this.f52406f, this.f52407g, this.f52408h, this.f52409i, this.f52410j)));
        }

        @Override // p000.hue
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j) {
            return this.f52404d.timeUsToTargetTime(j);
        }
    }

    /* JADX INFO: renamed from: k21$b */
    public static final class C8169b implements InterfaceC8171d {
        @Override // p000.k21.InterfaceC8171d
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    /* JADX INFO: renamed from: k21$c */
    public static class C8170c {

        /* JADX INFO: renamed from: a */
        public final long f52411a;

        /* JADX INFO: renamed from: b */
        public final long f52412b;

        /* JADX INFO: renamed from: c */
        public final long f52413c;

        /* JADX INFO: renamed from: d */
        public long f52414d;

        /* JADX INFO: renamed from: e */
        public long f52415e;

        /* JADX INFO: renamed from: f */
        public long f52416f;

        /* JADX INFO: renamed from: g */
        public long f52417g;

        /* JADX INFO: renamed from: h */
        public long f52418h;

        public C8170c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f52411a = j;
            this.f52412b = j2;
            this.f52414d = j3;
            this.f52415e = j4;
            this.f52416f = j5;
            this.f52417g = j6;
            this.f52413c = j7;
            this.f52418h = m14469h(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.f52417g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.f52416f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.f52418h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.f52411a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.f52412b;
        }

        /* JADX INFO: renamed from: h */
        public static long m14469h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return x0i.constrainValue(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        private void updateNextSearchBytePosition() {
            this.f52418h = m14469h(this.f52412b, this.f52414d, this.f52415e, this.f52416f, this.f52417g, this.f52413c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j, long j2) {
            this.f52415e = j;
            this.f52417g = j2;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j, long j2) {
            this.f52414d = j;
            this.f52416f = j2;
            updateNextSearchBytePosition();
        }
    }

    /* JADX INFO: renamed from: k21$d */
    public interface InterfaceC8171d {
        long timeUsToTargetTime(long j);
    }

    /* JADX INFO: renamed from: k21$e */
    public static final class C8172e {

        /* JADX INFO: renamed from: d */
        public static final int f52419d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f52420e = -1;

        /* JADX INFO: renamed from: f */
        public static final int f52421f = -2;

        /* JADX INFO: renamed from: g */
        public static final int f52422g = -3;

        /* JADX INFO: renamed from: h */
        public static final C8172e f52423h = new C8172e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a */
        public final int f52424a;

        /* JADX INFO: renamed from: b */
        public final long f52425b;

        /* JADX INFO: renamed from: c */
        public final long f52426c;

        private C8172e(int i, long j, long j2) {
            this.f52424a = i;
            this.f52425b = j;
            this.f52426c = j2;
        }

        public static C8172e overestimatedResult(long j, long j2) {
            return new C8172e(-1, j, j2);
        }

        public static C8172e targetFoundResult(long j) {
            return new C8172e(0, -9223372036854775807L, j);
        }

        public static C8172e underestimatedResult(long j, long j2) {
            return new C8172e(-2, j, j2);
        }
    }

    /* JADX INFO: renamed from: k21$f */
    public interface InterfaceC8173f {
        default void onSeekFinished() {
        }

        C8172e searchForTimestamp(zj5 zj5Var, long j) throws IOException;
    }

    public k21(InterfaceC8171d interfaceC8171d, InterfaceC8173f interfaceC8173f, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f52401b = interfaceC8173f;
        this.f52403d = i;
        this.f52400a = new C8168a(interfaceC8171d, j, j2, j3, j4, j5, j6);
    }

    /* JADX INFO: renamed from: a */
    public C8170c m14452a(long j) {
        return new C8170c(j, this.f52400a.timeUsToTargetTime(j), this.f52400a.f52406f, this.f52400a.f52407g, this.f52400a.f52408h, this.f52400a.f52409i, this.f52400a.f52410j);
    }

    /* JADX INFO: renamed from: b */
    public final void m14453b(boolean z, long j) {
        this.f52402c = null;
        this.f52401b.onSeekFinished();
        m14454c(z, j);
    }

    /* JADX INFO: renamed from: c */
    public void m14454c(boolean z, long j) {
    }

    /* JADX INFO: renamed from: d */
    public final int m14455d(zj5 zj5Var, long j, c5d c5dVar) {
        if (j == zj5Var.getPosition()) {
            return 0;
        }
        c5dVar.f15813a = j;
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14456e(zj5 zj5Var, long j) throws IOException {
        long position = j - zj5Var.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        zj5Var.skipFully((int) position);
        return true;
    }

    public final hue getSeekMap() {
        return this.f52400a;
    }

    public int handlePendingSeek(zj5 zj5Var, c5d c5dVar) throws IOException {
        while (true) {
            C8170c c8170c = (C8170c) u80.checkStateNotNull(this.f52402c);
            long floorBytePosition = c8170c.getFloorBytePosition();
            long ceilingBytePosition = c8170c.getCeilingBytePosition();
            long nextSearchBytePosition = c8170c.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.f52403d) {
                m14453b(false, floorBytePosition);
                return m14455d(zj5Var, floorBytePosition, c5dVar);
            }
            if (!m14456e(zj5Var, nextSearchBytePosition)) {
                return m14455d(zj5Var, nextSearchBytePosition, c5dVar);
            }
            zj5Var.resetPeekPosition();
            C8172e c8172eSearchForTimestamp = this.f52401b.searchForTimestamp(zj5Var, c8170c.getTargetTimePosition());
            int i = c8172eSearchForTimestamp.f52424a;
            if (i == -3) {
                m14453b(false, nextSearchBytePosition);
                return m14455d(zj5Var, nextSearchBytePosition, c5dVar);
            }
            if (i == -2) {
                c8170c.updateSeekFloor(c8172eSearchForTimestamp.f52425b, c8172eSearchForTimestamp.f52426c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m14456e(zj5Var, c8172eSearchForTimestamp.f52426c);
                    m14453b(true, c8172eSearchForTimestamp.f52426c);
                    return m14455d(zj5Var, c8172eSearchForTimestamp.f52426c, c5dVar);
                }
                c8170c.updateSeekCeiling(c8172eSearchForTimestamp.f52425b, c8172eSearchForTimestamp.f52426c);
            }
        }
    }

    public final boolean isSeeking() {
        return this.f52402c != null;
    }

    public final void setSeekTargetUs(long j) {
        C8170c c8170c = this.f52402c;
        if (c8170c == null || c8170c.getSeekTimeUs() != j) {
            this.f52402c = m14452a(j);
        }
    }
}
