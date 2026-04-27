package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class kt9 implements lkb {
    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        boolean z;
        Object objProcessKey;
        Object objProcessValue;
        i1f i1fVar = ph8Var.f70792b;
        if (obj == null) {
            i1fVar.writeNull();
            return;
        }
        Map treeMap = (Map) obj;
        Class<?> cls = treeMap.getClass();
        boolean z2 = (cls == mh8.class || cls == HashMap.class || cls == LinkedHashMap.class) && treeMap.containsKey(fh8.f36584c);
        if ((i1fVar.f45448c & a2f.SortField.f216a) != 0 && !(treeMap instanceof SortedMap) && !(treeMap instanceof LinkedHashMap)) {
            try {
                treeMap = new TreeMap(treeMap);
            } catch (Exception unused) {
            }
        }
        IdentityHashMap<Object, e0f> identityHashMap = ph8Var.f70802l;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            ph8Var.writeReference(obj);
            return;
        }
        e0f e0fVar = ph8Var.f70803m;
        ph8Var.setContext(e0fVar, obj, obj2, 0);
        try {
            i1fVar.write(123);
            ph8Var.incrementIndent();
            if ((i1fVar.f45448c & a2f.WriteClassName.f216a) == 0 || z2) {
                z = true;
            } else {
                i1fVar.writeFieldName(ph8Var.f70791a.f34714b, false);
                i1fVar.writeString(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            lkb lkbVar = null;
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                if (ph8Var.applyName(obj, key) && ph8Var.apply(obj, key, value) && ((objProcessValue = ph8.processValue(ph8Var, obj, (objProcessKey = ph8Var.processKey(obj, key, value)), value)) != null || (i1fVar.f45448c & a2f.WriteMapNullValue.f216a) != 0)) {
                    if (objProcessKey instanceof String) {
                        String str = (String) objProcessKey;
                        if (!z) {
                            i1fVar.write(44);
                        }
                        if ((i1fVar.f45448c & a2f.PrettyFormat.f216a) != 0) {
                            ph8Var.println();
                        }
                        i1fVar.writeFieldName(str, true);
                    } else {
                        if (!z) {
                            i1fVar.write(44);
                        }
                        int i = i1fVar.f45448c;
                        if ((a2f.BrowserCompatible.f216a & i) == 0 && (i & a2f.WriteNonStringKeyAsString.f216a) == 0) {
                            ph8Var.write(objProcessKey);
                        } else {
                            ph8Var.write(fh8.toJSONString(objProcessKey));
                        }
                        i1fVar.write(58);
                    }
                    if (objProcessValue == null) {
                        i1fVar.writeNull();
                    } else {
                        Class<?> cls3 = objProcessValue.getClass();
                        if (cls3 == cls2) {
                            lkbVar.write(ph8Var, objProcessValue, objProcessKey, null);
                        } else {
                            lkb lkbVar2 = ph8Var.f70791a.get(cls3);
                            lkbVar2.write(ph8Var, objProcessValue, objProcessKey, null);
                            lkbVar = lkbVar2;
                            cls2 = cls3;
                        }
                    }
                    z = false;
                }
            }
            ph8Var.f70803m = e0fVar;
            ph8Var.decrementIdent();
            if ((i1fVar.f45448c & a2f.PrettyFormat.f216a) != 0 && treeMap.size() > 0) {
                ph8Var.println();
            }
            i1fVar.write(125);
        } catch (Throwable th) {
            ph8Var.f70803m = e0fVar;
            throw th;
        }
    }
}
