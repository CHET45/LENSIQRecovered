package p000;

import android.os.Handler;
import androidx.media3.common.C1213a;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface joa {

    /* JADX INFO: renamed from: joa$a */
    public static class C7994a {

        /* JADX INFO: renamed from: a */
        public final int f51350a;

        /* JADX INFO: renamed from: b */
        @hib
        public final una.C13612b f51351b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<a> f51352c;

        /* JADX INFO: renamed from: joa$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Handler f51353a;

            /* JADX INFO: renamed from: b */
            public joa f51354b;

            public a(Handler handler, joa joaVar) {
                this.f51353a = handler;
                this.f51354b = joaVar;
            }
        }

        public C7994a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$5(fga fgaVar, joa joaVar) {
            joaVar.onDownstreamFormatChanged(this.f51350a, this.f51351b, fgaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$2(kc9 kc9Var, fga fgaVar, joa joaVar) {
            joaVar.onLoadCanceled(this.f51350a, this.f51351b, kc9Var, fgaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$1(kc9 kc9Var, fga fgaVar, joa joaVar) {
            joaVar.onLoadCompleted(this.f51350a, this.f51351b, kc9Var, fgaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$3(kc9 kc9Var, fga fgaVar, IOException iOException, boolean z, joa joaVar) {
            joaVar.onLoadError(this.f51350a, this.f51351b, kc9Var, fgaVar, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$0(kc9 kc9Var, fga fgaVar, int i, joa joaVar) {
            joaVar.onLoadStarted(this.f51350a, this.f51351b, kc9Var, fgaVar, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$4(una.C13612b c13612b, fga fgaVar, joa joaVar) {
            joaVar.onUpstreamDiscarded(this.f51350a, c13612b, fgaVar);
        }

        public void addEventListener(Handler handler, joa joaVar) {
            v80.checkNotNull(handler);
            v80.checkNotNull(joaVar);
            this.f51352c.add(new a(handler, joaVar));
        }

        public void dispatchEvent(final qu2<joa> qu2Var) {
            for (a aVar : this.f51352c) {
                final joa joaVar = aVar.f51354b;
                t0i.postOrRun(aVar.f51353a, new Runnable() { // from class: ioa
                    @Override // java.lang.Runnable
                    public final void run() {
                        qu2Var.accept(joaVar);
                    }
                });
            }
        }

        public void downstreamFormatChanged(int i, @hib C1213a c1213a, int i2, @hib Object obj, long j) {
            downstreamFormatChanged(new fga(1, i, c1213a, i2, obj, t0i.usToMs(j), -9223372036854775807L));
        }

        public void loadCanceled(kc9 kc9Var, int i) {
            loadCanceled(kc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(kc9 kc9Var, int i) {
            loadCompleted(kc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadError(kc9 kc9Var, int i, IOException iOException, boolean z) {
            loadError(kc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        @Deprecated
        public void loadStarted(kc9 kc9Var, int i) {
            loadStarted(kc9Var, i, 0);
        }

        public void removeEventListener(joa joaVar) {
            for (a aVar : this.f51352c) {
                if (aVar.f51354b == joaVar) {
                    this.f51352c.remove(aVar);
                }
            }
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new fga(1, i, null, 3, null, t0i.usToMs(j), t0i.usToMs(j2)));
        }

        @yx1
        public C7994a withParameters(int i, @hib una.C13612b c13612b) {
            return new C7994a(this.f51352c, i, c13612b);
        }

        private C7994a(CopyOnWriteArrayList<a> copyOnWriteArrayList, int i, @hib una.C13612b c13612b) {
            this.f51352c = copyOnWriteArrayList;
            this.f51350a = i;
            this.f51351b = c13612b;
        }

        public void loadCanceled(kc9 kc9Var, int i, int i2, @hib C1213a c1213a, int i3, @hib Object obj, long j, long j2) {
            loadCanceled(kc9Var, new fga(i, i2, c1213a, i3, obj, t0i.usToMs(j), t0i.usToMs(j2)));
        }

        public void loadCompleted(kc9 kc9Var, int i, int i2, @hib C1213a c1213a, int i3, @hib Object obj, long j, long j2) {
            loadCompleted(kc9Var, new fga(i, i2, c1213a, i3, obj, t0i.usToMs(j), t0i.usToMs(j2)));
        }

        public void loadError(kc9 kc9Var, int i, int i2, @hib C1213a c1213a, int i3, @hib Object obj, long j, long j2, IOException iOException, boolean z) {
            loadError(kc9Var, new fga(i, i2, c1213a, i3, obj, t0i.usToMs(j), t0i.usToMs(j2)), iOException, z);
        }

        public void loadStarted(kc9 kc9Var, int i, int i2) {
            loadStarted(kc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i2);
        }

        @yx1
        @Deprecated
        public C7994a withParameters(int i, @hib una.C13612b c13612b, long j) {
            return new C7994a(this.f51352c, i, c13612b);
        }

        @Deprecated
        public void loadStarted(kc9 kc9Var, int i, int i2, @hib C1213a c1213a, int i3, @hib Object obj, long j, long j2) {
            loadStarted(kc9Var, new fga(i, i2, c1213a, i3, obj, t0i.usToMs(j), t0i.usToMs(j2)));
        }

        public void downstreamFormatChanged(final fga fgaVar) {
            dispatchEvent(new qu2() { // from class: xna
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f98572a.lambda$downstreamFormatChanged$5(fgaVar, (joa) obj);
                }
            });
        }

        public void upstreamDiscarded(final fga fgaVar) {
            final una.C13612b c13612b = (una.C13612b) v80.checkNotNull(this.f51351b);
            dispatchEvent(new qu2() { // from class: hoa
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f44405a.lambda$upstreamDiscarded$4(c13612b, fgaVar, (joa) obj);
                }
            });
        }

        public void loadCanceled(final kc9 kc9Var, final fga fgaVar) {
            dispatchEvent(new qu2() { // from class: foa
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f37243a.lambda$loadCanceled$2(kc9Var, fgaVar, (joa) obj);
                }
            });
        }

        public void loadCompleted(final kc9 kc9Var, final fga fgaVar) {
            dispatchEvent(new qu2() { // from class: boa
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f14250a.lambda$loadCompleted$1(kc9Var, fgaVar, (joa) obj);
                }
            });
        }

        public void loadError(final kc9 kc9Var, final fga fgaVar, final IOException iOException, final boolean z) {
            dispatchEvent(new qu2() { // from class: doa
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f30270a.lambda$loadError$3(kc9Var, fgaVar, iOException, z, (joa) obj);
                }
            });
        }

        public void loadStarted(kc9 kc9Var, int i, int i2, @hib C1213a c1213a, int i3, @hib Object obj, long j, long j2, int i4) {
            loadStarted(kc9Var, new fga(i, i2, c1213a, i3, obj, t0i.usToMs(j), t0i.usToMs(j2)), i4);
        }

        @Deprecated
        public void loadStarted(kc9 kc9Var, fga fgaVar) {
            loadStarted(kc9Var, fgaVar, 0);
        }

        public void loadStarted(final kc9 kc9Var, final fga fgaVar, final int i) {
            dispatchEvent(new qu2() { // from class: zna
                @Override // p000.qu2
                public final void accept(Object obj) {
                    this.f105509a.lambda$loadStarted$0(kc9Var, fgaVar, i, (joa) obj);
                }
            });
        }
    }

    default void onDownstreamFormatChanged(int i, @hib una.C13612b c13612b, fga fgaVar) {
    }

    default void onLoadCanceled(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar) {
    }

    default void onLoadCompleted(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar) {
    }

    default void onLoadError(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar, IOException iOException, boolean z) {
    }

    default void onLoadStarted(int i, @hib una.C13612b c13612b, kc9 kc9Var, fga fgaVar, int i2) {
    }

    default void onUpstreamDiscarded(int i, una.C13612b c13612b, fga fgaVar) {
    }
}
