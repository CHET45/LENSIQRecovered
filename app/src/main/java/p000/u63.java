package p000;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import p000.kad;

/* JADX INFO: loaded from: classes3.dex */
public interface u63 {
    boolean isAvailableOnDevice();

    void onClearCredential(@yfb b22 b22Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<Void, y12> r63Var);

    void onCreateCredential(@yfb Context context, @yfb p53 p53Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<q53, l53> r63Var);

    @c5e(34)
    default void onGetCredential(@yfb Context context, @yfb kad.C8269b c8269b, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var) {
        md8.checkNotNullParameter(context, "context");
        md8.checkNotNullParameter(c8269b, "pendingGetCredentialHandle");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
    }

    void onGetCredential(@yfb Context context, @yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<a47, w37> r63Var);

    @c5e(34)
    default void onPrepareCredential(@yfb z37 z37Var, @gib CancellationSignal cancellationSignal, @yfb Executor executor, @yfb r63<kad, w37> r63Var) {
        md8.checkNotNullParameter(z37Var, "request");
        md8.checkNotNullParameter(executor, "executor");
        md8.checkNotNullParameter(r63Var, "callback");
    }
}
