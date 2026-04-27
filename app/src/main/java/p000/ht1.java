package p000;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p000.ht1;
import p000.ul3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ht1 implements zdg {

    /* JADX INFO: renamed from: g */
    public static final int f44797g = 10;

    /* JADX INFO: renamed from: h */
    public static final int f44798h = 2;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<C7006b> f44799a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<keg> f44800b;

    /* JADX INFO: renamed from: c */
    public final PriorityQueue<C7006b> f44801c;

    /* JADX INFO: renamed from: d */
    @hib
    public C7006b f44802d;

    /* JADX INFO: renamed from: e */
    public long f44803e;

    /* JADX INFO: renamed from: f */
    public long f44804f;

    /* JADX INFO: renamed from: ht1$b */
    public static final class C7006b extends ieg implements Comparable<C7006b> {

        /* JADX INFO: renamed from: Q */
        public long f44805Q;

        private C7006b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(C7006b c7006b) {
            if (isEndOfStream() != c7006b.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.f82164f - c7006b.f82164f;
            if (j == 0) {
                j = this.f44805Q - c7006b.f44805Q;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: ht1$c */
    public static final class C7007c extends keg {

        /* JADX INFO: renamed from: f */
        public ul3.InterfaceC13578a<C7007c> f44806f;

        public C7007c(ul3.InterfaceC13578a<C7007c> interfaceC13578a) {
            this.f44806f = interfaceC13578a;
        }

        @Override // p000.ul3
        public final void release() {
            this.f44806f.releaseOutputBuffer(this);
        }
    }

    public ht1() {
        for (int i = 0; i < 10; i++) {
            this.f44799a.add(new C7006b());
        }
        this.f44800b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f44800b.add(new C7007c(new ul3.InterfaceC13578a() { // from class: et1
                @Override // p000.ul3.InterfaceC13578a
                public final void releaseOutputBuffer(ul3 ul3Var) {
                    this.f33993a.m12600f((ht1.C7007c) ul3Var);
                }
            }));
        }
        this.f44801c = new PriorityQueue<>();
    }

    private void releaseInputBuffer(C7006b c7006b) {
        c7006b.clear();
        this.f44799a.add(c7006b);
    }

    /* JADX INFO: renamed from: a */
    public abstract xdg mo9344a();

    /* JADX INFO: renamed from: b */
    public abstract void mo9345b(ieg iegVar);

    @hib
    /* JADX INFO: renamed from: c */
    public final keg m12598c() {
        return this.f44800b.pollFirst();
    }

    /* JADX INFO: renamed from: d */
    public final long m12599d() {
        return this.f44803e;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo9346e();

    /* JADX INFO: renamed from: f */
    public void m12600f(keg kegVar) {
        kegVar.clear();
        this.f44800b.add(kegVar);
    }

    @Override // p000.il3
    public void flush() {
        this.f44804f = 0L;
        this.f44803e = 0L;
        while (!this.f44801c.isEmpty()) {
            releaseInputBuffer((C7006b) x0i.castNonNull(this.f44801c.poll()));
        }
        C7006b c7006b = this.f44802d;
        if (c7006b != null) {
            releaseInputBuffer(c7006b);
            this.f44802d = null;
        }
    }

    @Override // p000.il3
    public abstract String getName();

    @Override // p000.il3
    public void release() {
    }

    @Override // p000.zdg
    public void setPositionUs(long j) {
        this.f44803e = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.il3
    @hib
    public ieg dequeueInputBuffer() throws beg {
        u80.checkState(this.f44802d == null);
        if (this.f44799a.isEmpty()) {
            return null;
        }
        C7006b c7006bPollFirst = this.f44799a.pollFirst();
        this.f44802d = c7006bPollFirst;
        return c7006bPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.il3
    @hib
    public keg dequeueOutputBuffer() throws beg {
        if (this.f44800b.isEmpty()) {
            return null;
        }
        while (!this.f44801c.isEmpty() && ((C7006b) x0i.castNonNull(this.f44801c.peek())).f82164f <= this.f44803e) {
            C7006b c7006b = (C7006b) x0i.castNonNull(this.f44801c.poll());
            if (c7006b.isEndOfStream()) {
                keg kegVar = (keg) x0i.castNonNull(this.f44800b.pollFirst());
                kegVar.addFlag(4);
                releaseInputBuffer(c7006b);
                return kegVar;
            }
            mo9345b(c7006b);
            if (mo9346e()) {
                xdg xdgVarMo9344a = mo9344a();
                keg kegVar2 = (keg) x0i.castNonNull(this.f44800b.pollFirst());
                kegVar2.setContent(c7006b.f82164f, xdgVarMo9344a, Long.MAX_VALUE);
                releaseInputBuffer(c7006b);
                return kegVar2;
            }
            releaseInputBuffer(c7006b);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.il3
    public void queueInputBuffer(ieg iegVar) throws beg {
        u80.checkArgument(iegVar == this.f44802d);
        C7006b c7006b = (C7006b) iegVar;
        if (c7006b.isDecodeOnly()) {
            releaseInputBuffer(c7006b);
        } else {
            long j = this.f44804f;
            this.f44804f = 1 + j;
            c7006b.f44805Q = j;
            this.f44801c.add(c7006b);
        }
        this.f44802d = null;
    }
}
