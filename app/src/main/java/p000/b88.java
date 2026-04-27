package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class b88 implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static b88 f12963a = new b88();

    private b88() {
    }

    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        T t;
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 8) {
            lh8Var.nextToken(16);
            return null;
        }
        if (i == 2) {
            if (type == Long.TYPE || type == Long.class) {
                t = (T) Long.valueOf(lh8Var.longValue());
            } else {
                try {
                    t = (T) Integer.valueOf(lh8Var.intValue());
                } catch (NumberFormatException e) {
                    throw new jh8("int value overflow, field : " + obj, e);
                }
            }
            lh8Var.nextToken(16);
            return t;
        }
        if (i == 3) {
            BigDecimal bigDecimalDecimalValue = lh8Var.decimalValue();
            lh8Var.nextToken(16);
            return (type == Long.TYPE || type == Long.class) ? (T) Long.valueOf(bigDecimalDecimalValue.longValue()) : (T) Integer.valueOf(bigDecimalDecimalValue.intValue());
        }
        T t2 = (T) hw3Var.parse();
        try {
            t2 = (type == Long.TYPE || type == Long.class) ? (T) qmh.castToLong(t2) : (T) qmh.castToInt(t2);
            return t2;
        } catch (Exception e2) {
            throw new jh8("cast error, field : " + obj + ", value " + t2, e2);
        }
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        Number number = (Number) obj;
        if (number == null) {
            if ((i1fVar.f45448c & a2f.WriteNullNumberAsZero.f216a) != 0) {
                i1fVar.write(48);
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        if (obj instanceof Long) {
            i1fVar.writeLong(number.longValue());
        } else {
            i1fVar.writeInt(number.intValue());
        }
        if ((i1fVar.f45448c & a2f.WriteClassName.f216a) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                i1fVar.write(66);
                return;
            }
            if (cls == Short.class) {
                i1fVar.write(83);
                return;
            }
            if (cls == Long.class) {
                long jLongValue = number.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class) {
                    return;
                }
                i1fVar.write(76);
            }
        }
    }
}
