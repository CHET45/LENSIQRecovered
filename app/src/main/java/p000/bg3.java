package p000;

import com.bumptech.glide.Priority;

/* JADX INFO: loaded from: classes3.dex */
public interface bg3<T> {

    /* JADX INFO: renamed from: bg3$a */
    public interface InterfaceC1883a<T> {
        void onDataReady(@hib T t);

        void onLoadFailed(@efb Exception exc);
    }

    void cancel();

    void cleanup();

    @efb
    Class<T> getDataClass();

    @efb
    hh3 getDataSource();

    void loadData(@efb Priority priority, @efb InterfaceC1883a<? super T> interfaceC1883a);
}
