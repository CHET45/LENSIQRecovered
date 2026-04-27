package p000;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface koa {

    /* JADX INFO: renamed from: koa$a */
    public static class C8476a {

        /* JADX INFO: renamed from: a */
        public final int f54837a;

        /* JADX INFO: renamed from: b */
        @hib
        public final vna.C14175b f54838b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<a> f54839c;

        /* JADX INFO: renamed from: koa$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Handler f54840a;

            /* JADX INFO: renamed from: b */
            public koa f54841b;

            public a(Handler handler, koa koaVar) {
                this.f54840a = handler;
                this.f54841b = koaVar;
            }
        }

        public C8476a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$5(koa koaVar, ega egaVar) {
            koaVar.onDownstreamFormatChanged(this.f54837a, this.f54838b, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$2(koa koaVar, jc9 jc9Var, ega egaVar) {
            koaVar.onLoadCanceled(this.f54837a, this.f54838b, jc9Var, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$1(koa koaVar, jc9 jc9Var, ega egaVar) {
            koaVar.onLoadCompleted(this.f54837a, this.f54838b, jc9Var, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$3(koa koaVar, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
            koaVar.onLoadError(this.f54837a, this.f54838b, jc9Var, egaVar, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$0(koa koaVar, jc9 jc9Var, ega egaVar) {
            koaVar.onLoadStarted(this.f54837a, this.f54838b, jc9Var, egaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$4(koa koaVar, vna.C14175b c14175b, ega egaVar) {
            koaVar.onUpstreamDiscarded(this.f54837a, c14175b, egaVar);
        }

        public void addEventListener(Handler handler, koa koaVar) {
            u80.checkNotNull(handler);
            u80.checkNotNull(koaVar);
            this.f54839c.add(new a(handler, koaVar));
        }

        public void downstreamFormatChanged(int i, @hib kq6 kq6Var, int i2, @hib Object obj, long j) {
            downstreamFormatChanged(new ega(1, i, kq6Var, i2, obj, x0i.usToMs(j), -9223372036854775807L));
        }

        public void loadCanceled(jc9 jc9Var, int i) {
            loadCanceled(jc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadCompleted(jc9 jc9Var, int i) {
            loadCompleted(jc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void loadError(jc9 jc9Var, int i, IOException iOException, boolean z) {
            loadError(jc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void loadStarted(jc9 jc9Var, int i) {
            loadStarted(jc9Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void removeEventListener(koa koaVar) {
            for (a aVar : this.f54839c) {
                if (aVar.f54841b == koaVar) {
                    this.f54839c.remove(aVar);
                }
            }
        }

        public void upstreamDiscarded(int i, long j, long j2) {
            upstreamDiscarded(new ega(1, i, null, 3, null, x0i.usToMs(j), x0i.usToMs(j2)));
        }

        @yx1
        public C8476a withParameters(int i, @hib vna.C14175b c14175b) {
            return new C8476a(this.f54839c, i, c14175b);
        }

        private C8476a(CopyOnWriteArrayList<a> copyOnWriteArrayList, int i, @hib vna.C14175b c14175b) {
            this.f54839c = copyOnWriteArrayList;
            this.f54837a = i;
            this.f54838b = c14175b;
        }

        public void loadCanceled(jc9 jc9Var, int i, int i2, @hib kq6 kq6Var, int i3, @hib Object obj, long j, long j2) {
            loadCanceled(jc9Var, new ega(i, i2, kq6Var, i3, obj, x0i.usToMs(j), x0i.usToMs(j2)));
        }

        public void loadCompleted(jc9 jc9Var, int i, int i2, @hib kq6 kq6Var, int i3, @hib Object obj, long j, long j2) {
            loadCompleted(jc9Var, new ega(i, i2, kq6Var, i3, obj, x0i.usToMs(j), x0i.usToMs(j2)));
        }

        public void loadError(jc9 jc9Var, int i, int i2, @hib kq6 kq6Var, int i3, @hib Object obj, long j, long j2, IOException iOException, boolean z) {
            loadError(jc9Var, new ega(i, i2, kq6Var, i3, obj, x0i.usToMs(j), x0i.usToMs(j2)), iOException, z);
        }

        public void loadStarted(jc9 jc9Var, int i, int i2, @hib kq6 kq6Var, int i3, @hib Object obj, long j, long j2) {
            loadStarted(jc9Var, new ega(i, i2, kq6Var, i3, obj, x0i.usToMs(j), x0i.usToMs(j2)));
        }

        @yx1
        @Deprecated
        public C8476a withParameters(int i, @hib vna.C14175b c14175b, long j) {
            return new C8476a(this.f54839c, i, c14175b);
        }

        public void downstreamFormatChanged(final ega egaVar) {
            for (a aVar : this.f54839c) {
                final koa koaVar = aVar.f54841b;
                x0i.postOrRun(aVar.f54840a, new Runnable() { // from class: goa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40653a.lambda$downstreamFormatChanged$5(koaVar, egaVar);
                    }
                });
            }
        }

        public void upstreamDiscarded(final ega egaVar) {
            final vna.C14175b c14175b = (vna.C14175b) u80.checkNotNull(this.f54838b);
            for (a aVar : this.f54839c) {
                final koa koaVar = aVar.f54841b;
                x0i.postOrRun(aVar.f54840a, new Runnable() { // from class: eoa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33723a.lambda$upstreamDiscarded$4(koaVar, c14175b, egaVar);
                    }
                });
            }
        }

        public void loadCanceled(final jc9 jc9Var, final ega egaVar) {
            for (a aVar : this.f54839c) {
                final koa koaVar = aVar.f54841b;
                x0i.postOrRun(aVar.f54840a, new Runnable() { // from class: aoa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11446a.lambda$loadCanceled$2(koaVar, jc9Var, egaVar);
                    }
                });
            }
        }

        public void loadCompleted(final jc9 jc9Var, final ega egaVar) {
            for (a aVar : this.f54839c) {
                final koa koaVar = aVar.f54841b;
                x0i.postOrRun(aVar.f54840a, new Runnable() { // from class: wna
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94830a.lambda$loadCompleted$1(koaVar, jc9Var, egaVar);
                    }
                });
            }
        }

        public void loadError(final jc9 jc9Var, final ega egaVar, final IOException iOException, final boolean z) {
            for (a aVar : this.f54839c) {
                final koa koaVar = aVar.f54841b;
                x0i.postOrRun(aVar.f54840a, new Runnable() { // from class: yna
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f102342a.lambda$loadError$3(koaVar, jc9Var, egaVar, iOException, z);
                    }
                });
            }
        }

        public void loadStarted(final jc9 jc9Var, final ega egaVar) {
            for (a aVar : this.f54839c) {
                final koa koaVar = aVar.f54841b;
                x0i.postOrRun(aVar.f54840a, new Runnable() { // from class: coa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17235a.lambda$loadStarted$0(koaVar, jc9Var, egaVar);
                    }
                });
            }
        }
    }

    default void onDownstreamFormatChanged(int i, @hib vna.C14175b c14175b, ega egaVar) {
    }

    default void onLoadCanceled(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
    }

    default void onLoadCompleted(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
    }

    default void onLoadError(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar, IOException iOException, boolean z) {
    }

    default void onLoadStarted(int i, @hib vna.C14175b c14175b, jc9 jc9Var, ega egaVar) {
    }

    default void onUpstreamDiscarded(int i, vna.C14175b c14175b, ega egaVar) {
    }
}
