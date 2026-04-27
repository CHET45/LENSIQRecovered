package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class sx5 implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @efb
    public final Exception getException(@efb Status status) {
        return status.getStatusCode() == 8 ? new rx5(status.zza()) : new iw5(status.zza());
    }
}
