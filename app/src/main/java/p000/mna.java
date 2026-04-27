package p000;

import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class mna {

    /* JADX INFO: renamed from: e */
    public static final int f61553e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f61554f = 2;

    /* JADX INFO: renamed from: g */
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f61555g = "androidx.mediarouter.media.MediaRouterParams.TEST_PRIVATE_UI";

    /* JADX INFO: renamed from: a */
    public final int f61556a;

    /* JADX INFO: renamed from: b */
    public final boolean f61557b;

    /* JADX INFO: renamed from: c */
    public final boolean f61558c;

    /* JADX INFO: renamed from: d */
    public final Bundle f61559d;

    /* JADX INFO: renamed from: mna$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC9425b {
    }

    public mna(@efb C9424a c9424a) {
        this.f61556a = c9424a.f61560a;
        this.f61557b = c9424a.f61561b;
        this.f61558c = c9424a.f61562c;
        Bundle bundle = c9424a.f61563d;
        this.f61559d = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }

    public int getDialogType() {
        return this.f61556a;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69934a})
    public Bundle getExtras() {
        return this.f61559d;
    }

    public boolean isOutputSwitcherEnabled() {
        return this.f61557b;
    }

    public boolean isTransferToLocalEnabled() {
        return this.f61558c;
    }

    /* JADX INFO: renamed from: mna$a */
    public static final class C9424a {

        /* JADX INFO: renamed from: a */
        public int f61560a;

        /* JADX INFO: renamed from: b */
        public boolean f61561b;

        /* JADX INFO: renamed from: c */
        public boolean f61562c;

        /* JADX INFO: renamed from: d */
        public Bundle f61563d;

        public C9424a() {
            this.f61560a = 1;
        }

        @efb
        public mna build() {
            return new mna(this);
        }

        @efb
        public C9424a setDialogType(int i) {
            this.f61560a = i;
            return this;
        }

        @efb
        @p7e({p7e.EnumC10826a.f69934a})
        public C9424a setExtras(@hib Bundle bundle) {
            this.f61563d = bundle == null ? null : new Bundle(bundle);
            return this;
        }

        @efb
        public C9424a setOutputSwitcherEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f61561b = z;
            }
            return this;
        }

        @efb
        public C9424a setTransferToLocalEnabled(boolean z) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f61562c = z;
            }
            return this;
        }

        public C9424a(@efb mna mnaVar) {
            this.f61560a = 1;
            if (mnaVar != null) {
                this.f61560a = mnaVar.f61556a;
                this.f61561b = mnaVar.f61557b;
                this.f61562c = mnaVar.f61558c;
                this.f61563d = mnaVar.f61559d == null ? null : new Bundle(mnaVar.f61559d);
                return;
            }
            throw new NullPointerException("params should not be null!");
        }
    }
}
