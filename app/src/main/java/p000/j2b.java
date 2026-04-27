package p000;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j2b {
    @efb
    public abstract Task<Void> enroll(@efb k2b k2bVar, @hib String str);

    @efb
    public abstract List<MultiFactorInfo> getEnrolledFactors();

    @efb
    public abstract Task<MultiFactorSession> getSession();

    @efb
    public abstract Task<Void> unenroll(@efb MultiFactorInfo multiFactorInfo);

    @efb
    public abstract Task<Void> unenroll(@efb String str);
}
