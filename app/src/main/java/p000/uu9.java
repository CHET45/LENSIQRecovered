package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class uu9 {

    /* JADX INFO: renamed from: uu9$a */
    public static class C13713a extends uu9 {
        @Override // p000.uu9
        @efb
        public List<deb> reduce(@efb deb debVar) {
            deb firstChild = debVar.getFirstChild();
            if (firstChild == null) {
                return Collections.singletonList(debVar);
            }
            ArrayList arrayList = new ArrayList();
            while (firstChild != null) {
                if (!(firstChild instanceof g79)) {
                    arrayList.add(firstChild);
                }
                deb next = firstChild.getNext();
                firstChild.unlink();
                firstChild = next;
            }
            return arrayList;
        }
    }

    @efb
    public static uu9 directChildren() {
        return new C13713a();
    }

    @efb
    public abstract List<deb> reduce(@efb deb debVar);
}
