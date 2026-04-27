package p000;

import androidx.lifecycle.C1137f0;
import p000.kai;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class iai {

    /* JADX INFO: renamed from: a */
    @yfb
    public final mai f46284a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final C1137f0.c f46285b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final k63 f46286c;

    public iai(@yfb mai maiVar, @yfb C1137f0.c cVar, @yfb k63 k63Var) {
        md8.checkNotNullParameter(maiVar, "store");
        md8.checkNotNullParameter(cVar, "factory");
        md8.checkNotNullParameter(k63Var, "extras");
        this.f46284a = maiVar;
        this.f46285b = cVar;
        this.f46286c = k63Var;
    }

    public static /* synthetic */ cai getViewModel$lifecycle_viewmodel_release$default(iai iaiVar, oo8 oo8Var, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = kai.f53482a.getDefaultKey$lifecycle_viewmodel_release(oo8Var);
        }
        return iaiVar.getViewModel$lifecycle_viewmodel_release(oo8Var, str);
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
    @yfb
    public final <T extends cai> T getViewModel$lifecycle_viewmodel_release(@yfb oo8<T> oo8Var, @yfb String str) {
        md8.checkNotNullParameter(oo8Var, "modelClass");
        md8.checkNotNullParameter(str, "key");
        T t = (T) this.f46284a.get(str);
        if (!oo8Var.isInstance(t)) {
            s4b s4bVar = new s4b(this.f46286c);
            s4bVar.set(kai.C8271a.f53484a, str);
            T t2 = (T) jai.createViewModel(this.f46285b, oo8Var, s4bVar);
            this.f46284a.put(str, t2);
            return t2;
        }
        Object obj = this.f46285b;
        if (obj instanceof C1137f0.e) {
            md8.checkNotNull(t);
            ((C1137f0.e) obj).onRequery(t);
        }
        md8.checkNotNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iai(@yfb nai naiVar, @yfb C1137f0.c cVar, @yfb k63 k63Var) {
        this(naiVar.getViewModelStore(), cVar, k63Var);
        md8.checkNotNullParameter(naiVar, "owner");
        md8.checkNotNullParameter(cVar, "factory");
        md8.checkNotNullParameter(k63Var, "extras");
    }
}
