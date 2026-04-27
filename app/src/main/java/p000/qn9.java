package p000;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class qn9 {

    /* JADX INFO: renamed from: a */
    @hib
    public final ro9 f75001a;

    /* JADX INFO: renamed from: b */
    @hib
    public final qo9 f75002b;

    /* JADX INFO: renamed from: c */
    public final boolean f75003c;

    /* JADX INFO: renamed from: qn9$b */
    public static final class C11568b {

        /* JADX INFO: renamed from: a */
        @hib
        public ro9 f75004a;

        /* JADX INFO: renamed from: b */
        @hib
        public qo9 f75005b;

        /* JADX INFO: renamed from: c */
        public boolean f75006c = false;

        /* JADX INFO: renamed from: qn9$b$a */
        public class a implements qo9 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ File f75007a;

            public a(File file) {
                this.f75007a = file;
            }

            @Override // p000.qo9
            @efb
            public File getCacheDir() {
                if (this.f75007a.isDirectory()) {
                    return this.f75007a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* JADX INFO: renamed from: qn9$b$b */
        public class b implements qo9 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ qo9 f75009a;

            public b(qo9 qo9Var) {
                this.f75009a = qo9Var;
            }

            @Override // p000.qo9
            @efb
            public File getCacheDir() {
                File cacheDir = this.f75009a.getCacheDir();
                if (cacheDir.isDirectory()) {
                    return cacheDir;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @efb
        public qn9 build() {
            return new qn9(this.f75004a, this.f75005b, this.f75006c);
        }

        @efb
        public C11568b setEnableSystraceMarkers(boolean z) {
            this.f75006c = z;
            return this;
        }

        @efb
        public C11568b setNetworkCacheDir(@efb File file) {
            if (this.f75005b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f75005b = new a(file);
            return this;
        }

        @efb
        public C11568b setNetworkCacheProvider(@efb qo9 qo9Var) {
            if (this.f75005b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f75005b = new b(qo9Var);
            return this;
        }

        @efb
        public C11568b setNetworkFetcher(@efb ro9 ro9Var) {
            this.f75004a = ro9Var;
            return this;
        }
    }

    private qn9(@hib ro9 ro9Var, @hib qo9 qo9Var, boolean z) {
        this.f75001a = ro9Var;
        this.f75002b = qo9Var;
        this.f75003c = z;
    }
}
