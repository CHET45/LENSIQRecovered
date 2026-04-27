package p000;

import android.net.Uri;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class lu2 {

    /* JADX INFO: renamed from: i */
    public static final lu2 f58744i = new C8974a().build();

    /* JADX INFO: renamed from: a */
    @ab2(name = "required_network_type")
    public wbb f58745a;

    /* JADX INFO: renamed from: b */
    @ab2(name = "requires_charging")
    public boolean f58746b;

    /* JADX INFO: renamed from: c */
    @ab2(name = "requires_device_idle")
    public boolean f58747c;

    /* JADX INFO: renamed from: d */
    @ab2(name = "requires_battery_not_low")
    public boolean f58748d;

    /* JADX INFO: renamed from: e */
    @ab2(name = "requires_storage_not_low")
    public boolean f58749e;

    /* JADX INFO: renamed from: f */
    @ab2(name = "trigger_content_update_delay")
    public long f58750f;

    /* JADX INFO: renamed from: g */
    @ab2(name = "trigger_max_content_delay")
    public long f58751g;

    /* JADX INFO: renamed from: h */
    @ab2(name = "content_uri_triggers")
    public bx2 f58752h;

    /* JADX INFO: renamed from: lu2$a */
    public static final class C8974a {

        /* JADX INFO: renamed from: a */
        public boolean f58753a;

        /* JADX INFO: renamed from: b */
        public boolean f58754b;

        /* JADX INFO: renamed from: c */
        public wbb f58755c;

        /* JADX INFO: renamed from: d */
        public boolean f58756d;

        /* JADX INFO: renamed from: e */
        public boolean f58757e;

        /* JADX INFO: renamed from: f */
        public long f58758f;

        /* JADX INFO: renamed from: g */
        public long f58759g;

        /* JADX INFO: renamed from: h */
        public bx2 f58760h;

        public C8974a() {
            this.f58753a = false;
            this.f58754b = false;
            this.f58755c = wbb.NOT_REQUIRED;
            this.f58756d = false;
            this.f58757e = false;
            this.f58758f = -1L;
            this.f58759g = -1L;
            this.f58760h = new bx2();
        }

        @c5e(24)
        @efb
        public C8974a addContentUriTrigger(@efb Uri uri, boolean triggerForDescendants) {
            this.f58760h.add(uri, triggerForDescendants);
            return this;
        }

        @efb
        public lu2 build() {
            return new lu2(this);
        }

        @efb
        public C8974a setRequiredNetworkType(@efb wbb networkType) {
            this.f58755c = networkType;
            return this;
        }

        @efb
        public C8974a setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
            this.f58756d = requiresBatteryNotLow;
            return this;
        }

        @efb
        public C8974a setRequiresCharging(boolean requiresCharging) {
            this.f58753a = requiresCharging;
            return this;
        }

        @c5e(23)
        @efb
        public C8974a setRequiresDeviceIdle(boolean requiresDeviceIdle) {
            this.f58754b = requiresDeviceIdle;
            return this;
        }

        @efb
        public C8974a setRequiresStorageNotLow(boolean requiresStorageNotLow) {
            this.f58757e = requiresStorageNotLow;
            return this;
        }

        @c5e(24)
        @efb
        public C8974a setTriggerContentMaxDelay(long duration, @efb TimeUnit timeUnit) {
            this.f58759g = timeUnit.toMillis(duration);
            return this;
        }

        @c5e(24)
        @efb
        public C8974a setTriggerContentUpdateDelay(long duration, @efb TimeUnit timeUnit) {
            this.f58758f = timeUnit.toMillis(duration);
            return this;
        }

        @c5e(26)
        @efb
        public C8974a setTriggerContentMaxDelay(Duration duration) {
            this.f58759g = duration.toMillis();
            return this;
        }

        @c5e(26)
        @efb
        public C8974a setTriggerContentUpdateDelay(Duration duration) {
            this.f58758f = duration.toMillis();
            return this;
        }

        @p7e({p7e.EnumC10826a.f69935b})
        public C8974a(@efb lu2 constraints) {
            this.f58753a = false;
            this.f58754b = false;
            this.f58755c = wbb.NOT_REQUIRED;
            this.f58756d = false;
            this.f58757e = false;
            this.f58758f = -1L;
            this.f58759g = -1L;
            this.f58760h = new bx2();
            this.f58753a = constraints.requiresCharging();
            this.f58754b = constraints.requiresDeviceIdle();
            this.f58755c = constraints.getRequiredNetworkType();
            this.f58756d = constraints.requiresBatteryNotLow();
            this.f58757e = constraints.requiresStorageNotLow();
            this.f58758f = constraints.getTriggerContentUpdateDelay();
            this.f58759g = constraints.getTriggerMaxContentDelay();
            this.f58760h = constraints.getContentUriTriggers();
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public lu2() {
        this.f58745a = wbb.NOT_REQUIRED;
        this.f58750f = -1L;
        this.f58751g = -1L;
        this.f58752h = new bx2();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || lu2.class != o.getClass()) {
            return false;
        }
        lu2 lu2Var = (lu2) o;
        if (this.f58746b == lu2Var.f58746b && this.f58747c == lu2Var.f58747c && this.f58748d == lu2Var.f58748d && this.f58749e == lu2Var.f58749e && this.f58750f == lu2Var.f58750f && this.f58751g == lu2Var.f58751g && this.f58745a == lu2Var.f58745a) {
            return this.f58752h.equals(lu2Var.f58752h);
        }
        return false;
    }

    @c5e(24)
    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public bx2 getContentUriTriggers() {
        return this.f58752h;
    }

    @efb
    public wbb getRequiredNetworkType() {
        return this.f58745a;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public long getTriggerContentUpdateDelay() {
        return this.f58750f;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public long getTriggerMaxContentDelay() {
        return this.f58751g;
    }

    @c5e(24)
    @p7e({p7e.EnumC10826a.f69935b})
    public boolean hasContentUriTriggers() {
        return this.f58752h.size() > 0;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f58745a.hashCode() * 31) + (this.f58746b ? 1 : 0)) * 31) + (this.f58747c ? 1 : 0)) * 31) + (this.f58748d ? 1 : 0)) * 31) + (this.f58749e ? 1 : 0)) * 31;
        long j = this.f58750f;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f58751g;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f58752h.hashCode();
    }

    public boolean requiresBatteryNotLow() {
        return this.f58748d;
    }

    public boolean requiresCharging() {
        return this.f58746b;
    }

    @c5e(23)
    public boolean requiresDeviceIdle() {
        return this.f58747c;
    }

    public boolean requiresStorageNotLow() {
        return this.f58749e;
    }

    @c5e(24)
    @p7e({p7e.EnumC10826a.f69935b})
    public void setContentUriTriggers(@hib bx2 mContentUriTriggers) {
        this.f58752h = mContentUriTriggers;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setRequiredNetworkType(@efb wbb requiredNetworkType) {
        this.f58745a = requiredNetworkType;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setRequiresBatteryNotLow(boolean requiresBatteryNotLow) {
        this.f58748d = requiresBatteryNotLow;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setRequiresCharging(boolean requiresCharging) {
        this.f58746b = requiresCharging;
    }

    @c5e(23)
    @p7e({p7e.EnumC10826a.f69935b})
    public void setRequiresDeviceIdle(boolean requiresDeviceIdle) {
        this.f58747c = requiresDeviceIdle;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setRequiresStorageNotLow(boolean requiresStorageNotLow) {
        this.f58749e = requiresStorageNotLow;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setTriggerContentUpdateDelay(long triggerContentUpdateDelay) {
        this.f58750f = triggerContentUpdateDelay;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setTriggerMaxContentDelay(long triggerMaxContentDelay) {
        this.f58751g = triggerMaxContentDelay;
    }

    public lu2(C8974a builder) {
        this.f58745a = wbb.NOT_REQUIRED;
        this.f58750f = -1L;
        this.f58751g = -1L;
        this.f58752h = new bx2();
        this.f58746b = builder.f58753a;
        this.f58747c = builder.f58754b;
        this.f58745a = builder.f58755c;
        this.f58748d = builder.f58756d;
        this.f58749e = builder.f58757e;
        this.f58752h = builder.f58760h;
        this.f58750f = builder.f58758f;
        this.f58751g = builder.f58759g;
    }

    public lu2(@efb lu2 other) {
        this.f58745a = wbb.NOT_REQUIRED;
        this.f58750f = -1L;
        this.f58751g = -1L;
        this.f58752h = new bx2();
        this.f58746b = other.f58746b;
        this.f58747c = other.f58747c;
        this.f58745a = other.f58745a;
        this.f58748d = other.f58748d;
        this.f58749e = other.f58749e;
        this.f58752h = other.f58752h;
    }
}
