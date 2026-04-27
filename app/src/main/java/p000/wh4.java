package p000;

import java.io.IOException;
import p000.jm8;
import p000.vh4;

/* JADX INFO: loaded from: classes3.dex */
public class wh4 implements r2i<vh4> {

    /* JADX INFO: renamed from: a */
    public static final wh4 f94251a = new wh4();

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f94252b = jm8.C7981a.m14177of("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private wh4() {
    }

    @Override // p000.r2i
    public vh4 parse(jm8 jm8Var, float f) throws IOException {
        vh4.EnumC14073a enumC14073a = vh4.EnumC14073a.CENTER;
        jm8Var.beginObject();
        vh4.EnumC14073a enumC14073a2 = enumC14073a;
        String strNextString = null;
        String strNextString2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iM26894a = 0;
        int iM26894a2 = 0;
        boolean zNextBoolean = true;
        while (jm8Var.hasNext()) {
            switch (jm8Var.selectName(f94252b)) {
                case 0:
                    strNextString = jm8Var.nextString();
                    break;
                case 1:
                    strNextString2 = jm8Var.nextString();
                    break;
                case 2:
                    fNextDouble = (float) jm8Var.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = jm8Var.nextInt();
                    enumC14073a2 = vh4.EnumC14073a.CENTER;
                    if (iNextInt2 <= enumC14073a2.ordinal() && iNextInt2 >= 0) {
                        enumC14073a2 = vh4.EnumC14073a.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = jm8Var.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) jm8Var.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) jm8Var.nextDouble();
                    break;
                case 7:
                    iM26894a = zm8.m26894a(jm8Var);
                    break;
                case 8:
                    iM26894a2 = zm8.m26894a(jm8Var);
                    break;
                case 9:
                    fNextDouble4 = (float) jm8Var.nextDouble();
                    break;
                case 10:
                    zNextBoolean = jm8Var.nextBoolean();
                    break;
                default:
                    jm8Var.skipName();
                    jm8Var.skipValue();
                    break;
            }
        }
        jm8Var.endObject();
        return new vh4(strNextString, strNextString2, fNextDouble, enumC14073a2, iNextInt, fNextDouble2, fNextDouble3, iM26894a, iM26894a2, fNextDouble4, zNextBoolean);
    }
}
