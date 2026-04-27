package p000;

import com.google.auto.value.AutoValue;
import p000.uk0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class kj5 {

    /* JADX INFO: renamed from: kj5$a */
    @AutoValue.Builder
    public static abstract class AbstractC8393a {
        @efb
        public abstract kj5 build();

        @efb
        public abstract AbstractC8393a setOriginAssociatedProductId(@hib Integer num);
    }

    @efb
    public static AbstractC8393a builder() {
        return new uk0.C13562b();
    }

    @hib
    public abstract Integer getOriginAssociatedProductId();
}
