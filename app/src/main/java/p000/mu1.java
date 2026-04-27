package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public interface mu1<E> {

    /* JADX INFO: renamed from: mu1$a */
    public static final class C9524a {

        /* JADX INFO: renamed from: mu1$a$a */
        @ck3(m4009c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m4010f = "Channel.kt", m4011i = {0}, m4012l = {ymh.InterfaceC15726e.f102210r}, m4013m = jk5.f50996b, m4014n = {"$this"}, m4015s = {"L$0"})
        public static final class a<E> extends cz2 {

            /* JADX INFO: renamed from: a */
            public Object f62138a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f62139b;

            /* JADX INFO: renamed from: c */
            public int f62140c;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                this.f62139b = obj;
                this.f62140c |= Integer.MIN_VALUE;
                return C9524a.next(null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @p000.xn8(name = p000.jk5.f50996b)
        @p000.q64(level = p000.u64.f86867c, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ java.lang.Object next(p000.mu1 r4, p000.zy2 r5) {
            /*
                boolean r0 = r5 instanceof p000.mu1.C9524a.a
                if (r0 == 0) goto L13
                r0 = r5
                mu1$a$a r0 = (p000.mu1.C9524a.a) r0
                int r1 = r0.f62140c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f62140c = r1
                goto L18
            L13:
                mu1$a$a r0 = new mu1$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.f62139b
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f62140c
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f62138a
                mu1 r4 = (p000.mu1) r4
                p000.y7e.throwOnFailure(r5)
                goto L43
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                p000.y7e.throwOnFailure(r5)
                r0.f62138a = r4
                r0.f62140c = r3
                java.lang.Object r5 = r4.hasNext(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L50
                java.lang.Object r4 = r4.next()
                return r4
            L50:
                b62 r4 = new b62
                java.lang.String r5 = "Channel was closed"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mu1.C9524a.next(mu1, zy2):java.lang.Object");
        }
    }

    @gib
    Object hasNext(@yfb zy2<? super Boolean> zy2Var);

    E next();

    @xn8(name = jk5.f50996b)
    @q64(level = u64.f86867c, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ Object next(zy2 zy2Var);
}
