package p000;

import androidx.lifecycle.AbstractC1158q;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public interface x5c {

    /* JADX INFO: renamed from: a */
    @igg({"SyntheticAccessor"})
    @p7e({p7e.EnumC10826a.f69935b})
    public static final AbstractC14928b.c f96833a;

    /* JADX INFO: renamed from: b */
    @igg({"SyntheticAccessor"})
    @p7e({p7e.EnumC10826a.f69935b})
    public static final AbstractC14928b.b f96834b;

    /* JADX INFO: renamed from: x5c$b */
    public static abstract class AbstractC14928b {

        /* JADX INFO: renamed from: x5c$b$a */
        public static final class a extends AbstractC14928b {

            /* JADX INFO: renamed from: a */
            public final Throwable f96835a;

            public a(@efb Throwable exception) {
                this.f96835a = exception;
            }

            @efb
            public Throwable getThrowable() {
                return this.f96835a;
            }

            @efb
            public String toString() {
                return String.format("FAILURE (%s)", this.f96835a.getMessage());
            }
        }

        /* JADX INFO: renamed from: x5c$b$b */
        public static final class b extends AbstractC14928b {
            @efb
            public String toString() {
                return "IN_PROGRESS";
            }

            private b() {
            }
        }

        /* JADX INFO: renamed from: x5c$b$c */
        public static final class c extends AbstractC14928b {
            @efb
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        @p7e({p7e.EnumC10826a.f69935b})
        public AbstractC14928b() {
        }
    }

    static {
        f96833a = new AbstractC14928b.c();
        f96834b = new AbstractC14928b.b();
    }

    @efb
    ja9<AbstractC14928b.c> getResult();

    @efb
    AbstractC1158q<AbstractC14928b> getState();
}
