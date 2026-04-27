package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class q11 implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static final q11 f72739a = new q11();

    private q11() {
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.math.BigDecimal] */
    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 2) {
            String strNumberString = lh8Var.numberString();
            lh8Var.nextToken(16);
            return type == BigInteger.class ? (T) new BigInteger(strNumberString) : (T) new BigDecimal(strNumberString);
        }
        if (i == 3) {
            ?? r5 = (T) lh8Var.decimalValue();
            lh8Var.nextToken(16);
            return type == BigInteger.class ? (T) r5.toBigInteger() : r5;
        }
        Object obj2 = hw3Var.parse();
        if (obj2 == null) {
            return null;
        }
        return type == BigInteger.class ? (T) qmh.castToBigInteger(obj2) : (T) qmh.castToBigDecimal(obj2);
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        if (obj == null) {
            if ((i1fVar.f45448c & a2f.WriteNullNumberAsZero.f216a) != 0) {
                i1fVar.write(48);
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        if (obj instanceof BigInteger) {
            i1fVar.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        i1fVar.write(bigDecimal.toString());
        if ((i1fVar.f45448c & a2f.WriteClassName.f216a) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        i1fVar.write(46);
    }
}
