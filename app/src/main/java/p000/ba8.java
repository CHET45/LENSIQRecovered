package p000;

import android.content.Context;
import java.io.File;
import p000.qe4;

/* JADX INFO: loaded from: classes3.dex */
public final class ba8 extends qe4 {

    /* JADX INFO: renamed from: ba8$a */
    public class C1805a implements qe4.InterfaceC11454c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f13157a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f13158b;

        public C1805a(Context context, String str) {
            this.f13157a = context;
            this.f13158b = str;
        }

        @Override // p000.qe4.InterfaceC11454c
        public File getCacheDirectory() {
            File cacheDir = this.f13157a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f13158b != null ? new File(cacheDir, this.f13158b) : cacheDir;
        }
    }

    public ba8(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public ba8(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public ba8(Context context, String str, long j) {
        super(new C1805a(context, str), j);
    }
}
