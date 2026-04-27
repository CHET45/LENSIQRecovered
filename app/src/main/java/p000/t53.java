package p000;

import android.os.Bundle;
import p000.p53;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCustomCredentialRequest.kt\nandroidx/credentials/CreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public class t53 extends p53 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public t53(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @yfb p53.C10798b c10798b) {
        this(str, bundle, bundle2, z, c10798b, false, null, false, 224, null);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "credentialData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(c10798b, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public t53(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @yfb p53.C10798b c10798b, boolean z2) {
        this(str, bundle, bundle2, z, c10798b, z2, null, false, 192, null);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "credentialData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(c10798b, "displayInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public t53(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @yfb p53.C10798b c10798b, boolean z2, @gib String str2) {
        this(str, bundle, bundle2, z, c10798b, z2, str2, false, 128, null);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "credentialData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(c10798b, "displayInfo");
    }

    public /* synthetic */ t53(String str, Bundle bundle, Bundle bundle2, boolean z, p53.C10798b c10798b, boolean z2, String str2, boolean z3, int i, jt3 jt3Var) {
        this(str, bundle, bundle2, z, c10798b, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public t53(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @yfb p53.C10798b c10798b, boolean z2, @gib String str2, boolean z3) {
        super(str, bundle, bundle2, z, z2, c10798b, str2, z3);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "credentialData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(c10798b, "displayInfo");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
