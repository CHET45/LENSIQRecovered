package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @w21(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @w21(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class b9i {

    /* JADX INFO: renamed from: b9i$a */
    public class ViewGroupOnHierarchyChangeListenerC1794a implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1799f f13087a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC1800g f13088b;

        public ViewGroupOnHierarchyChangeListenerC1794a(InterfaceC1799f interfaceC1799f, InterfaceC1800g interfaceC1800g) {
            this.f13087a = interfaceC1799f;
            this.f13088b = interfaceC1800g;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            InterfaceC1799f interfaceC1799f = this.f13087a;
            if (interfaceC1799f != null) {
                interfaceC1799f.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            InterfaceC1800g interfaceC1800g = this.f13088b;
            if (interfaceC1800g != null) {
                interfaceC1800g.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: renamed from: b9i$b */
    public class AnimationAnimationListenerC1795b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1798e f13089a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC1796c f13090b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC1797d f13091c;

        public AnimationAnimationListenerC1795b(InterfaceC1798e interfaceC1798e, InterfaceC1796c interfaceC1796c, InterfaceC1797d interfaceC1797d) {
            this.f13089a = interfaceC1798e;
            this.f13090b = interfaceC1796c;
            this.f13091c = interfaceC1797d;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC1796c interfaceC1796c = this.f13090b;
            if (interfaceC1796c != null) {
                interfaceC1796c.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            InterfaceC1797d interfaceC1797d = this.f13091c;
            if (interfaceC1797d != null) {
                interfaceC1797d.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            InterfaceC1798e interfaceC1798e = this.f13089a;
            if (interfaceC1798e != null) {
                interfaceC1798e.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: renamed from: b9i$c */
    public interface InterfaceC1796c {
        void onAnimationEnd(Animation animation);
    }

    /* JADX INFO: renamed from: b9i$d */
    public interface InterfaceC1797d {
        void onAnimationRepeat(Animation animation);
    }

    /* JADX INFO: renamed from: b9i$e */
    public interface InterfaceC1798e {
        void onAnimationStart(Animation animation);
    }

    /* JADX INFO: renamed from: b9i$f */
    public interface InterfaceC1799f {
        void onChildViewAdded(View view, View view2);
    }

    /* JADX INFO: renamed from: b9i$g */
    public interface InterfaceC1800g {
        void onChildViewRemoved(View view, View view2);
    }

    @q21({"android:animateLayoutChanges"})
    @omg(11)
    public static void setAnimateLayoutChanges(ViewGroup viewGroup, boolean z) {
        if (z) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @q21(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void setListener(ViewGroup viewGroup, InterfaceC1799f interfaceC1799f, InterfaceC1800g interfaceC1800g) {
        if (interfaceC1799f == null && interfaceC1800g == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1794a(interfaceC1799f, interfaceC1800g));
        }
    }

    @q21(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void setListener(ViewGroup viewGroup, InterfaceC1798e interfaceC1798e, InterfaceC1796c interfaceC1796c, InterfaceC1797d interfaceC1797d) {
        if (interfaceC1798e == null && interfaceC1796c == null && interfaceC1797d == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new AnimationAnimationListenerC1795b(interfaceC1798e, interfaceC1796c, interfaceC1797d));
        }
    }
}
