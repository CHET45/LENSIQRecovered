package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class fbi {

    /* JADX INFO: renamed from: c */
    public Interpolator f36063c;

    /* JADX INFO: renamed from: d */
    public gbi f36064d;

    /* JADX INFO: renamed from: e */
    public boolean f36065e;

    /* JADX INFO: renamed from: b */
    public long f36062b = -1;

    /* JADX INFO: renamed from: f */
    public final hbi f36066f = new C5716a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<ebi> f36061a = new ArrayList<>();

    /* JADX INFO: renamed from: fbi$a */
    public class C5716a extends hbi {

        /* JADX INFO: renamed from: a */
        public boolean f36067a = false;

        /* JADX INFO: renamed from: b */
        public int f36068b = 0;

        public C5716a() {
        }

        /* JADX INFO: renamed from: a */
        public void m10807a() {
            this.f36068b = 0;
            this.f36067a = false;
            fbi.this.m10806a();
        }

        @Override // p000.hbi, p000.gbi
        public void onAnimationEnd(View view) {
            int i = this.f36068b + 1;
            this.f36068b = i;
            if (i == fbi.this.f36061a.size()) {
                gbi gbiVar = fbi.this.f36064d;
                if (gbiVar != null) {
                    gbiVar.onAnimationEnd(null);
                }
                m10807a();
            }
        }

        @Override // p000.hbi, p000.gbi
        public void onAnimationStart(View view) {
            if (this.f36067a) {
                return;
            }
            this.f36067a = true;
            gbi gbiVar = fbi.this.f36064d;
            if (gbiVar != null) {
                gbiVar.onAnimationStart(null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10806a() {
        this.f36065e = false;
    }

    public void cancel() {
        if (this.f36065e) {
            Iterator<ebi> it = this.f36061a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f36065e = false;
        }
    }

    public fbi play(ebi ebiVar) {
        if (!this.f36065e) {
            this.f36061a.add(ebiVar);
        }
        return this;
    }

    public fbi playSequentially(ebi ebiVar, ebi ebiVar2) {
        this.f36061a.add(ebiVar);
        ebiVar2.setStartDelay(ebiVar.getDuration());
        this.f36061a.add(ebiVar2);
        return this;
    }

    public fbi setDuration(long j) {
        if (!this.f36065e) {
            this.f36062b = j;
        }
        return this;
    }

    public fbi setInterpolator(Interpolator interpolator) {
        if (!this.f36065e) {
            this.f36063c = interpolator;
        }
        return this;
    }

    public fbi setListener(gbi gbiVar) {
        if (!this.f36065e) {
            this.f36064d = gbiVar;
        }
        return this;
    }

    public void start() {
        if (this.f36065e) {
            return;
        }
        for (ebi ebiVar : this.f36061a) {
            long j = this.f36062b;
            if (j >= 0) {
                ebiVar.setDuration(j);
            }
            Interpolator interpolator = this.f36063c;
            if (interpolator != null) {
                ebiVar.setInterpolator(interpolator);
            }
            if (this.f36064d != null) {
                ebiVar.setListener(this.f36066f);
            }
            ebiVar.start();
        }
        this.f36065e = true;
    }
}
