package p000;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.v5d;

/* JADX INFO: renamed from: ym */
/* JADX INFO: loaded from: classes8.dex */
public class C15719ym extends nfc {

    /* JADX INFO: renamed from: a */
    public final rog f102037a;

    /* JADX INFO: renamed from: ym$b */
    public static class b extends v5d {

        /* JADX INFO: renamed from: a */
        public final ow6 f102038a;

        @Override // p000.v5d
        public String getDescription() throws v5d.C13879b {
            return this.f102038a.getName();
        }

        @Override // p000.v5d
        public Object getValue() throws v5d.C13879b {
            try {
                return this.f102038a.invokeExplosively(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (Throwable th) {
                xg3 xg3Var = (xg3) this.f102038a.getAnnotation(xg3.class);
                f90.assumeTrue(xg3Var == null || !C15719ym.isAssignableToAnyOf(xg3Var.ignoredExceptions(), th));
                throw new v5d.C13879b(th);
            }
        }

        private b(ow6 ow6Var) {
            this.f102038a = ow6Var;
        }
    }

    public C15719ym(rog rogVar) {
        this.f102037a = rogVar;
    }

    private void addArrayValues(mfc mfcVar, String str, List<v5d> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (mfcVar.canAcceptValue(obj2)) {
                list.add(v5d.forValue(str + "[" + i + "]", obj2));
            }
        }
    }

    private void addDataPointsValues(Class<?> cls, mfc mfcVar, String str, List<v5d> list, Object obj) {
        if (cls.isArray()) {
            addArrayValues(mfcVar, str, list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            addIterableValues(mfcVar, str, list, (Iterable) obj);
        }
    }

    private void addIterableValues(mfc mfcVar, String str, List<v5d> list, Iterable<?> iterable) {
        int i = 0;
        for (Object obj : iterable) {
            if (mfcVar.canAcceptValue(obj)) {
                list.add(v5d.forValue(str + "[" + i + "]", obj));
            }
            i++;
        }
    }

    private void addMultiPointFields(mfc mfcVar, List<v5d> list) {
        for (Field field : mo23633b(mfcVar)) {
            addDataPointsValues(field.getType(), mfcVar, field.getName(), list, getStaticFieldValue(field));
        }
    }

    private void addMultiPointMethods(mfc mfcVar, List<v5d> list) throws Throwable {
        for (ow6 ow6Var : mo23634c(mfcVar)) {
            Class<?> returnType = ow6Var.getReturnType();
            if ((returnType.isArray() && mfcVar.canPotentiallyAcceptType(returnType.getComponentType())) || Iterable.class.isAssignableFrom(returnType)) {
                try {
                    addDataPointsValues(returnType, mfcVar, ow6Var.getName(), list, ow6Var.invokeExplosively(null, new Object[0]));
                } catch (Throwable th) {
                    zg3 zg3Var = (zg3) ow6Var.getAnnotation(zg3.class);
                    if (zg3Var == null || !isAssignableToAnyOf(zg3Var.ignoredExceptions(), th)) {
                        throw th;
                    }
                    return;
                }
            }
        }
    }

    private void addSinglePointFields(mfc mfcVar, List<v5d> list) {
        for (Field field : mo23635d(mfcVar)) {
            Object staticFieldValue = getStaticFieldValue(field);
            if (mfcVar.canAcceptValue(staticFieldValue)) {
                list.add(v5d.forValue(field.getName(), staticFieldValue));
            }
        }
    }

    private void addSinglePointMethods(mfc mfcVar, List<v5d> list) {
        for (ow6 ow6Var : mo23636e(mfcVar)) {
            if (mfcVar.canAcceptType(ow6Var.getType())) {
                list.add(new b(ow6Var));
            }
        }
    }

    private Object getStaticFieldValue(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        } catch (IllegalArgumentException unused2) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAssignableToAnyOf(Class<?>[] clsArr, Object obj) {
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public Collection<Field> mo23633b(mfc mfcVar) {
        List<tv6> annotatedFields = this.f102037a.getAnnotatedFields(zg3.class);
        ArrayList arrayList = new ArrayList();
        Iterator<tv6> it = annotatedFields.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getField());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public Collection<ow6> mo23634c(mfc mfcVar) {
        return this.f102037a.getAnnotatedMethods(zg3.class);
    }

    /* JADX INFO: renamed from: d */
    public Collection<Field> mo23635d(mfc mfcVar) {
        List<tv6> annotatedFields = this.f102037a.getAnnotatedFields(xg3.class);
        ArrayList arrayList = new ArrayList();
        Iterator<tv6> it = annotatedFields.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getField());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public Collection<ow6> mo23636e(mfc mfcVar) {
        return this.f102037a.getAnnotatedMethods(xg3.class);
    }

    @Override // p000.nfc
    public List<v5d> getValueSources(mfc mfcVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        addSinglePointFields(mfcVar, arrayList);
        addMultiPointFields(mfcVar, arrayList);
        addSinglePointMethods(mfcVar, arrayList);
        addMultiPointMethods(mfcVar, arrayList);
        return arrayList;
    }
}
