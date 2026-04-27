package p000;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class uwa<A, B> {

    /* JADX INFO: renamed from: b */
    public static final int f89266b = 250;

    /* JADX INFO: renamed from: a */
    public final op9<C13749b<A>, B> f89267a;

    /* JADX INFO: renamed from: uwa$a */
    public class C13748a extends op9<C13749b<A>, B> {
        public C13748a(long j) {
            super(j);
        }

        @Override // p000.op9
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo2533c(@efb C13749b<A> c13749b, @hib B b) {
            c13749b.release();
        }
    }

    /* JADX INFO: renamed from: uwa$b */
    @fdi
    public static final class C13749b<A> {

        /* JADX INFO: renamed from: d */
        public static final Queue<C13749b<?>> f89269d = v0i.createQueue(0);

        /* JADX INFO: renamed from: a */
        public int f89270a;

        /* JADX INFO: renamed from: b */
        public int f89271b;

        /* JADX INFO: renamed from: c */
        public A f89272c;

        private C13749b() {
        }

        /* JADX INFO: renamed from: a */
        public static <A> C13749b<A> m23615a(A a, int i, int i2) {
            C13749b<A> c13749b;
            Queue<C13749b<?>> queue = f89269d;
            synchronized (queue) {
                c13749b = (C13749b) queue.poll();
            }
            if (c13749b == null) {
                c13749b = new C13749b<>();
            }
            c13749b.init(a, i, i2);
            return c13749b;
        }

        private void init(A a, int i, int i2) {
            this.f89272c = a;
            this.f89271b = i;
            this.f89270a = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13749b)) {
                return false;
            }
            C13749b c13749b = (C13749b) obj;
            return this.f89271b == c13749b.f89271b && this.f89270a == c13749b.f89270a && this.f89272c.equals(c13749b.f89272c);
        }

        public int hashCode() {
            return (((this.f89270a * 31) + this.f89271b) * 31) + this.f89272c.hashCode();
        }

        public void release() {
            Queue<C13749b<?>> queue = f89269d;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    public uwa() {
        this(250L);
    }

    public void clear() {
        this.f89267a.clearMemory();
    }

    @hib
    public B get(A a, int i, int i2) {
        C13749b<A> c13749bM23615a = C13749b.m23615a(a, i, i2);
        B b = this.f89267a.get(c13749bM23615a);
        c13749bM23615a.release();
        return b;
    }

    public void put(A a, int i, int i2, B b) {
        this.f89267a.put(C13749b.m23615a(a, i, i2), b);
    }

    public uwa(long j) {
        this.f89267a = new C13748a(j);
    }
}
