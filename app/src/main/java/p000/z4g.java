package p000;

/* JADX INFO: loaded from: classes.dex */
public class z4g extends nza {

    /* JADX INFO: renamed from: a */
    public a5g f104157a;

    /* JADX INFO: renamed from: b */
    public nzf f104158b;

    /* JADX INFO: renamed from: c */
    public y4g f104159c;

    public z4g() {
        a5g a5gVar = new a5g();
        this.f104157a = a5gVar;
        this.f104159c = a5gVar;
    }

    public void config(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        a5g a5gVar = this.f104157a;
        this.f104159c = a5gVar;
        a5gVar.config(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public String debug(String desc, float time) {
        return this.f104159c.debug(desc, time);
    }

    @Override // p000.nza, android.animation.TimeInterpolator
    public float getInterpolation(float v) {
        return this.f104159c.getInterpolation(v);
    }

    public float getVelocity(float x) {
        return this.f104159c.getVelocity(x);
    }

    public boolean isStopped() {
        return this.f104159c.isStopped();
    }

    public void springConfig(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.f104158b == null) {
            this.f104158b = new nzf();
        }
        nzf nzfVar = this.f104158b;
        this.f104159c = nzfVar;
        nzfVar.springConfig(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // p000.nza
    public float getVelocity() {
        return this.f104159c.getVelocity();
    }
}
