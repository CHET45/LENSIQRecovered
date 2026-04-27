package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public final class p2g {

    /* JADX INFO: renamed from: a */
    public final ArrayList<C10775b> f69511a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    @hib
    public C10775b f69512b = null;

    /* JADX INFO: renamed from: c */
    @hib
    public ValueAnimator f69513c = null;

    /* JADX INFO: renamed from: d */
    public final Animator.AnimatorListener f69514d = new C10774a();

    /* JADX INFO: renamed from: p2g$a */
    public class C10774a extends AnimatorListenerAdapter {
        public C10774a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p2g p2gVar = p2g.this;
            if (p2gVar.f69513c == animator) {
                p2gVar.f69513c = null;
            }
        }
    }

    /* JADX INFO: renamed from: p2g$b */
    public static class C10775b {

        /* JADX INFO: renamed from: a */
        public final int[] f69516a;

        /* JADX INFO: renamed from: b */
        public final ValueAnimator f69517b;

        public C10775b(int[] iArr, ValueAnimator valueAnimator) {
            this.f69516a = iArr;
            this.f69517b = valueAnimator;
        }
    }

    private void cancel() {
        ValueAnimator valueAnimator = this.f69513c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f69513c = null;
        }
    }

    private void start(@efb C10775b c10775b) {
        ValueAnimator valueAnimator = c10775b.f69517b;
        this.f69513c = valueAnimator;
        valueAnimator.start();
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        C10775b c10775b = new C10775b(iArr, valueAnimator);
        valueAnimator.addListener(this.f69514d);
        this.f69511a.add(c10775b);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f69513c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f69513c = null;
        }
    }

    public void setState(int[] iArr) {
        C10775b c10775b;
        int size = this.f69511a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c10775b = null;
                break;
            }
            c10775b = this.f69511a.get(i);
            if (StateSet.stateSetMatches(c10775b.f69516a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        C10775b c10775b2 = this.f69512b;
        if (c10775b == c10775b2) {
            return;
        }
        if (c10775b2 != null) {
            cancel();
        }
        this.f69512b = c10775b;
        if (c10775b != null) {
            start(c10775b);
        }
    }
}
