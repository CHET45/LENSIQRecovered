package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dsh<T> implements t66<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f30633a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object f30634b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final gz6<T, zy2<? super bth>, Object> f30635c;

    /* JADX INFO: renamed from: dsh$a */
    @ck3(m4009c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m4010f = "ChannelFlow.kt", m4011i = {}, m4012l = {208}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C4935a extends ugg implements gz6<T, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f30636a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f30637b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<T> f30638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4935a(t66<? super T> t66Var, zy2<? super C4935a> zy2Var) {
            super(2, zy2Var);
            this.f30638c = t66Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C4935a c4935a = new C4935a(this.f30638c, zy2Var);
            c4935a.f30637b = obj;
            return c4935a;
        }

        @Override // p000.gz6
        public final Object invoke(T t, zy2<? super bth> zy2Var) {
            return ((C4935a) create(t, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zy2 to dsh$a for r3v1 'this'  zy2
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p000.tq0
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r3.f30636a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p000.y7e.throwOnFailure(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                p000.y7e.throwOnFailure(r4)
                java.lang.Object r4 = r3.f30637b
                t66<T> r1 = r3.f30638c
                r3.f30636a = r2
                java.lang.Object r4 = r1.emit(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                bth r4 = p000.bth.f14751a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dsh.C4935a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public dsh(@yfb t66<? super T> t66Var, @yfb e13 e13Var) {
        this.f30633a = e13Var;
        this.f30634b = sxg.threadContextElements(e13Var);
        this.f30635c = new C4935a(t66Var, null);
    }

    @Override // p000.t66
    @gib
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        Object objWithContextUndispatched = hu1.withContextUndispatched(this.f30633a, t, this.f30634b, this.f30635c, zy2Var);
        return objWithContextUndispatched == pd8.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched : bth.f14751a;
    }
}
