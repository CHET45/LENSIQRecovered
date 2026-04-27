package p000;

import androidx.media3.common.C1213a;
import java.util.Arrays;
import java.util.List;
import p000.hga;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class eta {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5464a[] f34009a;

    /* JADX INFO: renamed from: b */
    public final long f34010b;

    /* JADX INFO: renamed from: eta$a */
    public interface InterfaceC5464a {
        @hib
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        @hib
        default C1213a getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(hga.C6845b c6845b) {
        }
    }

    public eta(InterfaceC5464a... interfaceC5464aArr) {
        this(-9223372036854775807L, interfaceC5464aArr);
    }

    public eta copyWithAppendedEntries(InterfaceC5464a... interfaceC5464aArr) {
        return interfaceC5464aArr.length == 0 ? this : new eta(this.f34010b, (InterfaceC5464a[]) t0i.nullSafeArrayConcatenation(this.f34009a, interfaceC5464aArr));
    }

    public eta copyWithAppendedEntriesFrom(@hib eta etaVar) {
        return etaVar == null ? this : copyWithAppendedEntries(etaVar.f34009a);
    }

    public eta copyWithPresentationTimeUs(long j) {
        return this.f34010b == j ? this : new eta(j, this.f34009a);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eta.class != obj.getClass()) {
            return false;
        }
        eta etaVar = (eta) obj;
        return Arrays.equals(this.f34009a, etaVar.f34009a) && this.f34010b == etaVar.f34010b;
    }

    public InterfaceC5464a get(int i) {
        return this.f34009a[i];
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f34009a) * 31) + im9.hashCode(this.f34010b);
    }

    public int length() {
        return this.f34009a.length;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.f34009a));
        if (this.f34010b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f34010b;
        }
        sb.append(str);
        return sb.toString();
    }

    public eta(long j, InterfaceC5464a... interfaceC5464aArr) {
        this.f34010b = j;
        this.f34009a = interfaceC5464aArr;
    }

    public eta(List<? extends InterfaceC5464a> list) {
        this((InterfaceC5464a[]) list.toArray(new InterfaceC5464a[0]));
    }

    public eta(long j, List<? extends InterfaceC5464a> list) {
        this(j, (InterfaceC5464a[]) list.toArray(new InterfaceC5464a[0]));
    }
}
