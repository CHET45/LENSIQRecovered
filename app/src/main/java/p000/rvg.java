package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.AbstractC1458q;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class rvg extends AbstractC1458q {

    /* JADX INFO: renamed from: C2 */
    public static final String f79900C2 = "android:textscale:scale";

    /* JADX INFO: renamed from: rvg$a */
    public class C12321a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f79901a;

        public C12321a(TextView textView) {
            this.f79901a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@efb ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f79901a.setScaleX(fFloatValue);
            this.f79901a.setScaleY(fFloatValue);
        }
    }

    private void captureValues(@efb sfh sfhVar) {
        View view = sfhVar.f81693b;
        if (view instanceof TextView) {
            sfhVar.f81692a.put(f79900C2, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.AbstractC1458q
    public void captureEndValues(@efb sfh sfhVar) {
        captureValues(sfhVar);
    }

    @Override // androidx.transition.AbstractC1458q
    public void captureStartValues(@efb sfh sfhVar) {
        captureValues(sfhVar);
    }

    @Override // androidx.transition.AbstractC1458q
    public Animator createAnimator(@efb ViewGroup viewGroup, @hib sfh sfhVar, @hib sfh sfhVar2) {
        if (sfhVar == null || sfhVar2 == null || !(sfhVar.f81693b instanceof TextView)) {
            return null;
        }
        View view = sfhVar2.f81693b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = sfhVar.f81692a;
        Map<String, Object> map2 = sfhVar2.f81692a;
        float fFloatValue = map.get(f79900C2) != null ? ((Float) map.get(f79900C2)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(f79900C2) != null ? ((Float) map2.get(f79900C2)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C12321a(textView));
        return valueAnimatorOfFloat;
    }
}
