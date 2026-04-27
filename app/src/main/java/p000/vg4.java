package p000;

import p000.jvd;

/* JADX INFO: loaded from: classes7.dex */
public final class vg4<T> implements y56<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final y56<T> f91050a;

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public final qy6<T, Object> f91051b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public final gz6<Object, Object, Boolean> f91052c;

    /* JADX INFO: renamed from: vg4$a */
    public static final class C14046a<T> implements t66 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vg4<T> f91053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<Object> f91054b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ t66<T> f91055c;

        /* JADX INFO: renamed from: vg4$a$a */
        @ck3(m4009c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m4010f = "Distinct.kt", m4011i = {}, m4012l = {73}, m4013m = "emit", m4014n = {}, m4015s = {})
        public static final class a extends cz2 {

            /* JADX INFO: renamed from: a */
            public /* synthetic */ Object f91056a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C14046a<T> f91057b;

            /* JADX INFO: renamed from: c */
            public int f91058c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C14046a<? super T> c14046a, zy2<? super a> zy2Var) {
                super(zy2Var);
                this.f91057b = c14046a;
            }

            @Override // p000.tq0
            public final Object invokeSuspend(Object obj) {
                this.f91056a = obj;
                this.f91058c |= Integer.MIN_VALUE;
                return this.f91057b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14046a(vg4<T> vg4Var, jvd.C8121h<Object> c8121h, t66<? super T> t66Var) {
            this.f91053a = vg4Var;
            this.f91054b = c8121h;
            this.f91055c = t66Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p000.t66
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, p000.zy2<? super p000.bth> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p000.vg4.C14046a.a
                if (r0 == 0) goto L13
                r0 = r7
                vg4$a$a r0 = (p000.vg4.C14046a.a) r0
                int r1 = r0.f91058c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f91058c = r1
                goto L18
            L13:
                vg4$a$a r0 = new vg4$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f91056a
                java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r2 = r0.f91058c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p000.y7e.throwOnFailure(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                p000.y7e.throwOnFailure(r7)
                vg4<T> r7 = r5.f91053a
                qy6<T, java.lang.Object> r7 = r7.f91051b
                java.lang.Object r7 = r7.invoke(r6)
                jvd$h<java.lang.Object> r2 = r5.f91054b
                T r2 = r2.f52110a
                qhg r4 = p000.zhb.f105096a
                if (r2 == r4) goto L58
                vg4<T> r4 = r5.f91053a
                gz6<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f91052c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                bth r6 = p000.bth.f14751a
                return r6
            L58:
                jvd$h<java.lang.Object> r2 = r5.f91054b
                r2.f52110a = r7
                t66<T> r7 = r5.f91055c
                r0.f91058c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                bth r6 = p000.bth.f14751a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vg4.C14046a.emit(java.lang.Object, zy2):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vg4(@yfb y56<? extends T> y56Var, @yfb qy6<? super T, ? extends Object> qy6Var, @yfb gz6<Object, Object, Boolean> gz6Var) {
        this.f91050a = y56Var;
        this.f91051b = qy6Var;
        this.f91052c = gz6Var;
    }

    @Override // p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<? super bth> zy2Var) {
        jvd.C8121h c8121h = new jvd.C8121h();
        c8121h.f52110a = (T) zhb.f105096a;
        Object objCollect = this.f91050a.collect(new C14046a(this, c8121h, t66Var), zy2Var);
        return objCollect == pd8.getCOROUTINE_SUSPENDED() ? objCollect : bth.f14751a;
    }
}
