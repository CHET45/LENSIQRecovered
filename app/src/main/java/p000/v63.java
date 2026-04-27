package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v63 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13882a f90049a = new C13882a(null);

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f90050b = "CredProviderFactory";

    /* JADX INFO: renamed from: c */
    public static final int f90051c = 33;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f90052d = "androidx.credentials.CREDENTIAL_PROVIDER_KEY";

    /* JADX INFO: renamed from: v63$a */
    public static final class C13882a {
        public /* synthetic */ C13882a(jt3 jt3Var) {
            this();
        }

        private final List<String> getAllowedProvidersFromManifest(Context context) throws PackageManager.NameNotFoundException {
            String string;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
            ArrayList arrayList = new ArrayList();
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                md8.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    Bundle bundle = serviceInfo.metaData;
                    if (bundle != null && (string = bundle.getString(v63.f90052d)) != null) {
                        arrayList.add(string);
                    }
                }
            }
            return v82.toList(arrayList);
        }

        private final u63 instantiatePreUProvider(List<String> list, Context context) {
            Iterator<String> it = list.iterator();
            u63 u63Var = null;
            while (it.hasNext()) {
                try {
                    Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                    md8.checkNotNull(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                    u63 u63Var2 = (u63) objNewInstance;
                    if (!u63Var2.isAvailableOnDevice()) {
                        continue;
                    } else {
                        if (u63Var != null) {
                            Log.i(v63.f90050b, "Only one active OEM CredentialProvider allowed");
                            return null;
                        }
                        u63Var = u63Var2;
                    }
                } catch (Throwable unused) {
                }
            }
            return u63Var;
        }

        private final u63 tryCreatePreUOemProvider(Context context) throws PackageManager.NameNotFoundException {
            List<String> allowedProvidersFromManifest = getAllowedProvidersFromManifest(context);
            if (allowedProvidersFromManifest.isEmpty()) {
                return null;
            }
            return instantiatePreUProvider(allowedProvidersFromManifest, context);
        }

        @gib
        public final u63 getBestAvailableProvider(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                return new c83(context);
            }
            if (i <= 33) {
                return tryCreatePreUOemProvider(context);
            }
            return null;
        }

        @c5e(34)
        @yfb
        public final u63 getUAndAboveProvider(@yfb Context context) {
            md8.checkNotNullParameter(context, "context");
            return new c83(context);
        }

        private C13882a() {
        }
    }
}
