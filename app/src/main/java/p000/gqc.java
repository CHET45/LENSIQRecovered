package p000;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class gqc {
    public static gqc create(long j, chh chhVar, a65 a65Var) {
        return new ll0(j, chhVar, a65Var);
    }

    public abstract a65 getEvent();

    public abstract long getId();

    public abstract chh getTransportContext();
}
