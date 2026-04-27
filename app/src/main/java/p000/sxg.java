package p000;

import p000.e13;

/* JADX INFO: loaded from: classes7.dex */
public final class sxg {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public static final qhg f83208a = new qhg("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    @yfb
    public static final gz6<Object, e13.InterfaceC5040b, Object> f83209b = new gz6() { // from class: pxg
        @Override // p000.gz6
        public final Object invoke(Object obj, Object obj2) {
            return sxg.countAll$lambda$0(obj, (e13.InterfaceC5040b) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    @yfb
    public static final gz6<nxg<?>, e13.InterfaceC5040b, nxg<?>> f83210c = new gz6() { // from class: qxg
        @Override // p000.gz6
        public final Object invoke(Object obj, Object obj2) {
            return sxg.findOne$lambda$1((nxg) obj, (e13.InterfaceC5040b) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    @yfb
    public static final gz6<oyg, e13.InterfaceC5040b, oyg> f83211d = new gz6() { // from class: rxg
        @Override // p000.gz6
        public final Object invoke(Object obj, Object obj2) {
            return sxg.updateState$lambda$2((oyg) obj, (e13.InterfaceC5040b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, e13.InterfaceC5040b interfaceC5040b) {
        if (!(interfaceC5040b instanceof nxg)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? interfaceC5040b : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nxg<?> findOne$lambda$1(nxg<?> nxgVar, e13.InterfaceC5040b interfaceC5040b) {
        if (nxgVar != null) {
            return nxgVar;
        }
        if (interfaceC5040b instanceof nxg) {
            return (nxg) interfaceC5040b;
        }
        return null;
    }

    public static final void restoreThreadContext(@yfb e13 e13Var, @gib Object obj) {
        if (obj == f83208a) {
            return;
        }
        if (obj instanceof oyg) {
            ((oyg) obj).restore(e13Var);
            return;
        }
        Object objFold = e13Var.fold(null, f83210c);
        md8.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((nxg) objFold).restoreThreadContext(e13Var, obj);
    }

    @yfb
    public static final Object threadContextElements(@yfb e13 e13Var) {
        Object objFold = e13Var.fold(0, f83209b);
        md8.checkNotNull(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oyg updateState$lambda$2(oyg oygVar, e13.InterfaceC5040b interfaceC5040b) {
        if (interfaceC5040b instanceof nxg) {
            nxg<?> nxgVar = (nxg) interfaceC5040b;
            oygVar.append(nxgVar, nxgVar.updateThreadContext(oygVar.f69234a));
        }
        return oygVar;
    }

    @gib
    public static final Object updateThreadContext(@yfb e13 e13Var, @gib Object obj) {
        if (obj == null) {
            obj = threadContextElements(e13Var);
        }
        if (obj == 0) {
            return f83208a;
        }
        if (obj instanceof Integer) {
            return e13Var.fold(new oyg(e13Var, ((Number) obj).intValue()), f83211d);
        }
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((nxg) obj).updateThreadContext(e13Var);
    }
}
