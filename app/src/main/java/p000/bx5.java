package p000;

import com.google.firebase.auth.MultiFactorResolver;

/* JADX INFO: loaded from: classes5.dex */
public class bx5 extends xw5 {

    /* JADX INFO: renamed from: b */
    public MultiFactorResolver f15127b;

    public bx5(@efb String str, @efb String str2, @efb MultiFactorResolver multiFactorResolver) {
        super(str, str2);
        this.f15127b = multiFactorResolver;
    }

    @efb
    public MultiFactorResolver getResolver() {
        return this.f15127b;
    }
}
