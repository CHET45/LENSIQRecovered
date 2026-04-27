package p000;

import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.C1166v;
import androidx.mediarouter.media.C1340j;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,181:1\n74#2:182\n74#2:183\n1116#3,6:184\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n58#1:182\n131#1:183\n171#1:184,6\n*E\n"})
public final class b76 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: b76$a */
    @ck3(m4009c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", m4010f = "FlowExt.kt", m4011i = {}, m4012l = {172}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C1764a<T> extends ugg implements gz6<sdd<T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f12843a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f12844b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC1143j f12845c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC1143j.b f12846d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ e13 f12847e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ y56<T> f12848f;

        /* JADX INFO: renamed from: b76$a$a */
        @ck3(m4009c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", m4010f = "FlowExt.kt", m4011i = {}, m4012l = {174, HideBottomViewOnScrollBehavior.f20939p}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f12849a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ e13 f12850b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ y56<T> f12851c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ sdd<T> f12852d;

            /* JADX INFO: renamed from: b76$a$a$a, reason: collision with other inner class name */
            public static final class C16410a<T> implements t66 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ sdd<T> f12853a;

                public C16410a(sdd<T> sddVar) {
                    this.f12853a = sddVar;
                }

                @Override // p000.t66
                @gib
                public final Object emit(T t, @yfb zy2<? super bth> zy2Var) {
                    this.f12853a.setValue(t);
                    return bth.f14751a;
                }
            }

            /* JADX INFO: renamed from: b76$a$a$b */
            @ck3(m4009c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", m4010f = "FlowExt.kt", m4011i = {}, m4012l = {176}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
            public static final class b extends ugg implements gz6<x13, zy2<? super bth>, Object> {

                /* JADX INFO: renamed from: a */
                public int f12854a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ y56<T> f12855b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ sdd<T> f12856c;

                /* JADX INFO: renamed from: b76$a$a$b$a, reason: collision with other inner class name */
                public static final class C16411a<T> implements t66 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ sdd<T> f12857a;

                    public C16411a(sdd<T> sddVar) {
                        this.f12857a = sddVar;
                    }

                    @Override // p000.t66
                    @gib
                    public final Object emit(T t, @yfb zy2<? super bth> zy2Var) {
                        this.f12857a.setValue(t);
                        return bth.f14751a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(y56<? extends T> y56Var, sdd<T> sddVar, zy2<? super b> zy2Var) {
                    super(2, zy2Var);
                    this.f12855b = y56Var;
                    this.f12856c = sddVar;
                }

                @Override // p000.tq0
                @yfb
                public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                    return new b(this.f12855b, this.f12856c, zy2Var);
                }

                @Override // p000.gz6
                @gib
                public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                    return ((b) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
                }

                @Override // p000.tq0
                @gib
                public final Object invokeSuspend(@yfb Object obj) {
                    Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                    int i = this.f12854a;
                    if (i == 0) {
                        y7e.throwOnFailure(obj);
                        y56<T> y56Var = this.f12855b;
                        C16411a c16411a = new C16411a(this.f12856c);
                        this.f12854a = 1;
                        if (y56Var.collect(c16411a, this) == coroutine_suspended) {
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
            public a(e13 e13Var, y56<? extends T> y56Var, sdd<T> sddVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f12850b = e13Var;
                this.f12851c = y56Var;
                this.f12852d = sddVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f12850b, this.f12851c, this.f12852d, zy2Var);
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
                int i = this.f12849a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    if (md8.areEqual(this.f12850b, a05.f2a)) {
                        y56<T> y56Var = this.f12851c;
                        C16410a c16410a = new C16410a(this.f12852d);
                        this.f12849a = 1;
                        if (y56Var.collect(c16410a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        e13 e13Var = this.f12850b;
                        b bVar = new b(this.f12851c, this.f12852d, null);
                        this.f12849a = 2;
                        if (dg1.withContext(e13Var, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1764a(AbstractC1143j abstractC1143j, AbstractC1143j.b bVar, e13 e13Var, y56<? extends T> y56Var, zy2<? super C1764a> zy2Var) {
            super(2, zy2Var);
            this.f12845c = abstractC1143j;
            this.f12846d = bVar;
            this.f12847e = e13Var;
            this.f12848f = y56Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C1764a c1764a = new C1764a(this.f12845c, this.f12846d, this.f12847e, this.f12848f, zy2Var);
            c1764a.f12844b = obj;
            return c1764a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb sdd<T> sddVar, @gib zy2<? super bth> zy2Var) {
            return ((C1764a) create(sddVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f12843a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                sdd sddVar = (sdd) this.f12844b;
                AbstractC1143j abstractC1143j = this.f12845c;
                AbstractC1143j.b bVar = this.f12846d;
                a aVar = new a(this.f12847e, this.f12848f, sddVar, null);
                this.f12843a = 1;
                if (C1166v.repeatOnLifecycle(abstractC1143j, bVar, aVar, this) == coroutine_suspended) {
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

    @yfb
    @hk2
    public static final <T> i2g<T> collectAsStateWithLifecycle(@yfb l2g<? extends T> l2gVar, @gib g59 g59Var, @gib AbstractC1143j.b bVar, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(743249048);
        if ((i2 & 1) != 0) {
            g59Var = (g59) zl2Var.consume(nd9.getLocalLifecycleOwner());
        }
        if ((i2 & 2) != 0) {
            bVar = AbstractC1143j.b.STARTED;
        }
        AbstractC1143j.b bVar2 = bVar;
        if ((i2 & 4) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(743249048, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        int i3 = i << 3;
        i2g<T> i2gVarCollectAsStateWithLifecycle = collectAsStateWithLifecycle(l2gVar, l2gVar.getValue(), g59Var.getLifecycle(), bVar2, e13Var2, zl2Var, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return i2gVarCollectAsStateWithLifecycle;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> collectAsStateWithLifecycle(@yfb l2g<? extends T> l2gVar, @yfb AbstractC1143j abstractC1143j, @gib AbstractC1143j.b bVar, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(-1858162195);
        if ((i2 & 2) != 0) {
            bVar = AbstractC1143j.b.STARTED;
        }
        AbstractC1143j.b bVar2 = bVar;
        if ((i2 & 4) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1858162195, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:95)");
        }
        int i3 = i << 3;
        i2g<T> i2gVarCollectAsStateWithLifecycle = collectAsStateWithLifecycle(l2gVar, l2gVar.getValue(), abstractC1143j, bVar2, e13Var2, zl2Var, (i & 14) | (i3 & C1340j.f10444b) | (i3 & 7168) | (i3 & 57344), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return i2gVarCollectAsStateWithLifecycle;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> collectAsStateWithLifecycle(@yfb y56<? extends T> y56Var, T t, @gib g59 g59Var, @gib AbstractC1143j.b bVar, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(-1485997211);
        g59 g59Var2 = (i2 & 2) != 0 ? (g59) zl2Var.consume(nd9.getLocalLifecycleOwner()) : g59Var;
        AbstractC1143j.b bVar2 = (i2 & 4) != 0 ? AbstractC1143j.b.STARTED : bVar;
        e13 e13Var2 = (i2 & 8) != 0 ? a05.f2a : e13Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1485997211, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        i2g<T> i2gVarCollectAsStateWithLifecycle = collectAsStateWithLifecycle(y56Var, t, g59Var2.getLifecycle(), bVar2, e13Var2, zl2Var, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return i2gVarCollectAsStateWithLifecycle;
    }

    @yfb
    @hk2
    public static final <T> i2g<T> collectAsStateWithLifecycle(@yfb y56<? extends T> y56Var, T t, @yfb AbstractC1143j abstractC1143j, @gib AbstractC1143j.b bVar, @gib e13 e13Var, @gib zl2 zl2Var, int i, int i2) {
        zl2Var.startReplaceableGroup(1977777920);
        if ((i2 & 4) != 0) {
            bVar = AbstractC1143j.b.STARTED;
        }
        AbstractC1143j.b bVar2 = bVar;
        if ((i2 & 8) != 0) {
            e13Var = a05.f2a;
        }
        e13 e13Var2 = e13Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1977777920, i, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        Object[] objArr = {y56Var, abstractC1143j, bVar2, e13Var2};
        zl2Var.startReplaceableGroup(710004817);
        boolean zChangedInstance = zl2Var.changedInstance(abstractC1143j) | ((((i & 7168) ^ kw1.f55470l) > 2048 && zl2Var.changed(bVar2)) || (i & kw1.f55470l) == 2048) | zl2Var.changedInstance(e13Var2) | zl2Var.changedInstance(y56Var);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = new C1764a(abstractC1143j, bVar2, e13Var2, y56Var, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        zl2Var.endReplaceableGroup();
        i2g<T> i2gVarProduceState = stf.produceState((Object) t, objArr, (gz6) objRememberedValue, zl2Var, (i >> 3) & 14);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        zl2Var.endReplaceableGroup();
        return i2gVarProduceState;
    }
}
