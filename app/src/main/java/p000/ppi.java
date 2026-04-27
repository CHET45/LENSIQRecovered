package p000;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.e5c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class ppi extends opi {

    /* JADX INFO: renamed from: j */
    public static final String f71624j = cj9.tagWithPrefix("WorkContinuationImpl");

    /* JADX INFO: renamed from: a */
    public final zpi f71625a;

    /* JADX INFO: renamed from: b */
    public final String f71626b;

    /* JADX INFO: renamed from: c */
    public final s95 f71627c;

    /* JADX INFO: renamed from: d */
    public final List<? extends lqi> f71628d;

    /* JADX INFO: renamed from: e */
    public final List<String> f71629e;

    /* JADX INFO: renamed from: f */
    public final List<String> f71630f;

    /* JADX INFO: renamed from: g */
    public final List<ppi> f71631g;

    /* JADX INFO: renamed from: h */
    public boolean f71632h;

    /* JADX INFO: renamed from: i */
    public x5c f71633i;

    public ppi(@efb zpi workManagerImpl, @efb List<? extends lqi> work) {
        this(workManagerImpl, null, s95.KEEP, work, null);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static Set<String> prerequisitesFor(ppi continuation) {
        HashSet hashSet = new HashSet();
        List<ppi> parents = continuation.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<ppi> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }

    @Override // p000.opi
    @efb
    /* JADX INFO: renamed from: a */
    public opi mo18808a(@efb List<opi> continuations) {
        e5c e5cVarBuild = new e5c.C5124a(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(continuations.size());
        Iterator<opi> it = continuations.iterator();
        while (it.hasNext()) {
            arrayList.add((ppi) it.next());
        }
        return new ppi(this.f71625a, null, s95.KEEP, Collections.singletonList(e5cVarBuild), arrayList);
    }

    @Override // p000.opi
    @efb
    public x5c enqueue() {
        if (this.f71632h) {
            cj9.get().warning(f71624j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f71629e)), new Throwable[0]);
        } else {
            n25 n25Var = new n25(this);
            this.f71625a.getWorkTaskExecutor().executeOnBackgroundThread(n25Var);
            this.f71633i = n25Var.getOperation();
        }
        return this.f71633i;
    }

    public List<String> getAllIds() {
        return this.f71630f;
    }

    public s95 getExistingWorkPolicy() {
        return this.f71627c;
    }

    @efb
    public List<String> getIds() {
        return this.f71629e;
    }

    @hib
    public String getName() {
        return this.f71626b;
    }

    public List<ppi> getParents() {
        return this.f71631g;
    }

    @efb
    public List<? extends lqi> getWork() {
        return this.f71628d;
    }

    @Override // p000.opi
    @efb
    public ja9<List<tpi>> getWorkInfos() {
        u4g<List<tpi>> u4gVarForStringIds = u4g.forStringIds(this.f71625a, this.f71630f);
        this.f71625a.getWorkTaskExecutor().executeOnBackgroundThread(u4gVarForStringIds);
        return u4gVarForStringIds.getFuture();
    }

    @Override // p000.opi
    @efb
    public AbstractC1158q<List<tpi>> getWorkInfosLiveData() {
        return this.f71625a.m26950a(this.f71630f);
    }

    @efb
    public zpi getWorkManagerImpl() {
        return this.f71625a;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public boolean hasCycles() {
        return hasCycles(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.f71632h;
    }

    public void markEnqueued() {
        this.f71632h = true;
    }

    @Override // p000.opi
    @efb
    public opi then(@efb List<e5c> work) {
        return work.isEmpty() ? this : new ppi(this.f71625a, this.f71626b, s95.KEEP, work, Collections.singletonList(this));
    }

    public ppi(@efb zpi workManagerImpl, @hib String name, @efb s95 existingWorkPolicy, @efb List<? extends lqi> work) {
        this(workManagerImpl, name, existingWorkPolicy, work, null);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    private static boolean hasCycles(@efb ppi continuation, @efb Set<String> visited) {
        visited.addAll(continuation.getIds());
        Set<String> setPrerequisitesFor = prerequisitesFor(continuation);
        Iterator<String> it = visited.iterator();
        while (it.hasNext()) {
            if (setPrerequisitesFor.contains(it.next())) {
                return true;
            }
        }
        List<ppi> parents = continuation.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<ppi> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (hasCycles(it2.next(), visited)) {
                    return true;
                }
            }
        }
        visited.removeAll(continuation.getIds());
        return false;
    }

    public ppi(@efb zpi workManagerImpl, @hib String name, @efb s95 existingWorkPolicy, @efb List<? extends lqi> work, @hib List<ppi> parents) {
        this.f71625a = workManagerImpl;
        this.f71626b = name;
        this.f71627c = existingWorkPolicy;
        this.f71628d = work;
        this.f71631g = parents;
        this.f71629e = new ArrayList(work.size());
        this.f71630f = new ArrayList();
        if (parents != null) {
            Iterator<ppi> it = parents.iterator();
            while (it.hasNext()) {
                this.f71630f.addAll(it.next().f71630f);
            }
        }
        for (int i = 0; i < work.size(); i++) {
            String stringId = work.get(i).getStringId();
            this.f71629e.add(stringId);
            this.f71630f.add(stringId);
        }
    }
}
