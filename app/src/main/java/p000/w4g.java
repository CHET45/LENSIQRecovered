package p000;

import java.io.File;
import p000.cn4;

/* JADX INFO: loaded from: classes6.dex */
public class w4g {

    /* JADX INFO: renamed from: w4g$a */
    public enum EnumC14389a {
        PENDING,
        RUNNING,
        COMPLETED,
        IDLE,
        UNKNOWN
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static cn4 m24336a(@efb String str, @efb String str2, @hib String str3) {
        return new cn4.C2401a(str, str2, str3).build();
    }

    @hib
    public static bd1 getCurrentInfo(@efb String str, @efb String str2, @hib String str3) {
        return getCurrentInfo(m24336a(str, str2, str3));
    }

    public static EnumC14389a getStatus(@efb cn4 cn4Var) {
        EnumC14389a enumC14389aIsCompletedOrUnknown = isCompletedOrUnknown(cn4Var);
        EnumC14389a enumC14389a = EnumC14389a.COMPLETED;
        if (enumC14389aIsCompletedOrUnknown == enumC14389a) {
            return enumC14389a;
        }
        el4 el4VarDownloadDispatcher = e0c.with().downloadDispatcher();
        return el4VarDownloadDispatcher.isPending(cn4Var) ? EnumC14389a.PENDING : el4VarDownloadDispatcher.isRunning(cn4Var) ? EnumC14389a.RUNNING : enumC14389aIsCompletedOrUnknown;
    }

    public static boolean isCompleted(@efb cn4 cn4Var) {
        return isCompletedOrUnknown(cn4Var) == EnumC14389a.COMPLETED;
    }

    public static EnumC14389a isCompletedOrUnknown(@efb cn4 cn4Var) {
        gd1 gd1VarBreakpointStore = e0c.with().breakpointStore();
        bd1 bd1Var = gd1VarBreakpointStore.get(cn4Var.getId());
        String filename = cn4Var.getFilename();
        File parentFile = cn4Var.getParentFile();
        File file = cn4Var.getFile();
        if (bd1Var != null) {
            if (!bd1Var.isChunked() && bd1Var.getTotalLength() <= 0) {
                return EnumC14389a.UNKNOWN;
            }
            if (file != null && file.equals(bd1Var.getFile()) && file.exists() && bd1Var.getTotalOffset() == bd1Var.getTotalLength()) {
                return EnumC14389a.COMPLETED;
            }
            if (filename == null && bd1Var.getFile() != null && bd1Var.getFile().exists()) {
                return EnumC14389a.IDLE;
            }
            if (file != null && file.equals(bd1Var.getFile()) && file.exists()) {
                return EnumC14389a.IDLE;
            }
        } else {
            if (gd1VarBreakpointStore.isOnlyMemoryCache() || gd1VarBreakpointStore.isFileDirty(cn4Var.getId())) {
                return EnumC14389a.UNKNOWN;
            }
            if (file != null && file.exists()) {
                return EnumC14389a.COMPLETED;
            }
            String responseFilename = gd1VarBreakpointStore.getResponseFilename(cn4Var.getUrl());
            if (responseFilename != null && new File(parentFile, responseFilename).exists()) {
                return EnumC14389a.COMPLETED;
            }
        }
        return EnumC14389a.UNKNOWN;
    }

    public static boolean isSameTaskPendingOrRunning(@efb cn4 cn4Var) {
        return e0c.with().downloadDispatcher().findSameTask(cn4Var) != null;
    }

    @hib
    public static bd1 getCurrentInfo(@efb cn4 cn4Var) {
        gd1 gd1VarBreakpointStore = e0c.with().breakpointStore();
        bd1 bd1Var = gd1VarBreakpointStore.get(gd1VarBreakpointStore.findOrCreateId(cn4Var));
        if (bd1Var == null) {
            return null;
        }
        return bd1Var.copy();
    }

    public static boolean isCompleted(@efb String str, @efb String str2, @hib String str3) {
        return isCompleted(m24336a(str, str2, str3));
    }

    public static EnumC14389a getStatus(@efb String str, @efb String str2, @hib String str3) {
        return getStatus(m24336a(str, str2, str3));
    }
}
