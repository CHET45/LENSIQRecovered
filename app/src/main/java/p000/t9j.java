package p000;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class t9j extends AbstractC9724n8 {

    /* JADX INFO: renamed from: b */
    public final String f84061b;

    public t9j(String str, String str2) {
        this.f66632a = Preconditions.checkNotEmpty(str);
        this.f84061b = Preconditions.checkNotEmpty(str2);
    }

    @Override // p000.AbstractC9724n8
    public final String getPreviousEmail() {
        return this.f84061b;
    }
}
