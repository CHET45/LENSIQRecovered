package p000;

import java.io.File;
import p000.le4;

/* JADX INFO: loaded from: classes3.dex */
public class nf3<DataType> implements le4.InterfaceC8784b {

    /* JADX INFO: renamed from: a */
    public final n15<DataType> f64231a;

    /* JADX INFO: renamed from: b */
    public final DataType f64232b;

    /* JADX INFO: renamed from: c */
    public final i7c f64233c;

    public nf3(n15<DataType> n15Var, DataType datatype, i7c i7cVar) {
        this.f64231a = n15Var;
        this.f64232b = datatype;
        this.f64233c = i7cVar;
    }

    @Override // p000.le4.InterfaceC8784b
    public boolean write(@efb File file) {
        return this.f64231a.encode(this.f64232b, file, this.f64233c);
    }
}
