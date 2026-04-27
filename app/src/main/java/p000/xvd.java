package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class xvd {

    /* JADX INFO: renamed from: a */
    public static final String f99489a = "kotlin.jvm.functions.";

    public oo8 createKotlinClass(Class cls) {
        return new h12(cls);
    }

    public to8 function(m07 m07Var) {
        return m07Var;
    }

    public oo8 getOrCreateKotlinClass(Class cls) {
        return new h12(cls);
    }

    public so8 getOrCreateKotlinPackage(Class cls, String str) {
        return new qac(cls, str);
    }

    @jjf(version = "1.6")
    public mp8 mutableCollectionType(mp8 mp8Var) {
        gmh gmhVar = (gmh) mp8Var;
        return new gmh(mp8Var.getClassifier(), mp8Var.getArguments(), gmhVar.getPlatformTypeUpperBound$kotlin_stdlib(), gmhVar.getFlags$kotlin_stdlib() | 2);
    }

    public cp8 mutableProperty0(j6b j6bVar) {
        return j6bVar;
    }

    public dp8 mutableProperty1(l6b l6bVar) {
        return l6bVar;
    }

    public ep8 mutableProperty2(n6b n6bVar) {
        return n6bVar;
    }

    @jjf(version = "1.6")
    public mp8 nothingType(mp8 mp8Var) {
        gmh gmhVar = (gmh) mp8Var;
        return new gmh(mp8Var.getClassifier(), mp8Var.getArguments(), gmhVar.getPlatformTypeUpperBound$kotlin_stdlib(), gmhVar.getFlags$kotlin_stdlib() | 4);
    }

    @jjf(version = "1.6")
    public mp8 platformType(mp8 mp8Var, mp8 mp8Var2) {
        return new gmh(mp8Var.getClassifier(), mp8Var.getArguments(), mp8Var2, ((gmh) mp8Var).getFlags$kotlin_stdlib());
    }

    public ip8 property0(lgd lgdVar) {
        return lgdVar;
    }

    public jp8 property1(ngd ngdVar) {
        return ngdVar;
    }

    public kp8 property2(pgd pgdVar) {
        return pgdVar;
    }

    @jjf(version = "1.1")
    public String renderLambdaToString(tt8 tt8Var) {
        return renderLambdaToString((h07) tt8Var);
    }

    @jjf(version = "1.4")
    public void setUpperBounds(op8 op8Var, List<mp8> list) {
        ((wlh) op8Var).setUpperBounds(list);
    }

    @jjf(version = "1.4")
    public mp8 typeOf(ro8 ro8Var, List<pp8> list, boolean z) {
        return new gmh(ro8Var, list, z);
    }

    @jjf(version = "1.4")
    public op8 typeParameter(Object obj, String str, rp8 rp8Var, boolean z) {
        return new wlh(obj, str, rp8Var, z);
    }

    public oo8 createKotlinClass(Class cls, String str) {
        return new h12(cls);
    }

    public oo8 getOrCreateKotlinClass(Class cls, String str) {
        return new h12(cls);
    }

    @jjf(version = "1.3")
    public String renderLambdaToString(h07 h07Var) {
        String string = h07Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(f99489a) ? string.substring(21) : string;
    }
}
