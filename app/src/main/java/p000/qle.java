package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n148#2,3:144\n151#2,2:159\n1223#3,6:147\n1223#3,6:153\n1855#4,2:161\n1#5:163\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n77#1:144,3\n77#1:159,2\n78#1:147,6\n89#1:153,6\n103#1:161,2\n*E\n"})
public final class qle implements ple {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C11542c f74860d = new C11542c(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final dme<qle, ?> f74861e = eme.Saver(C11540a.f74865a, C11541b.f74866a);

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<Object, Map<String, List<Object>>> f74862a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<Object, C11543d> f74863b;

    /* JADX INFO: renamed from: c */
    @gib
    public sle f74864c;

    /* JADX INFO: renamed from: qle$a */
    public static final class C11540a extends tt8 implements gz6<fme, qle, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* JADX INFO: renamed from: a */
        public static final C11540a f74865a = new C11540a();

        public C11540a() {
            super(2);
        }

        @Override // p000.gz6
        @gib
        public final Map<Object, Map<String, List<Object>>> invoke(@yfb fme fmeVar, @yfb qle qleVar) {
            return qleVar.saveAll();
        }
    }

    /* JADX INFO: renamed from: qle$b */
    public static final class C11541b extends tt8 implements qy6<Map<Object, Map<String, ? extends List<? extends Object>>>, qle> {

        /* JADX INFO: renamed from: a */
        public static final C11541b f74866a = new C11541b();

        public C11541b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ qle invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return invoke2((Map<Object, Map<String, List<Object>>>) map);
        }

