package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t2e {

    /* JADX INFO: renamed from: t2e$a */
    public static final class C12866a extends tt8 implements ny6<Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C12866a f83517a = new C12866a();

        public C12866a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: t2e$b */
    public static final class C12867b extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f83518a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12867b(int i) {
            super(2);
            this.f83518a = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            t2e.ReportDrawn(zl2Var, this.f83518a | 1);
        }
    }

    /* JADX INFO: renamed from: t2e$c */
    @ck3(m4009c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", m4010f = "ReportDrawn.kt", m4011i = {0}, m4012l = {182}, m4013m = "invokeSuspend", m4014n = {"$this$reportWhenComplete$iv"}, m4015s = {"L$0"})
    @dwf({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,176:1\n180#2,10:177\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1\n*L\n173#1:177,10\n*E\n"})
    public static final class C12868c extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f83519a;

        /* JADX INFO: renamed from: b */
        public int f83520b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gy6 f83521c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ qy6<zy2<? super bth>, Object> f83522d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12868c(gy6 gy6Var, qy6<? super zy2<? super bth>, ? extends Object> qy6Var, zy2<? super C12868c> zy2Var) {
            super(2, zy2Var);
            this.f83521c = gy6Var;
            this.f83522d = qy6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12868c(this.f83521c, this.f83522d, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12868c) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) throws Throwable {
            gy6 gy6Var;
            Throwable th;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f83520b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                gy6 gy6Var2 = this.f83521c;
                qy6<zy2<? super bth>, Object> qy6Var = this.f83522d;
                gy6Var2.addReporter();
                if (!gy6Var2.isFullyDrawnReported()) {
                    try {
                        this.f83519a = gy6Var2;
                        this.f83520b = 1;
                        if (qy6Var.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        gy6Var = gy6Var2;
                        gy6Var.removeReporter();
                    } catch (Throwable th2) {
                        gy6Var = gy6Var2;
                        th = th2;
                        gy6Var.removeReporter();
                        throw th;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gy6Var = (gy6) this.f83519a;
                try {
                    y7e.throwOnFailure(obj);
                    gy6Var.removeReporter();
                } catch (Throwable th3) {
                    th = th3;
                    gy6Var.removeReporter();
                    throw th;
                }
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: renamed from: t2e$d */
    public static final class C12869d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<zy2<? super bth>, Object> f83523a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f83524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12869d(qy6<? super zy2<? super bth>, ? extends Object> qy6Var, int i) {
            super(2);
            this.f83523a = qy6Var;
            this.f83524b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            t2e.ReportDrawnAfter(this.f83523a, zl2Var, this.f83524b | 1);
        }
    }

    /* JADX INFO: renamed from: t2e$e */
    public static final class C12870e extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<zy2<? super bth>, Object> f83525a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f83526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12870e(qy6<? super zy2<? super bth>, ? extends Object> qy6Var, int i) {
            super(2);
            this.f83525a = qy6Var;
            this.f83526b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            t2e.ReportDrawnAfter(this.f83525a, zl2Var, this.f83526b | 1);
        }
    }

    /* JADX INFO: renamed from: t2e$f */
    @dwf({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,176:1\n62#2,5:177\n62#2,5:182\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n135#1:177,5\n138#1:182,5\n*E\n"})
    public static final class C12871f extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gy6 f83527a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ny6<Boolean> f83528b;

        /* JADX INFO: renamed from: t2e$f$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n135#2:484\n*E\n"})
        public static final class a implements vf4 {
            @Override // p000.vf4
            public void dispose() {
            }
        }

        /* JADX INFO: renamed from: t2e$f$b */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnWhen$1\n*L\n1#1,483:1\n139#2,2:484\n*E\n"})
        public static final class b implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ s2e f83529a;

            public b(s2e s2eVar) {
                this.f83529a = s2eVar;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f83529a.removeReporter();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12871f(gy6 gy6Var, ny6<Boolean> ny6Var) {
            super(1);
            this.f83527a = gy6Var;
            this.f83528b = ny6Var;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            return this.f83527a.isFullyDrawnReported() ? new a() : new b(new s2e(this.f83527a, this.f83528b));
        }
    }

    /* JADX INFO: renamed from: t2e$g */
    public static final class C12872g extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Boolean> f83530a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f83531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12872g(ny6<Boolean> ny6Var, int i) {
            super(2);
            this.f83530a = ny6Var;
            this.f83531b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            t2e.ReportDrawnWhen(this.f83530a, zl2Var, this.f83531b | 1);
        }
    }

    /* JADX INFO: renamed from: t2e$h */
    public static final class C12873h extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Boolean> f83532a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f83533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12873h(ny6<Boolean> ny6Var, int i) {
            super(2);
            this.f83532a = ny6Var;
            this.f83533b = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            t2e.ReportDrawnWhen(this.f83532a, zl2Var, this.f83533b | 1);
        }
    }

    @hk2
    public static final void ReportDrawn(@gib zl2 zl2Var, int i) {
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1357012904);
        if (i == 0 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(C12866a.f83517a, zl2VarStartRestartGroup, 6);
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup == null) {
            return;
        }
        areVarEndRestartGroup.updateScope(new C12867b(i));
    }

    @hk2
    public static final void ReportDrawnAfter(@yfb qy6<? super zy2<? super bth>, ? extends Object> qy6Var, @gib zl2 zl2Var, int i) {
        gy6 fullyDrawnReporter;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(945311272);
        iy6 current = md9.f60704a.getCurrent(zl2VarStartRestartGroup, 6);
        if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
            are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
            if (areVarEndRestartGroup == null) {
                return;
            }
            areVarEndRestartGroup.updateScope(new C12870e(qy6Var, i));
            return;
        }
        jx4.LaunchedEffect(qy6Var, fullyDrawnReporter, new C12868c(fullyDrawnReporter, qy6Var, null), zl2VarStartRestartGroup, 584);
        are areVarEndRestartGroup2 = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup2 == null) {
            return;
        }
        areVarEndRestartGroup2.updateScope(new C12869d(qy6Var, i));
    }

    @hk2
    public static final void ReportDrawnWhen(@yfb ny6<Boolean> ny6Var, @gib zl2 zl2Var, int i) {
        int i2;
        gy6 fullyDrawnReporter;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-2047119994);
        if ((i & 14) == 0) {
            i2 = (zl2VarStartRestartGroup.changed(ny6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            iy6 current = md9.f60704a.getCurrent(zl2VarStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
                if (areVarEndRestartGroup == null) {
                    return;
                }
                areVarEndRestartGroup.updateScope(new C12873h(ny6Var, i));
                return;
            }
            jx4.DisposableEffect(fullyDrawnReporter, ny6Var, new C12871f(fullyDrawnReporter, ny6Var), zl2VarStartRestartGroup, ((i2 << 3) & 112) | 8);
        }
        are areVarEndRestartGroup2 = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup2 == null) {
            return;
        }
        areVarEndRestartGroup2.updateScope(new C12872g(ny6Var, i));
    }
}
