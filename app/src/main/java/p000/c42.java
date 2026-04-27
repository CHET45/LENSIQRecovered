package p000;

import com.google.auto.value.AutoValue;
import p000.lj0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class c42 {

    /* JADX INFO: renamed from: c42$a */
    @AutoValue.Builder
    public static abstract class AbstractC2199a {
        @efb
        public abstract c42 build();

        @efb
        public abstract AbstractC2199a setAndroidClientInfo(@hib AbstractC6463gq abstractC6463gq);

        @efb
        public abstract AbstractC2199a setClientType(@hib EnumC2200b enumC2200b);
    }

    /* JADX INFO: renamed from: c42$b */
    public enum EnumC2200b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a */
        public final int f15756a;

        EnumC2200b(int i) {
            this.f15756a = i;
        }
    }

    @efb
    public static AbstractC2199a builder() {
        return new lj0.C8833b();
    }

    @hib
    public abstract AbstractC6463gq getAndroidClientInfo();

    @hib
    public abstract EnumC2200b getClientType();
}
