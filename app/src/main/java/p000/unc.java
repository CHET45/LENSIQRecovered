package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class unc {

    /* JADX INFO: renamed from: a */
    public boolean f88612a = false;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC13616b> f88613b = new g70();

    /* JADX INFO: renamed from: c */
    public final Map<String, qba> f88614c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Comparator<tcc<String, Float>> f88615d = new C13615a();

    /* JADX INFO: renamed from: unc$a */
    public class C13615a implements Comparator<tcc<String, Float>> {
        public C13615a() {
        }

        @Override // java.util.Comparator
        public int compare(tcc<String, Float> tccVar, tcc<String, Float> tccVar2) {
            float fFloatValue = tccVar.f84272b.floatValue();
            float fFloatValue2 = tccVar2.f84272b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: unc$b */
    public interface InterfaceC13616b {
        void onFrameRendered(float f);
    }

    /* JADX INFO: renamed from: a */
    public void m23462a(boolean z) {
        this.f88612a = z;
    }

    public void addFrameListener(InterfaceC13616b interfaceC13616b) {
        this.f88613b.add(interfaceC13616b);
    }

    public void clearRenderTimes() {
        this.f88614c.clear();
    }

    public List<tcc<String, Float>> getSortedRenderTimes() {
        if (!this.f88612a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f88614c.size());
        for (Map.Entry<String, qba> entry : this.f88614c.entrySet()) {
            arrayList.add(new tcc(entry.getKey(), Float.valueOf(entry.getValue().getMean())));
        }
        Collections.sort(arrayList, this.f88615d);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.f88612a) {
            List<tcc<String, Float>> sortedRenderTimes = getSortedRenderTimes();
            for (int i = 0; i < sortedRenderTimes.size(); i++) {
                tcc<String, Float> tccVar = sortedRenderTimes.get(i);
                String.format("\t\t%30s:%.2f", tccVar.f84271a, tccVar.f84272b);
            }
        }
    }

    public void recordRenderTime(String str, float f) {
        if (this.f88612a) {
            qba qbaVar = this.f88614c.get(str);
            if (qbaVar == null) {
                qbaVar = new qba();
                this.f88614c.put(str, qbaVar);
            }
            qbaVar.add(f);
            if (str.equals("__container")) {
                Iterator<InterfaceC13616b> it = this.f88613b.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f);
                }
            }
        }
    }

    public void removeFrameListener(InterfaceC13616b interfaceC13616b) {
        this.f88613b.remove(interfaceC13616b);
    }
}
