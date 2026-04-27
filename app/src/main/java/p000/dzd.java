package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@sx4
@jd7
public final class dzd {
    private dzd() {
    }

    public static <K, V> azd<K, V> asynchronous(final azd<K, V> listener, final Executor executor) {
        v7d.checkNotNull(listener);
        v7d.checkNotNull(executor);
        return new azd() { // from class: czd
            @Override // p000.azd
            public final void onRemoval(ezd ezdVar) {
                dzd.lambda$asynchronous$1(executor, listener, ezdVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asynchronous$1(Executor executor, final azd azdVar, final ezd ezdVar) {
        executor.execute(new Runnable() { // from class: bzd
            @Override // java.lang.Runnable
            public final void run() {
                azdVar.onRemoval(ezdVar);
            }
        });
    }
}
