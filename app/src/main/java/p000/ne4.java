package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ne4 {

    /* JADX INFO: renamed from: a */
    public static final ne4 f64117a = new C9811a();

    /* JADX INFO: renamed from: b */
    public static final ne4 f64118b = new C9812b();

    /* JADX INFO: renamed from: c */
    public static final ne4 f64119c = new C9813c();

    /* JADX INFO: renamed from: d */
    public static final ne4 f64120d = new C9814d();

    /* JADX INFO: renamed from: e */
    public static final ne4 f64121e = new C9815e();

    /* JADX INFO: renamed from: ne4$a */
    public class C9811a extends ne4 {
        @Override // p000.ne4
        public boolean decodeCachedData() {
            return true;
        }

        @Override // p000.ne4
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // p000.ne4
        public boolean isDataCacheable(hh3 hh3Var) {
            return hh3Var == hh3.REMOTE;
        }

        @Override // p000.ne4
        public boolean isResourceCacheable(boolean z, hh3 hh3Var, g15 g15Var) {
            return (hh3Var == hh3.RESOURCE_DISK_CACHE || hh3Var == hh3.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: ne4$b */
    public class C9812b extends ne4 {
        @Override // p000.ne4
        public boolean decodeCachedData() {
            return false;
        }

        @Override // p000.ne4
        public boolean decodeCachedResource() {
            return false;
        }

        @Override // p000.ne4
        public boolean isDataCacheable(hh3 hh3Var) {
            return false;
        }

        @Override // p000.ne4
        public boolean isResourceCacheable(boolean z, hh3 hh3Var, g15 g15Var) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ne4$c */
    public class C9813c extends ne4 {
        @Override // p000.ne4
        public boolean decodeCachedData() {
            return true;
        }

        @Override // p000.ne4
        public boolean decodeCachedResource() {
            return false;
        }

        @Override // p000.ne4
        public boolean isDataCacheable(hh3 hh3Var) {
            return (hh3Var == hh3.DATA_DISK_CACHE || hh3Var == hh3.MEMORY_CACHE) ? false : true;
        }

        @Override // p000.ne4
        public boolean isResourceCacheable(boolean z, hh3 hh3Var, g15 g15Var) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ne4$d */
    public class C9814d extends ne4 {
        @Override // p000.ne4
        public boolean decodeCachedData() {
            return false;
        }

        @Override // p000.ne4
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // p000.ne4
        public boolean isDataCacheable(hh3 hh3Var) {
            return false;
        }

        @Override // p000.ne4
        public boolean isResourceCacheable(boolean z, hh3 hh3Var, g15 g15Var) {
            return (hh3Var == hh3.RESOURCE_DISK_CACHE || hh3Var == hh3.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: ne4$e */
    public class C9815e extends ne4 {
        @Override // p000.ne4
        public boolean decodeCachedData() {
            return true;
        }

        @Override // p000.ne4
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // p000.ne4
        public boolean isDataCacheable(hh3 hh3Var) {
            return hh3Var == hh3.REMOTE;
        }

        @Override // p000.ne4
        public boolean isResourceCacheable(boolean z, hh3 hh3Var, g15 g15Var) {
            return ((z && hh3Var == hh3.DATA_DISK_CACHE) || hh3Var == hh3.LOCAL) && g15Var == g15.TRANSFORMED;
        }
    }

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(hh3 hh3Var);

    public abstract boolean isResourceCacheable(boolean z, hh3 hh3Var, g15 g15Var);
}
