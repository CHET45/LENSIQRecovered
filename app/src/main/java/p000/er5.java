package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class er5 {

    /* JADX INFO: renamed from: a */
    public final kr5 f33882a;

    /* JADX INFO: renamed from: b */
    public final Class<?> f33883b;

    public er5(Class<?> cls, kr5 kr5Var, int i) {
        this.f33883b = cls;
        this.f33882a = kr5Var;
    }

    public abstract void parseField(hw3 hw3Var, Object obj, Type type, Map<String, Object> map);

    public void setValue(Object obj, int i) throws IllegalAccessException {
        this.f33882a.f55106c.setInt(obj, i);
    }

    public void setValue(Object obj, long j) throws IllegalAccessException {
        this.f33882a.f55106c.setLong(obj, j);
    }

    public void setValue(Object obj, float f) throws IllegalAccessException {
        this.f33882a.f55106c.setFloat(obj, f);
    }

    public void setValue(Object obj, double d) throws IllegalAccessException {
        this.f33882a.f55106c.setDouble(obj, d);
    }

    public void setValue(Object obj, Object obj2) {
        if (obj2 == null && this.f33882a.f55110m.isPrimitive()) {
            return;
        }
        kr5 kr5Var = this.f33882a;
        Field field = kr5Var.f55106c;
        Method method = kr5Var.f55105b;
        try {
            if (kr5Var.f55107d) {
                if (kr5Var.f55098H) {
                    if (Map.class.isAssignableFrom(kr5Var.f55110m)) {
                        Map map = (Map) field.get(obj);
                        if (map != null) {
                            map.putAll((Map) obj2);
                            return;
                        }
                        return;
                    }
                    Collection collection = (Collection) field.get(obj);
                    if (collection != null) {
                        collection.addAll((Collection) obj2);
                        return;
                    }
                    return;
                }
                field.set(obj, obj2);
                return;
            }
            if (kr5Var.f55098H) {
                if (Map.class.isAssignableFrom(kr5Var.f55110m)) {
                    Map map2 = (Map) method.invoke(obj, null);
                    if (map2 != null) {
                        map2.putAll((Map) obj2);
                        return;
                    }
                    return;
                }
                Collection collection2 = (Collection) method.invoke(obj, null);
                if (collection2 != null) {
                    collection2.addAll((Collection) obj2);
                    return;
                }
                return;
            }
            method.invoke(obj, obj2);
        } catch (Exception e) {
            throw new jh8("set property error, " + this.f33882a.f55104a, e);
        }
    }
}
