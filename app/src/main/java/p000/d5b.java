package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class d5b extends le7 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap<String, p3f> f28472a = new ConcurrentHashMap();

    @eib
    public p3f addService(p3f p3fVar) {
        return this.f28472a.put(p3fVar.getServiceDescriptor().getName(), p3fVar);
    }

    @Override // p000.le7
    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    public List<p3f> getServices() {
        return Collections.unmodifiableList(new ArrayList(this.f28472a.values()));
    }

    @Override // p000.le7
    @eib
    public m3f<?, ?> lookupMethod(String str, @eib String str2) {
        p3f p3fVar;
        String strExtractFullServiceName = rua.extractFullServiceName(str);
        if (strExtractFullServiceName == null || (p3fVar = this.f28472a.get(strExtractFullServiceName)) == null) {
            return null;
        }
        return p3fVar.getMethod(str);
    }

    public boolean removeService(p3f p3fVar) {
        return this.f28472a.remove(p3fVar.getServiceDescriptor().getName(), p3fVar);
    }

    @eib
    public p3f addService(o21 o21Var) {
        return addService(o21Var.bindService());
    }
}
