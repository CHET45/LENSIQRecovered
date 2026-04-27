package p000;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p000.ymh;

/* JADX INFO: loaded from: classes5.dex */
public class b84 {

    /* JADX INFO: renamed from: c */
    public static final String f12950c = "Unity";

    /* JADX INFO: renamed from: d */
    public static final String f12951d = "Flutter";

    /* JADX INFO: renamed from: e */
    public static final String f12952e = "com.google.firebase.crashlytics.unity_version";

    /* JADX INFO: renamed from: f */
    public static final String f12953f = "flutter_assets/NOTICES.Z";

    /* JADX INFO: renamed from: a */
    public final Context f12954a;

    /* JADX INFO: renamed from: b */
    @hib
    public C1775b f12955b = null;

    /* JADX INFO: renamed from: b84$b */
    public class C1775b {

        /* JADX INFO: renamed from: a */
        @hib
        public final String f12956a;

        /* JADX INFO: renamed from: b */
        @hib
        public final String f12957b;

        private C1775b() {
            int resourcesIdentifier = lc2.getResourcesIdentifier(b84.this.f12954a, b84.f12952e, ymh.InterfaceC15723b.f102127e);
            if (resourcesIdentifier == 0) {
                if (!b84.this.assetFileExists(b84.f12953f)) {
                    this.f12956a = null;
                    this.f12957b = null;
                    return;
                } else {
                    this.f12956a = b84.f12951d;
                    this.f12957b = null;
                    ej9.getLogger().m10067v("Development platform is: Flutter");
                    return;
                }
            }
            this.f12956a = b84.f12950c;
            String string = b84.this.f12954a.getResources().getString(resourcesIdentifier);
            this.f12957b = string;
            ej9.getLogger().m10067v("Unity Editor version is: " + string);
        }
    }

    public b84(Context context) {
        this.f12954a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetFileExists(String str) {
        if (this.f12954a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f12954a.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private C1775b initDevelopmentPlatform() {
        if (this.f12955b == null) {
            this.f12955b = new C1775b();
        }
        return this.f12955b;
    }

    public static boolean isUnity(Context context) {
        return lc2.getResourcesIdentifier(context, f12952e, ymh.InterfaceC15723b.f102127e) != 0;
    }

    @hib
    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().f12956a;
    }

    @hib
    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().f12957b;
    }
}
