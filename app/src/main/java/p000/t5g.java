package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public final class t5g<T> implements y56<T> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f83759b = AtomicIntegerFieldUpdater.newUpdater(t5g.class, "consumed$volatile");

    /* JADX INFO: renamed from: a */
    @yfb
    public final Stream<T> f83760a;
    private volatile /* synthetic */ int consumed$volatile = 0;

    /* JADX INFO: renamed from: t5g$a */
    @ck3(m4009c = "kotlinx.coroutines.stream.StreamFlow", m4010f = "Stream.kt", m4011i = {0, 0}, m4012l = {22}, m4013m = "collect", m4014n = {"this", "collector"}, m4015s = {"L$0", "L$1"})
    public static final class C12918a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f83761a;

        /* JADX INFO: renamed from: b */
        public Object f83762b;

        /* JADX INFO: renamed from: c */
        public Object f83763c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f83764d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ t5g<T> f83765e;

        /* JADX INFO: renamed from: f */
        public int f83766f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12918a(t5g<T> t5gVar, zy2<? super C12918a> zy2Var) {
            super(zy2Var);
            this.f83765e = t5gVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f83764d = obj;
            this.f83766f |= Integer.MIN_VALUE;
            return this.f83765e.collect(null, this);
        }
    }

    public t5g(@yfb Stream<T> stream) {
        this.f83760a = stream;
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.y56
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@p000.yfb p000.t66<? super T> r7, @p000.yfb p000.zy2<? super p000.bth> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p000.t5g.C12918a
            if (r0 == 0) goto L13
            r0 = r8
            t5g$a r0 = (p000.t5g.C12918a) r0
            int r1 = r0.f83766f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83766f = r1
            goto L18
        L13:
            t5g$a r0 = new t5g$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f83764d
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f83766f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f83763c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f83762b
            t66 r2 = (p000.t66) r2
            java.lang.Object r4 = r0.f83761a
            t5g r4 = (p000.t5g) r4
            p000.y7e.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L36
            r8 = r2
            goto L58
        L36:
            r7 = move-exception
            goto L7b
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            p000.y7e.throwOnFailure(r8)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = getConsumed$volatile$FU()
            r2 = 0
            boolean r8 = r8.compareAndSet(r6, r2, r3)
            if (r8 == 0) goto L81
            java.util.stream.Stream<T> r8 = r6.f83760a     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L79
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L58:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L71
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L36
            r0.f83761a = r4     // Catch: java.lang.Throwable -> L36
            r0.f83762b = r8     // Catch: java.lang.Throwable -> L36
            r0.f83763c = r7     // Catch: java.lang.Throwable -> L36
            r0.f83766f = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r8.emit(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L58
            return r1
        L71:
            java.util.stream.Stream<T> r7 = r4.f83760a
            r7.close()
            bth r7 = p000.bth.f14751a
            return r7
        L79:
            r7 = move-exception
            r4 = r6
        L7b:
            java.util.stream.Stream<T> r8 = r4.f83760a
            r8.close()
            throw r7
        L81:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Stream.consumeAsFlow can be collected only once"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t5g.collect(t66, zy2):java.lang.Object");
    }
}
