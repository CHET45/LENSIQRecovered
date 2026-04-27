package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class rsh {

    /* JADX INFO: renamed from: b */
    public final List<Integer> f79401b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final cm4 f79402c = new C12267a();

    /* JADX INFO: renamed from: a */
    public final SparseArray<ArrayList<cm4>> f79400a = new SparseArray<>();

    /* JADX INFO: renamed from: rsh$a */
    public class C12267a implements cm4 {
        public C12267a() {
        }

        @Override // p000.cm4
        public void connectEnd(@efb cn4 cn4Var, int i, int i2, @efb Map<String, List<String>> map) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.connectEnd(cn4Var, i, i2, map);
                }
            }
        }

        @Override // p000.cm4
        public void connectStart(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.connectStart(cn4Var, i, map);
                }
            }
        }

        @Override // p000.cm4
        public void connectTrialEnd(@efb cn4 cn4Var, int i, @efb Map<String, List<String>> map) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.connectTrialEnd(cn4Var, i, map);
                }
            }
        }

        @Override // p000.cm4
        public void connectTrialStart(@efb cn4 cn4Var, @efb Map<String, List<String>> map) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.connectTrialStart(cn4Var, map);
                }
            }
        }

        @Override // p000.cm4
        public void downloadFromBeginning(@efb cn4 cn4Var, @efb bd1 bd1Var, @efb c8e c8eVar) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.downloadFromBeginning(cn4Var, bd1Var, c8eVar);
                }
            }
        }

        @Override // p000.cm4
        public void downloadFromBreakpoint(@efb cn4 cn4Var, @efb bd1 bd1Var) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.downloadFromBreakpoint(cn4Var, bd1Var);
                }
            }
        }

        @Override // p000.cm4
        public void fetchEnd(@efb cn4 cn4Var, int i, long j) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.fetchEnd(cn4Var, i, j);
                }
            }
        }

        @Override // p000.cm4
        public void fetchProgress(@efb cn4 cn4Var, int i, long j) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.fetchProgress(cn4Var, i, j);
                }
            }
        }

        @Override // p000.cm4
        public void fetchStart(@efb cn4 cn4Var, int i, long j) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.fetchStart(cn4Var, i, j);
                }
            }
        }

        @Override // p000.cm4
        public void taskEnd(@efb cn4 cn4Var, @efb x15 x15Var, @hib Exception exc) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.taskEnd(cn4Var, x15Var, exc);
                }
            }
            if (rsh.this.f79401b.contains(Integer.valueOf(cn4Var.getId()))) {
                rsh.this.detachListener(cn4Var.getId());
            }
        }

        @Override // p000.cm4
        public void taskStart(@efb cn4 cn4Var) {
            cm4[] threadSafeArray = rsh.getThreadSafeArray(cn4Var, rsh.this.f79400a);
            if (threadSafeArray == null) {
                return;
            }
            for (cm4 cm4Var : threadSafeArray) {
                if (cm4Var != null) {
                    cm4Var.taskStart(cn4Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static cm4[] getThreadSafeArray(cn4 cn4Var, SparseArray<ArrayList<cm4>> sparseArray) {
        ArrayList<cm4> arrayList = sparseArray.get(cn4Var.getId());
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        cm4[] cm4VarArr = new cm4[arrayList.size()];
        arrayList.toArray(cm4VarArr);
        return cm4VarArr;
    }

    public synchronized void addAutoRemoveListenersWhenTaskEnd(int i) {
        if (this.f79401b.contains(Integer.valueOf(i))) {
            return;
        }
        this.f79401b.add(Integer.valueOf(i));
    }

    public synchronized void attachAndEnqueueIfNotRun(@efb cn4 cn4Var, @efb cm4 cm4Var) {
        attachListener(cn4Var, cm4Var);
        if (!m21511b(cn4Var)) {
            cn4Var.enqueue(this.f79402c);
        }
    }

    public synchronized void attachListener(@efb cn4 cn4Var, @efb cm4 cm4Var) {
        try {
            int id = cn4Var.getId();
            ArrayList<cm4> arrayList = this.f79400a.get(id);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f79400a.put(id, arrayList);
            }
            if (!arrayList.contains(cm4Var)) {
                arrayList.add(cm4Var);
                if (cm4Var instanceof qa9) {
                    ((qa9) cm4Var).setAlwaysRecoverAssistModelIfNotSet(true);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m21511b(@efb cn4 cn4Var) {
        return w4g.isSameTaskPendingOrRunning(cn4Var);
    }

    public synchronized void detachListener(int i) {
        this.f79400a.remove(i);
    }

    public synchronized void enqueueTaskWithUnifiedListener(@efb cn4 cn4Var, @efb cm4 cm4Var) {
        attachListener(cn4Var, cm4Var);
        cn4Var.enqueue(this.f79402c);
    }

    public synchronized void executeTaskWithUnifiedListener(@efb cn4 cn4Var, @efb cm4 cm4Var) {
        attachListener(cn4Var, cm4Var);
        cn4Var.execute(this.f79402c);
    }

    @efb
    public cm4 getHostListener() {
        return this.f79402c;
    }

    public synchronized void removeAutoRemoveListenersWhenTaskEnd(int i) {
        this.f79401b.remove(Integer.valueOf(i));
    }

    public synchronized void detachListener(cm4 cm4Var) {
        try {
            int size = this.f79400a.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                ArrayList<cm4> arrayListValueAt = this.f79400a.valueAt(i);
                if (arrayListValueAt != null) {
                    arrayListValueAt.remove(cm4Var);
                    if (arrayListValueAt.isEmpty()) {
                        arrayList.add(Integer.valueOf(this.f79400a.keyAt(i)));
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f79400a.remove(((Integer) it.next()).intValue());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean detachListener(@efb cn4 cn4Var, cm4 cm4Var) {
        int id = cn4Var.getId();
        ArrayList<cm4> arrayList = this.f79400a.get(id);
        if (arrayList == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(cm4Var);
        if (arrayList.isEmpty()) {
            this.f79400a.remove(id);
        }
        return zRemove;
    }
}
