package p000;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public class t72 implements lkb, sjb {

    /* JADX INFO: renamed from: a */
    public static final t72 f83919a = new t72();

    private t72() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, gh8, java.util.Collection] */
    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        Collection collection;
        Type type2 = null;
        if (hw3Var.f45134e.token() == 8) {
            hw3Var.f45134e.nextToken(16);
            return null;
        }
        if (type == gh8.class) {
            ?? r8 = (T) new gh8();
            hw3Var.parseArray((Collection) r8);
            return r8;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (!(rawType instanceof ParameterizedType)) {
                throw new jh8("TODO");
            }
            rawType = ((ParameterizedType) rawType).getRawType();
        }
        Class cls = (Class) rawType;
        Type type3 = Object.class;
        if (cls == AbstractCollection.class || cls == Collection.class) {
            collection = (T) new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            collection = (T) new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            collection = (T) new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            collection = (T) new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            collection = (T) new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            collection = (T) EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : type3));
        } else {
            try {
                collection = (T) ((Collection) cls.newInstance());
            } catch (Exception unused) {
                throw new jh8("create instane error, class " + cls.getName());
            }
        }
        if (type instanceof ParameterizedType) {
            type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (!cls2.getName().startsWith("java.")) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    if (genericSuperclass instanceof ParameterizedType) {
                        type2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                    }
                }
            }
            if (type2 != null) {
                type3 = type2;
            }
        }
        hw3Var.parseArray(type3, collection, obj);
        return (T) collection;
    }

    @Override // p000.lkb
    public void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        if (obj == null) {
            if ((i1fVar.f45448c & a2f.WriteNullListAsEmpty.f216a) != 0) {
                i1fVar.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        int i = i1fVar.f45448c;
        a2f a2fVar = a2f.WriteClassName;
        int i2 = 0;
        Type type2 = ((i & a2fVar.f216a) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
        Collection collection = (Collection) obj;
        e0f e0fVar = ph8Var.f70803m;
        ph8Var.setContext(e0fVar, obj, obj2, 0);
        if ((i1fVar.f45448c & a2fVar.f216a) != 0) {
            if (HashSet.class == collection.getClass()) {
                i1fVar.append((CharSequence) "Set");
            } else if (TreeSet.class == collection.getClass()) {
                i1fVar.append((CharSequence) "TreeSet");
            }
        }
        try {
            i1fVar.write(91);
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    i1fVar.write(44);
                }
                if (obj3 == null) {
                    i1fVar.writeNull();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        i1fVar.writeInt(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        i1fVar.writeLong(((Long) obj3).longValue());
                        if ((i1fVar.f45448c & a2f.WriteClassName.f216a) != 0) {
                            i1fVar.write(76);
                        }
                    } else {
                        ph8Var.f70791a.get(cls).write(ph8Var, obj3, Integer.valueOf(i2), type2);
                    }
                }
                i2 = i3;
            }
            i1fVar.write(93);
            ph8Var.f70803m = e0fVar;
        } catch (Throwable th) {
            ph8Var.f70803m = e0fVar;
            throw th;
        }
    }
}
