package p000;

import com.google.firebase.firestore.C3604g;
import com.google.firebase.firestore.C3607j;
import com.google.firebase.firestore.C3609l;
import p000.wp9;
import p000.wyd;
import p000.xj2;

/* JADX INFO: loaded from: classes5.dex */
public class jqa extends xj2 {

    /* JADX INFO: renamed from: jqa$b */
    public class C8020b implements wyd.InterfaceC14838c {
        private C8020b() {
        }

        @Override // p000.wyd.InterfaceC14838c
        public qy7<ci4> getRemoteKeysForTarget(int i) {
            return jqa.this.getSyncEngine().getRemoteKeysForTarget(i);
        }

        @Override // p000.wyd.InterfaceC14838c
        public void handleOnlineStateChange(h5c h5cVar) {
            jqa.this.getSyncEngine().handleOnlineStateChange(h5cVar);
        }

        @Override // p000.wyd.InterfaceC14838c
        public void handleRejectedListen(int i, n4g n4gVar) {
            jqa.this.getSyncEngine().handleRejectedListen(i, n4gVar);
        }

        @Override // p000.wyd.InterfaceC14838c
        public void handleRejectedWrite(int i, n4g n4gVar) {
            jqa.this.getSyncEngine().handleRejectedWrite(i, n4gVar);
        }

        @Override // p000.wyd.InterfaceC14838c
        public void handleRemoteEvent(myd mydVar) {
            jqa.this.getSyncEngine().handleRemoteEvent(mydVar);
        }

        @Override // p000.wyd.InterfaceC14838c
        public void handleSuccessfulWrite(o7b o7bVar) {
            jqa.this.getSyncEngine().handleSuccessfulWrite(o7bVar);
        }
    }

    public jqa(C3604g c3604g) {
        super(c3604g);
    }

    private boolean isMemoryLruGcEnabled(C3604g c3604g) {
        if (c3604g.getCacheSettings() == null || !(c3604g.getCacheSettings() instanceof C3607j)) {
            return false;
        }
        return ((C3607j) c3604g.getCacheSettings()).getGarbageCollectorSettings() instanceof C3609l;
    }

    @Override // p000.xj2
    /* JADX INFO: renamed from: a */
    public j65 mo14237a(xj2.C15148a c15148a) {
        return new j65(getSyncEngine());
    }

    @Override // p000.xj2
    @hib
    /* JADX INFO: renamed from: b */
    public uoe mo576b(xj2.C15148a c15148a) {
        return null;
    }

    @Override // p000.xj2
    @hib
    /* JADX INFO: renamed from: c */
    public a08 mo577c(xj2.C15148a c15148a) {
        return null;
    }

    @Override // p000.xj2
    /* JADX INFO: renamed from: d */
    public qe9 mo14238d(xj2.C15148a c15148a) {
        return new qe9(getPersistence(), new qld(), c15148a.f98167d);
    }

    @Override // p000.xj2
    /* JADX INFO: renamed from: e */
    public jqc mo578e(xj2.C15148a c15148a) {
        if (!isMemoryLruGcEnabled(this.f98155a)) {
            return vqa.createEagerGcMemoryPersistence();
        }
        return vqa.createLruGcMemoryPersistence(wp9.C14736b.WithCacheSizeBytes(this.f98155a.getCacheSizeBytes()), new ud9(getRemoteSerializer()));
    }

    @Override // p000.xj2
    /* JADX INFO: renamed from: f */
    public wyd mo14239f(xj2.C15148a c15148a) {
        return new wyd(c15148a.f98166c.getDatabaseId(), new C8020b(), getLocalStore(), getDatastore(), c15148a.f98165b, m25228h());
    }

    @Override // p000.xj2
    /* JADX INFO: renamed from: g */
    public shg mo14240g(xj2.C15148a c15148a) {
        return new shg(getLocalStore(), getRemoteStore(), c15148a.f98167d, c15148a.f98168e);
    }
}
