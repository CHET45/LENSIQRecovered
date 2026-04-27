package p000;

import com.google.auto.value.AutoValue;
import p000.vk0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class mj5 {

    /* JADX INFO: renamed from: mj5$a */
    @AutoValue.Builder
    public static abstract class AbstractC9366a {
        @efb
        public abstract mj5 build();

        @efb
        public abstract AbstractC9366a setPrequest(@hib kj5 kj5Var);
    }

    @efb
    public static AbstractC9366a builder() {
        return new vk0.C14133b();
    }

    @hib
    public abstract kj5 getPrequest();
}
