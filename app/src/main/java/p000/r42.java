package p000;

import java.util.concurrent.Executor;
import p000.da8;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public interface r42 extends xa8<da8.C4695l> {

    /* JADX INFO: renamed from: r42$a */
    public interface InterfaceC11878a {
        void onFailure(Throwable th);

        void onSuccess(long j);
    }

    o42 newStream(rua<?, ?> ruaVar, fta ftaVar, rn1 rn1Var, q42[] q42VarArr);

    void ping(InterfaceC11878a interfaceC11878a, Executor executor);
}
