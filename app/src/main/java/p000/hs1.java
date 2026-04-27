package p000;

import androidx.cardview.widget.CardView;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @w21(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @w21(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @w21(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class hs1 {
    @q21({"contentPadding"})
    public static void setContentPadding(CardView cardView, int i) {
        cardView.setContentPadding(i, i, i, i);
    }

    @q21({"contentPaddingBottom"})
    public static void setContentPaddingBottom(CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i);
    }

    @q21({"contentPaddingLeft"})
    public static void setContentPaddingLeft(CardView cardView, int i) {
        cardView.setContentPadding(i, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @q21({"contentPaddingRight"})
    public static void setContentPaddingRight(CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i, cardView.getContentPaddingBottom());
    }

    @q21({"contentPaddingTop"})
    public static void setContentPaddingTop(CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), i, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
