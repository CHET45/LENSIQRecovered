package p000;

import java.lang.management.ManagementFactory;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class vd4 implements fpg {

    /* JADX INFO: renamed from: a */
    public final fpg f90733a;

    /* JADX INFO: renamed from: b */
    public final boolean f90734b;

    public vd4(fpg fpgVar) {
        this(fpgVar, ManagementFactory.getRuntimeMXBean().getInputArguments());
    }

    private static boolean isDebugging(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str) || str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        return this.f90734b ? f3gVar : this.f90733a.apply(f3gVar, j74Var);
    }

    public vd4(fpg fpgVar, List<String> list) {
        this.f90733a = fpgVar;
        this.f90734b = isDebugging(list);
    }

    public boolean isDebugging() {
        return this.f90734b;
    }
}
