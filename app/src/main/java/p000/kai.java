package p000;

import androidx.lifecycle.C1137f0;
import androidx.lifecycle.InterfaceC1140h;
import java.util.Arrays;
import java.util.Collection;
import p000.k63;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n37#2,2:100\n1282#3,2:102\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n59#1:100,2\n85#1:102,2\n*E\n"})
public final class kai {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final kai f53482a = new kai();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f53483b = "androidx.lifecycle.ViewModelProvider.DefaultKey";

    /* JADX INFO: renamed from: kai$a */
    public static final class C8271a implements k63.InterfaceC8212b<String> {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C8271a f53484a = new C8271a();

        private C8271a() {
        }
    }

    private kai() {
    }

    @yfb
    public final C1137f0.c createInitializerFactory$lifecycle_viewmodel_release(@yfb Collection<? extends fai<?>> collection) {
        md8.checkNotNullParameter(collection, "initializers");
        fai[] faiVarArr = (fai[]) collection.toArray(new fai[0]);
        return new x18((fai[]) Arrays.copyOf(faiVarArr, faiVarArr.length));
    }

    @yfb
    public final <VM extends cai> VM createViewModelFromInitializers$lifecycle_viewmodel_release(@yfb oo8<VM> oo8Var, @yfb k63 k63Var, @yfb fai<?>... faiVarArr) {
        VM vm;
        fai<?> faiVar;
        qy6<k63, T> initializer$lifecycle_viewmodel_release;
        md8.checkNotNullParameter(oo8Var, "modelClass");
        md8.checkNotNullParameter(k63Var, "extras");
        md8.checkNotNullParameter(faiVarArr, "initializers");
        int length = faiVarArr.length;
        int i = 0;
        while (true) {
            vm = null;
            if (i >= length) {
                faiVar = null;
                break;
            }
            faiVar = faiVarArr[i];
            if (md8.areEqual(faiVar.getClazz$lifecycle_viewmodel_release(), oo8Var)) {
                break;
            }
            i++;
        }
        if (faiVar != null && (initializer$lifecycle_viewmodel_release = faiVar.getInitializer$lifecycle_viewmodel_release()) != 0) {
            vm = (VM) initializer$lifecycle_viewmodel_release.invoke(k63Var);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + lai.getCanonicalName(oo8Var)).toString());
    }

    @yfb
    public final k63 getDefaultCreationExtras$lifecycle_viewmodel_release(@yfb nai naiVar) {
        md8.checkNotNullParameter(naiVar, "owner");
        return naiVar instanceof InterfaceC1140h ? ((InterfaceC1140h) naiVar).getDefaultViewModelCreationExtras() : k63.C8211a.f52642b;
    }

    @yfb
    public final C1137f0.c getDefaultFactory$lifecycle_viewmodel_release(@yfb nai naiVar) {
        md8.checkNotNullParameter(naiVar, "owner");
        return naiVar instanceof InterfaceC1140h ? ((InterfaceC1140h) naiVar).getDefaultViewModelProviderFactory() : w24.f93124b;
    }

    @yfb
    public final <T extends cai> String getDefaultKey$lifecycle_viewmodel_release(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "modelClass");
        String canonicalName = lai.getCanonicalName(oo8Var);
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
    }

    @yfb
    public final <VM extends cai> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @yfb
    public final C1137f0.c createInitializerFactory$lifecycle_viewmodel_release(@yfb fai<?>... faiVarArr) {
        md8.checkNotNullParameter(faiVarArr, "initializers");
        return new x18((fai[]) Arrays.copyOf(faiVarArr, faiVarArr.length));
    }
}
