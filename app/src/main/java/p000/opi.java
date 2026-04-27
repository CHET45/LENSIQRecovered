package p000;

import androidx.lifecycle.AbstractC1158q;
import java.util.Collections;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class opi {
    @efb
    public static opi combine(@efb List<opi> continuations) {
        return continuations.get(0).mo18808a(continuations);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: a */
    public abstract opi mo18808a(@efb List<opi> continuations);

    @efb
    public abstract x5c enqueue();

    @efb
    public abstract ja9<List<tpi>> getWorkInfos();

    @efb
    public abstract AbstractC1158q<List<tpi>> getWorkInfosLiveData();

    @efb
    public final opi then(@efb e5c work) {
        return then(Collections.singletonList(work));
    }

    @efb
    public abstract opi then(@efb List<e5c> work);
}
