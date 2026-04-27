package p000;

import java.util.ArrayDeque;
import p000.ql3;
import p000.rl3;
import p000.tl3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public abstract class iif<I extends rl3, O extends tl3, E extends ql3> implements kl3<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final Thread f47117a;

    /* JADX INFO: renamed from: e */
    public final I[] f47121e;

    /* JADX INFO: renamed from: f */
    public final O[] f47122f;

    /* JADX INFO: renamed from: g */
    public int f47123g;

    /* JADX INFO: renamed from: h */
    public int f47124h;

    /* JADX INFO: renamed from: i */
    @hib
    public I f47125i;

    /* JADX INFO: renamed from: j */
    @hib
    public E f47126j;

    /* JADX INFO: renamed from: k */
    public boolean f47127k;

    /* JADX INFO: renamed from: l */
    public boolean f47128l;

    /* JADX INFO: renamed from: m */
    public int f47129m;

    /* JADX INFO: renamed from: b */
    public final Object f47118b = new Object();

    /* JADX INFO: renamed from: n */
    public long f47130n = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<I> f47119c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<O> f47120d = new ArrayDeque<>();

    /* JADX INFO: renamed from: iif$a */
    public class C7302a extends Thread {
        public C7302a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            iif.this.run();
        }
    }

    public iif(I[] iArr, O[] oArr) {
        this.f47121e = iArr;
        this.f47123g = iArr.length;
        for (int i = 0; i < this.f47123g; i++) {
            ((I[]) this.f47121e)[i] = mo10081b();
        }
        this.f47122f = oArr;
        this.f47124h = oArr.length;
        for (int i2 = 0; i2 < this.f47124h; i2++) {
            ((O[]) this.f47122f)[i2] = mo10082c();
        }
        C7302a c7302a = new C7302a("ExoPlayer:SimpleDecoder");
        this.f47117a = c7302a;
        c7302a.start();
    }

    private boolean canDecodeBuffer() {
        return !this.f47119c.isEmpty() && this.f47124h > 0;
    }

    private boolean decode() throws InterruptedException {
        E e;
        synchronized (this.f47118b) {
            while (!this.f47128l && !canDecodeBuffer()) {
                try {
                    this.f47118b.wait();
                } finally {
                }
            }
            if (this.f47128l) {
                return false;
            }
            I iRemoveFirst = this.f47119c.removeFirst();
            O[] oArr = this.f47122f;
            int i = this.f47124h - 1;
            this.f47124h = i;
            O o = oArr[i];
            boolean z = this.f47127k;
            this.f47127k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                o.f85177b = iRemoveFirst.f78610f;
                if (iRemoveFirst.isFirstSample()) {
                    o.addFlag(134217728);
                }
                if (!m13124f(iRemoveFirst.f78610f)) {
                    o.f85179d = true;
                }
                try {
                    e = (E) mo10084e(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) mo10083d(e2);
                } catch (RuntimeException e3) {
                    e = (E) mo10083d(e3);
                }
                if (e != null) {
                    synchronized (this.f47118b) {
                        this.f47126j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f47118b) {
                try {
                    if (this.f47127k) {
                        o.release();
                    } else if (o.f85179d) {
                        this.f47129m++;
                        o.release();
                    } else {
                        o.f85178c = this.f47129m;
                        this.f47129m = 0;
                        this.f47120d.addLast(o);
                    }
                    releaseInputBufferInternal(iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.f47118b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends ql3 */
    private void maybeThrowException() throws E, ql3 {
        E e = this.f47126j;
        if (e != null) {
            throw e;
        }
    }

    private void releaseInputBufferInternal(I i) {
        i.clear();
        I[] iArr = this.f47121e;
        int i2 = this.f47123g;
        this.f47123g = i2 + 1;
        iArr[i2] = i;
    }

    private void releaseOutputBufferInternal(O o) {
        o.clear();
        O[] oArr = this.f47122f;
        int i = this.f47124h;
        this.f47124h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (decode());
    }

    /* JADX INFO: renamed from: b */
    public abstract I mo10081b();

    /* JADX INFO: renamed from: c */
    public abstract O mo10082c();

    /* JADX INFO: renamed from: d */
    public abstract E mo10083d(Throwable th);

    @hib
    /* JADX INFO: renamed from: e */
    public abstract E mo10084e(I i, O o, boolean z);

    /* JADX INFO: renamed from: f */
    public final boolean m13124f(long j) {
        boolean z;
        synchronized (this.f47118b) {
            long j2 = this.f47130n;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // p000.kl3
    public final void flush() {
        synchronized (this.f47118b) {
            try {
                this.f47127k = true;
                this.f47129m = 0;
                I i = this.f47125i;
                if (i != null) {
                    releaseInputBufferInternal(i);
                    this.f47125i = null;
                }
                while (!this.f47119c.isEmpty()) {
                    releaseInputBufferInternal(this.f47119c.removeFirst());
                }
                while (!this.f47120d.isEmpty()) {
                    this.f47120d.removeFirst().release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @un1
    /* JADX INFO: renamed from: g */
    public void m13125g(O o) {
        synchronized (this.f47118b) {
            releaseOutputBufferInternal(o);
            maybeNotifyDecodeLoop();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m13126h(int i) {
        v80.checkState(this.f47123g == this.f47121e.length);
        for (I i2 : this.f47121e) {
            i2.ensureSpaceForWrite(i);
        }
    }

    @Override // p000.kl3
    @un1
    public void release() {
        synchronized (this.f47118b) {
            this.f47128l = true;
            this.f47118b.notify();
        }
        try {
            this.f47117a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p000.kl3
    public final void setOutputStartTimeUs(long j) {
        synchronized (this.f47118b) {
            try {
                v80.checkState(this.f47123g == this.f47121e.length || this.f47127k);
                this.f47130n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kl3
    @hib
    public final I dequeueInputBuffer() throws ql3 {
        I i;
        synchronized (this.f47118b) {
            maybeThrowException();
            v80.checkState(this.f47125i == null);
            int i2 = this.f47123g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f47121e;
                int i3 = i2 - 1;
                this.f47123g = i3;
                i = iArr[i3];
            }
            this.f47125i = i;
        }
        return i;
    }

    @Override // p000.kl3
    @hib
    public final O dequeueOutputBuffer() throws ql3 {
        synchronized (this.f47118b) {
            try {
                maybeThrowException();
                if (this.f47120d.isEmpty()) {
                    return null;
                }
                return this.f47120d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kl3
    public final void queueInputBuffer(I i) throws ql3 {
        synchronized (this.f47118b) {
            maybeThrowException();
            v80.checkArgument(i == this.f47125i);
            this.f47119c.addLast(i);
            maybeNotifyDecodeLoop();
            this.f47125i = null;
        }
    }
}
