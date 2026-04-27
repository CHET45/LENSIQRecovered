package p000;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface nr4 {

    /* JADX INFO: renamed from: nr4$a */
    public static class C10020a {

        /* JADX INFO: renamed from: a */
        public final int f65360a;

        /* JADX INFO: renamed from: b */
        @hib
        public final una.C13612b f65361b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<a> f65362c;

        /* JADX INFO: renamed from: nr4$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Handler f65363a;

            /* JADX INFO: renamed from: b */
            public nr4 f65364b;

            public a(Handler handler, nr4 nr4Var) {
                this.f65363a = handler;
                this.f65364b = nr4Var;
            }
        }

        public C10020a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysLoaded$1(nr4 nr4Var) {
            nr4Var.onDrmKeysLoaded(this.f65360a, this.f65361b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysRemoved$4(nr4 nr4Var) {
            nr4Var.onDrmKeysRemoved(this.f65360a, this.f65361b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmKeysRestored$3(nr4 nr4Var) {
            nr4Var.onDrmKeysRestored(this.f65360a, this.f65361b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionAcquired$0(nr4 nr4Var, int i) {
            nr4Var.onDrmSessionAcquired(this.f65360a, this.f65361b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionManagerError$2(nr4 nr4Var, Exception exc) {
            nr4Var.onDrmSessionManagerError(this.f65360a, this.f65361b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$drmSessionReleased$5(nr4 nr4Var) {
            nr4Var.onDrmSessionReleased(this.f65360a, this.f65361b);
        }

        public void addEventListener(Handler handler, nr4 nr4Var) {
            v80.checkNotNull(handler);
            v80.checkNotNull(nr4Var);
            this.f65362c.add(new a(handler, nr4Var));
        }

        public void drmKeysLoaded() {
            for (a aVar : this.f65362c) {
                final nr4 nr4Var = aVar.f65364b;
                t0i.postOrRun(aVar.f65363a, new Runnable() { // from class: kr4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55094a.lambda$drmKeysLoaded$1(nr4Var);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            for (a aVar : this.f65362c) {
                final nr4 nr4Var = aVar.f65364b;
                t0i.postOrRun(aVar.f65363a, new Runnable() { // from class: er4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33880a.lambda$drmKeysRemoved$4(nr4Var);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            for (a aVar : this.f65362c) {
                final nr4 nr4Var = aVar.f65364b;
                t0i.postOrRun(aVar.f65363a, new Runnable() { // from class: gr4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40816a.lambda$drmKeysRestored$3(nr4Var);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int i) {
            for (a aVar : this.f65362c) {
                final nr4 nr4Var = aVar.f65364b;
                t0i.postOrRun(aVar.f65363a, new Runnable() { // from class: ir4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48026a.lambda$drmSessionAcquired$0(nr4Var, i);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            for (a aVar : this.f65362c) {
                final nr4 nr4Var = aVar.f65364b;
                t0i.postOrRun(aVar.f65363a, new Runnable() { // from class: cr4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27126a.lambda$drmSessionManagerError$2(nr4Var, exc);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            for (a aVar : this.f65362c) {
                final nr4 nr4Var = aVar.f65364b;
                t0i.postOrRun(aVar.f65363a, new Runnable() { // from class: mr4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61782a.lambda$drmSessionReleased$5(nr4Var);
                    }
                });
            }
        }

        public void removeEventListener(nr4 nr4Var) {
            for (a aVar : this.f65362c) {
                if (aVar.f65364b == nr4Var) {
                    this.f65362c.remove(aVar);
                }
            }
        }

        @yx1
        public C10020a withParameters(int i, @hib una.C13612b c13612b) {
            return new C10020a(this.f65362c, i, c13612b);
        }

        private C10020a(CopyOnWriteArrayList<a> copyOnWriteArrayList, int i, @hib una.C13612b c13612b) {
            this.f65362c = copyOnWriteArrayList;
            this.f65360a = i;
            this.f65361b = c13612b;
        }
    }

    default void onDrmKeysLoaded(int i, @hib una.C13612b c13612b) {
    }

    default void onDrmKeysRemoved(int i, @hib una.C13612b c13612b) {
    }

    default void onDrmKeysRestored(int i, @hib una.C13612b c13612b) {
    }

    default void onDrmSessionAcquired(int i, @hib una.C13612b c13612b, int i2) {
    }

    default void onDrmSessionManagerError(int i, @hib una.C13612b c13612b, Exception exc) {
    }

    default void onDrmSessionReleased(int i, @hib una.C13612b c13612b) {
    }
}
