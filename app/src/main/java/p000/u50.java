package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class u50 implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static final u50 f86828a = new u50();

    private u50() {
    }

    private <T> T toObjectArray(hw3 hw3Var, Class<?> cls, gh8 gh8Var) {
        if (gh8Var == null) {
            return null;
        }
        int size = gh8Var.size();
        T t = (T) Array.newInstance(cls, size);
        for (int i = 0; i < size; i++) {
            Object objCast = gh8Var.get(i);
            if (objCast == gh8Var) {
                Array.set(t, i, t);
            } else {
                if (!cls.isArray()) {
                    objCast = qmh.cast(objCast, (Class<Object>) cls, hw3Var.f45131b);
                } else if (!cls.isInstance(objCast)) {
                    objCast = toObjectArray(hw3Var, cls, (gh8) objCast);
                }
                Array.set(t, i, objCast);
            }
        }
        gh8Var.setRelatedArray(t);
        gh8Var.setComponentType(cls);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 8) {
            lh8Var.nextToken(16);
            return null;
        }
        if (type != char[].class) {
            if (i == 4) {
                T t = (T) lh8Var.bytesValue();
                lh8Var.nextToken(16);
                return t;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            gh8 gh8Var = new gh8();
            hw3Var.parseArray(componentType, gh8Var, obj);
            return (T) toObjectArray(hw3Var, componentType, gh8Var);
        }
        if (i == 4) {
            String strStringVal = lh8Var.stringVal();
            lh8Var.nextToken(16);
            return (T) strStringVal.toCharArray();
        }
        if (i != 2) {
            return (T) fh8.toJSONString(hw3Var.parse()).toCharArray();
        }
        Number numberIntegerValue = lh8Var.integerValue();
        lh8Var.nextToken(16);
        return (T) numberIntegerValue.toString().toCharArray();
    }

    @Override // p000.lkb
    public final void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((i1fVar.f45448c & a2f.WriteNullListAsEmpty.f216a) != 0) {
                i1fVar.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            i1fVar.append((CharSequence) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        e0f e0fVar = ph8Var.f70803m;
        int i2 = 0;
        ph8Var.setContext(e0fVar, obj, obj2, 0);
        try {
            i1fVar.write(91);
            if ((i1fVar.f45448c & a2f.PrettyFormat.f216a) != 0) {
                ph8Var.incrementIndent();
                ph8Var.println();
                while (i2 < length) {
                    if (i2 != 0) {
                        i1fVar.write(44);
                        ph8Var.println();
                    }
                    ph8Var.write(objArr[i2]);
                    i2++;
                }
                ph8Var.decrementIdent();
                ph8Var.println();
                i1fVar.write(93);
                ph8Var.f70803m = e0fVar;
                return;
            }
            Class<?> cls = null;
            lkb lkbVar = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    i1fVar.append((CharSequence) "null,");
                } else {
                    IdentityHashMap<Object, e0f> identityHashMap = ph8Var.f70802l;
                    if (identityHashMap == null || !identityHashMap.containsKey(obj3)) {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            lkbVar.write(ph8Var, obj3, null, null);
                        } else {
                            lkbVar = ph8Var.f70791a.get(cls2);
                            lkbVar.write(ph8Var, obj3, null, null);
                            cls = cls2;
                        }
                    } else {
                        ph8Var.writeReference(obj3);
                    }
                    i1fVar.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                i1fVar.append((CharSequence) "null]");
            } else {
                IdentityHashMap<Object, e0f> identityHashMap2 = ph8Var.f70802l;
                if (identityHashMap2 == null || !identityHashMap2.containsKey(obj4)) {
                    ph8Var.writeWithFieldName(obj4, Integer.valueOf(i));
                } else {
                    ph8Var.writeReference(obj4);
                }
                i1fVar.write(93);
            }
            ph8Var.f70803m = e0fVar;
        } catch (Throwable th) {
            ph8Var.f70803m = e0fVar;
            throw th;
        }
    }
}
