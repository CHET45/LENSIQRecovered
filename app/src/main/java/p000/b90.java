package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.v5d;

/* JADX INFO: loaded from: classes8.dex */
public class b90 {

    /* JADX INFO: renamed from: a */
    public final List<v5d> f13009a;

    /* JADX INFO: renamed from: b */
    public final List<mfc> f13010b;

    /* JADX INFO: renamed from: c */
    public final rog f13011c;

    private b90(List<v5d> list, List<mfc> list2, rog rogVar) {
        this.f13010b = list2;
        this.f13009a = list;
        this.f13011c = rogVar;
    }

    public static b90 allUnassigned(Method method, rog rogVar) {
        List<mfc> listSignatures = mfc.signatures(rogVar.getOnlyConstructor());
        listSignatures.addAll(mfc.signatures(method));
        return new b90(new ArrayList(), listSignatures, rogVar);
    }

    private nfc buildParameterSupplierFromClass(Class<? extends nfc> cls) throws Exception {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(rog.class)) {
                return (nfc) constructor.newInstance(this.f13011c);
            }
        }
        return cls.newInstance();
    }

    private List<v5d> generateAssignmentsFromTypeAlone(mfc mfcVar) {
        Class<?> type = mfcVar.getType();
        return type.isEnum() ? new h45(type).getValueSources(mfcVar) : (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) ? new db1().getValueSources(mfcVar) : Collections.emptyList();
    }

    private int getConstructorParameterCount() {
        return mfc.signatures(this.f13011c.getOnlyConstructor()).size();
    }

    private nfc getSupplier(mfc mfcVar) throws Exception {
        wfc wfcVar = (wfc) mfcVar.findDeepAnnotation(wfc.class);
        return wfcVar != null ? buildParameterSupplierFromClass(wfcVar.value()) : new C15719ym(this.f13011c);
    }

    public b90 assignNext(v5d v5dVar) {
        ArrayList arrayList = new ArrayList(this.f13009a);
        arrayList.add(v5dVar);
        List<mfc> list = this.f13010b;
        return new b90(arrayList, list.subList(1, list.size()), this.f13011c);
    }

    public Object[] getActualValues(int i, int i2) throws v5d.C13879b {
        Object[] objArr = new Object[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.f13009a.get(i3).getValue();
        }
        return objArr;
    }

    public Object[] getAllArguments() throws v5d.C13879b {
        return getActualValues(0, this.f13009a.size());
    }

    public Object[] getArgumentStrings(boolean z) throws v5d.C13879b {
        int size = this.f13009a.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.f13009a.get(i).getDescription();
        }
        return objArr;
    }

    public Object[] getConstructorArguments() throws v5d.C13879b {
        return getActualValues(0, getConstructorParameterCount());
    }

    public Object[] getMethodArguments() throws v5d.C13879b {
        return getActualValues(getConstructorParameterCount(), this.f13009a.size());
    }

    public boolean isComplete() {
        return this.f13010b.size() == 0;
    }

    public mfc nextUnassigned() {
        return this.f13010b.get(0);
    }

    public List<v5d> potentialsForNextUnassigned() throws Throwable {
        mfc mfcVarNextUnassigned = nextUnassigned();
        List<v5d> valueSources = getSupplier(mfcVarNextUnassigned).getValueSources(mfcVarNextUnassigned);
        return valueSources.size() == 0 ? generateAssignmentsFromTypeAlone(mfcVarNextUnassigned) : valueSources;
    }
}
