package p000;

import android.content.Context;
import com.jeremyliao.liveeventbus.utils.AppUtils;

/* JADX INFO: loaded from: classes6.dex */
public class dq2 {
    public dq2 autoClear(boolean z) {
        qb9.get().m20196i(z);
        return this;
    }

    public dq2 enableLogger(boolean z) {
        qb9.get().m20194g(z);
        return this;
    }

    public dq2 lifecycleObserverAlwaysActive(boolean z) {
        qb9.get().m20197j(z);
        return this;
    }

    public dq2 setContext(Context context) {
        AppUtils.init(context);
        qb9.get().m20195h();
        return this;
    }

    public dq2 setLogger(@efb hj9 hj9Var) {
        qb9.get().m20198k(hj9Var);
        return this;
    }
}
