package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class pzf<E> extends AtomicReferenceArray<E> implements uif<E> {

    /* JADX INFO: renamed from: f */
    public static final Integer f72595f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: a */
    public final int f72596a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f72597b;

    /* JADX INFO: renamed from: c */
    public long f72598c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f72599d;

    /* JADX INFO: renamed from: e */
    public final int f72600e;

    public pzf(int i) {
        super(x5d.roundToPowerOfTwo(i));
        this.f72596a = length() - 1;
        this.f72597b = new AtomicLong();
        this.f72599d = new AtomicLong();
        this.f72600e = Math.min(i / 4, f72595f.intValue());
    }

    /* JADX INFO: renamed from: a */
    public int m19854a(long j) {
        return ((int) j) & this.f72596a;
    }

    /* JADX INFO: renamed from: b */
    public int m19855b(long j, int i) {
        return ((int) j) & i;
    }

    /* JADX INFO: renamed from: c */
    public E m19856c(int i) {
        return get(i);
    }

    @Override // p000.ajf
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m19857d(long j) {
        this.f72599d.lazySet(j);
    }

    /* JADX INFO: renamed from: e */
    public void m19858e(int i, E e) {
        lazySet(i, e);
    }

    /* JADX INFO: renamed from: f */
    public void m19859f(long j) {
        this.f72597b.lazySet(j);
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return this.f72597b.get() == this.f72599d.get();
    }

    @Override // p000.ajf
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.f72596a;
        long j = this.f72597b.get();
        int iM19855b = m19855b(j, i);
        if (j >= this.f72598c) {
            long j2 = ((long) this.f72600e) + j;
            if (m19856c(m19855b(j2, i)) == null) {
                this.f72598c = j2;
            } else if (m19856c(iM19855b) != null) {
                return false;
            }
        }
        m19858e(iM19855b, e);
        m19859f(j + 1);
        return true;
    }

    @Override // p000.uif, p000.ajf
    @cib
    public E poll() {
        long j = this.f72599d.get();
        int iM19854a = m19854a(j);
        E eM19856c = m19856c(iM19854a);
        if (eM19856c == null) {
            return null;
        }
        m19857d(j + 1);
        m19858e(iM19854a, null);
        return eM19856c;
    }

    @Override // p000.ajf
    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }
}
