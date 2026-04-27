package p000;

import com.google.android.exoplayer2.scheduler.Requirements;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface toe {
    boolean cancel();

    Requirements getSupportedRequirements(Requirements requirements);

    boolean schedule(Requirements requirements, String str, String str2);
}
