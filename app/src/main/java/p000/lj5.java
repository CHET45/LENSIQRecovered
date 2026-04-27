package p000;

import android.content.Context;
import java.io.File;
import p000.qe4;

/* JADX INFO: loaded from: classes3.dex */
public final class lj5 extends qe4 {

    /* JADX INFO: renamed from: lj5$a */
    public class C8834a implements qe4.InterfaceC11454c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f57730a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f57731b;

        public C8834a(Context context, String str) {
            this.f57730a = context;
            this.f57731b = str;
        }

        @hib
        private File getInternalCacheDirectory() {
            File cacheDir = this.f57730a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f57731b != null ? new File(cacheDir, this.f57731b) : cacheDir;
        }

        @Override // p000.qe4.InterfaceC11454c
        public File getCacheDirectory() {
            File externalCacheDir;
            File internalCacheDirectory = getInternalCacheDirectory();
            return ((internalCacheDirectory == null || !internalCacheDirectory.exists()) && (externalCacheDir = this.f57730a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? this.f57731b != null ? new File(externalCacheDir, this.f57731b) : externalCacheDir : internalCacheDirectory;
        }
    }

    public lj5(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public lj5(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public lj5(Context context, String str, long j) {
        super(new C8834a(context, str), j);
    }
}
