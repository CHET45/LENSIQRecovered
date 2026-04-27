package p000;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tu0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, Long> f85927a;

    /* JADX INFO: renamed from: b */
    public final Map<Integer, Long> f85928b;

    /* JADX INFO: renamed from: c */
    public final Map<List<Pair<String, Integer>>, ru0> f85929c;

    /* JADX INFO: renamed from: d */
    public final Random f85930d;

    public tu0() {
        this(new Random());
    }

    private static <T> void addExclusion(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) x0i.castNonNull(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    private List<ru0> applyExclusions(List<ru0> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        removeExpiredExclusions(jElapsedRealtime, this.f85927a);
        removeExpiredExclusions(jElapsedRealtime, this.f85928b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ru0 ru0Var = list.get(i);
            if (!this.f85927a.containsKey(ru0Var.f79576b) && !this.f85928b.containsKey(Integer.valueOf(ru0Var.f79577c))) {
                arrayList.add(ru0Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareBaseUrl(ru0 ru0Var, ru0 ru0Var2) {
        int iCompare = Integer.compare(ru0Var.f79577c, ru0Var2.f79577c);
        return iCompare != 0 ? iCompare : ru0Var.f79576b.compareTo(ru0Var2.f79576b);
    }

    public static int getPriorityCount(List<ru0> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).f79577c));
        }
        return hashSet.size();
    }

    private static <T> void removeExpiredExclusions(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    private ru0 selectWeighted(List<ru0> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).f79578d;
        }
        int iNextInt = this.f85930d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ru0 ru0Var = list.get(i4);
            i3 += ru0Var.f79578d;
            if (iNextInt < i3) {
                return ru0Var;
            }
        }
        return (ru0) vg8.getLast(list);
    }

    public void exclude(ru0 ru0Var, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        addExclusion(ru0Var.f79576b, jElapsedRealtime, this.f85927a);
        int i = ru0Var.f79577c;
        if (i != Integer.MIN_VALUE) {
            addExclusion(Integer.valueOf(i), jElapsedRealtime, this.f85928b);
        }
    }

    public int getPriorityCountAfterExclusion(List<ru0> list) {
        HashSet hashSet = new HashSet();
        List<ru0> listApplyExclusions = applyExclusions(list);
        for (int i = 0; i < listApplyExclusions.size(); i++) {
            hashSet.add(Integer.valueOf(listApplyExclusions.get(i).f79577c));
        }
        return hashSet.size();
    }

    public void reset() {
        this.f85927a.clear();
        this.f85928b.clear();
        this.f85929c.clear();
    }

    @hib
    public ru0 selectBaseUrl(List<ru0> list) {
        List<ru0> listApplyExclusions = applyExclusions(list);
        if (listApplyExclusions.size() < 2) {
            return (ru0) vg8.getFirst(listApplyExclusions, null);
        }
        Collections.sort(listApplyExclusions, new Comparator() { // from class: su0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return tu0.compareBaseUrl((ru0) obj, (ru0) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = listApplyExclusions.get(0).f79577c;
        int i2 = 0;
        while (true) {
            if (i2 >= listApplyExclusions.size()) {
                break;
            }
            ru0 ru0Var = listApplyExclusions.get(i2);
            if (i == ru0Var.f79577c) {
                arrayList.add(new Pair(ru0Var.f79576b, Integer.valueOf(ru0Var.f79578d)));
                i2++;
            } else if (arrayList.size() == 1) {
                return listApplyExclusions.get(0);
            }
        }
        ru0 ru0Var2 = this.f85929c.get(arrayList);
        if (ru0Var2 != null) {
            return ru0Var2;
        }
        ru0 ru0VarSelectWeighted = selectWeighted(listApplyExclusions.subList(0, arrayList.size()));
        this.f85929c.put(arrayList, ru0VarSelectWeighted);
        return ru0VarSelectWeighted;
    }

    @fdi
    public tu0(Random random) {
        this.f85929c = new HashMap();
        this.f85930d = random;
        this.f85927a = new HashMap();
        this.f85928b = new HashMap();
    }
}
