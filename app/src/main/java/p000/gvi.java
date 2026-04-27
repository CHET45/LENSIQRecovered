package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class gvi implements kvi {

    /* JADX INFO: renamed from: c */
    public static final Object f41517c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile kvi f41518a;

    /* JADX INFO: renamed from: b */
    public volatile Object f41519b = f41517c;

    private gvi(kvi kviVar) {
        this.f41518a = kviVar;
    }

    /* JADX INFO: renamed from: b */
    public static kvi m12006b(kvi kviVar) {
        return kviVar instanceof gvi ? kviVar : new gvi(kviVar);
    }

    @Override // p000.kvi
    /* JADX INFO: renamed from: a */
    public final Object mo6632a() {
        Object objMo6632a = this.f41519b;
        Object obj = f41517c;
        if (objMo6632a == obj) {
            synchronized (this) {
                try {
                    objMo6632a = this.f41519b;
                    if (objMo6632a == obj) {
                        objMo6632a = this.f41518a.mo6632a();
                        Object obj2 = this.f41519b;
                        if (obj2 != obj && obj2 != objMo6632a) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objMo6632a + ". This is likely due to a circular dependency.");
                        }
                        this.f41519b = objMo6632a;
                        this.f41518a = null;
                    }
                } finally {
                }
            }
        }
        return objMo6632a;
    }
}
