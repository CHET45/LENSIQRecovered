package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class xhc extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f97851a;

    /* JADX INFO: renamed from: b */
    public final int f97852b;

    public xhc(@hib String str, @hib Throwable th, boolean z, int i) {
        super(str, th);
        this.f97851a = z;
        this.f97852b = i;
    }

    public static xhc createForMalformedContainer(@hib String str, @hib Throwable th) {
        return new xhc(str, th, true, 1);
    }

    public static xhc createForMalformedDataOfUnknownType(@hib String str, @hib Throwable th) {
        return new xhc(str, th, true, 0);
    }

    public static xhc createForMalformedManifest(@hib String str, @hib Throwable th) {
        return new xhc(str, th, true, 4);
    }

    public static xhc createForManifestWithUnsupportedFeature(@hib String str, @hib Throwable th) {
        return new xhc(str, th, false, 4);
    }

    public static xhc createForUnsupportedContainerFeature(@hib String str) {
        return new xhc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @hib
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f97851a + ", dataType=" + this.f97852b + "}";
    }
}
