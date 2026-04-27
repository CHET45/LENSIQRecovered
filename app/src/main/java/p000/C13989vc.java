package p000;

import java.util.UUID;
import p000.C13989vc;
import p000.zl2;

/* JADX INFO: renamed from: vc */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"})
public final class C13989vc {

    /* JADX INFO: renamed from: vc$a */
    @dwf({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"})
    public static final class a extends tt8 implements qy6<wf4, vf4> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11997rc<I> f90574a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC12973tc f90575b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f90576c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC8767lc<I, O> f90577d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ i2g<qy6<O, bth>> f90578e;

        /* JADX INFO: renamed from: vc$a$a, reason: collision with other inner class name */
        @dwf({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n1#1,483:1\n109#2,2:484\n*E\n"})
        public static final class C16542a implements vf4 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C11997rc f90579a;

            public C16542a(C11997rc c11997rc) {
                this.f90579a = c11997rc;
            }

            @Override // p000.vf4
            public void dispose() {
                this.f90579a.unregister();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C11997rc<I> c11997rc, AbstractC12973tc abstractC12973tc, String str, AbstractC8767lc<I, O> abstractC8767lc, i2g<? extends qy6<? super O, bth>> i2gVar) {
            super(1);
            this.f90574a = c11997rc;
            this.f90575b = abstractC12973tc;
            this.f90576c = str;
            this.f90577d = abstractC8767lc;
            this.f90578e = i2gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(i2g i2gVar, Object obj) {
            ((qy6) i2gVar.getValue()).invoke(obj);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.qy6
        @yfb
        public final vf4 invoke(@yfb wf4 wf4Var) {
            C11997rc<I> c11997rc = this.f90574a;
            AbstractC12973tc abstractC12973tc = this.f90575b;
            String str = this.f90576c;
            AbstractC8767lc<I, O> abstractC8767lc = this.f90577d;
            final i2g<qy6<O, bth>> i2gVar = this.f90578e;
            c11997rc.setLauncher((AbstractC11416qc<I>) abstractC12973tc.register(str, abstractC8767lc, new InterfaceC5717fc() { // from class: uc
                @Override // p000.InterfaceC5717fc
                public final void onActivityResult(Object obj) {
                    C13989vc.a.invoke$lambda$0(i2gVar, obj);
                }
            }));
            return new C16542a(this.f90574a);
        }
    }

    /* JADX INFO: renamed from: vc$b */
    public static final class b extends tt8 implements ny6<String> {

        /* JADX INFO: renamed from: a */
        public static final b f90580a = new b();

        public b() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @yfb
    @hk2
    public static final <I, O> nr9<I, O> rememberLauncherForActivityResult(@yfb AbstractC8767lc<I, O> abstractC8767lc, @yfb qy6<? super O, bth> qy6Var, @gib zl2 zl2Var, int i) {
        zl2Var.startReplaceableGroup(-1408504823);
        i2g i2gVarRememberUpdatedState = stf.rememberUpdatedState(abstractC8767lc, zl2Var, 8);
        i2g i2gVarRememberUpdatedState2 = stf.rememberUpdatedState(qy6Var, zl2Var, (i >> 3) & 14);
        String str = (String) gyd.rememberSaveable(new Object[0], (dme) null, (String) null, (ny6) b.f90580a, zl2Var, 3080, 6);
        InterfaceC14545wc current = dd9.f29416a.getCurrent(zl2Var, 6);
        if (current == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        AbstractC12973tc activityResultRegistry = current.getActivityResultRegistry();
        zl2Var.startReplaceableGroup(-3687241);
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = new C11997rc();
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        zl2Var.endReplaceableGroup();
        C11997rc c11997rc = (C11997rc) objRememberedValue;
        zl2Var.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new nr9(c11997rc, i2gVarRememberUpdatedState);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        zl2Var.endReplaceableGroup();
        nr9<I, O> nr9Var = (nr9) objRememberedValue2;
        jx4.DisposableEffect(activityResultRegistry, str, abstractC8767lc, new a(c11997rc, activityResultRegistry, str, abstractC8767lc, i2gVarRememberUpdatedState2), zl2Var, 520);
        zl2Var.endReplaceableGroup();
        return nr9Var;
    }
}
