package p000;

import com.google.firebase.firestore.C3604g;
import p000.wp9;
import p000.xj2;

/* JADX INFO: loaded from: classes5.dex */
public class age extends jqa {
    public age(C3604g c3604g) {
        super(c3604g);
    }

    @Override // p000.jqa, p000.xj2
    /* JADX INFO: renamed from: b */
    public uoe mo576b(xj2.C15148a c15148a) {
        return ((yie) getPersistence()).getReferenceDelegate().getGarbageCollector().newScheduler(c15148a.f98165b, getLocalStore());
    }

    @Override // p000.jqa, p000.xj2
    /* JADX INFO: renamed from: c */
    public a08 mo577c(xj2.C15148a c15148a) {
        return new a08(getPersistence(), c15148a.f98165b, getLocalStore());
    }

    @Override // p000.jqa, p000.xj2
    /* JADX INFO: renamed from: e */
    public jqc mo578e(xj2.C15148a c15148a) {
        return new yie(c15148a.f98164a, c15148a.f98166c.getPersistenceKey(), c15148a.f98166c.getDatabaseId(), new ud9(getRemoteSerializer()), wp9.C14736b.WithCacheSizeBytes(this.f98155a.getCacheSizeBytes()));
    }
}
