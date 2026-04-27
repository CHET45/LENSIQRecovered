package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k4f {

    /* JADX INFO: renamed from: a */
    public final String f52581a;

    /* JADX INFO: renamed from: b */
    public final Collection<rua<?, ?>> f52582b;

    /* JADX INFO: renamed from: c */
    public final Object f52583c;

    /* JADX INFO: renamed from: k4f$b */
    public static final class C8197b {

        /* JADX INFO: renamed from: a */
        public String f52584a;

        /* JADX INFO: renamed from: b */
        public List<rua<?, ?>> f52585b;

        /* JADX INFO: renamed from: c */
        public Object f52586c;

        /* JADX INFO: Access modifiers changed from: private */
        public C8197b addAllMethods(Collection<rua<?, ?>> collection) {
            this.f52585b.addAll(collection);
            return this;
        }

        public C8197b addMethod(rua<?, ?> ruaVar) {
            this.f52585b.add((rua) v7d.checkNotNull(ruaVar, FirebaseAnalytics.C3552d.f23230v));
            return this;
        }

        public k4f build() {
            return new k4f(this);
        }

        @lg5("https://github.com/grpc/grpc-java/issues/2666")
        public C8197b setName(String str) {
            this.f52584a = (String) v7d.checkNotNull(str, "name");
            return this;
        }

        public C8197b setSchemaDescriptor(@eib Object obj) {
            this.f52586c = obj;
            return this;
        }

        private C8197b(String str) {
            this.f52585b = new ArrayList();
            setName(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14521a(String str, Collection<rua<?, ?>> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (rua<?, ?> ruaVar : collection) {
            v7d.checkNotNull(ruaVar, FirebaseAnalytics.C3552d.f23230v);
            String serviceName = ruaVar.getServiceName();
            v7d.checkArgument(str.equals(serviceName), "service names %s != %s", serviceName, str);
            v7d.checkArgument(hashSet.add(ruaVar.getFullMethodName()), "duplicate name %s", ruaVar.getFullMethodName());
        }
    }

    public static C8197b newBuilder(String str) {
        return new C8197b(str);
    }

    public Collection<rua<?, ?>> getMethods() {
        return this.f52582b;
    }

    public String getName() {
        return this.f52581a;
    }

    @lg5("https://github.com/grpc/grpc-java/issues/2222")
    @eib
    public Object getSchemaDescriptor() {
        return this.f52583c;
    }

    public String toString() {
        return yya.toStringHelper(this).add("name", this.f52581a).add("schemaDescriptor", this.f52583c).add("methods", this.f52582b).omitNullValues().toString();
    }

    public k4f(String str, rua<?, ?>... ruaVarArr) {
        this(str, Arrays.asList(ruaVarArr));
    }

    public k4f(String str, Collection<rua<?, ?>> collection) {
        this(newBuilder(str).addAllMethods((Collection) v7d.checkNotNull(collection, "methods")));
    }

    private k4f(C8197b c8197b) {
        String str = c8197b.f52584a;
        this.f52581a = str;
        m14521a(str, c8197b.f52585b);
        this.f52582b = Collections.unmodifiableList(new ArrayList(c8197b.f52585b));
        this.f52583c = c8197b.f52586c;
    }
}
