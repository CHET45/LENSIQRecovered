package p000;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class xi8 implements sjb {

    /* JADX INFO: renamed from: a */
    public static final xi8 f98075a = new xi8();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        if (!(type instanceof GenericArrayType)) {
            return (T) hw3Var.parse(obj);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof TypeVariable) {
            genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
        }
        ArrayList arrayList = new ArrayList();
        hw3Var.parseArray(genericComponentType, arrayList);
        if (!(genericComponentType instanceof Class)) {
            return (T) arrayList.toArray();
        }
        T t = (T) ((Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size()));
        arrayList.toArray((Object[]) t);
        return t;
    }
}
