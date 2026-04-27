package p000;

import android.content.Context;
import com.google.firebase.firestore.C3604g;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xj2 {

    /* JADX INFO: renamed from: a */
    public final C3604g f98155a;

    /* JADX INFO: renamed from: b */
    public hyd f98156b = new hyd();

    /* JADX INFO: renamed from: c */
    public jqc f98157c;

    /* JADX INFO: renamed from: d */
    public qe9 f98158d;

    /* JADX INFO: renamed from: e */
    public shg f98159e;

    /* JADX INFO: renamed from: f */
    public wyd f98160f;

    /* JADX INFO: renamed from: g */
    public j65 f98161g;

    /* JADX INFO: renamed from: h */
    @hib
    public a08 f98162h;

    /* JADX INFO: renamed from: i */
    @hib
    public uoe f98163i;

    /* JADX INFO: renamed from: xj2$a */
    public static final class C15148a {

        /* JADX INFO: renamed from: a */
        public final Context f98164a;

        /* JADX INFO: renamed from: b */
        public final ga0 f98165b;

        /* JADX INFO: renamed from: c */
        public final ri3 f98166c;

        /* JADX INFO: renamed from: d */
        public final syh f98167d;

        /* JADX INFO: renamed from: e */
        public final int f98168e;

        /* JADX INFO: renamed from: f */
        public final t83<syh> f98169f;

        /* JADX INFO: renamed from: g */
        public final t83<String> f98170g;

        /* JADX INFO: renamed from: h */
        @hib
        public final nc7 f98171h;

        public C15148a(Context context, ga0 ga0Var, ri3 ri3Var, syh syhVar, int i, t83<syh> t83Var, t83<String> t83Var2, @hib nc7 nc7Var) {
            this.f98164a = context;
            this.f98165b = ga0Var;
            this.f98166c = ri3Var;
            this.f98167d = syhVar;
            this.f98168e = i;
            this.f98169f = t83Var;
            this.f98170g = t83Var2;
            this.f98171h = nc7Var;
        }
    }

    public xj2(C3604g c3604g) {
        this.f98155a = c3604g;
    }

    @efb
    public static xj2 defaultFactory(@efb C3604g c3604g) {
        return c3604g.isPersistenceEnabled() ? new age(c3604g) : new jqa(c3604g);
    }

    /* JADX INFO: renamed from: a */
    public abstract j65 mo14237a(C15148a c15148a);

    /* JADX INFO: renamed from: b */
    public abstract uoe mo576b(C15148a c15148a);

    /* JADX INFO: renamed from: c */
    public abstract a08 mo577c(C15148a c15148a);

    /* JADX INFO: renamed from: d */
    public abstract qe9 mo14238d(C15148a c15148a);

    /* JADX INFO: renamed from: e */
    public abstract jqc mo578e(C15148a c15148a);

    /* JADX INFO: renamed from: f */
    public abstract wyd mo14239f(C15148a c15148a);

    /* JADX INFO: renamed from: g */
    public abstract shg mo14240g(C15148a c15148a);

    public zi3 getDatastore() {
        return this.f98156b.getDatastore();
    }

    public j65 getEventManager() {
        return (j65) r80.hardAssertNonNull(this.f98161g, "eventManager not initialized yet", new Object[0]);
    }

    @hib
    public uoe getGarbageCollectionScheduler() {
        return this.f98163i;
    }

    @hib
    public a08 getIndexBackfiller() {
        return this.f98162h;
    }

    public qe9 getLocalStore() {
        return (qe9) r80.hardAssertNonNull(this.f98158d, "localStore not initialized yet", new Object[0]);
    }

    public jqc getPersistence() {
        return (jqc) r80.hardAssertNonNull(this.f98157c, "persistence not initialized yet", new Object[0]);
    }

    public nyd getRemoteSerializer() {
        return this.f98156b.getRemoteSerializer();
    }

    public wyd getRemoteStore() {
        return (wyd) r80.hardAssertNonNull(this.f98160f, "remoteStore not initialized yet", new Object[0]);
    }

    public shg getSyncEngine() {
        return (shg) r80.hardAssertNonNull(this.f98159e, "syncEngine not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public us2 m25228h() {
        return this.f98156b.getConnectivityMonitor();
    }

    public void initialize(C15148a c15148a) {
        this.f98156b.initialize(c15148a);
        jqc jqcVarMo578e = mo578e(c15148a);
        this.f98157c = jqcVarMo578e;
        jqcVarMo578e.start();
        this.f98158d = mo14238d(c15148a);
        this.f98160f = mo14239f(c15148a);
        this.f98159e = mo14240g(c15148a);
        this.f98161g = mo14237a(c15148a);
        this.f98158d.start();
        this.f98160f.start();
        this.f98163i = mo576b(c15148a);
        this.f98162h = mo577c(c15148a);
    }

    @fdi
    public void setRemoteProvider(hyd hydVar) {
        r80.hardAssert(this.f98160f == null, "cannot set remoteProvider after initialize", new Object[0]);
        this.f98156b = hydVar;
    }
}
