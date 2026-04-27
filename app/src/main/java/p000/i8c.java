package p000;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class i8c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7187d f46044a;

    /* JADX INFO: renamed from: b */
    public final kv6 f46045b;

    /* JADX INFO: renamed from: c */
    public int f46046c = 65535;

    /* JADX INFO: renamed from: d */
    public final C7186c f46047d = new C7186c(0, 65535, null);

    /* JADX INFO: renamed from: i8c$b */
    public interface InterfaceC7185b {
        void onSentBytes(int i);
    }

    /* JADX INFO: renamed from: i8c$c */
    public final class C7186c {

        /* JADX INFO: renamed from: b */
        public Runnable f46049b;

        /* JADX INFO: renamed from: c */
        public final int f46050c;

        /* JADX INFO: renamed from: d */
        public int f46051d;

        /* JADX INFO: renamed from: e */
        public int f46052e;

        /* JADX INFO: renamed from: f */
        public final InterfaceC7185b f46053f;

        /* JADX INFO: renamed from: a */
        public final Buffer f46048a = new Buffer();

        /* JADX INFO: renamed from: g */
        public boolean f46054g = false;

        public C7186c(int i, int i2, InterfaceC7185b interfaceC7185b) {
            this.f46050c = i;
            this.f46051d = i2;
            this.f46053f = interfaceC7185b;
        }

        /* JADX INFO: renamed from: a */
        public void m12856a(int i) {
            this.f46052e += i;
        }

        /* JADX INFO: renamed from: b */
        public int m12857b() {
            return this.f46052e;
        }

        /* JADX INFO: renamed from: c */
        public void m12858c() {
            this.f46052e = 0;
        }

        /* JADX INFO: renamed from: d */
        public void m12859d(Buffer buffer, int i, boolean z) {
            this.f46048a.write(buffer, i);
            this.f46054g |= z;
        }

        /* JADX INFO: renamed from: e */
        public boolean m12860e() {
            return this.f46048a.size() > 0;
        }

        /* JADX INFO: renamed from: f */
        public int m12861f(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.f46051d) {
                int i2 = this.f46051d + i;
                this.f46051d = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f46050c);
        }

        /* JADX INFO: renamed from: g */
        public void m12862g(Runnable runnable) {
            v7d.checkState(this.f46049b == null, "pending data notification already requested");
            this.f46049b = runnable;
        }

        /* JADX INFO: renamed from: h */
        public int m12863h() {
            return Math.max(0, Math.min(this.f46051d, (int) this.f46048a.size()));
        }

        /* JADX INFO: renamed from: i */
        public int m12864i() {
            return m12863h() - this.f46052e;
        }

        /* JADX INFO: renamed from: j */
        public int m12865j() {
            return this.f46051d;
        }

        /* JADX INFO: renamed from: k */
        public int m12866k() {
            return Math.min(this.f46051d, i8c.this.f46047d.m12865j());
        }

        /* JADX INFO: renamed from: l */
        public void m12867l(Buffer buffer, int i, boolean z) {
            do {
                int iMin = Math.min(i, i8c.this.f46045b.maxDataLength());
                int i2 = -iMin;
                i8c.this.f46047d.m12861f(i2);
                m12861f(i2);
                try {
                    i8c.this.f46045b.data(buffer.size() == ((long) iMin) && z, this.f46050c, buffer, iMin);
                    this.f46053f.onSentBytes(iMin);
                    i -= iMin;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        /* JADX INFO: renamed from: m */
        public int m12868m(int i, C7188e c7188e) {
            Runnable runnable;
            int iMin = Math.min(i, m12866k());
            int size = 0;
            while (m12860e() && iMin > 0) {
                if (iMin >= this.f46048a.size()) {
                    size += (int) this.f46048a.size();
                    Buffer buffer = this.f46048a;
                    m12867l(buffer, (int) buffer.size(), this.f46054g);
                } else {
                    size += iMin;
                    m12867l(this.f46048a, iMin, false);
                }
                c7188e.m12870b();
                iMin = Math.min(i - size, m12866k());
            }
            if (!m12860e() && (runnable = this.f46049b) != null) {
                runnable.run();
                this.f46049b = null;
            }
            return size;
        }
    }

    /* JADX INFO: renamed from: i8c$d */
    public interface InterfaceC7187d {
        C7186c[] getActiveStreams();
    }

    /* JADX INFO: renamed from: i8c$e */
    public static final class C7188e {

        /* JADX INFO: renamed from: a */
        public int f46056a;

        private C7188e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m12869a() {
            return this.f46056a > 0;
        }

        /* JADX INFO: renamed from: b */
        public void m12870b() {
            this.f46056a++;
        }
    }

    public i8c(InterfaceC7187d interfaceC7187d, kv6 kv6Var) {
        this.f46044a = (InterfaceC7187d) v7d.checkNotNull(interfaceC7187d, NotificationCompat.CATEGORY_TRANSPORT);
        this.f46045b = (kv6) v7d.checkNotNull(kv6Var, "frameWriter");
    }

    public C7186c createState(InterfaceC7185b interfaceC7185b, int i) {
        return new C7186c(i, this.f46046c, (InterfaceC7185b) v7d.checkNotNull(interfaceC7185b, "stream"));
    }

    public void data(boolean z, C7186c c7186c, Buffer buffer, boolean z2) {
        v7d.checkNotNull(buffer, "source");
        int iM12866k = c7186c.m12866k();
        boolean zM12860e = c7186c.m12860e();
        int size = (int) buffer.size();
        if (zM12860e || iM12866k < size) {
            if (!zM12860e && iM12866k > 0) {
                c7186c.m12867l(buffer, iM12866k, false);
            }
            c7186c.m12859d(buffer, (int) buffer.size(), z);
        } else {
            c7186c.m12867l(buffer, size, z);
        }
        if (z2) {
            flush();
        }
    }

    public void flush() {
        try {
            this.f46045b.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean initialOutboundWindowSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i);
        }
        int i2 = i - this.f46046c;
        this.f46046c = i;
        for (C7186c c7186c : this.f46044a.getActiveStreams()) {
            c7186c.m12861f(i2);
        }
        return i2 > 0;
    }

    public void notifyWhenNoPendingData(C7186c c7186c, Runnable runnable) {
        v7d.checkNotNull(runnable, "noPendingDataRunnable");
        if (c7186c.m12860e()) {
            c7186c.m12862g(runnable);
        } else {
            runnable.run();
        }
    }

    public int windowUpdate(@eib C7186c c7186c, int i) {
        if (c7186c == null) {
            int iM12861f = this.f46047d.m12861f(i);
            writeStreams();
            return iM12861f;
        }
        int iM12861f2 = c7186c.m12861f(i);
        C7188e c7188e = new C7188e();
        c7186c.m12868m(c7186c.m12866k(), c7188e);
        if (c7188e.m12869a()) {
            flush();
        }
        return iM12861f2;
    }

    public void writeStreams() {
        int i;
        C7186c[] activeStreams = this.f46044a.getActiveStreams();
        Collections.shuffle(Arrays.asList(activeStreams));
        int iM12865j = this.f46047d.m12865j();
        int length = activeStreams.length;
        while (true) {
            i = 0;
            if (length <= 0 || iM12865j <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iM12865j / length);
            for (int i2 = 0; i2 < length && iM12865j > 0; i2++) {
                C7186c c7186c = activeStreams[i2];
                int iMin = Math.min(iM12865j, Math.min(c7186c.m12864i(), iCeil));
                if (iMin > 0) {
                    c7186c.m12856a(iMin);
                    iM12865j -= iMin;
                }
                if (c7186c.m12864i() > 0) {
                    activeStreams[i] = c7186c;
                    i++;
                }
            }
            length = i;
        }
        C7188e c7188e = new C7188e();
        C7186c[] activeStreams2 = this.f46044a.getActiveStreams();
        int length2 = activeStreams2.length;
        while (i < length2) {
            C7186c c7186c2 = activeStreams2[i];
            c7186c2.m12868m(c7186c2.m12857b(), c7188e);
            c7186c2.m12858c();
            i++;
        }
        if (c7188e.m12869a()) {
            flush();
        }
    }
}
