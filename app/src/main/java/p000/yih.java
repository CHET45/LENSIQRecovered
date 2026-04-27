package p000;

import java.util.ArrayList;
import java.util.List;
import p000.g9f;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class yih implements gv2, nr0.InterfaceC10013b {

    /* JADX INFO: renamed from: a */
    public final String f101755a;

    /* JADX INFO: renamed from: b */
    public final boolean f101756b;

    /* JADX INFO: renamed from: c */
    public final List<nr0.InterfaceC10013b> f101757c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final g9f.EnumC6176a f101758d;

    /* JADX INFO: renamed from: e */
    public final nr0<?, Float> f101759e;

    /* JADX INFO: renamed from: f */
    public final nr0<?, Float> f101760f;

    /* JADX INFO: renamed from: g */
    public final nr0<?, Float> f101761g;

    public yih(pr0 pr0Var, g9f g9fVar) {
        this.f101755a = g9fVar.getName();
        this.f101756b = g9fVar.isHidden();
        this.f101758d = g9fVar.getType();
        nr0<Float, Float> nr0VarCreateAnimation = g9fVar.getStart().createAnimation();
        this.f101759e = nr0VarCreateAnimation;
        nr0<Float, Float> nr0VarCreateAnimation2 = g9fVar.getEnd().createAnimation();
        this.f101760f = nr0VarCreateAnimation2;
        nr0<Float, Float> nr0VarCreateAnimation3 = g9fVar.getOffset().createAnimation();
        this.f101761g = nr0VarCreateAnimation3;
        pr0Var.addAnimation(nr0VarCreateAnimation);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
        nr0VarCreateAnimation.addUpdateListener(this);
        nr0VarCreateAnimation2.addUpdateListener(this);
        nr0VarCreateAnimation3.addUpdateListener(this);
    }

    /* JADX INFO: renamed from: a */
    public void m26124a(nr0.InterfaceC10013b interfaceC10013b) {
        this.f101757c.add(interfaceC10013b);
    }

    /* JADX INFO: renamed from: b */
    public g9f.EnumC6176a m26125b() {
        return this.f101758d;
    }

    public nr0<?, Float> getEnd() {
        return this.f101760f;
    }

    @Override // p000.gv2
    public String getName() {
        return this.f101755a;
    }

    public nr0<?, Float> getOffset() {
        return this.f101761g;
    }

    public nr0<?, Float> getStart() {
        return this.f101759e;
    }

    public boolean isHidden() {
        return this.f101756b;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        for (int i = 0; i < this.f101757c.size(); i++) {
            this.f101757c.get(i).onValueChanged();
        }
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
    }
}
