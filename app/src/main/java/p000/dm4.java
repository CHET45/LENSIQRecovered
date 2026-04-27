package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class dm4 implements cm4 {

    /* JADX INFO: renamed from: a */
    @efb
    public final cm4[] f30039a;

    /* JADX INFO: renamed from: dm4$a */
    public static class C4858a {

        /* JADX INFO: renamed from: a */
        public List<cm4> f30040a = new ArrayList();

        public C4858a append(@hib cm4 cm4Var) {
            if (cm4Var != null && !this.f30040a.contains(cm4Var)) {
                this.f30040a.add(cm4Var);
            }
            return this;
        }

        public dm4 build() {
            List<cm4> list = this.f30040a;
            return new dm4((cm4[]) list.toArray(new cm4[list.size()]));
        }

        public boolean remove(cm4 cm4Var) {
            return this.f30040a.remove(cm4Var);
        }
    }

    public dm4(@efb cm4[] cm4VarArr) {
        this.f30039a = cm4VarArr;
    }

    @Override // p000.cm4
    public void connectEnd(@efb cn4 cn4Var, int i, int i2, @efb Map<String, List<String>> map) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.connectEnd(cn4Var, i, i2, map);
        }
    }

    @Override // p000.cm4
    public void connectStart(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.connectStart(cn4Var, i, map);
        }
    }

    @Override // p000.cm4
    public void connectTrialEnd(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.connectTrialEnd(cn4Var, i, map);
        }
    }

    @Override // p000.cm4
    public void connectTrialStart(@efb cn4 cn4Var, @efb Map<String, List<String>> map) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.connectTrialStart(cn4Var, map);
        }
    }

    public boolean contain(cm4 cm4Var) {
        for (cm4 cm4Var2 : this.f30039a) {
            if (cm4Var2 == cm4Var) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.cm4
    public void downloadFromBeginning(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.downloadFromBeginning(cn4Var, bd1Var, c8eVar);
        }
    }

    @Override // p000.cm4
    public void downloadFromBreakpoint(@efb cn4 cn4Var, @efb bd1 bd1Var) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.downloadFromBreakpoint(cn4Var, bd1Var);
        }
    }

    @Override // p000.cm4
    public void fetchEnd(@efb cn4 cn4Var, int i, long j) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.fetchEnd(cn4Var, i, j);
        }
    }

    @Override // p000.cm4
    public void fetchProgress(@efb cn4 cn4Var, int i, long j) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.fetchProgress(cn4Var, i, j);
        }
    }

    @Override // p000.cm4
    public void fetchStart(@efb cn4 cn4Var, int i, long j) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.fetchStart(cn4Var, i, j);
        }
    }

    public int indexOf(cm4 cm4Var) {
        int i = 0;
        while (true) {
            cm4[] cm4VarArr = this.f30039a;
            if (i >= cm4VarArr.length) {
                return -1;
            }
            if (cm4VarArr[i] == cm4Var) {
                return i;
            }
            i++;
        }
    }

    @Override // p000.cm4
    public void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.taskEnd(cn4Var, x15Var, exc);
        }
    }

    @Override // p000.cm4
    public void taskStart(@efb cn4 cn4Var) {
        for (cm4 cm4Var : this.f30039a) {
            cm4Var.taskStart(cn4Var);
        }
    }
}
