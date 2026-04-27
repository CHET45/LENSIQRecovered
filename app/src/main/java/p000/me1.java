package p000;

import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p000.p7e;

/* JADX INFO: loaded from: classes4.dex */
public final class me1<T> {

    /* JADX INFO: renamed from: a */
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    public final Executor f60730a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Executor f60731b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final DiffUtil.ItemCallback<T> f60732c;

    /* JADX INFO: renamed from: me1$a */
    public static final class C9325a<T> {

        /* JADX INFO: renamed from: e */
        public static Executor f60734e;

        /* JADX INFO: renamed from: a */
        public Executor f60736a;

        /* JADX INFO: renamed from: b */
        public Executor f60737b;

        /* JADX INFO: renamed from: c */
        public final DiffUtil.ItemCallback<T> f60738c;

        /* JADX INFO: renamed from: f */
        public static final a f60735f = new a(null);

        /* JADX INFO: renamed from: d */
        public static final Object f60733d = new Object();

        /* JADX INFO: renamed from: me1$a$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }
        }

        public C9325a(@yfb DiffUtil.ItemCallback<T> itemCallback) {
            md8.checkParameterIsNotNull(itemCallback, "mDiffCallback");
            this.f60738c = itemCallback;
        }

        @yfb
        public final me1<T> build() {
            if (this.f60737b == null) {
                synchronized (f60733d) {
                    try {
                        if (f60734e == null) {
                            f60734e = Executors.newFixedThreadPool(2);
                        }
                        bth bthVar = bth.f14751a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f60737b = f60734e;
            }
            Executor executor = this.f60736a;
            Executor executor2 = this.f60737b;
            if (executor2 == null) {
                md8.throwNpe();
            }
            return new me1<>(executor, executor2, this.f60738c);
        }

        @yfb
        public final C9325a<T> setBackgroundThreadExecutor(@gib Executor executor) {
            this.f60737b = executor;
            return this;
        }

        @yfb
        public final C9325a<T> setMainThreadExecutor(@gib Executor executor) {
            this.f60736a = executor;
            return this;
        }
    }

    public me1(@gib Executor executor, @yfb Executor executor2, @yfb DiffUtil.ItemCallback<T> itemCallback) {
        md8.checkParameterIsNotNull(executor2, "backgroundThreadExecutor");
        md8.checkParameterIsNotNull(itemCallback, "diffCallback");
        this.f60730a = executor;
        this.f60731b = executor2;
        this.f60732c = itemCallback;
    }

    @yfb
    public final Executor getBackgroundThreadExecutor() {
        return this.f60731b;
    }

    @yfb
    public final DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.f60732c;
    }

    @gib
    public final Executor getMainThreadExecutor() {
        return this.f60730a;
    }
}
