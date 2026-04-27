package p000;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class r99 implements lkb {
    @Override // p000.lkb
    public final void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        int i = 1;
        boolean z = (i1fVar.f45448c & a2f.WriteClassName.f216a) != 0;
        Type type2 = (z && (type instanceof ParameterizedType)) ? ((ParameterizedType) type).getActualTypeArguments()[0] : null;
        if (obj == null) {
            if ((i1fVar.f45448c & a2f.WriteNullListAsEmpty.f216a) != 0) {
                i1fVar.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            i1fVar.append((CharSequence) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        e0f e0fVar = ph8Var.f70803m;
        if ((i1fVar.f45448c & a2f.DisableCircularReferenceDetect.f216a) == 0) {
            ph8Var.f70803m = new e0f(e0fVar, obj, obj2, 0);
            if (ph8Var.f70802l == null) {
                ph8Var.f70802l = new IdentityHashMap<>();
            }
            ph8Var.f70802l.put(obj, e0fVar);
        }
        try {
            if ((i1fVar.f45448c & a2f.PrettyFormat.f216a) != 0) {
                i1fVar.write(91);
                ph8Var.incrementIndent();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (i2 != 0) {
                        i1fVar.write(44);
                    }
                    ph8Var.println();
                    if (obj3 != null) {
                        IdentityHashMap<Object, e0f> identityHashMap = ph8Var.f70802l;
                        if (identityHashMap == null || !identityHashMap.containsKey(obj3)) {
                            lkb lkbVar = ph8Var.f70791a.get(obj3.getClass());
                            ph8Var.f70803m = new e0f(e0fVar, obj, obj2, 0);
                            lkbVar.write(ph8Var, obj3, Integer.valueOf(i2), type2);
                        } else {
                            ph8Var.writeReference(obj3);
                        }
                    } else {
                        ph8Var.f70792b.writeNull();
                    }
                }
                ph8Var.decrementIdent();
                ph8Var.println();
                i1fVar.write(93);
                ph8Var.f70803m = e0fVar;
                return;
            }
            int i3 = i1fVar.f45447b + 1;
            if (i3 > i1fVar.f45446a.length) {
                if (i1fVar.f45449d == null) {
                    i1fVar.m12716a(i3);
                } else {
                    i1fVar.flush();
                    i3 = 1;
                }
            }
            i1fVar.f45446a[i1fVar.f45447b] = C4584d2.f28242k;
            i1fVar.f45447b = i3;
            for (int i4 = 0; i4 < list.size(); i4++) {
                Object obj4 = list.get(i4);
                if (i4 != 0) {
                    int i5 = i1fVar.f45447b + 1;
                    if (i5 > i1fVar.f45446a.length) {
                        if (i1fVar.f45449d == null) {
                            i1fVar.m12716a(i5);
                        } else {
                            i1fVar.flush();
                            i5 = 1;
                        }
                    }
                    i1fVar.f45446a[i1fVar.f45447b] = C4584d2.f28238g;
                    i1fVar.f45447b = i5;
                }
                if (obj4 == null) {
                    i1fVar.append((CharSequence) "null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        i1fVar.writeInt(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long jLongValue = ((Long) obj4).longValue();
                        if (z) {
                            i1fVar.writeLong(jLongValue);
                            i1fVar.write(76);
                        } else {
                            i1fVar.writeLong(jLongValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((i1fVar.f45448c & a2f.UseSingleQuotes.f216a) != 0) {
                            i1fVar.m12718d(str);
                        } else {
                            i1fVar.m12717c(str, (char) 0, true);
                        }
                    } else {
                        if ((i1fVar.f45448c & a2f.DisableCircularReferenceDetect.f216a) == 0) {
                            ph8Var.f70803m = new e0f(e0fVar, obj, obj2, 0);
                        }
                        IdentityHashMap<Object, e0f> identityHashMap2 = ph8Var.f70802l;
                        if (identityHashMap2 == null || !identityHashMap2.containsKey(obj4)) {
                            ph8Var.f70791a.get(obj4.getClass()).write(ph8Var, obj4, Integer.valueOf(i4), type2);
                        } else {
                            ph8Var.writeReference(obj4);
                        }
                    }
                }
            }
            int i6 = i1fVar.f45447b + 1;
            if (i6 <= i1fVar.f45446a.length) {
                i = i6;
            } else if (i1fVar.f45449d == null) {
                i1fVar.m12716a(i6);
                i = i6;
            } else {
                i1fVar.flush();
            }
            i1fVar.f45446a[i1fVar.f45447b] = C4584d2.f28243l;
            i1fVar.f45447b = i;
            ph8Var.f70803m = e0fVar;
        } catch (Throwable th) {
            ph8Var.f70803m = e0fVar;
            throw th;
        }
    }
}
