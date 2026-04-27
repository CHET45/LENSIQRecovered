package p000;

import com.blankj.utilcode.util.C2473f;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class yhc extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f101520a;

    /* JADX INFO: renamed from: b */
    public final int f101521b;

    public yhc(@hib String str, @hib Throwable th, boolean z, int i) {
        super(str, th);
        this.f101520a = z;
        this.f101521b = i;
    }

    public static yhc createForMalformedContainer(@hib String str, @hib Throwable th) {
        return new yhc(str, th, true, 1);
    }

    public static yhc createForMalformedDataOfUnknownType(@hib String str, @hib Throwable th) {
        return new yhc(str, th, true, 0);
    }

    public static yhc createForMalformedManifest(@hib String str, @hib Throwable th) {
        return new yhc(str, th, true, 4);
    }

    public static yhc createForManifestWithUnsupportedFeature(@hib String str, @hib Throwable th) {
        return new yhc(str, th, false, 4);
    }

    public static yhc createForUnsupportedContainerFeature(@hib String str) {
        return new yhc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        if (message != null) {
            str = message + C2473f.f17566z;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.f101520a);
        sb.append(", dataType=");
        sb.append(this.f101521b);
        sb.append("}");
        return sb.toString();
    }
}
