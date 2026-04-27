package p000;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15652e
public final class nwf {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<Uri> f65922a;

    /* JADX INFO: renamed from: b */
    @gib
    public final InputEvent f65923b;

    /* JADX INFO: renamed from: nwf$a */
    @dwf({"SMAP\nSourceRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceRegistrationRequest.kt\nandroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
    public static final class C10096a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final List<Uri> f65924a;

        /* JADX INFO: renamed from: b */
        @gib
        public InputEvent f65925b;

        /* JADX WARN: Multi-variable type inference failed */
        public C10096a(@yfb List<? extends Uri> list) {
            md8.checkNotNullParameter(list, "registrationUris");
            this.f65924a = list;
        }

        @yfb
        public final nwf build() {
            return new nwf(this.f65924a, this.f65925b);
        }

        @yfb
        public final C10096a setInputEvent(@yfb InputEvent inputEvent) {
            md8.checkNotNullParameter(inputEvent, "inputEvent");
            this.f65925b = inputEvent;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nwf(@yfb List<? extends Uri> list, @gib InputEvent inputEvent) {
        md8.checkNotNullParameter(list, "registrationUris");
        this.f65922a = list;
        this.f65923b = inputEvent;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwf)) {
            return false;
        }
        nwf nwfVar = (nwf) obj;
        return md8.areEqual(this.f65922a, nwfVar.f65922a) && md8.areEqual(this.f65923b, nwfVar.f65923b);
    }

    @gib
    public final InputEvent getInputEvent() {
        return this.f65923b;
    }

    @yfb
    public final List<Uri> getRegistrationUris() {
        return this.f65922a;
    }

    public int hashCode() {
        int iHashCode = this.f65922a.hashCode();
        InputEvent inputEvent = this.f65923b;
        return inputEvent != null ? (iHashCode * 31) + inputEvent.hashCode() : iHashCode;
    }

    @yfb
    public String toString() {
        return "AppSourcesRegistrationRequest { " + ("RegistrationUris=[" + this.f65922a + "], InputEvent=" + this.f65923b) + " }";
    }

    public /* synthetic */ nwf(List list, InputEvent inputEvent, int i, jt3 jt3Var) {
        this(list, (i & 2) != 0 ? null : inputEvent);
    }
}
