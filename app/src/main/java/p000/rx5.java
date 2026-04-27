package p000;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public class rx5 extends Exception {
    @Deprecated
    public rx5() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx5(@efb String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx5(@efb String str, @efb Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
