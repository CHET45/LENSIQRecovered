package p000;

import androidx.compose.p002ui.C0696c;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.rad;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
public final class lsg {

    /* JADX INFO: renamed from: lsg$a */
    @dwf({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,85:1\n488#2:86\n487#2,4:87\n491#2,2:94\n495#2:100\n1223#3,3:91\n1226#3,3:97\n1223#3,6:101\n1223#3,6:107\n1223#3,6:113\n487#4:96\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n41#1:86\n41#1:87,4\n41#1:94,2\n41#1:100\n41#1:91,3\n41#1:97,3\n42#1:101,6\n44#1:107,6\n53#1:113,6\n41#1:96\n*E\n"})
    public static final class C8957a extends tt8 implements kz6<InterfaceC0701e, zl2, Integer, InterfaceC0701e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<izb, bth> f58623a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l5b f58624b;

        /* JADX INFO: renamed from: lsg$a$a */
        @dwf({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,85:1\n64#2,5:86\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n45#1:86,5\n*E\n"})
        public static final class a extends tt8 implements qy6<wf4, vf4> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ z6b<rad.C11972b> f58625a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ l5b f58626b;

            /* JADX INFO: renamed from: lsg$a$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n1#1,497:1\n46#2,6:498\n*E\n"})
            public static final class C16474a implements vf4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ z6b f58627a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ l5b f58628b;

                public C16474a(z6b z6bVar, l5b l5bVar) {
                    this.f58627a = z6bVar;
                    this.f58628b = l5bVar;
                }

                @Override // p000.vf4
                public void dispose() {
                    rad.C11972b c11972b = (rad.C11972b) this.f58627a.getValue();
                    if (c11972b != null) {
                        rad.C11971a c11971a = new rad.C11971a(c11972b);
                        l5b l5bVar = this.f58628b;
                        if (l5bVar != null) {
                            l5bVar.tryEmit(c11971a);
                        }
                        this.f58627a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z6b<rad.C11972b> z6bVar, l5b l5bVar) {
                super(1);
                this.f58625a = z6bVar;
                this.f58626b = l5bVar;
            }

            @Override // p000.qy6
            @yfb
            public final vf4 invoke(@yfb wf4 wf4Var) {
                return new C16474a(this.f58625a, this.f58626b);
            }
        }

        /* JADX INFO: renamed from: lsg$a$b */
        @ck3(m4009c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", m4010f = "TextFieldPressGestureFilter.kt", m4011i = {}, m4012l = {54}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class b extends ugg implements gz6<s2d, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f58629a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f58630b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ x13 f58631c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ z6b<rad.C11972b> f58632d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ l5b f58633e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ i2g<qy6<izb, bth>> f58634f;

            /* JADX INFO: renamed from: lsg$a$b$a */
            @ck3(m4009c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", m4010f = "TextFieldPressGestureFilter.kt", m4011i = {}, m4012l = {67}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class a extends ugg implements kz6<pad, izb, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f58635a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f58636b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ long f58637c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ x13 f58638d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ z6b<rad.C11972b> f58639e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ l5b f58640f;

                /* JADX INFO: renamed from: lsg$a$b$a$a, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", m4010f = "TextFieldPressGestureFilter.kt", m4011i = {1}, m4012l = {60, 64}, m4013m = "invokeSuspend", m4014n = {"interaction"}, m4015s = {"L$0"})
                public static final class C16475a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public Object f58641a;

                    /* JADX INFO: renamed from: b */
                    public int f58642b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ z6b<rad.C11972b> f58643c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ long f58644d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ l5b f58645e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16475a(z6b<rad.C11972b> z6bVar, long j, l5b l5bVar, zy2<? super C16475a> zy2Var) {
                        super(2, zy2Var);
                        this.f58643c = z6bVar;
                        this.f58644d = j;
                        this.f58645e = l5bVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        return new C16475a(this.f58643c, this.f58644d, this.f58645e, zy2Var);
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                        return ((C16475a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                    @Override // p000.tq0
                    @p000.gib
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@p000.yfb java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = p000.pd8.getCOROUTINE_SUSPENDED()
                            int r1 = r7.f58642b
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f58641a
                            rad$b r0 = (p000.rad.C11972b) r0
                            p000.y7e.throwOnFailure(r8)
                            goto L66
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f58641a
                            z6b r1 = (p000.z6b) r1
                            p000.y7e.throwOnFailure(r8)
                            goto L4b
                        L27:
                            p000.y7e.throwOnFailure(r8)
                            z6b<rad$b> r8 = r7.f58643c
                            java.lang.Object r8 = r8.getValue()
                            rad$b r8 = (p000.rad.C11972b) r8
                            if (r8 == 0) goto L4f
                            l5b r1 = r7.f58645e
                            z6b<rad$b> r5 = r7.f58643c
                            rad$a r6 = new rad$a
                            r6.<init>(r8)
                            if (r1 == 0) goto L4c
                            r7.f58641a = r5
                            r7.f58642b = r4
                            java.lang.Object r8 = r1.emit(r6, r7)
                            if (r8 != r0) goto L4a
                            return r0
                        L4a:
                            r1 = r5
                        L4b:
                            r5 = r1
                        L4c:
                            r5.setValue(r2)
                        L4f:
                            rad$b r8 = new rad$b
                            long r4 = r7.f58644d
                            r8.<init>(r4, r2)
                            l5b r1 = r7.f58645e
                            if (r1 == 0) goto L67
                            r7.f58641a = r8
                            r7.f58642b = r3
                            java.lang.Object r1 = r1.emit(r8, r7)
                            if (r1 != r0) goto L65
                            return r0
                        L65:
                            r0 = r8
                        L66:
                            r8 = r0
                        L67:
                            z6b<rad$b> r0 = r7.f58643c
                            r0.setValue(r8)
                            bth r8 = p000.bth.f14751a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p000.lsg.C8957a.b.a.C16475a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: lsg$a$b$a$b, reason: collision with other inner class name */
                @ck3(m4009c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", m4010f = "TextFieldPressGestureFilter.kt", m4011i = {}, m4012l = {76}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
                public static final class C16476b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                    /* JADX INFO: renamed from: a */
                    public Object f58646a;

                    /* JADX INFO: renamed from: b */
                    public int f58647b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ z6b<rad.C11972b> f58648c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ boolean f58649d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ l5b f58650e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C16476b(z6b<rad.C11972b> z6bVar, boolean z, l5b l5bVar, zy2<? super C16476b> zy2Var) {
                        super(2, zy2Var);
                        this.f58648c = z6bVar;
                        this.f58649d = z;
                        this.f58650e = l5bVar;
                    }

                    @Override // p000.tq0
                    @yfb
                    public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                        return new C16476b(this.f58648c, this.f58649d, this.f58650e, zy2Var);
                    }

                    @Override // p000.gz6
                    @gib
                    public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                        return ((C16476b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                    }

                    @Override // p000.tq0
                    @gib
                    public final Object invokeSuspend(@yfb Object obj) {
                        z6b<rad.C11972b> z6bVar;
                        z6b<rad.C11972b> z6bVar2;
                        Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                        int i = this.f58647b;
                        if (i == 0) {
                            y7e.throwOnFailure(obj);
                            rad.C11972b value = this.f58648c.getValue();
                            if (value != null) {
                                boolean z = this.f58649d;
                                l5b l5bVar = this.f58650e;
                                z6bVar = this.f58648c;
                                p98 c11973c = z ? new rad.C11973c(value) : new rad.C11971a(value);
                                if (l5bVar != null) {
                                    this.f58646a = z6bVar;
                                    this.f58647b = 1;
                                    if (l5bVar.emit(c11973c, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    z6bVar2 = z6bVar;
                                }
                                z6bVar.setValue(null);
                            }
                            return bth.f14751a;
                        }
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z6bVar2 = (z6b) this.f58646a;
                        y7e.throwOnFailure(obj);
                        z6bVar = z6bVar2;
                        z6bVar.setValue(null);
                        return bth.f14751a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(x13 x13Var, z6b<rad.C11972b> z6bVar, l5b l5bVar, zy2<? super a> zy2Var) {
                    super(3, zy2Var);
                    this.f58638d = x13Var;
                    this.f58639e = z6bVar;
                    this.f58640f = l5bVar;
                }

                @Override // p000.kz6
                public /* bridge */ /* synthetic */ Object invoke(pad padVar, izb izbVar, zy2<? super bth> zy2Var) {
                    return m30888invoked4ec7I(padVar, izbVar.m30439unboximpl(), zy2Var);
                }

                @gib
                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final Object m30888invoked4ec7I(@yfb pad padVar, long j, @gib zy2<? super bth> zy2Var) {
                    a aVar = new a(this.f58638d, this.f58639e, this.f58640f, zy2Var);
                    aVar.f58636b = padVar;
                    aVar.f58637c = j;
                    return aVar.invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f58635a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        pad padVar = (pad) this.f58636b;
                        fg1.launch$default(this.f58638d, null, null, new C16475a(this.f58639e, this.f58637c, this.f58640f, null), 3, null);
                        this.f58635a = 1;
                        obj = padVar.tryAwaitRelease(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y7e.throwOnFailure(obj);
                    }
                    fg1.launch$default(this.f58638d, null, null, new C16476b(this.f58639e, ((Boolean) obj).booleanValue(), this.f58640f, null), 3, null);
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: lsg$a$b$b, reason: collision with other inner class name */
            public static final class C16477b extends tt8 implements qy6<izb, bth> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ i2g<qy6<izb, bth>> f58651a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C16477b(i2g<? extends qy6<? super izb, bth>> i2gVar) {
                    super(1);
                    this.f58651a = i2gVar;
                }

                @Override // p000.qy6
                public /* bridge */ /* synthetic */ bth invoke(izb izbVar) {
                    m30889invokek4lQ0M(izbVar.m30439unboximpl());
                    return bth.f14751a;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m30889invokek4lQ0M(long j) {
                    this.f58651a.getValue().invoke(izb.m30418boximpl(j));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(x13 x13Var, z6b<rad.C11972b> z6bVar, l5b l5bVar, i2g<? extends qy6<? super izb, bth>> i2gVar, zy2<? super b> zy2Var) {
                super(2, zy2Var);
                this.f58631c = x13Var;
                this.f58632d = z6bVar;
                this.f58633e = l5bVar;
                this.f58634f = i2gVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                b bVar = new b(this.f58631c, this.f58632d, this.f58633e, this.f58634f, zy2Var);
                bVar.f58630b = obj;
                return bVar;
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb s2d s2dVar, @gib zy2<? super bth> zy2Var) {
                return ((b) create(s2dVar, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f58629a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    s2d s2dVar = (s2d) this.f58630b;
                    a aVar = new a(this.f58631c, this.f58632d, this.f58633e, null);
                    C16477b c16477b = new C16477b(this.f58634f);
                    this.f58629a = 1;
                    if (dmg.detectTapAndPress(s2dVar, aVar, c16477b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8957a(qy6<? super izb, bth> qy6Var, l5b l5bVar) {
            super(3);
            this.f58623a = qy6Var;
            this.f58624b = l5bVar;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ InterfaceC0701e invoke(InterfaceC0701e interfaceC0701e, zl2 zl2Var, Integer num) {
            return invoke(interfaceC0701e, zl2Var, num.intValue());
        }

        @yfb
        @hk2
        public final InterfaceC0701e invoke(@yfb InterfaceC0701e interfaceC0701e, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-102778667);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objRememberedValue = zl2Var.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                Object xn2Var = new xn2(jx4.createCompositionCoroutineScope(a05.f2a, zl2Var));
                zl2Var.updateRememberedValue(xn2Var);
                objRememberedValue = xn2Var;
            }
            x13 coroutineScope = ((xn2) objRememberedValue).getCoroutineScope();
            Object objRememberedValue2 = zl2Var.rememberedValue();
            if (objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = xtf.mutableStateOf$default(null, null, 2, null);
                zl2Var.updateRememberedValue(objRememberedValue2);
            }
            z6b z6bVar = (z6b) objRememberedValue2;
            i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(this.f58623a, zl2Var, 0);
            l5b l5bVar = this.f58624b;
            boolean zChanged = zl2Var.changed(this.f58624b);
            l5b l5bVar2 = this.f58624b;
            Object objRememberedValue3 = zl2Var.rememberedValue();
            if (zChanged || objRememberedValue3 == c16170a.getEmpty()) {
                objRememberedValue3 = new a(z6bVar, l5bVar2);
                zl2Var.updateRememberedValue(objRememberedValue3);
            }
            jx4.DisposableEffect(l5bVar, (qy6<? super wf4, ? extends vf4>) objRememberedValue3, zl2Var, 0);
            InterfaceC0701e.a aVar = InterfaceC0701e.f5158d1;
            l5b l5bVar3 = this.f58624b;
            boolean zChangedInstance = zl2Var.changedInstance(coroutineScope) | zl2Var.changed(this.f58624b) | zl2Var.changed(i2gVarRememberUpdatedState);
            l5b l5bVar4 = this.f58624b;
            Object objRememberedValue4 = zl2Var.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == c16170a.getEmpty()) {
                Object bVar = new b(coroutineScope, z6bVar, l5bVar4, i2gVarRememberUpdatedState, null);
                zl2Var.updateRememberedValue(bVar);
                objRememberedValue4 = bVar;
            }
            InterfaceC0701e interfaceC0701ePointerInput = vgg.pointerInput(aVar, l5bVar3, (gz6<? super s2d, ? super zy2<? super bth>, ? extends Object>) objRememberedValue4);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return interfaceC0701ePointerInput;
        }
    }

    @yfb
    public static final InterfaceC0701e tapPressTextFieldModifier(@yfb InterfaceC0701e interfaceC0701e, @gib l5b l5bVar, boolean z, @yfb qy6<? super izb, bth> qy6Var) {
        return z ? C0696c.composed$default(interfaceC0701e, null, new C8957a(qy6Var, l5bVar), 1, null) : interfaceC0701e;
    }

    public static /* synthetic */ InterfaceC0701e tapPressTextFieldModifier$default(InterfaceC0701e interfaceC0701e, l5b l5bVar, boolean z, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return tapPressTextFieldModifier(interfaceC0701e, l5bVar, z, qy6Var);
    }
}
