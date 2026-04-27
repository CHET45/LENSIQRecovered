package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Arrays;
import p000.wn0;

/* JADX INFO: loaded from: classes4.dex */
public final class ij0 extends wn0 {

    /* JADX INFO: renamed from: a */
    public final Iterable<a65> f47150a;

    /* JADX INFO: renamed from: b */
    public final byte[] f47151b;

    /* JADX INFO: renamed from: ij0$b */
    public static final class C7313b extends wn0.AbstractC14695a {

        /* JADX INFO: renamed from: a */
        public Iterable<a65> f47152a;

        /* JADX INFO: renamed from: b */
        public byte[] f47153b;

        @Override // p000.wn0.AbstractC14695a
        public wn0 build() {
            String str = "";
            if (this.f47152a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new ij0(this.f47152a, this.f47153b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.wn0.AbstractC14695a
        public wn0.AbstractC14695a setEvents(Iterable<a65> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f47152a = iterable;
            return this;
        }

        @Override // p000.wn0.AbstractC14695a
        public wn0.AbstractC14695a setExtras(@hib byte[] bArr) {
            this.f47153b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wn0)) {
            return false;
        }
        wn0 wn0Var = (wn0) obj;
        if (this.f47150a.equals(wn0Var.getEvents())) {
            if (Arrays.equals(this.f47151b, wn0Var instanceof ij0 ? ((ij0) wn0Var).f47151b : wn0Var.getExtras())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.wn0
    public Iterable<a65> getEvents() {
        return this.f47150a;
    }

    @Override // p000.wn0
    @hib
    public byte[] getExtras() {
        return this.f47151b;
    }

    public int hashCode() {
        return ((this.f47150a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Arrays.hashCode(this.f47151b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f47150a + ", extras=" + Arrays.toString(this.f47151b) + "}";
    }

    private ij0(Iterable<a65> iterable, @hib byte[] bArr) {
        this.f47150a = iterable;
        this.f47151b = bArr;
    }
}
