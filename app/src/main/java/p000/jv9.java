package p000;

import java.io.IOException;
import p000.ev9;

/* JADX INFO: loaded from: classes3.dex */
public class jv9 {
    private jv9() {
    }

    /* JADX INFO: renamed from: a */
    public static ev9 m14352a(jm8 jm8Var, bn9 bn9Var) throws IOException {
        String strNextName;
        jm8Var.beginObject();
        ev9.EnumC5478a enumC5478a = null;
        C6011fx c6011fxM18176g = null;
        C16264zw c16264zwM18173d = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            strNextName = jm8Var.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "o":
                    c16264zwM18173d = C10098nx.m18173d(jm8Var, bn9Var);
                    break;
                case "pt":
                    c6011fxM18176g = C10098nx.m18176g(jm8Var, bn9Var);
                    break;
                case "inv":
                    zNextBoolean = jm8Var.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jm8Var.nextString();
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "a":
                            enumC5478a = ev9.EnumC5478a.MASK_MODE_ADD;
                            break;
                        case "i":
                            bn9Var.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            enumC5478a = ev9.EnumC5478a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            enumC5478a = ev9.EnumC5478a.MASK_MODE_NONE;
                            break;
                        case "s":
                            enumC5478a = ev9.EnumC5478a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            dj9.warning("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                            enumC5478a = ev9.EnumC5478a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jm8Var.skipValue();
                    break;
            }
        }
        jm8Var.endObject();
        return new ev9(enumC5478a, c6011fxM18176g, c16264zwM18173d, zNextBoolean);
    }
}
