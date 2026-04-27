package p000;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p000.mj0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class wi2 {

    /* JADX INFO: renamed from: wi2$a */
    @AutoValue.Builder
    public static abstract class AbstractC14613a {
        @efb
        public abstract wi2 build();

        @efb
        public abstract AbstractC14613a setPrivacyContext(@hib mj5 mj5Var);

        @efb
        public abstract AbstractC14613a setProductIdOrigin(@hib EnumC14614b enumC14614b);
    }

    /* JADX INFO: renamed from: wi2$b */
    public enum EnumC14614b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: d */
        public static final SparseArray<EnumC14614b> f94300d;

        /* JADX INFO: renamed from: a */
        public final int f94302a;

        static {
            EnumC14614b enumC14614b = NOT_SET;
            EnumC14614b enumC14614b2 = EVENT_OVERRIDE;
            SparseArray<EnumC14614b> sparseArray = new SparseArray<>();
            f94300d = sparseArray;
            sparseArray.put(0, enumC14614b);
            sparseArray.put(5, enumC14614b2);
        }

        EnumC14614b(int i) {
            this.f94302a = i;
        }

        @hib
        public static EnumC14614b forNumber(int i) {
            return f94300d.get(i);
        }

        public int getValue() {
            return this.f94302a;
        }
    }

    @efb
    public static AbstractC14613a builder() {
        return new mj0.C9365b();
    }

    @hib
    public abstract mj5 getPrivacyContext();

    @hib
    public abstract EnumC14614b getProductIdOrigin();
}
