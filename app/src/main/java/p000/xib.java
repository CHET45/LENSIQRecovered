package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class xib implements lkb, sjb {

    /* JADX INFO: renamed from: b */
    public static final xib f98087b = new xib();

    /* JADX INFO: renamed from: a */
    public DecimalFormat f98088a;

    private xib() {
        this.f98088a = null;
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [T, java.lang.Number, java.math.BigDecimal] */
    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 2) {
            if (type == Double.TYPE || type == Double.class) {
                String strNumberString = lh8Var.numberString();
                lh8Var.nextToken(16);
                return (T) Double.valueOf(Double.parseDouble(strNumberString));
            }
            if (type == Float.TYPE || type == Float.class) {
                String strNumberString2 = lh8Var.numberString();
                lh8Var.nextToken(16);
                return (T) Float.valueOf(Float.parseFloat(strNumberString2));
            }
            long jLongValue = lh8Var.longValue();
            lh8Var.nextToken(16);
            return (type == Short.TYPE || type == Short.class) ? (T) Short.valueOf((short) jLongValue) : (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf((byte) jLongValue) : (jLongValue < -2147483648L || jLongValue > 2147483647L) ? (T) Long.valueOf(jLongValue) : (T) Integer.valueOf((int) jLongValue);
        }
        if (i != 3) {
            Object obj2 = hw3Var.parse();
            if (obj2 == null) {
                return null;
            }
            return (type == Double.TYPE || type == Double.class) ? (T) qmh.castToDouble(obj2) : (type == Float.TYPE || type == Float.class) ? (T) qmh.castToFloat(obj2) : (type == Short.TYPE || type == Short.class) ? (T) qmh.castToShort(obj2) : (type == Byte.TYPE || type == Byte.class) ? (T) qmh.castToByte(obj2) : (T) qmh.castToBigDecimal(obj2);
        }
        if (type == Double.TYPE || type == Double.class) {
            String strNumberString3 = lh8Var.numberString();
            lh8Var.nextToken(16);
            return (T) Double.valueOf(Double.parseDouble(strNumberString3));
        }
        if (type == Float.TYPE || type == Float.class) {
            String strNumberString4 = lh8Var.numberString();
            lh8Var.nextToken(16);
            return (T) Float.valueOf(Float.parseFloat(strNumberString4));
        }
        ?? r8 = (T) lh8Var.decimalValue();
        lh8Var.nextToken(16);
        return (type == Short.TYPE || type == Short.class) ? (T) Short.valueOf(r8.shortValue()) : (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf(r8.byteValue()) : r8;
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        String string;
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
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (Float.isNaN(fFloatValue)) {
                i1fVar.writeNull();
                return;
            }
            if (Float.isInfinite(fFloatValue)) {
                i1fVar.writeNull();
                return;
            }
            String string2 = Float.toString(fFloatValue);
            if (string2.endsWith(".0")) {
                string2 = string2.substring(0, string2.length() - 2);
            }
            i1fVar.write(string2);
            if ((i1fVar.f45448c & a2f.WriteClassName.f216a) != 0) {
                i1fVar.write(70);
                return;
            }
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue)) {
            i1fVar.writeNull();
            return;
        }
        if (Double.isInfinite(dDoubleValue)) {
            i1fVar.writeNull();
            return;
        }
        DecimalFormat decimalFormat = this.f98088a;
        if (decimalFormat == null) {
            string = Double.toString(dDoubleValue);
            if (string.endsWith(".0")) {
                string = string.substring(0, string.length() - 2);
            }
        } else {
            string = decimalFormat.format(dDoubleValue);
        }
        i1fVar.append((CharSequence) string);
        if ((i1fVar.f45448c & a2f.WriteClassName.f216a) != 0) {
            i1fVar.write(68);
        }
    }

    public xib(DecimalFormat decimalFormat) {
        this.f98088a = decimalFormat;
    }

    public xib(String str) {
        this(new DecimalFormat(str));
    }
}
