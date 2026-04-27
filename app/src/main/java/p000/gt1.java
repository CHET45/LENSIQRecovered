package p000;

import java.util.ArrayDeque;
import p000.gt1;
import p000.tl3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gt1 implements aeg {

    /* JADX INFO: renamed from: h */
    public static final int f40959h = 10;

    /* JADX INFO: renamed from: i */
    public static final int f40960i = 2;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<C6493b> f40961a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<leg> f40962b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<C6493b> f40963c;

    /* JADX INFO: renamed from: d */
    @hib
    public C6493b f40964d;

    /* JADX INFO: renamed from: e */
    public long f40965e;

    /* JADX INFO: renamed from: f */
    public long f40966f;

    /* JADX INFO: renamed from: g */
    public long f40967g;

    /* JADX INFO: renamed from: gt1$b */
    public static final class C6493b extends jeg implements Comparable<C6493b> {

        /* JADX INFO: renamed from: Q */
        public long f40968Q;

        private C6493b() {
        }

        @Override // java.lang.Comparable
        public int compareTo(C6493b c6493b) {
            if (isEndOfStream() != c6493b.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.f78610f - c6493b.f78610f;
            if (j == 0) {
                j = this.f40968Q - c6493b.f40968Q;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: gt1$c */
    public static final class C6494c extends leg {

        /* JADX INFO: renamed from: m */
        public tl3.InterfaceC13090a<C6494c> f40969m;

        public C6494c(tl3.InterfaceC13090a<C6494c> interfaceC13090a) {
            this.f40969m = interfaceC13090a;
        }

        @Override // p000.tl3
        public final void release() {
            this.f40969m.releaseOutputBuffer(this);
        }
    }

    public gt1() {
        for (int i = 0; i < 10; i++) {
            this.f40961a.add(new C6493b());
        }
        this.f40962b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f40962b.add(new C6494c(new tl3.InterfaceC13090a() { // from class: ft1
                @Override // p000.tl3.InterfaceC13090a
                public final void releaseOutputBuffer(tl3 tl3Var) {
                    this.f37653a.m11858f((gt1.C6494c) tl3Var);
                }
            }));
        }
        this.f40963c = new ArrayDeque<>();
        this.f40967g = -9223372036854775807L;
    }

    private void releaseInputBuffer(C6493b c6493b) {
        c6493b.clear();
        this.f40961a.add(c6493b);
    }

    /* JADX INFO: renamed from: a */
    public abstract ydg mo8674a();

    /* JADX INFO: renamed from: b */
    public abstract void mo8675b(jeg jegVar);

    @hib
    /* JADX INFO: renamed from: c */
    public final leg m11856c() {
        return this.f40962b.pollFirst();
    }

    /* JADX INFO: renamed from: d */
    public final long m11857d() {
        return this.f40965e;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo8676e();

    /* JADX INFO: renamed from: f */
    public void m11858f(leg legVar) {
        legVar.clear();
        this.f40962b.add(legVar);
    }

    @Override // p000.kl3
    public void flush() {
        this.f40966f = 0L;
        this.f40965e = 0L;
        while (!this.f40963c.isEmpty()) {
            releaseInputBuffer((C6493b) t0i.castNonNull(this.f40963c.poll()));
        }
        C6493b c6493b = this.f40964d;
        if (c6493b != null) {
            releaseInputBuffer(c6493b);
            this.f40964d = null;
        }
    }

    @Override // p000.kl3
    public abstract String getName();

    @Override // p000.kl3
    public void release() {
    }

    @Override // p000.kl3
    public final void setOutputStartTimeUs(long j) {
        this.f40967g = j;
    }

    @Override // p000.aeg
    public void setPositionUs(long j) {
        this.f40965e = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.kl3
    @hib
    public jeg dequeueInputBuffer() throws ceg {
        v80.checkState(this.f40964d == null);
        if (this.f40961a.isEmpty()) {
            return null;
        }
        C6493b c6493bPollFirst = this.f40961a.pollFirst();
        this.f40964d = c6493bPollFirst;
        return c6493bPollFirst;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.kl3
    @hib
    public leg dequeueOutputBuffer() throws ceg {
        if (this.f40962b.isEmpty()) {
            return null;
        }
        while (!this.f40963c.isEmpty() && ((C6493b) t0i.castNonNull(this.f40963c.peek())).f78610f <= this.f40965e) {
            C6493b c6493b = (C6493b) t0i.castNonNull(this.f40963c.poll());
            if (c6493b.isEndOfStream()) {
                leg legVar = (leg) t0i.castNonNull(this.f40962b.pollFirst());
                legVar.addFlag(4);
                releaseInputBuffer(c6493b);
                return legVar;
            }
            mo8675b(c6493b);
            if (mo8676e()) {
                ydg ydgVarMo8674a = mo8674a();
                leg legVar2 = (leg) t0i.castNonNull(this.f40962b.pollFirst());
                legVar2.setContent(c6493b.f78610f, ydgVarMo8674a, Long.MAX_VALUE);
                releaseInputBuffer(c6493b);
                return legVar2;
            }
            releaseInputBuffer(c6493b);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // p000.kl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void queueInputBuffer(p000.jeg r7) throws p000.ceg {
        /*
            r6 = this;
            gt1$b r0 = r6.f40964d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p000.v80.checkArgument(r0)
            gt1$b r7 = (p000.gt1.C6493b) r7
            boolean r0 = r7.isEndOfStream()
            if (r0 != 0) goto L2d
            long r0 = r7.f78610f
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.f40967g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.releaseInputBuffer(r7)
            goto L3c
        L2d:
            long r0 = r6.f40966f
            r2 = 1
            long r2 = r2 + r0
            r6.f40966f = r2
            p000.gt1.C6493b.m11859b(r7, r0)
            java.util.ArrayDeque<gt1$b> r0 = r6.f40963c
            r0.add(r7)
        L3c:
            r7 = 0
            r6.f40964d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gt1.queueInputBuffer(jeg):void");
    }
}
