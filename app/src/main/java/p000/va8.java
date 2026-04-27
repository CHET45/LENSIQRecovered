package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class va8 extends le7 {

    /* JADX INFO: renamed from: a */
    public final List<p3f> f90465a;

    /* JADX INFO: renamed from: b */
    public final Map<String, m3f<?, ?>> f90466b;

    /* JADX INFO: renamed from: va8$b */
    public static final class C13964b {

        /* JADX INFO: renamed from: a */
        public final HashMap<String, p3f> f90467a = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public C13964b m23898a(p3f p3fVar) {
            this.f90467a.put(p3fVar.getServiceDescriptor().getName(), p3fVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public va8 m23899b() {
            HashMap map = new HashMap();
            Iterator<p3f> it = this.f90467a.values().iterator();
            while (it.hasNext()) {
                for (m3f<?, ?> m3fVar : it.next().getMethods()) {
                    map.put(m3fVar.getMethodDescriptor().getFullMethodName(), m3fVar);
                }
            }
            return new va8(Collections.unmodifiableList(new ArrayList(this.f90467a.values())), Collections.unmodifiableMap(map));
        }
    }

    @Override // p000.le7
    public List<p3f> getServices() {
        return this.f90465a;
    }

    @Override // p000.le7
    @eib
    public m3f<?, ?> lookupMethod(String str, @eib String str2) {
        return this.f90466b.get(str);
    }

    private va8(List<p3f> list, Map<String, m3f<?, ?>> map) {
        this.f90465a = list;
        this.f90466b = map;
    }
}
