package p000;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public class uxf extends C15719ym {
    public uxf(rog rogVar) {
        super(rogVar);
    }

    @Override // p000.C15719ym
    /* JADX INFO: renamed from: b */
    public Collection<Field> mo23633b(mfc mfcVar) {
        Collection<Field> collectionMo23633b = super.mo23633b(mfcVar);
        String strValue = ((tx6) mfcVar.getAnnotation(tx6.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : collectionMo23633b) {
            if (Arrays.asList(((zg3) field.getAnnotation(zg3.class)).value()).contains(strValue)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    @Override // p000.C15719ym
    /* JADX INFO: renamed from: c */
    public Collection<ow6> mo23634c(mfc mfcVar) {
        Collection<ow6> collectionMo23634c = super.mo23634c(mfcVar);
        String strValue = ((tx6) mfcVar.getAnnotation(tx6.class)).value();
        ArrayList arrayList = new ArrayList();
        for (ow6 ow6Var : collectionMo23634c) {
            if (Arrays.asList(((zg3) ow6Var.getAnnotation(zg3.class)).value()).contains(strValue)) {
                arrayList.add(ow6Var);
            }
        }
        return arrayList;
    }

    @Override // p000.C15719ym
    /* JADX INFO: renamed from: d */
    public Collection<Field> mo23635d(mfc mfcVar) {
        Collection<Field> collectionMo23635d = super.mo23635d(mfcVar);
        String strValue = ((tx6) mfcVar.getAnnotation(tx6.class)).value();
        ArrayList arrayList = new ArrayList();
        for (Field field : collectionMo23635d) {
            if (Arrays.asList(((xg3) field.getAnnotation(xg3.class)).value()).contains(strValue)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    @Override // p000.C15719ym
    /* JADX INFO: renamed from: e */
    public Collection<ow6> mo23636e(mfc mfcVar) {
        Collection<ow6> collectionMo23636e = super.mo23636e(mfcVar);
        String strValue = ((tx6) mfcVar.getAnnotation(tx6.class)).value();
        ArrayList arrayList = new ArrayList();
        for (ow6 ow6Var : collectionMo23636e) {
            if (Arrays.asList(((xg3) ow6Var.getAnnotation(xg3.class)).value()).contains(strValue)) {
                arrayList.add(ow6Var);
            }
        }
        return arrayList;
    }
}
