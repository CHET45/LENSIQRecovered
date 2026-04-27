package p000;

import p000.xj2;

/* JADX INFO: loaded from: classes5.dex */
public class hyd {

    /* JADX INFO: renamed from: a */
    public lc7 f45263a;

    /* JADX INFO: renamed from: b */
    public nyd f45264b;

    /* JADX INFO: renamed from: c */
    public tz5 f45265c;

    /* JADX INFO: renamed from: d */
    public zi3 f45266d;

    /* JADX INFO: renamed from: e */
    public us2 f45267e;

    /* JADX INFO: renamed from: a */
    public us2 m12659a(xj2.C15148a c15148a) {
        return new C10011nr(c15148a.f98164a);
    }

    /* JADX INFO: renamed from: b */
    public zi3 m12660b(xj2.C15148a c15148a) {
        return new zi3(c15148a.f98165b, getRemoteSerializer(), getFirestoreChannel());
    }

    /* JADX INFO: renamed from: c */
    public tz5 m12661c(xj2.C15148a c15148a) {
        return new tz5(c15148a.f98165b, c15148a.f98169f, c15148a.f98170g, c15148a.f98166c.getDatabaseId(), c15148a.f98171h, getGrpcCallProvider());
    }

    /* JADX INFO: renamed from: d */
    public lc7 m12662d(xj2.C15148a c15148a) {
        return new lc7(c15148a.f98165b, c15148a.f98164a, c15148a.f98166c, new pz5(c15148a.f98169f, c15148a.f98170g));
    }

    /* JADX INFO: renamed from: e */
    public nyd m12663e(xj2.C15148a c15148a) {
        return new nyd(c15148a.f98166c.getDatabaseId());
    }

    public us2 getConnectivityMonitor() {
        return (us2) r80.hardAssertNonNull(this.f45267e, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public zi3 getDatastore() {
        return (zi3) r80.hardAssertNonNull(this.f45266d, "datastore not initialized yet", new Object[0]);
    }

    public tz5 getFirestoreChannel() {
        return (tz5) r80.hardAssertNonNull(this.f45265c, "firestoreChannel not initialized yet", new Object[0]);
    }

    public lc7 getGrpcCallProvider() {
        return (lc7) r80.hardAssertNonNull(this.f45263a, "grpcCallProvider not initialized yet", new Object[0]);
    }

    public nyd getRemoteSerializer() {
        return (nyd) r80.hardAssertNonNull(this.f45264b, "remoteSerializer not initialized yet", new Object[0]);
    }

    public void initialize(xj2.C15148a c15148a) {
        this.f45264b = m12663e(c15148a);
        this.f45263a = m12662d(c15148a);
        this.f45265c = m12661c(c15148a);
        this.f45266d = m12660b(c15148a);
        this.f45267e = m12659a(c15148a);
    }
}
