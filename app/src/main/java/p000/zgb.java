package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class zgb {

    /* JADX INFO: renamed from: e */
    public static final String f105055e = "NotificationCenter";

    /* JADX INFO: renamed from: a */
    public final ArrayMap f105056a;

    /* JADX INFO: renamed from: b */
    public final ArrayMap f105057b;

    /* JADX INFO: renamed from: c */
    public final Object f105058c;

    /* JADX INFO: renamed from: d */
    public Handler f105059d;

    /* JADX INFO: renamed from: zgb$b */
    public static class C16133b {

        /* JADX INFO: renamed from: a */
        public static final zgb f105060a = new zgb();

        private C16133b() {
        }
    }

    /* JADX INFO: renamed from: zgb$c */
    public class RunnableC16134c implements Runnable {

        /* JADX INFO: renamed from: a */
        public Object f105061a;

        /* JADX INFO: renamed from: b */
        public String f105062b;

        /* JADX INFO: renamed from: c */
        public Object f105063c;

        /* JADX INFO: renamed from: d */
        public List f105064d;

        public RunnableC16134c(Object obj, String str, Object obj2, List list) {
            this.f105061a = obj;
            this.f105062b = str;
            this.f105063c = obj2;
            this.f105064d = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            zgb.this.m26800b(this.f105061a, this.f105062b, this.f105063c, this.f105064d);
        }
    }

    private List createCopyOfContentsRemoveWeakRefs(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof uid) {
                uid uidVar = (uid) next;
                if (uidVar.getProxiedSubscriber() == null) {
                    m26801c(uidVar, it);
                } else {
                    arrayList.add(uidVar);
                }
            } else if (next instanceof WeakReference) {
                Object obj = ((WeakReference) next).get();
                if (obj == null) {
                    it.remove();
                } else {
                    arrayList.add(obj);
                }
            } else {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static zgb defaultCenter() {
        return C16133b.f105060a;
    }

    private boolean removeFromSetResolveWeakReferences(ArrayMap arrayMap, Object obj, Object obj2) {
        List list = (List) arrayMap.get(obj);
        if (list == null) {
            return false;
        }
        if (list.remove(obj2)) {
            boolean z = obj2 instanceof WeakReference;
            if (obj2 instanceof uid) {
                ((uid) obj2).proxyUnsubscribed();
            }
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof uid) {
                uid uidVar = (uid) next;
                Object proxiedSubscriber = uidVar.getProxiedSubscriber();
                if (proxiedSubscriber == obj2) {
                    m26801c(uidVar, it);
                    return true;
                }
                next = proxiedSubscriber;
            }
            if (next instanceof WeakReference) {
                Object obj3 = ((WeakReference) next).get();
                if (obj3 == null) {
                    it.remove();
                    return true;
                }
                if (obj3 == obj2) {
                    it.remove();
                    return true;
                }
                if (obj3 instanceof uid) {
                    uid uidVar2 = (uid) obj3;
                    if (uidVar2.getProxiedSubscriber() == obj2) {
                        m26801c(uidVar2, it);
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private void unsubscribeAllInMap(ArrayMap arrayMap) {
        synchronized (this.f105058c) {
            try {
                for (Object obj : arrayMap.keySet()) {
                    List list = (List) arrayMap.get(obj);
                    while (!list.isEmpty()) {
                        m26803e(obj, arrayMap, list.get(0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m26799a(Iterator it, Object obj) {
        if (obj instanceof WeakReference) {
            Object obj2 = ((WeakReference) obj).get();
            if (obj2 != null) {
                return obj2;
            }
            it.remove();
            return obj2;
        }
        if (!(obj instanceof uid)) {
            return obj;
        }
        uid uidVar = (uid) obj;
        Object proxiedSubscriber = uidVar.getProxiedSubscriber();
        if (proxiedSubscriber != null) {
            m26801c(uidVar, it);
        }
        return proxiedSubscriber;
    }

    /* JADX INFO: renamed from: b */
    public void m26800b(Object obj, String str, Object obj2, List list) {
        if (obj == null && str == null) {
            throw new IllegalArgumentException("Can't publish to null topic/event.");
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj3 = list.get(i);
            if (obj != null) {
                try {
                    ((xcg) obj3).onEvent(obj);
                } catch (Throwable unused) {
                }
            } else {
                ((u4h) obj3).onEvent(str, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m26801c(uid uidVar, Iterator it) {
        it.remove();
        uidVar.proxyUnsubscribed();
    }

    public void clearAllSubscribers() {
        synchronized (this.f105058c) {
            unsubscribeAllInMap(this.f105056a);
            unsubscribeAllInMap(this.f105057b);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m26802d(Object obj, ArrayMap<Object, Object> arrayMap, Object obj2) {
        boolean z;
        boolean z2;
        if (obj == null) {
            throw new IllegalArgumentException("Can't subscribe to null.");
        }
        if (obj2 == null) {
            throw new IllegalArgumentException("Can't subscribe null subscriber to " + obj);
        }
        boolean z3 = obj2 instanceof WeakReference;
        Object proxiedSubscriber = z3 ? ((WeakReference) obj2).get() : obj2;
        boolean z4 = false;
        if (obj2 instanceof uid) {
            uid uidVar = (uid) obj2;
            z = uidVar.getReferenceStrength() == 1;
            if (z) {
                proxiedSubscriber = uidVar.getProxiedSubscriber();
            }
        } else {
            z = false;
        }
        if (z3 && z) {
            throw new IllegalArgumentException("ProxySubscribers should always be subscribed strongly.");
        }
        if (proxiedSubscriber == null) {
            return false;
        }
        synchronized (this.f105058c) {
            try {
                List arrayList = (List) arrayMap.get(obj);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    arrayMap.put(obj, arrayList);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (proxiedSubscriber.equals(m26799a(it, it.next()))) {
                            it.remove();
                            z4 = true;
                        }
                    }
                }
                arrayList.add(obj2);
                z2 = !z4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m26803e(Object obj, ArrayMap arrayMap, Object obj2) {
        boolean zRemoveFromSetResolveWeakReferences;
        if (obj == null) {
            throw new IllegalArgumentException("Can't unsubscribe to null.");
        }
        if (obj2 != null) {
            synchronized (this.f105058c) {
                zRemoveFromSetResolveWeakReferences = removeFromSetResolveWeakReferences(arrayMap, obj, obj2);
            }
            return zRemoveFromSetResolveWeakReferences;
        }
        throw new IllegalArgumentException("Can't unsubscribe null subscriber to " + obj);
    }

    public <T> List<T> getSubscribers(Class<T> cls) {
        List<T> subscribersToClass;
        synchronized (this.f105058c) {
            subscribersToClass = getSubscribersToClass(cls);
        }
        return subscribersToClass;
    }

    public <T> List<T> getSubscribersToClass(Class<T> cls) {
        ArrayMap arrayMap = this.f105057b;
        ArrayList arrayList = null;
        for (Class cls2 : arrayMap.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                Collection collection = (Collection) arrayMap.get(cls2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(createCopyOfContentsRemoveWeakRefs(collection));
            }
        }
        return arrayList;
    }

    public <T> List<T> getSubscribersToTopic(String str) {
        List<T> subscribers;
        synchronized (this.f105058c) {
            subscribers = getSubscribers(str, this.f105056a);
        }
        return subscribers;
    }

    public void publish(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot publish null event.");
        }
        this.f105059d.post(new RunnableC16134c(obj, null, null, getSubscribers(obj.getClass())));
    }

    public void setLooper(Looper looper) {
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        if (this.f105059d.getLooper() == looper) {
            return;
        }
        this.f105059d = new Handler(looper);
    }

    public boolean subscribeStrongly(Class cls, xcg xcgVar) {
        if (xcgVar != null) {
            return m26802d(cls, this.f105057b, xcgVar);
        }
        throw new IllegalArgumentException("Subscriber cannot be null.");
    }

    public boolean subscriber(Class cls, xcg xcgVar) {
        if (cls == null) {
            throw new IllegalArgumentException("Event class must not be null");
        }
        if (xcgVar != null) {
            return m26802d(cls, this.f105057b, new WeakReference(xcgVar));
        }
        throw new IllegalArgumentException("Event subscriber must not be null");
    }

    public boolean unsubscribe(Class cls, xcg xcgVar) {
        return m26803e(cls, this.f105057b, xcgVar);
    }

    private zgb() {
        this.f105056a = new ArrayMap();
        this.f105057b = new ArrayMap();
        this.f105058c = new Object();
        this.f105059d = new Handler(Looper.getMainLooper());
    }

    public boolean unsubscribe(String str, u4h u4hVar) {
        return m26803e(str, this.f105056a, u4hVar);
    }

    public void publish(String str, Object obj) {
        this.f105059d.post(new RunnableC16134c(null, str, obj, getSubscribersToTopic(str)));
    }

    private List getSubscribers(Object obj, ArrayMap arrayMap) {
        return createCopyOfContentsRemoveWeakRefs((List) arrayMap.get(obj));
    }

    public boolean subscriber(String str, u4h u4hVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Topic must not be null or empty");
        }
        if (u4hVar != null) {
            return m26802d(str, this.f105056a, new WeakReference(u4hVar));
        }
        throw new IllegalArgumentException("Event subscriber must not be null");
    }
}
