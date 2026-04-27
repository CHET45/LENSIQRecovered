package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.AppOpsManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class aoc {

    /* JADX INFO: renamed from: a */
    public static final int f11456a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f11457b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f11458c = -2;

    /* JADX INFO: renamed from: aoc$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC1527a {
    }

    private aoc() {
    }

    public static int checkCallingOrSelfPermission(@efb Context context, @efb String str) {
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int checkCallingPermission(@efb Context context, @efb String str, @hib String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int checkPermission(@efb Context context, @efb String str, int i, int i2, @hib String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i2 || !pkb.equals(context.getPackageName(), str2)) ? AppOpsManagerCompat.noteProxyOpNoThrow(context, strPermissionToOp, str2) : AppOpsManagerCompat.checkOrNoteProxyOp(context, i2, strPermissionToOp, str2)) == 0 ? 0 : -2;
    }

    public static int checkSelfPermission(@efb Context context, @efb String str) {
        return checkPermission(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
