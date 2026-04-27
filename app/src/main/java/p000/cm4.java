package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface cm4 {
    void connectEnd(@efb cn4 cn4Var, @h78(from = 0) int i, int i2, @efb Map<String, List<String>> map);

    void connectStart(@efb cn4 cn4Var, @h78(from = 0) int i, @efb Map<String, List<String>> map);

    void connectTrialEnd(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map);

    void connectTrialStart(@efb cn4 cn4Var, @efb Map<String, List<String>> map);

    void downloadFromBeginning(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar);

    void downloadFromBreakpoint(@efb cn4 cn4Var, @efb bd1 bd1Var);

    void fetchEnd(@efb cn4 cn4Var, @h78(from = 0) int i, @h78(from = 0) long j);

    void fetchProgress(@efb cn4 cn4Var, @h78(from = 0) int i, @h78(from = 0) long j);

    void fetchStart(@efb cn4 cn4Var, @h78(from = 0) int i, @h78(from = 0) long j);

    void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc);

    void taskStart(@efb cn4 cn4Var);
}
