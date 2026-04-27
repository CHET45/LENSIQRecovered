package p000;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public interface ea2 {
    @hib
    static ea2 getInstance() {
        int i = Build.VERSION.SDK_INT;
        if ((30 > i || i > 33) && !nf1.isAtLeastU()) {
            return null;
        }
        return j7e.getInstance();
    }

    boolean applyIfPossible(@efb Context context, @efb Map<Integer, Integer> map);

    @efb
    Context wrapContextIfPossible(@efb Context context, @efb Map<Integer, Integer> map);
}
