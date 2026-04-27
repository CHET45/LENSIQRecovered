package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class cdd {

    /* JADX INFO: renamed from: a */
    public final ws5 f16298a = new ws5();

    public void completeProcessStream(@efb z2b z2bVar, @efb cn4 cn4Var) {
    }

    @efb
    public z2b createProcessStream(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb an4 an4Var) {
        return new z2b(cn4Var, bd1Var, an4Var);
    }

    public void discardProcess(@efb cn4 cn4Var) throws IOException {
        File file = cn4Var.getFile();
        if (file != null && file.exists() && !file.delete()) {
            throw new IOException("Delete file failed!");
        }
    }

    @efb
    public ws5 getFileLock() {
        return this.f16298a;
    }

    public boolean isPreAllocateLength(@efb cn4 cn4Var) {
        if (!e0c.with().outputStreamFactory().supportSeek()) {
            return false;
        }
        if (cn4Var.getSetPreAllocateLength() != null) {
            return cn4Var.getSetPreAllocateLength().booleanValue();
        }
        return true;
    }
}
