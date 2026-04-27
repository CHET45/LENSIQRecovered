package p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ofc extends dfg {

    /* JADX INFO: renamed from: h */
    public static final vfc f67511h = new k61();

    /* JADX INFO: renamed from: i */
    public static final List<tde> f67512i = Collections.emptyList();

    /* JADX INFO: renamed from: g */
    public final List<tde> f67513g;

    /* JADX INFO: renamed from: ofc$a */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC10359a {
        int value() default 0;
    }

    /* JADX INFO: renamed from: ofc$b */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC10360b {
        String name() default "{index}";
    }

    /* JADX INFO: renamed from: ofc$c */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC10361c {
        Class<? extends vfc> value() default k61.class;
    }

    public ofc(Class<?> cls) throws Throwable {
        super(cls, f67512i);
        this.f67513g = Collections.unmodifiableList(createRunnersForParameters(allParameters(), ((InterfaceC10360b) getParametersMethod().getAnnotation(InterfaceC10360b.class)).name(), getParametersRunnerFactory(cls)));
    }

    private Iterable<Object> allParameters() throws Exception {
        Object objInvokeExplosively = getParametersMethod().invokeExplosively(null, new Object[0]);
        if (objInvokeExplosively instanceof Iterable) {
            return (Iterable) objInvokeExplosively;
        }
        if (objInvokeExplosively instanceof Object[]) {
            return Arrays.asList((Object[]) objInvokeExplosively);
        }
        throw parametersMethodReturnedWrongType();
    }

    private List<tde> createRunnersForParameters(Iterable<Object> iterable, String str, vfc vfcVar) throws Exception {
        try {
            List<tpg> listCreateTestsForParameters = createTestsForParameters(iterable, str);
            ArrayList arrayList = new ArrayList();
            Iterator<tpg> it = listCreateTestsForParameters.iterator();
            while (it.hasNext()) {
                arrayList.add(vfcVar.createRunnerForTestWithParameters(it.next()));
            }
            return arrayList;
        } catch (ClassCastException unused) {
            throw parametersMethodReturnedWrongType();
        }
    }

    private tpg createTestWithNotNormalizedParameters(String str, int i, Object obj) {
        return createTestWithParameters(getTestClass(), str, i, obj instanceof Object[] ? (Object[]) obj : new Object[]{obj});
    }

    private static tpg createTestWithParameters(rog rogVar, String str, int i, Object[] objArr) {
        return new tpg("[" + MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i)), objArr) + "]", rogVar, Arrays.asList(objArr));
    }

    private List<tpg> createTestsForParameters(Iterable<Object> iterable, String str) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(createTestWithNotNormalizedParameters(str, i, it.next()));
            i++;
        }
        return arrayList;
    }

    private ow6 getParametersMethod() throws Exception {
        for (ow6 ow6Var : getTestClass().getAnnotatedMethods(InterfaceC10360b.class)) {
            if (ow6Var.isStatic() && ow6Var.isPublic()) {
                return ow6Var;
            }
        }
        throw new Exception("No public static parameters method on class " + getTestClass().getName());
    }

    private vfc getParametersRunnerFactory(Class<?> cls) throws IllegalAccessException, InstantiationException {
        InterfaceC10361c interfaceC10361c = (InterfaceC10361c) cls.getAnnotation(InterfaceC10361c.class);
        return interfaceC10361c == null ? f67511h : interfaceC10361c.value().newInstance();
    }

    private Exception parametersMethodReturnedWrongType() throws Exception {
        return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", getTestClass().getName(), getParametersMethod().getName()));
    }

    @Override // p000.dfg, p000.ehc
    /* JADX INFO: renamed from: h */
    public List<tde> mo9126h() {
        return this.f67513g;
    }
}
