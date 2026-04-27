package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nBeginCreateCustomCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCustomCredentialRequest.kt\nandroidx/credentials/provider/BeginCreateCustomCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public class my0 extends nx0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(@yfb String str, @yfb Bundle bundle, @gib so1 so1Var) {
        super(str, bundle, so1Var);
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
