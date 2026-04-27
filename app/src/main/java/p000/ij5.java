package p000;

import android.content.Context;
import java.io.File;
import p000.le4;
import p000.qe4;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ij5 extends qe4 {

    /* JADX INFO: renamed from: ij5$a */
    public class C7314a implements qe4.InterfaceC11454c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f47162a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f47163b;

        public C7314a(Context context, String str) {
            this.f47162a = context;
            this.f47163b = str;
        }

        @Override // p000.qe4.InterfaceC11454c
        public File getCacheDirectory() {
            File externalCacheDir = this.f47162a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f47163b != null ? new File(externalCacheDir, this.f47163b) : externalCacheDir;
        }
    }

    public ij5(Context context) {
        this(context, "image_manager_disk_cache", le4.InterfaceC8783a.f57349a);
    }

    public ij5(Context context, int i) {
        this(context, "image_manager_disk_cache", i);
    }

    public ij5(Context context, String str, int i) {
        super(new C7314a(context, str), i);
    }
}
