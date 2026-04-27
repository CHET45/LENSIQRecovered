package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.C3603f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.uyh;

/* JADX INFO: loaded from: classes5.dex */
public class cdh {

    /* JADX INFO: renamed from: g */
    public static final Executor f16313g = createDefaultExecutor();

    /* JADX INFO: renamed from: a */
    public final zi3 f16314a;

    /* JADX INFO: renamed from: d */
    public boolean f16317d;

    /* JADX INFO: renamed from: e */
    public C3603f f16318e;

    /* JADX INFO: renamed from: b */
    public final HashMap<ci4, euf> f16315b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<m7b> f16316c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public Set<ci4> f16319f = new HashSet();

    public cdh(zi3 zi3Var) {
        this.f16314a = zi3Var;
    }

    private static Executor createDefaultExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private void ensureCommitNotCalled() {
        r80.hardAssert(!this.f16317d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    public static Executor getDefaultExecutor() {
        return f16313g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$commit$1(Task task) throws Exception {
        return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$lookup$0(Task task) throws Exception {
        if (task.isSuccessful()) {
            Iterator it = ((List) task.getResult()).iterator();
            while (it.hasNext()) {
                recordVersion((t4b) it.next());
            }
        }
        return task;
    }

    private n7d precondition(ci4 ci4Var) {
        euf eufVar = this.f16315b.get(ci4Var);
        return (this.f16319f.contains(ci4Var) || eufVar == null) ? n7d.f63462c : eufVar.equals(euf.f34067b) ? n7d.exists(false) : n7d.updateTime(eufVar);
    }

    private n7d preconditionForUpdate(ci4 ci4Var) throws C3603f {
        euf eufVar = this.f16315b.get(ci4Var);
        if (this.f16319f.contains(ci4Var) || eufVar == null) {
            return n7d.exists(true);
        }
        if (eufVar.equals(euf.f34067b)) {
            throw new C3603f("Can't update a document that doesn't exist.", C3603f.a.INVALID_ARGUMENT);
        }
        return n7d.updateTime(eufVar);
    }

    private void recordVersion(t4b t4bVar) throws C3603f {
        euf version;
        if (t4bVar.isFoundDocument()) {
            version = t4bVar.getVersion();
        } else {
            if (!t4bVar.isNoDocument()) {
                throw r80.fail("Unexpected document type in transaction: " + t4bVar, new Object[0]);
            }
            version = euf.f34067b;
        }
        if (!this.f16315b.containsKey(t4bVar.getKey())) {
            this.f16315b.put(t4bVar.getKey(), version);
        } else if (!this.f16315b.get(t4bVar.getKey()).equals(t4bVar.getVersion())) {
            throw new C3603f("Document version changed between two reads.", C3603f.a.ABORTED);
        }
    }

    private void write(List<m7b> list) {
        ensureCommitNotCalled();
        this.f16316c.addAll(list);
    }

    public Task<Void> commit() {
        ensureCommitNotCalled();
        C3603f c3603f = this.f16318e;
        if (c3603f != null) {
            return Tasks.forException(c3603f);
        }
        HashSet<ci4> hashSet = new HashSet(this.f16315b.keySet());
        Iterator<m7b> it = this.f16316c.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().getKey());
        }
        for (ci4 ci4Var : hashSet) {
            this.f16316c.add(new u4i(ci4Var, precondition(ci4Var)));
        }
        this.f16317d = true;
        return this.f16314a.commit(this.f16316c).continueWithTask(z85.f104372c, new Continuation() { // from class: bdh
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return cdh.lambda$commit$1(task);
            }
        });
    }

    public void delete(ci4 ci4Var) {
        write(Collections.singletonList(new c54(ci4Var, precondition(ci4Var))));
        this.f16319f.add(ci4Var);
    }

    public Task<List<t4b>> lookup(List<ci4> list) {
        ensureCommitNotCalled();
        return this.f16316c.size() != 0 ? Tasks.forException(new C3603f("Firestore transactions require all reads to be executed before all writes.", C3603f.a.INVALID_ARGUMENT)) : this.f16314a.lookup(list).continueWithTask(z85.f104372c, new Continuation() { // from class: zch
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.f104808a.lambda$lookup$0(task);
            }
        });
    }

    public void set(ci4 ci4Var, uyh.C13798d c13798d) {
        write(Collections.singletonList(c13798d.toMutation(ci4Var, precondition(ci4Var))));
        this.f16319f.add(ci4Var);
    }

    public void update(ci4 ci4Var, uyh.C13799e c13799e) {
        try {
            write(Collections.singletonList(c13799e.toMutation(ci4Var, preconditionForUpdate(ci4Var))));
        } catch (C3603f e) {
            this.f16318e = e;
        }
        this.f16319f.add(ci4Var);
    }
}
