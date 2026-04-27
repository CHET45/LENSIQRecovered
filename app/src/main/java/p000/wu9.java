package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.vu9;

/* JADX INFO: loaded from: classes7.dex */
public class wu9 implements vu9 {

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends deb>, qwf> f95539a;

    /* JADX INFO: renamed from: wu9$a */
    public static class C14799a implements vu9.InterfaceC14262a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends deb>, qwf> f95540a = new HashMap(3);

        @Override // p000.vu9.InterfaceC14262a
        @efb
        @Deprecated
        public <N extends deb> vu9.InterfaceC14262a addFactory(@efb Class<N> cls, @efb qwf qwfVar) {
            return prependFactory(cls, qwfVar);
        }

        @Override // p000.vu9.InterfaceC14262a
        @efb
        public <N extends deb> vu9.InterfaceC14262a appendFactory(@efb Class<N> cls, @efb qwf qwfVar) {
            qwf qwfVar2 = this.f95540a.get(cls);
            if (qwfVar2 == null) {
                this.f95540a.put(cls, qwfVar);
            } else if (qwfVar2 instanceof C14800b) {
                ((C14800b) qwfVar2).f95541a.add(0, qwfVar);
            } else {
                this.f95540a.put(cls, new C14800b(qwfVar, qwfVar2));
            }
            return this;
        }

        @Override // p000.vu9.InterfaceC14262a
        @efb
        public vu9 build() {
            return new wu9(Collections.unmodifiableMap(this.f95540a));
        }

        @Override // p000.vu9.InterfaceC14262a
        @hib
        public <N extends deb> qwf getFactory(@efb Class<N> cls) {
            return this.f95540a.get(cls);
        }

        @Override // p000.vu9.InterfaceC14262a
        @efb
        public <N extends deb> vu9.InterfaceC14262a prependFactory(@efb Class<N> cls, @efb qwf qwfVar) {
            qwf qwfVar2 = this.f95540a.get(cls);
            if (qwfVar2 == null) {
                this.f95540a.put(cls, qwfVar);
            } else if (qwfVar2 instanceof C14800b) {
                ((C14800b) qwfVar2).f95541a.add(qwfVar);
            } else {
                this.f95540a.put(cls, new C14800b(qwfVar2, qwfVar));
            }
            return this;
        }

        @Override // p000.vu9.InterfaceC14262a
        @efb
        public <N extends deb> qwf requireFactory(@efb Class<N> cls) {
            qwf factory = getFactory(cls);
            if (factory != null) {
                return factory;
            }
            throw new NullPointerException(cls.getName());
        }

        @Override // p000.vu9.InterfaceC14262a
        @efb
        public <N extends deb> vu9.InterfaceC14262a setFactory(@efb Class<N> cls, @hib qwf qwfVar) {
            if (qwfVar == null) {
                this.f95540a.remove(cls);
            } else {
                this.f95540a.put(cls, qwfVar);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: wu9$b */
    public static class C14800b implements qwf {

        /* JADX INFO: renamed from: a */
        public final List<qwf> f95541a;

        public C14800b(@efb qwf qwfVar, @efb qwf qwfVar2) {
            ArrayList arrayList = new ArrayList(3);
            this.f95541a = arrayList;
            arrayList.add(qwfVar);
            arrayList.add(qwfVar2);
        }

        @Override // p000.qwf
        @hib
        public Object getSpans(@efb mu9 mu9Var, @efb l1e l1eVar) {
            int size = this.f95541a.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = this.f95541a.get(i).getSpans(mu9Var, l1eVar);
            }
            return objArr;
        }
    }

    public wu9(@efb Map<Class<? extends deb>, qwf> map) {
        this.f95539a = map;
    }

    @Override // p000.vu9
    @hib
    public <N extends deb> qwf get(@efb Class<N> cls) {
        return this.f95539a.get(cls);
    }

    @Override // p000.vu9
    @efb
    public <N extends deb> qwf require(@efb Class<N> cls) {
        qwf qwfVar = get(cls);
        if (qwfVar != null) {
            return qwfVar;
        }
        throw new NullPointerException(cls.getName());
    }
}
