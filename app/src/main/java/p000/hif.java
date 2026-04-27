package p000;

import java.util.ArrayDeque;
import p000.pl3;
import p000.sl3;
import p000.ul3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class hif<I extends sl3, O extends ul3, E extends pl3> implements il3<I, O, E> {

    /* JADX INFO: renamed from: a */
    public final Thread f43761a;

    /* JADX INFO: renamed from: b */
    public final Object f43762b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<I> f43763c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<O> f43764d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e */
    public final I[] f43765e;

    /* JADX INFO: renamed from: f */
    public final O[] f43766f;

    /* JADX INFO: renamed from: g */
    public int f43767g;

    /* JADX INFO: renamed from: h */
    public int f43768h;

    /* JADX INFO: renamed from: i */
    @hib
    public I f43769i;

    /* JADX INFO: renamed from: j */
    @hib
    public E f43770j;

    /* JADX INFO: renamed from: k */
    public boolean f43771k;

    /* JADX INFO: renamed from: l */
    public boolean f43772l;

    /* JADX INFO: renamed from: m */
    public int f43773m;

    /* JADX INFO: renamed from: hif$a */
    public class C6865a extends Thread {
        public C6865a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            hif.this.run();
        }
    }

    public hif(I[] iArr, O[] oArr) {
        this.f43765e = iArr;
        this.f43767g = iArr.length;
        for (int i = 0; i < this.f43767g; i++) {
            ((I[]) this.f43765e)[i] = mo9206b();
        }
        this.f43766f = oArr;
        this.f43768h = oArr.length;
        for (int i2 = 0; i2 < this.f43768h; i2++) {
            ((O[]) this.f43766f)[i2] = mo9207c();
        }
        C6865a c6865a = new C6865a("ExoPlayer:SimpleDecoder");
        this.f43761a = c6865a;
        c6865a.start();
    }

    private boolean canDecodeBuffer() {
        return !this.f43763c.isEmpty() && this.f43768h > 0;
    }

    private boolean decode() throws InterruptedException {
        E e;
        synchronized (this.f43762b) {
            while (!this.f43772l && !canDecodeBuffer()) {
                try {
                    this.f43762b.wait();
                } finally {
                }
            }
            if (this.f43772l) {
                return false;
            }
            I iRemoveFirst = this.f43763c.removeFirst();
            O[] oArr = this.f43766f;
            int i = this.f43768h - 1;
            this.f43768h = i;
            O o = oArr[i];
            boolean z = this.f43771k;
            this.f43771k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o.addFlag(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.isFirstSample()) {
                    o.addFlag(134217728);
                }
                try {
                    e = (E) mo9209e(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) mo9208d(e2);
                } catch (RuntimeException e3) {
                    e = (E) mo9208d(e3);
                }
                if (e != null) {
                    synchronized (this.f43762b) {
                        this.f43770j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f43762b) {
                try {
                    if (this.f43771k) {
                        o.release();
                    } else if (o.isDecodeOnly()) {
                        this.f43773m++;
                        o.release();
                    } else {
                        o.f88312c = this.f43773m;
                        this.f43773m = 0;
                        this.f43764d.addLast(o);
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
            this.f43762b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends pl3 */
    private void maybeThrowException() throws E, pl3 {
        E e = this.f43770j;
        if (e != null) {
            throw e;
        }
    }

    private void releaseInputBufferInternal(I i) {
        i.clear();
        I[] iArr = this.f43765e;
        int i2 = this.f43767g;
        this.f43767g = i2 + 1;
        iArr[i2] = i;
    }

    private void releaseOutputBufferInternal(O o) {
        o.clear();
        O[] oArr = this.f43766f;
        int i = this.f43768h;
        this.f43768h = i + 1;
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
    public abstract I mo9206b();

    /* JADX INFO: renamed from: c */
    public abstract O mo9207c();

    /* JADX INFO: renamed from: d */
    public abstract E mo9208d(Throwable th);

    @hib
    /* JADX INFO: renamed from: e */
    public abstract E mo9209e(I i, O o, boolean z);

    @un1
    /* JADX INFO: renamed from: f */
    public void m12411f(O o) {
        synchronized (this.f43762b) {
            releaseOutputBufferInternal(o);
            maybeNotifyDecodeLoop();
        }
    }

    @Override // p000.il3
    public final void flush() {
        synchronized (this.f43762b) {
            try {
                this.f43771k = true;
                this.f43773m = 0;
                I i = this.f43769i;
                if (i != null) {
                    releaseInputBufferInternal(i);
                    this.f43769i = null;
                }
                while (!this.f43763c.isEmpty()) {
                    releaseInputBufferInternal(this.f43763c.removeFirst());
                }
                while (!this.f43764d.isEmpty()) {
                    this.f43764d.removeFirst().release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12412g(int i) {
        u80.checkState(this.f43767g == this.f43765e.length);
        for (I i2 : this.f43765e) {
            i2.ensureSpaceForWrite(i);
        }
    }

    @Override // p000.il3
    @un1
    public void release() {
        synchronized (this.f43762b) {
            this.f43772l = true;
            this.f43762b.notify();
        }
        try {
            this.f43761a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // p000.il3
    @hib
    public final I dequeueInputBuffer() throws pl3 {
        I i;
        synchronized (this.f43762b) {
            maybeThrowException();
            u80.checkState(this.f43769i == null);
            int i2 = this.f43767g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f43765e;
                int i3 = i2 - 1;
                this.f43767g = i3;
                i = iArr[i3];
            }
            this.f43769i = i;
        }
        return i;
    }

    @Override // p000.il3
    @hib
    public final O dequeueOutputBuffer() throws pl3 {
        synchronized (this.f43762b) {
            try {
                maybeThrowException();
                if (this.f43764d.isEmpty()) {
                    return null;
                }
                return this.f43764d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.il3
    public final void queueInputBuffer(I i) throws pl3 {
        synchronized (this.f43762b) {
            maybeThrowException();
            u80.checkArgument(i == this.f43769i);
            this.f43763c.addLast(i);
            maybeNotifyDecodeLoop();
            this.f43769i = null;
        }
    }
}
