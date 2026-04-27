package p000;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fh8 implements qh8, hh8 {

    /* JADX INFO: renamed from: c */
    public static final String f36584c = "@type";

    /* JADX INFO: renamed from: m */
    public static final String f36588m = "1.1.55";

    /* JADX INFO: renamed from: a */
    public static TimeZone f36582a = TimeZone.getDefault();

    /* JADX INFO: renamed from: b */
    public static Locale f36583b = Locale.getDefault();

    /* JADX INFO: renamed from: d */
    public static int f36585d = ((((((rp5.AutoCloseSource.f78973a | rp5.InternFieldNames.f78973a) | rp5.UseBigDecimal.f78973a) | rp5.AllowUnQuotedFieldNames.f78973a) | rp5.AllowSingleQuotes.f78973a) | rp5.AllowArbitraryCommas.f78973a) | rp5.SortFeidFastMatch.f78973a) | rp5.IgnoreNotMatch.f78973a;

    /* JADX INFO: renamed from: e */
    public static String f36586e = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: f */
    public static int f36587f = ((a2f.QuoteFieldNames.f216a | a2f.SkipTransientField.f216a) | a2f.WriteEnumUsingToString.f216a) | a2f.SortField.f216a;

    public static final Object parse(String str) {
        return parse(str, f36585d);
    }

    public static final gh8 parseArray(String str) {
        gh8 gh8Var = null;
        if (str == null) {
            return null;
        }
        hw3 hw3Var = new hw3(str, whc.f94265e);
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 8) {
            lh8Var.nextToken();
        } else if (i != 20) {
            gh8Var = new gh8();
            hw3Var.parseArray(gh8Var);
            hw3Var.handleResovleTask(gh8Var);
        }
        hw3Var.close();
        return gh8Var;
    }

    public static final mh8 parseObject(String str, rp5... rp5VarArr) {
        return (mh8) parse(str, rp5VarArr);
    }

    public static final Object toJSON(Object obj) {
        return toJSON(obj, f1f.f34712d);
    }

    public static final byte[] toJSONBytes(Object obj, a2f... a2fVarArr) {
        i1f i1fVar = new i1f(null, f36587f, a2fVarArr);
        try {
            new ph8(i1fVar, f1f.f34712d).write(obj);
            return i1fVar.toBytes("UTF-8");
        } finally {
            i1fVar.close();
        }
    }

    public static final String toJSONString(Object obj) {
        return toJSONString(obj, f1f.f34712d, null, null, f36587f, new a2f[0]);
    }

    public static final String toJSONStringWithDateFormat(Object obj, String str, a2f... a2fVarArr) {
        return toJSONString(obj, f1f.f34712d, null, str, f36587f, a2fVarArr);
    }

    public static final String toJSONStringZ(Object obj, f1f f1fVar, a2f... a2fVarArr) {
        return toJSONString(obj, f1f.f34712d, null, null, 0, a2fVarArr);
    }

    public static final <T> T toJavaObject(fh8 fh8Var, Class<T> cls) {
        return (T) qmh.cast((Object) fh8Var, (Class) cls, whc.f94265e);
    }

    public static final void writeJSONStringTo(Object obj, Writer writer, a2f... a2fVarArr) {
        i1f i1fVar = new i1f(writer, f36587f, a2fVarArr);
        try {
            new ph8(i1fVar, f1f.f34712d).write(obj);
        } finally {
            i1fVar.close();
        }
    }

    public String toString() {
        return toJSONString();
    }

    @Override // p000.qh8
    public void writeJSONString(Appendable appendable) {
        i1f i1fVar = new i1f(null, f36587f, a2f.f212e2);
        try {
            try {
                new ph8(i1fVar, f1f.f34712d).write(this);
                appendable.append(i1fVar.toString());
            } catch (IOException e) {
                throw new jh8(e.getMessage(), e);
            }
        } finally {
            i1fVar.close();
        }
    }

    public static final Object parse(String str, int i) {
        if (str == null) {
            return null;
        }
        hw3 hw3Var = new hw3(str, whc.f94265e, i);
        Object obj = hw3Var.parse(null);
        hw3Var.handleResovleTask(obj);
        hw3Var.close();
        return obj;
    }

    public static final mh8 parseObject(String str) {
        Object obj = parse(str);
        return obj instanceof mh8 ? (mh8) obj : (mh8) toJSON(obj);
    }

    @Deprecated
    public static final Object toJSON(Object obj, whc whcVar) {
        return toJSON(obj, f1f.f34712d);
    }

    public static final String toJSONString(Object obj, a2f... a2fVarArr) {
        return toJSONString(obj, f36587f, a2fVarArr);
    }

    public <T> T toJavaObject(Class<T> cls) {
        return (T) qmh.cast((Object) this, (Class) cls, whc.getGlobalInstance());
    }

    public static Object toJSON(Object obj, f1f f1fVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof fh8) {
            return (fh8) obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            mh8 mh8Var = new mh8(map.size());
            for (Map.Entry entry : map.entrySet()) {
                mh8Var.put(qmh.castToString(entry.getKey()), toJSON(entry.getValue()));
            }
            return mh8Var;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            gh8 gh8Var = new gh8(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                gh8Var.add(toJSON(it.next()));
            }
            return gh8Var;
        }
        Class<?> cls = obj.getClass();
        if (cls.isEnum()) {
            return ((Enum) obj).name();
        }
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            gh8 gh8Var2 = new gh8(length);
            for (int i = 0; i < length; i++) {
                gh8Var2.add(toJSON(Array.get(obj, i)));
            }
            return gh8Var2;
        }
        if (whc.isPrimitive(cls)) {
            return obj;
        }
        lkb lkbVar = f1fVar.get(cls);
        if (!(lkbVar instanceof pi8)) {
            return null;
        }
        pi8 pi8Var = (pi8) lkbVar;
        mh8 mh8Var2 = new mh8();
        try {
            for (Map.Entry<String, Object> entry2 : pi8Var.getFieldValuesMap(obj).entrySet()) {
                mh8Var2.put(entry2.getKey(), toJSON(entry2.getValue()));
            }
            return mh8Var2;
        } catch (Exception e) {
            throw new jh8("toJSON error", e);
        }
    }

    public static final String toJSONString(Object obj, int i, a2f... a2fVarArr) {
        return toJSONString(obj, f1f.f34712d, null, null, i, a2fVarArr);
    }

    public static final String toJSONString(Object obj, g1f g1fVar, a2f... a2fVarArr) {
        return toJSONString(obj, f1f.f34712d, new g1f[]{g1fVar}, null, f36587f, a2fVarArr);
    }

    public static final String toJSONString(Object obj, g1f[] g1fVarArr, a2f... a2fVarArr) {
        return toJSONString(obj, f1f.f34712d, g1fVarArr, null, f36587f, a2fVarArr);
    }

    public static final Object parse(byte[] bArr, rp5... rp5VarArr) {
        try {
            return parseObject(new String(bArr, "UTF-8"), rp5VarArr);
        } catch (UnsupportedEncodingException unused) {
            throw new jh8("UTF-8 not support");
        }
    }

    public static final <T> T parseObject(String str, hmh<T> hmhVar, rp5... rp5VarArr) {
        return (T) parseObject(str, hmhVar.f44148a, whc.f94265e, f36585d, rp5VarArr);
    }

    public static final byte[] toJSONBytes(Object obj, f1f f1fVar, a2f... a2fVarArr) {
        i1f i1fVar = new i1f(null, f36587f, a2fVarArr);
        try {
            new ph8(i1fVar, f1fVar).write(obj);
            return i1fVar.toBytes("UTF-8");
        } finally {
            i1fVar.close();
        }
    }

    public static final String toJSONString(Object obj, f1f f1fVar, a2f... a2fVarArr) {
        return toJSONString(obj, f1fVar, null, null, f36587f, a2fVarArr);
    }

    public static final <T> T parseObject(String str, Class<T> cls, rp5... rp5VarArr) {
        return (T) parseObject(str, cls, whc.f94265e, f36585d, rp5VarArr);
    }

    public static final String toJSONString(Object obj, f1f f1fVar, g1f g1fVar, a2f... a2fVarArr) {
        return toJSONString(obj, f1fVar, new g1f[]{g1fVar}, null, f36587f, a2fVarArr);
    }

    public static final Object parse(String str, rp5... rp5VarArr) {
        int i = f36585d;
        for (rp5 rp5Var : rp5VarArr) {
            i |= rp5Var.f78973a;
        }
        return parse(str, i);
    }

    public static final <T> T parseObject(String str, Class<T> cls, rhc rhcVar, rp5... rp5VarArr) {
        return (T) parseObject(str, cls, whc.f94265e, rhcVar, f36585d, rp5VarArr);
    }

    public static final String toJSONString(Object obj, f1f f1fVar, g1f[] g1fVarArr, a2f... a2fVarArr) {
        return toJSONString(obj, f1fVar, g1fVarArr, null, f36587f, a2fVarArr);
    }

    public static final <T> List<T> parseArray(String str, Class<T> cls) {
        ArrayList arrayList = null;
        if (str == null) {
            return null;
        }
        hw3 hw3Var = new hw3(str, whc.f94265e);
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.token();
        if (i == 8) {
            lh8Var.nextToken();
        } else if (i != 20 || !lh8Var.isBlankInput()) {
            arrayList = new ArrayList();
            hw3Var.parseArray((Class<?>) cls, (Collection) arrayList);
            hw3Var.handleResovleTask(arrayList);
        }
        hw3Var.close();
        return arrayList;
    }

    public static final <T> T parseObject(String str, Type type, rp5... rp5VarArr) {
        return (T) parseObject(str, type, whc.f94265e, f36585d, rp5VarArr);
    }

    public static final String toJSONString(Object obj, boolean z) {
        if (!z) {
            return toJSONString(obj);
        }
        return toJSONString(obj, a2f.PrettyFormat);
    }

    public static final <T> T parseObject(String str, Type type, rhc rhcVar, rp5... rp5VarArr) {
        return (T) parseObject(str, type, whc.f94265e, rhcVar, f36585d, rp5VarArr);
    }

    public static final <T> T parseObject(String str, Type type, int i, rp5... rp5VarArr) {
        if (str == null) {
            return null;
        }
        for (rp5 rp5Var : rp5VarArr) {
            i |= rp5Var.f78973a;
        }
        hw3 hw3Var = new hw3(str, whc.f94265e, i);
        T t = (T) hw3Var.parseObject(type);
        hw3Var.handleResovleTask(t);
        hw3Var.close();
        return t;
    }

    @Override // p000.hh8
    public String toJSONString() {
        i1f i1fVar = new i1f(null, f36587f, a2f.f212e2);
        try {
            new ph8(i1fVar, f1f.f34712d).write(this);
            return i1fVar.toString();
        } finally {
            i1fVar.close();
        }
    }

    public static String toJSONString(Object obj, f1f f1fVar, g1f[] g1fVarArr, String str, int i, a2f... a2fVarArr) {
        i1f i1fVar = new i1f(null, i, a2fVarArr);
        try {
            ph8 ph8Var = new ph8(i1fVar, f1fVar);
            for (a2f a2fVar : a2fVarArr) {
                ph8Var.config(a2fVar, true);
            }
            if (str != null && str.length() != 0) {
                ph8Var.setDateFormat(str);
                ph8Var.config(a2f.WriteDateUseDateFormat, true);
            }
            if (g1fVarArr != null) {
                for (g1f g1fVar : g1fVarArr) {
                    if (g1fVar != null) {
                        if (g1fVar instanceof kgd) {
                            ph8Var.getPropertyPreFilters().add((kgd) g1fVar);
                        }
                        if (g1fVar instanceof p8b) {
                            ph8Var.getNameFilters().add((p8b) g1fVar);
                        }
                        if (g1fVar instanceof i2i) {
                            ph8Var.getValueFilters().add((i2i) g1fVar);
                        }
                        if (g1fVar instanceof cgd) {
                            ph8Var.getPropertyFilters().add((cgd) g1fVar);
                        }
                        if (g1fVar instanceof mx0) {
                            ph8Var.getBeforeFilters().add((mx0) g1fVar);
                        }
                        if (g1fVar instanceof AbstractC5848fj) {
                            ph8Var.getAfterFilters().add((AbstractC5848fj) g1fVar);
                        }
                    }
                }
            }
            ph8Var.write(obj);
            String string = i1fVar.toString();
            i1fVar.close();
            return string;
        } catch (Throwable th) {
            i1fVar.close();
            throw th;
        }
    }

    public static final <T> T parseObject(String str, Type type, whc whcVar, int i, rp5... rp5VarArr) {
        return (T) parseObject(str, type, whcVar, null, i, rp5VarArr);
    }

    public static final List<Object> parseArray(String str, Type[] typeArr) {
        if (str == null) {
            return null;
        }
        hw3 hw3Var = new hw3(str, whc.f94265e);
        Object[] array = hw3Var.parseArray(typeArr);
        List<Object> listAsList = array != null ? Arrays.asList(array) : null;
        hw3Var.handleResovleTask(listAsList);
        hw3Var.close();
        return listAsList;
    }

    public static final <T> T parseObject(String str, Type type, whc whcVar, rhc rhcVar, int i, rp5... rp5VarArr) {
        if (str == null) {
            return null;
        }
        for (rp5 rp5Var : rp5VarArr) {
            i |= rp5Var.f78973a;
        }
        hw3 hw3Var = new hw3(str, whcVar, i);
        if (rhcVar instanceof wj5) {
            hw3Var.getExtraTypeProviders().add((wj5) rhcVar);
        }
        if (rhcVar instanceof uj5) {
            hw3Var.getExtraProcessors().add((uj5) rhcVar);
        }
        if (rhcVar instanceof es5) {
            hw3Var.f45129N = (es5) rhcVar;
        }
        T t = (T) hw3Var.parseObject(type);
        hw3Var.handleResovleTask(t);
        hw3Var.close();
        return t;
    }

    public static final <T> T parseObject(byte[] bArr, Type type, rp5... rp5VarArr) {
        try {
            return (T) parseObject(new String(bArr, "UTF-8"), type, rp5VarArr);
        } catch (UnsupportedEncodingException unused) {
            throw new jh8("UTF-8 not support");
        }
    }

    public static final <T> T parseObject(char[] cArr, int i, Type type, rp5... rp5VarArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        int i2 = f36585d;
        for (rp5 rp5Var : rp5VarArr) {
            i2 |= rp5Var.f78973a;
        }
        hw3 hw3Var = new hw3(cArr, i, whc.f94265e, i2);
        T t = (T) hw3Var.parseObject(type);
        hw3Var.handleResovleTask(t);
        hw3Var.close();
        return t;
    }

    public static final <T> T parseObject(String str, Class<T> cls) {
        return (T) parseObject(str, (Class) cls, new rp5[0]);
    }
}
