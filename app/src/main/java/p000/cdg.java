package p000;

import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
@vx4
public final class cdg {

    /* JADX INFO: renamed from: c */
    public static final ad9<Class<?>, kx7<Method>> f16307c = gl1.newBuilder().weakKeys().build(new C2281a());

    /* JADX INFO: renamed from: d */
    public static final ad9<Class<?>, dy7<Class<?>>> f16308d = gl1.newBuilder().weakKeys().build(new C2282b());

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap<Class<?>, CopyOnWriteArraySet<vcg>> f16309a = tt9.newConcurrentMap();

    /* JADX INFO: renamed from: b */
    @Weak
    public final r55 f16310b;

    /* JADX INFO: renamed from: cdg$a */
    public class C2281a extends jm1<Class<?>, kx7<Method>> {
        @Override // p000.jm1
        public kx7<Method> load(Class<?> concreteClass) throws Exception {
            return cdg.getAnnotatedMethodsNotCached(concreteClass);
        }
    }

    /* JADX INFO: renamed from: cdg$b */
    public class C2282b extends jm1<Class<?>, dy7<Class<?>>> {
        @Override // p000.jm1
        public dy7<Class<?>> load(Class<?> concreteClass) {
            return dy7.copyOf((Collection) nmh.m18018of((Class) concreteClass).getTypes().rawTypes());
        }
    }

    /* JADX INFO: renamed from: cdg$c */
    public static final class C2283c {

        /* JADX INFO: renamed from: a */
        public final String f16311a;

        /* JADX INFO: renamed from: b */
        public final List<Class<?>> f16312b;

        public C2283c(Method method) {
            this.f16311a = method.getName();
            this.f16312b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@wx1 Object o) {
            if (!(o instanceof C2283c)) {
                return false;
            }
            C2283c c2283c = (C2283c) o;
            return this.f16311a.equals(c2283c.f16311a) && this.f16312b.equals(c2283c.f16312b);
        }

        public int hashCode() {
            return okb.hashCode(this.f16311a, this.f16312b);
        }
    }

    public cdg(r55 bus) {
        this.f16310b = (r55) v7d.checkNotNull(bus);
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public static dy7<Class<?>> m3905b(Class<?> concreteClass) {
        try {
            return f16308d.getUnchecked(concreteClass);
        } catch (orh e) {
            throw bzg.propagate(e.getCause());
        }
    }

    private u3b<Class<?>, vcg> findAllSubscribers(Object listener) {
        qh7 qh7VarCreate = qh7.create();
        quh<Method> it = getAnnotatedMethods(listener.getClass()).iterator();
        while (it.hasNext()) {
            Method next = it.next();
            qh7VarCreate.put(next.getParameterTypes()[0], vcg.m23919b(this.f16310b, listener, next));
        }
        return qh7VarCreate;
    }

    private static kx7<Method> getAnnotatedMethods(Class<?> clazz) {
        try {
            return f16307c.getUnchecked(clazz);
        } catch (orh e) {
            bzg.throwIfUnchecked(e.getCause());
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kx7<Method> getAnnotatedMethodsNotCached(Class<?> clazz) {
        Set setRawTypes = nmh.m18018of((Class) clazz).getTypes().rawTypes();
        HashMap mapNewHashMap = tt9.newHashMap();
        Iterator it = setRawTypes.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(rcg.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    v7d.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (Object) method, parameterTypes.length);
                    v7d.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), tbd.wrap(parameterTypes[0]).getSimpleName());
                    C2283c c2283c = new C2283c(method);
                    if (!mapNewHashMap.containsKey(c2283c)) {
                        mapNewHashMap.put(c2283c, method);
                    }
                }
            }
        }
        return kx7.copyOf(mapNewHashMap.values());
    }

    /* JADX INFO: renamed from: c */
    public Iterator<vcg> m3906c(Object event) {
        dy7<Class<?>> dy7VarM3905b = m3905b(event.getClass());
        ArrayList arrayListNewArrayListWithCapacity = eb9.newArrayListWithCapacity(dy7VarM3905b.size());
        quh<Class<?>> it = dy7VarM3905b.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet<vcg> copyOnWriteArraySet = this.f16309a.get(it.next());
            if (copyOnWriteArraySet != null) {
                arrayListNewArrayListWithCapacity.add(copyOnWriteArraySet.iterator());
            }
        }
        return wg8.concat(arrayListNewArrayListWithCapacity.iterator());
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public Set<vcg> m3907d(Class<?> eventType) {
        return (Set) yya.firstNonNull(this.f16309a.get(eventType), dy7.m9575of());
    }

    /* JADX INFO: renamed from: e */
    public void m3908e(Object listener) {
        for (Map.Entry<Class<?>, Collection<vcg>> entry : findAllSubscribers(listener).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<vcg> value = entry.getValue();
            CopyOnWriteArraySet<vcg> copyOnWriteArraySet = this.f16309a.get(key);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet<vcg> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (CopyOnWriteArraySet) yya.firstNonNull(this.f16309a.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3909f(Object listener) {
        for (Map.Entry<Class<?>, Collection<vcg>> entry : findAllSubscribers(listener).asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Collection<vcg> value = entry.getValue();
            CopyOnWriteArraySet<vcg> copyOnWriteArraySet = this.f16309a.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                throw new IllegalArgumentException("missing event subscriber for an annotated method. Is " + listener + " registered?");
            }
        }
    }
}
