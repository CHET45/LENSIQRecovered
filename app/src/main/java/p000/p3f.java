package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class p3f {

    /* JADX INFO: renamed from: a */
    public final k4f f69584a;

    /* JADX INFO: renamed from: b */
    public final Map<String, m3f<?, ?>> f69585b;

    public static C10785b builder(String str) {
        return new C10785b(str);
    }

    @x98
    public m3f<?, ?> getMethod(String str) {
        return this.f69585b.get(str);
    }

    public Collection<m3f<?, ?>> getMethods() {
        return this.f69585b.values();
    }

    public k4f getServiceDescriptor() {
        return this.f69584a;
    }

    /* JADX INFO: renamed from: p3f$b */
    public static final class C10785b {

        /* JADX INFO: renamed from: a */
        public final String f69586a;

        /* JADX INFO: renamed from: b */
        public final k4f f69587b;

        /* JADX INFO: renamed from: c */
        public final Map<String, m3f<?, ?>> f69588c;

        public <ReqT, RespT> C10785b addMethod(rua<ReqT, RespT> ruaVar, y2f<ReqT, RespT> y2fVar) {
            return addMethod(m3f.create((rua) v7d.checkNotNull(ruaVar, "method must not be null"), (y2f) v7d.checkNotNull(y2fVar, "handler must not be null")));
        }

        public p3f build() {
            k4f k4fVar = this.f69587b;
            if (k4fVar == null) {
                ArrayList arrayList = new ArrayList(this.f69588c.size());
                Iterator<m3f<?, ?>> it = this.f69588c.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getMethodDescriptor());
                }
                k4fVar = new k4f(this.f69586a, arrayList);
            }
            HashMap map = new HashMap(this.f69588c);
            for (rua<?, ?> ruaVar : k4fVar.getMethods()) {
                m3f m3fVar = (m3f) map.remove(ruaVar.getFullMethodName());
                if (m3fVar == null) {
                    throw new IllegalStateException("No method bound for descriptor entry " + ruaVar.getFullMethodName());
                }
                if (m3fVar.getMethodDescriptor() != ruaVar) {
                    throw new IllegalStateException("Bound method for " + ruaVar.getFullMethodName() + " not same instance as method in service descriptor");
                }
            }
            if (map.size() <= 0) {
                return new p3f(k4fVar, this.f69588c);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((m3f) map.values().iterator().next()).getMethodDescriptor().getFullMethodName());
        }

        private C10785b(String str) {
            this.f69588c = new HashMap();
            this.f69586a = (String) v7d.checkNotNull(str, "serviceName");
            this.f69587b = null;
        }

        public <ReqT, RespT> C10785b addMethod(m3f<ReqT, RespT> m3fVar) {
            rua<ReqT, RespT> methodDescriptor = m3fVar.getMethodDescriptor();
            v7d.checkArgument(this.f69586a.equals(methodDescriptor.getServiceName()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f69586a, methodDescriptor.getFullMethodName());
            String fullMethodName = methodDescriptor.getFullMethodName();
            v7d.checkState(!this.f69588c.containsKey(fullMethodName), "Method by same name already registered: %s", fullMethodName);
            this.f69588c.put(fullMethodName, m3fVar);
            return this;
        }

        private C10785b(k4f k4fVar) {
            this.f69588c = new HashMap();
            this.f69587b = (k4f) v7d.checkNotNull(k4fVar, "serviceDescriptor");
            this.f69586a = k4fVar.getName();
        }
    }

    private p3f(k4f k4fVar, Map<String, m3f<?, ?>> map) {
        this.f69584a = (k4f) v7d.checkNotNull(k4fVar, "serviceDescriptor");
        this.f69585b = Collections.unmodifiableMap(new HashMap(map));
    }

    public static C10785b builder(k4f k4fVar) {
        return new C10785b(k4fVar);
    }
}
