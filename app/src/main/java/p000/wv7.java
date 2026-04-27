package p000;

import android.text.TextUtils;
import com.arthenica.ffmpegkit.StreamInformation;
import java.util.Map;
import p000.jv7;
import p000.vv7;

/* JADX INFO: loaded from: classes7.dex */
public class wv7 implements jv7.InterfaceC8104a {

    /* JADX INFO: renamed from: a */
    public final h93 f95554a;

    public wv7(@efb h93 h93Var) {
        this.f95554a = h93Var;
    }

    @hib
    @fdi
    /* JADX INFO: renamed from: a */
    public vv7.C14273a m24841a(@hib String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        int i = length - 1;
        int i2 = i;
        while (i2 > -1) {
            if (Character.isDigit(str.charAt(i2))) {
                int i3 = i2 + 1;
                try {
                    return new vv7.C14273a(Float.parseFloat(str.substring(0, i3)), i2 == i ? null : str.substring(i3, length));
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            i2--;
        }
        return null;
    }

    @Override // p000.jv7.InterfaceC8104a
    public vv7 parse(@efb Map<String, String> map) {
        vv7.C14273a c14273aM24841a;
        vv7.C14273a c14273aM24841a2;
        String str = map.get("style");
        if (!TextUtils.isEmpty(str)) {
            c14273aM24841a = null;
            c14273aM24841a2 = null;
            for (i93 i93Var : this.f95554a.parse(str)) {
                String strKey = i93Var.key();
                if (StreamInformation.KEY_WIDTH.equals(strKey)) {
                    c14273aM24841a = m24841a(i93Var.value());
                } else if (StreamInformation.KEY_HEIGHT.equals(strKey)) {
                    c14273aM24841a2 = m24841a(i93Var.value());
                }
                if (c14273aM24841a != null && c14273aM24841a2 != null) {
                    break;
                }
            }
        } else {
            c14273aM24841a = null;
            c14273aM24841a2 = null;
        }
        if (c14273aM24841a != null && c14273aM24841a2 != null) {
            return new vv7(c14273aM24841a, c14273aM24841a2);
        }
        if (c14273aM24841a == null) {
            c14273aM24841a = m24841a(map.get(StreamInformation.KEY_WIDTH));
        }
        if (c14273aM24841a2 == null) {
            c14273aM24841a2 = m24841a(map.get(StreamInformation.KEY_HEIGHT));
        }
        if (c14273aM24841a == null && c14273aM24841a2 == null) {
            return null;
        }
        return new vv7(c14273aM24841a, c14273aM24841a2);
    }
}
