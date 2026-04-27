package p000;

import androidx.media3.exoplayer.scheduler.Requirements;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface xoe {
    boolean cancel();

    Requirements getSupportedRequirements(Requirements requirements);

    boolean schedule(Requirements requirements, String str, String str2);
}
