package p000;

import p000.AbstractC10131o1;
import p000.AbstractC15982z4;
import p000.z22;

/* JADX INFO: renamed from: o1 */
/* JADX INFO: loaded from: classes7.dex */
@dy1
@kyg
public abstract class AbstractC10131o1<S extends AbstractC10131o1<S>> extends AbstractC15982z4<S> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ boolean f66187c = false;

    public AbstractC10131o1(bu1 bu1Var, rn1 rn1Var) {
        super(bu1Var, rn1Var);
    }

    public static <T extends AbstractC15982z4<T>> T newStub(AbstractC15982z4.a<T> aVar, bu1 bu1Var) {
        return (T) newStub(aVar, bu1Var, rn1.f78745k);
    }

    public static <T extends AbstractC15982z4<T>> T newStub(AbstractC15982z4.a<T> aVar, bu1 bu1Var, rn1 rn1Var) {
        return (T) aVar.newStub(bu1Var, rn1Var.withOption(z22.f103704c, z22.EnumC15934g.FUTURE));
    }
}
