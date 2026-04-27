package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
public final class a95 {
    @wg5
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
    }

    @yfb
    public static final Executor asExecutor(@yfb m13 m13Var) {
        Executor executor;
        t85 t85Var = m13Var instanceof t85 ? (t85) m13Var : null;
        return (t85Var == null || (executor = t85Var.getExecutor()) == null) ? new bf4(m13Var) : executor;
    }

    @yfb
    @xn8(name = ymh.InterfaceC15729h.f102263c)
    public static final t85 from(@yfb ExecutorService executorService) {
        return new u85(executorService);
    }

    @yfb
    @xn8(name = ymh.InterfaceC15729h.f102263c)
    public static final m13 from(@yfb Executor executor) {
        m13 m13Var;
        bf4 bf4Var = executor instanceof bf4 ? (bf4) executor : null;
        return (bf4Var == null || (m13Var = bf4Var.f13617a) == null) ? new u85(executor) : m13Var;
    }
}
