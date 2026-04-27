package p000;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class o4e {

    /* JADX INFO: renamed from: d */
    public static final String f66449d = "RequestTracker";

    /* JADX INFO: renamed from: a */
    public final Set<q3e> f66450a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final Set<q3e> f66451b = new HashSet();

    /* JADX INFO: renamed from: c */
    public boolean f66452c;

    @fdi
    /* JADX INFO: renamed from: a */
    public void m18345a(q3e q3eVar) {
        this.f66450a.add(q3eVar);
    }

    public boolean clearAndRemove(@hib q3e q3eVar) {
        boolean z = true;
        if (q3eVar == null) {
            return true;
        }
        boolean zRemove = this.f66450a.remove(q3eVar);
        if (!this.f66451b.remove(q3eVar) && !zRemove) {
            z = false;
        }
        if (z) {
            q3eVar.clear();
        }
        return z;
    }

    public void clearRequests() {
        Iterator it = v0i.getSnapshot(this.f66450a).iterator();
        while (it.hasNext()) {
            clearAndRemove((q3e) it.next());
        }
        this.f66451b.clear();
    }

    public boolean isPaused() {
        return this.f66452c;
    }

    public void pauseAllRequests() {
        this.f66452c = true;
        for (q3e q3eVar : v0i.getSnapshot(this.f66450a)) {
            if (q3eVar.isRunning() || q3eVar.isComplete()) {
                q3eVar.clear();
                this.f66451b.add(q3eVar);
            }
        }
    }

    public void pauseRequests() {
        this.f66452c = true;
        for (q3e q3eVar : v0i.getSnapshot(this.f66450a)) {
            if (q3eVar.isRunning()) {
                q3eVar.pause();
                this.f66451b.add(q3eVar);
            }
        }
    }

    public void restartRequests() {
        for (q3e q3eVar : v0i.getSnapshot(this.f66450a)) {
            if (!q3eVar.isComplete() && !q3eVar.isCleared()) {
                q3eVar.clear();
                if (this.f66452c) {
                    this.f66451b.add(q3eVar);
                } else {
                    q3eVar.begin();
                }
            }
        }
    }

    public void resumeRequests() {
        this.f66452c = false;
        for (q3e q3eVar : v0i.getSnapshot(this.f66450a)) {
            if (!q3eVar.isComplete() && !q3eVar.isRunning()) {
                q3eVar.begin();
            }
        }
        this.f66451b.clear();
    }

    public void runRequest(@efb q3e q3eVar) {
        this.f66450a.add(q3eVar);
        if (!this.f66452c) {
            q3eVar.begin();
            return;
        }
        q3eVar.clear();
        Log.isLoggable(f66449d, 2);
        this.f66451b.add(q3eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f66450a.size() + ", isPaused=" + this.f66452c + "}";
    }
}
