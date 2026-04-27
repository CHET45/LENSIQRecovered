package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,80:1\n77#2:81\n1223#3,6:82\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n54#1:81\n56#1:82,6\n*E\n"})
public final class uli {

    /* JADX INFO: renamed from: uli$a */
    @ck3(m4009c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", m4010f = "WindowInfo.kt", m4011i = {}, m4012l = {57}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C13590a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f88418a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ sli f88419b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ i2g<qy6<Boolean, bth>> f88420c;

        /* JADX INFO: renamed from: uli$a$a */
        public static final class a extends tt8 implements ny6<Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sli f88421a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(sli sliVar) {
                super(0);
                this.f88421a = sliVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ny6
            @yfb
            public final Boolean invoke() {
                return Boolean.valueOf(this.f88421a.isWindowFocused());
            }
        }

        /* JADX INFO: renamed from: uli$a$b */
        public static final class b<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ i2g<qy6<Boolean, bth>> f88422a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(i2g<? extends qy6<? super Boolean, bth>> i2gVar) {
                this.f88422a = i2gVar;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit(((Boolean) obj).booleanValue(), (zy2<? super bth>) zy2Var);
            }

            @gib
            public final Object emit(boolean z, @yfb zy2<? super bth> zy2Var) {
                this.f88422a.getValue().invoke(wc1.boxBoolean(z));
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13590a(sli sliVar, i2g<? extends qy6<? super Boolean, bth>> i2gVar, zy2<? super C13590a> zy2Var) {
            super(2, zy2Var);
            this.f88419b = sliVar;
            this.f88420c = i2gVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C13590a(this.f88419b, this.f88420c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C13590a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f88418a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                y56 y56VarSnapshotFlow = stf.snapshotFlow(new a(this.f88419b));
                b bVar = new b(this.f88420c);
                this.f88418a = 1;
                if (y56VarSnapshotFlow.collect(bVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: uli$b */
    public static final class C13591b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Boolean, bth> f88423a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f88424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13591b(qy6<? super Boolean, bth> qy6Var, int i) {
            super(2);
            this.f88423a = qy6Var;
            this.f88424b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            uli.WindowFocusObserver(this.f88423a, zl2Var, tsd.updateChangedFlags(this.f88424b | 1));
        }
    }

    @hk2
    public static final void WindowFocusObserver(@yfb qy6<? super Boolean, bth> qy6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(127829799);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(qy6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(127829799, i2, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:52)");
            }
            sli sliVar = (sli) zl2VarStartRestartGroup.consume(sn2.getLocalWindowInfo());
            i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(qy6Var, zl2VarStartRestartGroup, i2 & 14);
            boolean zChanged = zl2VarStartRestartGroup.changed(sliVar) | zl2VarStartRestartGroup.changed(i2gVarRememberUpdatedState);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C13590a(sliVar, i2gVarRememberUpdatedState, null);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            jx4.LaunchedEffect(sliVar, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue, zl2VarStartRestartGroup, 0);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C13591b(qy6Var, i));
        }
    }
}
