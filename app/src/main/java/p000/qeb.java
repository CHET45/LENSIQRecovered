package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class qeb {

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends deb>, peb> f74249a = new HashMap(32);

    public void add(peb pebVar) {
        Iterator<Class<? extends deb>> it = pebVar.getNodeTypes().iterator();
        while (it.hasNext()) {
            this.f74249a.put(it.next(), pebVar);
        }
    }

    public void render(deb debVar) {
        peb pebVar = this.f74249a.get(debVar.getClass());
        if (pebVar != null) {
            pebVar.render(debVar);
        }
    }
}
