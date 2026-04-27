package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.sle;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n81#2:109\n107#2,2:110\n1855#3,2:112\n1#4:114\n1223#5,6:115\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n68#1:109\n68#1:110,2\n75#1:112,2\n86#1:115,6\n*E\n"})
public final class p19 implements sle, ple {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C10748b f69392d = new C10748b(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final sle f69393a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f69394b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Set<Object> f69395c;

    /* JADX INFO: renamed from: p19$a */
    public static final class C10747a extends tt8 implements qy6<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sle f69396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10747a(sle sleVar) {
            super(1);
            this.f69396a = sleVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb Object obj) {
            sle sleVar = this.f69396a;
            return Boolean.valueOf(sleVar != null ? sleVar.canBeSaved(obj) : true);
        }
    }

    /* JADX INFO: renamed from: p19$b */
    public static final class C10748b {

        /* JADX INFO: renamed from: p19$b$a */
        @dwf({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion$saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
        public static final class a extends tt8 implements gz6<fme, p19, Map<String, ? extends List<? extends Object>>> {

            /* JADX INFO: renamed from: a */
            public static final a f69397a = new a();

            public a() {
                super(2);
            }

            @Override // p000.gz6
            @gib
            public final Map<String, List<Object>> invoke(@yfb fme fmeVar, @yfb p19 p19Var) {
                Map<String, List<Object>> mapPerformSave = p19Var.performSave();
                if (mapPerformSave.isEmpty()) {
                    return null;
                }
                return mapPerformSave;
            }
        }

        /* JADX INFO: renamed from: p19$b$b */
        public static final class b extends tt8 implements qy6<Map<String, ? extends List<? extends Object>>, p19> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ sle f69398a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(sle sleVar) {
                super(1);
                this.f69398a = sleVar;
            }

            @Override // p000.qy6
            @gib
            public final p19 invoke(@yfb Map<String, ? extends List<? extends Object>> map) {
                return new p19(this.f69398a, map);
            }
        }

        public /* synthetic */ C10748b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<p19, Map<String, List<Object>>> saver(@gib sle sleVar) {
            return eme.Saver(a.f69397a, new b(sleVar));
        }

        private C10748b() {
        }
    }

    /* JADX INFO: renamed from: p19$c */
    @dwf({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,108:1\n64#2,5:109\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2$1\n*L\n88#1:109,5\n*E\n"})
    public static final class C10749c extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f69400b;

        /* JADX INFO: renamed from: p19$c$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$SaveableStateProvider$2$1\n*L\n1#1,497:1\n89#2,2:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ p19 f69401a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f69402b;

            public a(p19 p19Var, Object obj) {
                this.f69401a = p19Var;
                this.f69402b = obj;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f69401a.f69395c.add(this.f69402b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10749c(Object obj) {
            super(1);
            this.f69400b = obj;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            p19.this.f69395c.remove(this.f69400b);
            return new a(p19.this, this.f69400b);
        }
    }

    /* JADX INFO: renamed from: p19$d */
    public static final class C10750d extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f69404b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<zl2, Integer, bth> f69405c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f69406d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10750d(Object obj, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f69404b = obj;
            this.f69405c = gz6Var;
            this.f69406d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            p19.this.SaveableStateProvider(this.f69404b, this.f69405c, zl2Var, tsd.updateChangedFlags(this.f69406d | 1));
        }
    }

    public p19(@yfb sle sleVar) {
        this.f69393a = sleVar;
        this.f69394b = xtf.mutableStateOf$default(null, null, 2, null);
        this.f69395c = new LinkedHashSet();
    }

    @Override // p000.ple
    @hk2
    public void SaveableStateProvider(@yfb Object obj, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-697180401);
        if ((i & 6) == 0) {
            i2 = (zl2VarStartRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(gz6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= zl2VarStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && zl2VarStartRestartGroup.getSkipping()) {
            zl2VarStartRestartGroup.skipToGroupEnd();
        } else {
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-697180401, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            ple wrappedHolder = getWrappedHolder();
            if (wrappedHolder == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            int i3 = i2 & 14;
            wrappedHolder.SaveableStateProvider(obj, gz6Var, zl2VarStartRestartGroup, i2 & 126);
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(this) | zl2VarStartRestartGroup.changedInstance(obj);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                objRememberedValue = new C10749c(obj);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            jx4.DisposableEffect(obj, (qy6<? super wf4, ? extends vf4>) objRememberedValue, zl2VarStartRestartGroup, i3);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C10750d(obj, gz6Var, i));
        }
    }

    @Override // p000.sle
    public boolean canBeSaved(@yfb Object obj) {
        return this.f69393a.canBeSaved(obj);
    }

    @Override // p000.sle
    @gib
    public Object consumeRestored(@yfb String str) {
        return this.f69393a.consumeRestored(str);
    }

    @gib
    public final ple getWrappedHolder() {
        return (ple) this.f69394b.getValue();
    }

    @Override // p000.sle
    @yfb
    public Map<String, List<Object>> performSave() {
        ple wrappedHolder = getWrappedHolder();
        if (wrappedHolder != null) {
            Iterator<T> it = this.f69395c.iterator();
            while (it.hasNext()) {
                wrappedHolder.removeState(it.next());
            }
        }
        return this.f69393a.performSave();
    }

    @Override // p000.sle
    @yfb
    public sle.InterfaceC12651a registerProvider(@yfb String str, @yfb ny6<? extends Object> ny6Var) {
        return this.f69393a.registerProvider(str, ny6Var);
    }

    @Override // p000.ple
    public void removeState(@yfb Object obj) {
        ple wrappedHolder = getWrappedHolder();
        if (wrappedHolder == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        wrappedHolder.removeState(obj);
    }

    public final void setWrappedHolder(@gib ple pleVar) {
        this.f69394b.setValue(pleVar);
    }

    public p19(@gib sle sleVar, @gib Map<String, ? extends List<? extends Object>> map) {
        this(ule.SaveableStateRegistry(map, new C10747a(sleVar)));
    }
}
