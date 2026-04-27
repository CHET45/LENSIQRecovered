package p000;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class vvd {

    /* JADX INFO: renamed from: a */
    public static final xvd f92390a;

    /* JADX INFO: renamed from: b */
    public static final String f92391b = " (Kotlin reflection is not available)";

    /* JADX INFO: renamed from: c */
    public static final oo8[] f92392c;

    static {
        xvd xvdVar = null;
        try {
            xvdVar = (xvd) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xvdVar == null) {
            xvdVar = new xvd();
        }
        f92390a = xvdVar;
        f92392c = new oo8[0];
    }

    public static oo8 createKotlinClass(Class cls) {
        return f92390a.createKotlinClass(cls);
    }

    public static to8 function(m07 m07Var) {
        return f92390a.function(m07Var);
    }

    public static oo8 getOrCreateKotlinClass(Class cls) {
        return f92390a.getOrCreateKotlinClass(cls);
    }

    public static oo8[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f92392c;
        }
        oo8[] oo8VarArr = new oo8[length];
        for (int i = 0; i < length; i++) {
            oo8VarArr[i] = getOrCreateKotlinClass(clsArr[i]);
        }
        return oo8VarArr;
    }

    @jjf(version = "1.4")
    public static so8 getOrCreateKotlinPackage(Class cls) {
        return f92390a.getOrCreateKotlinPackage(cls, "");
    }

    @jjf(version = "1.6")
    public static mp8 mutableCollectionType(mp8 mp8Var) {
        return f92390a.mutableCollectionType(mp8Var);
    }

    public static cp8 mutableProperty0(j6b j6bVar) {
        return f92390a.mutableProperty0(j6bVar);
    }

    public static dp8 mutableProperty1(l6b l6bVar) {
        return f92390a.mutableProperty1(l6bVar);
    }

    public static ep8 mutableProperty2(n6b n6bVar) {
        return f92390a.mutableProperty2(n6bVar);
    }

    @jjf(version = "1.6")
    public static mp8 nothingType(mp8 mp8Var) {
        return f92390a.nothingType(mp8Var);
    }

    @jjf(version = "1.4")
    public static mp8 nullableTypeOf(ro8 ro8Var) {
        return f92390a.typeOf(ro8Var, Collections.emptyList(), true);
    }

    @jjf(version = "1.6")
    public static mp8 platformType(mp8 mp8Var, mp8 mp8Var2) {
        return f92390a.platformType(mp8Var, mp8Var2);
    }

    public static ip8 property0(lgd lgdVar) {
        return f92390a.property0(lgdVar);
    }

    public static jp8 property1(ngd ngdVar) {
        return f92390a.property1(ngdVar);
    }

    public static kp8 property2(pgd pgdVar) {
        return f92390a.property2(pgdVar);
    }

    @jjf(version = "1.1")
    public static String renderLambdaToString(tt8 tt8Var) {
        return f92390a.renderLambdaToString(tt8Var);
    }

    @jjf(version = "1.4")
    public static void setUpperBounds(op8 op8Var, mp8 mp8Var) {
        f92390a.setUpperBounds(op8Var, Collections.singletonList(mp8Var));
    }

    @jjf(version = "1.4")
    public static mp8 typeOf(ro8 ro8Var) {
        return f92390a.typeOf(ro8Var, Collections.emptyList(), false);
    }

    @jjf(version = "1.4")
    public static op8 typeParameter(Object obj, String str, rp8 rp8Var, boolean z) {
        return f92390a.typeParameter(obj, str, rp8Var, z);
    }

    public static oo8 createKotlinClass(Class cls, String str) {
        return f92390a.createKotlinClass(cls, str);
    }

    public static oo8 getOrCreateKotlinClass(Class cls, String str) {
        return f92390a.getOrCreateKotlinClass(cls, str);
    }

    public static so8 getOrCreateKotlinPackage(Class cls, String str) {
        return f92390a.getOrCreateKotlinPackage(cls, str);
    }

    @jjf(version = "1.4")
    public static mp8 nullableTypeOf(Class cls) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), true);
    }

    @jjf(version = "1.3")
    public static String renderLambdaToString(h07 h07Var) {
        return f92390a.renderLambdaToString(h07Var);
    }

    @jjf(version = "1.4")
    public static void setUpperBounds(op8 op8Var, mp8... mp8VarArr) {
        f92390a.setUpperBounds(op8Var, e80.toList(mp8VarArr));
    }

    @jjf(version = "1.4")
    public static mp8 typeOf(Class cls) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), false);
    }

    @jjf(version = "1.4")
    public static mp8 nullableTypeOf(Class cls, pp8 pp8Var) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(pp8Var), true);
    }

    @jjf(version = "1.4")
    public static mp8 typeOf(Class cls, pp8 pp8Var) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(pp8Var), false);
    }

    @jjf(version = "1.4")
    public static mp8 nullableTypeOf(Class cls, pp8 pp8Var, pp8 pp8Var2) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(pp8Var, pp8Var2), true);
    }

    @jjf(version = "1.4")
    public static mp8 typeOf(Class cls, pp8 pp8Var, pp8 pp8Var2) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(pp8Var, pp8Var2), false);
    }

    @jjf(version = "1.4")
    public static mp8 nullableTypeOf(Class cls, pp8... pp8VarArr) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), e80.toList(pp8VarArr), true);
    }

    @jjf(version = "1.4")
    public static mp8 typeOf(Class cls, pp8... pp8VarArr) {
        return f92390a.typeOf(getOrCreateKotlinClass(cls), e80.toList(pp8VarArr), false);
    }
}
