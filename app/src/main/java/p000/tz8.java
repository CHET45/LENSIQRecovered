package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 0)
public final class tz8 {

    /* JADX INFO: renamed from: d */
    public static final int f86382d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ple f86383a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<vz8> f86384b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Map<Object, C13298a> f86385c = new LinkedHashMap();

    /* JADX INFO: renamed from: tz8$a */
    @dwf({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    public final class C13298a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Object f86386a;

        /* JADX INFO: renamed from: b */
        @gib
        public final Object f86387b;

        /* JADX INFO: renamed from: c */
        public int f86388c;

        /* JADX INFO: renamed from: d */
        @gib
        public gz6<? super zl2, ? super Integer, bth> f86389d;

        /* JADX INFO: renamed from: tz8$a$a */
        @dwf({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,138:1\n173#2,9:139\n1223#3,6:148\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1\n*L\n100#1:139,9\n108#1:148,6\n*E\n"})
        public static final class a extends tt8 implements gz6<zl2, Integer, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ tz8 f86391a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C13298a f86392b;

            /* JADX INFO: renamed from: tz8$a$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,138:1\n64#2,5:139\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1\n*L\n109#1:139,5\n*E\n"})
            public static final class C16535a extends tt8 implements qy6<wf4, vf4> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C13298a f86393a;

                /* JADX INFO: renamed from: tz8$a$a$a$a, reason: collision with other inner class name */
                @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$1\n*L\n1#1,497:1\n111#2,2:498\n*E\n"})
                public static final class C16536a implements vf4 {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C13298a f86394a;

                    public C16536a(C13298a c13298a) {
                        this.f86394a = c13298a;
                    }

                    @Override // p000.vf4
                    public void dispose() {
                        this.f86394a.f86389d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16535a(C13298a c13298a) {
                    super(1);
                    this.f86393a = c13298a;
                }

                @Override // p000.qy6
                @yfb
                public final vf4 invoke(@yfb wf4 wf4Var) {
                    return new C16536a(this.f86393a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(tz8 tz8Var, C13298a c13298a) {
                super(2);
                this.f86391a = tz8Var;
                this.f86392b = c13298a;
            }

            @Override // p000.gz6
            public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
                invoke(zl2Var, num.intValue());
                return bth.f14751a;
            }

            @hk2
            public final void invoke(@gib zl2 zl2Var, int i) {
                if ((i & 3) == 2 && zl2Var.getSkipping()) {
                    zl2Var.skipToGroupEnd();
                    return;
                }
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventStart(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                vz8 vz8VarInvoke = this.f86391a.getItemProvider().invoke();
                int index = this.f86392b.getIndex();
                if ((index >= vz8VarInvoke.getItemCount() || !md8.areEqual(vz8VarInvoke.getKey(index), this.f86392b.getKey())) && (index = vz8VarInvoke.getIndex(this.f86392b.getKey())) != -1) {
                    this.f86392b.f86388c = index;
                }
                int i2 = index;
                boolean z = i2 != -1;
                tz8 tz8Var = this.f86391a;
                C13298a c13298a = this.f86392b;
                zl2Var.startReusableGroup(gm2.f40180q, Boolean.valueOf(z));
                boolean zChanged = zl2Var.changed(z);
                zl2Var.startReplaceGroup(-869707859);
                if (z) {
                    zl2Var.startReplaceGroup(-2120167269);
                    uz8.m32672SkippableItemJVlU9Rs(vz8VarInvoke, h0g.m29890constructorimpl(tz8Var.f86383a), i2, h0g.m29890constructorimpl(c13298a.getKey()), zl2Var, 0);
                    zl2Var.endReplaceGroup();
                } else {
                    zl2Var.deactivateToEndGroup(zChanged);
                }
                zl2Var.endReplaceGroup();
                zl2Var.endReusableGroup();
                Object key = this.f86392b.getKey();
                boolean zChangedInstance = zl2Var.changedInstance(this.f86392b);
                C13298a c13298a2 = this.f86392b;
                Object objRememberedValue = zl2Var.rememberedValue();
                if (zChangedInstance || objRememberedValue == zl2.f105372a.getEmpty()) {
                    objRememberedValue = new C16535a(c13298a2);
                    zl2Var.updateRememberedValue(objRememberedValue);
                }
                jx4.DisposableEffect(key, (qy6<? super wf4, ? extends vf4>) objRememberedValue, zl2Var, 0);
                if (gm2.isTraceInProgress()) {
                    gm2.traceEventEnd();
                }
            }
        }

        public C13298a(int i, @yfb Object obj, @gib Object obj2) {
            this.f86386a = obj;
            this.f86387b = obj2;
            this.f86388c = i;
        }

        private final gz6<zl2, Integer, bth> createContentLambda() {
            return mk2.composableLambdaInstance(1403994769, true, new a(tz8.this, this));
        }

        @yfb
        public final gz6<zl2, Integer, bth> getContent() {
            gz6 gz6Var = this.f86389d;
            if (gz6Var != null) {
                return gz6Var;
            }
            gz6<zl2, Integer, bth> gz6VarCreateContentLambda = createContentLambda();
            this.f86389d = gz6VarCreateContentLambda;
            return gz6VarCreateContentLambda;
        }

        @gib
        public final Object getContentType() {
            return this.f86387b;
        }

        public final int getIndex() {
            return this.f86388c;
        }

        @yfb
        public final Object getKey() {
            return this.f86386a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tz8(@yfb ple pleVar, @yfb ny6<? extends vz8> ny6Var) {
        this.f86383a = pleVar;
        this.f86384b = ny6Var;
    }

    @yfb
    public final gz6<zl2, Integer, bth> getContent(int i, @yfb Object obj, @gib Object obj2) {
        C13298a c13298a = this.f86385c.get(obj);
        if (c13298a != null && c13298a.getIndex() == i && md8.areEqual(c13298a.getContentType(), obj2)) {
            return c13298a.getContent();
        }
        C13298a c13298a2 = new C13298a(i, obj, obj2);
        this.f86385c.put(obj, c13298a2);
        return c13298a2.getContent();
    }

    @gib
    public final Object getContentType(@gib Object obj) {
        if (obj == null) {
            return null;
        }
        C13298a c13298a = this.f86385c.get(obj);
        if (c13298a != null) {
            return c13298a.getContentType();
        }
        vz8 vz8VarInvoke = this.f86384b.invoke();
        int index = vz8VarInvoke.getIndex(obj);
        if (index != -1) {
            return vz8VarInvoke.getContentType(index);
        }
        return null;
    }

    @yfb
    public final ny6<vz8> getItemProvider() {
        return this.f86384b;
    }
}