        @gib
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final qle invoke2(@yfb Map<Object, Map<String, List<Object>>> map) {
            return new qle(map);
        }
    }

    /* JADX INFO: renamed from: qle$c */
    public static final class C11542c {
        public /* synthetic */ C11542c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<qle, ?> getSaver() {
            return qle.f74861e;
        }

        private C11542c() {
        }
    }

    /* JADX INFO: renamed from: qle$d */
    public final class C11543d {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Object f74867a;

        /* JADX INFO: renamed from: b */
        public boolean f74868b = true;

        /* JADX INFO: renamed from: c */
        @yfb
        public final sle f74869c;

        /* JADX INFO: renamed from: qle$d$a */
        public static final class a extends tt8 implements qy6<Object, Boolean> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qle f74871a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qle qleVar) {
                super(1);
                this.f74871a = qleVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.qy6
            @yfb
            public final Boolean invoke(@yfb Object obj) {
                sle parentSaveableStateRegistry = this.f74871a.getParentSaveableStateRegistry();
                return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj) : true);
            }
        }

        public C11543d(@yfb Object obj) {
            this.f74867a = obj;
            this.f74869c = ule.SaveableStateRegistry((Map) qle.this.f74862a.get(obj), new a(qle.this));
        }

        @yfb
        public final Object getKey() {
            return this.f74867a;
        }

        @yfb
        public final sle getRegistry() {
            return this.f74869c;
        }

        public final boolean getShouldSave() {
            return this.f74868b;
        }

        public final void saveTo(@yfb Map<Object, Map<String, List<Object>>> map) {
            if (this.f74868b) {
                Map<String, List<Object>> mapPerformSave = this.f74869c.performSave();
                if (mapPerformSave.isEmpty()) {
                    map.remove(this.f74867a);
                } else {
                    map.put(this.f74867a, mapPerformSave);
                }
            }
        }

        public final void setShouldSave(boolean z) {
            this.f74868b = z;
        }
    }

    /* JADX INFO: renamed from: qle$e */
    @dwf({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,143:1\n1#2:144\n64#3,5:145\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n*L\n93#1:145,5\n*E\n"})
    public static final class C11544e extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f74873b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C11543d f74874c;

        /* JADX INFO: renamed from: qle$e$a */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1$1\n*L\n1#1,497:1\n94#2,3:498\n*E\n"})
        public static final class a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11543d f74875a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ qle f74876b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Object f74877c;

            public a(C11543d c11543d, qle qleVar, Object obj) {
                this.f74875a = c11543d;
                this.f74876b = qleVar;
                this.f74877c = obj;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f74875a.saveTo(this.f74876b.f74862a);
                this.f74876b.f74863b.remove(this.f74877c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11544e(Object obj, C11543d c11543d) {
            super(1);
            this.f74873b = obj;
            this.f74874c = c11543d;
        }

        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            boolean zContainsKey = qle.this.f74863b.containsKey(this.f74873b);
            Object obj = this.f74873b;
            if (!zContainsKey) {
                qle.this.f74862a.remove(this.f74873b);
                qle.this.f74863b.put(this.f74873b, this.f74874c);
                return new a(this.f74874c, qle.this, this.f74873b);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* JADX INFO: renamed from: qle$f */
    public static final class C11545f extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f74879b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gz6<zl2, Integer, bth> f74880c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f74881d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11545f(Object obj, gz6<? super zl2, ? super Integer, bth> gz6Var, int i) {
            super(2);
            this.f74879b = obj;
            this.f74880c = gz6Var;
            this.f74881d = i;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@gib zl2 zl2Var, int i) {
            qle.this.SaveableStateProvider(this.f74879b, this.f74880c, zl2Var, tsd.updateChangedFlags(this.f74881d | 1));
        }
    }

    public qle() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> mutableMap = xt9.toMutableMap(this.f74862a);
        Iterator<T> it = this.f74863b.values().iterator();
        while (it.hasNext()) {
            ((C11543d) it.next()).saveTo(mutableMap);
        }
        if (mutableMap.isEmpty()) {
            return null;
        }
        return mutableMap;
    }

    @Override // p000.ple
    @hk2
    public void SaveableStateProvider(@yfb Object obj, @yfb gz6<? super zl2, ? super Integer, bth> gz6Var, @gib zl2 zl2Var, int i) {
        int i2;
        zl2 zl2VarStartRestartGroup = zl2Var.startRestartGroup(-1198538093);
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
                gm2.traceEventStart(-1198538093, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            zl2VarStartRestartGroup.startReusableGroup(gm2.f40180q, obj);
            Object objRememberedValue = zl2VarStartRestartGroup.rememberedValue();
            zl2.C16170a c16170a = zl2.f105372a;
            if (objRememberedValue == c16170a.getEmpty()) {
                sle sleVar = this.f74864c;
                if (!(sleVar != null ? sleVar.canBeSaved(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objRememberedValue = new C11543d(obj);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            C11543d c11543d = (C11543d) objRememberedValue;
            pn2.CompositionLocalProvider(ule.getLocalSaveableStateRegistry().provides(c11543d.getRegistry()), gz6Var, zl2VarStartRestartGroup, (i2 & 112) | did.f29712i);
            bth bthVar = bth.f14751a;
            boolean zChangedInstance = zl2VarStartRestartGroup.changedInstance(this) | zl2VarStartRestartGroup.changedInstance(obj) | zl2VarStartRestartGroup.changedInstance(c11543d);
            Object objRememberedValue2 = zl2VarStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == c16170a.getEmpty()) {
                objRememberedValue2 = new C11544e(obj, c11543d);
                zl2VarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            jx4.DisposableEffect(bthVar, (qy6<? super wf4, ? extends vf4>) objRememberedValue2, zl2VarStartRestartGroup, 6);
            zl2VarStartRestartGroup.endReusableGroup();
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C11545f(obj, gz6Var, i));
        }
    }

    @gib
    public final sle getParentSaveableStateRegistry() {
        return this.f74864c;
    }

    @Override // p000.ple
    public void removeState(@yfb Object obj) {
        C11543d c11543d = this.f74863b.get(obj);
        if (c11543d != null) {
            c11543d.setShouldSave(false);
        } else {
            this.f74862a.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(@gib sle sleVar) {
        this.f74864c = sleVar;
    }

    public qle(@yfb Map<Object, Map<String, List<Object>>> map) {
        this.f74862a = map;
        this.f74863b = new LinkedHashMap();
    }

    public /* synthetic */ qle(Map map, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
