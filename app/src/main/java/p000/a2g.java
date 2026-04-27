package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
public final class a2g implements jaf {
    @Override // p000.jaf
    @yfb
    public y56<haf> command(@yfb l2g<Integer> l2gVar) {
        return c76.flow(new C0022a(l2gVar, null));
    }

    @yfb
    public String toString() {
        return "SharingStarted.Lazily";
    }

    /* JADX INFO: renamed from: a2g$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.StartedLazily$command$1", m4010f = "SharingStarted.kt", m4011i = {}, m4012l = {151}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C0022a extends ugg implements gz6<t66<? super haf>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f217a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f218b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ l2g<Integer> f219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0022a(l2g<Integer> l2gVar, zy2<? super C0022a> zy2Var) {
            super(2, zy2Var);
            this.f219c = l2gVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C0022a c0022a = new C0022a(this.f219c, zy2Var);
            c0022a.f218b = obj;
            return c0022a;
        }

        @Override // p000.gz6
        public final Object invoke(t66<? super haf> t66Var, zy2<? super bth> zy2Var) {
            return ((C0022a) create(t66Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f217a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                t66 t66Var = (t66) this.f218b;
                jvd.C8114a c8114a = new jvd.C8114a();
                l2g<Integer> l2gVar = this.f219c;
                a aVar = new a(c8114a, t66Var);
                this.f217a = 1;
                if (l2gVar.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            throw new us8();
        }

        /* JADX INFO: renamed from: a2g$a$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ jvd.C8114a f220a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ t66<haf> f221b;

            /* JADX INFO: renamed from: a2g$a$a$a, reason: collision with other inner class name */
            @ck3(m4009c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m4010f = "SharingStarted.kt", m4011i = {}, m4012l = {154}, m4013m = "emit", m4014n = {}, m4015s = {})
            public static final class C16335a extends cz2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f222a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ a<T> f223b;

                /* JADX INFO: renamed from: c */
                public int f224c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16335a(a<? super T> aVar, zy2<? super C16335a> zy2Var) {
                    super(zy2Var);
                    this.f223b = aVar;
                }

                @Override // p000.tq0
                public final Object invokeSuspend(Object obj) {
                    this.f222a = obj;
                    this.f224c |= Integer.MIN_VALUE;
                    return this.f223b.emit(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(jvd.C8114a c8114a, t66<? super haf> t66Var) {
                this.f220a = c8114a;
                this.f221b = t66Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(int r5, p000.zy2<? super p000.bth> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p000.a2g.C0022a.a.C16335a
                    if (r0 == 0) goto L13
                    r0 = r6
                    a2g$a$a$a r0 = (p000.a2g.C0022a.a.C16335a) r0
                    int r1 = r0.f224c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f224c = r1
                    goto L18
                L13:
                    a2g$a$a$a r0 = new a2g$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f222a
                    java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f224c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p000.y7e.throwOnFailure(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p000.y7e.throwOnFailure(r6)
                    if (r5 <= 0) goto L4e
                    jvd$a r5 = r4.f220a
                    boolean r6 = r5.f52103a
                    if (r6 != 0) goto L4e
                    r5.f52103a = r3
                    t66<haf> r5 = r4.f221b
                    haf r6 = p000.haf.f43014a
                    r0.f224c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    bth r5 = p000.bth.f14751a
                    return r5
                L4e:
                    bth r5 = p000.bth.f14751a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.a2g.C0022a.a.emit(int, zy2):java.lang.Object");
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit(((Number) obj).intValue(), (zy2<? super bth>) zy2Var);
            }
        }
    }
}
