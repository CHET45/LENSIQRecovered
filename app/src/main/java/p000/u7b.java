package p000;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u7b {

    /* JADX INFO: renamed from: a */
    public final euf f86998a;

    /* JADX INFO: renamed from: b */
    public final List<b2i> f86999b;

    public u7b(euf eufVar, List<b2i> list) {
        this.f86998a = (euf) x7d.checkNotNull(eufVar);
        this.f86999b = list;
    }

    public List<b2i> getTransformResults() {
        return this.f86999b;
    }

    public euf getVersion() {
        return this.f86998a;
    }
}
