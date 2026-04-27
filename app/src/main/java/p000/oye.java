package p000;

import com.google.auto.value.AutoValue;
import p000.ul0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class oye {

    /* JADX INFO: renamed from: oye$a */
    @AutoValue.Builder
    public static abstract class AbstractC10720a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC10720a mo19101a(q15 q15Var);

        /* JADX INFO: renamed from: b */
        public abstract AbstractC10720a mo19102b(p55<?> p55Var);

        public abstract oye build();

        /* JADX INFO: renamed from: c */
        public abstract AbstractC10720a mo19103c(leh<?, byte[]> lehVar);

        public <T> AbstractC10720a setEvent(p55<T> p55Var, q15 q15Var, leh<T, byte[]> lehVar) {
            mo19102b(p55Var);
            mo19101a(q15Var);
            mo19103c(lehVar);
            return this;
        }

        public abstract AbstractC10720a setTransportContext(chh chhVar);

        public abstract AbstractC10720a setTransportName(String str);
    }

    public static AbstractC10720a builder() {
        return new ul0.C13570b();
    }

    /* JADX INFO: renamed from: a */
    public abstract p55<?> mo19099a();

    /* JADX INFO: renamed from: b */
    public abstract leh<?, byte[]> mo19100b();

    public abstract q15 getEncoding();

    public byte[] getPayload() {
        return mo19100b().apply(mo19099a().getPayload());
    }

    public abstract chh getTransportContext();

    public abstract String getTransportName();
}
