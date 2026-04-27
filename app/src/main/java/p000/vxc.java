package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,256:1\n1#2:257\n77#3:258\n1223#4,6:259\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n*L\n164#1:258\n169#1:259,6\n*E\n"})
public final class vxc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final zhd<vt1> f92561a = pn2.staticCompositionLocalOf(C14291b.f92565a);

    /* JADX INFO: renamed from: vxc$a */
    public static final class C14290a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sxc f92562a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gz6<zl2, Integer, bth> f92563b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f92564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14290a(sxc sxcVar, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f92562a = sxcVar;
            this.f92563b = gz6Var;
            this.f92564c = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            vxc.InterceptPlatformTextInput(this.f92562a, this.f92563b, zl2Var, tsd.updateChangedFlags(this.f92564c | 1));
        }
    }

    /* JADX INFO: renamed from: vxc$b */
    public static final class C14291b extends tt8 implements ny6<vt1> {

        /* JADX INFO: renamed from: a */
        public static final C14291b f92565a = new C14291b();

        public C14291b() {
            super(0);
        }

        @Override // p000.ny6
        @gib
        public final vt1 invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: vxc$c */
    @ck3(m4009c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {143}, m4013m = "establishTextInputSession", m4014n = {}, m4015s = {})
    public static final class C14292c extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f92566a;

        /* JADX INFO: renamed from: b */
        public int f92567b;

        public C14292c(zy2<? super C14292c> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f92566a = obj;
            this.f92567b |= Integer.MIN_VALUE;
            return vxc.establishTextInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vxc$d */
    @ck3(m4009c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", m4010f = "PlatformTextInputModifierNode.kt", m4011i = {}, m4012l = {nb2.f63870r, nb2.f63872t}, m4013m = "interceptedTextInputSession", m4014n = {}, m4015s = {})
    public static final class C14293d extends cz2 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f92568a;

        /* JADX INFO: renamed from: b */
        public int f92569b;

        public C14293d(zy2<? super C14293d> zy2Var) {
            super(zy2Var);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f92568a = obj;
            this.f92569b |= Integer.MIN_VALUE;
            return vxc.interceptedTextInputSession(null, null, null, this);
        }
    }

    @ug5
    @hk2
    @ik2(scheme = "[0[0]]")
    public static final void InterceptPlatformTextInput(@yfb sxc sxcVar, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(1315007550);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? zl2VarStartRestartGroup.changed(sxcVar) : zl2VarStartRestartGroup.changedInstance(sxcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(1315007550, i2, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:162)");
            }
            zhd<vt1> zhdVar = f92561a;
            vt1 vt1Var = (vt1) zl2VarStartRestartGroup.consume(zhdVar);
            boolean zChanged = zl2VarStartRestartGroup.changed(vt1Var);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new vt1(sxcVar, vt1Var);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            vt1 vt1Var2 = (vt1) objRememberedValue;
            vt1Var2.updateInterceptor(sxcVar);
            pn2.CompositionLocalProvider(zhdVar.provides(vt1Var2), gz6Var, zl2VarStartRestartGroup, (i2 & 112) | did.f29712i);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C14290a(sxcVar, gz6Var, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @p000.gib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object establishTextInputSession(@p000.yfb p000.uxc r4, @p000.yfb p000.gz6<? super p000.yxc, ? super p000.zy2<?>, ? extends java.lang.Object> r5, @p000.yfb p000.zy2<?> r6) {
        /*
            boolean r0 = r6 instanceof p000.vxc.C14292c
            if (r0 == 0) goto L13
            r0 = r6
            vxc$c r0 = (p000.vxc.C14292c) r0
            int r1 = r0.f92567b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92567b = r1
            goto L18
        L13:
            vxc$c r0 = new vxc$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f92566a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f92567b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            p000.y7e.throwOnFailure(r6)
            goto L5b
        L31:
            p000.y7e.throwOnFailure(r6)
            androidx.compose.ui.e$d r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L61
            z9c r6 = p000.w34.requireOwner(r4)
            lw8 r4 = p000.w34.requireLayoutNode(r4)
            qn2 r4 = r4.getCompositionLocalMap()
            zhd<vt1> r2 = p000.vxc.f92561a
            java.lang.Object r4 = r4.get(r2)
            vt1 r4 = (p000.vt1) r4
            r0.f92567b = r3
            java.lang.Object r4 = interceptedTextInputSession(r6, r4, r5, r0)
            if (r4 != r1) goto L5b
            return r1
        L5b:
            us8 r4 = new us8
            r4.<init>()
            throw r4
        L61:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vxc.establishTextInputSession(uxc, gz6, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object interceptedTextInputSession(p000.z9c r5, p000.vt1 r6, p000.gz6<? super p000.yxc, ? super p000.zy2<?>, ? extends java.lang.Object> r7, p000.zy2<?> r8) {
        /*
            boolean r0 = r8 instanceof p000.vxc.C14293d
            if (r0 == 0) goto L13
            r0 = r8
            vxc$d r0 = (p000.vxc.C14293d) r0
            int r1 = r0.f92569b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92569b = r1
            goto L18
        L13:
            vxc$d r0 = new vxc$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f92568a
            java.lang.Object r1 = p000.pd8.getCOROUTINE_SUSPENDED()
            int r2 = r0.f92569b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            p000.y7e.throwOnFailure(r8)
            goto L55
        L34:
            p000.y7e.throwOnFailure(r8)
            goto L46
        L38:
            p000.y7e.throwOnFailure(r8)
            if (r6 != 0) goto L4c
            r0.f92569b = r4
            java.lang.Object r5 = r5.textInputSession(r7, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            us8 r5 = new us8
            r5.<init>()
            throw r5
        L4c:
            r0.f92569b = r3
            java.lang.Object r5 = r6.textInputSession(r5, r7, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            us8 r5 = new us8
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vxc.interceptedTextInputSession(z9c, vt1, gz6, zy2):java.lang.Object");
    }
}
