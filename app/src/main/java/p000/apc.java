package p000;

import android.content.pm.PermissionInfo;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class apc {

    /* JADX INFO: renamed from: apc$a */
    @c5e(28)
    public static class C1548a {
        private C1548a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m2526a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m2527b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* JADX INFO: renamed from: apc$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC1549b {
    }

    /* JADX INFO: renamed from: apc$c */
    @p7e({p7e.EnumC10826a.f69934a})
    @igg({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1550c {
    }

    private apc() {
    }

    @igg({"WrongConstant"})
    public static int getProtection(@efb PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C1548a.m2526a(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @igg({"WrongConstant"})
    public static int getProtectionFlags(@efb PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C1548a.m2527b(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}
