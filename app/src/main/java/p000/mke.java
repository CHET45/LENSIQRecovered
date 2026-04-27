package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public final class mke {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: mke$a */
    public static final class C9387a<T> implements y56<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<t66<? super T>, zy2<? super bth>, Object> f61261a;

        /* JADX INFO: renamed from: mke$a$a */
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f61262a;

            /* JADX INFO: renamed from: c */
            public int f61264c;

            public a(zy2<? super a> zy2Var) {
                super(zy2Var);
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f61262a = obj;
                this.f61264c |= Integer.MIN_VALUE;
                return C9387a.this.collect(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C9387a(gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
            this.f61261a = gz6Var;
        }

        @Override // p000.y56
        public Object collect(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            Object objInvoke = this.f61261a.invoke(t66Var, zy2Var);
            return objInvoke == pd8.getCOROUTINE_SUSPENDED() ? objInvoke : bth.f14751a;
        }

        public Object collect$$forInline(t66<? super T> t66Var, zy2<? super bth> zy2Var) {
            o28.mark(4);
            new a(zy2Var);
            o28.mark(5);
            this.f61261a.invoke(t66Var, zy2Var);
            return bth.f14751a;
        }
    }

    @xn8(name = "checkContext")
    public static final void checkContext(@yfb final jke<?> jkeVar, @yfb e13 e13Var) {
        if (((Number) e13Var.fold(0, new gz6() { // from class: lke
            @Override // p000.gz6
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(mke.checkContext$lambda$0(jkeVar, ((Integer) obj).intValue(), (e13.InterfaceC5040b) obj2));
            }
        })).intValue() == jkeVar.f51035c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + jkeVar.f51034b + ",\n\t\tbut emission happened in " + e13Var + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int checkContext$lambda$0(jke jkeVar, int i, e13.InterfaceC5040b interfaceC5040b) {
        e13.InterfaceC5041c<?> key = interfaceC5040b.getKey();
        e13.InterfaceC5040b interfaceC5040b2 = jkeVar.f51034b.get(key);
        if (key != jj8.f50715A) {
            if (interfaceC5040b != interfaceC5040b2) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        jj8 jj8Var = (jj8) interfaceC5040b2;
        md8.checkNotNull(interfaceC5040b, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        jj8 jj8VarTransitiveCoroutineParent = transitiveCoroutineParent((jj8) interfaceC5040b, jj8Var);
        if (jj8VarTransitiveCoroutineParent == jj8Var) {
            return jj8Var == null ? i : i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + jj8VarTransitiveCoroutineParent + ", expected child of " + jj8Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @gib
    public static final jj8 transitiveCoroutineParent(@gib jj8 jj8Var, @gib jj8 jj8Var2) {
        while (jj8Var != null) {
            if (jj8Var == jj8Var2 || !(jj8Var instanceof uqe)) {
                return jj8Var;
            }
            jj8Var = ((uqe) jj8Var).getParent();
        }
        return null;
    }

    @yfb
    @yjd
    public static final <T> y56<T> unsafeFlow(@yfb @cg1 gz6<? super t66<? super T>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        return new C9387a(gz6Var);
    }
}
