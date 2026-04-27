package p000;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public class xw5 extends rx5 {

    /* JADX INFO: renamed from: a */
    public final String f99559a;

    public xw5(@efb String str, @efb String str2) {
        super(str2);
        this.f99559a = Preconditions.checkNotEmpty(str);
    }

    @efb
    public String getErrorCode() {
        return this.f99559a;
    }
}
