package p000;

import java.util.Collections;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xyd {
    @p7e({p7e.EnumC10826a.f69935b})
    public xyd() {
    }

    @efb
    public static xyd combine(@efb List<xyd> continuations) {
        return continuations.get(0).m25570a(continuations);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: a */
    public abstract xyd m25570a(@efb List<xyd> continuations);

    @efb
    public abstract ja9<Void> enqueue();

    @efb
    public final xyd then(@efb e5c work) {
        return then(Collections.singletonList(work));
    }

    @efb
    public abstract xyd then(@efb List<e5c> work);
}
