package p000;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class u35 implements sjb {

    /* JADX INFO: renamed from: a */
    public final Class<?> f86717a;

    /* JADX INFO: renamed from: b */
    public final Enum[] f86718b;

    public u35(Class<?> cls) {
        this.f86717a = cls;
        this.f86718b = (Enum[]) cls.getEnumConstants();
    }

    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        try {
            lh8 lh8Var = hw3Var.f45134e;
            int i = lh8Var.f57601a;
            if (i == 2) {
                int iIntValue = lh8Var.intValue();
                lh8Var.nextToken(16);
                if (iIntValue >= 0) {
                    Object[] objArr = this.f86718b;
                    if (iIntValue <= objArr.length) {
                        return (T) objArr[iIntValue];
                    }
                }
                throw new jh8("parse enum " + this.f86717a.getName() + " error, value : " + iIntValue);
            }
            if (i == 4) {
                String strStringVal = lh8Var.stringVal();
                lh8Var.nextToken(16);
                if (strStringVal.length() == 0) {
                    return null;
                }
                return (T) Enum.valueOf(this.f86717a, strStringVal);
            }
            if (i == 8) {
                lh8Var.nextToken(16);
                return null;
            }
            throw new jh8("parse enum " + this.f86717a.getName() + " error, value : " + hw3Var.parse());
        } catch (jh8 e) {
            throw e;
        } catch (Exception e2) {
            throw new jh8(e2.getMessage(), e2);
        }
    }
}
