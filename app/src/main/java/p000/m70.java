package p000;

import com.google.firebase.Timestamp;
import java.util.Collections;
import java.util.List;
import p000.o70;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m70 implements xdh {

    /* JADX INFO: renamed from: a */
    public final List<b2i> f60043a;

    /* JADX INFO: renamed from: m70$a */
    public static class C9166a extends m70 {
        public C9166a(List<b2i> list) {
            super(list);
        }

        @Override // p000.m70
        /* JADX INFO: renamed from: a */
        public b2i mo16650a(@hib b2i b2iVar) {
            o70.C10211b c10211bM16649b = m70.m16649b(b2iVar);
            for (b2i b2iVar2 : getElements()) {
                int i = 0;
                while (i < c10211bM16649b.getValuesCount()) {
                    if (s2i.equals(c10211bM16649b.getValues(i), b2iVar2)) {
                        c10211bM16649b.removeValues(i);
                    } else {
                        i++;
                    }
                }
            }
            return b2i.newBuilder().setArrayValue(c10211bM16649b).build();
        }
    }

    /* JADX INFO: renamed from: m70$b */
    public static class C9167b extends m70 {
        public C9167b(List<b2i> list) {
            super(list);
        }

        @Override // p000.m70
        /* JADX INFO: renamed from: a */
        public b2i mo16650a(@hib b2i b2iVar) {
            o70.C10211b c10211bM16649b = m70.m16649b(b2iVar);
            for (b2i b2iVar2 : getElements()) {
                if (!s2i.contains(c10211bM16649b, b2iVar2)) {
                    c10211bM16649b.addValues(b2iVar2);
                }
            }
            return b2i.newBuilder().setArrayValue(c10211bM16649b).build();
        }
    }

    public m70(List<b2i> list) {
        this.f60043a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: b */
    public static o70.C10211b m16649b(@hib b2i b2iVar) {
        return s2i.isArray(b2iVar) ? b2iVar.getArrayValue().toBuilder() : o70.newBuilder();
    }

    /* JADX INFO: renamed from: a */
    public abstract b2i mo16650a(@hib b2i b2iVar);

    @Override // p000.xdh
    public b2i applyToLocalView(@hib b2i b2iVar, Timestamp timestamp) {
        return mo16650a(b2iVar);
    }

    @Override // p000.xdh
    public b2i applyToRemoteDocument(@hib b2i b2iVar, b2i b2iVar2) {
        return mo16650a(b2iVar);
    }

    @Override // p000.xdh
    @hib
    public b2i computeBaseValue(@hib b2i b2iVar) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f60043a.equals(((m70) obj).f60043a);
    }

    public List<b2i> getElements() {
        return this.f60043a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f60043a.hashCode();
    }
}
