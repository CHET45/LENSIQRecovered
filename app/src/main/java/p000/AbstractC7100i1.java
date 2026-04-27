package p000;

/* JADX INFO: renamed from: i1 */
/* JADX INFO: loaded from: classes7.dex */
@wg5
public abstract class AbstractC7100i1<T> implements y56<T>, kq1<T> {

    /* JADX INFO: renamed from: i1$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.AbstractFlow", m4010f = "Flow.kt", m4011i = {0}, m4012l = {nb2.f63860h}, m4013m = "collect", m4014n = {"safeCollector"}, m4015s = {"L$0"})
    public static final class a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f45412a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f45413b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC7100i1<T> f45414c;

        /* JADX INFO: renamed from: d */
        public int f45415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC7100i1<T> abstractC7100i1, zy2<? super a> zy2Var) {
            super(zy2Var);
            this.f45414c = abstractC7100i1;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f45413b = obj;
            this.f45415d |= Integer.MIN_VALUE;
            return this.f45414c.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.y56
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(@p000.yfb p000.t66<? super T> r6, @p000.yfb p000.zy2<? super p000.bth> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.AbstractC7100i1.a
            if (r0 == 0) goto L13
            r0 = r7
            i1$a r0 = (p000.AbstractC7100i1.a) r0
            int r1 = r0.f45415d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45415d = r1
            goto L18
        L13:
            i1$a r0 = new i1$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f45413b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45415d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f45412a
            jke r6 = (p000.jke) r6
            p000.y7e.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p000.y7e.throwOnFailure(r7)
            jke r7 = new jke
            e13 r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f45412a = r7     // Catch: java.lang.Throwable -> L55
            r0.f45415d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.collectSafely(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            bth r6 = p000.bth.f14751a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7100i1.collect(t66, zy2):java.lang.Object");
    }

    @gib
    public abstract Object collectSafely(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var);
}
