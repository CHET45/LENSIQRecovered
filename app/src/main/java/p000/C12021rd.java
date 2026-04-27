package p000;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1134e0;
import androidx.lifecycle.C1137f0;

/* JADX INFO: renamed from: rd */
/* JADX INFO: loaded from: classes.dex */
public final class C12021rd {

    /* JADX INFO: renamed from: rd$a */
    @dwf({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$1\n*L\n1#1,90:1\n*E\n"})
    public static final class a extends tt8 implements ny6<mai> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentActivity f77843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f77843a = componentActivity;
        }

        @Override // p000.ny6
        @yfb
        public final mai invoke() {
            return this.f77843a.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: rd$b */
    @dwf({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$2\n*L\n1#1,90:1\n*E\n"})
    public static final class b extends tt8 implements ny6<k63> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentActivity f77844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f77844a = componentActivity;
        }

        @Override // p000.ny6
        @yfb
        public final k63 invoke() {
            return this.f77844a.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: rd$c */
    @dwf({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    public static final class c extends tt8 implements ny6<mai> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentActivity f77845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f77845a = componentActivity;
        }

        @Override // p000.ny6
        @yfb
        public final mai invoke() {
            return this.f77845a.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: rd$d */
    @dwf({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    public static final class d extends tt8 implements ny6<k63> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<k63> f77846a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ComponentActivity f77847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ny6<? extends k63> ny6Var, ComponentActivity componentActivity) {
            super(0);
            this.f77846a = ny6Var;
            this.f77847b = componentActivity;
        }

        @Override // p000.ny6
        @yfb
        public final k63 invoke() {
            k63 k63VarInvoke;
            ny6<k63> ny6Var = this.f77846a;
            return (ny6Var == null || (k63VarInvoke = ny6Var.invoke()) == null) ? this.f77847b.getDefaultViewModelCreationExtras() : k63VarInvoke;
        }
    }

    /* JADX INFO: renamed from: rd$e */
    @dwf({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$1\n*L\n1#1,90:1\n*E\n"})
    public static final class e extends tt8 implements ny6<C1137f0.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentActivity f77848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f77848a = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final C1137f0.c invoke() {
            return this.f77848a.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: rd$f */
    @dwf({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    public static final class f extends tt8 implements ny6<C1137f0.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentActivity f77849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f77849a = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final C1137f0.c invoke() {
            return this.f77849a.getDefaultViewModelProviderFactory();
        }
    }

    @ir9
    @q64(level = u64.f86867c, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends cai> fx8<VM> viewModels(ComponentActivity componentActivity, ny6<? extends C1137f0.c> ny6Var) {
        if (ny6Var == null) {
            ny6Var = new e(componentActivity);
        }
        md8.reifiedOperationMarker(4, "VM");
        return new C1134e0(vvd.getOrCreateKotlinClass(cai.class), new a(componentActivity), ny6Var, new b(componentActivity));
    }

    public static /* synthetic */ fx8 viewModels$default(ComponentActivity componentActivity, ny6 ny6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ny6Var = null;
        }
        if (ny6Var == null) {
            ny6Var = new e(componentActivity);
        }
        md8.reifiedOperationMarker(4, "VM");
        return new C1134e0(vvd.getOrCreateKotlinClass(cai.class), new a(componentActivity), ny6Var, new b(componentActivity));
    }

    @ir9
    public static final /* synthetic */ <VM extends cai> fx8<VM> viewModels(ComponentActivity componentActivity, ny6<? extends k63> ny6Var, ny6<? extends C1137f0.c> ny6Var2) {
        if (ny6Var2 == null) {
            ny6Var2 = new f(componentActivity);
        }
        md8.reifiedOperationMarker(4, "VM");
        return new C1134e0(vvd.getOrCreateKotlinClass(cai.class), new c(componentActivity), ny6Var2, new d(ny6Var, componentActivity));
    }

    public static /* synthetic */ fx8 viewModels$default(ComponentActivity componentActivity, ny6 ny6Var, ny6 ny6Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            ny6Var = null;
        }
        if ((i & 2) != 0) {
            ny6Var2 = null;
        }
        if (ny6Var2 == null) {
            ny6Var2 = new f(componentActivity);
        }
        md8.reifiedOperationMarker(4, "VM");
        return new C1134e0(vvd.getOrCreateKotlinClass(cai.class), new c(componentActivity), ny6Var2, new d(ny6Var, componentActivity));
    }
}
