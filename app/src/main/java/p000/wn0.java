package p000;

import com.google.auto.value.AutoValue;
import p000.ij0;

/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class wn0 {

    /* JADX INFO: renamed from: wn0$a */
    @AutoValue.Builder
    public static abstract class AbstractC14695a {
        public abstract wn0 build();

        public abstract AbstractC14695a setEvents(Iterable<a65> iterable);

        public abstract AbstractC14695a setExtras(@hib byte[] bArr);
    }

    public static AbstractC14695a builder() {
        return new ij0.C7313b();
    }

    public static wn0 create(Iterable<a65> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<a65> getEvents();

    @hib
    public abstract byte[] getExtras();
}
