package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
public final class b2g implements jaf {

    /* JADX INFO: renamed from: b */
    public final long f12488b;

    /* JADX INFO: renamed from: c */
    public final long f12489c;

    /* JADX INFO: renamed from: b2g$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m4010f = "SharingStarted.kt", m4011i = {1, 2, 3}, m4012l = {174, 176, 178, 179, 181}, m4013m = "invokeSuspend", m4014n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, m4015s = {"L$0", "L$0", "L$0"})
    public static final class C1706a extends ugg implements kz6<t66<? super haf>, Integer, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f12490a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f12491b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ int f12492c;

        public C1706a(zy2<? super C1706a> zy2Var) {
            super(3, zy2Var);
        }

        public final Object invoke(t66<? super haf> t66Var, int i, zy2<? super bth> zy2Var) {
            C1706a c1706a = b2g.this.new C1706a(zy2Var);
            c1706a.f12491b = t66Var;
            c1706a.f12492c = i;
            return c1706a.invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r9.f12490a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f12491b
                t66 r1 = (p000.t66) r1
                p000.y7e.throwOnFailure(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f12491b
                t66 r1 = (p000.t66) r1
                p000.y7e.throwOnFailure(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f12491b
                t66 r1 = (p000.t66) r1
                p000.y7e.throwOnFailure(r10)
                goto L64
            L38:
                p000.y7e.throwOnFailure(r10)
                goto L9c
            L3c:
                p000.y7e.throwOnFailure(r10)
                java.lang.Object r10 = r9.f12491b
                r1 = r10
                t66 r1 = (p000.t66) r1
                int r10 = r9.f12492c
                if (r10 <= 0) goto L53
                haf r10 = p000.haf.f43014a
                r9.f12490a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                b2g r10 = p000.b2g.this
                long r6 = p000.b2g.access$getStopTimeout$p(r10)
                r9.f12491b = r1
                r9.f12490a = r5
                java.lang.Object r10 = p000.p34.delay(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                b2g r10 = p000.b2g.this
                long r5 = p000.b2g.access$getReplayExpiration$p(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                haf r10 = p000.haf.f43015b
                r9.f12491b = r1
                r9.f12490a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                b2g r10 = p000.b2g.this
                long r4 = p000.b2g.access$getReplayExpiration$p(r10)
                r9.f12491b = r1
                r9.f12490a = r3
                java.lang.Object r10 = p000.p34.delay(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                haf r10 = p000.haf.f43016c
                r3 = 0
                r9.f12491b = r3
                r9.f12490a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                bth r10 = p000.bth.f14751a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.b2g.C1706a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ Object invoke(t66<? super haf> t66Var, Integer num, zy2<? super bth> zy2Var) {
            return invoke(t66Var, num.intValue(), zy2Var);
        }
    }

    /* JADX INFO: renamed from: b2g$b */
    @ck3(m4009c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m4010f = "SharingStarted.kt", m4011i = {}, m4012l = {}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1707b extends ugg implements gz6<haf, zy2<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a */
        public int f12494a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f12495b;

        public C1707b(zy2<? super C1707b> zy2Var) {
            super(2, zy2Var);
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C1707b c1707b = new C1707b(zy2Var);
            c1707b.f12495b = obj;
            return c1707b;
        }

        @Override // p000.gz6
        public final Object invoke(haf hafVar, zy2<? super Boolean> zy2Var) {
            return ((C1707b) create(hafVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            pd8.getCOROUTINE_SUSPENDED();
            if (this.f12494a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y7e.throwOnFailure(obj);
            return wc1.boxBoolean(((haf) this.f12495b) != haf.f43014a);
        }
    }

    public b2g(long j, long j2) {
        this.f12488b = j;
        this.f12489c = j2;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    @Override // p000.jaf
    @yfb
    public y56<haf> command(@yfb l2g<Integer> l2gVar) {
        return c76.distinctUntilChanged(c76.dropWhile(c76.transformLatest(l2gVar, new C1706a(null)), new C1707b(null)));
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof b2g) {
            b2g b2gVar = (b2g) obj;
            if (this.f12488b == b2gVar.f12488b && this.f12489c == b2gVar.f12489c) {
                return true;
            }
        }
        return false;
    }

    @yr7
    public int hashCode() {
        return (Long.hashCode(this.f12488b) * 31) + Long.hashCode(this.f12489c);
    }

    @yfb
    public String toString() {
        List listCreateListBuilder = k82.createListBuilder(2);
        if (this.f12488b > 0) {
            listCreateListBuilder.add("stopTimeout=" + this.f12488b + "ms");
        }
        if (this.f12489c < Long.MAX_VALUE) {
            listCreateListBuilder.add("replayExpiration=" + this.f12489c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + v82.joinToString$default(k82.build(listCreateListBuilder), null, null, null, 0, null, null, 63, null) + ')';
    }
}
