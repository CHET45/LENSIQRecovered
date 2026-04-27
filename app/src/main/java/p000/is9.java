package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.hw3;

/* JADX INFO: loaded from: classes3.dex */
public class is9 implements sjb {

    /* JADX INFO: renamed from: a */
    public static is9 f48123a = new is9();

    /* JADX WARN: Code restructure failed: missing block: B:76:0x015f, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map parseMap(p000.hw3 r10, java.util.Map<java.lang.String, java.lang.Object> r11, java.lang.reflect.Type r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.is9.parseMap(hw3, java.util.Map, java.lang.reflect.Type, java.lang.Object):java.util.Map");
    }

    /* JADX INFO: renamed from: a */
    public Map<?, ?> m13363a(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == mh8.class) {
            return new mh8();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : m13363a(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new jh8("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new jh8("unsupport type " + type, e);
        }
    }

    @Override // p000.sjb
    public <T> T deserialze(hw3 hw3Var, Type type, Object obj) {
        if (type == mh8.class && hw3Var.f45129N == null) {
            return (T) hw3Var.parseObject();
        }
        lh8 lh8Var = hw3Var.f45134e;
        if (lh8Var.f57601a == 8) {
            lh8Var.nextToken(16);
            return null;
        }
        Map<?, ?> mapM13363a = m13363a(type);
        mhc mhcVar = hw3Var.f45135f;
        try {
            hw3Var.m12645f(mhcVar, mapM13363a, obj);
            if (!(type instanceof ParameterizedType)) {
                return (T) hw3Var.parseObject(mapM13363a, obj);
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            return String.class == type2 ? (T) parseMap(hw3Var, mapM13363a, type3, obj) : (T) parseMap(hw3Var, mapM13363a, type2, type3, obj);
        } finally {
            hw3Var.setContext(mhcVar);
        }
    }

    public static Object parseMap(hw3 hw3Var, Map<Object, Object> map, Type type, Type type2, Object obj) {
        lh8 lh8Var = hw3Var.f45134e;
        int i = lh8Var.f57601a;
        if (i != 12 && i != 16) {
            throw new jh8("syntax error, expect {, actual " + sh8.name(i));
        }
        sjb deserializer = hw3Var.f45131b.getDeserializer(type);
        sjb deserializer2 = hw3Var.f45131b.getDeserializer(type2);
        lh8Var.nextToken();
        mhc mhcVar = hw3Var.f45135f;
        while (true) {
            try {
                int i2 = lh8Var.f57601a;
                if (i2 == 13) {
                    lh8Var.nextToken(16);
                    return map;
                }
                Object obj2 = null;
                if (i2 == 4 && lh8Var.isRef() && !lh8Var.isEnabled(rp5.DisableSpecialKeyDetect)) {
                    lh8Var.nextTokenWithChar(':');
                    if (lh8Var.f57601a == 4) {
                        String strStringVal = lh8Var.stringVal();
                        if ("..".equals(strStringVal)) {
                            obj2 = mhcVar.f61021b.f61020a;
                        } else if ("$".equals(strStringVal)) {
                            mhc mhcVar2 = mhcVar;
                            while (true) {
                                mhc mhcVar3 = mhcVar2.f61021b;
                                if (mhcVar3 == null) {
                                    break;
                                }
                                mhcVar2 = mhcVar3;
                            }
                            obj2 = mhcVar2.f61020a;
                        } else {
                            hw3Var.m12640a(new hw3.C7064a(mhcVar, strStringVal));
                            hw3Var.f45126H = 1;
                        }
                        lh8Var.nextToken(13);
                        if (lh8Var.f57601a == 13) {
                            lh8Var.nextToken(16);
                            return obj2;
                        }
                        throw new jh8("illegal ref");
                    }
                    throw new jh8("illegal ref, " + sh8.name(i2));
                }
                if (map.size() == 0 && i2 == 4 && fh8.f36584c.equals(lh8Var.stringVal()) && !lh8Var.isEnabled(rp5.DisableSpecialKeyDetect)) {
                    lh8Var.nextTokenWithChar(':');
                    lh8Var.nextToken(16);
                    if (lh8Var.f57601a == 13) {
                        lh8Var.nextToken();
                        return map;
                    }
                    lh8Var.nextToken();
                }
                Object objDeserialze = deserializer.deserialze(hw3Var, type, null);
                if (lh8Var.f57601a == 17) {
                    lh8Var.nextToken();
                    Object objDeserialze2 = deserializer2.deserialze(hw3Var, type2, objDeserialze);
                    if (hw3Var.f45126H == 1) {
                        hw3Var.m12642c(map, objDeserialze);
                    }
                    map.put(objDeserialze, objDeserialze2);
                    if (lh8Var.f57601a == 16) {
                        lh8Var.nextToken();
                    }
                } else {
                    throw new jh8("syntax error, expect :, actual " + lh8Var.f57601a);
                }
            } finally {
                hw3Var.setContext(mhcVar);
            }
        }
    }
}
