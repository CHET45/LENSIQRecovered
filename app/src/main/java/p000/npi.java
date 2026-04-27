package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p000.du2;

/* JADX INFO: loaded from: classes3.dex */
public class npi implements du2.InterfaceC4948a {

    /* JADX INFO: renamed from: d */
    public static final String f65236d = cj9.tagWithPrefix("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a */
    @hib
    public final mpi f65237a;

    /* JADX INFO: renamed from: b */
    public final du2<?>[] f65238b;

    /* JADX INFO: renamed from: c */
    public final Object f65239c;

    public npi(@efb Context context, @efb ong taskExecutor, @hib mpi callback) {
        Context applicationContext = context.getApplicationContext();
        this.f65237a = callback;
        this.f65238b = new du2[]{new bx0(applicationContext, taskExecutor), new dx0(applicationContext, taskExecutor), new j5g(applicationContext, taskExecutor), new fbb(applicationContext, taskExecutor), new hcb(applicationContext, taskExecutor), new nbb(applicationContext, taskExecutor), new lbb(applicationContext, taskExecutor)};
        this.f65239c = new Object();
    }

    public boolean areAllConstraintsMet(@efb String workSpecId) {
        synchronized (this.f65239c) {
            try {
                for (du2<?> du2Var : this.f65238b) {
                    if (du2Var.isWorkSpecConstrained(workSpecId)) {
                        cj9.get().debug(f65236d, String.format("Work %s constrained by %s", workSpecId, du2Var.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.du2.InterfaceC4948a
    public void onConstraintMet(@efb List<String> workSpecIds) {
        synchronized (this.f65239c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : workSpecIds) {
                    if (areAllConstraintsMet(str)) {
                        cj9.get().debug(f65236d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                mpi mpiVar = this.f65237a;
                if (mpiVar != null) {
                    mpiVar.onAllConstraintsMet(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.du2.InterfaceC4948a
    public void onConstraintNotMet(@efb List<String> workSpecIds) {
        synchronized (this.f65239c) {
            try {
                mpi mpiVar = this.f65237a;
                if (mpiVar != null) {
                    mpiVar.onAllConstraintsNotMet(workSpecIds);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void replace(@efb Iterable<oqi> workSpecs) {
        synchronized (this.f65239c) {
            try {
                for (du2<?> du2Var : this.f65238b) {
                    du2Var.setCallback(null);
                }
                for (du2<?> du2Var2 : this.f65238b) {
                    du2Var2.replace(workSpecs);
                }
                for (du2<?> du2Var3 : this.f65238b) {
                    du2Var3.setCallback(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void reset() {
        synchronized (this.f65239c) {
            try {
                for (du2<?> du2Var : this.f65238b) {
                    du2Var.reset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @fdi
    public npi(@hib mpi callback, du2<?>[] controllers) {
        this.f65237a = callback;
        this.f65238b = controllers;
        this.f65239c = new Object();
    }
}
