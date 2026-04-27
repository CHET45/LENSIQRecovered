package p000;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class ss2 {

    /* JADX INFO: renamed from: a */
    public static final int f82736a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f82737b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f82738c = 3;

    /* JADX INFO: renamed from: ss2$a */
    @c5e(24)
    public static class C12763a {
        private C12763a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m22206a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* JADX INFO: renamed from: ss2$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC12764b {
    }

    private ss2() {
    }

    @hib
    @igg({"ReferencesDeprecated"})
    @j5e(it3.f48185b)
    public static NetworkInfo getNetworkInfoFromBroadcast(@efb ConnectivityManager connectivityManager, @efb Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int getRestrictBackgroundStatus(@efb ConnectivityManager connectivityManager) {
        return C12763a.m22206a(connectivityManager);
    }

    @j5e(it3.f48185b)
    public static boolean isActiveNetworkMetered(@efb ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
