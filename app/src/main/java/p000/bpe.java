package p000;

import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public interface bpe {

    /* JADX INFO: renamed from: bpe$a */
    public interface InterfaceC1986a {
        void onWorker(int index, @cfb woe.AbstractC14729c worker);
    }

    void createWorkers(int number, @cfb InterfaceC1986a callback);
}
