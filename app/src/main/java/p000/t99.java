package p000;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class t99 extends er5 {

    /* JADX INFO: renamed from: c */
    public final Type f84048c;

    /* JADX INFO: renamed from: d */
    public sjb f84049d;

    /* JADX INFO: renamed from: e */
    public final boolean f84050e;

    public t99(whc whcVar, Class<?> cls, kr5 kr5Var) {
        super(cls, kr5Var, 14);
        Type type = kr5Var.f55096C;
        Class<?> cls2 = kr5Var.f55110m;
        if (type instanceof ParameterizedType) {
            this.f84048c = ((ParameterizedType) type).getActualTypeArguments()[0];
            this.f84050e = false;
        } else if (cls2.isArray()) {
            this.f84048c = cls2.getComponentType();
            this.f84050e = true;
        } else {
            this.f84048c = Object.class;
            this.f84050e = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22432a(p000.hw3 r18, java.lang.reflect.Type r19, java.util.Collection r20) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.t99.m22432a(hw3, java.lang.reflect.Type, java.util.Collection):void");
    }

    @Override // p000.er5
    public void parseField(hw3 hw3Var, Object obj, Type type, Map<String, Object> map) {
        List arrayList;
        gh8 gh8Var;
        if (hw3Var.f45134e.f57601a == 8) {
            setValue(obj, (Object) null);
            hw3Var.f45134e.nextToken();
            return;
        }
        if (this.f84050e) {
            gh8 gh8Var2 = new gh8();
            gh8Var2.setComponentType(this.f84048c);
            gh8Var = gh8Var2;
            arrayList = gh8Var2;
        } else {
            arrayList = new ArrayList();
            gh8Var = null;
        }
        mhc mhcVar = hw3Var.f45135f;
        hw3Var.m12645f(mhcVar, obj, this.f33882a.f55104a);
        m22432a(hw3Var, type, arrayList);
        hw3Var.setContext(mhcVar);
        Object obj2 = arrayList;
        if (this.f84050e) {
            Object array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f84048c, arrayList.size()));
            gh8Var.setRelatedArray(array);
            obj2 = array;
        }
        if (obj == null) {
            map.put(this.f33882a.f55104a, obj2);
        } else {
            setValue(obj, obj2);
        }
    }
}
