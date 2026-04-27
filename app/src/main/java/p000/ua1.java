package p000;

import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class ua1 implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static final ua1 f87249a = new ua1();

    private ua1() {
    }

    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 6) {
            lh8Var.nextToken(16);
            return (T) Boolean.TRUE;
        }
        if (i == 7) {
            lh8Var.nextToken(16);
            return (T) Boolean.FALSE;
        }
        if (i == 2) {
            int iIntValue = lh8Var.intValue();
            lh8Var.nextToken(16);
            return iIntValue == 1 ? (T) Boolean.TRUE : (T) Boolean.FALSE;
        }
        Object obj2 = hw3Var.parse();
        if (obj2 == null) {
            return null;
        }
        return (T) qmh.castToBoolean(obj2);
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((i1fVar.f45448c & a2f.WriteNullBooleanAsFalse.f216a) != 0) {
                i1fVar.write("false");
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        if (bool.booleanValue()) {
            i1fVar.write("true");
        } else {
            i1fVar.write("false");
        }
    }
}
