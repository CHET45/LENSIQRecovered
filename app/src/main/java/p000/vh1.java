package p000;

import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class vh1 {

    /* JADX INFO: renamed from: e */
    public static final Object f91142e = "nULl";

    /* JADX INFO: renamed from: f */
    public static final String f91143f = "BusUtils";

    /* JADX INFO: renamed from: a */
    public final Map<String, List<C14069c>> f91144a;

    /* JADX INFO: renamed from: b */
    public final Map<String, Set<Object>> f91145b;

    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> f91146c;

    /* JADX INFO: renamed from: d */
    public final Map<String, Map<String, Object>> f91147d;

    /* JADX INFO: renamed from: vh1$a */
    public class RunnableC14067a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f91148a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f91149b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C14069c f91150c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f91151d;

        public RunnableC14067a(Object obj, Object obj2, C14069c c14069c, boolean z) {
            this.f91148a = obj;
            this.f91149b = obj2;
            this.f91150c = c14069c;
            this.f91151d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            vh1.this.realInvokeMethod(this.f91148a, this.f91149b, this.f91150c, this.f91151d);
        }
    }

    /* JADX INFO: renamed from: vh1$b */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC14068b {
        int priority() default 0;

        boolean sticky() default false;

        String tag();

        EnumC14071e threadMode() default EnumC14071e.POSTING;
    }

    /* JADX INFO: renamed from: vh1$c */
    public static final class C14069c {

        /* JADX INFO: renamed from: a */
        public String f91153a;

        /* JADX INFO: renamed from: b */
        public String f91154b;

        /* JADX INFO: renamed from: c */
        public String f91155c;

        /* JADX INFO: renamed from: d */
        public String f91156d;

        /* JADX INFO: renamed from: e */
        public String f91157e;

        /* JADX INFO: renamed from: f */
        public boolean f91158f;

        /* JADX INFO: renamed from: g */
        public String f91159g;

        /* JADX INFO: renamed from: h */
        public int f91160h;

        /* JADX INFO: renamed from: i */
        public Method f91161i;

        /* JADX INFO: renamed from: j */
        public List<String> f91162j = new CopyOnWriteArrayList();

        public C14069c(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i) {
            this.f91153a = str;
            this.f91154b = str2;
            this.f91155c = str3;
            this.f91156d = str4;
            this.f91157e = str5;
            this.f91158f = z;
            this.f91159g = str6;
            this.f91160h = i;
        }

        private String getDesc() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f91154b);
            sb.append("#");
            sb.append(this.f91155c);
            if ("".equals(this.f91156d)) {
                str = "()";
            } else {
                str = c0b.f15433c + this.f91156d + C2473f.f17566z + this.f91157e + c0b.f15434d;
            }
            sb.append(str);
            return sb.toString();
        }

        public String toString() {
            return "BusInfo { tag : " + this.f91153a + ", desc: " + getDesc() + ", sticky: " + this.f91158f + ", threadMode: " + this.f91159g + ", method: " + this.f91161i + ", priority: " + this.f91160h + " }";
        }
    }

    /* JADX INFO: renamed from: vh1$d */
    public static class C14070d {

        /* JADX INFO: renamed from: a */
        public static final vh1 f91163a = new vh1(null);

        private C14070d() {
        }
    }

    /* JADX INFO: renamed from: vh1$e */
    public enum EnumC14071e {
        MAIN,
        IO,
        CPU,
        CACHED,
        SINGLE,
        POSTING
    }

    public /* synthetic */ vh1(RunnableC14067a runnableC14067a) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public static void m23960b(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i) {
        getInstance().registerBus(str, str2, str3, str4, str5, z, str6, i);
    }

    private void consumeSticky(Object obj, String str, Object obj2) {
        List<C14069c> list = this.f91144a.get(str);
        if (list == null) {
            Log.e(f91143f, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (C14069c c14069c : list) {
            if (c14069c.f91162j.contains(obj.getClass().getName()) && c14069c.f91158f) {
                synchronized (this.f91147d) {
                    try {
                        Map<String, Object> map = this.f91147d.get(c14069c.f91154b);
                        if (map != null && map.containsKey(str)) {
                            invokeBus(obj, obj2, c14069c, true);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    private void consumeStickyIfExist(Object obj) {
        Map<String, Object> map = this.f91147d.get(obj.getClass().getName());
        if (map == null) {
            return;
        }
        synchronized (this.f91147d) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    consumeSticky(obj, entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Class getClassName(String str) throws ClassNotFoundException {
        str.hashCode();
        switch (str) {
            case "double":
                return Double.TYPE;
            case "int":
                return Integer.TYPE;
            case "byte":
                return Byte.TYPE;
            case "char":
                return Character.TYPE;
            case "long":
                return Long.TYPE;
            case "boolean":
                return Boolean.TYPE;
            case "float":
                return Float.TYPE;
            case "short":
                return Short.TYPE;
            default:
                return Class.forName(str);
        }
    }

    private static vh1 getInstance() {
        return C14070d.f91163a;
    }

    private Method getMethodByBusInfo(C14069c c14069c) {
        try {
            return "".equals(c14069c.f91156d) ? Class.forName(c14069c.f91154b).getDeclaredMethod(c14069c.f91155c, null) : Class.forName(c14069c.f91154b).getDeclaredMethod(c14069c.f91155c, getClassName(c14069c.f91156d));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void init() {
    }

    private void invokeBus(Object obj, C14069c c14069c, boolean z) {
        invokeBus(null, obj, c14069c, z);
    }

    private void invokeBuses(Object obj, C14069c c14069c, Set<Object> set) {
        try {
            if (obj == f91142e) {
                Iterator<Object> it = set.iterator();
                while (it.hasNext()) {
                    c14069c.f91161i.invoke(it.next(), null);
                }
                return;
            }
            Iterator<Object> it2 = set.iterator();
            while (it2.hasNext()) {
                c14069c.f91161i.invoke(it2.next(), obj);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    private void invokeMethod(Object obj, C14069c c14069c, boolean z) {
        invokeMethod(null, obj, c14069c, z);
    }

    public static void post(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'tag' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        post(str, f91142e);
    }

    private void postInner(String str, Object obj) {
        postInner(str, obj, false);
    }

    public static void postSticky(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'tag' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        postSticky(str, f91142e);
    }

    private void postStickyInner(String str, Object obj) {
        List<C14069c> list = this.f91144a.get(str);
        if (list == null) {
            Log.e(f91143f, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (C14069c c14069c : list) {
            if (c14069c.f91158f) {
                synchronized (this.f91147d) {
                    try {
                        Map<String, Object> concurrentHashMap = this.f91147d.get(c14069c.f91154b);
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap<>();
                            this.f91147d.put(c14069c.f91154b, concurrentHashMap);
                        }
                        concurrentHashMap.put(str, obj);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                invokeBus(obj, c14069c, true);
            } else {
                invokeBus(obj, c14069c, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realInvokeMethod(Object obj, Object obj2, C14069c c14069c, boolean z) {
        Set<Object> hashSet = new HashSet<>();
        if (obj == null) {
            Iterator<String> it = c14069c.f91162j.iterator();
            while (it.hasNext()) {
                Set<Object> set = this.f91145b.get(it.next());
                if (set != null && !set.isEmpty()) {
                    hashSet.addAll(set);
                }
            }
            if (hashSet.size() == 0) {
                if (z) {
                    return;
                }
                Log.e(f91143f, "The " + c14069c + " was not registered before.");
                return;
            }
        } else {
            hashSet.add(obj);
        }
        invokeBuses(obj2, c14069c, hashSet);
    }

    private void recordTags(Class<?> cls, String str) {
        if (this.f91146c.get(str) == null) {
            synchronized (this.f91146c) {
                if (this.f91146c.get(str) == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    for (Map.Entry<String, List<C14069c>> entry : this.f91144a.entrySet()) {
                        for (C14069c c14069c : entry.getValue()) {
                            try {
                                if (Class.forName(c14069c.f91154b).isAssignableFrom(cls)) {
                                    copyOnWriteArrayList.add(entry.getKey());
                                    c14069c.f91162j.add(str);
                                }
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    this.f91146c.put(str, copyOnWriteArrayList);
                }
            }
        }
    }

    public static void register(@hib Object obj) {
        getInstance().registerInner(obj);
    }

    private void registerBus(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        registerBus(str, str2, str3, str4, str5, z, str6, 0);
    }

    private void registerInner(@hib Object obj) {
        boolean z;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        String name = cls.getName();
        synchronized (this.f91145b) {
            try {
                Set<Object> copyOnWriteArraySet = this.f91145b.get(name);
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet<>();
                    this.f91145b.put(name, copyOnWriteArraySet);
                    z = true;
                } else {
                    z = false;
                }
                if (!copyOnWriteArraySet.contains(obj)) {
                    copyOnWriteArraySet.add(obj);
                    if (z) {
                        recordTags(cls, name);
                    }
                    consumeStickyIfExist(obj);
                    return;
                }
                Log.w(f91143f, "The bus of <" + obj + "> already registered.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void removeSticky(String str) {
        getInstance().removeStickyInner(str);
    }

    private void removeStickyInner(String str) {
        List<C14069c> list = this.f91144a.get(str);
        if (list == null) {
            Log.e(f91143f, "The bus of tag <" + str + "> is not exists.");
            return;
        }
        for (C14069c c14069c : list) {
            if (c14069c.f91158f) {
                synchronized (this.f91147d) {
                    try {
                        Map<String, Object> map = this.f91147d.get(c14069c.f91154b);
                        if (map != null && map.containsKey(str)) {
                            map.remove(str);
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static String toString_() {
        return getInstance().toString();
    }

    public static void unregister(@hib Object obj) {
        getInstance().unregisterInner(obj);
    }

    private void unregisterInner(Object obj) {
        if (obj == null) {
            return;
        }
        String name = obj.getClass().getName();
        synchronized (this.f91145b) {
            try {
                Set<Object> set = this.f91145b.get(name);
                if (set != null && set.contains(obj)) {
                    set.remove(obj);
                    return;
                }
                Log.e(f91143f, "The bus of <" + obj + "> was not registered before.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "BusUtils: " + this.f91144a;
    }

    private vh1() {
        this.f91144a = new ConcurrentHashMap();
        this.f91145b = new ConcurrentHashMap();
        this.f91146c = new ConcurrentHashMap();
        this.f91147d = new ConcurrentHashMap();
        init();
    }

    private void invokeBus(Object obj, Object obj2, C14069c c14069c, boolean z) {
        if (c14069c.f91161i == null) {
            Method methodByBusInfo = getMethodByBusInfo(c14069c);
            if (methodByBusInfo == null) {
                return;
            } else {
                c14069c.f91161i = methodByBusInfo;
            }
        }
        invokeMethod(obj, obj2, c14069c, z);
    }

    private void invokeMethod(Object obj, Object obj2, C14069c c14069c, boolean z) {
        RunnableC14067a runnableC14067a;
        runnableC14067a = new RunnableC14067a(obj, obj2, c14069c, z);
        String str = c14069c.f91159g;
        str.hashCode();
        switch (str) {
            case "SINGLE":
                C2478k.getSinglePool().execute(runnableC14067a);
                break;
            case "IO":
                C2478k.getIoPool().execute(runnableC14067a);
                break;
            case "CPU":
                C2478k.getCpuPool().execute(runnableC14067a);
                break;
            case "MAIN":
                C2478k.runOnUiThread(runnableC14067a);
                break;
            case "CACHED":
                C2478k.getCachedPool().execute(runnableC14067a);
                break;
            default:
                runnableC14067a.run();
                break;
        }
    }

    private void postInner(String str, Object obj, boolean z) {
        List<C14069c> list = this.f91144a.get(str);
        if (list != null) {
            Iterator<C14069c> it = list.iterator();
            while (it.hasNext()) {
                invokeBus(obj, it.next(), z);
            }
            return;
        }
        Log.e(f91143f, "The bus of tag <" + str + "> is not exists.");
        if (this.f91144a.isEmpty()) {
            Log.e(f91143f, "Please check whether the bus plugin is applied.");
        }
    }

    private void registerBus(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i) {
        List<C14069c> copyOnWriteArrayList = this.f91144a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f91144a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(new C14069c(str, str2, str3, str4, str5, z, str6, i));
    }

    public static void post(@efb String str, @efb Object obj) {
        if (str == null) {
            throw new NullPointerException("Argument 'tag' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (obj != null) {
            getInstance().postInner(str, obj);
            return;
        }
        throw new NullPointerException("Argument 'arg' of type Object (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    public static void postSticky(@efb String str, Object obj) {
        if (str != null) {
            getInstance().postStickyInner(str, obj);
            return;
        }
        throw new NullPointerException("Argument 'tag' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }
}
