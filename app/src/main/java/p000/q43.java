package p000;

import com.google.auto.value.AutoValue;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class q43 {
    @efb
    public static q43 create(z33 z33Var, String str, File file) {
        return new oj0(z33Var, str, file);
    }

    public abstract z33 getReport();

    public abstract File getReportFile();

    public abstract String getSessionId();
}
