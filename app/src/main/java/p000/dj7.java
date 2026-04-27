package p000;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.d9d;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class dj7 {

    /* JADX INFO: renamed from: b */
    public static dj7 f29788b = null;

    /* JADX INFO: renamed from: d */
    public static final String f29790d = "FirebaseAppHeartBeat";

    /* JADX INFO: renamed from: e */
    public static final String f29791e = "FirebaseHeartBeat";

    /* JADX INFO: renamed from: h */
    public static final int f29794h = 30;

    /* JADX INFO: renamed from: a */
    public final ti8 f29795a;

    /* JADX INFO: renamed from: c */
    public static final d9d.C4675a<Long> f29789c = i9d.longKey("fire-global");

    /* JADX INFO: renamed from: f */
    public static final d9d.C4675a<Long> f29792f = i9d.longKey("fire-count");

    /* JADX INFO: renamed from: g */
    public static final d9d.C4675a<String> f29793g = i9d.stringKey("last-used-date");

    public dj7(Context context, String str) {
        this.f29795a = new ti8(context, f29791e + str);
    }

    private synchronized long cleanUpStoredHeartBeats(i6b i6bVar) {
        long j;
        try {
            long jLongValue = ((Long) ui8.getOrDefault(i6bVar, f29792f, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<d9d.C4675a<?>, Object> entry : i6bVar.asMap().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            i6bVar.set(i9d.stringSetKey(name), hashSet2);
            j = jLongValue - 1;
            i6bVar.set(f29792f, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    private synchronized String getFormattedDate(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized d9d.C4675a<Set<String>> getStoredUserAgentString(i6b i6bVar, String str) {
        for (Map.Entry<d9d.C4675a<?>, Object> entry : i6bVar.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return i9d.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bth lambda$deleteAllHeartBeats$0(i6b i6bVar) {
        long j = 0;
        for (Map.Entry<d9d.C4675a<?>, Object> entry : i6bVar.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                d9d.C4675a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String formattedDate = getFormattedDate(System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    i6bVar.set(key, m9j.m17180a(new Object[]{formattedDate}));
                    j++;
                } else {
                    i6bVar.remove(key);
                }
            }
        }
        if (j == 0) {
            i6bVar.remove(f29792f);
            return null;
        }
        i6bVar.set(f29792f, Long.valueOf(j));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bth lambda$postHeartBeatCleanUp$1(String str, i6b i6bVar) {
        i6bVar.set(f29793g, str);
        removeStoredDate(i6bVar, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ bth lambda$storeHeartBeat$2(String str, String str2, d9d.C4675a c4675a, i6b i6bVar) {
        d9d.C4675a<String> c4675a2 = f29793g;
        if (((String) ui8.getOrDefault(i6bVar, c4675a2, "")).equals(str)) {
            d9d.C4675a<Set<String>> storedUserAgentString = getStoredUserAgentString(i6bVar, str);
            if (storedUserAgentString == null || storedUserAgentString.getName().equals(str2)) {
                return null;
            }
            updateStoredUserAgent(i6bVar, c4675a, str);
            return null;
        }
        d9d.C4675a<Long> c4675a3 = f29792f;
        long jLongValue = ((Long) ui8.getOrDefault(i6bVar, c4675a3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = cleanUpStoredHeartBeats(i6bVar);
        }
        HashSet hashSet = new HashSet((Collection) ui8.getOrDefault(i6bVar, c4675a, new HashSet()));
        hashSet.add(str);
        i6bVar.set(c4675a, hashSet);
        i6bVar.set(c4675a3, Long.valueOf(jLongValue + 1));
        i6bVar.set(c4675a2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bth lambda$updateGlobalHeartBeat$3(long j, i6b i6bVar) {
        i6bVar.set(f29789c, Long.valueOf(j));
        return null;
    }

    private synchronized void removeStoredDate(i6b i6bVar, String str) {
        try {
            d9d.C4675a<Set<String>> storedUserAgentString = getStoredUserAgentString(i6bVar, str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) ui8.getOrDefault(i6bVar, storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                i6bVar.remove(storedUserAgentString);
            } else {
                i6bVar.set(storedUserAgentString, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void updateStoredUserAgent(i6b i6bVar, d9d.C4675a<Set<String>> c4675a, String str) {
        removeStoredDate(i6bVar, str);
        HashSet hashSet = new HashSet((Collection) ui8.getOrDefault(i6bVar, c4675a, new HashSet()));
        hashSet.add(str);
        i6bVar.set(c4675a, hashSet);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m9193e() {
        this.f29795a.editSync(new qy6() { // from class: aj7
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return this.f1744a.lambda$deleteAllHeartBeats$0((i6b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public synchronized List<ej7> m9194f() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            for (Map.Entry<d9d.C4675a<?>, Object> entry : this.f29795a.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(ej7.create(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            m9202n(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69938e})
    /* JADX INFO: renamed from: g */
    public int m9195g() {
        return ((Long) this.f29795a.getSync(f29792f, 0L)).intValue();
    }

    /* JADX INFO: renamed from: h */
    public synchronized long m9196h() {
        return ((Long) this.f29795a.getSync(f29789c, -1L)).longValue();
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m9197i(long j, long j2) {
        return getFormattedDate(j).equals(getFormattedDate(j2));
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m9198j() {
        final String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.f29795a.editSync(new qy6() { // from class: bj7
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return this.f13874a.lambda$postHeartBeatCleanUp$1(formattedDate, (i6b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m9199k(long j) {
        return m9200l(f29789c, j);
    }

    /* JADX INFO: renamed from: l */
    public synchronized boolean m9200l(d9d.C4675a<Long> c4675a, long j) {
        if (m9197i(((Long) this.f29795a.getSync(c4675a, -1L)).longValue(), j)) {
            return false;
        }
        this.f29795a.putSync(c4675a, Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m9201m(long j, final String str) {
        final String formattedDate = getFormattedDate(j);
        final d9d.C4675a<Set<String>> c4675aStringSetKey = i9d.stringSetKey(str);
        this.f29795a.editSync(new qy6() { // from class: zi7
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return this.f105164a.lambda$storeHeartBeat$2(formattedDate, str, c4675aStringSetKey, (i6b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m9202n(final long j) {
        this.f29795a.editSync(new qy6() { // from class: cj7
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return dj7.lambda$updateGlobalHeartBeat$3(j, (i6b) obj);
            }
        });
    }

    @fdi
    @p7e({p7e.EnumC10826a.f69938e})
    public dj7(ti8 ti8Var) {
        this.f29795a = ti8Var;
    }
}
