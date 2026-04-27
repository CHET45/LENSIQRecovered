package p000;

import android.widget.RatingBar;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@oe8({@ne8(attribute = "android:rating", type = RatingBar.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class ppd {

    /* JADX INFO: renamed from: ppd$a */
    public class C11067a implements RatingBar.OnRatingBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RatingBar.OnRatingBarChangeListener f71615a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f71616b;

        public C11067a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, me8 me8Var) {
            this.f71615a = onRatingBarChangeListener;
            this.f71616b = me8Var;
        }

        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f71615a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f, z);
            }
            this.f71616b.onChange();
        }
    }

    @q21(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void setListeners(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, me8 me8Var) {
        if (me8Var == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new C11067a(onRatingBarChangeListener, me8Var));
        }
    }

    @q21({"android:rating"})
    public static void setRating(RatingBar ratingBar, float f) {
        if (ratingBar.getRating() != f) {
            ratingBar.setRating(f);
        }
    }
}
