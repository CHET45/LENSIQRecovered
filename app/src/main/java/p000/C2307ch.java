package p000;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: renamed from: ch */
/* JADX INFO: loaded from: classes3.dex */
public final class C2307ch {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C2307ch f16504a = new C2307ch();

    /* JADX INFO: renamed from: ch$a */
    @c5e(30)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final a f16505a = new a();

        private a() {
        }

        @ih4
        public final int getAdExtServicesVersionS() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: ch$b */
    @c5e(30)
    public static final class b {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final b f16506a = new b();

        private b() {
        }

        @ih4
        public final int getAdServicesVersion() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private C2307ch() {
    }

    public final int adServicesVersion() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f16506a.getAdServicesVersion();
        }
        return 0;
    }

    public final int extServicesVersionS() {
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            return a.f16505a.getAdExtServicesVersionS();
        }
        return 0;
    }
}
