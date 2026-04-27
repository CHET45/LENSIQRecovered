package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,29:1\n54#2,5:30\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n27#1:30,5\n*E\n"})
public final class pki {

    /* JADX INFO: renamed from: pki$a */
    @ck3(m4009c = "kotlinx.coroutines.selects.WhileSelectKt", m4010f = "WhileSelect.kt", m4011i = {0}, m4012l = {34}, m4013m = "whileSelect", m4014n = {"builder"}, m4015s = {"L$0"})
    public static final class C10997a extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f71220a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f71221b;

        /* JADX INFO: renamed from: c */
        public int f71222c;

        public C10997a(zy2<? super C10997a> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f71221b = obj;
            this.f71222c |= Integer.MIN_VALUE;
            return pki.whileSelect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @p000.gib
    @p000.wg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object whileSelect(@p000.yfb p000.qy6<? super p000.fve<? super java.lang.Boolean>, p000.bth> r4, @p000.yfb p000.zy2<? super p000.bth> r5) {
        /*
            boolean r0 = r5 instanceof p000.pki.C10997a
            if (r0 == 0) goto L13
            r0 = r5
            pki$a r0 = (p000.pki.C10997a) r0
            int r1 = r0.f71222c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71222c = r1
            goto L18
        L13:
            pki$a r0 = new pki$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f71221b
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f71222c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f71220a
            qy6 r4 = (p000.qy6) r4
            p000.y7e.throwOnFailure(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p000.y7e.throwOnFailure(r5)
        L38:
            ove r5 = new ove
            e13 r2 = r0.getContext()
            r5.<init>(r2)
            r4.invoke(r5)
            r0.f71220a = r4
            r0.f71222c = r3
            java.lang.Object r5 = r5.doSelect(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            bth r4 = p000.bth.f14751a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pki.whileSelect(qy6, zy2):java.lang.Object");
    }

    @wg5
    private static final Object whileSelect$$forInline(qy6<? super fve<? super Boolean>, bth> qy6Var, zy2<? super bth> zy2Var) {
        o28.mark(3);
        throw null;
    }
}
