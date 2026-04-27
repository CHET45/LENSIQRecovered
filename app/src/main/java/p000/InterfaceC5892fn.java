package p000;

/* JADX INFO: renamed from: fn */
/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface InterfaceC5892fn {

    /* JADX INFO: renamed from: fn$a */
    public interface a {
        C5399en getAllocation();

        @hib
        a next();
    }

    C5399en allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(C5399en c5399en);

    void release(a aVar);

    void trim();
}
