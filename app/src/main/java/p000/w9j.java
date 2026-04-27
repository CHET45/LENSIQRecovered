package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactorInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class w9j extends AbstractC10829p8 {

    /* JADX INFO: renamed from: b */
    public final MultiFactorInfo f93784b;

    public w9j(String str, MultiFactorInfo multiFactorInfo) {
        this.f66632a = Preconditions.checkNotEmpty(str);
        this.f93784b = (MultiFactorInfo) Preconditions.checkNotNull(multiFactorInfo);
    }

    @Override // p000.AbstractC10829p8
    public final MultiFactorInfo getMultiFactorInfo() {
        return this.f93784b;
    }
}
