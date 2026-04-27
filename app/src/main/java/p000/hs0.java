package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.InterfaceC3314b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hs0 implements InterfaceC3314b {

    /* JADX INFO: renamed from: a */
    public final Context f44674a;

    /* JADX INFO: renamed from: b */
    @efb
    public final ExtendedFloatingActionButton f44675b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f44676c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final C7084hz f44677d;

    /* JADX INFO: renamed from: e */
    @hib
    public a0b f44678e;

    /* JADX INFO: renamed from: f */
    @hib
    public a0b f44679f;

    /* JADX INFO: renamed from: hs0$a */
    public class C6987a extends Property<ExtendedFloatingActionButton, Float> {
        public C6987a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C13280ty.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f21729x2.getColorForState(extendedFloatingActionButton.getDrawableState(), hs0.this.f44675b.f21729x2.getDefaultColor()))));
        }

        @Override // android.util.Property
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f21729x2.getColorForState(extendedFloatingActionButton.getDrawableState(), hs0.this.f44675b.f21729x2.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (C13280ty.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.m6203n(extendedFloatingActionButton.f21729x2);
            } else {
                extendedFloatingActionButton.m6203n(colorStateListValueOf);
            }
        }
    }

    public hs0(@efb ExtendedFloatingActionButton extendedFloatingActionButton, C7084hz c7084hz) {
        this.f44675b = extendedFloatingActionButton;
        this.f44674a = extendedFloatingActionButton.getContext();
        this.f44677d = c7084hz;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    public final void addAnimationListener(@efb Animator.AnimatorListener animatorListener) {
        this.f44676c.add(animatorListener);
    }

    @efb
    /* JADX INFO: renamed from: b */
    public AnimatorSet m12582b(@efb a0b a0bVar) {
        ArrayList arrayList = new ArrayList();
        if (a0bVar.hasPropertyValues("opacity")) {
            arrayList.add(a0bVar.getAnimator("opacity", this.f44675b, View.ALPHA));
        }
        if (a0bVar.hasPropertyValues("scale")) {
            arrayList.add(a0bVar.getAnimator("scale", this.f44675b, View.SCALE_Y));
            arrayList.add(a0bVar.getAnimator("scale", this.f44675b, View.SCALE_X));
        }
        if (a0bVar.hasPropertyValues(StreamInformation.KEY_WIDTH)) {
            arrayList.add(a0bVar.getAnimator(StreamInformation.KEY_WIDTH, this.f44675b, ExtendedFloatingActionButton.f21711M2));
        }
        if (a0bVar.hasPropertyValues(StreamInformation.KEY_HEIGHT)) {
            arrayList.add(a0bVar.getAnimator(StreamInformation.KEY_HEIGHT, this.f44675b, ExtendedFloatingActionButton.f21712N2));
        }
        if (a0bVar.hasPropertyValues("paddingStart")) {
            arrayList.add(a0bVar.getAnimator("paddingStart", this.f44675b, ExtendedFloatingActionButton.f21713O2));
        }
        if (a0bVar.hasPropertyValues("paddingEnd")) {
            arrayList.add(a0bVar.getAnimator("paddingEnd", this.f44675b, ExtendedFloatingActionButton.f21714P2));
        }
        if (a0bVar.hasPropertyValues("labelOpacity")) {
            arrayList.add(a0bVar.getAnimator("labelOpacity", this.f44675b, new C6987a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C6661gz.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    public AnimatorSet createAnimator() {
        return m12582b(getCurrentMotionSpec());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    public final a0b getCurrentMotionSpec() {
        a0b a0bVar = this.f44679f;
        if (a0bVar != null) {
            return a0bVar;
        }
        if (this.f44678e == null) {
            this.f44678e = a0b.createFromResource(this.f44674a, getDefaultMotionSpecResource());
        }
        return (a0b) z7d.checkNotNull(this.f44678e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    @efb
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f44676c;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    @hib
    public a0b getMotionSpec() {
        return this.f44679f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    @un1
    public void onAnimationCancel() {
        this.f44677d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    @un1
    public void onAnimationEnd() {
        this.f44677d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    @un1
    public void onAnimationStart(Animator animator) {
        this.f44677d.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    public final void removeAnimationListener(@efb Animator.AnimatorListener animatorListener) {
        this.f44676c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3314b
    public final void setMotionSpec(@hib a0b a0bVar) {
        this.f44679f = a0bVar;
    }
}
