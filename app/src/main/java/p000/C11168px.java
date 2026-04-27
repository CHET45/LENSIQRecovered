package p000;

import androidx.mediarouter.media.C1340j;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.opencv.videoio.Videoio;
import p000.zl2;

/* JADX INFO: renamed from: px */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n1223#2,6:585\n1223#2,6:591\n1223#2,6:597\n1223#2,6:603\n1223#2,6:609\n1223#2,6:615\n1223#2,6:621\n1223#2,6:627\n81#3:633\n81#3:634\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585,6\n394#1:591,6\n400#1:597,6\n401#1:603,6\n414#1:609,6\n415#1:615,6\n418#1:621,6\n573#1:627,6\n402#1:633\n403#1:634\n*E\n"})
public final class C11168px {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final mzf<Float> f72406a = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final mzf<kn4> f72407b = C11760qy.spring$default(0.0f, 0.0f, kn4.m30703boximpl(edi.getVisibilityThreshold(kn4.f54774b)), 3, null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final mzf<wpf> f72408c = C11760qy.spring$default(0.0f, 0.0f, wpf.m33057boximpl(edi.getVisibilityThreshold(wpf.f95046b)), 3, null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final mzf<izb> f72409d = C11760qy.spring$default(0.0f, 0.0f, izb.m30418boximpl(edi.getVisibilityThreshold(izb.f49009b)), 3, null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final mzf<rud> f72410e = C11760qy.spring$default(0.0f, 0.0f, edi.getVisibilityThreshold(rud.f79687e), 3, null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final mzf<Integer> f72411f = C11760qy.spring$default(0.0f, 0.0f, Integer.valueOf(edi.getVisibilityThreshold(f68.f35480a)), 3, null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final mzf<a78> f72412g = C11760qy.spring$default(0.0f, 0.0f, a78.m27192boximpl(edi.getVisibilityThreshold(a78.f545b)), 3, null);

    /* JADX INFO: renamed from: h */
    @yfb
    public static final mzf<r78> f72413h = C11760qy.spring$default(0.0f, 0.0f, r78.m32079boximpl(edi.getVisibilityThreshold(r78.f77324b)), 3, null);

    /* JADX INFO: renamed from: px$a */
    public static final class a extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ au1<T> f72414a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ T f72415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(au1<T> au1Var, T t) {
            super(0);
            this.f72414a = au1Var;
            this.f72415b = t;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f72414a.mo28705trySendJP2dKIU(this.f72415b);
        }
    }

    /* JADX INFO: renamed from: px$b */
    @ck3(m4009c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m4010f = "AnimateAsState.kt", m4011i = {0}, m4012l = {Videoio.CAP_PROP_XI_AEAG_LEVEL}, m4013m = "invokeSuspend", m4014n = {"$this$LaunchedEffect"}, m4015s = {"L$0"})
    public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f72416a;

        /* JADX INFO: renamed from: b */
        public int f72417b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f72418c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ au1<T> f72419d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C13257tw<T, V> f72420e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ i2g<InterfaceC11178py<T>> f72421f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ i2g<qy6<T, bth>> f72422m;

        /* JADX INFO: renamed from: px$b$a */
        @ck3(m4009c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m4010f = "AnimateAsState.kt", m4011i = {}, m4012l = {Videoio.CAP_PROP_XI_BINNING_VERTICAL}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f72423a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ T f72424b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C13257tw<T, V> f72425c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ i2g<InterfaceC11178py<T>> f72426d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ i2g<qy6<T, bth>> f72427e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(T t, C13257tw<T, V> c13257tw, i2g<? extends InterfaceC11178py<T>> i2gVar, i2g<? extends qy6<? super T, bth>> i2gVar2, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f72424b = t;
                this.f72425c = c13257tw;
                this.f72426d = i2gVar;
                this.f72427e = i2gVar2;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f72424b, this.f72425c, this.f72426d, this.f72427e, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f72423a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (!md8.areEqual(this.f72424b, this.f72425c.getTargetValue())) {
                        C13257tw<T, V> c13257tw = this.f72425c;
                        T t = this.f72424b;
                        InterfaceC11178py interfaceC11178pyAnimateValueAsState$lambda$6 = C11168px.animateValueAsState$lambda$6(this.f72426d);
                        this.f72423a = 1;
                        if (C13257tw.animateTo$default(c13257tw, t, interfaceC11178pyAnimateValueAsState$lambda$6, null, null, this, 12, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return bth.f14751a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
                qy6 qy6VarAnimateValueAsState$lambda$4 = C11168px.animateValueAsState$lambda$4(this.f72427e);
                if (qy6VarAnimateValueAsState$lambda$4 != null) {
                    qy6VarAnimateValueAsState$lambda$4.invoke(this.f72425c.getValue());
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(au1<T> au1Var, C13257tw<T, V> c13257tw, i2g<? extends InterfaceC11178py<T>> i2gVar, i2g<? extends qy6<? super T, bth>> i2gVar2, zy2<? super b> zy2Var) {
            super(2, zy2Var);
            this.f72419d = au1Var;
            this.f72420e = c13257tw;
            this.f72421f = i2gVar;
            this.f72422m = i2gVar2;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            b bVar = new b(this.f72419d, this.f72420e, this.f72421f, this.f72422m, zy2Var);
            bVar.f72418c = obj;
            return bVar;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        @p000.gib
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                int r1 = r13.f72417b
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r13.f72416a
                mu1 r1 = (p000.mu1) r1
                java.lang.Object r3 = r13.f72418c
                x13 r3 = (p000.x13) r3
                p000.y7e.throwOnFailure(r14)
                r4 = r14
                goto L3d
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                p000.y7e.throwOnFailure(r14)
                java.lang.Object r1 = r13.f72418c
                x13 r1 = (p000.x13) r1
                au1<T> r3 = r13.f72419d
                mu1 r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L30:
                r13.f72418c = r3
                r13.f72416a = r1
                r13.f72417b = r2
                java.lang.Object r4 = r1.hasNext(r13)
                if (r4 != r0) goto L3d
                return r0
            L3d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L6f
                java.lang.Object r4 = r1.next()
                au1<T> r5 = r13.f72419d
                java.lang.Object r5 = r5.mo28704tryReceivePtdJZtk()
                java.lang.Object r5 = p000.xu1.m33277getOrNullimpl(r5)
                if (r5 != 0) goto L57
                r7 = r4
                goto L58
            L57:
                r7 = r5
            L58:
                px$b$a r4 = new px$b$a
                tw<T, V> r8 = r13.f72420e
                i2g<py<T>> r9 = r13.f72421f
                i2g<qy6<T, bth>> r10 = r13.f72422m
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                p000.dg1.launch$default(r5, r6, r7, r8, r9, r10)
                goto L30
            L6f:
                bth r0 = p000.bth.f14751a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C11168px.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final i2g<kn4> m31873animateDpAsStateAjpBEmI(float f, @gib InterfaceC11178py<kn4> interfaceC11178py, @gib String str, @gib qy6<? super kn4, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72407b;
        }
        InterfaceC11178py<kn4> interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            qy6Var = null;
        }
        qy6<? super kn4, bth> qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i3 = i << 6;
        i2g<kn4> i2gVarAnimateValueAsState = animateValueAsState(kn4.m30703boximpl(f), g3i.getVectorConverter(kn4.f54774b), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ i2g m31874animateDpAsStateKz89ssw(float f, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72407b;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(704104481, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(kn4.m30703boximpl(f), g3i.getVectorConverter(kn4.f54774b), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | ((i << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    public static final i2g<Float> animateFloatAsState(float f, @gib InterfaceC11178py<Float> interfaceC11178py, float f2, @gib String str, @gib qy6<? super Float, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<Float> interfaceC11178py2;
        InterfaceC11178py<Float> interfaceC11178py3 = (i2 & 2) != 0 ? f72406a : interfaceC11178py;
        float f3 = (i2 & 4) != 0 ? 0.01f : f2;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        qy6<? super Float, bth> qy6Var2 = (i2 & 16) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (interfaceC11178py3 == f72406a) {
            zl2Var.startReplaceGroup(1125598679);
            boolean z = (((i & C1340j.f10444b) ^ 384) > 256 && zl2Var.changed(f3)) || (i & 384) == 256;
            Object objRememberedValue = zl2Var.rememberedValue();
            if (z || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = C11760qy.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            interfaceC11178py2 = (mzf) objRememberedValue;
            zl2Var.endReplaceGroup();
        } else {
            zl2Var.startReplaceGroup(1125708605);
            zl2Var.endReplaceGroup();
            interfaceC11178py2 = interfaceC11178py3;
        }
        int i3 = i << 3;
        i2g<Float> i2gVarAnimateValueAsState = animateValueAsState(Float.valueOf(f), g3i.getVectorConverter(d46.f28382a), interfaceC11178py2, Float.valueOf(f3), str2, qy6Var2, zl2Var, (i & 14) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    public static final i2g<Integer> animateIntAsState(int i, @gib InterfaceC11178py<Integer> interfaceC11178py, @gib String str, @gib qy6<? super Integer, bth> qy6Var, @gib zl2 zl2Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            interfaceC11178py = f72411f;
        }
        InterfaceC11178py<Integer> interfaceC11178py2 = interfaceC11178py;
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            qy6Var = null;
        }
        qy6<? super Integer, bth> qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(428074472, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i4 = i2 << 6;
        i2g<Integer> i2gVarAnimateValueAsState = animateValueAsState(Integer.valueOf(i), g3i.getVectorConverter(f68.f35480a), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i2 & 14) | ((i2 << 3) & C1340j.f10444b) | (57344 & i4) | (i4 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ i2g m31875animateIntOffsetAsState8f6pmRE(long j, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72412g;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1010307371, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(a78.m27192boximpl(j), g3i.getVectorConverter(a78.f545b), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | ((i << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final i2g<a78> m31876animateIntOffsetAsStateHyPO7BM(long j, @gib InterfaceC11178py<a78> interfaceC11178py, @gib String str, @gib qy6<? super a78, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<a78> interfaceC11178py2 = (i2 & 2) != 0 ? f72412g : interfaceC11178py;
        String str2 = (i2 & 4) != 0 ? "IntOffsetAnimation" : str;
        qy6<? super a78, bth> qy6Var2 = (i2 & 8) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-696782904, i, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i3 = i << 6;
        i2g<a78> i2gVarAnimateValueAsState = animateValueAsState(a78.m27192boximpl(j), g3i.getVectorConverter(a78.f545b), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final i2g<r78> m31877animateIntSizeAsState4goxYXU(long j, @gib InterfaceC11178py<r78> interfaceC11178py, @gib String str, @gib qy6<? super r78, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<r78> interfaceC11178py2 = (i2 & 2) != 0 ? f72413h : interfaceC11178py;
        String str2 = (i2 & 4) != 0 ? "IntSizeAnimation" : str;
        qy6<? super r78, bth> qy6Var2 = (i2 & 8) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(582576328, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        int i3 = i << 6;
        i2g<r78> i2gVarAnimateValueAsState = animateValueAsState(r78.m32079boximpl(j), g3i.getVectorConverter(r78.f77324b), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ i2g m31878animateIntSizeAsStatezTRF_AQ(long j, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72413h;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1749239765, i, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(r78.m32079boximpl(j), g3i.getVectorConverter(r78.f77324b), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | ((i << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final i2g<izb> m31879animateOffsetAsState7362WCg(long j, @gib InterfaceC11178py<izb> interfaceC11178py, @gib String str, @gib qy6<? super izb, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<izb> interfaceC11178py2 = (i2 & 2) != 0 ? f72409d : interfaceC11178py;
        String str2 = (i2 & 4) != 0 ? "OffsetAnimation" : str;
        qy6<? super izb, bth> qy6Var2 = (i2 & 8) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(357896800, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        int i3 = i << 6;
        i2g<izb> i2gVarAnimateValueAsState = animateValueAsState(izb.m30418boximpl(j), g3i.getVectorConverter(izb.f49009b), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ i2g m31880animateOffsetAsStateN6fFfp4(long j, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72409d;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-456513133, i, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(izb.m30418boximpl(j), g3i.getVectorConverter(izb.f49009b), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | ((i << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    public static final i2g<rud> animateRectAsState(@yfb rud rudVar, @gib InterfaceC11178py<rud> interfaceC11178py, @gib String str, @gib qy6<? super rud, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72410e;
        }
        InterfaceC11178py<rud> interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            qy6Var = null;
        }
        qy6<? super rud, bth> qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(536062978, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        int i3 = i << 6;
        i2g<rud> i2gVarAnimateValueAsState = animateValueAsState(rudVar, g3i.getVectorConverter(rud.f79687e), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ i2g m31881animateSizeAsStateLjSzlW0(long j, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72408c;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(875212471, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(wpf.m33057boximpl(j), g3i.getVectorConverter(wpf.f95046b), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | ((i << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final i2g<wpf> m31882animateSizeAsStateYLp_XPw(long j, @gib InterfaceC11178py<wpf> interfaceC11178py, @gib String str, @gib qy6<? super wpf, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<wpf> interfaceC11178py2 = (i2 & 2) != 0 ? f72408c : interfaceC11178py;
        String str2 = (i2 & 4) != 0 ? "SizeAnimation" : str;
        qy6<? super wpf, bth> qy6Var2 = (i2 & 8) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1374633148, i, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        int i3 = i << 6;
        i2g<wpf> i2gVarAnimateValueAsState = animateValueAsState(wpf.m33057boximpl(j), g3i.getVectorConverter(wpf.f95046b), interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @yfb
    @hk2
    public static final <T, V extends AbstractC16313zy> i2g<T> animateValueAsState(T t, @yfb alh<T, V> alhVar, @gib InterfaceC11178py<T> interfaceC11178py, @gib T t2, @gib String str, @gib qy6<? super T, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<T> interfaceC11178pySpring;
        if ((i2 & 4) != 0) {
            Object objRememberedValue = zl2Var.rememberedValue();
            if (objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            interfaceC11178pySpring = (mzf) objRememberedValue;
        } else {
            interfaceC11178pySpring = interfaceC11178py;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        qy6<? super T, bth> qy6Var2 = (i2 & 32) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object objRememberedValue2 = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = xtf.mutableStateOf$default(null, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        z6b z6bVar = (z6b) objRememberedValue2;
        Object objRememberedValue3 = zl2Var.rememberedValue();
        if (objRememberedValue3 == c16170a.getEmpty()) {
            objRememberedValue3 = new C13257tw(t, alhVar, t3, str2);
            zl2Var.updateRememberedValue(objRememberedValue3);
        }
        C13257tw c13257tw = (C13257tw) objRememberedValue3;
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var2, zl2Var, (i >> 15) & 14);
        if (t3 != null && (interfaceC11178pySpring instanceof mzf)) {
            mzf mzfVar = (mzf) interfaceC11178pySpring;
            if (!md8.areEqual(mzfVar.getVisibilityThreshold(), t3)) {
                interfaceC11178pySpring = C11760qy.spring(mzfVar.getDampingRatio(), mzfVar.getStiffness(), t3);
            }
        }
        i2g i2gVarRememberUpdatedState2 = stf.rememberUpdatedState(interfaceC11178pySpring, zl2Var, 0);
        Object objRememberedValue4 = zl2Var.rememberedValue();
        if (objRememberedValue4 == c16170a.getEmpty()) {
            objRememberedValue4 = nu1.Channel$default(-1, null, null, 6, null);
            zl2Var.updateRememberedValue(objRememberedValue4);
        }
        au1 au1Var = (au1) objRememberedValue4;
        boolean zChangedInstance = ((((i & 14) ^ 6) > 4 && zl2Var.changedInstance(t)) || (i & 6) == 4) | zl2Var.changedInstance(au1Var);
        Object objRememberedValue5 = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == c16170a.getEmpty()) {
            objRememberedValue5 = new a(au1Var, t);
            zl2Var.updateRememberedValue(objRememberedValue5);
        }
        jx4.SideEffect((ny6) objRememberedValue5, zl2Var, 0);
        boolean zChangedInstance2 = zl2Var.changedInstance(au1Var) | zl2Var.changedInstance(c13257tw) | zl2Var.changed(i2gVarRememberUpdatedState2) | zl2Var.changed(i2gVarRememberUpdatedState);
        Object objRememberedValue6 = zl2Var.rememberedValue();
        if (zChangedInstance2 || objRememberedValue6 == c16170a.getEmpty()) {
            objRememberedValue6 = new b(au1Var, c13257tw, i2gVarRememberUpdatedState2, i2gVarRememberUpdatedState, null);
            zl2Var.updateRememberedValue(objRememberedValue6);
        }
        jx4.LaunchedEffect(au1Var, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue6, zl2Var, 0);
        i2g<T> i2gVarAsState = (i2g) z6bVar.getValue();
        if (i2gVarAsState == null) {
            i2gVarAsState = c13257tw.asState();
        }
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> qy6<T, bth> animateValueAsState$lambda$4(i2g<? extends qy6<? super T, bth>> i2gVar) {
        return i2gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> InterfaceC11178py<T> animateValueAsState$lambda$6(i2g<? extends InterfaceC11178py<T>> i2gVar) {
        return i2gVar.getValue();
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ i2g animateRectAsState(rud rudVar, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72410e;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-782613967, i, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(rudVar, g3i.getVectorConverter(rud.f79687e), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | ((i << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ i2g animateIntAsState(int i, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            interfaceC11178py = f72411f;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i3 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-842612981, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        i2g i2gVarAnimateValueAsState = animateValueAsState(Integer.valueOf(i), g3i.getVectorConverter(f68.f35480a), interfaceC11178py2, null, null, qy6Var2, zl2Var, (i2 & 14) | ((i2 << 3) & C1340j.f10444b) | ((i2 << 9) & 458752), 24);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ i2g animateFloatAsState(float f, InterfaceC11178py interfaceC11178py, float f2, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f72406a;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        float f3 = f2;
        if ((i2 & 8) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1091643291, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        i2g<Float> i2gVarAnimateFloatAsState = animateFloatAsState(f, interfaceC11178py2, f3, null, qy6Var2, zl2Var, (i & 1022) | ((i << 3) & 57344), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateFloatAsState;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ i2g animateValueAsState(Object obj, alh alhVar, InterfaceC11178py interfaceC11178py, Object obj2, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        InterfaceC11178py interfaceC11178py2;
        if ((i2 & 4) != 0) {
            Object objRememberedValue = zl2Var.rememberedValue();
            if (objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
                zl2Var.updateRememberedValue(objRememberedValue);
            }
            interfaceC11178py2 = (mzf) objRememberedValue;
        } else {
            interfaceC11178py2 = interfaceC11178py;
        }
        Object obj3 = (i2 & 8) != 0 ? null : obj2;
        qy6 qy6Var2 = (i2 & 16) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-846382129, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        int i3 = i & 8;
        i2g i2gVarAnimateValueAsState = animateValueAsState(obj, alhVar, interfaceC11178py2, obj3, "ValueAnimation", qy6Var2, zl2Var, (i3 << 9) | i3 | CpioConstants.C_ISBLK | (i & 14) | (i & 112) | (i & C1340j.f10444b) | (i & 7168) | ((i << 3) & 458752), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }
}
