package p000;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p5e extends er5 {

    /* JADX INFO: renamed from: c */
    public final int f69737c;

    /* JADX INFO: renamed from: d */
    public final List f69738d;

    /* JADX INFO: renamed from: e */
    public final hw3 f69739e;

    /* JADX INFO: renamed from: f */
    public final Object f69740f;

    /* JADX INFO: renamed from: g */
    public final Map f69741g;

    /* JADX INFO: renamed from: h */
    public final Collection f69742h;

    public p5e(hw3 hw3Var, List list, int i) {
        super(null, null, 0);
        this.f69739e = hw3Var;
        this.f69737c = i;
        this.f69738d = list;
        this.f69740f = null;
        this.f69741g = null;
        this.f69742h = null;
    }

    @Override // p000.er5
    public void parseField(hw3 hw3Var, Object obj, Type type, Map<String, Object> map) {
    }

    @Override // p000.er5
    public void setValue(Object obj, Object obj2) {
        gh8 gh8Var;
        Object relatedArray;
        Map map = this.f69741g;
        if (map != null) {
            map.put(this.f69740f, obj2);
            return;
        }
        Collection collection = this.f69742h;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        this.f69738d.set(this.f69737c, obj2);
        List list = this.f69738d;
        if (!(list instanceof gh8) || (relatedArray = (gh8Var = (gh8) list).getRelatedArray()) == null || Array.getLength(relatedArray) <= this.f69737c) {
            return;
        }
        if (gh8Var.getComponentType() != null) {
            obj2 = qmh.cast(obj2, gh8Var.getComponentType(), this.f69739e.f45131b);
        }
        Array.set(relatedArray, this.f69737c, obj2);
    }

    public p5e(Map map, Object obj) {
        super(null, null, 0);
        this.f69739e = null;
        this.f69737c = -1;
        this.f69738d = null;
        this.f69740f = obj;
        this.f69741g = map;
        this.f69742h = null;
    }

    public p5e(Collection collection) {
        super(null, null, 0);
        this.f69739e = null;
        this.f69737c = -1;
        this.f69738d = null;
        this.f69740f = null;
        this.f69741g = null;
        this.f69742h = collection;
    }
}
