package p000;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import p000.dm0;
import p000.p7e;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class chh {

    /* JADX INFO: renamed from: chh$a */
    @AutoValue.Builder
    public static abstract class AbstractC2316a {
        public abstract chh build();

        public abstract AbstractC2316a setBackendName(String str);

        public abstract AbstractC2316a setExtras(@hib byte[] bArr);

        @p7e({p7e.EnumC10826a.f69935b})
        public abstract AbstractC2316a setPriority(acd acdVar);
    }

    public static AbstractC2316a builder() {
        return new dm0.C4856b().setPriority(acd.DEFAULT);
    }

    public abstract String getBackendName();

    @hib
    public abstract byte[] getExtras();

    @p7e({p7e.EnumC10826a.f69935b})
    public abstract acd getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", getBackendName(), getPriority(), getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public chh withPriority(acd acdVar) {
        return builder().setBackendName(getBackendName()).setPriority(acdVar).setExtras(getExtras()).build();
    }
}
