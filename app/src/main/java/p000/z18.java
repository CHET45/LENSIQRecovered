package p000;

import androidx.lifecycle.C1137f0;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "InitializerViewModelFactoryKt")
public final class z18 {
    public static final /* synthetic */ <VM extends cai> void initializer(y18 y18Var, qy6<? super k63, ? extends VM> qy6Var) {
        md8.checkNotNullParameter(y18Var, "<this>");
        md8.checkNotNullParameter(qy6Var, "initializer");
        md8.reifiedOperationMarker(4, "VM");
        y18Var.addInitializer(vvd.getOrCreateKotlinClass(cai.class), qy6Var);
    }

    @yfb
    public static final C1137f0.c viewModelFactory(@yfb qy6<? super y18, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builder");
        y18 y18Var = new y18();
        qy6Var.invoke(y18Var);
        return y18Var.build();
    }
}
