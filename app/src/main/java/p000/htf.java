package p000;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class htf {

    /* JADX INFO: renamed from: a */
    public final uta f44849a;

    /* JADX INFO: renamed from: b */
    public final ia9 f44850b;

    /* JADX INFO: renamed from: c */
    public final Executor f44851c;

    /* JADX INFO: renamed from: d */
    public final Activity f44852d;

    /* JADX INFO: renamed from: htf$b */
    public static class C7017b {

        /* JADX INFO: renamed from: a */
        public uta f44853a = uta.EXCLUDE;

        /* JADX INFO: renamed from: b */
        public ia9 f44854b = ia9.DEFAULT;

        /* JADX INFO: renamed from: c */
        public Executor f44855c = z85.f104371b;

        /* JADX INFO: renamed from: d */
        public Activity f44856d = null;

        @efb
        public htf build() {
            return new htf(this);
        }

        @efb
        public C7017b setActivity(@efb Activity activity) {
            x7d.checkNotNull(activity, "activity must not be null.");
            this.f44856d = activity;
            return this;
        }

        @efb
        public C7017b setExecutor(@efb Executor executor) {
            x7d.checkNotNull(executor, "executor must not be null.");
            this.f44855c = executor;
            return this;
        }

        @efb
        public C7017b setMetadataChanges(@efb uta utaVar) {
            x7d.checkNotNull(utaVar, "metadataChanges must not be null.");
            this.f44853a = utaVar;
            return this;
        }

        @efb
        public C7017b setSource(@efb ia9 ia9Var) {
            x7d.checkNotNull(ia9Var, "listen source must not be null.");
            this.f44854b = ia9Var;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || htf.class != obj.getClass()) {
            return false;
        }
        htf htfVar = (htf) obj;
        return this.f44849a == htfVar.f44849a && this.f44850b == htfVar.f44850b && this.f44851c.equals(htfVar.f44851c) && this.f44852d.equals(htfVar.f44852d);
    }

    @hib
    public Activity getActivity() {
        return this.f44852d;
    }

    @efb
    public Executor getExecutor() {
        return this.f44851c;
    }

    @efb
    public uta getMetadataChanges() {
        return this.f44849a;
    }

    @efb
    public ia9 getSource() {
        return this.f44850b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f44849a.hashCode() * 31) + this.f44850b.hashCode()) * 31) + this.f44851c.hashCode()) * 31;
        Activity activity = this.f44852d;
        return iHashCode + (activity != null ? activity.hashCode() : 0);
    }

    public String toString() {
        return "SnapshotListenOptions{metadataChanges=" + this.f44849a + ", source=" + this.f44850b + ", executor=" + this.f44851c + ", activity=" + this.f44852d + '}';
    }

    private htf(C7017b c7017b) {
        this.f44849a = c7017b.f44853a;
        this.f44850b = c7017b.f44854b;
        this.f44851c = c7017b.f44855c;
        this.f44852d = c7017b.f44856d;
    }
}
