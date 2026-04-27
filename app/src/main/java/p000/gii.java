package p000;

import android.os.Build;
import android.util.Base64;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class gii {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C6332a f39918a = new C6332a(null);

    /* JADX INFO: renamed from: gii$a */
    public static final class C6332a {
        public /* synthetic */ C6332a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final String appInfoToOrigin(@yfb so1 so1Var) {
            md8.checkNotNullParameter(so1Var, ocd.f67211j);
            return Build.VERSION.SDK_INT >= 28 ? hii.f43776a.appInfoToOrigin(so1Var) : "";
        }

        @yfb
        public final byte[] b64Decode(@yfb String str) {
            md8.checkNotNullParameter(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            md8.checkNotNullExpressionValue(bArrDecode, "decode(str, Base64.NO_PA…_WRAP or Base64.URL_SAFE)");
            return bArrDecode;
        }

        @yfb
        public final String b64Encode(@yfb byte[] bArr) {
            md8.checkNotNullParameter(bArr, "data");
            String strEncodeToString = Base64.encodeToString(bArr, 11);
            md8.checkNotNullExpressionValue(strEncodeToString, "encodeToString(data, Bas…_WRAP or Base64.URL_SAFE)");
            return strEncodeToString;
        }

        private C6332a() {
        }
    }
}
