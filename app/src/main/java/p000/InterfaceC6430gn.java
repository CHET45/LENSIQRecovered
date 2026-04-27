package p000;

/* JADX INFO: renamed from: gn */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface InterfaceC6430gn {

    /* JADX INFO: renamed from: gn$a */
    public interface a {
        C4874dn getAllocation();

        @hib
        a next();
    }

    C4874dn allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(C4874dn c4874dn);

    void release(a aVar);

    void trim();
}
