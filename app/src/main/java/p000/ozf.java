package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ozf<E> extends AtomicReferenceArray<E> implements tif<E> {

    /* JADX INFO: renamed from: f */
    public static final Integer f69284f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: a */
    public final int f69285a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f69286b;

    /* JADX INFO: renamed from: c */
    public long f69287c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f69288d;

    /* JADX INFO: renamed from: e */
    public final int f69289e;

    public ozf(int capacity) {
        super(w5d.roundToPowerOfTwo(capacity));
        this.f69285a = length() - 1;
        this.f69286b = new AtomicLong();
        this.f69288d = new AtomicLong();
        this.f69289e = Math.min(capacity / 4, f69284f.intValue());
    }

    /* JADX INFO: renamed from: a */
    public int m19113a(long index) {
        return ((int) index) & this.f69285a;
    }

    /* JADX INFO: renamed from: b */
    public int m19114b(long index, int mask) {
        return ((int) index) & mask;
    }

    /* JADX INFO: renamed from: c */
    public E m19115c(int offset) {
        return get(offset);
    }

    @Override // p000.zif
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19116d(long newIndex) {
        this.f69288d.lazySet(newIndex);
    }

    /* JADX INFO: renamed from: e */
    public void m19117e(int offset, E value) {
        lazySet(offset, value);
    }

    /* JADX INFO: renamed from: f */
    public void m19118f(long newIndex) {
        this.f69286b.lazySet(newIndex);
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return this.f69286b.get() == this.f69288d.get();
    }

    @Override // p000.zif
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.f69285a;
        long j = this.f69286b.get();
        int iM19114b = m19114b(j, i);
        if (j >= this.f69287c) {
            long j2 = ((long) this.f69289e) + j;
            if (m19115c(m19114b(j2, i)) == null) {
                this.f69287c = j2;
            } else if (m19115c(iM19114b) != null) {
                return false;
            }
        }
        m19117e(iM19114b, e);
        m19118f(j + 1);
        return true;
    }

    @Override // p000.tif, p000.zif
    @dib
    public E poll() {
        long j = this.f69288d.get();
        int iM19113a = m19113a(j);
        E eM19115c = m19115c(iM19113a);
        if (eM19115c == null) {
            return null;
        }
        m19116d(j + 1);
        m19117e(iM19113a, null);
        return eM19115c;
    }

    @Override // p000.zif
    public boolean offer(E v1, E v2) {
        return offer(v1) && offer(v2);
    }
}
