package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import p000.ofc;

/* JADX INFO: loaded from: classes8.dex */
public class j61 extends i61 {

    /* JADX INFO: renamed from: g */
    public final Object[] f49596g;

    /* JADX INFO: renamed from: h */
    public final String f49597h;

    public j61(tpg tpgVar) throws o18 {
        super(tpgVar.getTestClass().getJavaClass());
        this.f49596g = tpgVar.getParameters().toArray(new Object[tpgVar.getParameters().size()]);
        this.f49597h = tpgVar.getName();
    }

    private Object createTestUsingConstructorInjection() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(this.f49596g);
    }

    private Object createTestUsingFieldInjection() throws Exception {
        List<tv6> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
        if (annotatedFieldsByParameter.size() != this.f49596g.length) {
            throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + annotatedFieldsByParameter.size() + ", available parameters: " + this.f49596g.length + ".");
        }
        Object objNewInstance = getTestClass().getJavaClass().newInstance();
        Iterator<tv6> it = annotatedFieldsByParameter.iterator();
        while (it.hasNext()) {
            Field field = it.next().getField();
            int iValue = ((ofc.InterfaceC10359a) field.getAnnotation(ofc.InterfaceC10359a.class)).value();
            try {
                field.set(objNewInstance, this.f49596g[iValue]);
            } catch (IllegalArgumentException e) {
                throw new Exception(getTestClass().getName() + ": Trying to set " + field.getName() + " with the value " + this.f49596g[iValue] + " that is not the right type (" + this.f49596g[iValue].getClass().getSimpleName() + " instead of " + field.getType().getSimpleName() + ").", e);
            }
        }
        return objNewInstance;
    }

    private boolean fieldsAreAnnotated() {
        return !getAnnotatedFieldsByParameter().isEmpty();
    }

    private List<tv6> getAnnotatedFieldsByParameter() {
        return getTestClass().getAnnotatedFields(ofc.InterfaceC10359a.class);
    }

    @Override // p000.i61
    /* JADX INFO: renamed from: A */
    public void mo12800A(List<Throwable> list) {
        super.mo12800A(list);
        if (fieldsAreAnnotated()) {
            List<tv6> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
            int size = annotatedFieldsByParameter.size();
            int[] iArr = new int[size];
            Iterator<tv6> it = annotatedFieldsByParameter.iterator();
            while (it.hasNext()) {
                int iValue = ((ofc.InterfaceC10359a) it.next().getField().getAnnotation(ofc.InterfaceC10359a.class)).value();
                if (iValue < 0 || iValue > annotatedFieldsByParameter.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + iValue + ". @Parameter fields counted: " + annotatedFieldsByParameter.size() + ". Please use an index between 0 and " + (annotatedFieldsByParameter.size() - 1) + "."));
                } else {
                    iArr[iValue] = iArr[iValue] + 1;
                }
            }
            for (int i = 0; i < size; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception("@Parameter(" + i + ") is never used."));
                } else if (i2 > 1) {
                    list.add(new Exception("@Parameter(" + i + ") is used more than once (" + i2 + ")."));
                }
            }
        }
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: c */
    public f3g mo9979c(bde bdeVar) {
        return m9978b(bdeVar);
    }

    @Override // p000.i61
    public Object createTest() throws Exception {
        return fieldsAreAnnotated() ? createTestUsingFieldInjection() : createTestUsingConstructorInjection();
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: i */
    public String mo9983i() {
        return this.f49597h;
    }

    @Override // p000.ehc
    /* JADX INFO: renamed from: j */
    public Annotation[] mo9984j() {
        return new Annotation[0];
    }

    @Override // p000.i61
    /* JADX INFO: renamed from: y */
    public String mo12817y(ow6 ow6Var) {
        return ow6Var.getName() + mo9983i();
    }

    @Override // p000.i61
    /* JADX INFO: renamed from: z */
    public void mo12818z(List<Throwable> list) {
        m12803D(list);
        if (fieldsAreAnnotated()) {
            m12805F(list);
        }
    }
}
