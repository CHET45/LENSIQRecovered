package p000;

import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class qae {
    @efb
    public static qae create(@efb Set<nae> set) {
        return new ql0(set);
    }

    @efb
    public abstract Set<nae> getRolloutAssignments();
}
